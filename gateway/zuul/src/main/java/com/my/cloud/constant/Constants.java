package com.my.cloud.constant;

/**
 * Created by liuj-ai on 2018/3/6.
 */
public class Constants {

    public static final String SERVICE_ID_KEY = "serviceId";

    public static final String REQUEST_URI_KEY = "requestURI";

    public static final String EQ_SIGN = "=";

    public static final String COOKIE_HEADER = "Cookie";

    public static final int COOKIE_TIME_OUT = 1 * 1800;

    public static final String ZUUL_INTERRUPTED_MARK = "zuul-interrupted";

    public static final String AUTH_TOKEN_HEADER = ".CLOUD_ACCESS_TOKEN";

    public static final String TOKEN_HEADER = "Authorization";

    public static final String TOKEN_PARAM = "s";

    public static final String PATH_ROOT = "/";

    public static final String USER_INFO_HEADER = "payload";

    public static final String PATH_API = "/api";

    public static final long AUTH_CACHE_EXPIRE = 1 * 3600 * 1000;

    /**
     * 忽略当前url
     */
    public static final String IGNORE = "ignore";

    public static final String TECH_FORWARD ="/bim5d-tech";

  /*  public class CloudTPath
    {
        public static final String PATH_CURRENT_USER_NAME = "/pmpp/services/user/current-user-name";

        public static final String PATH_SESSION_USER = "/session/user";

        public static final String PATH_SESSION_AUTHORITY = "/session/authority";

        public static final String PATH_SESSION_CHECK = "/session/check";

        public static final String PATH_PERMISSION_AUTHORITY  = "/permission/authority/api";
    }*/


    public class ErrorCode {
        public static final int TOKEN_ERROR_CODE = 501;

        public static final int API_ACCESS_NO_AUTHORITY_ERROR_CODE = 502;
    }

}