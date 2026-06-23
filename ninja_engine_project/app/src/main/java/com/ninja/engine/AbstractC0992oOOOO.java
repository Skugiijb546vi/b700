package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
/* renamed from: com.ninja.engine.oOOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0992oOOOO {
    public static final void OooO00o(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        AbstractC0809oO0OooOO.OooOOOo(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
