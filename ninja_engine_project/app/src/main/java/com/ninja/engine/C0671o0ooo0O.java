package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* renamed from: com.ninja.engine.o0ooo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671o0ooo0O {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public Object OooO0Oo;

    public void OooO00o(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = this.OooO0OO;
                int i4 = i3 * 2;
                int[] iArr = (int[]) this.OooO0Oo;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.OooO0Oo = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 4];
                    this.OooO0Oo = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.OooO0Oo;
                iArr4[i4] = i;
                iArr4[i4 + 1] = i2;
                this.OooO0OO++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public void OooO0O0() {
        int i = this.OooO0OO;
        View view = (View) this.OooO0Oo;
        AbstractC1460oo0O00oo.OooOO0O(view, i - (view.getTop() - this.OooO00o));
        AbstractC1460oo0O00oo.OooOO0(view, 0 - (view.getLeft() - this.OooO0O0));
    }

    public void OooO0OO(RecyclerView recyclerView, boolean z) {
        this.OooO0OO = 0;
        int[] iArr = (int[]) this.OooO0Oo;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = recyclerView.OooOOO0;
        if (recyclerView.OooOO0o != null && abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO) {
            if (z) {
                if (!recyclerView.OooO0Oo.OooOO0()) {
                    abstractC1066oOOo0Oo.OooO(recyclerView.OooOO0o.OooO00o(), this);
                }
            } else if (!recyclerView.Oooo0OO()) {
                abstractC1066oOOo0Oo.OooO0oo(this.OooO00o, this.OooO0O0, recyclerView.Ooooo00, this);
            }
            int i = this.OooO0OO;
            if (i > abstractC1066oOOo0Oo.OooOO0) {
                abstractC1066oOOo0Oo.OooOO0 = i;
                abstractC1066oOOo0Oo.OooOO0O = z;
                recyclerView.OooO0O0.OooOO0O();
            }
        }
    }
}
