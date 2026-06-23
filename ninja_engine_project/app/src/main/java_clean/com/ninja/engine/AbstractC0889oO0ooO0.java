package com.ninja.engine;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.ViewConfiguration;
/* renamed from: com.ninja.engine.oO0ooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0889oO0ooO0 {
    public static void OooO(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static Notification.Builder OooO00o(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static float OooO0O0(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float OooO0OO(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static void OooO0Oo(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void OooO0o(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void OooO0o0(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void OooO0oO(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void OooO0oo(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void OooOO0(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void OooOO0O(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void OooOO0o(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void OooOOO(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void OooOOO0(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}


