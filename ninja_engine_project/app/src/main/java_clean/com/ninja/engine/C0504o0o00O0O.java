package com.ninja.engine;
/* renamed from: com.ninja.engine.o0o00O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504o0o00O0O implements InterfaceC1108oOOoo {
    public final boolean OooO00o;
    public final boolean OooO0O0;
    public final InterfaceC1108oOOoo OooO0OO;
    public final InterfaceC0502o0o00O0 OooO0Oo;
    public int OooO0o;
    public final InterfaceC0745oO00oOo OooO0o0;
    public boolean OooO0oO;

    public C0504o0o00O0O(InterfaceC1108oOOoo interfaceC1108oOOoo, boolean z, boolean z2, InterfaceC0745oO00oOo interfaceC0745oO00oOo, InterfaceC0502o0o00O0 interfaceC0502o0o00O0) {
        AbstractC0694o0ooooo0.OooOO0O(interfaceC1108oOOoo, "Argument must not be null");
        this.OooO0OO = interfaceC1108oOOoo;
        this.OooO00o = z;
        this.OooO0O0 = z2;
        this.OooO0o0 = interfaceC0745oO00oOo;
        AbstractC0694o0ooooo0.OooOO0O(interfaceC0502o0o00O0, "Argument must not be null");
        this.OooO0Oo = interfaceC0502o0o00O0;
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final int OooO00o() {
        return this.OooO0OO.OooO00o();
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Class OooO0O0() {
        return this.OooO0OO.OooO0O0();
    }

    public final synchronized void OooO0OO() {
        if (!this.OooO0oO) {
            this.OooO0o++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final synchronized void OooO0Oo() {
        if (this.OooO0o <= 0) {
            if (!this.OooO0oO) {
                this.OooO0oO = true;
                if (this.OooO0O0) {
                    this.OooO0OO.OooO0Oo();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final void OooO0o0() {
        boolean z;
        synchronized (this) {
            int i = this.OooO0o;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.OooO0o = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            ((C0496o0o000OO) this.OooO0Oo).OooO0o0(this.OooO0o0, this);
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Object get() {
        return this.OooO0OO.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.OooO00o + ", listener=" + this.OooO0Oo + ", key=" + this.OooO0o0 + ", acquired=" + this.OooO0o + ", isRecycled=" + this.OooO0oO + ", resource=" + this.OooO0OO + '}';
    }
}


