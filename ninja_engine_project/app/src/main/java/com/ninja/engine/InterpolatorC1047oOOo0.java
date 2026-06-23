package com.ninja.engine;

import android.view.animation.Interpolator;
/* renamed from: com.ninja.engine.oOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC1047oOOo0 implements Interpolator {
    public final /* synthetic */ int OooO00o;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.OooO00o) {
            case 0:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            default:
                float f3 = f - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }
}

