package com.ninja.engine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class o0OOOO00 {
    public static final int OooO0Oo = (Runtime.getRuntime().availableProcessors() * 2) + 1;
    public final C0411o0Oo00oo OooO00o;
    public final ExecutorService OooO0O0;
    public final ExecutorC0849oO0oO0o0 OooO0OO;

    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.concurrent.ThreadPoolExecutor, com.ninja.engine.o0Oo00oo] */
    public o0OOOO00() {
        ThreadFactoryC0059o00000Oo threadFactoryC0059o00000Oo = new ThreadFactoryC0059o00000Oo(2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        int i = OooO0Oo;
        this.OooO00o = new ThreadPoolExecutor(i, i, 0L, timeUnit, priorityBlockingQueue, threadFactoryC0059o00000Oo);
        this.OooO0O0 = Executors.newSingleThreadExecutor();
        this.OooO0OO = new ExecutorC0849oO0oO0o0();
    }
}
