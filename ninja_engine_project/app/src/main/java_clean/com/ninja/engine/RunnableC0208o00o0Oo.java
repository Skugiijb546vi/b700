package com.ninja.engine;

import android.content.Context;
import com.app.framework.BlackBoxCore;
/* renamed from: com.ninja.engine.o00o0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0208o00o0Oo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ BlackBoxCore OooO0O0;
    public final /* synthetic */ Context OooO0OO;

    public /* synthetic */ RunnableC0208o00o0Oo(BlackBoxCore blackBoxCore, Context context, int i) {
        this.OooO00o = i;
        this.OooO0O0 = blackBoxCore;
        this.OooO0OO = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.lambda$bootstrapStartupLogcatCapture$3(this.OooO0OO);
                return;
            default:
                this.OooO0O0.lambda$startAnrWatchdog$2(this.OooO0OO);
                return;
        }
    }
}


