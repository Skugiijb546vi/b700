package com.ninja.engine;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
/* renamed from: com.ninja.engine.o0o0Oo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551o0o0Oo00 extends AbstractC1358oo0000o0 {
    public static final String[] OooOoo0 = {"android:visibility:visibility", "android:visibility:parent"};
    public final int OooOoOO;

    public C0551o0o0Oo00() {
        this.OooOoOO = 3;
    }

    public static void Oooo0OO(C1366oo000OO0 c1366oo000OO0) {
        int visibility = c1366oo000OO0.OooO0O0.getVisibility();
        HashMap hashMap = c1366oo000OO0.OooO00o;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c1366oo000OO0.OooO0O0;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float Oooo0o(C1366oo000OO0 c1366oo000OO0, float f) {
        Float f2;
        if (c1366oo000OO0 != null && (f2 = (Float) c1366oo000OO0.OooO00o.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r9 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r0.OooO0o0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
        if (r0.OooO0OO == 0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oo0OO0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C1485oo0OO0 Oooo0oO(com.ninja.engine.C1366oo000OO0 r8, com.ninja.engine.C1366oo000OO0 r9) {
        /*
            com.ninja.engine.oo0OO0 r0 = new com.ninja.engine.oo0OO0
            r0.<init>()
            r1 = 0
            r0.OooO00o = r1
            r0.OooO0O0 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.OooO00o
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = (Object) r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.OooO0OO = r7
            java.lang.Object r6 = (Object) r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.OooO0o0 = r6
            goto L33
        L2f:
            r0.OooO0OO = r3
            r0.OooO0o0 = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.OooO00o
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = (Object) r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.OooO0Oo = r2
            java.lang.Object r2 = (Object) r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L4f:
            r0.OooO0o = r2
            goto L55
        L52:
            r0.OooO0Oo = r3
            goto L4f
        L55:
            r2 = 1
            if (r8 == 0) goto L7f
            if (r9 == 0) goto L7f
            int r8 = r0.OooO0OO
            int r9 = r0.OooO0Oo
            if (r8 != r9) goto L67
            android.view.ViewGroup r3 = r0.OooO0o0
            android.view.ViewGroup r4 = r0.OooO0o
            if (r3 != r4) goto L67
            return r0
        L67:
            if (r8 == r9) goto L75
            if (r8 != 0) goto L70
        L6b:
            r0.OooO0O0 = r1
        L6d:
            r0.OooO00o = r2
            goto L8d
        L70:
            if (r9 != 0) goto L8d
        L72:
            r0.OooO0O0 = r2
            goto L6d
        L75:
            android.view.ViewGroup r8 = r0.OooO0o
            if (r8 != 0) goto L7a
            goto L6b
        L7a:
            android.view.ViewGroup r8 = r0.OooO0o0
            if (r8 != 0) goto L8d
            goto L72
        L7f:
            if (r8 != 0) goto L86
            int r8 = r0.OooO0Oo
            if (r8 != 0) goto L86
            goto L72
        L86:
            if (r9 != 0) goto L8d
            int r8 = r0.OooO0OO
            if (r8 != 0) goto L8d
            goto L6b
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0551o0o0Oo00.Oooo0oO(com.ninja.engine.oo000OO0, com.ninja.engine.oo000OO0):com.ninja.engine.oo0OO0");
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0o0(C1366oo000OO0 c1366oo000OO0) {
        Oooo0OO(c1366oo000OO0);
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0oo(C1366oo000OO0 c1366oo000OO0) {
        float f;
        Oooo0OO(c1366oo000OO0);
        View view = c1366oo000OO0.OooO0O0;
        Float f2 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f2 == null) {
            if (view.getVisibility() == 0) {
                f = AbstractC1478oo0O0oOO.OooO00o.OooO0o0(view);
            } else {
                f = 0.0f;
            }
            f2 = Float.valueOf(f);
        }
        c1366oo000OO0.OooO00o.put("android:fade:transitionAlpha", f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (Oooo0oO(OooOOOO(r3, false), OooOOoo(r3, false)).OooO00o != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cb  */
    @Override // com.ninja.engine.AbstractC1358oo0000o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator OooOO0o(android.view.ViewGroup r21, com.ninja.engine.C1366oo000OO0 r22, com.ninja.engine.C1366oo000OO0 r23) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0551o0o0Oo00.OooOO0o(android.view.ViewGroup, com.ninja.engine.oo000OO0, com.ninja.engine.oo000OO0):android.animation.Animator");
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final String[] OooOOo() {
        return OooOoo0;
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final boolean OooOo00(C1366oo000OO0 c1366oo000OO0, C1366oo000OO0 c1366oo000OO02) {
        if (c1366oo000OO0 == null && c1366oo000OO02 == null) {
            return false;
        }
        if (c1366oo000OO0 != null && c1366oo000OO02 != null && c1366oo000OO02.OooO00o.containsKey("android:visibility:visibility") != c1366oo000OO0.OooO00o.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1485oo0OO0 Oooo0oO = Oooo0oO(c1366oo000OO0, c1366oo000OO02);
        if (!Oooo0oO.OooO00o) {
            return false;
        }
        if (Oooo0oO.OooO0OO != 0 && Oooo0oO.OooO0Oo != 0) {
            return false;
        }
        return true;
    }

    public final ObjectAnimator Oooo0o0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC1478oo0O0oOO.OooO00o.OooOOO0(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC1478oo0O0oOO.OooO0O0, f2);
        C0531o0o0O0O c0531o0o0O0O = new C0531o0o0O0O(view);
        ofFloat.addListener(c0531o0o0O0O);
        OooOOOo().OooO00o(c0531o0o0O0O);
        return ofFloat;
    }

    public C0551o0o0Oo00(int i) {
        this();
        this.OooOoOO = i;
    }
}



