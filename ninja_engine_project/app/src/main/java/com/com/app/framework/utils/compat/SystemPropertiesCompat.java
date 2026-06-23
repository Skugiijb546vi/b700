package com.app.framework.utils.compat;

import android.text.TextUtils;
import com.app.framework.utils.Reflector;
/* loaded from: classes.dex */
public class SystemPropertiesCompat {
    public static String get(String str) {
        try {
            return (String) Reflector.on("android.os.SystemProperties").method("get", String.class).call(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getInt(String str, int i) {
        try {
            return ((Integer) Reflector.on("android.os.SystemProperties").method("getInt", String.class, Integer.TYPE).call(str, Integer.valueOf(i))).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public static boolean isExist(String str) {
        return !TextUtils.isEmpty(get(str));
    }

    public static String get(String str, String str2) {
        try {
            return (String) Reflector.on("android.os.SystemProperties").method("get", String.class, String.class).call(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }
}
