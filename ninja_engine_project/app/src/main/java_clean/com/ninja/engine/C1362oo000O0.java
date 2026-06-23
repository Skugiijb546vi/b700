package com.ninja.engine;
/* renamed from: com.ninja.engine.oo000O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362oo000O0 extends AbstractC1357oo0000o {
    public final /* synthetic */ int OooO00o = 1;
    public AbstractC1358oo0000o0 OooO0O0;

    public /* synthetic */ C1362oo000O0() {
    }

    @Override // com.ninja.engine.AbstractC1357oo0000o, com.ninja.engine.InterfaceC1356oo0000Oo
    public void OooO0O0(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        switch (this.OooO00o) {
            case 1:
                C1363oo000O0O c1363oo000O0O = (C1363oo000O0O) this.OooO0O0;
                if (!c1363oo000O0O.OooOooO) {
                    c1363oo000O0O.Oooo0();
                    c1363oo000O0O.OooOooO = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC1356oo0000Oo
    public final void OooO0oO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.OooOoo0();
                abstractC1358oo0000o0.OooOoO0(this);
                return;
            default:
                C1363oo000O0O c1363oo000O0O = (C1363oo000O0O) this.OooO0O0;
                int i = c1363oo000O0O.OooOoo - 1;
                c1363oo000O0O.OooOoo = i;
                if (i == 0) {
                    c1363oo000O0O.OooOooO = false;
                    c1363oo000O0O.OooOOO();
                }
                abstractC1358oo0000o0.OooOoO0(this);
                return;
        }
    }

    public C1362oo000O0(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        this.OooO0O0 = abstractC1358oo0000o0;
    }
}


