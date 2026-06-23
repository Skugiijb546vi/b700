package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* loaded from: classes.dex */
public final class oO0O0 extends AbstractC1091oOOoOOOO {
    public final /* synthetic */ int OooO0OO;
    public final SideSheetBehavior OooO0Oo;

    public /* synthetic */ oO0O0(SideSheetBehavior sideSheetBehavior, int i) {
        this.OooO0OO = i;
        this.OooO0Oo = sideSheetBehavior;
    }

    @Override public android.graphics.Typeface OooO0o(android.content.Context context, C0575o0oOo0[] c0575o0oOo0Arr, int i) { return null; }
    @Override public android.graphics.Typeface OooO0o0(android.content.Context context, C0573o0oOOooo c0573o0oOOooo, android.content.res.Resources resources, int i) { return null; }
    @Override public void OooOoO(int i) {}
    @Override public void OooOoOO(android.graphics.Typeface typeface, boolean z) {}

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.OooO0OO) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final float OooO0OO(int i) {
        switch (this.OooO0OO) {
            case 0:
                float OooOOO = OooOOO();
                return (i - OooOOO) / (OooOOO0() - OooOOO);
            default:
                float f = this.OooO0Oo.OooOOO0;
                return (f - i) / (f - OooOOO0());
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOOO() {
        switch (this.OooO0OO) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.OooO0Oo;
                return (-sideSheetBehavior.OooOO0o) - sideSheetBehavior.OooOOOO;
            default:
                return this.OooO0Oo.OooOOO0;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOOO0() {
        switch (this.OooO0OO) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.OooO0Oo;
                return Math.max(0, sideSheetBehavior.OooOOO + sideSheetBehavior.OooOOOO);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.OooO0Oo;
                return Math.max(0, (sideSheetBehavior2.OooOOO0 - sideSheetBehavior2.OooOO0o) - sideSheetBehavior2.OooOOOO);
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOOOO() {
        switch (this.OooO0OO) {
            case 0:
                return this.OooO0Oo.OooOOOO;
            default:
                return this.OooO0Oo.OooOOO0;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOOOo() {
        switch (this.OooO0OO) {
            case 0:
                return -this.OooO0Oo.OooOO0o;
            default:
                return OooOOO0();
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOOo(CoordinatorLayout coordinatorLayout) {
        switch (this.OooO0OO) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOOo0(View view) {
        switch (this.OooO0OO) {
            case 0:
                return view.getRight() + this.OooO0Oo.OooOOOO;
            default:
                return view.getLeft() - this.OooO0Oo.OooOOOO;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final boolean OooOo(View view) {
        switch (this.OooO0OO) {
            case 0:
                if (view.getRight() < (OooOOO0() - OooOOO()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (OooOOO0() + this.OooO0Oo.OooOOO0) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final int OooOo00() {
        switch (this.OooO0OO) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final boolean OooOo0O(float f) {
        switch (this.OooO0OO) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final boolean OooOoO0(float f, float f2) {
        switch (this.OooO0OO) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs = Math.abs(f);
                    this.OooO0Oo.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    float abs2 = Math.abs(f);
                    this.OooO0Oo.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final boolean Oooo000(View view, float f) {
        switch (this.OooO0OO) {
            case 0:
                if (Math.abs((f * this.OooO0Oo.OooOO0O) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f * this.OooO0Oo.OooOO0O) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void Oooo00O(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.OooO0OO) {
            case 0:
                if (i <= this.OooO0Oo.OooOOO0) {
                    marginLayoutParams.leftMargin = i2;
                    return;
                }
                return;
            default:
                int i3 = this.OooO0Oo.OooOOO0;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    return;
                }
                return;
        }
    }
}


