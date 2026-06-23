package com.app.framework.utils;

import android.content.Context;
import com.android.volley.toolbox.ImageRequest;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class QQUtils {
    public static void hackLog(Context context) {
        try {
            Field declaredField = context.getClassLoader().loadClass("com.tencent.qphone.base.util.QLog").getDeclaredField("UIN_REPORTLOG_LEVEL");
            declaredField.setAccessible(true);
            declaredField.set(null, Integer.valueOf((int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}


