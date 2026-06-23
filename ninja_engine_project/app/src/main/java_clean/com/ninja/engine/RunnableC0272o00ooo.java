package com.ninja.engine;

import androidx.appcompat.widget.ActionBarOverlayLayout;
/* renamed from: com.ninja.engine.o00ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0272o00ooo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ ActionBarOverlayLayout OooO0O0;

    public /* synthetic */ RunnableC0272o00ooo(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.OooO00o = i;
        this.OooO0O0 = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.OooO0O0;
                actionBarOverlayLayout.OooO0oo();
                actionBarOverlayLayout.OooOo0o = actionBarOverlayLayout.OooO0Oo.animate().translationY(0.0f).setListener(actionBarOverlayLayout.OooOo);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.OooO0O0;
                actionBarOverlayLayout2.OooO0oo();
                actionBarOverlayLayout2.OooOo0o = actionBarOverlayLayout2.OooO0Oo.animate().translationY(-actionBarOverlayLayout2.OooO0Oo.getHeight()).setListener(actionBarOverlayLayout2.OooOo);
                return;
        }
    }
}


