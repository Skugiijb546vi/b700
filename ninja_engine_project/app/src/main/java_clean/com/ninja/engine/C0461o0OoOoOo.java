package com.ninja.engine;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
/* renamed from: com.ninja.engine.o0OoOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461o0OoOoOo extends AbstractC1358oo0000o0 {
    public static final String[] OooOoOO = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final o0O0000O OooOoo0 = new o0O0000O(PointF.class, "topLeft", 0);
    public static final o0O0000O OooOoo = new o0O0000O(PointF.class, "bottomRight", 1);
    public static final o0O0000O OooOooO = new o0O0000O(PointF.class, "bottomRight", 2);
    public static final o0O0000O OooOooo = new o0O0000O(PointF.class, "topLeft", 3);
    public static final o0O0000O Oooo000 = new o0O0000O(PointF.class, "position", 4);

    public static void Oooo0OO(C1366oo000OO0 c1366oo000OO0) {
        View view = c1366oo000OO0.OooO0O0;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = c1366oo000OO0.OooO00o;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", c1366oo000OO0.OooO0O0.getParent());
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0o0(C1366oo000OO0 c1366oo000OO0) {
        Oooo0OO(c1366oo000OO0);
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0oo(C1366oo000OO0 c1366oo000OO0) {
        Oooo0OO(c1366oo000OO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    @Override // com.ninja.engine.AbstractC1358oo0000o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator OooOO0o(android.view.ViewGroup r19, com.ninja.engine.C1366oo000OO0 r20, com.ninja.engine.C1366oo000OO0 r21) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0461o0OoOoOo.OooOO0o(android.view.ViewGroup, com.ninja.engine.oo000OO0, com.ninja.engine.oo000OO0):android.animation.Animator");
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final String[] OooOOo() {
        return OooOoOO;
    }
}


