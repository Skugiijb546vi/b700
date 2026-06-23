package com.ninja.engine;

import android.view.ActionProvider;
/* renamed from: com.ninja.engine.oO0ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionProvider$VisibilityListenerC0888oO0ooO implements ActionProvider.VisibilityListener {
    public o00O OooO00o;
    public final ActionProvider OooO0O0;
    public final /* synthetic */ MenuItemC1166oOo00o0O OooO0OO;

    public ActionProvider$VisibilityListenerC0888oO0ooO(MenuItemC1166oOo00o0O menuItemC1166oOo00o0O, ActionProvider actionProvider) {
        this.OooO0OO = menuItemC1166oOo00o0O;
        this.OooO0O0 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        o00O o00o = this.OooO00o;
        if (o00o != null) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = ((C0892oO0ooO0o) o00o.OooO0O0).OooOOO;
            menuC0887oO0oo0oo.OooO0oo = true;
            menuC0887oO0oo0oo.OooOOOo(true);
        }
    }
}
