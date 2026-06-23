package com.app.framework.utils;
/* loaded from: classes.dex */
public class HackAppUtils {
    public static void enableQQLogOutput(String str, ClassLoader classLoader) {
        if ("com.tencent.mobileqq".equals(str)) {
            try {
                Reflector.on("com.tencent.qphone.base.util.QLog", true, classLoader).field("UIN_REPORTLOG_LEVEL").set(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


