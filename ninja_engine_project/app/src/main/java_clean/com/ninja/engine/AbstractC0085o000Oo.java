package com.ninja.engine;

import android.app.LocaleManager;
import android.os.LocaleList;
/* renamed from: com.ninja.engine.o000Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0085o000Oo {
    public static LocaleList OooO00o(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void OooO0O0(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}


