package com.ninja.engine;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: com.ninja.engine.o0Oo00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411o0Oo00oo extends ThreadPoolExecutor {
    public C0411o0Oo00oo(int corePoolSize, int maximumPoolSize, long keepAliveTime, java.util.concurrent.TimeUnit unit, java.util.concurrent.BlockingQueue<Runnable> workQueue, java.util.concurrent.ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        C0407o0Oo0 c0407o0Oo0 = new C0407o0Oo0((RunnableC0412o0Oo0O) runnable);
        execute(c0407o0Oo0);
        return c0407o0Oo0;
    }
}


