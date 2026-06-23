package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ninja.engine.AbstractC1030oOOOoOOO;
import com.ninja.engine.C0415o0Oo0O0O;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C1146oOo0000;
import com.ninja.engine.R;
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] OooO0o = {16842801};
    public static final C0455o0OoOo00 OooO0oO = new C0455o0OoOo00(23);
    public boolean OooO00o;
    public boolean OooO0O0;
    public final Rect OooO0OO;
    public final Rect OooO0Oo;
    public final C0415o0Oo0O0O OooO0o0;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        Resources resources;
        int i;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.OooO0OO = rect;
        this.OooO0Oo = new Rect();
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(10, this);
        this.OooO0o0 = c0415o0Oo0O0O;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1030oOOOoOOO.OooO00o, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(OooO0o);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i = R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.OooO00o = obtainStyledAttributes.getBoolean(7, false);
        this.OooO0O0 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0455o0OoOo00 c0455o0OoOo00 = OooO0oO;
        C1146oOo0000 c1146oOo0000 = new C1146oOo0000(valueOf, dimension);
        c0415o0Oo0O0O.OooO0O0 = c1146oOo0000;
        setBackgroundDrawable(c1146oOo0000);
        setClipToOutline(true);
        setElevation(dimension2);
        c0455o0OoOo00.OooOo(c0415o0Oo0O0O, dimension3);
    }

    public static /* synthetic */ void OooO00o(CardView cardView, int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C1146oOo0000) ((Drawable) this.OooO0o0.OooO0O0)).OooO0oo;
    }

    public float getCardElevation() {
        return ((CardView) this.OooO0o0.OooO0OO).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.OooO0OO.bottom;
    }

    public int getContentPaddingLeft() {
        return this.OooO0OO.left;
    }

    public int getContentPaddingRight() {
        return this.OooO0OO.right;
    }

    public int getContentPaddingTop() {
        return this.OooO0OO.top;
    }

    public float getMaxCardElevation() {
        return ((C1146oOo0000) ((Drawable) this.OooO0o0.OooO0O0)).OooO0o0;
    }

    public boolean getPreventCornerOverlap() {
        return this.OooO0O0;
    }

    public float getRadius() {
        return ((C1146oOo0000) ((Drawable) this.OooO0o0.OooO0O0)).OooO00o;
    }

    public boolean getUseCompatPadding() {
        return this.OooO00o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C1146oOo0000 c1146oOo0000 = (C1146oOo0000) ((Drawable) this.OooO0o0.OooO0O0);
        if (valueOf == null) {
            c1146oOo0000.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c1146oOo0000.OooO0oo = valueOf;
        c1146oOo0000.OooO0O0.setColor(valueOf.getColorForState(c1146oOo0000.getState(), c1146oOo0000.OooO0oo.getDefaultColor()));
        c1146oOo0000.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.OooO0o0.OooO0OO).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        OooO0oO.OooOo(this.OooO0o0, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.OooO0O0) {
            this.OooO0O0 = z;
            C0455o0OoOo00 c0455o0OoOo00 = OooO0oO;
            C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO0o0;
            c0455o0OoOo00.OooOo(c0415o0Oo0O0O, ((C1146oOo0000) ((Drawable) c0415o0Oo0O0O.OooO0O0)).OooO0o0);
        }
    }

    public void setRadius(float f) {
        C1146oOo0000 c1146oOo0000 = (C1146oOo0000) ((Drawable) this.OooO0o0.OooO0O0);
        if (f != c1146oOo0000.OooO00o) {
            c1146oOo0000.OooO00o = f;
            c1146oOo0000.OooO0O0(null);
            c1146oOo0000.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.OooO00o != z) {
            this.OooO00o = z;
            C0455o0OoOo00 c0455o0OoOo00 = OooO0oO;
            C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO0o0;
            c0455o0OoOo00.OooOo(c0415o0Oo0O0O, ((C1146oOo0000) ((Drawable) c0415o0Oo0O0O.OooO0O0)).OooO0o0);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C1146oOo0000 c1146oOo0000 = (C1146oOo0000) ((Drawable) this.OooO0o0.OooO0O0);
        if (colorStateList == null) {
            c1146oOo0000.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c1146oOo0000.OooO0oo = colorStateList;
        c1146oOo0000.OooO0O0.setColor(colorStateList.getColorForState(c1146oOo0000.getState(), c1146oOo0000.OooO0oo.getDefaultColor()));
        c1146oOo0000.invalidateSelf();
    }
}
