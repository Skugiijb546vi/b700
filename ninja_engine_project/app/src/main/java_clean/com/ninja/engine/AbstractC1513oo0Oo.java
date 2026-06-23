package com.ninja.engine;
/* renamed from: com.ninja.engine.oo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1513oo0Oo {
    public final C1536oo0OoOoO OooO00o;
    public C0724oO00OooO[] OooO0O0;

    public AbstractC1513oo0Oo() {
        this(new C1536oo0OoOoO());
    }

    public final void OooO00o() {
        C0724oO00OooO[] c0724oO00OooOArr = this.OooO0O0;
        if (c0724oO00OooOArr != null) {
            C0724oO00OooO c0724oO00OooO = c0724oO00OooOArr[AbstractC1094oOOoOOo0.OooOO0o(1)];
            C0724oO00OooO c0724oO00OooO2 = this.OooO0O0[AbstractC1094oOOoOOo0.OooOO0o(2)];
            C1536oo0OoOoO c1536oo0OoOoO = this.OooO00o;
            if (c0724oO00OooO2 == null) {
                c0724oO00OooO2 = c1536oo0OoOoO.OooO00o.OooO0o(2);
            }
            if (c0724oO00OooO == null) {
                c0724oO00OooO = c1536oo0OoOoO.OooO00o.OooO0o(1);
            }
            OooO0oO(C0724oO00OooO.OooO00o(c0724oO00OooO, c0724oO00OooO2));
            C0724oO00OooO c0724oO00OooO3 = this.OooO0O0[AbstractC1094oOOoOOo0.OooOO0o(16)];
            if (c0724oO00OooO3 != null) {
                OooO0o(c0724oO00OooO3);
            }
            C0724oO00OooO c0724oO00OooO4 = this.OooO0O0[AbstractC1094oOOoOOo0.OooOO0o(32)];
            if (c0724oO00OooO4 != null) {
                OooO0Oo(c0724oO00OooO4);
            }
            C0724oO00OooO c0724oO00OooO5 = this.OooO0O0[AbstractC1094oOOoOOo0.OooOO0o(64)];
            if (c0724oO00OooO5 != null) {
                OooO0oo(c0724oO00OooO5);
            }
        }
    }

    public abstract C1536oo0OoOoO OooO0O0();

    public void OooO0OO(int i, C0724oO00OooO c0724oO00OooO) {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C0724oO00OooO[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.OooO0O0[AbstractC1094oOOoOOo0.OooOO0o(i2)] = c0724oO00OooO;
            }
        }
    }

    public abstract void OooO0o0(C0724oO00OooO c0724oO00OooO);

    public abstract void OooO0oO(C0724oO00OooO c0724oO00OooO);

    public AbstractC1513oo0Oo(C1536oo0OoOoO c1536oo0OoOoO) {
        this.OooO00o = c1536oo0OoOoO;
    }

    public void OooO0Oo(C0724oO00OooO c0724oO00OooO) {
    }

    public void OooO0o(C0724oO00OooO c0724oO00OooO) {
    }

    public void OooO0oo(C0724oO00OooO c0724oO00OooO) {
    }
}


