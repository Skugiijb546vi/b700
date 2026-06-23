package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class o000O00O extends AbstractC1420oo00o00 implements Animatable {
    public static final /* synthetic */ int OooO0oO = 0;
    public final Context OooO0OO;
    public C0200o00o0O OooO0Oo = null;
    public ArrayList OooO0o0 = null;
    public final o000O0O OooO0o = new o000O0O(this);
    public final o000Oo0 OooO0O0 = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, com.ninja.engine.o000Oo0] */
    public o000O00O(Context context) {
        this.OooO0OO = context;
    }

    @Override // com.ninja.engine.AbstractC1420oo00o00, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        o000Oo0 o000oo0 = this.OooO0O0;
        o000oo0.OooO00o.draw(canvas);
        if (o000oo0.OooO0O0.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.OooO0O0.OooO00o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.OooO0O0.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.OooO0O0.OooO00o.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.OooO00o != null && Build.VERSION.SDK_INT >= 24) {
            return new o000O00(0, this.OooO00o.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.OooO0O0.OooO00o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.OooO0O0.OooO00o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.OooO0O0.OooO00o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.OooO0O0.OooO00o.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.OooO0O0.OooO0O0.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.OooO0O0.OooO00o.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.OooO0O0.OooO00o.setBounds(rect);
        }
    }

    @Override // com.ninja.engine.AbstractC1420oo00o00, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.OooO0O0.OooO00o.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.OooO0O0.OooO00o.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.OooO0O0.OooO00o.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.OooO0O0.OooO00o.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.OooO0O0.OooO00o.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            AbstractC0809oO0OooOO.o0OoOo0(drawable, i);
        } else {
            this.OooO0O0.OooO00o.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            AbstractC0809oO0OooOO.ooOO(drawable, colorStateList);
        } else {
            this.OooO0O0.OooO00o.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            AbstractC0809oO0OooOO.o00O0O(drawable, mode);
        } else {
            this.OooO0O0.OooO00o.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.OooO0O0.OooO00o.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        o000Oo0 o000oo0 = this.OooO0O0;
        if (o000oo0.OooO0O0.isStarted()) {
            return;
        }
        o000oo0.OooO0O0.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.OooO00o;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.OooO0O0.OooO0O0.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
        if (r8.OooO0O0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
        r8.OooO0O0 = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
        r8.OooO0O0.playTogether(r8.OooO0OO);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
        return;
     */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o000O00O.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}


