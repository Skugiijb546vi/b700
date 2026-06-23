package com.ninja.engine;

import android.graphics.Paint;
/* renamed from: com.ninja.engine.oo00o00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422oo00o00O extends AbstractC1427oo00oO0o {
    public float OooO;
    public float OooO0o;
    public o0O0OO OooO0o0;
    public o0O0OO OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public Paint.Join OooOOO;
    public Paint.Cap OooOOO0;
    public float OooOOOO;

    @Override // com.ninja.engine.AbstractC1426oo00oO0O
    public final boolean OooO00o() {
        if (!this.OooO0oO.OooO0O0() && !this.OooO0o0.OooO0O0()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // com.ninja.engine.AbstractC1426oo00oO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0O0(int[] r7) {
        /*
            r6 = this;
            com.ninja.engine.o0O0OO r0 = r6.OooO0oO
            boolean r1 = r0.OooO0O0()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.OooO0OO
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.OooO00o
            if (r1 == r4) goto L1e
            r0.OooO00o = r1
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            com.ninja.engine.o0O0OO r1 = r6.OooO0o0
            boolean r4 = r1.OooO0O0()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.OooO0OO
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.OooO00o
            if (r7 == r4) goto L3a
            r1.OooO00o = r7
            r2 = 1
        L3a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1422oo00o00O.OooO0O0(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.OooO;
    }

    public int getFillColor() {
        return this.OooO0oO.OooO00o;
    }

    public float getStrokeAlpha() {
        return this.OooO0oo;
    }

    public int getStrokeColor() {
        return this.OooO0o0.OooO00o;
    }

    public float getStrokeWidth() {
        return this.OooO0o;
    }

    public float getTrimPathEnd() {
        return this.OooOO0O;
    }

    public float getTrimPathOffset() {
        return this.OooOO0o;
    }

    public float getTrimPathStart() {
        return this.OooOO0;
    }

    public void setFillAlpha(float f) {
        this.OooO = f;
    }

    public void setFillColor(int i) {
        this.OooO0oO.OooO00o = i;
    }

    public void setStrokeAlpha(float f) {
        this.OooO0oo = f;
    }

    public void setStrokeColor(int i) {
        this.OooO0o0.OooO00o = i;
    }

    public void setStrokeWidth(float f) {
        this.OooO0o = f;
    }

    public void setTrimPathEnd(float f) {
        this.OooOO0O = f;
    }

    public void setTrimPathOffset(float f) {
        this.OooOO0o = f;
    }

    public void setTrimPathStart(float f) {
        this.OooOO0 = f;
    }
}


