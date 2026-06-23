package com.ninja.engine;

import android.view.View;
import java.util.List;
/* renamed from: com.ninja.engine.oO0O0ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767oO0O0ooo {
    public int OooO;
    public boolean OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public List OooOO0O;
    public boolean OooOO0o;

    public final void OooO00o(View view) {
        int OooO0Oo;
        int OooO0Oo2;
        int size = this.OooOO0O.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC1083oOOoO0o) this.OooOO0O.get(i2)).OooO00o;
            C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view3.getLayoutParams();
            if (view3 != view && !c1068oOOo0OoO.OooO00o.OooOO0O() && (OooO0Oo2 = (c1068oOOo0OoO.OooO00o.OooO0Oo() - this.OooO0Oo) * this.OooO0o0) >= 0 && OooO0Oo2 < i) {
                view2 = view3;
                if (OooO0Oo2 == 0) {
                    break;
                }
                i = OooO0Oo2;
            }
        }
        if (view2 == null) {
            OooO0Oo = -1;
        } else {
            OooO0Oo = ((C1068oOOo0OoO) view2.getLayoutParams()).OooO00o.OooO0Oo();
        }
        this.OooO0Oo = OooO0Oo;
    }

    public final View OooO0O0(C1070oOOo0o c1070oOOo0o) {
        List list = this.OooOO0O;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((AbstractC1083oOOoO0o) this.OooOO0O.get(i)).OooO00o;
                C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
                if (!c1068oOOo0OoO.OooO00o.OooOO0O() && this.OooO0Oo == c1068oOOo0OoO.OooO00o.OooO0Oo()) {
                    OooO00o(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = c1070oOOo0o.OooO(this.OooO0Oo, Long.MAX_VALUE).OooO00o;
        this.OooO0Oo += this.OooO0o0;
        return view2;
    }
}
