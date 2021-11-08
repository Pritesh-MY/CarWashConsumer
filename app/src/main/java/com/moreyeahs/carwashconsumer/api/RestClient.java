package com.moreyeahs.carwashconsumer.api;

import android.app.Activity;
import android.util.Log;

import com.moreyeahs.carwashconsumer.BuildConfig;
import com.moreyeahs.carwashconsumer.utils.Aes256;
import com.moreyeahs.carwashconsumer.utils.Utils;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 03-11-2018.
 */
public class RestClient {
    private static Retrofit retrofit = null;
    private static final RestClient ourInstance = new RestClient();
    private static Activity mActivity;

    public static RestClient getInstance(Activity activity) {
        mActivity = activity;
        return ourInstance;
    }

    private RestClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(2, TimeUnit.MINUTES)
                .connectTimeout(2, TimeUnit.MINUTES)
                .writeTimeout(2, TimeUnit.MINUTES)
                .addInterceptor(chain -> {
                    Response response = null;
                    try {
                        Request request = chain.request();
                        response = chain.proceed(request);
                        if (response.code() == 200) {
                            if (!request.url().toString().contains("/token") && !request.url().toString().contains("/appVersion")) {
                                try {
                                    JSONObject jsonObject = new JSONObject();
                                    jsonObject.put("message", new JSONObject(response.body().string()));
                                    String data = jsonObject.getJSONObject("message").getString("Data");
                                    String destr = Aes256.decrypt(data, new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date()) + "1201");

                                    if (BuildConfig.DEBUG) {
                                        printMsg(destr);
                                    }

                                    MediaType contentType = response.body().contentType();
                                    ResponseBody responseBody = ResponseBody.create(contentType, destr);
                                    return response.newBuilder().body(responseBody).build();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    } catch (SocketTimeoutException e) {
                        e.printStackTrace();
                        //  onConnectionTimeoutListener.onConnectionTimeout(e);
                    }

                    return response;
                })
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder()
                            .header("authorization", "Bearer " + Utils.getToken(mActivity))
                            .build();
                    return chain.proceed(request);
                })
                .addInterceptor(interceptor)
                .build();

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BuildConfig.apiEndpoint)
                    .addConverterFactory(GsonConverterFactory.create(new Gson()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build();
        }
    }

    public ApiStructure getService() {
        return retrofit.create(ApiStructure.class);
    }

    private void printMsg(String msg) {
        int chunkCount = msg.length() / 4050;     // integer division
        for (int i = 0; i <= chunkCount; i++) {
            int max = 4050 * (i + 1);
            if (max >= msg.length()) {
                Log.d("Response ::", msg.substring(4050 * i));
                // Log.d("", msg.substring(4050 * i));
            } else {
                Log.d("Response ::", msg.substring(4050 * i, max));
                //  Log.d("", msg.substring(4050 * i, max));
            }
        }
    }
}