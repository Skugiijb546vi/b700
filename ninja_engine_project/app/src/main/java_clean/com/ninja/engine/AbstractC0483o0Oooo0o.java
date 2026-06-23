package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* renamed from: com.ninja.engine.o0Oooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0483o0Oooo0o implements Application.ActivityLifecycleCallbacks {
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
    public void onActivityResumed(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        AbstractC0809oO0OooOO.OooOOOo(bundle, "outState");
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


