package com.ninja.engine;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* renamed from: com.ninja.engine.oO0OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0777oO0OOo implements View.OnTouchListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ View$OnTouchListenerC0777oO0OOo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0120o000oooO c0120o000oooO;
        switch (this.OooO00o) {
            case 0:
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                C0781oO0OOoO c0781oO0OOoO = (C0781oO0OOoO) this.OooO0O0;
                if (action == 0 && (c0120o000oooO = c0781oO0OOoO.OooOoO) != null && c0120o000oooO.isShowing() && x >= 0 && x < c0781oO0OOoO.OooOoO.getWidth() && y >= 0 && y < c0781oO0OOoO.OooOoO.getHeight()) {
                    c0781oO0OOoO.OooOo0O.postDelayed(c0781oO0OOoO.OooOOo, 250L);
                    return false;
                } else if (action == 1) {
                    c0781oO0OOoO.OooOo0O.removeCallbacks(c0781oO0OOoO.OooOOo);
                    return false;
                } else {
                    return false;
                }
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.OooO0O0).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
