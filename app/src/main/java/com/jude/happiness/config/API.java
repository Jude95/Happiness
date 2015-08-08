package com.jude.happiness.config;

/**
 * Created by zhuchenxi on 15/8/2.
 */
public class API {
    public static final class URL{
        public static final String BASEURL = "http://114.215.153.178/?s=home/index/index";

    }

    public static class KEY {
        public static final String STATUS = "status";
        public static final String INFO = "info";
        public static final String DATA = "data";
    }

    public static class CODE {
        public static final int SUCCEED = 200;
        public static final int Failure = 0;
        public static final int PERMISSION_DENIED = 400;
    }
}
