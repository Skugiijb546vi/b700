package com.ninja.engine;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
/* renamed from: com.ninja.engine.oo00oOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433oo00oOoO {
    public static final Matrix OooOOOo = new Matrix();
    public float OooO;
    public final Path OooO00o;
    public final Path OooO0O0;
    public final Matrix OooO0OO;
    public Paint OooO0Oo;
    public PathMeasure OooO0o;
    public Paint OooO0o0;
    public final C1425oo00oO0 OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public int OooOO0o;
    public Boolean OooOOO;
    public String OooOOO0;
    public final C0145o00OO0oO OooOOOO;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    public C1433oo00oOoO() {
        this.OooO0OO = new Matrix();
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        this.OooOO0 = 0.0f;
        this.OooOO0O = 0.0f;
        this.OooOO0o = 255;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOOO = new C1218oOoOOoo();
        this.OooO0oO = new C1425oo00oO0();
        this.OooO00o = new Path();
        this.OooO0O0 = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if (r0.OooOO0O != 1.0f) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.ninja.engine.C1425oo00oO0 r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1433oo00oOoO.OooO00o(com.ninja.engine.oo00oO0, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.OooOO0o;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.OooOO0o = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    public C1433oo00oOoO(C1433oo00oOoO c1433oo00oOoO) {
        this.OooO0OO = new Matrix();
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        this.OooOO0 = 0.0f;
        this.OooOO0O = 0.0f;
        this.OooOO0o = 255;
        this.OooOOO0 = null;
        this.OooOOO = null;
        C1218oOoOOoo c1218oOoOOoo = new C1218oOoOOoo(0);
        this.OooOOOO = c1218oOoOOoo;
        this.OooO0oO = new C1425oo00oO0(c1433oo00oOoO.OooO0oO, c1218oOoOOoo);
        this.OooO00o = new Path(c1433oo00oOoO.OooO00o);
        this.OooO0O0 = new Path(c1433oo00oOoO.OooO0O0);
        this.OooO0oo = c1433oo00oOoO.OooO0oo;
        this.OooO = c1433oo00oOoO.OooO;
        this.OooOO0 = c1433oo00oOoO.OooOO0;
        this.OooOO0O = c1433oo00oOoO.OooOO0O;
        this.OooOO0o = c1433oo00oOoO.OooOO0o;
        this.OooOOO0 = c1433oo00oOoO.OooOOO0;
        String str = c1433oo00oOoO.OooOOO0;
        if (str != null) {
            c1218oOoOOoo.put(str, this);
        }
        this.OooOOO = c1433oo00oOoO.OooOOO;
    }
}



