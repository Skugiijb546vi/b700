package com.app.framework.utils;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class XposedErrorLogger {
    private static final Map<String, String> moduleErrors = new HashMap();

    public static Map<String, String> getAllModuleErrors() {
        return new HashMap(moduleErrors);
    }

    public static String getModuleError(String str) {
        return moduleErrors.get(str);
    }

    public static void logModuleError(String str, String str2) {
        moduleErrors.put(str, str2);
    }
}
