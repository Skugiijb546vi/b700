package com.ninja.engine;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.List;
import java.util.Locale;
/* renamed from: com.ninja.engine.Oooo00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0031Oooo00O {
    public static /* bridge */ /* synthetic */ LocaleList OooO0o0(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ LocaleList OooO0oO(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ void OooOOo() {
    }

    public static /* bridge */ /* synthetic */ void OooOo(List list, C0382o0OOo0o c0382o0OOo0o) {
        list.sort(c0382o0OOo0o);
    }

    public static /* bridge */ /* synthetic */ void OooOo00(Configuration configuration, LocaleList localeList) {
        configuration.setLocales(localeList);
    }
}
