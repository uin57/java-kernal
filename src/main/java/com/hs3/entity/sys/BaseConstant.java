package com.hs3.entity.sys;

public class BaseConstant {
    //測試機domain
    public static final String DEV_DOMAIN = "http://115.144.238.218:8889";

    //狀態
    public static final Integer SUCCESS = 1;
    public static final Integer FAIL = 0;

    //app
    public static final Integer ANDROID = 1;
    public static final Integer IOS = 2;
    public static final String ANDROID_URL = DEV_DOMAIN + "/app/zh.apk";
    public static final String IOS_URL = DEV_DOMAIN + "/app/zh.apk";

    //手機圖片
    public static final Integer MOBILE_IMG = 2;

}
