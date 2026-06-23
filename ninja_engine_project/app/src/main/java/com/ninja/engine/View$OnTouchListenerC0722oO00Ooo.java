package com.ninja.engine;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* renamed from: com.ninja.engine.oO00Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0722oO00Ooo implements View.OnTouchListener {
    public final Dialog OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public View$OnTouchListenerC0722oO00Ooo(Dialog dialog, Rect rect) {
        this.OooO00o = dialog;
        this.OooO0O0 = rect.left;
        this.OooO0OO = rect.top;
        this.OooO0Oo = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.OooO0O0;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.OooO0OO;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.OooO0Oo;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.OooO00o.onTouchEvent(obtain);
    }
}
