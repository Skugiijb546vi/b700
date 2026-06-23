package com.ninja.engine;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
/* renamed from: com.ninja.engine.oO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnKeyListenerC0876oO0oo implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0899oO0oooo {
    public MenuC0887oO0oo0oo OooO00o;
    public DialogInterfaceC0074o0000oOO OooO0O0;
    public oO0OOO0 OooO0OO;

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO;
        if ((z || menuC0887oO0oo0oo == this.OooO00o) && (dialogInterfaceC0074o0000oOO = this.OooO0O0) != null) {
            dialogInterfaceC0074o0000oOO.dismiss();
        }
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public final boolean OooO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        oO0OOO0 oo0ooo0 = this.OooO0OO;
        if (oo0ooo0.OooO0o == null) {
            oo0ooo0.OooO0o = new C0769oO0OO0Oo(oo0ooo0);
        }
        this.OooO00o.OooOOo0(oo0ooo0.OooO0o.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.OooO0OO.OooO0O0(this.OooO00o, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO00o;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.OooO0O0.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.OooO0O0.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                menuC0887oO0oo0oo.OooO0OO(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return menuC0887oO0oo0oo.performShortcut(i, keyEvent, 0);
    }
}
