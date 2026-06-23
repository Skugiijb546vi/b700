package com.ninja.engine;

import android.view.View;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.oo0O0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470oo0O0OoO {
    public final WeakReference OooO00o;

    public C1470oo0O0OoO(View view) {
        this.OooO00o = new WeakReference(view);
    }

    public final void OooO00o(float f) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void OooO0O0() {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void OooO0OO(long j) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void OooO0Oo(InterfaceC1474oo0O0o00 interfaceC1474oo0O0o00) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            if (interfaceC1474oo0O0o00 != null) {
                view.animate().setListener(new C0200o00o0O(interfaceC1474oo0O0o00, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void OooO0o(float f) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void OooO0o0(C1275oOoo0OoO c1275oOoo0OoO) {
        C0433o0Oo0ooo c0433o0Oo0ooo;
        View view = (View) this.OooO00o.get();
        if (view != null) {
            if (c1275oOoo0OoO != null) {
                c0433o0Oo0ooo = new C0433o0Oo0ooo(c1275oOoo0OoO, view);
            } else {
                c0433o0Oo0ooo = null;
            }
            view.animate().setUpdateListener(c0433o0Oo0ooo);
        }
    }
}
