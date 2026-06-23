package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
/* renamed from: com.ninja.engine.o0Oo0o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0424o0Oo0o00 {
    public oO0O OooO00o;

    public abstract void OooO00o(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public final void OooO0O0(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3;
        this.OooO00o.OooO00o();
        C1780ooOOO0Oo c1780ooOOO0Oo = (C1780ooOOO0Oo) this;
        c1780ooOOO0Oo.OooO0O0 = rect.width();
        oO0O oo0o = c1780ooOOO0Oo.OooO00o;
        float f2 = oo0o.OooO00o;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - f2) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (oo0o.OooOO0) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f3 = c1780ooOOO0Oo.OooO0O0 / 2.0f;
        float f4 = f2 / 2.0f;
        canvas.clipRect(-f3, -f4, f3, f4);
        int i3 = oo0o.OooO00o;
        if (i3 / 2 == oo0o.OooO0O0) {
            z3 = true;
        } else {
            z3 = false;
        }
        c1780ooOOO0Oo.OooO0o0 = z3;
        c1780ooOOO0Oo.OooO0OO = i3 * f;
        c1780ooOOO0Oo.OooO0Oo = Math.min(i, i2) * f;
        if (z || z2) {
            if ((z && oo0o.OooO0o0 == 2) || (z2 && oo0o.OooO0o == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && oo0o.OooO0o != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * oo0o.OooO00o) / 2.0f);
            }
        }
        if (z2 && oo0o.OooO0o == 3) {
            c1780ooOOO0Oo.OooO0o = f;
        } else {
            c1780ooOOO0Oo.OooO0o = 1.0f;
        }
    }
}
