package com.ninja.engine;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* loaded from: classes.dex */
public final class oOOOOo00 extends AbstractC0483o0Oooo0o {
    final /* synthetic */ C1003oOOOOo0 this$0;

    public oOOOOo00(C1003oOOOOo0 c1003oOOOOo0) {
        this.this$0 = c1003oOOOOo0;
    }

    @Override // com.ninja.engine.AbstractC0483o0Oooo0o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC1096oOOoOOoo.OooO0O0;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC0809oO0OooOO.OooOOO0(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC1096oOOoOOoo) findFragmentByTag).OooO00o = this.this$0.OooO0oo;
        }
    }

    @Override // com.ninja.engine.AbstractC0483o0Oooo0o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        C1003oOOOOo0 c1003oOOOOo0 = this.this$0;
        int i = c1003oOOOOo0.OooO0O0 - 1;
        c1003oOOOOo0.OooO0O0 = i;
        if (i == 0) {
            Handler handler = c1003oOOOOo0.OooO0o0;
            AbstractC0809oO0OooOO.OooOO0o(handler);
            handler.postDelayed(c1003oOOOOo0.OooO0oO, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        AbstractC0992oOOOO.OooO00o(activity, new oOOOOOoo(this.this$0));
    }

    @Override // com.ninja.engine.AbstractC0483o0Oooo0o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        C1003oOOOOo0 c1003oOOOOo0 = this.this$0;
        int i = c1003oOOOOo0.OooO00o - 1;
        c1003oOOOOo0.OooO00o = i;
        if (i == 0 && c1003oOOOOo0.OooO0OO) {
            c1003oOOOOo0.OooO0o.OooO0Oo(oO0O0O0o.ON_STOP);
            c1003oOOOOo0.OooO0Oo = true;
        }
    }
}
