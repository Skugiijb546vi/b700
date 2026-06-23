package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
/* renamed from: com.ninja.engine.o0oOoOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589o0oOoOO0 extends AbstractC0692o0ooooOo implements InterfaceC0964oOO0ooOo, InterfaceC1024oOOOoO, InterfaceC0968oOO0oooo, oOO, InterfaceC1468oo0O0OOo, InterfaceC0963oOO0ooOO, o0000O0O, InterfaceC1192oOoOO0OO, InterfaceC0609o0oo000O, InterfaceC0890oO0ooO00 {
    public final C0606o0oOoooO Oooo0;
    public final Activity Oooo000;
    public final Context Oooo00O;
    public final Handler Oooo00o;
    public final /* synthetic */ o000OO00 Oooo0O0;

    public C0589o0oOoOO0(o000OO00 o000oo00) {
        this.Oooo0O0 = o000oo00;
        Handler handler = new Handler();
        this.Oooo0 = new C0606o0oOoooO();
        this.Oooo000 = o000oo00;
        this.Oooo00O = o000oo00;
        this.Oooo00o = handler;
    }

    @Override // com.ninja.engine.InterfaceC1192oOoOO0OO
    public final C0086o000Oo00 OooO00o() {
        return (C0086o000Oo00) this.Oooo0O0.OooO0o0.OooO0Oo;
    }

    @Override // com.ninja.engine.InterfaceC0609o0oo000O
    public final void OooO0O0() {
        this.Oooo0O0.getClass();
    }

    @Override // com.ninja.engine.InterfaceC1468oo0O0OOo
    public final C1467oo0O0OOO OooO0Oo() {
        return this.Oooo0O0.OooO0Oo();
    }

    @Override // com.ninja.engine.InterfaceC0760oO0O0o0O
    public final androidx.lifecycle.OooO00o OooO0o0() {
        return this.Oooo0O0.OooOOoo;
    }

    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final View Oooo0o(int i) {
        return this.Oooo0O0.findViewById(i);
    }

    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final boolean Oooo0oO() {
        Window window = this.Oooo0O0.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    public final void o00O0O(C0599o0oOoo0O c0599o0oOoo0O) {
        this.Oooo0O0.OooO0oO(c0599o0oOoo0O);
    }

    public final void o00Oo0(InterfaceC0319o0O0o0oo interfaceC0319o0O0o0oo) {
        this.Oooo0O0.OooO0oo(interfaceC0319o0O0o0oo);
    }

    public final void o00Ooo(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOO0(c0592o0oOoOo);
    }

    public final void o00o0O(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOO0O(c0592o0oOoOo);
    }

    public final void o00oO0O(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOOOo(c0592o0oOoOo);
    }

    public final void o00oO0o(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOOOO(c0592o0oOoOo);
    }

    public final void o00ooo(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOO0o(c0592o0oOoOo);
    }

    public final void o0ooOO0(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOOo0(c0592o0oOoOo);
    }

    public final void o0ooOOo(C0592o0oOoOo c0592o0oOoOo) {
        this.Oooo0O0.OooOOo(c0592o0oOoOo);
    }

    public final void oo000o(C0599o0oOoo0O c0599o0oOoo0O) {
        this.Oooo0O0.OooOOO(c0599o0oOoo0O);
    }
}
