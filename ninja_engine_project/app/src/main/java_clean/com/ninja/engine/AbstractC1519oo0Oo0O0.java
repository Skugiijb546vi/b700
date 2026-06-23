package com.ninja.engine;

import android.view.animation.Interpolator;
/* renamed from: com.ninja.engine.oo0Oo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1519oo0Oo0O0 {
    public final int OooO00o;
    public float OooO0O0;
    public final Interpolator OooO0OO;
    public final long OooO0Oo;

    public AbstractC1519oo0Oo0O0(int i, Interpolator interpolator, long j) {
        this.OooO00o = i;
        this.OooO0OO = interpolator;
        this.OooO0Oo = j;
    }

    public long OooO00o() {
        return this.OooO0Oo;
    }

    public float OooO0O0() {
        Interpolator interpolator = this.OooO0OO;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.OooO0O0);
        }
        return this.OooO0O0;
    }

    public int OooO0OO() {
        return this.OooO00o;
    }

    public void OooO0Oo(float f) {
        this.OooO0O0 = f;
    }
}


