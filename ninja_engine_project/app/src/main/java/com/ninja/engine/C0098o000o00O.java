package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o000o00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098o000o00O extends AbstractC1473oo0O0o0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0098o000o00O(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO00o() {
        Object obj = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                RunnableC0095o000Oooo runnableC0095o000Oooo = (RunnableC0095o000Oooo) obj;
                runnableC0095o000Oooo.OooO0O0.OooOo0O.setAlpha(1.0f);
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = runnableC0095o000Oooo.OooO0O0;
                layoutInflater$Factory2C0109o000oOoo.OooOoO0.OooO0Oo(null);
                layoutInflater$Factory2C0109o000oOoo.OooOoO0 = null;
                return;
            case 1:
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo2 = (LayoutInflater$Factory2C0109o000oOoo) obj;
                layoutInflater$Factory2C0109o000oOoo2.OooOo0O.setAlpha(1.0f);
                layoutInflater$Factory2C0109o000oOoo2.OooOoO0.OooO0Oo(null);
                layoutInflater$Factory2C0109o000oOoo2.OooOoO0 = null;
                return;
            default:
                C0415o0Oo0O0O c0415o0Oo0O0O = (C0415o0Oo0O0O) obj;
                ((LayoutInflater$Factory2C0109o000oOoo) c0415o0Oo0O0O.OooO0OO).OooOo0O.setVisibility(8);
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo3 = (LayoutInflater$Factory2C0109o000oOoo) c0415o0Oo0O0O.OooO0OO;
                PopupWindow popupWindow = layoutInflater$Factory2C0109o000oOoo3.OooOo0o;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0109o000oOoo3.OooOo0O.getParent() instanceof View) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    AbstractC1449oo0O000.OooO0OO((View) layoutInflater$Factory2C0109o000oOoo3.OooOo0O.getParent());
                }
                layoutInflater$Factory2C0109o000oOoo3.OooOo0O.OooO0o0();
                layoutInflater$Factory2C0109o000oOoo3.OooOoO0.OooO0Oo(null);
                layoutInflater$Factory2C0109o000oOoo3.OooOoO0 = null;
                ViewGroup viewGroup = layoutInflater$Factory2C0109o000oOoo3.OooOoOO;
                WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
                AbstractC1449oo0O000.OooO0OO(viewGroup);
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC1473oo0O0o0, com.ninja.engine.InterfaceC1474oo0O0o00
    public void OooO0OO() {
        Object obj = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                ((RunnableC0095o000Oooo) obj).OooO0O0.OooOo0O.setVisibility(0);
                return;
            case 1:
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) obj;
                layoutInflater$Factory2C0109o000oOoo.OooOo0O.setVisibility(0);
                if (layoutInflater$Factory2C0109o000oOoo.OooOo0O.getParent() instanceof View) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    AbstractC1449oo0O000.OooO0OO((View) layoutInflater$Factory2C0109o000oOoo.OooOo0O.getParent());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
