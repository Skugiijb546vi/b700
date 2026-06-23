package com.app.framework.core.env;

import android.content.pm.ApplicationInfo;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0195o00o00Oo;
import com.ninja.engine.InterfaceC1882ooOoOOOo;
/* loaded from: classes.dex */
public class VirtualRuntime {
    private static String sInitialPackageName;
    private static String sProcessName;

    public static String getInitialPackageName() {
        return sInitialPackageName;
    }

    public static String getProcessName() {
        return sProcessName;
    }

    public static void setupRuntime(String str, ApplicationInfo applicationInfo) {
        if (sProcessName != null) {
            return;
        }
        sInitialPackageName = applicationInfo.packageName;
        sProcessName = str;
        ((InterfaceC0195o00o00Oo) C0217o00o0oO0.create(InterfaceC0195o00o00Oo.class, null, false)).setArgV0(str);
        ((InterfaceC1882ooOoOOOo) C0217o00o0oO0.create(InterfaceC1882ooOoOOOo.class, null, false)).setAppName(str, 0);
    }
}
