package com.ninja.engine;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o0O0O0O {
    public final View OooO00o;
    public float OooO0O0;
    public final Rect OooO0OO;
    public final Rect OooO0Oo;
    public final RectF OooO0o0;
    public ColorStateList OooOO0;
    public ColorStateList OooOO0O;
    public float OooOO0o;
    public float OooOOO;
    public float OooOOO0;
    public float OooOOOO;
    public float OooOOOo;
    public Typeface OooOOo;
    public float OooOOo0;
    public Typeface OooOOoo;
    public Typeface OooOo;
    public Typeface OooOo0;
    public Typeface OooOo00;
    public Typeface OooOo0O;
    public Typeface OooOo0o;
    public C0260o00ooO OooOoO0;
    public CharSequence OooOoOO;
    public boolean OooOoo;
    public CharSequence OooOoo0;
    public Bitmap OooOooo;
    public TimeInterpolator Oooo;
    public float Oooo0;
    public float Oooo000;
    public float Oooo00O;
    public float Oooo00o;
    public float Oooo0O0;
    public int Oooo0OO;
    public boolean Oooo0o;
    public int[] Oooo0o0;
    public final TextPaint Oooo0oO;
    public final TextPaint Oooo0oo;
    public float OoooO;
    public float OoooO0;
    public TimeInterpolator OoooO00;
    public float OoooO0O;
    public ColorStateList OoooOO0;
    public float OoooOOO;
    public float OoooOOo;
    public StaticLayout OoooOo0;
    public float OoooOoO;
    public float OoooOoo;
    public float Ooooo00;
    public CharSequence Ooooo0o;
    public float o000oOoO;
    public int OooO0o = 16;
    public int OooO0oO = 16;
    public float OooO0oo = 15.0f;
    public float OooO = 15.0f;
    public final TextUtils.TruncateAt OooOoO = TextUtils.TruncateAt.END;
    public final boolean OooOooO = true;
    public final int OooooO0 = 1;
    public final float OooooOO = 1.0f;
    public final int OooooOo = C1257oOoo000O.OooOOO0;

    public o0O0O0O(View view) {
        this.OooO00o = view;
        TextPaint textPaint = new TextPaint(129);
        this.Oooo0oO = textPaint;
        this.Oooo0oo = new TextPaint(textPaint);
        this.OooO0Oo = new Rect();
        this.OooO0OO = new Rect();
        this.OooO0o0 = new RectF();
        OooO0oO(view.getContext().getResources().getConfiguration());
    }

    public static int OooO00o(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float OooO0o(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return o000OO0O.OooO00o(f, f2, f3);
    }

    public final void OooO(ColorStateList colorStateList) {
        if (this.OooOO0O != colorStateList || this.OooOO0 != colorStateList) {
            this.OooOO0O = colorStateList;
            this.OooOO0 = colorStateList;
            OooO0oo(false);
        }
    }

    public final boolean OooO0O0(CharSequence charSequence) {
        C0224o00oO000 c0224o00oO000;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        boolean z = true;
        if (this.OooO00o.getLayoutDirection() != 1) {
            z = false;
        }
        if (this.OooOooO) {
            if (z) {
                c0224o00oO000 = AbstractC1300oOooO0oo.OooO0Oo;
            } else {
                c0224o00oO000 = AbstractC1300oOooO0oo.OooO0OO;
            }
            return c0224o00oO000.OooO0O0(charSequence, charSequence.length());
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fd, code lost:
        if (r12.OooOoo != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(float r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O0O0O.OooO0OO(float, boolean):void");
    }

    public final float OooO0Oo() {
        TextPaint textPaint = this.Oooo0oo;
        textPaint.setTextSize(this.OooO);
        textPaint.setTypeface(this.OooOOo);
        textPaint.setLetterSpacing(this.o000oOoO);
        return -textPaint.ascent();
    }

    public final int OooO0o0(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.Oooo0o0;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void OooO0oO(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.OooOo00;
            if (typeface != null) {
                this.OooOOoo = AbstractC1137oOOoooO.OooO0oo(configuration, typeface);
            }
            Typeface typeface2 = this.OooOo0o;
            if (typeface2 != null) {
                this.OooOo0O = AbstractC1137oOOoooO.OooO0oo(configuration, typeface2);
            }
            Typeface typeface3 = this.OooOOoo;
            if (typeface3 == null) {
                typeface3 = this.OooOo00;
            }
            this.OooOOo = typeface3;
            Typeface typeface4 = this.OooOo0O;
            if (typeface4 == null) {
                typeface4 = this.OooOo0o;
            }
            this.OooOo0 = typeface4;
            OooO0oo(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oo(boolean r17) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O0O0O.OooO0oo(boolean):void");
    }

    public final boolean OooOO0(Typeface typeface) {
        C0260o00ooO c0260o00ooO = this.OooOoO0;
        if (c0260o00ooO != null) {
            c0260o00ooO.OooO0o0 = true;
        }
        if (this.OooOo00 != typeface) {
            this.OooOo00 = typeface;
            Typeface OooO0oo = AbstractC1137oOOoooO.OooO0oo(this.OooO00o.getContext().getResources().getConfiguration(), typeface);
            this.OooOOoo = OooO0oo;
            if (OooO0oo == null) {
                OooO0oo = this.OooOo00;
            }
            this.OooOOo = OooO0oo;
            return true;
        }
        return false;
    }

    public final void OooOO0O(float f) {
        int OooO0o0;
        float OooOOoo = AbstractC0809oO0OooOO.OooOOoo(f, 0.0f, 1.0f);
        if (OooOOoo != this.OooO0O0) {
            this.OooO0O0 = OooOOoo;
            Rect rect = this.OooO0OO;
            Rect rect2 = this.OooO0Oo;
            float OooO0o = OooO0o(rect.left, rect2.left, OooOOoo, this.Oooo);
            RectF rectF = this.OooO0o0;
            rectF.left = OooO0o;
            rectF.top = OooO0o(this.OooOO0o, this.OooOOO0, OooOOoo, this.Oooo);
            rectF.right = OooO0o(rect.right, rect2.right, OooOOoo, this.Oooo);
            rectF.bottom = OooO0o(rect.bottom, rect2.bottom, OooOOoo, this.Oooo);
            this.OooOOOo = OooO0o(this.OooOOO, this.OooOOOO, OooOOoo, this.Oooo);
            this.OooOOo0 = OooO0o(this.OooOO0o, this.OooOOO0, OooOOoo, this.Oooo);
            OooOO0o(OooOOoo);
            C0534o0o0O0o c0534o0o0O0o = o000OO0O.OooO0O0;
            this.OoooOoo = 1.0f - OooO0o(0.0f, 1.0f, 1.0f - OooOOoo, c0534o0o0O0o);
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            View view = this.OooO00o;
            view.postInvalidateOnAnimation();
            this.Ooooo00 = OooO0o(1.0f, 0.0f, OooOOoo, c0534o0o0O0o);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.OooOO0O;
            ColorStateList colorStateList2 = this.OooOO0;
            TextPaint textPaint = this.Oooo0oO;
            if (colorStateList != colorStateList2) {
                OooO0o0 = OooO00o(OooO0o0(colorStateList2), OooO0o0(this.OooOO0O), OooOOoo);
            } else {
                OooO0o0 = OooO0o0(colorStateList);
            }
            textPaint.setColor(OooO0o0);
            float f2 = this.o000oOoO;
            float f3 = this.OoooOOO;
            if (f2 != f3) {
                f2 = OooO0o(f3, f2, OooOOoo, c0534o0o0O0o);
            }
            textPaint.setLetterSpacing(f2);
            this.Oooo00o = OooO0o(0.0f, this.OoooO0, OooOOoo, null);
            this.Oooo0 = OooO0o(0.0f, this.OoooO0O, OooOOoo, null);
            this.Oooo0O0 = OooO0o(0.0f, this.OoooO, OooOOoo, null);
            int OooO00o = OooO00o(OooO0o0(null), OooO0o0(this.OoooOO0), OooOOoo);
            this.Oooo0OO = OooO00o;
            textPaint.setShadowLayer(this.Oooo00o, this.Oooo0, this.Oooo0O0, OooO00o);
            view.postInvalidateOnAnimation();
        }
    }

    public final void OooOO0o(float f) {
        OooO0OO(f, false);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        this.OooO00o.postInvalidateOnAnimation();
    }

    public final void OooOOO0(Typeface typeface) {
        boolean z;
        boolean OooOO0 = OooOO0(typeface);
        if (this.OooOo0o != typeface) {
            this.OooOo0o = typeface;
            Typeface OooO0oo = AbstractC1137oOOoooO.OooO0oo(this.OooO00o.getContext().getResources().getConfiguration(), typeface);
            this.OooOo0O = OooO0oo;
            if (OooO0oo == null) {
                OooO0oo = this.OooOo0o;
            }
            this.OooOo0 = OooO0oo;
            z = true;
        } else {
            z = false;
        }
        if (OooOO0 || z) {
            OooO0oo(false);
        }
    }
}
