package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.app.framework.utils.FileUtils;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.oo00oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428oo00oOO extends AbstractC1420oo00o00 {
    public static final PorterDuff.Mode OooOO0 = PorterDuff.Mode.SRC_IN;
    public final Rect OooO;
    public C1429oo00oOO0 OooO0O0;
    public PorterDuffColorFilter OooO0OO;
    public ColorFilter OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public final float[] OooO0oO;
    public final Matrix OooO0oo;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, com.ninja.engine.oo00oOO0] */
    public C1428oo00oOO() {
        this.OooO0o = true;
        this.OooO0oO = new float[9];
        this.OooO0oo = new Matrix();
        this.OooO = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.OooO0OO = null;
        constantState.OooO0Oo = OooOO0;
        constantState.OooO0O0 = new C1433oo00oOoO();
        this.OooO0O0 = constantState;
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.OooO;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.OooO0Oo;
            if (colorFilter == null) {
                colorFilter = this.OooO0OO;
            }
            Matrix matrix = this.OooO0oo;
            canvas.getMatrix(matrix);
            float[] fArr = this.OooO0oO;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) FileUtils.FileMode.MODE_ISUID, (int) (rect.width() * abs));
            int min2 = Math.min((int) FileUtils.FileMode.MODE_ISUID, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && AbstractC0809oO0OooOO.Oooo00o(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
                Bitmap bitmap = c1429oo00oOO0.OooO0o;
                if (bitmap == null || min != bitmap.getWidth() || min2 != c1429oo00oOO0.OooO0o.getHeight()) {
                    c1429oo00oOO0.OooO0o = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    c1429oo00oOO0.OooOO0O = true;
                }
                if (!this.OooO0o) {
                    C1429oo00oOO0 c1429oo00oOO02 = this.OooO0O0;
                    c1429oo00oOO02.OooO0o.eraseColor(0);
                    Canvas canvas2 = new Canvas(c1429oo00oOO02.OooO0o);
                    C1433oo00oOoO c1433oo00oOoO = c1429oo00oOO02.OooO0O0;
                    c1433oo00oOoO.OooO00o(c1433oo00oOoO.OooO0oO, C1433oo00oOoO.OooOOOo, canvas2, min, min2);
                } else {
                    C1429oo00oOO0 c1429oo00oOO03 = this.OooO0O0;
                    if (c1429oo00oOO03.OooOO0O || c1429oo00oOO03.OooO0oO != c1429oo00oOO03.OooO0OO || c1429oo00oOO03.OooO0oo != c1429oo00oOO03.OooO0Oo || c1429oo00oOO03.OooOO0 != c1429oo00oOO03.OooO0o0 || c1429oo00oOO03.OooO != c1429oo00oOO03.OooO0O0.getRootAlpha()) {
                        C1429oo00oOO0 c1429oo00oOO04 = this.OooO0O0;
                        c1429oo00oOO04.OooO0o.eraseColor(0);
                        Canvas canvas3 = new Canvas(c1429oo00oOO04.OooO0o);
                        C1433oo00oOoO c1433oo00oOoO2 = c1429oo00oOO04.OooO0O0;
                        c1433oo00oOoO2.OooO00o(c1433oo00oOoO2.OooO0oO, C1433oo00oOoO.OooOOOo, canvas3, min, min2);
                        C1429oo00oOO0 c1429oo00oOO05 = this.OooO0O0;
                        c1429oo00oOO05.OooO0oO = c1429oo00oOO05.OooO0OO;
                        c1429oo00oOO05.OooO0oo = c1429oo00oOO05.OooO0Oo;
                        c1429oo00oOO05.OooO = c1429oo00oOO05.OooO0O0.getRootAlpha();
                        c1429oo00oOO05.OooOO0 = c1429oo00oOO05.OooO0o0;
                        c1429oo00oOO05.OooOO0O = false;
                    }
                }
                C1429oo00oOO0 c1429oo00oOO06 = this.OooO0O0;
                if (c1429oo00oOO06.OooO0O0.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (c1429oo00oOO06.OooOO0o == null) {
                        Paint paint2 = new Paint();
                        c1429oo00oOO06.OooOO0o = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    c1429oo00oOO06.OooOO0o.setAlpha(c1429oo00oOO06.OooO0O0.getRootAlpha());
                    c1429oo00oOO06.OooOO0o.setColorFilter(colorFilter);
                    paint = c1429oo00oOO06.OooOO0o;
                }
                canvas.drawBitmap(c1429oo00oOO06.OooO0o, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.OooO0O0.OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.OooO0O0.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.OooO00o != null && Build.VERSION.SDK_INT >= 24) {
            return new C1432oo00oOo(this.OooO00o.getConstantState());
        }
        this.OooO0O0.OooO00o = getChangingConfigurations();
        return this.OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.OooO0O0.OooO0O0.OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.OooO0O0.OooO0O0.OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.OooO0O0.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
            if (c1429oo00oOO0 != null) {
                C1433oo00oOoO c1433oo00oOoO = c1429oo00oOO0.OooO0O0;
                if (c1433oo00oOoO.OooOOO == null) {
                    c1433oo00oOoO.OooOOO = Boolean.valueOf(c1433oo00oOoO.OooO0oO.OooO00o());
                }
                if (c1433oo00oOoO.OooOOO.booleanValue() || ((colorStateList = this.OooO0O0.OooO0OO) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, com.ninja.engine.oo00oOO0] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.OooO0o0 && super.mutate() == this) {
            C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
            ?? constantState = new Drawable.ConstantState();
            constantState.OooO0OO = null;
            constantState.OooO0Oo = OooOO0;
            if (c1429oo00oOO0 != null) {
                constantState.OooO00o = c1429oo00oOO0.OooO00o;
                C1433oo00oOoO c1433oo00oOoO = new C1433oo00oOoO(c1429oo00oOO0.OooO0O0);
                constantState.OooO0O0 = c1433oo00oOoO;
                if (c1429oo00oOO0.OooO0O0.OooO0o0 != null) {
                    c1433oo00oOoO.OooO0o0 = new Paint(c1429oo00oOO0.OooO0O0.OooO0o0);
                }
                if (c1429oo00oOO0.OooO0O0.OooO0Oo != null) {
                    constantState.OooO0O0.OooO0Oo = new Paint(c1429oo00oOO0.OooO0O0.OooO0Oo);
                }
                constantState.OooO0OO = c1429oo00oOO0.OooO0OO;
                constantState.OooO0Oo = c1429oo00oOO0.OooO0Oo;
                constantState.OooO0o0 = c1429oo00oOO0.OooO0o0;
            }
            this.OooO0O0 = constantState;
            this.OooO0o0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
        ColorStateList colorStateList = c1429oo00oOO0.OooO0OO;
        if (colorStateList != null && (mode = c1429oo00oOO0.OooO0Oo) != null) {
            this.OooO0OO = OooO00o(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        C1433oo00oOoO c1433oo00oOoO = c1429oo00oOO0.OooO0O0;
        if (c1433oo00oOoO.OooOOO == null) {
            c1433oo00oOoO.OooOOO = Boolean.valueOf(c1433oo00oOoO.OooO0oO.OooO00o());
        }
        if (c1433oo00oOoO.OooOOO.booleanValue()) {
            boolean OooO0O0 = c1429oo00oOO0.OooO0O0.OooO0oO.OooO0O0(iArr);
            c1429oo00oOO0.OooOO0O |= OooO0O0;
            if (OooO0O0) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.OooO0O0.OooO0O0.getRootAlpha() != i) {
            this.OooO0O0.OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.OooO0O0.OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.OooO0Oo = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            AbstractC0809oO0OooOO.o0OoOo0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
        if (c1429oo00oOO0.OooO0OO != colorStateList) {
            c1429oo00oOO0.OooO0OO = colorStateList;
            this.OooO0OO = OooO00o(colorStateList, c1429oo00oOO0.OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
        if (c1429oo00oOO0.OooO0Oo != mode) {
            c1429oo00oOO0.OooO0Oo = mode;
            this.OooO0OO = OooO00o(c1429oo00oOO0.OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v35, types: [com.ninja.engine.oo00oO0o, com.ninja.engine.oo00o00O, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1433oo00oOoO c1433oo00oOoO;
        int i;
        Paint.Cap cap;
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1429oo00oOO0 c1429oo00oOO0 = this.OooO0O0;
        c1429oo00oOO0.OooO0O0 = new C1433oo00oOoO();
        TypedArray OooO = AbstractC1137oOOoooO.OooO(resources, theme, attributeSet, AbstractC0692o0ooooOo.OooO00o);
        C1429oo00oOO0 c1429oo00oOO02 = this.OooO0O0;
        C1433oo00oOoO c1433oo00oOoO2 = c1429oo00oOO02.OooO0O0;
        int i2 = !AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "tintMode") ? -1 : OooO.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1429oo00oOO02.OooO0Oo = mode;
        ColorStateList colorStateList = null;
        if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            OooO.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i4 >= 28 && i4 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = OooO.getResources();
                int resourceId = OooO.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0641o0ooO.OooO00o;
                try {
                    colorStateList = AbstractC0641o0ooO.OooO00o(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c1429oo00oOO02.OooO0OO = colorStateList2;
        }
        boolean z = c1429oo00oOO02.OooO0o0;
        if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "autoMirrored")) {
            z = OooO.getBoolean(5, z);
        }
        c1429oo00oOO02.OooO0o0 = z;
        float f = c1433oo00oOoO2.OooOO0;
        if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "viewportWidth")) {
            f = OooO.getFloat(7, f);
        }
        c1433oo00oOoO2.OooOO0 = f;
        float f2 = c1433oo00oOoO2.OooOO0O;
        if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "viewportHeight")) {
            f2 = OooO.getFloat(8, f2);
        }
        c1433oo00oOoO2.OooOO0O = f2;
        if (c1433oo00oOoO2.OooOO0 <= 0.0f) {
            throw new XmlPullParserException(OooO.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f2 <= 0.0f) {
            throw new XmlPullParserException(OooO.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c1433oo00oOoO2.OooO0oo = OooO.getDimension(3, c1433oo00oOoO2.OooO0oo);
            float dimension = OooO.getDimension(2, c1433oo00oOoO2.OooO);
            c1433oo00oOoO2.OooO = dimension;
            if (c1433oo00oOoO2.OooO0oo <= 0.0f) {
                throw new XmlPullParserException(OooO.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = c1433oo00oOoO2.getAlpha();
                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "alpha")) {
                    alpha = OooO.getFloat(4, alpha);
                }
                c1433oo00oOoO2.setAlpha(alpha);
                String string = OooO.getString(0);
                if (string != null) {
                    c1433oo00oOoO2.OooOOO0 = string;
                    c1433oo00oOoO2.OooOOOO.put(string, c1433oo00oOoO2);
                }
                OooO.recycle();
                c1429oo00oOO0.OooO00o = getChangingConfigurations();
                c1429oo00oOO0.OooOO0O = true;
                C1429oo00oOO0 c1429oo00oOO03 = this.OooO0O0;
                C1433oo00oOoO c1433oo00oOoO3 = c1429oo00oOO03.OooO0O0;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c1433oo00oOoO3.OooO0oO);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i3); i5 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1425oo00oO0 c1425oo00oO0 = (C1425oo00oO0) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        C0145o00OO0oO c0145o00OO0oO = c1433oo00oOoO3.OooOOOO;
                        c1433oo00oOoO = c1433oo00oOoO3;
                        if (equals) {
                            ?? abstractC1427oo00oO0o = new AbstractC1427oo00oO0o();
                            abstractC1427oo00oO0o.OooO0o = 0.0f;
                            abstractC1427oo00oO0o.OooO0oo = 1.0f;
                            abstractC1427oo00oO0o.OooO = 1.0f;
                            abstractC1427oo00oO0o.OooOO0 = 0.0f;
                            abstractC1427oo00oO0o.OooOO0O = 1.0f;
                            abstractC1427oo00oO0o.OooOO0o = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            abstractC1427oo00oO0o.OooOOO0 = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            abstractC1427oo00oO0o.OooOOO = join;
                            i = depth;
                            abstractC1427oo00oO0o.OooOOOO = 4.0f;
                            TypedArray OooO2 = AbstractC1137oOOoooO.OooO(resources, theme, attributeSet, AbstractC0692o0ooooOo.OooO0OO);
                            if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "pathData")) {
                                String string2 = OooO2.getString(0);
                                if (string2 != null) {
                                    abstractC1427oo00oO0o.OooO0O0 = string2;
                                }
                                String string3 = OooO2.getString(2);
                                if (string3 != null) {
                                    abstractC1427oo00oO0o.OooO00o = AbstractC0694o0ooooo0.OooOOOO(string3);
                                }
                                abstractC1427oo00oO0o.OooO0oO = AbstractC1137oOOoooO.OooO0o0(OooO2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = abstractC1427oo00oO0o.OooO;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "fillAlpha")) {
                                    f3 = OooO2.getFloat(12, f3);
                                }
                                abstractC1427oo00oO0o.OooO = f3;
                                int i6 = !AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "strokeLineCap") ? -1 : OooO2.getInt(8, -1);
                                Paint.Cap cap3 = abstractC1427oo00oO0o.OooOOO0;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                abstractC1427oo00oO0o.OooOOO0 = cap;
                                int i7 = !AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "strokeLineJoin") ? -1 : OooO2.getInt(9, -1);
                                Paint.Join join2 = abstractC1427oo00oO0o.OooOOO;
                                if (i7 != 0) {
                                    if (i7 != 1) {
                                        join = i7 != 2 ? join2 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                }
                                abstractC1427oo00oO0o.OooOOO = join;
                                float f4 = abstractC1427oo00oO0o.OooOOOO;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = OooO2.getFloat(10, f4);
                                }
                                abstractC1427oo00oO0o.OooOOOO = f4;
                                abstractC1427oo00oO0o.OooO0o0 = AbstractC1137oOOoooO.OooO0o0(OooO2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = abstractC1427oo00oO0o.OooO0oo;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "strokeAlpha")) {
                                    f5 = OooO2.getFloat(11, f5);
                                }
                                abstractC1427oo00oO0o.OooO0oo = f5;
                                float f6 = abstractC1427oo00oO0o.OooO0o;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "strokeWidth")) {
                                    f6 = OooO2.getFloat(4, f6);
                                }
                                abstractC1427oo00oO0o.OooO0o = f6;
                                float f7 = abstractC1427oo00oO0o.OooOO0O;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "trimPathEnd")) {
                                    f7 = OooO2.getFloat(6, f7);
                                }
                                abstractC1427oo00oO0o.OooOO0O = f7;
                                float f8 = abstractC1427oo00oO0o.OooOO0o;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "trimPathOffset")) {
                                    f8 = OooO2.getFloat(7, f8);
                                }
                                abstractC1427oo00oO0o.OooOO0o = f8;
                                float f9 = abstractC1427oo00oO0o.OooOO0;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "trimPathStart")) {
                                    f9 = OooO2.getFloat(5, f9);
                                }
                                abstractC1427oo00oO0o.OooOO0 = f9;
                                int i8 = abstractC1427oo00oO0o.OooO0OO;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "fillType")) {
                                    i8 = OooO2.getInt(13, i8);
                                }
                                abstractC1427oo00oO0o.OooO0OO = i8;
                            }
                            OooO2.recycle();
                            c1425oo00oO0.OooO0O0.add(abstractC1427oo00oO0o);
                            if (abstractC1427oo00oO0o.getPathName() != null) {
                                c0145o00OO0oO.put(abstractC1427oo00oO0o.getPathName(), abstractC1427oo00oO0o);
                            }
                            c1429oo00oOO03.OooO00o |= abstractC1427oo00oO0o.OooO0Oo;
                            z2 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                AbstractC1427oo00oO0o abstractC1427oo00oO0o2 = new AbstractC1427oo00oO0o();
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "pathData")) {
                                    TypedArray OooO3 = AbstractC1137oOOoooO.OooO(resources, theme, attributeSet, AbstractC0692o0ooooOo.OooO0Oo);
                                    String string4 = OooO3.getString(0);
                                    if (string4 != null) {
                                        abstractC1427oo00oO0o2.OooO0O0 = string4;
                                    }
                                    String string5 = OooO3.getString(1);
                                    if (string5 != null) {
                                        abstractC1427oo00oO0o2.OooO00o = AbstractC0694o0ooooo0.OooOOOO(string5);
                                    }
                                    abstractC1427oo00oO0o2.OooO0OO = !AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "fillType") ? 0 : OooO3.getInt(2, 0);
                                    OooO3.recycle();
                                }
                                c1425oo00oO0.OooO0O0.add(abstractC1427oo00oO0o2);
                                if (abstractC1427oo00oO0o2.getPathName() != null) {
                                    c0145o00OO0oO.put(abstractC1427oo00oO0o2.getPathName(), abstractC1427oo00oO0o2);
                                }
                                c1429oo00oOO03.OooO00o |= abstractC1427oo00oO0o2.OooO0Oo;
                            } else if ("group".equals(name)) {
                                C1425oo00oO0 c1425oo00oO02 = new C1425oo00oO0();
                                TypedArray OooO4 = AbstractC1137oOOoooO.OooO(resources, theme, attributeSet, AbstractC0692o0ooooOo.OooO0O0);
                                float f10 = c1425oo00oO02.OooO0OO;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "rotation")) {
                                    f10 = OooO4.getFloat(5, f10);
                                }
                                c1425oo00oO02.OooO0OO = f10;
                                c1425oo00oO02.OooO0Oo = OooO4.getFloat(1, c1425oo00oO02.OooO0Oo);
                                c1425oo00oO02.OooO0o0 = OooO4.getFloat(2, c1425oo00oO02.OooO0o0);
                                float f11 = c1425oo00oO02.OooO0o;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "scaleX")) {
                                    f11 = OooO4.getFloat(3, f11);
                                }
                                c1425oo00oO02.OooO0o = f11;
                                float f12 = c1425oo00oO02.OooO0oO;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "scaleY")) {
                                    f12 = OooO4.getFloat(4, f12);
                                }
                                c1425oo00oO02.OooO0oO = f12;
                                float f13 = c1425oo00oO02.OooO0oo;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "translateX")) {
                                    f13 = OooO4.getFloat(6, f13);
                                }
                                c1425oo00oO02.OooO0oo = f13;
                                float f14 = c1425oo00oO02.OooO;
                                if (AbstractC1137oOOoooO.OooO0oO(xmlPullParser, "translateY")) {
                                    f14 = OooO4.getFloat(7, f14);
                                }
                                c1425oo00oO02.OooO = f14;
                                String string6 = OooO4.getString(0);
                                if (string6 != null) {
                                    c1425oo00oO02.OooOO0o = string6;
                                }
                                c1425oo00oO02.OooO0OO();
                                OooO4.recycle();
                                c1425oo00oO0.OooO0O0.add(c1425oo00oO02);
                                arrayDeque.push(c1425oo00oO02);
                                if (c1425oo00oO02.getGroupName() != null) {
                                    c0145o00OO0oO.put(c1425oo00oO02.getGroupName(), c1425oo00oO02);
                                }
                                c1429oo00oOO03.OooO00o = c1425oo00oO02.OooOO0O | c1429oo00oOO03.OooO00o;
                            }
                        }
                        i3 = 3;
                    } else {
                        c1433oo00oOoO = c1433oo00oOoO3;
                        i = depth;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    c1433oo00oOoO3 = c1433oo00oOoO;
                    depth = i;
                }
                if (!z2) {
                    this.OooO0OO = OooO00o(c1429oo00oOO0.OooO0OO, c1429oo00oOO0.OooO0Oo);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(OooO.getPositionDescription() + "<vector> tag requires height > 0");
            }
        }
    }

    public C1428oo00oOO(C1429oo00oOO0 c1429oo00oOO0) {
        this.OooO0o = true;
        this.OooO0oO = new float[9];
        this.OooO0oo = new Matrix();
        this.OooO = new Rect();
        this.OooO0O0 = c1429oo00oOO0;
        this.OooO0OO = OooO00o(c1429oo00oOO0.OooO0OO, c1429oo00oOO0.OooO0Oo);
    }
}
