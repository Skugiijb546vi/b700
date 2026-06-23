package com.ninja.engine;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
/* renamed from: com.ninja.engine.oO0Oo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC0789oO0Oo00 implements View.OnTouchListener {
    public static final int OooOOo = ViewConfiguration.getTapTimeout();
    public final float[] OooO;
    public final o00OOO OooO00o;
    public final AccelerateInterpolator OooO0O0;
    public final View OooO0OO;
    public o00000OO OooO0Oo;
    public final float[] OooO0o;
    public final float[] OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;
    public final float[] OooOO0;
    public final float[] OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public final ListView OooOOo0;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.o00OOO, java.lang.Object] */
    public View$OnTouchListenerC0789oO0Oo00(ListView listView) {
        Object obj = new Object();
        obj.OooO0o0 = Long.MIN_VALUE;
        obj.OooO0oO = -1L;
        obj.OooO0o = 0L;
        this.OooO00o = obj;
        this.OooO0O0 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.OooO0o0 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.OooO0o = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.OooO = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.OooOO0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.OooOO0O = fArr5;
        this.OooO0OO = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.OooO0oO = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.OooO0oo = OooOOo;
        obj.OooO00o = 500;
        obj.OooO0O0 = 500;
        this.OooOOo0 = listView;
    }

    public static float OooO0O0(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float OooO00o(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.OooO0o0
            r0 = r0[r7]
            float[] r1 = r3.OooO0o
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = OooO0O0(r0, r2, r1)
            float r1 = r3.OooO0OO(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.OooO0OO(r5, r0)
            float r4 = r4 - r1
            android.view.animation.AccelerateInterpolator r5 = r3.OooO0O0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L2e
        L26:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r4 = r5.getInterpolation(r4)
        L2e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = OooO0O0(r4, r5, r0)
            goto L38
        L37:
            r4 = 0
        L38:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.OooO
            r0 = r0[r7]
            float[] r1 = r3.OooOO0
            r1 = r1[r7]
            float[] r2 = r3.OooOO0O
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L54
            float r4 = r4 * r0
            float r4 = OooO0O0(r4, r1, r7)
            return r4
        L54:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = OooO0O0(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.View$OnTouchListenerC0789oO0Oo00.OooO00o(float, float, float, int):float");
    }

    public final float OooO0OO(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.OooO0oO;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.OooOOOO && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void OooO0Oo() {
        int i = 0;
        if (this.OooOOO0) {
            this.OooOOOO = false;
            return;
        }
        o00OOO o00ooo = this.OooO00o;
        o00ooo.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - o00ooo.OooO0o0);
        int i3 = o00ooo.OooO0O0;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        o00ooo.OooO = i;
        o00ooo.OooO0oo = o00ooo.OooO00o(currentAnimationTimeMillis);
        o00ooo.OooO0oO = currentAnimationTimeMillis;
    }

    public final boolean OooO0o0() {
        ListView listView;
        int count;
        o00OOO o00ooo = this.OooO00o;
        float f = o00ooo.OooO0Oo;
        int abs = (int) (f / Math.abs(f));
        Math.abs(o00ooo.OooO0OO);
        if (abs == 0 || (count = (listView = this.OooOOo0).getCount()) == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1 != 3) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r7.OooOOOo
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            if (r1 == r0) goto L1e
            r8 = 3
            if (r1 == r8) goto L16
            goto L7b
        L16:
            r7.OooO0Oo()
            goto L7b
        L1a:
            r7.OooOOO = r3
            r7.OooOO0o = r2
        L1e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.OooO0OO
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.OooO00o(r1, r4, r6, r2)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.OooO00o(r9, r8, r4, r3)
            com.ninja.engine.o00OOO r9 = r7.OooO00o
            r9.OooO0OO = r1
            r9.OooO0Oo = r8
            boolean r8 = r7.OooOOOO
            if (r8 != 0) goto L7b
            boolean r8 = r7.OooO0o0()
            if (r8 == 0) goto L7b
            com.ninja.engine.o00000OO r8 = r7.OooO0Oo
            if (r8 != 0) goto L5f
            com.ninja.engine.o00000OO r8 = new com.ninja.engine.o00000OO
            r8.<init>(r0, r7)
            r7.OooO0Oo = r8
        L5f:
            r7.OooOOOO = r3
            r7.OooOOO0 = r3
            boolean r8 = r7.OooOO0o
            if (r8 != 0) goto L74
            int r8 = r7.OooO0oo
            if (r8 <= 0) goto L74
            com.ninja.engine.o00000OO r9 = r7.OooO0Oo
            long r0 = (long) r8
            java.util.WeakHashMap r8 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            r5.postOnAnimationDelayed(r9, r0)
            goto L79
        L74:
            com.ninja.engine.o00000OO r8 = r7.OooO0Oo
            r8.run()
        L79:
            r7.OooOO0o = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.View$OnTouchListenerC0789oO0Oo00.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}

