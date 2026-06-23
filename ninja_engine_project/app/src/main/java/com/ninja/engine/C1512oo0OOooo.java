package com.ninja.engine;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
/* renamed from: com.ninja.engine.oo0OOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512oo0OOooo implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1520oo0Oo0OO OooO00o;
    public final /* synthetic */ C1536oo0OoOoO OooO0O0;
    public final /* synthetic */ C1536oo0OoOoO OooO0OO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ View OooO0o0;

    public C1512oo0OOooo(C1520oo0Oo0OO c1520oo0Oo0OO, C1536oo0OoOoO c1536oo0OoOoO, C1536oo0OoOoO c1536oo0OoOoO2, int i, View view) {
        this.OooO00o = c1520oo0Oo0OO;
        this.OooO0O0 = c1536oo0OoOoO;
        this.OooO0OO = c1536oo0OoOoO2;
        this.OooO0Oo = i;
        this.OooO0o0 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        float f;
        C1520oo0Oo0OO c1520oo0Oo0OO;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C1520oo0Oo0OO c1520oo0Oo0OO2 = this.OooO00o;
        c1520oo0Oo0OO2.OooO00o.OooO0Oo(animatedFraction);
        float OooO0O0 = c1520oo0Oo0OO2.OooO00o.OooO0O0();
        PathInterpolator pathInterpolator = C1515oo0Oo00.OooO0o0;
        int i = Build.VERSION.SDK_INT;
        C1536oo0OoOoO c1536oo0OoOoO = this.OooO0O0;
        if (i >= 30) {
            c1523oo0Oo0o0 = new C1525oo0Oo0oo(c1536oo0OoOoO);
        } else if (i >= 29) {
            c1523oo0Oo0o0 = new C1524oo0Oo0oO(c1536oo0OoOoO);
        } else {
            c1523oo0Oo0o0 = new C1523oo0Oo0o0(c1536oo0OoOoO);
        }
        int i2 = 1;
        while (i2 <= 256) {
            if ((this.OooO0Oo & i2) == 0) {
                c1523oo0Oo0o0.OooO0OO(i2, c1536oo0OoOoO.OooO00o.OooO0o(i2));
                f = OooO0O0;
                c1520oo0Oo0OO = c1520oo0Oo0OO2;
            } else {
                C0724oO00OooO OooO0o = c1536oo0OoOoO.OooO00o.OooO0o(i2);
                C0724oO00OooO OooO0o2 = this.OooO0OO.OooO00o.OooO0o(i2);
                float f2 = 1.0f - OooO0O0;
                f = OooO0O0;
                c1520oo0Oo0OO = c1520oo0Oo0OO2;
                c1523oo0Oo0o0.OooO0OO(i2, C1536oo0OoOoO.OooO0o0(OooO0o, (int) (((OooO0o.OooO00o - OooO0o2.OooO00o) * f2) + 0.5d), (int) (((OooO0o.OooO0O0 - OooO0o2.OooO0O0) * f2) + 0.5d), (int) (((OooO0o.OooO0OO - OooO0o2.OooO0OO) * f2) + 0.5d), (int) (((OooO0o.OooO0Oo - OooO0o2.OooO0Oo) * f2) + 0.5d)));
            }
            i2 <<= 1;
            OooO0O0 = f;
            c1520oo0Oo0OO2 = c1520oo0Oo0OO;
        }
        C1515oo0Oo00.OooO0oO(this.OooO0o0, c1523oo0Oo0o0.OooO0O0(), Collections.singletonList(c1520oo0Oo0OO2));
    }
}
