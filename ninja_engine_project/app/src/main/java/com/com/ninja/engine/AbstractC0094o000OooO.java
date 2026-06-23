package com.ninja.engine;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.o000OooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0094o000OooO {
    public static final ExecutorC0091o000OoOo OooO00o = new ExecutorC0091o000OoOo(new ExecutorC0093o000Ooo0(0));
    public static final int OooO0O0 = -100;
    public static C0798oO0OoOO OooO0OO = null;
    public static C0798oO0OoOO OooO0Oo = null;
    public static Boolean OooO0o0 = null;
    public static boolean OooO0o = false;
    public static final C1446oo0O OooO0oO = new C1446oo0O(0);
    public static final Object OooO0oo = new Object();
    public static final Object OooO = new Object();

    public static boolean OooO0O0(Context context) {
        int i;
        if (OooO0o0 == null) {
            try {
                int i2 = AbstractServiceC0137o00O0oOO.OooO00o;
                if (Build.VERSION.SDK_INT >= 24) {
                    i = AbstractC0136o00O0oO.OooO00o() | 128;
                } else {
                    i = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AbstractServiceC0137o00O0oOO.class), i).metaData;
                if (bundle != null) {
                    OooO0o0 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                OooO0o0 = Boolean.FALSE;
            }
        }
        return OooO0o0.booleanValue();
    }

    public static void OooO0o0(AbstractC0094o000OooO abstractC0094o000OooO) {
        synchronized (OooO0oo) {
            try {
                C1446oo0O c1446oo0O = OooO0oO;
                c1446oo0O.getClass();
                o00OO0O o00oo0o = new o00OO0O(c1446oo0O);
                while (o00oo0o.hasNext()) {
                    AbstractC0094o000OooO abstractC0094o000OooO2 = (AbstractC0094o000OooO) ((WeakReference) o00oo0o.next()).get();
                    if (abstractC0094o000OooO2 == abstractC0094o000OooO || abstractC0094o000OooO2 == null) {
                        o00oo0o.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void OooO(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooO0OO();

    public abstract void OooO0Oo();

    public abstract boolean OooO0o(int i);

    public abstract void OooO0oO(int i);

    public abstract void OooO0oo(View view);

    public abstract void OooOO0(CharSequence charSequence);
}
