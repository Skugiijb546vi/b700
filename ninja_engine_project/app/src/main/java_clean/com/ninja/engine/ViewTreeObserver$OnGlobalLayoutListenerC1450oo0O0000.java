package com.ninja.engine;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0O0000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap OooO00o = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.OooO00o.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue != z) {
                    if (z) {
                        i = 16;
                    } else {
                        i = 32;
                    }
                    AbstractC1460oo0O00oo.OooO(view, i);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}


