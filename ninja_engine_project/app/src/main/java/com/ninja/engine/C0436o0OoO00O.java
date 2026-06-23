package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.ninja.engine.o0OoO00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436o0OoO00O extends C0875oO0oOooo implements Drawable.Callback, InterfaceC1288oOooO {
    public static final int[] o00000 = {16842910};
    public static final ShapeDrawable o00000O0 = new ShapeDrawable(new OvalShape());
    public ColorStateList OooOo;
    public float OooOoO;
    public ColorStateList OooOoO0;
    public float OooOoOO;
    public float OooOoo;
    public ColorStateList OooOoo0;
    public ColorStateList OooOooO;
    public CharSequence OooOooo;
    public SpannableStringBuilder Oooo;
    public float Oooo0;
    public boolean Oooo000;
    public Drawable Oooo00O;
    public ColorStateList Oooo00o;
    public boolean Oooo0O0;
    public boolean Oooo0OO;
    public RippleDrawable Oooo0o;
    public Drawable Oooo0o0;
    public ColorStateList Oooo0oO;
    public float Oooo0oo;
    public ColorStateList OoooO;
    public boolean OoooO0;
    public boolean OoooO00;
    public Drawable OoooO0O;
    public oOO00O0 OoooOO0;
    public float OoooOOO;
    public float OoooOOo;
    public float OoooOo0;
    public float OoooOoO;
    public float OoooOoo;
    public float Ooooo00;
    public float Ooooo0o;
    public float OooooO0;
    public final Context OooooOO;
    public final Paint OooooOo;
    public final RectF Oooooo;
    public final Paint.FontMetrics Oooooo0;
    public final PointF OoooooO;
    public final Path Ooooooo;
    public boolean o000000;
    public int o000000O;
    public boolean o000000o;
    public TextUtils.TruncateAt o000OOo;
    public oOO00O0 o000oOoO;
    public int o00O0O;
    public int o00Oo0;
    public int o00Ooo;
    public int o00o0O;
    public int o00oO0O;
    public int o00oO0o;
    public int o00ooo;
    public WeakReference o0O0O00;
    public boolean o0OO00O;
    public PorterDuff.Mode o0OOO0o;
    public int[] o0Oo0oo;
    public final C1303oOooOO00 o0OoOo0;
    public ColorFilter o0ooOO0;
    public PorterDuffColorFilter o0ooOOo;
    public ColorStateList o0ooOoO;
    public boolean oo000o;
    public ColorStateList oo0o0Oo;
    public int ooOO;

    public C0436o0OoO00O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952660);
        this.OooOoOO = -1.0f;
        this.OooooOo = new Paint(1);
        this.Oooooo0 = new Paint.FontMetrics();
        this.Oooooo = new RectF();
        this.OoooooO = new PointF();
        this.Ooooooo = new Path();
        this.o00oO0O = 255;
        this.o0OOO0o = PorterDuff.Mode.SRC_IN;
        this.o0O0O00 = new WeakReference(null);
        OooOO0(context);
        this.OooooOO = context;
        C1303oOooOO00 c1303oOooOO00 = new C1303oOooOO00(this);
        this.o0OoOo0 = c1303oOooOO00;
        this.OooOooo = "";
        c1303oOooOO00.OooO00o.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = o00000;
        setState(iArr);
        if (!Arrays.equals(this.o0Oo0oo, iArr)) {
            this.o0Oo0oo = iArr;
            if (OoooOO0()) {
                OooOo(getState(), iArr);
            }
        }
        this.o000000 = true;
        o00000O0.setTint(-1);
    }

    public static boolean OooOo0(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean OooOo0O(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static void o000oOoO(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override // com.ninja.engine.InterfaceC1288oOooO
    public final void OooO00o() {
        OooOo0o();
        invalidateSelf();
    }

    public final void OooOOOo(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC0809oO0OooOO.OoooooO(drawable, AbstractC0809oO0OooOO.Oooo00o(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Oooo0o0) {
            if (drawable.isStateful()) {
                drawable.setState(this.o0Oo0oo);
            }
            drawable.setTintList(this.Oooo0oO);
            return;
        }
        Drawable drawable2 = this.Oooo00O;
        if (drawable == drawable2 && this.Oooo0O0) {
            drawable2.setTintList(this.Oooo00o);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final float OooOOo() {
        Drawable drawable;
        if (!OoooO() && !OoooO0O()) {
            return 0.0f;
        }
        float f = this.OoooOOo;
        if (this.oo000o) {
            drawable = this.OoooO0O;
        } else {
            drawable = this.Oooo00O;
        }
        float f2 = this.Oooo0;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.OoooOo0;
    }

    public final void OooOOo0(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (OoooO() || OoooO0O()) {
            float f = this.OoooOOO + this.OoooOOo;
            if (this.oo000o) {
                drawable = this.OoooO0O;
            } else {
                drawable = this.Oooo00O;
            }
            float f2 = this.Oooo0;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (AbstractC0809oO0OooOO.Oooo00o(this) == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            if (this.oo000o) {
                drawable2 = this.OoooO0O;
            } else {
                drawable2 = this.Oooo00O;
            }
            float f5 = this.Oooo0;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.OooooOO.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float OooOOoo() {
        if (OoooOO0()) {
            return this.Ooooo00 + this.Oooo0oo + this.Ooooo0o;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOo(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0436o0OoO00O.OooOo(int[], int[]):boolean");
    }

    public final float OooOo00() {
        if (this.o000000o) {
            return this.OooO00o.OooO00o.OooO0o0.OooO00o(OooO0oo());
        }
        return this.OooOoOO;
    }

    public final void OooOo0o() {
        o0O00O0 o0o00o0 = (o0O00O0) this.o0O0O00.get();
        if (o0o00o0 != null) {
            Chip chip = (Chip) o0o00o0;
            chip.OooO0O0(chip.OooOOOo);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void OooOoO(Drawable drawable) {
        if (this.OoooO0O != drawable) {
            float OooOOo = OooOOo();
            this.OoooO0O = drawable;
            float OooOOo2 = OooOOo();
            o000oOoO(this.OoooO0O);
            OooOOOo(this.OoooO0O);
            invalidateSelf();
            if (OooOOo != OooOOo2) {
                OooOo0o();
            }
        }
    }

    public final void OooOoO0(boolean z) {
        if (this.OoooO00 != z) {
            this.OoooO00 = z;
            float OooOOo = OooOOo();
            if (!z && this.oo000o) {
                this.oo000o = false;
            }
            float OooOOo2 = OooOOo();
            invalidateSelf();
            if (OooOOo != OooOOo2) {
                OooOo0o();
            }
        }
    }

    public final void OooOoOO(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.OoooO != colorStateList) {
            this.OoooO = colorStateList;
            if (this.OoooO0 && (drawable = this.OoooO0O) != null && this.OoooO00) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void OooOoo(float f) {
        if (this.OooOoOO != f) {
            this.OooOoOO = f;
            C1198oOoOOO OooO0o0 = this.OooO00o.OooO00o.OooO0o0();
            OooO0o0.OooO0o0 = new C0017OooOOo(f);
            OooO0o0.OooO0o = new C0017OooOOo(f);
            OooO0o0.OooO0oO = new C0017OooOOo(f);
            OooO0o0.OooO0oo = new C0017OooOOo(f);
            setShapeAppearanceModel(OooO0o0.OooO00o());
        }
    }

    public final void OooOoo0(boolean z) {
        if (this.OoooO0 != z) {
            boolean OoooO0O = OoooO0O();
            this.OoooO0 = z;
            boolean OoooO0O2 = OoooO0O();
            if (OoooO0O != OoooO0O2) {
                if (OoooO0O2) {
                    OooOOOo(this.OoooO0O);
                } else {
                    o000oOoO(this.OoooO0O);
                }
                invalidateSelf();
                OooOo0o();
            }
        }
    }

    public final void OooOooO(Drawable drawable) {
        Drawable drawable2 = this.Oooo00O;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof InterfaceC1544oo0OooOo) {
                drawable2 = ((C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable2)).OooO0o;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float OooOOo = OooOOo();
            if (drawable != null) {
                drawable3 = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
            }
            this.Oooo00O = drawable3;
            float OooOOo2 = OooOOo();
            o000oOoO(drawable2);
            if (OoooO()) {
                OooOOOo(this.Oooo00O);
            }
            invalidateSelf();
            if (OooOOo != OooOOo2) {
                OooOo0o();
            }
        }
    }

    public final void OooOooo(float f) {
        if (this.Oooo0 != f) {
            float OooOOo = OooOOo();
            this.Oooo0 = f;
            float OooOOo2 = OooOOo();
            invalidateSelf();
            if (OooOOo != OooOOo2) {
                OooOo0o();
            }
        }
    }

    public final void Oooo(float f) {
        if (this.OoooOo0 != f) {
            float OooOOo = OooOOo();
            this.OoooOo0 = f;
            float OooOOo2 = OooOOo();
            invalidateSelf();
            if (OooOOo != OooOOo2) {
                OooOo0o();
            }
        }
    }

    public final void Oooo0(float f) {
        if (this.OooOoo != f) {
            this.OooOoo = f;
            this.OooooOo.setStrokeWidth(f);
            if (this.o000000o) {
                this.OooO00o.OooOO0O = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void Oooo000(ColorStateList colorStateList) {
        this.Oooo0O0 = true;
        if (this.Oooo00o != colorStateList) {
            this.Oooo00o = colorStateList;
            if (OoooO()) {
                this.Oooo00O.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo00O(boolean z) {
        if (this.Oooo000 != z) {
            boolean OoooO = OoooO();
            this.Oooo000 = z;
            boolean OoooO2 = OoooO();
            if (OoooO != OoooO2) {
                if (OoooO2) {
                    OooOOOo(this.Oooo00O);
                } else {
                    o000oOoO(this.Oooo00O);
                }
                invalidateSelf();
                OooOo0o();
            }
        }
    }

    public final void Oooo00o(ColorStateList colorStateList) {
        if (this.OooOoo0 != colorStateList) {
            this.OooOoo0 = colorStateList;
            if (this.o000000o) {
                C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
                if (c0868oO0oOoO.OooO0Oo != colorStateList) {
                    c0868oO0oOoO.OooO0Oo = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0O0(Drawable drawable) {
        Drawable drawable2 = this.Oooo0o0;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof InterfaceC1544oo0OooOo) {
                drawable2 = ((C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable2)).OooO0o;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float OooOOoo = OooOOoo();
            if (drawable != null) {
                drawable3 = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
            }
            this.Oooo0o0 = drawable3;
            this.Oooo0o = new RippleDrawable(AbstractC0692o0ooooOo.OoooOoO(this.OooOooO), this.Oooo0o0, o00000O0);
            float OooOOoo2 = OooOOoo();
            o000oOoO(drawable2);
            if (OoooOO0()) {
                OooOOOo(this.Oooo0o0);
            }
            invalidateSelf();
            if (OooOOoo != OooOOoo2) {
                OooOo0o();
            }
        }
    }

    public final void Oooo0OO(float f) {
        if (this.Ooooo0o != f) {
            this.Ooooo0o = f;
            invalidateSelf();
            if (OoooOO0()) {
                OooOo0o();
            }
        }
    }

    public final void Oooo0o(float f) {
        if (this.Ooooo00 != f) {
            this.Ooooo00 = f;
            invalidateSelf();
            if (OoooOO0()) {
                OooOo0o();
            }
        }
    }

    public final void Oooo0o0(float f) {
        if (this.Oooo0oo != f) {
            this.Oooo0oo = f;
            invalidateSelf();
            if (OoooOO0()) {
                OooOo0o();
            }
        }
    }

    public final void Oooo0oO(ColorStateList colorStateList) {
        if (this.Oooo0oO != colorStateList) {
            this.Oooo0oO = colorStateList;
            if (OoooOO0()) {
                this.Oooo0o0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Oooo0oo(boolean z) {
        if (this.Oooo0OO != z) {
            boolean OoooOO0 = OoooOO0();
            this.Oooo0OO = z;
            boolean OoooOO02 = OoooOO0();
            if (OoooOO0 != OoooOO02) {
                if (OoooOO02) {
                    OooOOOo(this.Oooo0o0);
                } else {
                    o000oOoO(this.Oooo0o0);
                }
                invalidateSelf();
                OooOo0o();
            }
        }
    }

    public final boolean OoooO() {
        if (this.Oooo000 && this.Oooo00O != null) {
            return true;
        }
        return false;
    }

    public final void OoooO0(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.OooOooO != colorStateList) {
            this.OooOooO = colorStateList;
            if (this.o0OO00O) {
                colorStateList2 = AbstractC0692o0ooooOo.OoooOoO(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.oo0o0Oo = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void OoooO00(float f) {
        if (this.OoooOOo != f) {
            float OooOOo = OooOOo();
            this.OoooOOo = f;
            float OooOOo2 = OooOOo();
            invalidateSelf();
            if (OooOOo != OooOOo2) {
                OooOo0o();
            }
        }
    }

    public final boolean OoooO0O() {
        if (this.OoooO0 && this.OoooO0O != null && this.oo000o) {
            return true;
        }
        return false;
    }

    public final boolean OoooOO0() {
        if (this.Oooo0OO && this.Oooo0o0 != null) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        RectF rectF;
        int i4;
        int i5;
        int i6;
        float f;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.o00oO0O) == 0) {
            return;
        }
        if (i < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f2, f3, f4, f5, i) : canvas.saveLayerAlpha(f2, f3, f4, f5, i, 31);
        } else {
            i2 = 0;
        }
        boolean z = this.o000000o;
        Paint paint = this.OooooOo;
        RectF rectF2 = this.Oooooo;
        if (!z) {
            paint.setColor(this.ooOO);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, OooOo00(), OooOo00(), paint);
        }
        if (!this.o000000o) {
            paint.setColor(this.o00O0O);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.o0ooOO0;
            if (colorFilter == null) {
                colorFilter = this.o0ooOOo;
            }
            paint.setColorFilter(colorFilter);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, OooOo00(), OooOo00(), paint);
        }
        if (this.o000000o) {
            super.draw(canvas);
        }
        if (this.OooOoo > 0.0f && !this.o000000o) {
            paint.setColor(this.o00Ooo);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.o000000o) {
                ColorFilter colorFilter2 = this.o0ooOO0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.o0ooOOo;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f6 = this.OooOoo / 2.0f;
            rectF2.set(bounds.left + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.OooOoOO - (this.OooOoo / 2.0f);
            canvas.drawRoundRect(rectF2, f7, f7, paint);
        }
        paint.setColor(this.o00o0O);
        paint.setStyle(Paint.Style.FILL);
        rectF2.set(bounds);
        if (this.o000000o) {
            RectF rectF3 = new RectF(bounds);
            Path path = this.Ooooooo;
            C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
            this.OooOOo.OooO00o(c0868oO0oOoO.OooO00o, c0868oO0oOoO.OooOO0, rectF3, this.OooOOo0, path);
            i3 = 0;
            OooO0o(canvas, paint, path, this.OooO00o.OooO00o, OooO0oo());
        } else {
            canvas.drawRoundRect(rectF2, OooOo00(), OooOo00(), paint);
            i3 = 0;
        }
        if (OoooO()) {
            OooOOo0(bounds, rectF2);
            float f8 = rectF2.left;
            float f9 = rectF2.top;
            canvas.translate(f8, f9);
            this.Oooo00O.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.Oooo00O.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (OoooO0O()) {
            OooOOo0(bounds, rectF2);
            float f10 = rectF2.left;
            float f11 = rectF2.top;
            canvas.translate(f10, f11);
            this.OoooO0O.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.OoooO0O.draw(canvas);
            canvas.translate(-f10, -f11);
        }
        if (!this.o000000 || this.OooOooo == null) {
            rectF = rectF2;
            i4 = i2;
            i5 = 255;
        } else {
            PointF pointF = this.OoooooO;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.OooOooo;
            C1303oOooOO00 c1303oOooOO00 = this.o0OoOo0;
            if (charSequence != null) {
                float OooOOo = OooOOo() + this.OoooOOO + this.OoooOoO;
                if (AbstractC0809oO0OooOO.Oooo00o(this) == 0) {
                    pointF.x = bounds.left + OooOOo;
                } else {
                    pointF.x = bounds.right - OooOOo;
                    align = Paint.Align.RIGHT;
                }
                TextPaint textPaint = c1303oOooOO00.OooO00o;
                Paint.FontMetrics fontMetrics = this.Oooooo0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF2.setEmpty();
            if (this.OooOooo != null) {
                float OooOOo2 = OooOOo() + this.OoooOOO + this.OoooOoO;
                float OooOOoo = OooOOoo() + this.OooooO0 + this.OoooOoo;
                if (AbstractC0809oO0OooOO.Oooo00o(this) == 0) {
                    rectF2.left = bounds.left + OooOOo2;
                    f = bounds.right - OooOOoo;
                } else {
                    rectF2.left = bounds.left + OooOOoo;
                    f = bounds.right - OooOOo2;
                }
                rectF2.right = f;
                rectF2.top = bounds.top;
                rectF2.bottom = bounds.bottom;
            }
            C1299oOooO0oO c1299oOooO0oO = c1303oOooOO00.OooO0oO;
            TextPaint textPaint2 = c1303oOooOO00.OooO00o;
            if (c1299oOooO0oO != null) {
                textPaint2.drawableState = getState();
                c1303oOooOO00.OooO0oO.OooO0o0(this.OooooOO, textPaint2, c1303oOooOO00.OooO0O0);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.OooOooo.toString();
            if (c1303oOooOO00.OooO0o0) {
                c1303oOooOO00.OooO00o(charSequence2);
            }
            boolean z2 = Math.round(c1303oOooOO00.OooO0OO) > Math.round(rectF2.width());
            if (z2) {
                i6 = canvas.save();
                canvas.clipRect(rectF2);
            } else {
                i6 = 0;
            }
            CharSequence charSequence3 = this.OooOooo;
            if (z2 && this.o000OOo != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF2.width(), this.o000OOo);
            }
            CharSequence charSequence4 = charSequence3;
            int length = charSequence4.length();
            float f12 = pointF.x;
            float f13 = pointF.y;
            i5 = 255;
            rectF = rectF2;
            i4 = i2;
            canvas.drawText(charSequence4, 0, length, f12, f13, textPaint2);
            if (z2) {
                canvas.restoreToCount(i6);
            }
        }
        if (OoooOO0()) {
            rectF.setEmpty();
            if (OoooOO0()) {
                float f14 = this.OooooO0 + this.Ooooo0o;
                if (AbstractC0809oO0OooOO.Oooo00o(this) == 0) {
                    float f15 = bounds.right - f14;
                    rectF.right = f15;
                    rectF.left = f15 - this.Oooo0oo;
                } else {
                    float f16 = bounds.left + f14;
                    rectF.left = f16;
                    rectF.right = f16 + this.Oooo0oo;
                }
                float exactCenterY = bounds.exactCenterY();
                float f17 = this.Oooo0oo;
                float f18 = exactCenterY - (f17 / 2.0f);
                rectF.top = f18;
                rectF.bottom = f18 + f17;
            }
            float f19 = rectF.left;
            float f20 = rectF.top;
            canvas.translate(f19, f20);
            this.Oooo0o0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Oooo0o.setBounds(this.Oooo0o0.getBounds());
            this.Oooo0o.jumpToCurrentState();
            this.Oooo0o.draw(canvas);
            canvas.translate(-f19, -f20);
        }
        if (this.o00oO0O < i5) {
            canvas.restoreToCount(i4);
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o00oO0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.o0ooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.OooOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float OooOOo = OooOOo() + this.OoooOOO + this.OoooOoO;
        String charSequence = this.OooOooo.toString();
        C1303oOooOO00 c1303oOooOO00 = this.o0OoOo0;
        if (c1303oOooOO00.OooO0o0) {
            c1303oOooOO00.OooO00o(charSequence);
        }
        return Math.min(Math.round(OooOOoo() + c1303oOooOO00.OooO0OO + OooOOo + this.OoooOoo + this.OooooO0), this.o000000O);
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.o000000o) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.OooOoOO);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.OooOoO, this.OooOoOO);
        }
        outline.setAlpha(this.o00oO0O / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C1299oOooO0oO c1299oOooO0oO;
        ColorStateList colorStateList;
        if (!OooOo0(this.OooOo) && !OooOo0(this.OooOoO0) && !OooOo0(this.OooOoo0) && ((!this.o0OO00O || !OooOo0(this.oo0o0Oo)) && (((c1299oOooO0oO = this.o0OoOo0.OooO0oO) == null || (colorStateList = c1299oOooO0oO.OooOO0) == null || !colorStateList.isStateful()) && ((!this.OoooO0 || this.OoooO0O == null || !this.OoooO00) && !OooOo0O(this.Oooo00O) && !OooOo0O(this.OoooO0O) && !OooOo0(this.o0ooOoO))))) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (OoooO()) {
            onLayoutDirectionChanged |= AbstractC0809oO0OooOO.OoooooO(this.Oooo00O, i);
        }
        if (OoooO0O()) {
            onLayoutDirectionChanged |= AbstractC0809oO0OooOO.OoooooO(this.OoooO0O, i);
        }
        if (OoooOO0()) {
            onLayoutDirectionChanged |= AbstractC0809oO0OooOO.OoooooO(this.Oooo0o0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (OoooO()) {
            onLevelChange |= this.Oooo00O.setLevel(i);
        }
        if (OoooO0O()) {
            onLevelChange |= this.OoooO0O.setLevel(i);
        }
        if (OoooOO0()) {
            onLevelChange |= this.Oooo0o0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable, com.ninja.engine.InterfaceC1288oOooO
    public final boolean onStateChange(int[] iArr) {
        if (this.o000000o) {
            super.onStateChange(iArr);
        }
        return OooOo(iArr, this.o0Oo0oo);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.o00oO0O != i) {
            this.o00oO0O = i;
            invalidateSelf();
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.o0ooOO0 != colorFilter) {
            this.o0ooOO0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.o0ooOoO != colorStateList) {
            this.o0ooOoO = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.o0OOO0o != mode) {
            this.o0OOO0o = mode;
            ColorStateList colorStateList = this.o0ooOoO;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.o0ooOOo = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (OoooO()) {
            visible |= this.Oooo00O.setVisible(z, z2);
        }
        if (OoooO0O()) {
            visible |= this.OoooO0O.setVisible(z, z2);
        }
        if (OoooOO0()) {
            visible |= this.Oooo0o0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
