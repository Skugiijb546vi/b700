package com.ninja.engine;

import android.content.res.Configuration;
import android.os.LocaleList;
/* renamed from: com.ninja.engine.oooo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2054oooo00o {
    public static void OooO00o(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales;
        LocaleList locales2;
        boolean equals;
        locales = configuration.getLocales();
        locales2 = configuration2.getLocales();
        equals = locales.equals(locales2);
        if (!equals) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static C0798oO0OoOO OooO0O0(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return C0798oO0OoOO.OooO0O0(languageTags);
    }

    public static void OooO0OO(C0798oO0OoOO c0798oO0OoOO) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(c0798oO0OoOO.OooO00o.OooO00o());
        LocaleList.setDefault(forLanguageTags);
    }

    public static void OooO0Oo(Configuration configuration, C0798oO0OoOO c0798oO0OoOO) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(c0798oO0OoOO.OooO00o.OooO00o());
        configuration.setLocales(forLanguageTags);
    }
}


