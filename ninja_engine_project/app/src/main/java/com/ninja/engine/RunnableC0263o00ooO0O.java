package com.ninja.engine;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.ninja.engine.o00ooO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0263o00ooO0O implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final int OooO0O0;
    public final Object OooO0OO;

    public /* synthetic */ RunnableC0263o00ooO0O(int i, int i2, Object obj) {
        this.OooO00o = i2;
        this.OooO0OO = obj;
        this.OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo;
        switch (this.OooO00o) {
            case 0:
                AbstractC1137oOOoooO abstractC1137oOOoooO = (AbstractC1137oOOoooO) ((C1275oOoo0OoO) this.OooO0OO).OooO00o;
                if (abstractC1137oOOoooO != null) {
                    abstractC1137oOOoooO.OooOO0(this.OooO0O0);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.OooO0OO;
                int size = arrayList.size();
                int i = 0;
                if (this.OooO0O0 != 1) {
                    while (i < size) {
                        ((AbstractC0468o0Ooo000) arrayList.get(i)).getClass();
                        i++;
                    }
                    return;
                }
                while (i < size) {
                    ((AbstractC0468o0Ooo000) arrayList.get(i)).OooO00o();
                    i++;
                }
                return;
            case 2:
                RecyclerView recyclerView = ((C0863oO0oOOoo) this.OooO0OO).Ooooo00;
                if (!recyclerView.OooOo0O && (abstractC1066oOOo0Oo = recyclerView.OooOOO0) != null) {
                    abstractC1066oOOo0Oo.o0Oo0oo(recyclerView, this.OooO0O0);
                    return;
                }
                return;
            default:
                ((AbstractC0921oOO00ooO) this.OooO0OO).OooOO0(this.OooO0O0);
                return;
        }
    }

    public RunnableC0263o00ooO0O(List list, int i, Throwable th) {
        this.OooO00o = 1;
        AbstractC0809oO0OooOO.OooOOO(list, "initCallbacks cannot be null");
        this.OooO0OO = new ArrayList(list);
        this.OooO0O0 = i;
    }
}
