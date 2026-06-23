package com.ninja.engine;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* renamed from: com.ninja.engine.oOoo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273oOoo0Oo extends AbstractC1094oOOoOOo0 {
    public int OooO;
    public int OooOO0 = -1;
    public final /* synthetic */ SwipeDismissBehavior OooOO0O;

    public C1273oOoo0Oo(SwipeDismissBehavior swipeDismissBehavior) {
        this.OooOO0O = swipeDismissBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r3.OooO;
        r4 = r4.getWidth() + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.OooO - r4.getWidth();
        r4 = r3.OooO;
     */
    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OooO00o(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.util.WeakHashMap r0 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            int r0 = r4.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.OooOO0O
            int r2 = r2.OooO0Oo
            if (r2 != 0) goto L26
            if (r0 == 0) goto L1e
        L14:
            int r0 = r3.OooO
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.OooO
            goto L39
        L1e:
            int r0 = r3.OooO
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L39
        L26:
            if (r2 != r1) goto L2b
            if (r0 == 0) goto L14
            goto L1e
        L2b:
            int r0 = r3.OooO
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.OooO
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L39:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1273oOoo0Oo.OooO00o(android.view.View, int):int");
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final int OooO0O0(View view, int i) {
        return view.getTop();
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final int OooOO0(View view) {
        return view.getWidth();
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final void OooOOOO(View view, int i) {
        this.OooOO0 = i;
        this.OooO = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.OooOO0O;
            swipeDismissBehavior.OooO0OO = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.OooO0OO = false;
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final void OooOOOo(int i) {
        this.OooOO0O.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (java.lang.Math.abs(r4) >= java.lang.Math.round(r9.getWidth() * r2.OooO0o0)) goto L25;
     */
    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.OooOO0 = r11
            int r11 = r9.getWidth()
            r0 = 0
            r1 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.OooOO0O
            r3 = 0
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L39
            java.util.WeakHashMap r5 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            int r5 = r9.getLayoutDirection()
            if (r5 != r1) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            int r6 = r2.OooO0Oo
            r7 = 2
            if (r6 != r7) goto L21
            goto L53
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L67
            goto L53
        L2a:
            if (r4 <= 0) goto L67
            goto L53
        L2d:
            if (r6 != r1) goto L67
            if (r5 == 0) goto L34
            if (r4 <= 0) goto L67
            goto L53
        L34:
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 >= 0) goto L67
            goto L53
        L39:
            int r4 = r9.getLeft()
            int r5 = r8.OooO
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r2.OooO0o0
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L67
        L53:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L62
            int r10 = r9.getLeft()
            int r0 = r8.OooO
            if (r10 >= r0) goto L60
            goto L62
        L60:
            int r0 = r0 + r11
            goto L6a
        L62:
            int r10 = r8.OooO
            int r0 = r10 - r11
            goto L6a
        L67:
            int r0 = r8.OooO
            r1 = 0
        L6a:
            com.ninja.engine.oo0O0O0 r10 = r2.OooO00o
            int r11 = r9.getTop()
            boolean r10 = r10.OooOOO(r0, r11)
            if (r10 == 0) goto L80
            com.ninja.engine.o0OO00O r10 = new com.ninja.engine.o0OO00O
            r10.<init>(r2, r9, r1)
            java.util.WeakHashMap r11 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            r9.postOnAnimation(r10)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1273oOoo0Oo.OooOOo(android.view.View, float, float):void");
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final void OooOOo0(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.OooOO0O;
        float width = view.getWidth() * swipeDismissBehavior.OooO0o;
        float width2 = view.getWidth() * swipeDismissBehavior.OooO0oO;
        float abs = Math.abs(i - this.OooO);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final boolean OooOo(View view, int i) {
        int i2 = this.OooOO0;
        if ((i2 == -1 || i2 == i) && this.OooOO0O.OooOo0O(view)) {
            return true;
        }
        return false;
    }
}
