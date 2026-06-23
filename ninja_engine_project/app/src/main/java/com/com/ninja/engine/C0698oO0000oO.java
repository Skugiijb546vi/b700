package com.ninja.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
/* renamed from: com.ninja.engine.oO0000oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698oO0000oO extends View {
    public boolean OooO00o;

    public C0698oO0000oO(Context context) {
        super(context);
        this.OooO00o = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.OooO00o = z;
    }

    public void setGuidelineBegin(int i) {
        C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) getLayoutParams();
        if (this.OooO00o && c0309o0O0OooO.OooO00o == i) {
            return;
        }
        c0309o0O0OooO.OooO00o = i;
        setLayoutParams(c0309o0O0OooO);
    }

    public void setGuidelineEnd(int i) {
        C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) getLayoutParams();
        if (this.OooO00o && c0309o0O0OooO.OooO0O0 == i) {
            return;
        }
        c0309o0O0OooO.OooO0O0 = i;
        setLayoutParams(c0309o0O0OooO);
    }

    public void setGuidelinePercent(float f) {
        C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) getLayoutParams();
        if (this.OooO00o && c0309o0O0OooO.OooO0OO == f) {
            return;
        }
        c0309o0O0OooO.OooO0OO = f;
        setLayoutParams(c0309o0O0OooO);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
