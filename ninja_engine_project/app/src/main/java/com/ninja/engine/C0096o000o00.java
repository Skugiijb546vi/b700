package com.ninja.engine;

import android.view.Window;
/* renamed from: com.ninja.engine.o000o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096o000o00 implements InterfaceC0333o0O0oo0O, InterfaceC0899oO0oooo {
    public final /* synthetic */ LayoutInflater$Factory2C0109o000oOoo OooO00o;

    public /* synthetic */ C0096o000o00(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo) {
        this.OooO00o = layoutInflater$Factory2C0109o000oOoo;
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        boolean z2;
        int i;
        C0107o000o0oo c0107o000o0oo;
        MenuC0887oO0oo0oo OooOO0O = menuC0887oO0oo0oo.OooOO0O();
        int i2 = 0;
        if (OooOO0O != menuC0887oO0oo0oo) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            menuC0887oO0oo0oo = OooOO0O;
        }
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO00o;
        C0107o000o0oo[] c0107o000o0ooArr = layoutInflater$Factory2C0109o000oOoo.Oooo0o0;
        if (c0107o000o0ooArr != null) {
            i = c0107o000o0ooArr.length;
        } else {
            i = 0;
        }
        while (true) {
            if (i2 < i) {
                c0107o000o0oo = c0107o000o0ooArr[i2];
                if (c0107o000o0oo != null && c0107o000o0oo.OooO0oo == menuC0887oO0oo0oo) {
                    break;
                }
                i2++;
            } else {
                c0107o000o0oo = null;
                break;
            }
        }
        if (c0107o000o0oo != null) {
            if (z2) {
                layoutInflater$Factory2C0109o000oOoo.OooOOO(c0107o000o0oo.OooO00o, c0107o000o0oo, OooOO0O);
                layoutInflater$Factory2C0109o000oOoo.OooOOOo(c0107o000o0oo, true);
                return;
            }
            layoutInflater$Factory2C0109o000oOoo.OooOOOo(c0107o000o0oo, z);
        }
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public boolean OooO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        Window.Callback callback;
        if (menuC0887oO0oo0oo == menuC0887oO0oo0oo.OooOO0O()) {
            LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO00o;
            if (layoutInflater$Factory2C0109o000oOoo.Oooo000 && (callback = layoutInflater$Factory2C0109o000oOoo.OooOO0o.getCallback()) != null && !layoutInflater$Factory2C0109o000oOoo.OoooO00) {
                callback.onMenuOpened(108, menuC0887oO0oo0oo);
                return true;
            }
            return true;
        }
        return true;
    }
}
