package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* renamed from: com.ninja.engine.o0Oo0OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0418o0Oo0OOO extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int OooOOO0 = 0;
    public o00000OO OooO;
    public o000O000 OooO00o;
    public Rect OooO0O0;
    public Drawable OooO0OO;
    public Drawable OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;
    public long OooOO0;
    public long OooOO0O;
    public o000O0O OooOO0o;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.OooO0o = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.OooO0OO
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L1f
            long r9 = r13.OooOO0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.OooO0o0
            r3.setAlpha(r9)
        L1f:
            r13.OooOO0 = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            com.ninja.engine.o000O000 r9 = r13.OooO00o
            int r9 = r9.OooOoO0
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.OooO0o0
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.OooO0Oo
            if (r9 == 0) goto L4d
            long r10 = r13.OooOO0O
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.OooO0Oo = r0
        L4d:
            r13.OooOO0O = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            com.ninja.engine.o000O000 r4 = r13.OooO00o
            int r4 = r4.OooOoO
            int r3 = r3 / r4
            int r4 = r13.OooO0o0
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            com.ninja.engine.o00000OO r14 = r13.OooO
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0418o0Oo0OOO.OooO00o(boolean):void");
    }

    public final void OooO0O0(Drawable drawable) {
        if (this.OooOO0o == null) {
            this.OooOO0o = new o000O0O();
        }
        o000O0O o000o0o = this.OooOO0o;
        o000o0o.OooO0O0 = drawable.getCallback();
        drawable.setCallback(o000o0o);
        try {
            if (this.OooO00o.OooOoO0 <= 0 && this.OooO0o) {
                drawable.setAlpha(this.OooO0o0);
            }
            o000O000 o000o000 = this.OooO00o;
            if (o000o000.OooOoo) {
                drawable.setColorFilter(o000o000.OooOoo0);
            } else {
                if (o000o000.Oooo000) {
                    drawable.setTintList(o000o000.OooOooO);
                }
                o000O000 o000o0002 = this.OooO00o;
                if (o000o0002.Oooo00O) {
                    drawable.setTintMode(o000o0002.OooOooo);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.OooO00o.OooOo0o);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0809oO0OooOO.OoooooO(drawable, AbstractC0809oO0OooOO.Oooo00o(this));
            }
            drawable.setAutoMirrored(this.OooO00o.OooOoOO);
            Rect rect = this.OooO0O0;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            o000O0O o000o0o2 = this.OooOO0o;
            o000o0o2.OooO0O0 = null;
            drawable.setCallback((Drawable.Callback) o000o0o2.OooO0O0);
        } catch (Throwable th) {
            o000O0O o000o0o3 = this.OooOO0o;
            o000o0o3.OooO0O0 = null;
            drawable.setCallback((Drawable.Callback) o000o0o3.OooO0O0);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0OO(int r10) {
        /*
            r9 = this;
            int r0 = r9.OooO0oO
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            com.ninja.engine.o000O000 r0 = r9.OooO00o
            int r0 = r0.OooOoO
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.OooO0Oo
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.OooO0OO
            if (r0 == 0) goto L29
            r9.OooO0Oo = r0
            com.ninja.engine.o000O000 r0 = r9.OooO00o
            int r0 = r0.OooOoO
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.OooOO0O = r0
            goto L35
        L29:
            r9.OooO0Oo = r4
            r9.OooOO0O = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.OooO0OO
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            com.ninja.engine.o000O000 r0 = r9.OooO00o
            int r1 = r0.OooO0oo
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.OooO0Oo(r10)
            r9.OooO0OO = r0
            r9.OooO0oO = r10
            if (r0 == 0) goto L5a
            com.ninja.engine.o000O000 r10 = r9.OooO00o
            int r10 = r10.OooOoO0
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.OooOO0 = r2
        L51:
            r9.OooO0O0(r0)
            goto L5a
        L55:
            r9.OooO0OO = r4
            r10 = -1
            r9.OooO0oO = r10
        L5a:
            long r0 = r9.OooOO0
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.OooOO0O
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7e
        L67:
            com.ninja.engine.o00000OO r0 = r9.OooO
            if (r0 != 0) goto L78
            com.ninja.engine.o00000OO r0 = new com.ninja.engine.o00000OO
            r1 = r9
            com.ninja.engine.o000Ooo r1 = (com.ninja.engine.C0092o000Ooo) r1
            r2 = 8
            r0.<init>(r2, r1)
            r9.OooO = r0
            goto L7b
        L78:
            r9.unscheduleSelf(r0)
        L7b:
            r9.OooO00o(r10)
        L7e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0418o0Oo0OOO.OooO0OO(int):boolean");
    }

    public abstract void OooO0Oo(o000O000 o000o000);

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        o000O000 o000o000 = this.OooO00o;
        if (theme != null) {
            o000o000.OooO0OO();
            int i = o000o000.OooO0oo;
            Drawable[] drawableArr = o000o000.OooO0oO;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    o000o000.OooO0o0 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                o000o000.OooO0O0 = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = o000o000.OooO0OO;
                o000o000.OooO0OO = i3;
                if (i4 != i3) {
                    o000o000.OooOOO0 = false;
                    o000o000.OooOO0 = false;
                    return;
                }
                return;
            }
            return;
        }
        o000o000.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.OooO00o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.OooO0Oo;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.OooO00o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOo0) {
            z = o000o000.OooOo0O;
        } else {
            o000o000.OooO0OO();
            o000o000.OooOo0 = true;
            int i = o000o000.OooO0oo;
            Drawable[] drawableArr = o000o000.OooO0oO;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        o000o000.OooOo0O = false;
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    o000o000.OooOo0O = true;
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.OooO00o.OooO0Oo = getChangingConfigurations();
            return this.OooO00o;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.OooO0OO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.OooO0O0;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOO0o) {
            if (!o000o000.OooOOO0) {
                o000o000.OooO0O0();
            }
            return o000o000.OooOOOO;
        }
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOO0o) {
            if (!o000o000.OooOOO0) {
                o000o000.OooO0O0();
            }
            return o000o000.OooOOO;
        }
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOO0o) {
            if (!o000o000.OooOOO0) {
                o000o000.OooO0O0();
            }
            return o000o000.OooOOo0;
        }
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOO0o) {
            if (!o000o000.OooOOO0) {
                o000o000.OooO0O0();
            }
            return o000o000.OooOOOo;
        }
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.OooO0OO;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOOo) {
            return o000o000.OooOOoo;
        }
        o000o000.OooO0OO();
        int i2 = o000o000.OooO0oo;
        Drawable[] drawableArr = o000o000.OooO0oO;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        o000o000.OooOOoo = i;
        o000o000.OooOOo = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        o000O000 o000o000 = this.OooO00o;
        boolean z = false;
        Rect rect2 = null;
        if (!o000o000.OooO) {
            Rect rect3 = o000o000.OooOO0O;
            if (rect3 == null && !o000o000.OooOO0) {
                o000o000.OooO0OO();
                Rect rect4 = new Rect();
                int i = o000o000.OooO0oo;
                Drawable[] drawableArr = o000o000.OooO0oO;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                o000o000.OooOO0 = true;
                o000o000.OooOO0O = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            }
        } else {
            Drawable drawable = this.OooO0OO;
            if (drawable != null) {
                z = drawable.getPadding(rect);
            } else {
                z = super.getPadding(rect);
            }
        }
        if (this.OooO00o.OooOoOO && AbstractC0809oO0OooOO.Oooo00o(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000 != null) {
            o000o000.OooOOo = false;
            o000o000.OooOo00 = false;
        }
        if (drawable == this.OooO0OO && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.OooO00o.OooOoOO;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.OooO0Oo;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.OooO0Oo = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.OooO0OO;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.OooO0o) {
                this.OooO0OO.setAlpha(this.OooO0o0);
            }
        }
        if (this.OooOO0O != 0) {
            this.OooOO0O = 0L;
            z = true;
        }
        if (this.OooOO0 != 0) {
            this.OooOO0 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.OooO0oo && super.mutate() == this) {
            C0092o000Ooo c0092o000Ooo = (C0092o000Ooo) this;
            o000O000 o000o000 = new o000O000(c0092o000Ooo.OooOOOo, c0092o000Ooo, null);
            o000o000.Oooo0 = o000o000.Oooo0.clone();
            o000o000.Oooo0O0 = o000o000.Oooo0O0.clone();
            OooO0Oo(o000o000);
            this.OooO0oo = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.OooO0OO;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean z;
        o000O000 o000o000 = this.OooO00o;
        int i2 = this.OooO0oO;
        int i3 = o000o000.OooO0oo;
        Drawable[] drawableArr = o000o000.OooO0oO;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z = AbstractC0809oO0OooOO.OoooooO(drawable, i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        o000o000.OooOo = i;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.OooO0OO;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.OooO0OO && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (!this.OooO0o || this.OooO0o0 != i) {
            this.OooO0o = true;
            this.OooO0o0 = i;
            Drawable drawable = this.OooO0OO;
            if (drawable != null) {
                if (this.OooOO0 == 0) {
                    drawable.setAlpha(i);
                } else {
                    OooO00o(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOoOO != z) {
            o000o000.OooOoOO = z;
            Drawable drawable = this.OooO0OO;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        o000O000 o000o000 = this.OooO00o;
        o000o000.OooOoo = true;
        if (o000o000.OooOoo0 != colorFilter) {
            o000o000.OooOoo0 = colorFilter;
            Drawable drawable = this.OooO0OO;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        o000O000 o000o000 = this.OooO00o;
        if (o000o000.OooOo0o != z) {
            o000o000.OooOo0o = z;
            Drawable drawable = this.OooO0OO;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.OooO0O0;
        if (rect == null) {
            this.OooO0O0 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.OooO0OO;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        o000O000 o000o000 = this.OooO00o;
        o000o000.Oooo000 = true;
        if (o000o000.OooOooO != colorStateList) {
            o000o000.OooOooO = colorStateList;
            AbstractC0809oO0OooOO.ooOO(this.OooO0OO, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        o000O000 o000o000 = this.OooO00o;
        o000o000.Oooo00O = true;
        if (o000o000.OooOooo != mode) {
            o000o000.OooOooo = mode;
            AbstractC0809oO0OooOO.o00O0O(this.OooO0OO, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.OooO0OO;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.OooO0OO && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
