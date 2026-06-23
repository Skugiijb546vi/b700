package com.ninja.engine;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.ninja.engine.oOoo0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275oOoo0OoO implements InterfaceC0052OooooOO, InterfaceC0886oO0oo0o0 {
    public Object OooO00o;

    public /* synthetic */ C1275oOoo0OoO(Object obj) {
        this.OooO00o = obj;
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        Toolbar toolbar = (Toolbar) this.OooO00o;
        o000000 o000000Var = toolbar.OooO00o.OooOo00;
        if (o000000Var == null || !o000000Var.OooO0oO()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.Oooo00O.OooO0Oo).iterator();
            while (it.hasNext()) {
                ((C0599o0oOoo0O) it.next()).OooO00o.OooOOoo();
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC0052OooooOO
    public boolean OooO0O0(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.OooO00o;
        boolean z = false;
        if (!swipeDismissBehavior.OooOo0O(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i = swipeDismissBehavior.OooO0Oo;
        if ((i == 0 && z) || (i == 1 && !z)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        AbstractC1460oo0O00oo.OooOO0(view, width);
        view.setAlpha(0.0f);
        return true;
    }

    public void OooO0OO() {
        ((View) ((C1511oo0OOoo0) this.OooO00o).OooOo0o.getParent()).invalidate();
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public boolean OooOo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        ((Toolbar) this.OooO00o).getClass();
        return false;
    }
}


