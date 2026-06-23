package com.ninja.engine;

import android.view.View;
/* renamed from: com.ninja.engine.ooOOO00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1777ooOOO00O {
    public AbstractC0462o0OoOoo OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;

    public C1777ooOOO00O() {
        OooO0Oo();
    }

    public final void OooO00o() {
        int OooOO0O;
        if (this.OooO0Oo) {
            OooOO0O = this.OooO00o.OooO0oO();
        } else {
            OooOO0O = this.OooO00o.OooOO0O();
        }
        this.OooO0OO = OooOO0O;
    }

    public final void OooO0O0(View view, int i) {
        if (this.OooO0Oo) {
            this.OooO0OO = this.OooO00o.OooOOO0() + this.OooO00o.OooO0O0(view);
        } else {
            this.OooO0OO = this.OooO00o.OooO0o0(view);
        }
        this.OooO0O0 = i;
    }

    public final void OooO0OO(View view, int i) {
        int min;
        int OooOOO0 = this.OooO00o.OooOOO0();
        if (OooOOO0 >= 0) {
            OooO0O0(view, i);
            return;
        }
        this.OooO0O0 = i;
        if (this.OooO0Oo) {
            int OooO0oO = (this.OooO00o.OooO0oO() - OooOOO0) - this.OooO00o.OooO0O0(view);
            this.OooO0OO = this.OooO00o.OooO0oO() - OooO0oO;
            if (OooO0oO > 0) {
                int OooO0OO = this.OooO0OO - this.OooO00o.OooO0OO(view);
                int OooOO0O = this.OooO00o.OooOO0O();
                int min2 = OooO0OO - (Math.min(this.OooO00o.OooO0o0(view) - OooOO0O, 0) + OooOO0O);
                if (min2 < 0) {
                    min = Math.min(OooO0oO, -min2) + this.OooO0OO;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int OooO0o0 = this.OooO00o.OooO0o0(view);
            int OooOO0O2 = OooO0o0 - this.OooO00o.OooOO0O();
            this.OooO0OO = OooO0o0;
            if (OooOO0O2 > 0) {
                int OooO0oO2 = (this.OooO00o.OooO0oO() - Math.min(0, (this.OooO00o.OooO0oO() - OooOOO0) - this.OooO00o.OooO0O0(view))) - (this.OooO00o.OooO0OO(view) + OooO0o0);
                if (OooO0oO2 < 0) {
                    min = this.OooO0OO - Math.min(OooOO0O2, -OooO0oO2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.OooO0OO = min;
    }

    public final void OooO0Oo() {
        this.OooO0O0 = -1;
        this.OooO0OO = Integer.MIN_VALUE;
        this.OooO0Oo = false;
        this.OooO0o0 = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.OooO0O0 + ", mCoordinate=" + this.OooO0OO + ", mLayoutFromEnd=" + this.OooO0Oo + ", mValid=" + this.OooO0o0 + '}';
    }
}


