package com.ninja.engine;

import android.graphics.Insets;
import android.view.WindowInsets;
/* renamed from: com.ninja.engine.oo0OoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1530oo0OoOO extends C1529oo0OoO0o {
    public C0724oO00OooO OooOOO;
    public C0724oO00OooO OooOOOO;
    public C0724oO00OooO OooOOOo;

    public C1530oo0OoOO(C1536oo0OoOoO c1536oo0OoOoO, WindowInsets windowInsets) {
        super(c1536oo0OoOoO, windowInsets);
        this.OooOOO = null;
        this.OooOOOO = null;
        this.OooOOOo = null;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C0724oO00OooO OooO() {
        Insets systemGestureInsets;
        if (this.OooOOO == null) {
            systemGestureInsets = this.OooO0OO.getSystemGestureInsets();
            this.OooOOO = C0724oO00OooO.OooO0OO(systemGestureInsets);
        }
        return this.OooOOO;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C0724oO00OooO OooO0oO() {
        Insets mandatorySystemGestureInsets;
        if (this.OooOOOO == null) {
            mandatorySystemGestureInsets = this.OooO0OO.getMandatorySystemGestureInsets();
            this.OooOOOO = C0724oO00OooO.OooO0OO(mandatorySystemGestureInsets);
        }
        return this.OooOOOO;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C0724oO00OooO OooOO0O() {
        Insets tappableElementInsets;
        if (this.OooOOOo == null) {
            tappableElementInsets = this.OooO0OO.getTappableElementInsets();
            this.OooOOOo = C0724oO00OooO.OooO0OO(tappableElementInsets);
        }
        return this.OooOOOo;
    }

    @Override // com.ninja.engine.AbstractC1528oo0OoO00, com.ninja.engine.C1533oo0OoOOo
    public C1536oo0OoOoO OooOO0o(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.OooO0OO.inset(i, i2, i3, i4);
        return C1536oo0OoOoO.OooO0oO(null, inset);
    }

    @Override // com.ninja.engine.C1527oo0OoO0, com.ninja.engine.C1533oo0OoOOo
    public void OooOOo0(C0724oO00OooO c0724oO00OooO) {
    }
}


