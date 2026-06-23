package com.ninja.engine;
/* renamed from: com.ninja.engine.oOoooO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338oOoooO0o extends AbstractC1473oo0O0o0 {
    public final /* synthetic */ int OooO00o;
    public boolean OooO0O0;
    public int OooO0OO;
    public final /* synthetic */ Object OooO0Oo;

    public C1338oOoooO0o(C1339oOoooOO0 c1339oOoooOO0, int i) {
        this.OooO00o = 0;
        this.OooO0Oo = c1339oOoooOO0;
        this.OooO0OO = i;
        this.OooO0O0 = false;
    }

    @Override // com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO00o() {
        switch (this.OooO00o) {
            case 0:
                if (!this.OooO0O0) {
                    ((C1339oOoooOO0) this.OooO0Oo).OooO00o.setVisibility(this.OooO0OO);
                    return;
                }
                return;
            default:
                int i = this.OooO0OO + 1;
                this.OooO0OO = i;
                C1471oo0O0Ooo c1471oo0O0Ooo = (C1471oo0O0Ooo) this.OooO0Oo;
                if (i == c1471oo0O0Ooo.OooO00o.size()) {
                    InterfaceC1474oo0O0o00 interfaceC1474oo0O0o00 = c1471oo0O0Ooo.OooO0Oo;
                    if (interfaceC1474oo0O0o00 != null) {
                        interfaceC1474oo0O0o00.OooO00o();
                    }
                    this.OooO0OO = 0;
                    this.OooO0O0 = false;
                    c1471oo0O0Ooo.OooO0o0 = false;
                    return;
                }
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC1473oo0O0o0, com.ninja.engine.InterfaceC1474oo0O0o00
    public void OooO0O0() {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0 = true;
                return;
            default:
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC1473oo0O0o0, com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO0OO() {
        switch (this.OooO00o) {
            case 0:
                ((C1339oOoooOO0) this.OooO0Oo).OooO00o.setVisibility(0);
                return;
            default:
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    InterfaceC1474oo0O0o00 interfaceC1474oo0O0o00 = ((C1471oo0O0Ooo) this.OooO0Oo).OooO0Oo;
                    if (interfaceC1474oo0O0o00 != null) {
                        interfaceC1474oo0O0o00.OooO0OO();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C1338oOoooO0o(C1471oo0O0Ooo c1471oo0O0Ooo) {
        this.OooO00o = 1;
        this.OooO0Oo = c1471oo0O0Ooo;
        this.OooO0O0 = false;
        this.OooO0OO = 0;
    }
}
