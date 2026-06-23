package com.ninja.engine;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oOo00o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemC1166oOo00o0O extends AbstractC0104o000o0o implements MenuItem {
    public final InterfaceMenuItemC1272oOoo0OOo OooO0OO;
    public Method OooO0Oo;

    public MenuItemC1166oOo00o0O(Context context, InterfaceMenuItemC1272oOoo0OOo interfaceMenuItemC1272oOoo0OOo) {
        super(context);
        if (interfaceMenuItemC1272oOoo0OOo != null) {
            this.OooO0OO = interfaceMenuItemC1272oOoo0OOo;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.OooO0OO.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.OooO0OO.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProvider$VisibilityListenerC0888oO0ooO OooO00o = this.OooO0OO.OooO00o();
        if (OooO00o instanceof ActionProvider$VisibilityListenerC0888oO0ooO) {
            return OooO00o.OooO0O0;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.OooO0OO.getActionView();
        if (actionView instanceof C0894oO0ooOO0) {
            return (View) ((C0894oO0ooOO0) actionView).OooO00o;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.OooO0OO.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.OooO0OO.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OooO0OO.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.OooO0OO.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.OooO0OO.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.OooO0OO.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooO0OO.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.OooO0OO.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.OooO0OO.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.OooO0OO.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.OooO0OO.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.OooO0OO.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.OooO0OO.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.OooO0OO.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.OooO0OO.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.OooO0OO.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.OooO0OO.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.OooO0OO.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.OooO0OO.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.OooO0OO.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.OooO0OO.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.OooO0OO.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.OooO0OO.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO = new ActionProvider$VisibilityListenerC0888oO0ooO(this, actionProvider);
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC0888oO0ooO = null;
        }
        this.OooO0OO.OooO0O0(actionProvider$VisibilityListenerC0888oO0ooO);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC1272oOoo0OOo interfaceMenuItemC1272oOoo0OOo = this.OooO0OO;
        interfaceMenuItemC1272oOoo0OOo.setActionView(i);
        View actionView = interfaceMenuItemC1272oOoo0OOo.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC1272oOoo0OOo.setActionView(new C0894oO0ooOO0(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.OooO0OO.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.OooO0OO.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.OooO0OO.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.OooO0OO.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.OooO0OO.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.OooO0OO.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.OooO0OO.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooO0OO.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.OooO0OO.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.OooO0OO.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC0893oO0ooOO menuItem$OnActionExpandListenerC0893oO0ooOO;
        if (onActionExpandListener != null) {
            menuItem$OnActionExpandListenerC0893oO0ooOO = new MenuItem$OnActionExpandListenerC0893oO0ooOO(this, onActionExpandListener);
        } else {
            menuItem$OnActionExpandListenerC0893oO0ooOO = null;
        }
        this.OooO0OO.setOnActionExpandListener(menuItem$OnActionExpandListenerC0893oO0ooOO);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC1323oOooo00 menuItem$OnMenuItemClickListenerC1323oOooo00;
        if (onMenuItemClickListener != null) {
            menuItem$OnMenuItemClickListenerC1323oOooo00 = new MenuItem$OnMenuItemClickListenerC1323oOooo00(this, onMenuItemClickListener);
        } else {
            menuItem$OnMenuItemClickListenerC1323oOooo00 = null;
        }
        this.OooO0OO.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC1323oOooo00);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.OooO0OO.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.OooO0OO.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.OooO0OO.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.OooO0OO.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.OooO0OO.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.OooO0OO.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.OooO0OO.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0894oO0ooOO0(view);
        }
        this.OooO0OO.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.OooO0OO.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooO0OO.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.OooO0OO.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooO0OO.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.OooO0OO.setTitle(charSequence);
        return this;
    }
}
