package com.ninja.engine;

import android.util.SparseArray;
/* renamed from: com.ninja.engine.oOO0000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902oOO0000o {
    public final SparseArray OooO00o;
    public C1373oo000o0 OooO0O0;

    public C0902oOO0000o(int i) {
        this.OooO00o = new SparseArray(i);
    }

    public final void OooO00o(C1373oo000o0 c1373oo000o0, int i, int i2) {
        C0902oOO0000o c0902oOO0000o;
        int OooO00o = c1373oo000o0.OooO00o(i);
        SparseArray sparseArray = this.OooO00o;
        if (sparseArray == null) {
            c0902oOO0000o = null;
        } else {
            c0902oOO0000o = (C0902oOO0000o) sparseArray.get(OooO00o);
        }
        if (c0902oOO0000o == null) {
            c0902oOO0000o = new C0902oOO0000o(1);
            sparseArray.put(c1373oo000o0.OooO00o(i), c0902oOO0000o);
        }
        if (i2 > i) {
            c0902oOO0000o.OooO00o(c1373oo000o0, i + 1, i2);
        } else {
            c0902oOO0000o.OooO0O0 = c1373oo000o0;
        }
    }
}
