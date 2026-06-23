package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.oOOOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001oOOOOO extends AbstractC1069oOOo0Ooo {
    public RecyclerView OooO00o;
    public final C1782ooOOO0o0 OooO0O0 = new C1782ooOOO0o0(this);
    public C0974oOOO00oO OooO0OO;
    public C0974oOOO00oO OooO0Oo;

    public static int OooO0O0(View view, AbstractC0462o0OoOoo abstractC0462o0OoOoo) {
        return ((abstractC0462o0OoOoo.OooO0OO(view) / 2) + abstractC0462o0OoOoo.OooO0o0(view)) - ((abstractC0462o0OoOoo.OooOO0o() / 2) + abstractC0462o0OoOoo.OooOO0O());
    }

    public static View OooO0OO(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, AbstractC0462o0OoOoo abstractC0462o0OoOoo) {
        int OooOo0O = abstractC1066oOOo0Oo.OooOo0O();
        View view = null;
        if (OooOo0O == 0) {
            return null;
        }
        int OooOO0o = (abstractC0462o0OoOoo.OooOO0o() / 2) + abstractC0462o0OoOoo.OooOO0O();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < OooOo0O; i2++) {
            View OooOo0 = abstractC1066oOOo0Oo.OooOo0(i2);
            int abs = Math.abs(((abstractC0462o0OoOoo.OooO0OO(OooOo0) / 2) + abstractC0462o0OoOoo.OooO0o0(OooOo0)) - OooOO0o);
            if (abs < i) {
                view = OooOo0;
                i = abs;
            }
        }
        return view;
    }

    public final int[] OooO00o(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, View view) {
        int[] iArr = new int[2];
        if (abstractC1066oOOo0Oo.OooO0Oo()) {
            iArr[0] = OooO0O0(view, OooO0Oo(abstractC1066oOOo0Oo));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1066oOOo0Oo.OooO0o0()) {
            iArr[1] = OooO0O0(view, OooO0o0(abstractC1066oOOo0Oo));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final AbstractC0462o0OoOoo OooO0Oo(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo) {
        C0974oOOO00oO c0974oOOO00oO = this.OooO0Oo;
        if (c0974oOOO00oO == null || ((AbstractC1066oOOo0Oo) c0974oOOO00oO.OooO0O0) != abstractC1066oOOo0Oo) {
            this.OooO0Oo = new C0974oOOO00oO(abstractC1066oOOo0Oo, 0);
        }
        return this.OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.OooO00o
            if (r0 != 0) goto L5
            return
        L5:
            com.ninja.engine.oOOo0Oo r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r1 = r0.OooO0o0()
            if (r1 == 0) goto L1b
            com.ninja.engine.o0OoOoo r1 = r5.OooO0o0(r0)
        L16:
            android.view.View r1 = OooO0OO(r0, r1)
            goto L27
        L1b:
            boolean r1 = r0.OooO0Oo()
            if (r1 == 0) goto L26
            com.ninja.engine.o0OoOoo r1 = r5.OooO0Oo(r0)
            goto L16
        L26:
            r1 = 0
        L27:
            if (r1 != 0) goto L2a
            return
        L2a:
            int[] r0 = r5.OooO00o(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L38
            r4 = r0[r3]
            if (r4 == 0) goto L3f
        L38:
            androidx.recyclerview.widget.RecyclerView r4 = r5.OooO00o
            r0 = r0[r3]
            r4.Ooooo00(r2, r0, r1)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1001oOOOOO.OooO0o():void");
    }

    public final AbstractC0462o0OoOoo OooO0o0(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo) {
        C0974oOOO00oO c0974oOOO00oO = this.OooO0OO;
        if (c0974oOOO00oO == null || ((AbstractC1066oOOo0Oo) c0974oOOO00oO.OooO0O0) != abstractC1066oOOo0Oo) {
            this.OooO0OO = new C0974oOOO00oO(abstractC1066oOOo0Oo, 1);
        }
        return this.OooO0OO;
    }
}
