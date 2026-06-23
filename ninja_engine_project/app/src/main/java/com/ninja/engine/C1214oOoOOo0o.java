package com.ninja.engine;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOoOOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1214oOoOOo0o {
    public float OooO00o;
    public float OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public final ArrayList OooO0oO = new ArrayList();
    public final ArrayList OooO0oo = new ArrayList();

    public C1214oOoOOo0o() {
        OooO0Oo(0.0f, 270.0f, 0.0f);
    }

    public final void OooO00o(float f) {
        float f2 = this.OooO0o0;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.OooO0OO;
        float f5 = this.OooO0Oo;
        C1319oOooOooO c1319oOooOooO = new C1319oOooOooO(f4, f5, f4, f5);
        c1319oOooOooO.OooO0o = this.OooO0o0;
        c1319oOooOooO.OooO0oO = f3;
        this.OooO0oo.add(new C1207oOoOOOo(c1319oOooOooO));
        this.OooO0o0 = f;
    }

    public final void OooO0O0(Matrix matrix, Path path) {
        ArrayList arrayList = this.OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1212oOoOOo00) arrayList.get(i)).OooO00o(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOoOOo00, com.ninja.engine.oOoOOOoo, java.lang.Object] */
    public final void OooO0OO(float f, float f2) {
        AbstractC1212oOoOOo00 abstractC1212oOoOOo00 = new AbstractC1212oOoOOo00();
        abstractC1212oOoOOo00.OooO0O0 = f;
        abstractC1212oOoOOo00.OooO0OO = f2;
        this.OooO0oO.add(abstractC1212oOoOOo00);
        C1208oOoOOOoO c1208oOoOOOoO = new C1208oOoOOOoO(abstractC1212oOoOOo00, this.OooO0OO, this.OooO0Oo);
        OooO00o(c1208oOoOOOoO.OooO0O0() + 270.0f);
        this.OooO0oo.add(c1208oOoOOOoO);
        this.OooO0o0 = c1208oOoOOOoO.OooO0O0() + 270.0f;
        this.OooO0OO = f;
        this.OooO0Oo = f2;
    }

    public final void OooO0Oo(float f, float f2, float f3) {
        this.OooO00o = 0.0f;
        this.OooO0O0 = f;
        this.OooO0OO = 0.0f;
        this.OooO0Oo = f;
        this.OooO0o0 = f2;
        this.OooO0o = (f2 + f3) % 360.0f;
        this.OooO0oO.clear();
        this.OooO0oo.clear();
    }
}

