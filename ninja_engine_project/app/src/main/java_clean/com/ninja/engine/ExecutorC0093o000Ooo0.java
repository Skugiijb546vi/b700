package com.ninja.engine;

import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.o000Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0093o000Ooo0 implements Executor {
    public final /* synthetic */ int OooO00o;

    public ExecutorC0093o000Ooo0(int i) {
        this.OooO00o = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.OooO00o) {
            case 0:
                new Thread(runnable).start();
                return;
            case 1:
                AbstractC1401oo00OOO0.OooO0o().post(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}


