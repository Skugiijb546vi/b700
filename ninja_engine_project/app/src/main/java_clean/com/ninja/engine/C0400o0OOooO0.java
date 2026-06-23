package com.ninja.engine;

import java.io.File;
import java.util.List;
/* renamed from: com.ninja.engine.o0OOooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400o0OOooO0 implements InterfaceC0348o0OO0o0o, o0OO0o00 {
    public File OooO;
    public final List OooO00o;
    public final o0OOO0O0 OooO0O0;
    public final InterfaceC0347o0OO0o0O OooO0OO;
    public int OooO0Oo = -1;
    public List OooO0o;
    public InterfaceC0745oO00oOo OooO0o0;
    public int OooO0oO;
    public volatile C0903oOO000Oo OooO0oo;

    public C0400o0OOooO0(List list, o0OOO0O0 o0ooo0o0, InterfaceC0347o0OO0o0O interfaceC0347o0OO0o0O) {
        this.OooO00o = list;
        this.OooO0O0 = o0ooo0o0;
        this.OooO0OO = interfaceC0347o0OO0o0O;
    }

    @Override // com.ninja.engine.o0OO0o00
    public final void OooO0O0(Exception exc) {
        this.OooO0OO.OooO0Oo(this.OooO0o0, exc, this.OooO0oo.OooO0OO, 3);
    }

    @Override // com.ninja.engine.InterfaceC0348o0OO0o0o
    public final boolean OooO0OO() {
        while (true) {
            List list = this.OooO0o;
            boolean z = false;
            if (list != null && this.OooO0oO < list.size()) {
                this.OooO0oo = null;
                while (!z && this.OooO0oO < this.OooO0o.size()) {
                    List list2 = this.OooO0o;
                    int i = this.OooO0oO;
                    this.OooO0oO = i + 1;
                    File file = this.OooO;
                    o0OOO0O0 o0ooo0o0 = this.OooO0O0;
                    this.OooO0oo = ((InterfaceC0904oOO000o0) list2.get(i)).OooO00o(file, o0ooo0o0.OooO0o0, o0ooo0o0.OooO0o, o0ooo0o0.OooO);
                    if (this.OooO0oo != null && this.OooO0O0.OooO0OO(this.OooO0oo.OooO0OO.OooO00o()) != null) {
                        this.OooO0oo.OooO0OO.OooO0o0(this.OooO0O0.OooOOOO, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.OooO0Oo + 1;
            this.OooO0Oo = i2;
            if (i2 >= this.OooO00o.size()) {
                return false;
            }
            InterfaceC0745oO00oOo interfaceC0745oO00oOo = (InterfaceC0745oO00oOo) this.OooO00o.get(this.OooO0Oo);
            o0OOO0O0 o0ooo0o02 = this.OooO0O0;
            File OooOOOo = o0ooo0o02.OooO0oo.OooO00o().OooOOOo(new C0345o0OO0Ooo(interfaceC0745oO00oOo, o0ooo0o02.OooOOO));
            this.OooO = OooOOOo;
            if (OooOOOo != null) {
                this.OooO0o0 = interfaceC0745oO00oOo;
                this.OooO0o = this.OooO0O0.OooO0OO.OooO0O0().OooO0oO(OooOOOo);
                this.OooO0oO = 0;
            }
        }
    }

    @Override // com.ninja.engine.o0OO0o00
    public final void OooO0Oo(Object obj) {
        this.OooO0OO.OooO0O0(this.OooO0o0, obj, this.OooO0oo.OooO0OO, 3, this.OooO0o0);
    }

    @Override // com.ninja.engine.InterfaceC0348o0OO0o0o
    public final void cancel() {
        C0903oOO000Oo c0903oOO000Oo = this.OooO0oo;
        if (c0903oOO000Oo != null) {
            c0903oOO000Oo.OooO0OO.cancel();
        }
    }
}


