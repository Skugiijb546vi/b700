package com.ninja.engine;

import android.os.LocaleList;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o00O0O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0125o00O0O0o {
    public static LocaleList OooO00o(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void OooO0O0(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}


