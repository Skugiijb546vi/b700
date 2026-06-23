package com.ninja.engine;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0Oo0oOo */
/* loaded from: classes.dex */
public abstract class AbstractC0429o0Oo0oOo extends Drawable implements Animatable {
    public static final o0O0000O OooOO0O = new o0O0000O(Float.class, "growFraction", 5);
    public final Context OooO00o;
    public final oO0O OooO0O0;
    public ValueAnimator OooO0Oo;
    public ArrayList OooO0o;
    public ValueAnimator OooO0o0;
    public boolean OooO0oO;
    public float OooO0oo;
    public int OooOO0;
    public final Paint OooO = new Paint();
    public o000O0O0 OooO0OO = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ninja.engine.o000O0O0, java.lang.Object] */
    public AbstractC0429o0Oo0oOo(Context context, oO0O oo0o) {
        this.OooO00o = context;
        this.OooO0O0 = oo0o;
        setAlpha(255);
    }

    public final float OooO0O0() {
        oO0O oo0o = this.OooO0O0;
        if (oo0o.OooO0o0 != 0 || oo0o.OooO0o != 0) {
            return this.OooO0oo;
        }
        return 1.0f;
    }

    public final boolean OooO0OO(boolean z, boolean z2, boolean z3) {
        boolean z4;
        o000O0O0 o000o0o0 = this.OooO0OO;
        ContentResolver contentResolver = this.OooO00o.getContentResolver();
        o000o0o0.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z3 && f > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        return OooO0Oo(z, z2, z4);
    }

    public boolean OooO0Oo(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean z4;
        ValueAnimator valueAnimator3 = this.OooO0Oo;
        o0O0000O o0o0000o = OooOO0O;
        if (valueAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, o0o0000o, 0.0f, 1.0f);
            this.OooO0Oo = ofFloat;
            ofFloat.setDuration(500L);
            this.OooO0Oo.setInterpolator(o000OO0O.OooO0O0);
            ValueAnimator valueAnimator4 = this.OooO0Oo;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.OooO0Oo = valueAnimator4;
            valueAnimator4.addListener(new C0422o0Oo0OoO(this, 0));
        }
        if (this.OooO0o0 == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o0o0000o, 1.0f, 0.0f);
            this.OooO0o0 = ofFloat2;
            ofFloat2.setDuration(500L);
            this.OooO0o0.setInterpolator(o000OO0O.OooO0O0);
            ValueAnimator valueAnimator5 = this.OooO0o0;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.OooO0o0 = valueAnimator5;
            valueAnimator5.addListener(new C0422o0Oo0OoO(this, 1));
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.OooO0Oo;
        } else {
            valueAnimator = this.OooO0o0;
        }
        if (z) {
            valueAnimator2 = this.OooO0o0;
        } else {
            valueAnimator2 = this.OooO0Oo;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                boolean z5 = this.OooO0oO;
                this.OooO0oO = true;
                new ValueAnimator[]{valueAnimator2}[0].cancel();
                this.OooO0oO = z5;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                boolean z6 = this.OooO0oO;
                this.OooO0oO = true;
                new ValueAnimator[]{valueAnimator}[0].end();
                this.OooO0oO = z6;
            }
            return super.setVisible(z, false);
        } else if (valueAnimator.isRunning()) {
            return false;
        } else {
            if (z && !super.setVisible(z, false)) {
                z4 = false;
            } else {
                z4 = true;
            }
            oO0O oo0o = this.OooO0O0;
            if (!z ? oo0o.OooO0o != 0 : oo0o.OooO0o0 != 0) {
                if (!z2 && valueAnimator.isPaused()) {
                    valueAnimator.resume();
                } else {
                    valueAnimator.start();
                }
                return z4;
            }
            boolean z7 = this.OooO0oO;
            this.OooO0oO = true;
            new ValueAnimator[]{valueAnimator}[0].end();
            this.OooO0oO = z7;
            return z4;
        }
    }

    public final void OooO0o0(C0291o0O00o0 c0291o0O00o0) {
        ArrayList arrayList = this.OooO0o;
        if (arrayList != null && arrayList.contains(c0291o0O00o0)) {
            this.OooO0o.remove(c0291o0O00o0);
            if (this.OooO0o.isEmpty()) {
                this.OooO0o = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.OooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.OooO0Oo;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = this.OooO0o0) != null && valueAnimator.isRunning())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.OooOO0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return OooO0OO(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        OooO0Oo(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        OooO0Oo(false, true, false);
    }
}
