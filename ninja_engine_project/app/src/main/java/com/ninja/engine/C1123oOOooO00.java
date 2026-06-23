package com.ninja.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.ninja.engine.oOOooO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123oOOooO00 implements InterfaceC0348o0OO0o0o, o0OO0o00 {
    public File OooO;
    public final InterfaceC0347o0OO0o0O OooO00o;
    public final o0OOO0O0 OooO0O0;
    public int OooO0OO;
    public int OooO0Oo = -1;
    public List OooO0o;
    public InterfaceC0745oO00oOo OooO0o0;
    public int OooO0oO;
    public volatile C0903oOO000Oo OooO0oo;
    public C1122oOOooO0 OooOO0;

    public C1123oOOooO00(o0OOO0O0 o0ooo0o0, InterfaceC0347o0OO0o0O interfaceC0347o0OO0o0O) {
        this.OooO0O0 = o0ooo0o0;
        this.OooO00o = interfaceC0347o0OO0o0O;
    }

    @Override // com.ninja.engine.o0OO0o00
    public final void OooO0O0(Exception exc) {
        this.OooO00o.OooO0Oo(this.OooOO0, exc, this.OooO0oo.OooO0OO, 4);
    }

    @Override // com.ninja.engine.InterfaceC0348o0OO0o0o
    public final boolean OooO0OO() {
        ArrayList OooO00o = this.OooO0O0.OooO00o();
        boolean z = false;
        if (OooO00o.isEmpty()) {
            return false;
        }
        List OooO0Oo = this.OooO0O0.OooO0Oo();
        if (OooO0Oo.isEmpty()) {
            if (File.class.equals(this.OooO0O0.OooOO0O)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.OooO0O0.OooO0Oo.getClass() + " to " + this.OooO0O0.OooOO0O);
        }
        while (true) {
            List list = this.OooO0o;
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
            if (i2 >= OooO0Oo.size()) {
                int i3 = this.OooO0OO + 1;
                this.OooO0OO = i3;
                if (i3 >= OooO00o.size()) {
                    return false;
                }
                this.OooO0Oo = 0;
            }
            InterfaceC0745oO00oOo interfaceC0745oO00oOo = (InterfaceC0745oO00oOo) OooO00o.get(this.OooO0OO);
            Class cls = (Class) OooO0Oo.get(this.OooO0Oo);
            InterfaceC1351oo00000O OooO0o = this.OooO0O0.OooO0o(cls);
            o0OOO0O0 o0ooo0o02 = this.OooO0O0;
            this.OooOO0 = new C1122oOOooO0(o0ooo0o02.OooO0OO.OooO00o, interfaceC0745oO00oOo, o0ooo0o02.OooOOO, o0ooo0o02.OooO0o0, o0ooo0o02.OooO0o, OooO0o, cls, o0ooo0o02.OooO);
            File OooOOOo = o0ooo0o02.OooO0oo.OooO00o().OooOOOo(this.OooOO0);
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
        this.OooO00o.OooO0O0(this.OooO0o0, obj, this.OooO0oo.OooO0OO, 4, this.OooOO0);
    }

    @Override // com.ninja.engine.InterfaceC0348o0OO0o0o
    public final void cancel() {
        C0903oOO000Oo c0903oOO000Oo = this.OooO0oo;
        if (c0903oOO000Oo != null) {
            c0903oOO000Oo.OooO0OO.cancel();
        }
    }
}
