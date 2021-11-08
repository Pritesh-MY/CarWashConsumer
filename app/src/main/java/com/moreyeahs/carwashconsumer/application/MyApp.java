package com.moreyeahs.carwashconsumer.application;

import android.os.Build;
import android.os.StrictMode;

import androidx.multidex.MultiDexApplication;

import java.lang.reflect.Method;

/**
 * Application class for the app manage dao,context etc.
 */

public class MyApp extends MultiDexApplication {
    static MyApp instance;
    private static boolean activityVisible;

    public static MyApp getInstance() {
        if (instance == null)
            instance = new MyApp();

        return instance;
    }

    public static boolean isActivityVisible() {
        return activityVisible;
    }

    public static void activityResumed() {
        activityVisible = true;
    }

    public static void activityPaused() {
        activityVisible = false;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = MyApp.this;

        try {
            enableStricMode();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void enableStricMode() {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                try {
                    Method m = StrictMode.class.getMethod("disableDeathOnFileUriExposure");
                    m.invoke(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
