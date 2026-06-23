package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.ninja.engine.o0oOoOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC0590o0oOoOOO implements View.OnAttachStateChangeListener {
    public final /* synthetic */ androidx.fragment.app.OooO00o OooO00o;
    public final /* synthetic */ LayoutInflater$Factory2C0591o0oOoOOo OooO0O0;

    public View$OnAttachStateChangeListenerC0590o0oOoOOO(LayoutInflater$Factory2C0591o0oOoOOo layoutInflater$Factory2C0591o0oOoOOo, androidx.fragment.app.OooO00o oooO00o) {
        this.OooO0O0 = layoutInflater$Factory2C0591o0oOoOOo;
        this.OooO00o = oooO00o;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        androidx.fragment.app.OooO00o oooO00o = this.OooO00o;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
        oooO00o.OooOO0O();
        o0OOo000.OooO0oO((ViewGroup) abstractComponentCallbacksC0593o0oOoOo0.OooOooo.getParent(), this.OooO0O0.OooO00o.OooOooO()).OooO0o();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
