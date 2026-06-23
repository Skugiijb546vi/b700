package com.ninja.engine;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class o implements ThreadFactory {
    public final ThreadFactory OooO00o;
    public final String OooO0O0;
    public final C0455o0OoOo00 OooO0OO;
    public final boolean OooO0Oo;
    public final AtomicInteger OooO0o0;

    public o(ThreadFactoryC0059o00000Oo threadFactoryC0059o00000Oo, String str, boolean z) {
        C0455o0OoOo00 c0455o0OoOo00 = C0455o0OoOo00.OooO0O0;
        this.OooO0o0 = new AtomicInteger();
        this.OooO00o = threadFactoryC0059o00000Oo;
        this.OooO0O0 = str;
        this.OooO0OO = c0455o0OoOo00;
        this.OooO0Oo = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.OooO00o.newThread(new o0OO00O(this, 6, runnable));
        newThread.setName("glide-" + this.OooO0O0 + "-thread-" + this.OooO0o0.getAndIncrement());
        return newThread;
    }
}


