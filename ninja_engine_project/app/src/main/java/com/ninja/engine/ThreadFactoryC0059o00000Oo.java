package com.ninja.engine;

import java.util.concurrent.ThreadFactory;
/* renamed from: com.ninja.engine.o00000Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0059o00000Oo implements ThreadFactory {
    public final /* synthetic */ int OooO00o;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.OooO00o) {
            case 0:
                return new Thread(new o00000OO(0, runnable), "glide-active-resources");
            case 1:
                return new Thread(runnable);
            default:
                return new Thread(new o0OO00O(this, 7, runnable));
        }
    }
}
