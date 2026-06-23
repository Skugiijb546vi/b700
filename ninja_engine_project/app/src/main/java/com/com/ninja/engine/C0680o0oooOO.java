package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680o0oooOO extends Drawable implements InterfaceC0688o0oooo00, Animatable {
    public Paint OooO;
    public final o000O00 OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public int OooO0o;
    public boolean OooO0o0 = true;
    public final int OooO0oO = -1;
    public boolean OooO0oo;
    public Rect OooOO0;

    public C0680o0oooOO(o000O00 o000o00) {
        AbstractC0694o0ooooo0.OooOO0O(o000o00, "Argument must not be null");
        this.OooO00o = o000o00;
    }

    public final void OooO00o() {
        AbstractC0694o0ooooo0.OooO0oo("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.OooO0Oo);
        C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) this.OooO00o.OooO0O0;
        if (c0689o0oooo0O.OooO00o.OooOO0o.OooO0OO != 1) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                if (!c0689o0oooo0O.OooOO0) {
                    ArrayList arrayList = c0689o0oooo0O.OooO0OO;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !c0689o0oooo0O.OooO0o) {
                            c0689o0oooo0O.OooO0o = true;
                            c0689o0oooo0O.OooOO0 = false;
                            c0689o0oooo0O.OooO00o();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.OooO0Oo) {
            return;
        }
        if (this.OooO0oo) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.OooOO0 == null) {
                this.OooOO0 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.OooOO0);
            this.OooO0oo = false;
        }
        C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) this.OooO00o.OooO0O0;
        C0685o0oooOoO c0685o0oooOoO = c0689o0oooo0O.OooO;
        if (c0685o0oooOoO != null) {
            bitmap = c0685o0oooOoO.OooO0oO;
        } else {
            bitmap = c0689o0oooo0O.OooOO0o;
        }
        if (this.OooOO0 == null) {
            this.OooOO0 = new Rect();
        }
        Rect rect = this.OooOO0;
        if (this.OooO == null) {
            this.OooO = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.OooO);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C0689o0oooo0O) this.OooO00o.OooO0O0).OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C0689o0oooo0O) this.OooO00o.OooO0O0).OooOOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.OooO0oo = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.OooO == null) {
            this.OooO = new Paint(2);
        }
        this.OooO.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.OooO == null) {
            this.OooO = new Paint(2);
        }
        this.OooO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC0694o0ooooo0.OooO0oo("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.OooO0Oo);
        this.OooO0o0 = z;
        if (!z) {
            this.OooO0O0 = false;
            C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) this.OooO00o.OooO0O0;
            ArrayList arrayList = c0689o0oooo0O.OooO0OO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c0689o0oooo0O.OooO0o = false;
            }
        } else if (this.OooO0OO) {
            OooO00o();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.OooO0OO = true;
        this.OooO0o = 0;
        if (this.OooO0o0) {
            OooO00o();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.OooO0OO = false;
        this.OooO0O0 = false;
        C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) this.OooO00o.OooO0O0;
        ArrayList arrayList = c0689o0oooo0O.OooO0OO;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c0689o0oooo0O.OooO0o = false;
        }
    }
}
