package com.ninja.engine;

import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.o0o0O0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537o0o0O0oo extends AbstractC1071oOOo0o0 {
    public final /* synthetic */ oO0OO OooO00o;

    public C0537o0o0O0oo(oO0OO oo0oo) {
        this.OooO00o = oo0oo;
    }

    @Override // com.ninja.engine.AbstractC1071oOOo0o0
    public final void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        oO0OO oo0oo = this.OooO00o;
        int computeVerticalScrollRange = oo0oo.OooOOoo.computeVerticalScrollRange();
        int i3 = oo0oo.OooOOo;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = oo0oo.OooO00o;
        if (i4 > 0 && i3 >= i5) {
            z = true;
        } else {
            z = false;
        }
        oo0oo.OooOo00 = z;
        int computeHorizontalScrollRange = oo0oo.OooOOoo.computeHorizontalScrollRange();
        int i6 = oo0oo.OooOOo0;
        if (computeHorizontalScrollRange - i6 > 0 && i6 >= i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        oo0oo.OooOo0 = z2;
        boolean z3 = oo0oo.OooOo00;
        if (!z3 && !z2) {
            if (oo0oo.OooOo0O != 0) {
                oo0oo.OooO0o(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            oo0oo.OooOO0o = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            oo0oo.OooOO0O = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (oo0oo.OooOo0) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i6;
            oo0oo.OooOOOO = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            oo0oo.OooOOO = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = oo0oo.OooOo0O;
        if (i7 == 0 || i7 == 1) {
            oo0oo.OooO0o(1);
        }
    }
}
