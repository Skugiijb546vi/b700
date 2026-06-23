package com.ninja.engine;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.text.TextPaint;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o000oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0121o000oooo {
    public static String OooO(Context context) {
        return context.getSystemServiceName(InputMethodManager.class);
    }

    public static int OooO00o(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static Drawable OooO0O0(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static int OooO0OO(Context context, int i) {
        return context.getColor(i);
    }

    public static ColorStateList OooO0Oo(int i, Resources.Theme theme, Resources resources) {
        return resources.getColorStateList(i, theme);
    }

    public static int OooO0o(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static int OooO0o0(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static Object OooO0oO(Context context) {
        return context.getSystemService(AppOpsManager.class);
    }

    public static Object OooO0oo(Context context) {
        return context.getSystemService(InputMethodManager.class);
    }

    public static boolean OooOO0(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static int OooOO0O(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String OooOO0o(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    public static void OooOOO(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void OooOOO0(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void OooOOOO(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void OooOOOo(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }

    public static boolean OooOOo(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public static void OooOOo0(Notification.Builder builder) {
        builder.setLargeIcon((Icon) null);
    }

    public static void OooOOoo(C0120o000oooO c0120o000oooO, boolean z) {
        c0120o000oooO.setOverlapAnchor(z);
    }

    public static void OooOo0(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
        layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
        layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
        layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
        layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
        layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
        layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
        layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
        layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
        layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
    }

    public static void OooOo00(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }
}
