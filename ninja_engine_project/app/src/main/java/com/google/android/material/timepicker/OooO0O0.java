package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class OooO0O0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView OooO00o;

    public OooO0O0(ClockFaceView clockFaceView) {
        this.OooO00o = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.OooO00o;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.OooOo00.OooO0Oo) - clockFaceView.OooOoo0;
        if (height != clockFaceView.OooOOo) {
            clockFaceView.OooOOo = height;
            clockFaceView.OooOOO0();
            int i = clockFaceView.OooOOo;
            ClockHandView clockHandView = clockFaceView.OooOo00;
            clockHandView.OooOO0o = i;
            clockHandView.invalidate();
        }
        return true;
    }
}
