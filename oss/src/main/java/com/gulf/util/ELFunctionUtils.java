package com.gulf.util;

public abstract class ELFunctionUtils {

    private static String host = "";

    /**
     * ioc注入指定host
     * 
     * @param value
     */
    public static void initHost(String value) {
        host = value;
    }

    public static final String host() {
        return host;
    }
}
