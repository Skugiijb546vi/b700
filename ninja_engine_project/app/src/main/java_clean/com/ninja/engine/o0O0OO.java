package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class o0O0OO {
    public int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public o0O0OO(Shader shader, ColorStateList colorStateList, int i) {
        this.OooO0O0 = shader;
        this.OooO0OO = colorStateList;
        this.OooO00o = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ca, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r1.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.o0O0OO OooO00o(int r29, android.content.res.Resources.Theme r30, android.content.res.Resources r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0O0OO.OooO00o(int, android.content.res.Resources$Theme, android.content.res.Resources):com.ninja.engine.o0O0OO");
    }

    public boolean OooO0O0() {
        ColorStateList colorStateList;
        if (((Shader) this.OooO0O0) == null && (colorStateList = (ColorStateList) this.OooO0OO) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public o0O0OO(C0325o0O0oOO0 c0325o0O0oOO0) {
        this.OooO0OO = AbstractC0694o0ooooo0.OoooO(150, new C0331o0O0oo(11, this));
        this.OooO0O0 = c0325o0O0oOO0;
    }
}


