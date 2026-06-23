package com.ninja.engine;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.ninja.engine.oOOoOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1101oOOoOoO implements ThreadFactory {
    public String OooO00o;
    public int OooO0O0;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1102oOOoOoO0(runnable, this.OooO00o, this.OooO0O0);
    }
}
