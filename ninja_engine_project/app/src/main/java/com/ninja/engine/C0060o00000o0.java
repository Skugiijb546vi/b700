package com.ninja.engine;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.o00000o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060o00000o0 extends WeakReference {
    public final InterfaceC0745oO00oOo OooO00o;
    public final boolean OooO0O0;
    public InterfaceC1108oOOoo OooO0OO;

    public C0060o00000o0(InterfaceC0745oO00oOo interfaceC0745oO00oOo, C0504o0o00O0O c0504o0o00O0O, ReferenceQueue referenceQueue, boolean z) {
        super(c0504o0o00O0O, referenceQueue);
        InterfaceC1108oOOoo interfaceC1108oOOoo;
        AbstractC0694o0ooooo0.OooOO0O(interfaceC0745oO00oOo, "Argument must not be null");
        this.OooO00o = interfaceC0745oO00oOo;
        if (c0504o0o00O0O.OooO00o && z) {
            interfaceC1108oOOoo = c0504o0o00O0O.OooO0OO;
            AbstractC0694o0ooooo0.OooOO0O(interfaceC1108oOOoo, "Argument must not be null");
        } else {
            interfaceC1108oOOoo = null;
        }
        this.OooO0OO = interfaceC1108oOOoo;
        this.OooO0O0 = c0504o0o00O0O.OooO00o;
    }
}
