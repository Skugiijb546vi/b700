package com.ninja.engine;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0OOo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380o0OOo0OO extends AbstractC0429o0Oo0oOo {
    public static final C0378o0OOo0O OooOOo0 = new C0378o0OOo0O();
    public final AbstractC0424o0Oo0o00 OooOO0o;
    public final C1243oOoOoOo0 OooOOO;
    public final C1242oOoOoOo OooOOO0;
    public final C0423o0Oo0Ooo OooOOOO;
    public boolean OooOOOo;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, com.ninja.engine.o0Oo0Ooo] */
    public C0380o0OOo0OO(Context context, oO0O oo0o, C1780ooOOO0Oo c1780ooOOO0Oo) {
        super(context, oo0o);
        this.OooOOOo = false;
        this.OooOO0o = c1780ooOOO0Oo;
        this.OooOOOO = new C0423o0Oo0Ooo();
        C1242oOoOoOo c1242oOoOoOo = new C1242oOoOoOo();
        this.OooOOO0 = c1242oOoOoOo;
        c1242oOoOoOo.OooO0O0 = 1.0f;
        c1242oOoOoOo.OooO0OO = false;
        c1242oOoOoOo.OooO00o = Math.sqrt(50.0f);
        c1242oOoOoOo.OooO0OO = false;
        C1243oOoOoOo0 c1243oOoOoOo0 = new C1243oOoOoOo0(this);
        this.OooOOO = c1243oOoOoOo0;
        c1243oOoOoOo0.OooOO0O = c1242oOoOoOo;
        if (this.OooO0oo != 1.0f) {
            this.OooO0oo = 1.0f;
            invalidateSelf();
        }
    }

    @Override // com.ninja.engine.AbstractC0429o0Oo0oOo
    public final boolean OooO0Oo(boolean z, boolean z2, boolean z3) {
        boolean OooO0Oo = super.OooO0Oo(z, z2, z3);
        o000O0O0 o000o0o0 = this.OooO0OO;
        ContentResolver contentResolver = this.OooO00o.getContentResolver();
        o000o0o0.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.OooOOOo = true;
        } else {
            this.OooOOOo = false;
            float f2 = 50.0f / f;
            C1242oOoOoOo c1242oOoOoOo = this.OooOOO0;
            c1242oOoOoOo.getClass();
            if (f2 > 0.0f) {
                c1242oOoOoOo.OooO00o = Math.sqrt(f2);
                c1242oOoOoOo.OooO0OO = false;
            } else {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
        }
        return OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        AbstractC0424o0Oo0o00 abstractC0424o0Oo0o00;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            AbstractC0424o0Oo0o00 abstractC0424o0Oo0o002 = this.OooOO0o;
            Rect bounds = getBounds();
            float OooO0O0 = OooO0O0();
            ValueAnimator valueAnimator = this.OooO0Oo;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                z = true;
            } else {
                z = false;
            }
            ValueAnimator valueAnimator2 = this.OooO0o0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                z2 = true;
            } else {
                z2 = false;
            }
            abstractC0424o0Oo0o002.OooO0O0(canvas, bounds, OooO0O0, z, z2);
            Paint paint = this.OooO;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setAntiAlias(true);
            oO0O oo0o = this.OooO0O0;
            int i4 = oo0o.OooO0OO[0];
            C0423o0Oo0Ooo c0423o0Oo0Ooo = this.OooOOOO;
            c0423o0Oo0Ooo.OooO0OO = i4;
            int i5 = oo0o.OooO0oO;
            if (i5 > 0) {
                if (!(this.OooOO0o instanceof C1780ooOOO0Oo)) {
                    i5 = (int) ((AbstractC0809oO0OooOO.OooOOoo(c0423o0Oo0Ooo.OooO0O0, 0.0f, 0.01f) * i5) / 0.01f);
                }
                i3 = i5;
                abstractC0424o0Oo0o00 = this.OooOO0o;
                f = c0423o0Oo0Ooo.OooO0O0;
                i = oo0o.OooO0Oo;
                i2 = this.OooOO0;
                f2 = 1.0f;
            } else {
                abstractC0424o0Oo0o00 = this.OooOO0o;
                i = oo0o.OooO0Oo;
                i2 = this.OooOO0;
                f = 0.0f;
                f2 = 1.0f;
                i3 = 0;
            }
            abstractC0424o0Oo0o00.OooO00o(canvas, paint, f, f2, i, i2, i3);
            AbstractC0424o0Oo0o00 abstractC0424o0Oo0o003 = this.OooOO0o;
            int i6 = this.OooOO0;
            C1780ooOOO0Oo c1780ooOOO0Oo = (C1780ooOOO0Oo) abstractC0424o0Oo0o003;
            c1780ooOOO0Oo.getClass();
            int OooOO0o = AbstractC0694o0ooooo0.OooOO0o(c0423o0Oo0Ooo.OooO0OO, i6);
            float f3 = c0423o0Oo0Ooo.OooO00o;
            float f4 = c0423o0Oo0Ooo.OooO0O0;
            int i7 = c0423o0Oo0Ooo.OooO0Oo;
            c1780ooOOO0Oo.OooO0OO(canvas, paint, f3, f4, OooOO0o, i7, i7);
            AbstractC0424o0Oo0o00 abstractC0424o0Oo0o004 = this.OooOO0o;
            int i8 = oo0o.OooO0OO[0];
            int i9 = this.OooOO0;
            C1780ooOOO0Oo c1780ooOOO0Oo2 = (C1780ooOOO0Oo) abstractC0424o0Oo0o004;
            c1780ooOOO0Oo2.getClass();
            int OooOO0o2 = AbstractC0694o0ooooo0.OooOO0o(i8, i9);
            oO0O oo0o2 = c1780ooOOO0Oo2.OooO00o;
            if (oo0o2.OooOO0O > 0 && OooOO0o2 != 0) {
                paint.setStyle(style);
                paint.setColor(OooOO0o2);
                PointF pointF = new PointF((c1780ooOOO0Oo2.OooO0O0 / 2.0f) - (c1780ooOOO0Oo2.OooO0OO / 2.0f), 0.0f);
                float f5 = oo0o2.OooOO0O;
                c1780ooOOO0Oo2.OooO0Oo(canvas, paint, pointF, null, f5, f5);
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C1780ooOOO0Oo) this.OooOO0o).OooO00o.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        this.OooOO0o.getClass();
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.OooOOO.OooO0O0();
        this.OooOOOO.OooO0O0 = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.OooOOOo;
        C0423o0Oo0Ooo c0423o0Oo0Ooo = this.OooOOOO;
        C1243oOoOoOo0 c1243oOoOoOo0 = this.OooOOO;
        if (z) {
            c1243oOoOoOo0.OooO0O0();
            c0423o0Oo0Ooo.OooO0O0 = i / 10000.0f;
            invalidateSelf();
        } else {
            c1243oOoOoOo0.OooO0O0 = c0423o0Oo0Ooo.OooO0O0 * 10000.0f;
            c1243oOoOoOo0.OooO0OO = true;
            float f = i;
            if (c1243oOoOoOo0.OooO0o) {
                c1243oOoOoOo0.OooOO0o = f;
            } else {
                if (c1243oOoOoOo0.OooOO0O == null) {
                    c1243oOoOoOo0.OooOO0O = new C1242oOoOoOo(f);
                }
                C1242oOoOoOo c1242oOoOoOo = c1243oOoOoOo0.OooOO0O;
                double d = f;
                c1242oOoOoOo.OooO = d;
                double d2 = (float) d;
                if (d2 <= Float.MAX_VALUE) {
                    if (d2 >= -3.4028235E38f) {
                        double abs = Math.abs(c1243oOoOoOo0.OooO0oo * 0.75f);
                        c1242oOoOoOo.OooO0Oo = abs;
                        c1242oOoOoOo.OooO0o0 = abs * 62.5d;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            boolean z2 = c1243oOoOoOo0.OooO0o;
                            if (!z2 && !z2) {
                                c1243oOoOoOo0.OooO0o = true;
                                if (!c1243oOoOoOo0.OooO0OO) {
                                    c1243oOoOoOo0.OooO0O0 = c1243oOoOoOo0.OooO0o0.Oooo0OO(c1243oOoOoOo0.OooO0Oo);
                                }
                                float f2 = c1243oOoOoOo0.OooO0O0;
                                if (f2 <= Float.MAX_VALUE && f2 >= -3.4028235E38f) {
                                    ThreadLocal threadLocal = o000O0Oo.OooO0o;
                                    if (threadLocal.get() == null) {
                                        threadLocal.set(new o000O0Oo());
                                    }
                                    o000O0Oo o000o0oo = (o000O0Oo) threadLocal.get();
                                    ArrayList arrayList = o000o0oo.OooO0O0;
                                    if (arrayList.size() == 0) {
                                        if (o000o0oo.OooO0Oo == null) {
                                            o000o0oo.OooO0Oo = new C0131o00O0o(o000o0oo.OooO0OO);
                                        }
                                        C0131o00O0o c0131o00O0o = o000o0oo.OooO0Oo;
                                        ((Choreographer) c0131o00O0o.OooO0OO).postFrameCallback((o000O0) c0131o00O0o.OooO0Oo);
                                    }
                                    if (!arrayList.contains(c1243oOoOoOo0)) {
                                        arrayList.add(c1243oOoOoOo0);
                                    }
                                } else {
                                    throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                                }
                            }
                        } else {
                            throw new AndroidRuntimeException("Animations may only be started on the main thread");
                        }
                    } else {
                        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                    }
                } else {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
            }
        }
        return true;
    }
}


