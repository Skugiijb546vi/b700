package com.ninja.engine;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: com.ninja.engine.oo0O0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1469oo0O0Oo0 extends AbstractC0326o0O0oOOO {
    public C0671o0ooo0O OooO00o;
    public int OooO0O0 = 0;

    public AbstractC1469oo0O0Oo0() {
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.ninja.engine.o0ooo0O, java.lang.Object] */
    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOo0O(coordinatorLayout, view, i);
        if (this.OooO00o == null) {
            Object obj = new Object();
            obj.OooO0Oo = view;
            this.OooO00o = obj;
        }
        C0671o0ooo0O c0671o0ooo0O = this.OooO00o;
        View view2 = (View) c0671o0ooo0O.OooO0Oo;
        c0671o0ooo0O.OooO00o = view2.getTop();
        c0671o0ooo0O.OooO0O0 = view2.getLeft();
        this.OooO00o.OooO0O0();
        int i2 = this.OooO0O0;
        if (i2 != 0) {
            C0671o0ooo0O c0671o0ooo0O2 = this.OooO00o;
            if (c0671o0ooo0O2.OooO0OO != i2) {
                c0671o0ooo0O2.OooO0OO = i2;
                c0671o0ooo0O2.OooO0O0();
            }
            this.OooO0O0 = 0;
            return true;
        }
        return true;
    }

    public void OooOo0O(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.OooOOOo(view, i);
    }

    public AbstractC1469oo0O0Oo0(int i) {
    }
}

