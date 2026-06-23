package com.ninja.engine;

import android.content.res.Resources;
import java.io.IOException;
/* renamed from: com.ninja.engine.o0OOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396o0OOoo0 implements InterfaceC0346o0OO0o0 {
    public final Resources.Theme OooO00o;
    public final Resources OooO0O0;
    public final InterfaceC0397o0OOoo0O OooO0OO;
    public final int OooO0Oo;
    public Object OooO0o0;

    public C0396o0OOoo0(Resources.Theme theme, Resources resources, InterfaceC0397o0OOoo0O interfaceC0397o0OOoo0O, int i) {
        this.OooO00o = theme;
        this.OooO0O0 = resources;
        this.OooO0OO = interfaceC0397o0OOoo0O;
        this.OooO0Oo = i;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        return this.OooO0OO.OooO00o();
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        Object obj = this.OooO0o0;
        if (obj != null) {
            try {
                this.OooO0OO.OooO0o0(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final int OooO0o() {
        return 1;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0o0(EnumC1000oOOOO0oo enumC1000oOOOO0oo, o0OO0o00 o0oo0o00) {
        try {
            Object OooO0OO = this.OooO0OO.OooO0OO(this.OooO0Oo, this.OooO00o, this.OooO0O0);
            this.OooO0o0 = OooO0OO;
            o0oo0o00.OooO0Oo(OooO0OO);
        } catch (Resources.NotFoundException e) {
            o0oo0o00.OooO0O0(e);
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
    }
}


