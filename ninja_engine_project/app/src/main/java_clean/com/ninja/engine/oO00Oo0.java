package com.ninja.engine;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class oO00Oo0 extends AbstractC0429o0Oo0oOo {
    public AbstractC0424o0Oo0o00 OooOO0o;
    public AbstractC0104o000o0o OooOOO0;

    @Override // com.ninja.engine.AbstractC0429o0Oo0oOo
    public final boolean OooO0Oo(boolean z, boolean z2, boolean z3) {
        boolean OooO0Oo = super.OooO0Oo(z, z2, z3);
        OooO0o();
        if (!isRunning()) {
            this.OooOOO0.OooO0OO();
        }
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && !OooO0o()))) {
            this.OooOOO0.OooOOOo();
        }
        return OooO0Oo;
    }

    public final boolean OooO0o() {
        if (this.OooO0OO == null || Settings.Global.getFloat(this.OooO00o.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        float f2;
        int i;
        AbstractC0424o0Oo0o00 abstractC0424o0Oo0o00;
        Canvas canvas2;
        Paint paint;
        int i2;
        int i3;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            OooO0o();
            canvas.save();
            AbstractC0424o0Oo0o00 abstractC0424o0Oo0o002 = this.OooOO0o;
            Rect bounds = getBounds();
            float OooO0O0 = OooO0O0();
            ValueAnimator valueAnimator = this.OooO0Oo;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                z = true;
            } else {
                z = false;
            }
            ValueAnimator valueAnimator2 = this.OooO0o0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            abstractC0424o0Oo0o002.OooO0O0(canvas, bounds, OooO0O0, z, z2);
            oO0O oo0o = this.OooO0O0;
            int i4 = oo0o.OooO0oO;
            int i5 = this.OooOO0;
            Paint paint2 = this.OooO;
            if (i4 == 0) {
                abstractC0424o0Oo0o00 = this.OooOO0o;
                i = oo0o.OooO0Oo;
                f = 0.0f;
                f2 = 1.0f;
                i3 = 0;
                canvas2 = canvas;
                paint = paint2;
                i2 = i5;
            } else {
                C0423o0Oo0Ooo c0423o0Oo0Ooo = (C0423o0Oo0Ooo) ((ArrayList) this.OooOOO0.OooO0O0).get(0);
                ArrayList arrayList = (ArrayList) this.OooOOO0.OooO0O0;
                C0423o0Oo0Ooo c0423o0Oo0Ooo2 = (C0423o0Oo0Ooo) arrayList.get(arrayList.size() - 1);
                AbstractC0424o0Oo0o00 abstractC0424o0Oo0o003 = this.OooOO0o;
                if (abstractC0424o0Oo0o003 instanceof C1780ooOOO0Oo) {
                    canvas2 = canvas;
                    paint = paint2;
                    i2 = i5;
                    i3 = i4;
                    abstractC0424o0Oo0o003.OooO00o(canvas2, paint, 0.0f, c0423o0Oo0Ooo.OooO00o, oo0o.OooO0Oo, i2, i3);
                    abstractC0424o0Oo0o00 = this.OooOO0o;
                    f = c0423o0Oo0Ooo2.OooO0O0;
                    f2 = 1.0f;
                    i = oo0o.OooO0Oo;
                } else {
                    f = c0423o0Oo0Ooo2.OooO0O0;
                    f2 = c0423o0Oo0Ooo.OooO00o + 1.0f;
                    i = oo0o.OooO0Oo;
                    i5 = 0;
                    abstractC0424o0Oo0o00 = abstractC0424o0Oo0o003;
                    canvas2 = canvas;
                    paint = paint2;
                    i2 = 0;
                    i3 = i4;
                }
            }
            abstractC0424o0Oo0o00.OooO00o(canvas2, paint, f, f2, i, i2, i3);
            for (int i6 = 0; i6 < ((ArrayList) this.OooOOO0.OooO0O0).size(); i6++) {
                C0423o0Oo0Ooo c0423o0Oo0Ooo3 = (C0423o0Oo0Ooo) ((ArrayList) this.OooOOO0.OooO0O0).get(i6);
                AbstractC0424o0Oo0o00 abstractC0424o0Oo0o004 = this.OooOO0o;
                int i7 = this.OooOO0;
                C1780ooOOO0Oo c1780ooOOO0Oo = (C1780ooOOO0Oo) abstractC0424o0Oo0o004;
                c1780ooOOO0Oo.getClass();
                int OooOO0o = AbstractC0694o0ooooo0.OooOO0o(c0423o0Oo0Ooo3.OooO0OO, i7);
                float f3 = c0423o0Oo0Ooo3.OooO00o;
                float f4 = c0423o0Oo0Ooo3.OooO0O0;
                int i8 = c0423o0Oo0Ooo3.OooO0Oo;
                c1780ooOOO0Oo.OooO0OO(canvas, paint2, f3, f4, OooOO0o, i8, i8);
                if (i6 > 0 && i4 > 0) {
                    this.OooOO0o.OooO00o(canvas, paint2, ((C0423o0Oo0Ooo) ((ArrayList) this.OooOOO0.OooO0O0).get(i6 - 1)).OooO0O0, c0423o0Oo0Ooo3.OooO00o, oo0o.OooO0Oo, i5, i4);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C1780ooOOO0Oo) this.OooOO0o).OooO00o.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.OooOO0o.getClass();
        return -1;
    }
}


