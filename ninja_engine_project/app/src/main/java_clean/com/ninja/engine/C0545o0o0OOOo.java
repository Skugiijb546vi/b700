package com.ninja.engine;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0o0OOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545o0o0OOOo implements InterfaceC0624o0oo0OOO {
    public final Set OooO00o = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean OooO0O0;

    @Override // com.ninja.engine.InterfaceC0624o0oo0OOO
    public final void OooOO0O(Activity activity) {
        if (this.OooO0O0 || !this.OooO00o.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver$OnDrawListenerC0544o0o0OOOO(this, decorView));
    }
}


