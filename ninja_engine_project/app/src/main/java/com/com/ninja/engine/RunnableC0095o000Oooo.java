package com.ninja.engine;

import android.view.ViewGroup;
/* renamed from: com.ninja.engine.o000Oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0095o000Oooo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ LayoutInflater$Factory2C0109o000oOoo OooO0O0;

    public /* synthetic */ RunnableC0095o000Oooo(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = layoutInflater$Factory2C0109o000oOoo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        switch (this.OooO00o) {
            case 0:
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO0O0;
                if ((layoutInflater$Factory2C0109o000oOoo.OoooOoO & 1) != 0) {
                    layoutInflater$Factory2C0109o000oOoo.OooOOoo(0);
                }
                if ((layoutInflater$Factory2C0109o000oOoo.OoooOoO & 4096) != 0) {
                    layoutInflater$Factory2C0109o000oOoo.OooOOoo(108);
                }
                layoutInflater$Factory2C0109o000oOoo.OoooOo0 = false;
                layoutInflater$Factory2C0109o000oOoo.OoooOoO = 0;
                return;
            default:
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo2 = this.OooO0O0;
                layoutInflater$Factory2C0109o000oOoo2.OooOo0o.showAtLocation(layoutInflater$Factory2C0109o000oOoo2.OooOo0O, 55, 0, 0);
                C1470oo0O0OoO c1470oo0O0OoO = layoutInflater$Factory2C0109o000oOoo2.OooOoO0;
                if (c1470oo0O0OoO != null) {
                    c1470oo0O0OoO.OooO0O0();
                }
                if (layoutInflater$Factory2C0109o000oOoo2.OooOoO && (viewGroup = layoutInflater$Factory2C0109o000oOoo2.OooOoOO) != null && viewGroup.isLaidOut()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    layoutInflater$Factory2C0109o000oOoo2.OooOo0O.setAlpha(0.0f);
                    C1470oo0O0OoO OooO00o = AbstractC1460oo0O00oo.OooO00o(layoutInflater$Factory2C0109o000oOoo2.OooOo0O);
                    OooO00o.OooO00o(1.0f);
                    layoutInflater$Factory2C0109o000oOoo2.OooOoO0 = OooO00o;
                    OooO00o.OooO0Oo(new C0098o000o00O(0, this));
                    return;
                }
                layoutInflater$Factory2C0109o000oOoo2.OooOo0O.setAlpha(1.0f);
                layoutInflater$Factory2C0109o000oOoo2.OooOo0O.setVisibility(0);
                return;
        }
    }
}
