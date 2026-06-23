package com.ninja.engine;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.ninja.engine.o00OoooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0185o00OoooO extends ProgressBar {
    public final RunnableC0184o00OooOo OooO;
    public final oO0O OooO00o;
    public int OooO0O0;
    public boolean OooO0OO;
    public final boolean OooO0Oo;
    public o000O0O0 OooO0o;
    public final int OooO0o0;
    public boolean OooO0oO;
    public int OooO0oo;
    public final RunnableC0184o00OooOo OooOO0;
    public final C0291o0O00o0 OooOO0O;
    public final C0291o0O00o0 OooOO0o;

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, com.ninja.engine.oO0O] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.ninja.engine.o000O0O0, java.lang.Object] */
    public AbstractC0185o00OoooO(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2131952714), attributeSet, R.attr.linearProgressIndicatorStyle);
        int OooOO0o;
        boolean z;
        this.OooO0oO = false;
        this.OooO0oo = 4;
        this.OooO = new RunnableC0184o00OooOo(this, 0);
        this.OooOO0 = new RunnableC0184o00OooOo(this, 1);
        this.OooOO0O = new C0291o0O00o0(this, 0);
        this.OooOO0o = new C0291o0O00o0(this, 1);
        Context context2 = getContext();
        Object obj = new Object();
        obj.OooO0OO = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = AbstractC1038oOOOoo0O.OooO0O0;
        AbstractC0692o0ooooOo.OooOO0(context2, attributeSet, R.attr.linearProgressIndicatorStyle, 2131952677);
        AbstractC0692o0ooooOo.OooOO0O(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2131952677, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2131952677);
        obj.OooO00o = AbstractC0809oO0OooOO.Oooo000(context2, obtainStyledAttributes, 9, dimensionPixelSize);
        obj.OooO0O0 = Math.min(AbstractC0809oO0OooOO.Oooo000(context2, obtainStyledAttributes, 8, 0), obj.OooO00o / 2);
        obj.OooO0o0 = obtainStyledAttributes.getInt(5, 0);
        obj.OooO0o = obtainStyledAttributes.getInt(1, 0);
        obj.OooO0oO = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            obj.OooO0OO = new int[]{AbstractC0694o0ooooo0.OooOo0o(context2, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            obj.OooO0OO = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            obj.OooO0OO = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(7)) {
            OooOO0o = obtainStyledAttributes.getColor(7, -1);
        } else {
            obj.OooO0Oo = obj.OooO0OO[0];
            TypedArray obtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            OooOO0o = AbstractC0694o0ooooo0.OooOO0o(obj.OooO0Oo, (int) (f * 255.0f));
        }
        obj.OooO0Oo = OooOO0o;
        obtainStyledAttributes.recycle();
        int[] iArr2 = AbstractC1038oOOOoo0O.OooOO0o;
        AbstractC0692o0ooooOo.OooOO0(context2, attributeSet, R.attr.linearProgressIndicatorStyle, 2131952677);
        AbstractC0692o0ooooOo.OooOO0O(context2, attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, 2131952677, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, R.attr.linearProgressIndicatorStyle, 2131952677);
        obj.OooO0oo = obtainStyledAttributes3.getInt(0, 1);
        obj.OooO = obtainStyledAttributes3.getInt(1, 0);
        obj.OooOO0O = Math.min(obtainStyledAttributes3.getDimensionPixelSize(2, 0), obj.OooO00o);
        obtainStyledAttributes3.recycle();
        obj.OooO00o();
        if (obj.OooO == 1) {
            z = true;
        } else {
            z = false;
        }
        obj.OooOO0 = z;
        this.OooO00o = obj;
        AbstractC0692o0ooooOo.OooOO0(context2, attributeSet, R.attr.linearProgressIndicatorStyle, 2131952677);
        AbstractC0692o0ooooOo.OooOO0O(context2, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2131952677, new int[0]);
        TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2131952677);
        obtainStyledAttributes4.getInt(6, -1);
        this.OooO0o0 = Math.min(obtainStyledAttributes4.getInt(4, -1), (int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        obtainStyledAttributes4.recycle();
        this.OooO0o = new Object();
        this.OooO0Oo = true;
    }

    private AbstractC0424o0Oo0o00 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().OooOO0o;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().OooOO0o;
        }
    }

    public void OooO00o(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.OooO0O0 = i;
                this.OooO0OO = z;
                this.OooO0oO = true;
                if (getIndeterminateDrawable().isVisible()) {
                    o000O0O0 o000o0o0 = this.OooO0o;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    o000o0o0.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().OooOOO0.OooOOO();
                        return;
                    }
                }
                this.OooOO0O.OooO00o(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null && !z) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0O0() {
        /*
            r2 = this;
            java.util.WeakHashMap r0 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L2c
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            r0 = r2
        Lf:
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L16
            goto L2c
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L23
            int r0 = r2.getWindowVisibility()
            if (r0 != 0) goto L2c
            goto L27
        L23:
            boolean r1 = r0 instanceof android.view.View
            if (r1 != 0) goto L29
        L27:
            r0 = 1
            goto L2d
        L29:
            android.view.View r0 = (android.view.View) r0
            goto Lf
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0185o00OoooO.OooO0O0():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.OooO00o.OooO0o;
    }

    public int[] getIndicatorColor() {
        return this.OooO00o.OooO0OO;
    }

    public int getIndicatorTrackGapSize() {
        return this.OooO00o.OooO0oO;
    }

    public int getShowAnimationBehavior() {
        return this.OooO00o.OooO0o0;
    }

    public int getTrackColor() {
        return this.OooO00o.OooO0Oo;
    }

    public int getTrackCornerRadius() {
        return this.OooO00o.OooO0O0;
    }

    public int getTrackThickness() {
        return this.OooO00o.OooO00o;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooOOO0.OooOOO0(this.OooOO0O);
        }
        C0380o0OOo0OO progressDrawable = getProgressDrawable();
        C0291o0O00o0 c0291o0O00o0 = this.OooOO0o;
        if (progressDrawable != null) {
            C0380o0OOo0OO progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.OooO0o == null) {
                progressDrawable2.OooO0o = new ArrayList();
            }
            if (!progressDrawable2.OooO0o.contains(c0291o0O00o0)) {
                progressDrawable2.OooO0o.add(c0291o0O00o0);
            }
        }
        if (getIndeterminateDrawable() != null) {
            oO00Oo0 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.OooO0o == null) {
                indeterminateDrawable.OooO0o = new ArrayList();
            }
            if (!indeterminateDrawable.OooO0o.contains(c0291o0O00o0)) {
                indeterminateDrawable.OooO0o.add(c0291o0O00o0);
            }
        }
        if (OooO0O0()) {
            if (this.OooO0o0 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.OooOO0);
        removeCallbacks(this.OooO);
        ((AbstractC0429o0Oo0oOo) getCurrentDrawable()).OooO0OO(false, false, false);
        oO00Oo0 indeterminateDrawable = getIndeterminateDrawable();
        C0291o0O00o0 c0291o0O00o0 = this.OooOO0o;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().OooO0o0(c0291o0O00o0);
            getIndeterminateDrawable().OooOOO0.OooOOo0();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO0o0(c0291o0O00o0);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int paddingTop;
        try {
            AbstractC0424o0Oo0o00 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            if (((C1780ooOOO0Oo) currentDrawingDelegate).OooO00o.OooO00o < 0) {
                paddingTop = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                paddingTop = ((C1780ooOOO0Oo) currentDrawingDelegate).OooO00o.OooO00o + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(defaultSize, paddingTop);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.OooO0Oo) {
            ((AbstractC0429o0Oo0oOo) getCurrentDrawable()).OooO0OO(OooO0O0(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.OooO0Oo) {
            ((AbstractC0429o0Oo0oOo) getCurrentDrawable()).OooO0OO(OooO0O0(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(o000O0O0 o000o0o0) {
        this.OooO0o = o000o0o0;
        if (getProgressDrawable() != null) {
            getProgressDrawable().OooO0OO = o000o0o0;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().OooO0OO = o000o0o0;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.OooO00o.OooO0o = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo = (AbstractC0429o0Oo0oOo) getCurrentDrawable();
            if (abstractC0429o0Oo0oOo != null) {
                abstractC0429o0Oo0oOo.OooO0OO(false, false, false);
            }
            super.setIndeterminate(z);
            AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo2 = (AbstractC0429o0Oo0oOo) getCurrentDrawable();
            if (abstractC0429o0Oo0oOo2 != null) {
                abstractC0429o0Oo0oOo2.OooO0OO(OooO0O0(), false, false);
            }
            if ((abstractC0429o0Oo0oOo2 instanceof oO00Oo0) && OooO0O0()) {
                ((oO00Oo0) abstractC0429o0Oo0oOo2).OooOOO0.OooOOOo();
            }
            this.OooO0oO = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof oO00Oo0) {
            ((AbstractC0429o0Oo0oOo) drawable).OooO0OO(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{AbstractC0694o0ooooo0.OooOo0o(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.OooO00o.OooO0OO = iArr;
            getIndeterminateDrawable().OooOOO0.OooOO0();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i) {
        oO0O oo0o = this.OooO00o;
        if (oo0o.OooO0oO != i) {
            oo0o.OooO0oO = i;
            oo0o.OooO00o();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        OooO00o(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof C0380o0OOo0OO) {
            C0380o0OOo0OO c0380o0OOo0OO = (C0380o0OOo0OO) drawable;
            c0380o0OOo0OO.OooO0OO(false, false, false);
            super.setProgressDrawable(c0380o0OOo0OO);
            c0380o0OOo0OO.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.OooO00o.OooO0o0 = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        oO0O oo0o = this.OooO00o;
        if (oo0o.OooO0Oo != i) {
            oo0o.OooO0Oo = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        oO0O oo0o = this.OooO00o;
        if (oo0o.OooO0O0 != i) {
            oo0o.OooO0O0 = Math.min(i, oo0o.OooO00o / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        oO0O oo0o = this.OooO00o;
        if (oo0o.OooO00o != i) {
            oo0o.OooO00o = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.OooO0oo = i;
    }

    @Override // android.widget.ProgressBar
    public oO00Oo0 getIndeterminateDrawable() {
        return (oO00Oo0) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C0380o0OOo0OO getProgressDrawable() {
        return (C0380o0OOo0OO) super.getProgressDrawable();
    }
}

