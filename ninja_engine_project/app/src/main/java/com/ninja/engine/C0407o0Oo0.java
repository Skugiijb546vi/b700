package com.ninja.engine;

import java.util.concurrent.FutureTask;
/* renamed from: com.ninja.engine.o0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407o0Oo0 extends FutureTask implements Comparable {
    public final RunnableC0412o0Oo0O OooO00o;

    public C0407o0Oo0(RunnableC0412o0Oo0O runnableC0412o0Oo0O) {
        super(runnableC0412o0Oo0O, null);
        this.OooO00o = runnableC0412o0Oo0O;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0407o0Oo0 c0407o0Oo0 = (C0407o0Oo0) obj;
        RunnableC0412o0Oo0O runnableC0412o0Oo0O = this.OooO00o;
        runnableC0412o0Oo0O.getClass();
        c0407o0Oo0.OooO00o.getClass();
        return runnableC0412o0Oo0O.OooO00o - c0407o0Oo0.OooO00o.OooO00o;
    }
}
