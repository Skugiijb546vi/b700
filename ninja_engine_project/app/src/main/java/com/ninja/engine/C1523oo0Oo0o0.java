package com.ninja.engine;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* renamed from: com.ninja.engine.oo0Oo0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523oo0Oo0o0 extends AbstractC1513oo0Oo {
    public static boolean OooO0o = false;
    public static Field OooO0o0 = null;
    public static Constructor OooO0oO = null;
    public static boolean OooO0oo = false;
    public WindowInsets OooO0OO;
    public C0724oO00OooO OooO0Oo;

    public C1523oo0Oo0o0() {
        this.OooO0OO = OooO();
    }

    private static WindowInsets OooO() {
        if (!OooO0o) {
            try {
                OooO0o0 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            OooO0o = true;
        }
        Field field = OooO0o0;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!OooO0oo) {
            try {
                OooO0oO = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            OooO0oo = true;
        }
        Constructor constructor = OooO0oO;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public C1536oo0OoOoO OooO0O0() {
        OooO00o();
        C1536oo0OoOoO OooO0oO2 = C1536oo0OoOoO.OooO0oO(null, this.OooO0OO);
        C0724oO00OooO[] c0724oO00OooOArr = this.OooO0O0;
        C1533oo0OoOOo c1533oo0OoOOo = OooO0oO2.OooO00o;
        c1533oo0OoOOo.OooOOOO(c0724oO00OooOArr);
        c1533oo0OoOOo.OooOOo0(this.OooO0Oo);
        return OooO0oO2;
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0o0(C0724oO00OooO c0724oO00OooO) {
        this.OooO0Oo = c0724oO00OooO;
    }

    @Override // com.ninja.engine.AbstractC1513oo0Oo
    public void OooO0oO(C0724oO00OooO c0724oO00OooO) {
        WindowInsets windowInsets = this.OooO0OO;
        if (windowInsets != null) {
            this.OooO0OO = windowInsets.replaceSystemWindowInsets(c0724oO00OooO.OooO00o, c0724oO00OooO.OooO0O0, c0724oO00OooO.OooO0OO, c0724oO00OooO.OooO0Oo);
        }
    }

    public C1523oo0Oo0o0(C1536oo0OoOoO c1536oo0OoOoO) {
        super(c1536oo0OoOoO);
        this.OooO0OO = c1536oo0OoOoO.OooO0o();
    }
}
