package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOOo0OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1064oOOo0OOO {
    public C1060oOOo0O0 OooO00o;
    public ArrayList OooO0O0;
    public long OooO0OO;
    public long OooO0Oo;
    public long OooO0o;
    public long OooO0o0;

    public static void OooO0O0(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        int i = abstractC1083oOOoO0o.OooOO0;
        if (!abstractC1083oOOoO0o.OooO() && (i & 4) == 0) {
            abstractC1083oOOoO0o.OooO0OO();
        }
    }

    public abstract boolean OooO00o(AbstractC1083oOOoO0o abstractC1083oOOoO0o, AbstractC1083oOOoO0o abstractC1083oOOoO0o2, oOO0OOO ooo0ooo, oOO0OOO ooo0ooo2);

    public final void OooO0OO(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        C1060oOOo0O0 c1060oOOo0O0 = this.OooO00o;
        if (c1060oOOo0O0 != null) {
            boolean z = true;
            abstractC1083oOOoO0o.OooOOo0(true);
            if (abstractC1083oOOoO0o.OooO0oo != null && abstractC1083oOOoO0o.OooO == null) {
                abstractC1083oOOoO0o.OooO0oo = null;
            }
            abstractC1083oOOoO0o.OooO = null;
            if ((abstractC1083oOOoO0o.OooOO0 & 16) == 0) {
                RecyclerView recyclerView = c1060oOOo0O0.OooO00o;
                recyclerView.Ooooo0o();
                C0131o00O0o c0131o00O0o = recyclerView.OooO0o0;
                C1060oOOo0O0 c1060oOOo0O02 = (C1060oOOo0O0) c0131o00O0o.OooO0O0;
                RecyclerView recyclerView2 = c1060oOOo0O02.OooO00o;
                View view = abstractC1083oOOoO0o.OooO00o;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    c0131o00O0o.OoooO0(view);
                } else {
                    o0O000o0 o0o000o0 = (o0O000o0) c0131o00O0o.OooO0OO;
                    if (o0o000o0.OooO0Oo(indexOfChild)) {
                        o0o000o0.OooO0o(indexOfChild);
                        c0131o00O0o.OoooO0(view);
                        c1060oOOo0O02.OooO00o(indexOfChild);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
                    C1070oOOo0o c1070oOOo0o = recyclerView.OooO0O0;
                    c1070oOOo0o.OooOO0(Oooo0);
                    c1070oOOo0o.OooO0oO(Oooo0);
                }
                recyclerView.OooooO0(!z);
                if (!z && abstractC1083oOOoO0o.OooOOO0()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void OooO0Oo(AbstractC1083oOOoO0o abstractC1083oOOoO0o);

    public abstract boolean OooO0o();

    public abstract void OooO0o0();
}
