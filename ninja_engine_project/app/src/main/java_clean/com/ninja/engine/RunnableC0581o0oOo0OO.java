package com.ninja.engine;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* renamed from: com.ninja.engine.o0oOo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0581o0oOo0OO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ AbstractView$OnTouchListenerC0582o0oOo0Oo OooO0O0;

    public /* synthetic */ RunnableC0581o0oOo0OO(AbstractView$OnTouchListenerC0582o0oOo0Oo abstractView$OnTouchListenerC0582o0oOo0Oo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = abstractView$OnTouchListenerC0582o0oOo0Oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                ViewParent parent = this.OooO0O0.OooO0Oo.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                AbstractView$OnTouchListenerC0582o0oOo0Oo abstractView$OnTouchListenerC0582o0oOo0Oo = this.OooO0O0;
                abstractView$OnTouchListenerC0582o0oOo0Oo.OooO00o();
                View view = abstractView$OnTouchListenerC0582o0oOo0Oo.OooO0Oo;
                if (view.isEnabled() && !view.isLongClickable() && abstractView$OnTouchListenerC0582o0oOo0Oo.OooO0OO()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    abstractView$OnTouchListenerC0582o0oOo0Oo.OooO0oO = true;
                    return;
                }
                return;
        }
    }
}


