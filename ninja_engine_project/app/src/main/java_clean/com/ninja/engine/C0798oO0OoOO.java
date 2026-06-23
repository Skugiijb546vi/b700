package com.ninja.engine;

import android.os.Build;
import java.util.Locale;
/* renamed from: com.ninja.engine.oO0OoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0798oO0OoOO {
    public static final C0798oO0OoOO OooO0O0 = OooO00o(new Locale[0]);
    public final InterfaceC0803oO0Ooo OooO00o;

    public C0798oO0OoOO(InterfaceC0803oO0Ooo interfaceC0803oO0Ooo) {
        this.OooO00o = interfaceC0803oO0Ooo;
    }

    public static C0798oO0OoOO OooO00o(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C0798oO0OoOO(new C0807oO0OooO(AbstractC0795oO0OoO.OooO0O0(localeArr)));
        }
        return new C0798oO0OoOO(new C0804oO0Ooo0(localeArr));
    }

    public static C0798oO0OoOO OooO0O0(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                String str2 = split[i];
                int i2 = AbstractC0796oO0OoO0.OooO00o;
                localeArr[i] = Locale.forLanguageTag(str2);
            }
            return OooO00o(localeArr);
        }
        return OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0798oO0OoOO) {
            if (this.OooO00o.equals(((C0798oO0OoOO) obj).OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return this.OooO00o.toString();
    }
}


