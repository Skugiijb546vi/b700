package com.ninja.engine;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.ninja.engine.o0OOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0375o0OOo00 implements ThreadFactory {
    public final AtomicInteger OooO00o = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.OooO00o.getAndIncrement());
        return thread;
    }
}


