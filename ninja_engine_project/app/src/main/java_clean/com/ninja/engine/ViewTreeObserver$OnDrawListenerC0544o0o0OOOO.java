package com.ninja.engine;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: com.ninja.engine.o0o0OOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnDrawListenerC0544o0o0OOOO implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View OooO00o;
    public final /* synthetic */ C0545o0o0OOOo OooO0O0;

    public ViewTreeObserver$OnDrawListenerC0544o0o0OOOO(C0545o0o0OOOo c0545o0o0OOOo, View view) {
        this.OooO0O0 = c0545o0o0OOOo;
        this.OooO00o = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC1401oo00OOO0.OooO0o().post(new o0OO00O(this, 5, this));
    }
}


