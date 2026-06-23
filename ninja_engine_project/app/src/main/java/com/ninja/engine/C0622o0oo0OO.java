package com.ninja.engine;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;
/* renamed from: com.ninja.engine.o0oo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622o0oo0OO implements InterfaceC0786oO0OOooO, InterfaceC1192oOoOO0OO, InterfaceC1468oo0O0OOo {
    public final AbstractComponentCallbacksC0593o0oOoOo0 OooO00o;
    public final C1467oo0O0OOO OooO0O0;
    public androidx.lifecycle.OooO00o OooO0OO = null;
    public C1228oOoOo0O0 OooO0Oo = null;

    public C0622o0oo0OO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, C1467oo0O0OOO c1467oo0O0OOO) {
        this.OooO00o = abstractComponentCallbacksC0593o0oOoOo0;
        this.OooO0O0 = c1467oo0O0OOO;
    }

    @Override // com.ninja.engine.InterfaceC1192oOoOO0OO
    public final C0086o000Oo00 OooO00o() {
        OooO0o();
        return (C0086o000Oo00) this.OooO0Oo.OooO0Oo;
    }

    public final void OooO0O0(oO0O0O0o oo0o0o0o) {
        this.OooO0OO.OooO0Oo(oo0o0o0o);
    }

    @Override // com.ninja.engine.InterfaceC0786oO0OOooO
    public final C0910oOO00Oo0 OooO0OO() {
        Application application;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO00o;
        Context applicationContext = abstractComponentCallbacksC0593o0oOoOo0.Oooo00O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C0910oOO00Oo0 c0910oOO00Oo0 = new C0910oOO00Oo0();
        LinkedHashMap linkedHashMap = c0910oOO00Oo0.OooO00o;
        if (application != null) {
            linkedHashMap.put(C0455o0OoOo00.OooO0oo, application);
        }
        linkedHashMap.put(AbstractC0694o0ooooo0.OooOOO, this);
        linkedHashMap.put(AbstractC0694o0ooooo0.OooOOOO, this);
        Bundle bundle = abstractComponentCallbacksC0593o0oOoOo0.OooO0o;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0694o0ooooo0.OooOOOo, bundle);
        }
        return c0910oOO00Oo0;
    }

    @Override // com.ninja.engine.InterfaceC1468oo0O0OOo
    public final C1467oo0O0OOO OooO0Oo() {
        OooO0o();
        return this.OooO0O0;
    }

    public final void OooO0o() {
        if (this.OooO0OO == null) {
            this.OooO0OO = new androidx.lifecycle.OooO00o(this);
            C1228oOoOo0O0 c1228oOoOo0O0 = new C1228oOoOo0O0(this);
            this.OooO0Oo = c1228oOoOo0O0;
            c1228oOoOo0O0.OooO0Oo();
            AbstractC0694o0ooooo0.OooOo00(this);
        }
    }

    @Override // com.ninja.engine.InterfaceC0760oO0O0o0O
    public final androidx.lifecycle.OooO00o OooO0o0() {
        OooO0o();
        return this.OooO0OO;
    }
}
