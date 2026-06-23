package com.ninja.engine;

import android.view.WindowInsetsAnimation;
/* renamed from: com.ninja.engine.oo0Oo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518oo0Oo00o extends AbstractC1519oo0Oo0O0 {
    public final WindowInsetsAnimation OooO0o0;

    public C1518oo0Oo00o(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.OooO0o0 = windowInsetsAnimation;
    }

    @Override // com.ninja.engine.AbstractC1519oo0Oo0O0
    public final long OooO00o() {
        long durationMillis;
        durationMillis = this.OooO0o0.getDurationMillis();
        return durationMillis;
    }

    @Override // com.ninja.engine.AbstractC1519oo0Oo0O0
    public final float OooO0O0() {
        float interpolatedFraction;
        interpolatedFraction = this.OooO0o0.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // com.ninja.engine.AbstractC1519oo0Oo0O0
    public final int OooO0OO() {
        int typeMask;
        typeMask = this.OooO0o0.getTypeMask();
        return typeMask;
    }

    @Override // com.ninja.engine.AbstractC1519oo0Oo0O0
    public final void OooO0Oo(float f) {
        this.OooO0o0.setFraction(f);
    }
}


