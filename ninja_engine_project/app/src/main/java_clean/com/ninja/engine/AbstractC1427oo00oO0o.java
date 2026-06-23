package com.ninja.engine;
/* renamed from: com.ninja.engine.oo00oO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1427oo00oO0o extends AbstractC1426oo00oO0O {
    public C0989oOOO0oo0[] OooO00o;
    public String OooO0O0;
    public int OooO0OO;
    public final int OooO0Oo;

    public AbstractC1427oo00oO0o() {
        this.OooO00o = null;
        this.OooO0OO = 0;
    }

    public C0989oOOO0oo0[] getPathData() {
        return this.OooO00o;
    }

    public String getPathName() {
        return this.OooO0O0;
    }

    public void setPathData(C0989oOOO0oo0[] c0989oOOO0oo0Arr) {
        if (!AbstractC0694o0ooooo0.OooO0o(this.OooO00o, c0989oOOO0oo0Arr)) {
            this.OooO00o = AbstractC0694o0ooooo0.OooOOo(c0989oOOO0oo0Arr);
            return;
        }
        C0989oOOO0oo0[] c0989oOOO0oo0Arr2 = this.OooO00o;
        for (int i = 0; i < c0989oOOO0oo0Arr.length; i++) {
            c0989oOOO0oo0Arr2[i].OooO00o = c0989oOOO0oo0Arr[i].OooO00o;
            int i2 = 0;
            while (true) {
                float[] fArr = c0989oOOO0oo0Arr[i].OooO0O0;
                if (i2 < fArr.length) {
                    c0989oOOO0oo0Arr2[i].OooO0O0[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC1427oo00oO0o(AbstractC1427oo00oO0o abstractC1427oo00oO0o) {
        this.OooO00o = null;
        this.OooO0OO = 0;
        this.OooO0O0 = abstractC1427oo00oO0o.OooO0O0;
        this.OooO0Oo = abstractC1427oo00oO0o.OooO0Oo;
        this.OooO00o = AbstractC0694o0ooooo0.OooOOo(abstractC1427oo00oO0o.OooO00o);
    }
}


