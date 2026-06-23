package com.ninja.engine;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
/* renamed from: com.ninja.engine.o0oOOO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565o0oOOO0o implements KeyListener {
    public final KeyListener OooO00o;
    public final C0601o0oOooO0 OooO0O0;

    public C0565o0oOOO0o(KeyListener keyListener) {
        C0601o0oOooO0 c0601o0oOooO0 = new C0601o0oOooO0(3);
        this.OooO00o = keyListener;
        this.OooO0O0 = c0601o0oOooO0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.OooO00o.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.OooO00o.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean OooOOO0;
        boolean z;
        this.OooO0O0.getClass();
        if (i != 67) {
            if (i != 112) {
                OooOOO0 = false;
            } else {
                OooOOO0 = C0131o00O0o.OooOOO0(editable, keyEvent, true);
            }
        } else {
            OooOOO0 = C0131o00O0o.OooOOO0(editable, keyEvent, false);
        }
        if (OooOOO0) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.OooO00o.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.OooO00o.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.OooO00o.onKeyUp(view, editable, i, keyEvent);
    }
}
