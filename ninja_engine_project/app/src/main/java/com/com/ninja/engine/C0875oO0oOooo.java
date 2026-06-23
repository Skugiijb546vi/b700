package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;
/* renamed from: com.ninja.engine.oO0oOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0875oO0oOooo extends Drawable implements InterfaceC1317oOooOoo, InterfaceC1210oOoOOo {
    public static final Paint OooOo0o;
    public final RectF OooO;
    public C0868oO0oOoO OooO00o;
    public final AbstractC1211oOoOOo0[] OooO0O0;
    public final AbstractC1211oOoOOo0[] OooO0OO;
    public final BitSet OooO0Oo;
    public final Matrix OooO0o;
    public boolean OooO0o0;
    public final Path OooO0oO;
    public final Path OooO0oo;
    public final RectF OooOO0;
    public final Region OooOO0O;
    public final Region OooOO0o;
    public final Paint OooOOO;
    public C1204oOoOOOO0 OooOOO0;
    public final Paint OooOOOO;
    public final C1202oOoOOO0o OooOOOo;
    public final C1205oOoOOOOO OooOOo;
    public final C0331o0O0oo OooOOo0;
    public PorterDuffColorFilter OooOOoo;
    public final RectF OooOo0;
    public PorterDuffColorFilter OooOo00;
    public final boolean OooOo0O;

    static {
        Paint paint = new Paint(1);
        OooOo0o = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0875oO0oOooo() {
        this(new C1204oOoOOOO0());
    }

    public final boolean OooO() {
        Paint.Style style = this.OooO00o.OooOo0;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.OooOOOO.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void OooO0O0(RectF rectF, Path path) {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        this.OooOOo.OooO00o(c0868oO0oOoO.OooO00o, c0868oO0oOoO.OooOO0, rectF, this.OooOOo0, path);
        if (this.OooO00o.OooO != 1.0f) {
            Matrix matrix = this.OooO0o;
            matrix.reset();
            float f = this.OooO00o.OooO;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.OooOo0, true);
    }

    public final PorterDuffColorFilter OooO0OO(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int OooO0Oo;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = OooO0Oo(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z && (OooO0Oo = OooO0Oo((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(OooO0Oo, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int OooO0Oo(int i) {
        float f;
        int i2;
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        float f2 = c0868oO0oOoO.OooOOO + c0868oO0oOoO.OooOOOO + c0868oO0oOoO.OooOOO0;
        C0453o0OoOo c0453o0OoOo = c0868oO0oOoO.OooO0O0;
        if (c0453o0OoOo != null && c0453o0OoOo.OooO00o && o0O0OO0.OooO0Oo(i, 255) == c0453o0OoOo.OooO0Oo) {
            float f3 = c0453o0OoOo.OooO0o0;
            if (f3 > 0.0f && f2 > 0.0f) {
                f = Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f = 0.0f;
            }
            int alpha = Color.alpha(i);
            int Oooo000 = AbstractC0694o0ooooo0.Oooo000(o0O0OO0.OooO0Oo(i, 255), c0453o0OoOo.OooO0O0, f);
            if (f > 0.0f && (i2 = c0453o0OoOo.OooO0OO) != 0) {
                Oooo000 = o0O0OO0.OooO0O0(o0O0OO0.OooO0Oo(i2, C0453o0OoOo.OooO0o), Oooo000);
            }
            return o0O0OO0.OooO0Oo(Oooo000, alpha);
        }
        return i;
    }

    public final void OooO0o(Canvas canvas, Paint paint, Path path, C1204oOoOOOO0 c1204oOoOOOO0, RectF rectF) {
        if (c1204oOoOOOO0.OooO0Oo(rectF)) {
            float OooO00o = c1204oOoOOOO0.OooO0o.OooO00o(rectF) * this.OooO00o.OooOO0;
            canvas.drawRoundRect(rectF, OooO00o, OooO00o, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void OooO0o0(Canvas canvas) {
        this.OooO0Oo.cardinality();
        int i = this.OooO00o.OooOOo;
        Path path = this.OooO0oO;
        C1202oOoOOO0o c1202oOoOOO0o = this.OooOOOo;
        if (i != 0) {
            canvas.drawPath(path, c1202oOoOOO0o.OooO00o);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC1211oOoOOo0 abstractC1211oOoOOo0 = this.OooO0O0[i2];
            int i3 = this.OooO00o.OooOOo0;
            Matrix matrix = AbstractC1211oOoOOo0.OooO0O0;
            abstractC1211oOoOOo0.OooO00o(matrix, c1202oOoOOO0o, i3, canvas);
            this.OooO0OO[i2].OooO00o(matrix, c1202oOoOOO0o, this.OooO00o.OooOOo0, canvas);
        }
        if (this.OooOo0O) {
            C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
            int sin = (int) (Math.sin(Math.toRadians(c0868oO0oOoO.OooOOoo)) * c0868oO0oOoO.OooOOo);
            C0868oO0oOoO c0868oO0oOoO2 = this.OooO00o;
            int cos = (int) (Math.cos(Math.toRadians(c0868oO0oOoO2.OooOOoo)) * c0868oO0oOoO2.OooOOo);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, OooOo0o);
            canvas.translate(sin, cos);
        }
    }

    public void OooO0oO(Canvas canvas) {
        float f;
        Paint paint = this.OooOOOO;
        Path path = this.OooO0oo;
        C1204oOoOOOO0 c1204oOoOOOO0 = this.OooOOO0;
        RectF rectF = this.OooOO0;
        rectF.set(OooO0oo());
        if (OooO()) {
            f = paint.getStrokeWidth() / 2.0f;
        } else {
            f = 0.0f;
        }
        rectF.inset(f, f);
        OooO0o(canvas, paint, path, c1204oOoOOOO0, rectF);
    }

    public final RectF OooO0oo() {
        RectF rectF = this.OooO;
        rectF.set(getBounds());
        return rectF;
    }

    public final void OooOO0(Context context) {
        this.OooO00o.OooO0O0 = new C0453o0OoOo(context);
        OooOOOO();
    }

    public final void OooOO0O(float f) {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        if (c0868oO0oOoO.OooOOO != f) {
            c0868oO0oOoO.OooOOO = f;
            OooOOOO();
        }
    }

    public final void OooOO0o(ColorStateList colorStateList) {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        if (c0868oO0oOoO.OooO0OO != colorStateList) {
            c0868oO0oOoO.OooO0OO = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean OooOOO() {
        PorterDuffColorFilter porterDuffColorFilter = this.OooOOoo;
        PorterDuffColorFilter porterDuffColorFilter2 = this.OooOo00;
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        this.OooOOoo = OooO0OO(c0868oO0oOoO.OooO0o, c0868oO0oOoO.OooO0oO, this.OooOOO, true);
        C0868oO0oOoO c0868oO0oOoO2 = this.OooO00o;
        this.OooOo00 = OooO0OO(c0868oO0oOoO2.OooO0o0, c0868oO0oOoO2.OooO0oO, this.OooOOOO, false);
        C0868oO0oOoO c0868oO0oOoO3 = this.OooO00o;
        if (c0868oO0oOoO3.OooOo00) {
            int colorForState = c0868oO0oOoO3.OooO0o.getColorForState(getState(), 0);
            C1202oOoOOO0o c1202oOoOOO0o = this.OooOOOo;
            c1202oOoOOO0o.getClass();
            c1202oOoOOO0o.OooO0Oo = o0O0OO0.OooO0Oo(colorForState, 68);
            c1202oOoOOO0o.OooO0o0 = o0O0OO0.OooO0Oo(colorForState, 20);
            c1202oOoOOO0o.OooO0o = o0O0OO0.OooO0Oo(colorForState, 0);
            c1202oOoOOO0o.OooO00o.setColor(c1202oOoOOO0o.OooO0Oo);
        }
        if (!Objects.equals(porterDuffColorFilter, this.OooOOoo) || !Objects.equals(porterDuffColorFilter2, this.OooOo00)) {
            return true;
        }
        return false;
    }

    public final boolean OooOOO0(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.OooO00o.OooO0OO != null && color2 != (colorForState2 = this.OooO00o.OooO0OO.getColorForState(iArr, (color2 = (paint2 = this.OooOOO).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.OooO00o.OooO0Oo != null && color != (colorForState = this.OooO00o.OooO0Oo.getColorForState(iArr, (color = (paint = this.OooOOOO).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z;
    }

    public final void OooOOOO() {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        float f = c0868oO0oOoO.OooOOO + c0868oO0oOoO.OooOOOO;
        c0868oO0oOoO.OooOOo0 = (int) Math.ceil(0.75f * f);
        this.OooO00o.OooOOo = (int) Math.ceil(f * 0.25f);
        OooOOO();
        super.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
        if (r1 < 29) goto L35;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0875oO0oOooo.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.OooO00o.OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        if (c0868oO0oOoO.OooOOOo == 2) {
            return;
        }
        if (c0868oO0oOoO.OooO00o.OooO0Oo(OooO0oo())) {
            outline.setRoundRect(getBounds(), this.OooO00o.OooO00o.OooO0o0.OooO00o(OooO0oo()) * this.OooO00o.OooOO0);
            return;
        }
        RectF OooO0oo = OooO0oo();
        Path path = this.OooO0oO;
        OooO0O0(OooO0oo, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0421o0Oo0Oo0.OooO00o(outline, path);
        } else if (i >= 29) {
            try {
                AbstractC0419o0Oo0OOo.OooO00o(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0419o0Oo0OOo.OooO00o(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.OooO00o.OooO0oo;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.OooOO0O;
        region.set(bounds);
        RectF OooO0oo = OooO0oo();
        Path path = this.OooO0oO;
        OooO0O0(OooO0oo, path);
        Region region2 = this.OooOO0o;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.OooO0o0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.OooO00o.OooO0o) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.OooO00o.OooO0o0) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.OooO00o.OooO0Oo) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.OooO00o.OooO0OO) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.OooO00o = new C0868oO0oOoO(this.OooO00o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.OooO0o0 = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.ninja.engine.InterfaceC1288oOooO
    public boolean onStateChange(int[] iArr) {
        boolean z;
        boolean OooOOO0 = OooOOO0(iArr);
        boolean OooOOO = OooOOO();
        if (!OooOOO0 && !OooOOO) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        if (c0868oO0oOoO.OooOO0o != i) {
            c0868oO0oOoO.OooOO0o = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.OooO00o.getClass();
        super.invalidateSelf();
    }

    @Override // com.ninja.engine.InterfaceC1210oOoOOo
    public final void setShapeAppearanceModel(C1204oOoOOOO0 c1204oOoOOOO0) {
        this.OooO00o.OooO00o = c1204oOoOOOO0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.OooO00o.OooO0o = colorStateList;
        OooOOO();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0868oO0oOoO c0868oO0oOoO = this.OooO00o;
        if (c0868oO0oOoO.OooO0oO != mode) {
            c0868oO0oOoO.OooO0oO = mode;
            OooOOO();
            super.invalidateSelf();
        }
    }

    public C0875oO0oOooo(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C1204oOoOOOO0.OooO0O0(context, attributeSet, i, i2).OooO00o());
    }

    public C0875oO0oOooo(C0868oO0oOoO c0868oO0oOoO) {
        C1205oOoOOOOO c1205oOoOOOOO;
        this.OooO0O0 = new AbstractC1211oOoOOo0[4];
        this.OooO0OO = new AbstractC1211oOoOOo0[4];
        this.OooO0Oo = new BitSet(8);
        this.OooO0o = new Matrix();
        this.OooO0oO = new Path();
        this.OooO0oo = new Path();
        this.OooO = new RectF();
        this.OooOO0 = new RectF();
        this.OooOO0O = new Region();
        this.OooOO0o = new Region();
        Paint paint = new Paint(1);
        this.OooOOO = paint;
        Paint paint2 = new Paint(1);
        this.OooOOOO = paint2;
        this.OooOOOo = new C1202oOoOOO0o();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1205oOoOOOOO = AbstractC1203oOoOOOO.OooO00o;
        } else {
            c1205oOoOOOOO = new C1205oOoOOOOO();
        }
        this.OooOOo = c1205oOoOOOOO;
        this.OooOo0 = new RectF();
        this.OooOo0O = true;
        this.OooO00o = c0868oO0oOoO;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOOO();
        OooOOO0(getState());
        this.OooOOo0 = new C0331o0O0oo(20, this);
    }

    public C0875oO0oOooo(C1204oOoOOOO0 c1204oOoOOOO0) {
        this(new C0868oO0oOoO(c1204oOoOOOO0));
    }
}
