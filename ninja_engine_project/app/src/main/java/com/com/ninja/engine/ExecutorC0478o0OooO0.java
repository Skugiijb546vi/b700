package com.ninja.engine;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.o0OooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0478o0OooO0 implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable OooO0O0;
    public final /* synthetic */ androidx.activity.OooO00o OooO0Oo;
    public final long OooO00o = SystemClock.uptimeMillis() + 10000;
    public boolean OooO0OO = false;

    public ExecutorC0478o0OooO0(o000OO00 o000oo00) {
        this.OooO0Oo = o000oo00;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.OooO0O0 = runnable;
        View decorView = this.OooO0Oo.getWindow().getDecorView();
        if (this.OooO0OO) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new RunnableC0061o00000oO(7, this));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.OooO0O0;
        if (runnable != null) {
            runnable.run();
            this.OooO0O0 = null;
            C1228oOoOo0O0 c1228oOoOo0O0 = this.OooO0Oo.OooO;
            synchronized (c1228oOoOo0O0.OooO0OO) {
                z = c1228oOoOo0O0.OooO0O0;
            }
            if (!z) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.OooO00o) {
            return;
        }
        this.OooO0OO = false;
        this.OooO0Oo.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.OooO0Oo.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
