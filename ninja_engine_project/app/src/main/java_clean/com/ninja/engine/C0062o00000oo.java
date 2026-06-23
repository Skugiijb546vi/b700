package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* renamed from: com.ninja.engine.o00000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062o00000oo implements Application.ActivityLifecycleCallbacks {
    public Object OooO00o;
    public Activity OooO0O0;
    public final int OooO0OO;
    public boolean OooO0Oo = false;
    public boolean OooO0o0 = false;
    public boolean OooO0o = false;

    public C0062o00000oo(Activity activity) {
        this.OooO0O0 = activity;
        this.OooO0OO = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.OooO0O0 == activity) {
            this.OooO0O0 = null;
            this.OooO0o0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.OooO0o0 && !this.OooO0o && !this.OooO0Oo) {
            Object obj = this.OooO00o;
            try {
                Object obj2 = o0000.OooO0OO.get(activity);
                if (obj2 == obj && activity.hashCode() == this.OooO0OO) {
                    o0000.OooO0oO.postAtFrontOfQueue(new o0OO00O(o0000.OooO0O0.get(activity), obj2, 3, false));
                    this.OooO0o = true;
                    this.OooO00o = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.OooO0O0 == activity) {
            this.OooO0Oo = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}


