package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
/* renamed from: com.ninja.engine.oOoo0OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC1272oOoo0OOo extends MenuItem {
    ActionProvider$VisibilityListenerC0888oO0ooO OooO00o();

    InterfaceMenuItemC1272oOoo0OOo OooO0O0(ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1272oOoo0OOo setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1272oOoo0OOo setTooltipText(CharSequence charSequence);
}
