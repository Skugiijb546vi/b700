package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* renamed from: com.ninja.engine.oOoOOOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204oOoOOOO0 {
    public AbstractC0692o0ooooOo OooO00o = new C1148oOo000O();
    public AbstractC0692o0ooooOo OooO0O0 = new C1148oOo000O();
    public AbstractC0692o0ooooOo OooO0OO = new C1148oOo000O();
    public AbstractC0692o0ooooOo OooO0Oo = new C1148oOo000O();
    public InterfaceC0336o0O0ooO0 OooO0o0 = new C0017OooOOo(0.0f);
    public InterfaceC0336o0O0ooO0 OooO0o = new C0017OooOOo(0.0f);
    public InterfaceC0336o0O0ooO0 OooO0oO = new C0017OooOOo(0.0f);
    public InterfaceC0336o0O0ooO0 OooO0oo = new C0017OooOOo(0.0f);
    public C0455o0OoOo00 OooO = new C0455o0OoOo00(0);
    public C0455o0OoOo00 OooOO0 = new C0455o0OoOo00(0);
    public C0455o0OoOo00 OooOO0O = new C0455o0OoOo00(0);
    public C0455o0OoOo00 OooOO0o = new C0455o0OoOo00(0);

    public static C1198oOoOOO OooO00o(Context context, int i, int i2, C0017OooOOo c0017OooOOo) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1038oOOOoo0O.OooOoo0);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC0336o0O0ooO0 OooO0OO = OooO0OO(obtainStyledAttributes, 5, c0017OooOOo);
            InterfaceC0336o0O0ooO0 OooO0OO2 = OooO0OO(obtainStyledAttributes, 8, OooO0OO);
            InterfaceC0336o0O0ooO0 OooO0OO3 = OooO0OO(obtainStyledAttributes, 9, OooO0OO);
            InterfaceC0336o0O0ooO0 OooO0OO4 = OooO0OO(obtainStyledAttributes, 7, OooO0OO);
            InterfaceC0336o0O0ooO0 OooO0OO5 = OooO0OO(obtainStyledAttributes, 6, OooO0OO);
            C1198oOoOOO c1198oOoOOO = new C1198oOoOOO();
            AbstractC0692o0ooooOo OooOOOo = AbstractC0692o0ooooOo.OooOOOo(i4);
            c1198oOoOOO.OooO00o = OooOOOo;
            C1198oOoOOO.OooO0O0(OooOOOo);
            c1198oOoOOO.OooO0o0 = OooO0OO2;
            AbstractC0692o0ooooOo OooOOOo2 = AbstractC0692o0ooooOo.OooOOOo(i5);
            c1198oOoOOO.OooO0O0 = OooOOOo2;
            C1198oOoOOO.OooO0O0(OooOOOo2);
            c1198oOoOOO.OooO0o = OooO0OO3;
            AbstractC0692o0ooooOo OooOOOo3 = AbstractC0692o0ooooOo.OooOOOo(i6);
            c1198oOoOOO.OooO0OO = OooOOOo3;
            C1198oOoOOO.OooO0O0(OooOOOo3);
            c1198oOoOOO.OooO0oO = OooO0OO4;
            AbstractC0692o0ooooOo OooOOOo4 = AbstractC0692o0ooooOo.OooOOOo(i7);
            c1198oOoOOO.OooO0Oo = OooOOOo4;
            C1198oOoOOO.OooO0O0(OooOOOo4);
            c1198oOoOOO.OooO0oo = OooO0OO5;
            return c1198oOoOOO;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static C1198oOoOOO OooO0O0(Context context, AttributeSet attributeSet, int i, int i2) {
        C0017OooOOo c0017OooOOo = new C0017OooOOo(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooOo00, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return OooO00o(context, resourceId, resourceId2, c0017OooOOo);
    }

    public static InterfaceC0336o0O0ooO0 OooO0OO(TypedArray typedArray, int i, InterfaceC0336o0O0ooO0 interfaceC0336o0O0ooO0) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC0336o0O0ooO0;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C0017OooOOo(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C1092oOOoOOOo(peekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC0336o0O0ooO0;
    }

    public final boolean OooO0Oo(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.OooOO0o.getClass().equals(C0455o0OoOo00.class) && this.OooOO0.getClass().equals(C0455o0OoOo00.class) && this.OooO.getClass().equals(C0455o0OoOo00.class) && this.OooOO0O.getClass().equals(C0455o0OoOo00.class)) {
            z = true;
        } else {
            z = false;
        }
        float OooO00o = this.OooO0o0.OooO00o(rectF);
        if (this.OooO0o.OooO00o(rectF) == OooO00o && this.OooO0oo.OooO00o(rectF) == OooO00o && this.OooO0oO.OooO00o(rectF) == OooO00o) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.OooO0O0 instanceof C1148oOo000O) && (this.OooO00o instanceof C1148oOo000O) && (this.OooO0OO instanceof C1148oOo000O) && (this.OooO0Oo instanceof C1148oOo000O)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOoOOO, java.lang.Object] */
    public final C1198oOoOOO OooO0o0() {
        Object obj = new Object();
        obj.OooO00o = this.OooO00o;
        obj.OooO0O0 = this.OooO0O0;
        obj.OooO0OO = this.OooO0OO;
        obj.OooO0Oo = this.OooO0Oo;
        obj.OooO0o0 = this.OooO0o0;
        obj.OooO0o = this.OooO0o;
        obj.OooO0oO = this.OooO0oO;
        obj.OooO0oo = this.OooO0oo;
        obj.OooO = this.OooO;
        obj.OooOO0 = this.OooOO0;
        obj.OooOO0O = this.OooOO0O;
        obj.OooOO0o = this.OooOO0o;
        return obj;
    }
}

