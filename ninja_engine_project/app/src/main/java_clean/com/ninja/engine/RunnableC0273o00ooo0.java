package com.ninja.engine;

import android.view.MenuItem;
/* renamed from: com.ninja.engine.o00ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0273o00ooo0 implements Runnable {
    public final /* synthetic */ C0275o00ooo0O OooO00o;
    public final /* synthetic */ MenuItem OooO0O0;
    public final /* synthetic */ MenuC0887oO0oo0oo OooO0OO;
    public final /* synthetic */ o00O OooO0Oo;

    public RunnableC0273o00ooo0(o00O o00o, C0275o00ooo0O c0275o00ooo0O, C0892oO0ooO0o c0892oO0ooO0o, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        this.OooO0Oo = o00o;
        this.OooO00o = c0275o00ooo0O;
        this.OooO0O0 = c0892oO0ooO0o;
        this.OooO0OO = menuC0887oO0oo0oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0275o00ooo0O c0275o00ooo0O = this.OooO00o;
        if (c0275o00ooo0O != null) {
            o00O o00o = this.OooO0Oo;
            ((View$OnKeyListenerC0276o00ooo0o) o00o.OooO0O0).OooOoOO = true;
            c0275o00ooo0O.OooO0O0.OooO0OO(false);
            ((View$OnKeyListenerC0276o00ooo0o) o00o.OooO0O0).OooOoOO = false;
        }
        MenuItem menuItem = this.OooO0O0;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.OooO0OO.OooOOo0(menuItem, null, 4);
        }
    }
}


