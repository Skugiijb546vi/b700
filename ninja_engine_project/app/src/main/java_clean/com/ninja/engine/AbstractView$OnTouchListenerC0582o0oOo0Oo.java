package com.ninja.engine;

import android.view.View;
import android.view.ViewConfiguration;
/* renamed from: com.ninja.engine.o0oOo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC0582o0oOo0Oo implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int[] OooO = new int[2];
    public final float OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final View OooO0Oo;
    public RunnableC0581o0oOo0OO OooO0o;
    public RunnableC0581o0oOo0OO OooO0o0;
    public boolean OooO0oO;
    public int OooO0oo;

    public AbstractView$OnTouchListenerC0582o0oOo0Oo(View view) {
        this.OooO0Oo = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.OooO00o = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.OooO0O0 = tapTimeout;
        this.OooO0OO = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void OooO00o() {
        RunnableC0581o0oOo0OO runnableC0581o0oOo0OO = this.OooO0o;
        View view = this.OooO0Oo;
        if (runnableC0581o0oOo0OO != null) {
            view.removeCallbacks(runnableC0581o0oOo0OO);
        }
        RunnableC0581o0oOo0OO runnableC0581o0oOo0OO2 = this.OooO0o0;
        if (runnableC0581o0oOo0OO2 != null) {
            view.removeCallbacks(runnableC0581o0oOo0OO2);
        }
    }

    public abstract InterfaceC1216oOoOOoOO OooO0O0();

    public abstract boolean OooO0OO();

    public boolean OooO0Oo() {
        InterfaceC1216oOoOOoOO OooO0O0 = OooO0O0();
        if (OooO0O0 != null && OooO0O0.OooO00o()) {
            OooO0O0.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r4 != 3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractView$OnTouchListenerC0582o0oOo0Oo.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.OooO0oO = false;
        this.OooO0oo = -1;
        RunnableC0581o0oOo0OO runnableC0581o0oOo0OO = this.OooO0o0;
        if (runnableC0581o0oOo0OO != null) {
            this.OooO0Oo.removeCallbacks(runnableC0581o0oOo0OO);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}


