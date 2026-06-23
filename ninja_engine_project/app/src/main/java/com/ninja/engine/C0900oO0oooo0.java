package com.ninja.engine;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oO0oooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900oO0oooo0 extends C0781oO0OOoO implements InterfaceC0891oO0ooO0O {
    public static final Method OooOooo;
    public InterfaceC0891oO0ooO0O OooOooO;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                OooOooo = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // com.ninja.engine.C0781oO0OOoO
    public final C0432o0Oo0ooO OooOOOO(Context context, boolean z) {
        C1149oOo000OO c1149oOo000OO = new C1149oOo000OO(context, z);
        c1149oOo000OO.setHoverListener(this);
        return c1149oOo000OO;
    }

    @Override // com.ninja.engine.InterfaceC0891oO0ooO0O
    public final void OooOo0O(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        InterfaceC0891oO0ooO0O interfaceC0891oO0ooO0O = this.OooOooO;
        if (interfaceC0891oO0ooO0O != null) {
            interfaceC0891oO0ooO0O.OooOo0O(menuC0887oO0oo0oo, menuItem);
        }
    }

    @Override // com.ninja.engine.InterfaceC0891oO0ooO0O
    public final void OooOoo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, C0892oO0ooO0o c0892oO0ooO0o) {
        InterfaceC0891oO0ooO0O interfaceC0891oO0ooO0O = this.OooOooO;
        if (interfaceC0891oO0ooO0O != null) {
            interfaceC0891oO0ooO0O.OooOoo0(menuC0887oO0oo0oo, c0892oO0ooO0o);
        }
    }
}
