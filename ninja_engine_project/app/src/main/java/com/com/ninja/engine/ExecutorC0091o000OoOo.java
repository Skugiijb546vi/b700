package com.ninja.engine;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.o000OoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0091o000OoOo implements Executor {
    public final Object OooO00o = new Object();
    public final ArrayDeque OooO0O0 = new ArrayDeque();
    public final Executor OooO0OO;
    public Runnable OooO0Oo;

    public ExecutorC0091o000OoOo(ExecutorC0093o000Ooo0 executorC0093o000Ooo0) {
        this.OooO0OO = executorC0093o000Ooo0;
    }

    public final void OooO00o() {
        synchronized (this.OooO00o) {
            try {
                Runnable runnable = (Runnable) this.OooO0O0.poll();
                this.OooO0Oo = runnable;
                if (runnable != null) {
                    this.OooO0OO.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.OooO00o) {
            try {
                this.OooO0O0.add(new RunnableC0090o000OoOO(this, 0, runnable));
                if (this.OooO0Oo == null) {
                    OooO00o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
