package com.ninja.engine;
/* renamed from: com.ninja.engine.oO0Oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0791oO0Oo0O {
    public final o00O OooO00o;
    public boolean OooO0O0;
    public int OooO0OO = -1;
    public final /* synthetic */ androidx.lifecycle.OooO0O0 OooO0Oo;

    public AbstractC0791oO0Oo0O(androidx.lifecycle.OooO0O0 oooO0O0, o00O o00o) {
        this.OooO0Oo = oooO0O0;
        this.OooO00o = o00o;
    }

    public final void OooO0OO(boolean z) {
        int i;
        if (z == this.OooO0O0) {
            return;
        }
        this.OooO0O0 = z;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        androidx.lifecycle.OooO0O0 oooO0O0 = this.OooO0Oo;
        int i2 = oooO0O0.OooO0OO;
        oooO0O0.OooO0OO = i + i2;
        if (!oooO0O0.OooO0Oo) {
            oooO0O0.OooO0Oo = true;
            while (true) {
                try {
                    int i3 = oooO0O0.OooO0OO;
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i3;
                } finally {
                    oooO0O0.OooO0Oo = false;
                }
            }
        }
        if (this.OooO0O0) {
            oooO0O0.OooO0OO(this);
        }
    }

    public abstract boolean OooO0o0();

    public void OooO0Oo() {
    }
}


