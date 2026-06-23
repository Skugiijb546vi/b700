package com.ninja.engine;

import android.view.View;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC1472oo0O0o implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        AbstractC1449oo0O000.OooO0OO(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
