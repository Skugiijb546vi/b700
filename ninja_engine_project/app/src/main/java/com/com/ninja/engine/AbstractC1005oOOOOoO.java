package com.ninja.engine;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
/* renamed from: com.ninja.engine.oOOOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1005oOOOOoO {
    public static final C1120oOOoo0oo OooO00o = new Object();
    public static final Object OooO0O0 = new Object();
    public static C0919oOO00oOo OooO0OO = null;

    public static long OooO00o(Context context) {
        PackageInfo packageInfo;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = AbstractC0041OoooO00.OooO00o(packageManager, context);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        }
        return packageInfo.lastUpdateTime;
    }

    public static C0919oOO00oOo OooO0O0() {
        C0919oOO00oOo c0919oOO00oOo = new C0919oOO00oOo(7);
        OooO0OO = c0919oOO00oOo;
        C1120oOOoo0oo c1120oOOoo0oo = OooO00o;
        c1120oOOoo0oo.getClass();
        if (AbstractFutureC0023OooOoO.OooO0o.OooO0oo(c1120oOOoo0oo, null, c0919oOO00oOo)) {
            AbstractFutureC0023OooOoO.OooO0O0(c1120oOOoo0oo);
        }
        return OooO0OO;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(8:45|(1:49)|(1:68)(1:56)|57|(2:64|65)|61|62|63)|(1:72)(1:(1:74))|(1:49)|(1:51)|68|57|(1:59)|64|65|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c5, code lost:
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0OO(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1005oOOOOoO.OooO0OO(android.content.Context, boolean):void");
    }
}
