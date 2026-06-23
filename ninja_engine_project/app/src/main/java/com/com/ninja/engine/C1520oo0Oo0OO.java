package com.ninja.engine;

import android.os.Build;
import android.view.animation.Interpolator;
/* renamed from: com.ninja.engine.oo0Oo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520oo0Oo0OO {
    public AbstractC1519oo0Oo0O0 OooO00o;

    public C1520oo0Oo0OO(int i, Interpolator interpolator, long j) {
        AbstractC1519oo0Oo0O0 abstractC1519oo0Oo0O0;
        if (Build.VERSION.SDK_INT >= 30) {
            abstractC1519oo0Oo0O0 = new C1518oo0Oo00o(AbstractC0037Oooo0oO.OooOO0O(i, interpolator, j));
        } else {
            abstractC1519oo0Oo0O0 = new AbstractC1519oo0Oo0O0(i, interpolator, j);
        }
        this.OooO00o = abstractC1519oo0Oo0O0;
    }
}
