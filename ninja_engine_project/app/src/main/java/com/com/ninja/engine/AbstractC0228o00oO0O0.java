package com.ninja.engine;

import android.os.Build;
import java.util.Locale;
/* renamed from: com.ninja.engine.o00oO0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0228o00oO0O0 {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0030Oooo.OooO00o(30);
        }
        if (i >= 30) {
            AbstractC0030Oooo.OooO00o(31);
        }
        if (i >= 30) {
            AbstractC0030Oooo.OooO00o(33);
        }
        if (i >= 30) {
            AbstractC0030Oooo.OooO00o(1000000);
        }
    }

    public static final boolean OooO00o() {
        int i = Build.VERSION.SDK_INT;
        if (i < 35) {
            if (i >= 34) {
                String str = Build.VERSION.CODENAME;
                AbstractC0809oO0OooOO.OooOOOO(str, "CODENAME");
                if (!AbstractC0809oO0OooOO.OooO0o0("REL", str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    AbstractC0809oO0OooOO.OooOOOO(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                    AbstractC0809oO0OooOO.OooOOOO(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
