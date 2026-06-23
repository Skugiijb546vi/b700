package com.ninja.engine;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOOo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059oOOo0O extends Observable {
    public final boolean OooO00o() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void OooO0O0() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((C1074oOOo0oO) ((Observable) this).mObservers.get(size)).OooO00o;
            recyclerView.OooO(null);
            recyclerView.Ooooo00.OooO0o = true;
            recyclerView.OoooOO0(true);
            if (!recyclerView.OooO0Oo.OooOO0()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void OooO0OO(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1074oOOo0oO c1074oOOo0oO = (C1074oOOo0oO) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1074oOOo0oO.OooO00o;
            recyclerView.OooO(null);
            o0000OO0 o0000oo0 = recyclerView.OooO0Oo;
            ArrayList arrayList = (ArrayList) o0000oo0.OooO0OO;
            arrayList.add(o0000oo0.OooOO0o(null, 4, i, 1));
            o0000oo0.OooO00o |= 4;
            if (arrayList.size() == 1) {
                c1074oOOo0oO.OooO00o();
            }
        }
    }

    public final void OooO0Oo(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1074oOOo0oO c1074oOOo0oO = (C1074oOOo0oO) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1074oOOo0oO.OooO00o;
            recyclerView.OooO(null);
            o0000OO0 o0000oo0 = recyclerView.OooO0Oo;
            ArrayList arrayList = (ArrayList) o0000oo0.OooO0OO;
            arrayList.add(o0000oo0.OooOO0o(null, 1, i, 1));
            o0000oo0.OooO00o |= 1;
            if (arrayList.size() == 1) {
                c1074oOOo0oO.OooO00o();
            }
        }
    }

    public final void OooO0o0(int i) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1074oOOo0oO c1074oOOo0oO = (C1074oOOo0oO) ((Observable) this).mObservers.get(size);
            RecyclerView recyclerView = c1074oOOo0oO.OooO00o;
            recyclerView.OooO(null);
            o0000OO0 o0000oo0 = recyclerView.OooO0Oo;
            ArrayList arrayList = (ArrayList) o0000oo0.OooO0OO;
            arrayList.add(o0000oo0.OooOO0o(null, 2, i, 1));
            o0000oo0.OooO00o |= 2;
            if (arrayList.size() == 1) {
                c1074oOOo0oO.OooO00o();
            }
        }
    }
}
