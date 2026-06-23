package com.ninja.engine;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.ninja.engine.o0O0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0300o0O0Oo implements ThreadFactory {
    public final /* synthetic */ String OooO00o;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.OooO00o);
        thread.setPriority(10);
        return thread;
    }
}
