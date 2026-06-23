package com.ninja.engine;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
/* renamed from: com.ninja.engine.o0O0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0301o0O0Oo0 extends Activity implements InterfaceC0760oO0O0o0O, oO0OO00O {
    public final androidx.lifecycle.OooO00o OooO00o = new androidx.lifecycle.OooO00o(this);

    @Override // com.ninja.engine.oO0OO00O
    public final boolean OooO0O0(KeyEvent keyEvent) {
        AbstractC0809oO0OooOO.OooOOOo(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0809oO0OooOO.OooOOOo(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0809oO0OooOO.OooOOOO(decorView, "window.decorView");
        if (AbstractC0809oO0OooOO.OooOoO0(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0809oO0OooOO.OooOoO(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0809oO0OooOO.OooOOOo(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC0809oO0OooOO.OooOOOO(decorView, "window.decorView");
        if (AbstractC0809oO0OooOO.OooOoO0(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooOOO0(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0809oO0OooOO.OooOOOo(bundle, "outState");
        this.OooO00o.OooO0oO();
        super.onSaveInstanceState(bundle);
    }
}


