package com.ninja.engine;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public final class o00O00o0 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener OooO00o;
    public final /* synthetic */ C0123o00O00o OooO0O0;

    public o00O00o0(C0123o00O00o c0123o00O00o, o00O00 o00o00) {
        this.OooO0O0 = c0123o00O00o;
        this.OooO00o = o00o00;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.OooO0O0.Oooo00o.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.OooO00o);
        }
    }
}
