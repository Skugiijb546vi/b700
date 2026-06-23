package com.ninja.engine;

import android.view.View;
import android.widget.AdapterView;
/* renamed from: com.ninja.engine.o00O00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122o00O00Oo implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0122o00O00Oo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.OooO00o) {
            case 0:
                C0123o00O00o c0123o00O00o = (C0123o00O00o) this.OooO0O0;
                c0123o00O00o.Oooo00o.setSelection(i);
                if (c0123o00O00o.Oooo00o.getOnItemClickListener() != null) {
                    c0123o00O00o.Oooo00o.performItemClick(view, i, c0123o00O00o.OooOooo.getItemId(i));
                }
                c0123o00O00o.dismiss();
                return;
            default:
                View view2 = null;
                C0841oO0oO c0841oO0oO = (C0841oO0oO) this.OooO0O0;
                if (i < 0) {
                    C0781oO0OOoO c0781oO0OOoO = c0841oO0oO.OooO0o0;
                    if (!c0781oO0OOoO.OooOoO.isShowing()) {
                        item = null;
                    } else {
                        item = c0781oO0OOoO.OooO0OO.getSelectedItem();
                    }
                } else {
                    item = c0841oO0oO.getAdapter().getItem(i);
                }
                C0841oO0oO.OooO00o(c0841oO0oO, item);
                AdapterView.OnItemClickListener onItemClickListener = c0841oO0oO.getOnItemClickListener();
                C0781oO0OOoO c0781oO0OOoO2 = c0841oO0oO.OooO0o0;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (c0781oO0OOoO2.OooOoO.isShowing()) {
                            view2 = c0781oO0OOoO2.OooO0OO.getSelectedView();
                        }
                        view = view2;
                        if (!c0781oO0OOoO2.OooOoO.isShowing()) {
                            i = -1;
                        } else {
                            i = c0781oO0OOoO2.OooO0OO.getSelectedItemPosition();
                        }
                        if (!c0781oO0OOoO2.OooOoO.isShowing()) {
                            j = Long.MIN_VALUE;
                        } else {
                            j = c0781oO0OOoO2.OooO0OO.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(c0781oO0OOoO2.OooO0OO, view, i, j);
                }
                c0781oO0OOoO2.dismiss();
                return;
        }
    }
}


