package com.ninja.engine;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.ninja.engine.o0OOooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0402o0OOooOo implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}


