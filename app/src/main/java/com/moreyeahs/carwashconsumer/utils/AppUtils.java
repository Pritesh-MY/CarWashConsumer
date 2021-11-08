package com.moreyeahs.carwashconsumer.utils;

import android.Manifest;

//import android.support.constraint.BuildConfig;
public interface AppUtils {

    String[] STORAGE_PERMISSIONS = new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE};
    String[] STORAGE_CAMERA_PERMISSIONS = new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA};
    String[] LOCATION_PERMISSIONS = new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION};

    String os = "android";
    String versionName = "BuildConfig.VERSION_NAME";
    String REQUEST = "request";
    String RESPONSE = "response";
    int EmptyFirstName =  800 ;
    int EmptyLastName = 801;
    int EmptyAddress = 802;
    int EmptyEmail = 803;
    int NoData=804;

    /**
     * login keys
     */

    public class LocationConstants {
        public static final int SUCCESS_RESULT = 0;

        public static final int FAILURE_RESULT = 1;

        public static final String PACKAGE_NAME = "com.sample.sishin.maplocation";

        public static final String RECEIVER = PACKAGE_NAME + ".RECEIVER";

        public static final String RESULT_DATA_KEY = PACKAGE_NAME + ".RESULT_DATA_KEY";

        public static final String LOCATION_DATA_EXTRA = PACKAGE_NAME + ".LOCATION_DATA_EXTRA";

        public static final String LOCATION_DATA_AREA = PACKAGE_NAME + ".LOCATION_DATA_AREA";
        public static final String LOCATION_DATA_CITY = PACKAGE_NAME + ".LOCATION_DATA_CITY";
        public static final String LOCATION_DATA_STREET = PACKAGE_NAME + ".LOCATION_DATA_STREET";


    }


    int empty_id = 101;
    int invalid_mail = 102;
    int empty_password = 103;
    int empty_old_password = 104;
    int empty_confirm_password = 105;
    int match_confirm_password = 106;
    int password_length = 107;


    /**
     * Intent request code
     */
    int REQUEST_CODE_CAMERA = 202;
    int SERVER_ERROR = 203;
    int NO_INTERNET = 204;
    int STATUS_SCAN_CODE = 205;
    /**
     * dialog keys
     */
    int dialog_ok_click = 301;
    int dialog_request_succes = 301;
    int dialog_ok_to_finish = 302;

    /**
     * api status code
     */
    String STATUS_FAIL = "0";
    String STATUS_SUCCESS = "1";

    // Signup
    int EmptyNumber = 1;


    int ValidNumber = 2;
}