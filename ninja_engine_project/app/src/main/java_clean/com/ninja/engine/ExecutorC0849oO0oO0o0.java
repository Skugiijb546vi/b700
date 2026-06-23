package com.ninja.engine;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: com.ninja.engine.oO0oO0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0849oO0oO0o0 implements Executor {
    public final /* synthetic */ int OooO00o;
    public final Handler OooO0O0;

    public ExecutorC0849oO0oO0o0() {
        this.OooO00o = 0;
        this.OooO0O0 = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = this.OooO0O0;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0849oO0oO0o0(Handler handler) {
        this.OooO00o = 1;
        this.OooO0O0 = handler;
    }
}


