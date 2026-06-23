package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* renamed from: com.ninja.engine.oOOoOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095oOOoOOoO implements Application.ActivityLifecycleCallbacks {
    public static final C1093oOOoOOo Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new C1095oOOoOOoO());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooO0o(activity, oO0O0O0o.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooO0o(activity, oO0O0O0o.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooO0o(activity, oO0O0O0o.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooO0o(activity, oO0O0O0o.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooO0o(activity, oO0O0O0o.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooO0o(activity, oO0O0O0o.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        AbstractC0809oO0OooOO.OooOOOo(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }
}
