package com.ninja.engine;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0oo0O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0620o0oo0O0O implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ ArrayList OooO0O0;
    public final /* synthetic */ ArrayList OooO0OO;
    public final /* synthetic */ ArrayList OooO0Oo;
    public final /* synthetic */ ArrayList OooO0o0;

    public RunnableC0620o0oo0O0O(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.OooO00o = i;
        this.OooO0O0 = arrayList;
        this.OooO0OO = arrayList2;
        this.OooO0Oo = arrayList3;
        this.OooO0o0 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.OooO00o; i++) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            AbstractC1452oo0O000o.OooOOO((View) this.OooO0O0.get(i), (String) this.OooO0OO.get(i));
            AbstractC1452oo0O000o.OooOOO((View) this.OooO0Oo.get(i), (String) this.OooO0o0.get(i));
        }
    }
}


