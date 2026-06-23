package com.ninja.engine;
/* renamed from: com.ninja.engine.oOOOO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996oOOOO0Oo extends C0995oOOOO0O {
    public final Object OooO0OO;

    public C0996oOOOO0Oo(int i) {
        super(i);
        this.OooO0OO = new Object();
    }

    @Override // com.ninja.engine.C0995oOOOO0O, com.ninja.engine.oOOOO0O0
    public final Object OooO() {
        Object OooO;
        synchronized (this.OooO0OO) {
            OooO = super.OooO();
        }
        return OooO;
    }

    @Override // com.ninja.engine.C0995oOOOO0O, com.ninja.engine.oOOOO0O0
    public final boolean OooO0OO(Object obj) {
        boolean OooO0OO;
        AbstractC0809oO0OooOO.OooOOOo(obj, "instance");
        synchronized (this.OooO0OO) {
            OooO0OO = super.OooO0OO(obj);
        }
        return OooO0OO;
    }
}
