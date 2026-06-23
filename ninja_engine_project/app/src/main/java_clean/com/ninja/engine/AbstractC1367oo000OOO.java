package com.ninja.engine;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
/* renamed from: com.ninja.engine.oo000OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1367oo000OOO {
    public static final AbstractC1091oOOoOOOO OooO00o;
    public static final C0839oO0o0ooO OooO0O0;

    static {
        AbstractC1091oOOoOOOO abstractC1091oOOoOOOO;
        AbstractC1091oOOoOOOO.OooO00o("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            abstractC1091oOOoOOOO = new AbstractC1091oOOoOOOO() {};
        } else if (i >= 28) {
            abstractC1091oOOoOOOO = new C1370oo000OoO();
        } else if (i >= 26) {
            abstractC1091oOOoOOOO = new C1370oo000OoO();
        } else if (i >= 24 && C1369oo000Oo.OooO0o0 != null) {
            abstractC1091oOOoOOOO = new AbstractC1091oOOoOOOO() {};
        } else {
            abstractC1091oOOoOOOO = new AbstractC1091oOOoOOOO() {};
        }
        OooO00o = abstractC1091oOOoOOOO;
        OooO0O0 = new C0839oO0o0ooO(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r6.equals(r12) == false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.ninja.engine.oOoo0OoO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface OooO00o(android.content.Context r16, com.ninja.engine.InterfaceC0572o0oOOooO r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, com.ninja.engine.AbstractC1137oOOoooO r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1367oo000OOO.OooO00o(android.content.Context, com.ninja.engine.o0oOOooO, android.content.res.Resources, int, java.lang.String, int, int, com.ninja.engine.oOOoooO, boolean):android.graphics.Typeface");
    }

    public static String OooO0O0(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}


