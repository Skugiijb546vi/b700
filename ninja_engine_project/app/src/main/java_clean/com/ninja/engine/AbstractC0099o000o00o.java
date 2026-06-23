package com.ninja.engine;

import android.os.PowerManager;
import java.util.Locale;
/* renamed from: com.ninja.engine.o000o00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0099o000o00o {
    public static boolean OooO00o(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String OooO0O0(Locale locale) {
        return locale.toLanguageTag();
    }
}


