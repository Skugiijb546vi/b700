package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.oO000o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0705oO000o0o extends C0316o0O0o0o {
    public C0316o0O0o0o[] o00ooo = new C0316o0O0o0o[4];
    public int oo000o = 0;

    public final void OoooO0(int i, C1501oo0OOOoo c1501oo0OOOoo, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.oo000o; i2++) {
            C0316o0O0o0o c0316o0O0o0o = this.o00ooo[i2];
            ArrayList arrayList2 = c1501oo0OOOoo.OooO00o;
            if (!arrayList2.contains(c0316o0O0o0o)) {
                arrayList2.add(c0316o0O0o0o);
            }
        }
        for (int i3 = 0; i3 < this.oo000o; i3++) {
            AbstractC0809oO0OooOO.OooOoOO(this.o00ooo[i3], i, arrayList, c1501oo0OOOoo);
        }
    }

    public void OoooO0O() {
    }
}
