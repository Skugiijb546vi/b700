package com.ninja.engine;

import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.o0O0oooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0340o0O0oooO implements InterfaceC1292oOooO00O {
    public final int OooO00o;
    public final int OooO0O0;
    public InterfaceC1098oOOoOo00 OooO0OO;

    public AbstractC0340o0O0oooO() {
        if (AbstractC1401oo00OOO0.OooO(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.OooO00o = Integer.MIN_VALUE;
            this.OooO0O0 = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0OO(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        this.OooO0OO = interfaceC1098oOOoOo00;
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final InterfaceC1098oOOoOo00 OooO0o() {
        return this.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0o0(InterfaceC1334oOooo0oo interfaceC1334oOooo0oo) {
        ((C1220oOoOOooO) interfaceC1334oOooo0oo).OooOO0o(this.OooO00o, this.OooO0O0);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO(InterfaceC1334oOooo0oo interfaceC1334oOooo0oo) {
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public void OooO00o(Drawable drawable) {
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0Oo(Drawable drawable) {
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooO0O0() {
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooOO0() {
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooOO0O() {
    }
}


