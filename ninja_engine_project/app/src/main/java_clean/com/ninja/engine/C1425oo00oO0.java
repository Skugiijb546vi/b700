package com.ninja.engine;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oo00oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425oo00oO0 extends AbstractC1426oo00oO0O {
    public float OooO;
    public final Matrix OooO00o;
    public final ArrayList OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public float OooO0oo;
    public final Matrix OooOO0;
    public final int OooOO0O;
    public String OooOO0o;

    public C1425oo00oO0() {
        this.OooO00o = new Matrix();
        this.OooO0O0 = new ArrayList();
        this.OooO0OO = 0.0f;
        this.OooO0Oo = 0.0f;
        this.OooO0o0 = 0.0f;
        this.OooO0o = 1.0f;
        this.OooO0oO = 1.0f;
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        this.OooOO0 = new Matrix();
        this.OooOO0o = null;
    }

    @Override // com.ninja.engine.AbstractC1426oo00oO0O
    public final boolean OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1426oo00oO0O) arrayList.get(i)).OooO00o()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.ninja.engine.AbstractC1426oo00oO0O
    public final boolean OooO0O0(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i < arrayList.size()) {
                z |= ((AbstractC1426oo00oO0O) arrayList.get(i)).OooO0O0(iArr);
                i++;
            } else {
                return z;
            }
        }
    }

    public final void OooO0OO() {
        Matrix matrix = this.OooOO0;
        matrix.reset();
        matrix.postTranslate(-this.OooO0Oo, -this.OooO0o0);
        matrix.postScale(this.OooO0o, this.OooO0oO);
        matrix.postRotate(this.OooO0OO, 0.0f, 0.0f);
        matrix.postTranslate(this.OooO0oo + this.OooO0Oo, this.OooO + this.OooO0o0);
    }

    public String getGroupName() {
        return this.OooOO0o;
    }

    public Matrix getLocalMatrix() {
        return this.OooOO0;
    }

    public float getPivotX() {
        return this.OooO0Oo;
    }

    public float getPivotY() {
        return this.OooO0o0;
    }

    public float getRotation() {
        return this.OooO0OO;
    }

    public float getScaleX() {
        return this.OooO0o;
    }

    public float getScaleY() {
        return this.OooO0oO;
    }

    public float getTranslateX() {
        return this.OooO0oo;
    }

    public float getTranslateY() {
        return this.OooO;
    }

    public void setPivotX(float f) {
        if (f != this.OooO0Oo) {
            this.OooO0Oo = f;
            OooO0OO();
        }
    }

    public void setPivotY(float f) {
        if (f != this.OooO0o0) {
            this.OooO0o0 = f;
            OooO0OO();
        }
    }

    public void setRotation(float f) {
        if (f != this.OooO0OO) {
            this.OooO0OO = f;
            OooO0OO();
        }
    }

    public void setScaleX(float f) {
        if (f != this.OooO0o) {
            this.OooO0o = f;
            OooO0OO();
        }
    }

    public void setScaleY(float f) {
        if (f != this.OooO0oO) {
            this.OooO0oO = f;
            OooO0OO();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.OooO0oo) {
            this.OooO0oo = f;
            OooO0OO();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.OooO) {
            this.OooO = f;
            OooO0OO();
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.ninja.engine.oo00oO0o, com.ninja.engine.oo00o00O] */
    public C1425oo00oO0(C1425oo00oO0 c1425oo00oO0, C0145o00OO0oO c0145o00OO0oO) {
        AbstractC1427oo00oO0o abstractC1427oo00oO0o;
        this.OooO00o = new Matrix();
        this.OooO0O0 = new ArrayList();
        this.OooO0OO = 0.0f;
        this.OooO0Oo = 0.0f;
        this.OooO0o0 = 0.0f;
        this.OooO0o = 1.0f;
        this.OooO0oO = 1.0f;
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        Matrix matrix = new Matrix();
        this.OooOO0 = matrix;
        this.OooOO0o = null;
        this.OooO0OO = c1425oo00oO0.OooO0OO;
        this.OooO0Oo = c1425oo00oO0.OooO0Oo;
        this.OooO0o0 = c1425oo00oO0.OooO0o0;
        this.OooO0o = c1425oo00oO0.OooO0o;
        this.OooO0oO = c1425oo00oO0.OooO0oO;
        this.OooO0oo = c1425oo00oO0.OooO0oo;
        this.OooO = c1425oo00oO0.OooO;
        String str = c1425oo00oO0.OooOO0o;
        this.OooOO0o = str;
        this.OooOO0O = c1425oo00oO0.OooOO0O;
        if (str != null) {
            c0145o00OO0oO.put(str, this);
        }
        matrix.set(c1425oo00oO0.OooOO0);
        ArrayList arrayList = c1425oo00oO0.OooO0O0;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = (Object) arrayList.get(i);
            if (obj instanceof C1425oo00oO0) {
                this.OooO0O0.add(new C1425oo00oO0((C1425oo00oO0) obj, c0145o00OO0oO));
            } else {
                if (obj instanceof C1422oo00o00O) {
                    C1422oo00o00O c1422oo00o00O = (C1422oo00o00O) obj;
                    C1422oo00o00O abstractC1427oo00oO0o2 = new C1422oo00o00O();
                    abstractC1427oo00oO0o2.OooO0o = 0.0f;
                    abstractC1427oo00oO0o2.OooO0oo = 1.0f;
                    abstractC1427oo00oO0o2.OooO = 1.0f;
                    abstractC1427oo00oO0o2.OooOO0 = 0.0f;
                    abstractC1427oo00oO0o2.OooOO0O = 1.0f;
                    abstractC1427oo00oO0o2.OooOO0o = 0.0f;
                    abstractC1427oo00oO0o2.OooOOO0 = Paint.Cap.BUTT;
                    abstractC1427oo00oO0o2.OooOOO = Paint.Join.MITER;
                    abstractC1427oo00oO0o2.OooOOOO = 4.0f;
                    abstractC1427oo00oO0o2.OooO0o0 = c1422oo00o00O.OooO0o0;
                    abstractC1427oo00oO0o2.OooO0o = c1422oo00o00O.OooO0o;
                    abstractC1427oo00oO0o2.OooO0oo = c1422oo00o00O.OooO0oo;
                    abstractC1427oo00oO0o2.OooO0oO = c1422oo00o00O.OooO0oO;
                    abstractC1427oo00oO0o2.OooO0OO = c1422oo00o00O.OooO0OO;
                    abstractC1427oo00oO0o2.OooO = c1422oo00o00O.OooO;
                    abstractC1427oo00oO0o2.OooOO0 = c1422oo00o00O.OooOO0;
                    abstractC1427oo00oO0o2.OooOO0O = c1422oo00o00O.OooOO0O;
                    abstractC1427oo00oO0o2.OooOO0o = c1422oo00o00O.OooOO0o;
                    abstractC1427oo00oO0o2.OooOOO0 = c1422oo00o00O.OooOOO0;
                    abstractC1427oo00oO0o2.OooOOO = c1422oo00o00O.OooOOO;
                    abstractC1427oo00oO0o2.OooOOOO = c1422oo00o00O.OooOOOO;
                    abstractC1427oo00oO0o = abstractC1427oo00oO0o2;
                } else if (!(obj instanceof C1423oo00o0o0)) {
                    throw new IllegalStateException("Unknown object in the tree!");
                } else {
                    abstractC1427oo00oO0o = new C1423oo00o0o0();
                }
                this.OooO0O0.add(abstractC1427oo00oO0o);
                Object obj2 = abstractC1427oo00oO0o.OooO0O0;
                if (obj2 != null) {
                    c0145o00OO0oO.put(obj2, abstractC1427oo00oO0o);
                }
            }
        }
    }
}





