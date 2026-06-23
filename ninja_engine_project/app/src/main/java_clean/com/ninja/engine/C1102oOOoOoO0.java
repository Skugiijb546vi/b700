package com.ninja.engine;

import android.os.Process;
/* renamed from: com.ninja.engine.oOOoOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102oOOoOoO0 extends Thread {
    public final int OooO00o;

    public C1102oOOoOoO0(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.OooO00o = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.OooO00o);
        super.run();
    }
}


