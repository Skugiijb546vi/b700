package com.ninja.engine;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: com.ninja.engine.o0ooOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655o0ooOO0 implements InterfaceMenuItemC1272oOoo0OOo {
    public final Context OooO;
    public CharSequence OooO00o;
    public CharSequence OooO0O0;
    public Intent OooO0OO;
    public char OooO0Oo;
    public char OooO0o;
    public Drawable OooO0oo;
    public CharSequence OooOO0;
    public CharSequence OooOO0O;
    public int OooO0o0 = 4096;
    public int OooO0oO = 4096;
    public ColorStateList OooOO0o = null;
    public PorterDuff.Mode OooOOO0 = null;
    public boolean OooOOO = false;
    public boolean OooOOOO = false;
    public int OooOOOo = 16;

    public C0655o0ooOO0(Context context, CharSequence charSequence) {
        this.OooO = context;
        this.OooO00o = charSequence;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo
    public final ActionProvider$VisibilityListenerC0888oO0ooO OooO00o() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo
    public final InterfaceMenuItemC1272oOoo0OOo OooO0O0(ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO) {
        throw new UnsupportedOperationException();
    }

    public final void OooO0OO() {
        Drawable drawable = this.OooO0oo;
        if (drawable != null) {
            if (this.OooOOO || this.OooOOOO) {
                Drawable o0ooOoO = AbstractC0809oO0OooOO.o0ooOoO(drawable);
                this.OooO0oo = o0ooOoO;
                Drawable mutate = o0ooOoO.mutate();
                this.OooO0oo = mutate;
                if (this.OooOOO) {
                    mutate.setTintList(this.OooOO0o);
                }
                if (this.OooOOOO) {
                    this.OooO0oo.setTintMode(this.OooOOO0);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.OooO0oO;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.OooO0o;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OooOO0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.OooO0oo;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.OooOO0o;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooOOO0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.OooO0OO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.OooO0o0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.OooO0Oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.OooO00o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.OooO0O0;
        if (charSequence == null) {
            return this.OooO00o;
        }
        return charSequence;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.OooOO0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.OooOOOo & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.OooOOOo & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.OooOOOo & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.OooOOOo & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.OooO0o = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.OooOOOo = (z ? 1 : 0) | (this.OooOOOo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i;
        int i2 = this.OooOOOo & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.OooOOOo = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.OooOO0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i;
        int i2 = this.OooOOOo & (-17);
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.OooOOOo = i | i2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.OooO0oo = this.OooO.getDrawable(i);
        OooO0OO();
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.OooOO0o = colorStateList;
        this.OooOOO = true;
        OooO0OO();
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooOOO0 = mode;
        this.OooOOOO = true;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.OooO0OO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.OooO0Oo = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.OooO0Oo = c;
        this.OooO0o = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.OooO00o = this.OooO.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.OooO0O0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.OooOOOo & 8;
        if (z) {
            i = 0;
        }
        this.OooOOOo = i2 | i;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.OooO0o = Character.toLowerCase(c);
        this.OooO0oO = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final InterfaceMenuItemC1272oOoo0OOo setContentDescription(CharSequence charSequence) {
        this.OooOO0 = charSequence;
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.OooO0Oo = c;
        this.OooO0o0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooO0Oo = c;
        this.OooO0o0 = KeyEvent.normalizeMetaState(i);
        this.OooO0o = Character.toLowerCase(c2);
        this.OooO0oO = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.OooO00o = charSequence;
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final InterfaceMenuItemC1272oOoo0OOo setTooltipText(CharSequence charSequence) {
        this.OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooO0oo = drawable;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
