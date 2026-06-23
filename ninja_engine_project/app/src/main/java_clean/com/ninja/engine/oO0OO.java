package com.ninja.engine;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class oO0OO extends AbstractC1065oOOo0OOo {
    public static final int[] OooOoo = {16842919};
    public static final int[] OooOooO = new int[0];
    public final int OooO;
    public final int OooO00o;
    public final int OooO0O0;
    public final StateListDrawable OooO0OO;
    public final Drawable OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final StateListDrawable OooO0oO;
    public final Drawable OooO0oo;
    public final int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public float OooOOO0;
    public int OooOOOO;
    public float OooOOOo;
    public final RecyclerView OooOOoo;
    public final ValueAnimator OooOoO;
    public int OooOoOO;
    public final o00000OO OooOoo0;
    public int OooOOo0 = 0;
    public int OooOOo = 0;
    public boolean OooOo00 = false;
    public boolean OooOo0 = false;
    public int OooOo0O = 0;
    public int OooOo0o = 0;
    public final int[] OooOo = new int[2];
    public final int[] OooOoO0 = new int[2];

    public oO0OO(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.OooOoO = ofFloat;
        this.OooOoOO = 0;
        o00000OO o00000oo = new o00000OO(10, this);
        this.OooOoo0 = o00000oo;
        C0537o0o0O0oo c0537o0o0O0oo = new C0537o0o0O0oo(this);
        this.OooO0OO = stateListDrawable;
        this.OooO0Oo = drawable;
        this.OooO0oO = stateListDrawable2;
        this.OooO0oo = drawable2;
        this.OooO0o0 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.OooO0o = Math.max(i, drawable.getIntrinsicWidth());
        this.OooO = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.OooOO0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.OooO00o = i2;
        this.OooO0O0 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0788oO0Oo(this));
        ofFloat.addUpdateListener(new C0251o00oo000(1, this));
        RecyclerView recyclerView2 = this.OooOOoo;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = recyclerView2.OooOOO0;
            if (abstractC1066oOOo0Oo != null) {
                abstractC1066oOOo0Oo.OooO0OO("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.OooOOO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.Oooo0oO();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.OooOOoo;
            recyclerView3.OooOOOO.remove(this);
            if (recyclerView3.OooOOOo == this) {
                recyclerView3.OooOOOo = null;
            }
            ArrayList arrayList2 = this.OooOOoo.OooooO0;
            if (arrayList2 != null) {
                arrayList2.remove(c0537o0o0O0oo);
            }
            this.OooOOoo.removeCallbacks(o00000oo);
        }
        this.OooOOoo = recyclerView;
        if (recyclerView != null) {
            recyclerView.OooO0oO(this);
            this.OooOOoo.OooOOOO.add(this);
            this.OooOOoo.OooO0oo(c0537o0o0O0oo);
        }
    }

    public static int OooO0o0(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // com.ninja.engine.AbstractC1065oOOo0OOo
    public final void OooO0O0(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2 = this.OooOOo0;
        RecyclerView recyclerView2 = this.OooOOoo;
        if (i2 == recyclerView2.getWidth() && this.OooOOo == recyclerView2.getHeight()) {
            if (this.OooOoOO != 0) {
                if (this.OooOo00) {
                    int i3 = this.OooOOo0;
                    int i4 = this.OooO0o0;
                    int i5 = i3 - i4;
                    int i6 = this.OooOO0o;
                    int i7 = this.OooOO0O;
                    int i8 = i6 - (i7 / 2);
                    StateListDrawable stateListDrawable = this.OooO0OO;
                    stateListDrawable.setBounds(0, 0, i4, i7);
                    int i9 = this.OooOOo;
                    int i10 = this.OooO0o;
                    Drawable drawable = this.OooO0Oo;
                    drawable.setBounds(0, 0, i10, i9);
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (recyclerView2.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i4, i8);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        i = -i4;
                    } else {
                        canvas.translate(i5, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i8);
                        stateListDrawable.draw(canvas);
                        i = -i5;
                    }
                    canvas.translate(i, -i8);
                }
                if (this.OooOo0) {
                    int i11 = this.OooOOo;
                    int i12 = this.OooO;
                    int i13 = i11 - i12;
                    int i14 = this.OooOOOO;
                    int i15 = this.OooOOO;
                    int i16 = i14 - (i15 / 2);
                    StateListDrawable stateListDrawable2 = this.OooO0oO;
                    stateListDrawable2.setBounds(0, 0, i15, i12);
                    int i17 = this.OooOOo0;
                    int i18 = this.OooOO0;
                    Drawable drawable2 = this.OooO0oo;
                    drawable2.setBounds(0, 0, i17, i18);
                    canvas.translate(0.0f, i13);
                    drawable2.draw(canvas);
                    canvas.translate(i16, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i16, -i13);
                    return;
                }
                return;
            }
            return;
        }
        this.OooOOo0 = recyclerView2.getWidth();
        this.OooOOo = recyclerView2.getHeight();
        OooO0o(0);
    }

    public final boolean OooO0OO(float f, float f2) {
        if (f2 >= this.OooOOo - this.OooO) {
            int i = this.OooOOOO;
            int i2 = this.OooOOO;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.OooOOoo;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (recyclerView.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.OooO0o0;
        if (z) {
            if (f > i / 2) {
                return false;
            }
        } else if (f < this.OooOOo0 - i) {
            return false;
        }
        int i2 = this.OooOO0o;
        int i3 = this.OooOO0O / 2;
        if (f2 < i2 - i3 || f2 > i3 + i2) {
            return false;
        }
        return true;
    }

    public final void OooO0o(int i) {
        RecyclerView recyclerView;
        int i2;
        o00000OO o00000oo = this.OooOoo0;
        StateListDrawable stateListDrawable = this.OooO0OO;
        if (i == 2 && this.OooOo0O != 2) {
            stateListDrawable.setState(OooOoo);
            this.OooOOoo.removeCallbacks(o00000oo);
        }
        if (i == 0) {
            this.OooOOoo.invalidate();
        } else {
            OooO0oO();
        }
        if (this.OooOo0O == 2 && i != 2) {
            stateListDrawable.setState(OooOooO);
            this.OooOOoo.removeCallbacks(o00000oo);
            recyclerView = this.OooOOoo;
            i2 = 1200;
        } else {
            if (i == 1) {
                this.OooOOoo.removeCallbacks(o00000oo);
                recyclerView = this.OooOOoo;
                i2 = 1500;
            }
            this.OooOo0O = i;
        }
        recyclerView.postDelayed(o00000oo, i2);
        this.OooOo0O = i;
    }

    public final void OooO0oO() {
        int i = this.OooOoOO;
        ValueAnimator valueAnimator = this.OooOoO;
        if (i != 0) {
            if (i == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.OooOoOO = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}


