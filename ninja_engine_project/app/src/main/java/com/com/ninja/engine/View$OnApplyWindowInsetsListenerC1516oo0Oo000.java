package com.ninja.engine;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
/* renamed from: com.ninja.engine.oo0Oo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnApplyWindowInsetsListenerC1516oo0Oo000 implements View.OnApplyWindowInsetsListener {
    public final C0303o0O0Oo0o OooO00o;
    public C1536oo0OoOoO OooO0O0;

    public View$OnApplyWindowInsetsListenerC1516oo0Oo000(View view, C0303o0O0Oo0o c0303o0O0Oo0o) {
        C1536oo0OoOoO c1536oo0OoOoO;
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        this.OooO00o = c0303o0O0Oo0o;
        C1536oo0OoOoO OooO0oo = AbstractC1460oo0O00oo.OooO0oo(view);
        if (OooO0oo != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                c1523oo0Oo0o0 = new C1525oo0Oo0oo(OooO0oo);
            } else if (i >= 29) {
                c1523oo0Oo0o0 = new C1524oo0Oo0oO(OooO0oo);
            } else {
                c1523oo0Oo0o0 = new C1523oo0Oo0o0(OooO0oo);
            }
            c1536oo0OoOoO = c1523oo0Oo0o0.OooO0O0();
        } else {
            c1536oo0OoOoO = null;
        }
        this.OooO0O0 = c1536oo0OoOoO;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1533oo0OoOOo c1533oo0OoOOo;
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.OooO0O0 = C1536oo0OoOoO.OooO0oO(view, windowInsets);
            return C1515oo0Oo00.OooO(view, windowInsets);
        }
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(view, windowInsets);
        if (this.OooO0O0 == null) {
            this.OooO0O0 = AbstractC1460oo0O00oo.OooO0oo(view);
        }
        if (this.OooO0O0 == null) {
            this.OooO0O0 = OooO0oO;
            return C1515oo0Oo00.OooO(view, windowInsets);
        }
        C0303o0O0Oo0o OooOO0 = C1515oo0Oo00.OooOO0(view);
        if (OooOO0 != null && Objects.equals((WindowInsets) OooOO0.OooO0OO, windowInsets)) {
            return C1515oo0Oo00.OooO(view, windowInsets);
        }
        C1536oo0OoOoO c1536oo0OoOoO = this.OooO0O0;
        int i = 0;
        int i2 = 1;
        while (true) {
            c1533oo0OoOOo = OooO0oO.OooO00o;
            if (i2 > 256) {
                break;
            }
            if (!c1533oo0OoOOo.OooO0o(i2).equals(c1536oo0OoOoO.OooO00o.OooO0o(i2))) {
                i |= i2;
            }
            i2 <<= 1;
        }
        if (i == 0) {
            return C1515oo0Oo00.OooO(view, windowInsets);
        }
        C1536oo0OoOoO c1536oo0OoOoO2 = this.OooO0O0;
        if ((i & 8) != 0) {
            if (c1533oo0OoOOo.OooO0o(8).OooO0Oo > c1536oo0OoOoO2.OooO00o.OooO0o(8).OooO0Oo) {
                interpolator = C1515oo0Oo00.OooO0o0;
            } else {
                interpolator = C1515oo0Oo00.OooO0o;
            }
        } else {
            interpolator = C1515oo0Oo00.OooO0oO;
        }
        C1520oo0Oo0OO c1520oo0Oo0OO = new C1520oo0Oo0OO(i, interpolator, 160L);
        c1520oo0Oo0OO.OooO00o.OooO0Oo(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1520oo0Oo0OO.OooO00o.OooO00o());
        C0724oO00OooO OooO0o = c1533oo0OoOOo.OooO0o(i);
        C0724oO00OooO OooO0o2 = c1536oo0OoOoO2.OooO00o.OooO0o(i);
        int min = Math.min(OooO0o.OooO00o, OooO0o2.OooO00o);
        int i3 = OooO0o.OooO0O0;
        int i4 = OooO0o2.OooO0O0;
        int min2 = Math.min(i3, i4);
        int i5 = OooO0o.OooO0OO;
        int i6 = OooO0o2.OooO0OO;
        int min3 = Math.min(i5, i6);
        int i7 = OooO0o.OooO0Oo;
        int i8 = i;
        int i9 = OooO0o2.OooO0Oo;
        C1126oOOooOO c1126oOOooOO = new C1126oOOooOO(C0724oO00OooO.OooO0O0(min, min2, min3, Math.min(i7, i9)), 8, C0724oO00OooO.OooO0O0(Math.max(OooO0o.OooO00o, OooO0o2.OooO00o), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C1515oo0Oo00.OooO0o(view, windowInsets, false);
        duration.addUpdateListener(new C1512oo0OOooo(c1520oo0Oo0OO, OooO0oO, c1536oo0OoOoO2, i8, view));
        duration.addListener(new C1353oo0000O(c1520oo0Oo0OO, view));
        oOOO00.OooO00o(view, new RunnableC0064o0000Oo(view, c1520oo0Oo0OO, c1126oOOooOO, duration));
        this.OooO0O0 = OooO0oO;
        return C1515oo0Oo00.OooO(view, windowInsets);
    }
}
