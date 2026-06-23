package com.ninja.engine;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeProvider;
/* renamed from: com.ninja.engine.OoooOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0044OoooOOO {
    public static C0044OoooOOO OooO0O0;
    public final Object OooO00o;

    public C0044OoooOOO(int i) {
        switch (i) {
            case 1:
                this.OooO00o = new Object();
                new Handler(Looper.getMainLooper(), new C0687o0oooo0(1, this));
                return;
            default:
                this.OooO00o = Build.VERSION.SDK_INT >= 26 ? new C0043OoooOO0(this) : new C0043OoooOO0(this);
                return;
        }
    }

    public C0039OoooO OooO00o(int i) {
        return null;
    }

    public C0039OoooO OooO0O0(int i) {
        return null;
    }

    public void OooO0OO() {
        synchronized (this.OooO00o) {
        }
    }

    public boolean OooO0Oo(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0044OoooOOO(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.OooO00o = accessibilityNodeProvider;
    }
}
