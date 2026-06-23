package com.ninja.engine;

import android.content.Context;
/* renamed from: com.ninja.engine.o0OoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453o0OoOo {
    public static final int OooO0o = (int) Math.round(5.1000000000000005d);
    public final boolean OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final float OooO0o0;

    public C0453o0OoOo(Context context) {
        boolean OoooOOo = AbstractC0692o0ooooOo.OoooOOo(context, R.attr.elevationOverlayEnabled, false);
        int OooOo0o = AbstractC0694o0ooooo0.OooOo0o(context, R.attr.elevationOverlayColor, 0);
        int OooOo0o2 = AbstractC0694o0ooooo0.OooOo0o(context, R.attr.elevationOverlayAccentColor, 0);
        int OooOo0o3 = AbstractC0694o0ooooo0.OooOo0o(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.OooO00o = OoooOOo;
        this.OooO0O0 = OooOo0o;
        this.OooO0OO = OooOo0o2;
        this.OooO0Oo = OooOo0o3;
        this.OooO0o0 = f;
    }
}
