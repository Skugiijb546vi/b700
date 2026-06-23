package com.ninja.engine;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oo0O0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471oo0O0Ooo {
    public Interpolator OooO0OO;
    public InterfaceC1474oo0O0o00 OooO0Oo;
    public boolean OooO0o0;
    public long OooO0O0 = -1;
    public final C1338oOoooO0o OooO0o = new C1338oOoooO0o(this);
    public final ArrayList OooO00o = new ArrayList();

    public final void OooO00o() {
        if (!this.OooO0o0) {
            return;
        }
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            ((C1470oo0O0OoO) it.next()).OooO0O0();
        }
        this.OooO0o0 = false;
    }

    public final void OooO0O0() {
        View view;
        if (this.OooO0o0) {
            return;
        }
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            C1470oo0O0OoO c1470oo0O0OoO = (C1470oo0O0OoO) it.next();
            long j = this.OooO0O0;
            if (j >= 0) {
                c1470oo0O0OoO.OooO0OO(j);
            }
            Interpolator interpolator = this.OooO0OO;
            if (interpolator != null && (view = (View) c1470oo0O0OoO.OooO00o.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.OooO0Oo != null) {
                c1470oo0O0OoO.OooO0Oo(this.OooO0o);
            }
            View view2 = (View) c1470oo0O0OoO.OooO00o.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.OooO0o0 = true;
    }
}


