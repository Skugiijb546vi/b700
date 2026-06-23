package com.ninja.engine;

import android.view.MenuItem;
/* renamed from: com.ninja.engine.oO0ooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItem$OnActionExpandListenerC0893oO0ooOO implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener OooO00o;
    public final /* synthetic */ MenuItemC1166oOo00o0O OooO0O0;

    public MenuItem$OnActionExpandListenerC0893oO0ooOO(MenuItemC1166oOo00o0O menuItemC1166oOo00o0O, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.OooO0O0 = menuItemC1166oOo00o0O;
        this.OooO00o = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.OooO00o.onMenuItemActionCollapse(this.OooO0O0.OooO(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.OooO00o.onMenuItemActionExpand(this.OooO0O0.OooO(menuItem));
    }
}


