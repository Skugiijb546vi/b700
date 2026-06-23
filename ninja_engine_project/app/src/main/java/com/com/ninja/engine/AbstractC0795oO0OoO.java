package com.ninja.engine;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import android.view.PointerIcon;
import java.util.Locale;
/* renamed from: com.ninja.engine.oO0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0795oO0OoO {
    public static boolean OooO00o(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static LocaleList OooO0O0(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static DecimalFormatSymbols OooO0OO(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static PointerIcon OooO0Oo(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static void OooO0o0(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
