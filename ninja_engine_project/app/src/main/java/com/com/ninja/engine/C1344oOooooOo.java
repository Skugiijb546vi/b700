package com.ninja.engine;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* renamed from: com.ninja.engine.oOooooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344oOooooOo {
    public final Object OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public final Object OooO0Oo;
    public final Object OooO0o;
    public final Object OooO0o0;
    public final Object OooO0oO;

    public C1344oOooooOo(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.OooO0Oo = layoutParams;
        this.OooO0o0 = new Rect();
        this.OooO0o = new int[2];
        this.OooO0oO = new int[2];
        this.OooO00o = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.OooO0O0 = inflate;
        this.OooO0OO = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C1344oOooooOo.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951620;
        layoutParams.flags = 24;
    }

    public C1344oOooooOo(oO00000 oo00000, oO00000 oo000002, oO00000 oo000003, oO00000 oo000004, InterfaceC0491o0o00 interfaceC0491o0o00, InterfaceC0502o0o00O0 interfaceC0502o0o00O0) {
        this.OooO0oO = AbstractC0694o0ooooo0.OoooO(150, new o00O(11, this));
        this.OooO00o = oo00000;
        this.OooO0O0 = oo000002;
        this.OooO0OO = oo000003;
        this.OooO0Oo = oo000004;
        this.OooO0o0 = interfaceC0491o0o00;
        this.OooO0o = interfaceC0502o0o00O0;
    }
}
