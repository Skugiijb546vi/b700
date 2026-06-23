package com.ninja.engine;

import android.util.SparseArray;
/* renamed from: com.ninja.engine.oOOo0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1073oOOo0o0o {
    public SparseArray OooO00o;
    public int OooO0O0;

    public final C1072oOOo0o0O OooO00o(int i) {
        SparseArray sparseArray = this.OooO00o;
        C1072oOOo0o0O c1072oOOo0o0O = (C1072oOOo0o0O) sparseArray.get(i);
        if (c1072oOOo0o0O == null) {
            C1072oOOo0o0O c1072oOOo0o0O2 = new C1072oOOo0o0O();
            sparseArray.put(i, c1072oOOo0o0O2);
            return c1072oOOo0o0O2;
        }
        return c1072oOOo0o0O;
    }
}
