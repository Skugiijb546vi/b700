package com.ninja.engine;

import android.content.Intent;
import com.app.framework.app.LauncherActivity;
import java.io.Serializable;
/* renamed from: com.ninja.engine.o0OOo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0381o0OOo0Oo implements Runnable {
    public final /* synthetic */ int OooO00o = 1;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ Object OooO0OO;
    public final /* synthetic */ Object OooO0Oo;

    public /* synthetic */ RunnableC0381o0OOo0Oo(LauncherActivity launcherActivity, Intent intent, int i) {
        this.OooO0OO = launcherActivity;
        this.OooO0Oo = intent;
        this.OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                ((C0383o0OOo0o0) this.OooO0OO).OooO0O0.OooOOo(this.OooO0O0, this.OooO0Oo);
                return;
            default:
                int i = this.OooO0O0;
                LauncherActivity.OooO0OO((LauncherActivity) this.OooO0OO, (Intent) this.OooO0Oo, i);
                return;
        }
    }

    public /* synthetic */ RunnableC0381o0OOo0Oo(C0383o0OOo0o0 c0383o0OOo0o0, int i, Serializable serializable) {
        this.OooO0OO = c0383o0OOo0o0;
        this.OooO0O0 = i;
        this.OooO0Oo = serializable;
    }
}
