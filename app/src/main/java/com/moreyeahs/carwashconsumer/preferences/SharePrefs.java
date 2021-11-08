package com.moreyeahs.carwashconsumer.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharePrefs {
    public static String KEY_ACCESS_TOKEN = "token";
    public static String MOBILE_NUMBER = "mobile";
    public static String IS_SIGN_UP = "is_sign_up";
    public static String CUST_ACTIVE = "cust_active";
    public static String CUSTOMER_ID = "Customer_Id";
    public static String CUSTOMER_NAME = "Customer_name";
    public static String SHOP_NAME = "shop_name";
    public static String COMPANY_ID = "company_id";
    public static String CUSTOMER_TYPE = "customer_type";
    public static String SHIPPING_ADDRESS = "shipping_address";
    public static String WAREHOUSE_ID = "warehouse_id";
    public static String CITY_ID = "city_id";
    public static String CITY_NAME = "CITY_NAME";
    public static String CUSTOMER_EMAIL = "email_id";
    public static String PASSWORD = "PASSWORD";
    public static String USER_PROFILE_IMAGE = "user_profile_image";
    public static String USER_BUSINESS_IMAGE = "USER_BUSINESS_IMAGE";
    public static String TOKEN_NAME = "token_user_name";
    public static String TOKEN_PASSWORD = "token_password";
    public static String CUST_AREA="customerArea";
    public static String CUST_STATE="customerState";
    public static String CUST_HOUSE_NUMBER="houseNum";
    public static String LOGGED = "LOGGED";
    public static String PARTIAL_LOGIN = "PARTIAL_LOGIN";
    public static String CUST_COUNTRY="customerCountry";
    public static String CUST_CITYID = "CUST_CITYID";
    public static String CUST_ZIPCODE = "ZIPCODE";
    public static String CUST_CITYNAME = "CITYNAME";

    public static String ADDRESS_ID = "ADDRESS_ID";
    public static String DELIVERY_ZIPCODE = "DELIVERY_ZIPCODE";
    public static String DELIVERY_ADDRESS = "DELIVERY_ADDRESS";
    public static String DELIVERY_PERSON = "DELIVERY_PERSON";
    public static String DELIVERY_MOBILE = "DELIVERY_MOBILE";
    public static String SKIPPED_SIGNIN = "SKIPPED_SIGNIN";

    static SharePrefs instance;
    Context ctx;
    SharedPreferences sharedPreferences;

    private SharePrefs(Context context) {
        ctx = context;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static SharePrefs getInstance(Context ctx) {
        if (instance == null) {
            instance = new SharePrefs(ctx);
        }
        return instance;
    }

    public void putString(String key, String val) {
        sharedPreferences.edit().putString(key, val).apply();
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, "");
    }

    public void putInt(String key, Integer val) {
        sharedPreferences.edit().putInt(key, val).apply();
    }

    public void putBoolean(String key, Boolean val) {
        sharedPreferences.edit().putBoolean(key, val).apply();
    }

    public Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public void clearSharePrefs() {
        sharedPreferences.edit().clear().commit();
    }

}
