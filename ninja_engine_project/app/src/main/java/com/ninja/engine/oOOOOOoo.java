package com.ninja.engine;

import android.app.Activity;
/* loaded from: classes.dex */
public final class oOOOOOoo extends AbstractC0483o0Oooo0o {
    final /* synthetic */ C1003oOOOOo0 this$0;

    public oOOOOOoo(C1003oOOOOo0 c1003oOOOOo0) {
        this.this$0 = c1003oOOOOo0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        this.this$0.OooO0O0();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        C1003oOOOOo0 c1003oOOOOo0 = this.this$0;
        int i = c1003oOOOOo0.OooO00o + 1;
        c1003oOOOOo0.OooO00o = i;
        if (i == 1 && c1003oOOOOo0.OooO0Oo) {
            c1003oOOOOo0.OooO0o.OooO0Oo(oO0O0O0o.ON_START);
            c1003oOOOOo0.OooO0Oo = false;
        }
    }
}
