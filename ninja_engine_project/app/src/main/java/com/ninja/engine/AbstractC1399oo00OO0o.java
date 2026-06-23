package com.ninja.engine;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.ninja.engine.oo00OO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1399oo00OO0o {
    public static final AtomicReference OooO00o = new AtomicReference();

    public static DateFormat OooO00o(String str, Locale locale) {
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext displayContext;
        instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        timeZone = TimeZone.getTimeZone("UTC");
        instanceForSkeleton.setTimeZone(timeZone);
        displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
        instanceForSkeleton.setContext(displayContext);
        return instanceForSkeleton;
    }

    public static Calendar OooO0O0(Calendar calendar) {
        Calendar OooO0Oo = OooO0Oo(calendar);
        Calendar OooO0Oo2 = OooO0Oo(null);
        OooO0Oo2.set(OooO0Oo.get(1), OooO0Oo.get(2), OooO0Oo.get(5));
        return OooO0Oo2;
    }

    public static Calendar OooO0OO() {
        AbstractC1318oOooOoo0 abstractC1318oOooOoo0 = (AbstractC1318oOooOoo0) OooO00o.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar OooO0Oo(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
