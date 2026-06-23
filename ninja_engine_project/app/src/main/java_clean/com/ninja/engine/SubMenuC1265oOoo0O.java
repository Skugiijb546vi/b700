package com.ninja.engine;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: com.ninja.engine.oOoo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1265oOoo0O extends MenuC0887oO0oo0oo implements SubMenu {
    public final MenuC0887oO0oo0oo OooOoO;
    public final C0892oO0ooO0o OooOoOO;

    public SubMenuC1265oOoo0O(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo, C0892oO0ooO0o c0892oO0ooO0o) {
        super(context);
        this.OooOoO = menuC0887oO0oo0oo;
        this.OooOoOO = c0892oO0ooO0o;
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final boolean OooO0Oo(C0892oO0ooO0o c0892oO0ooO0o) {
        return this.OooOoO.OooO0Oo(c0892oO0ooO0o);
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final boolean OooO0o(C0892oO0ooO0o c0892oO0ooO0o) {
        return this.OooOoO.OooO0o(c0892oO0ooO0o);
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final boolean OooO0o0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        if (!super.OooO0o0(menuC0887oO0oo0oo, menuItem) && !this.OooOoO.OooO0o0(menuC0887oO0oo0oo, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final String OooOO0() {
        int i;
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOoOO;
        if (c0892oO0ooO0o != null) {
            i = c0892oO0ooO0o.OooO00o;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return AbstractC1230oOoOo0o.OooO0o(i, "android:menu:actionviewstates:");
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final MenuC0887oO0oo0oo OooOO0O() {
        return this.OooOoO.OooOO0O();
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final boolean OooOOO() {
        return this.OooOoO.OooOOO();
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final boolean OooOOO0() {
        return this.OooOoO.OooOOO0();
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final boolean OooOOOO() {
        return this.OooOoO.OooOOOO();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.OooOoOO;
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.OooOoO.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        OooOo0(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        OooOo0(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        OooOo0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.OooOoOO.setIcon(i);
        return this;
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.OooOoO.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        OooOo0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        OooOo0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.OooOoOO.setIcon(drawable);
        return this;
    }
}


