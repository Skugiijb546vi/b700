package com.ninja.engine;
/* renamed from: com.ninja.engine.oOO0ooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0962oOO0ooO0 extends AbstractC0262o00ooO00 implements InterfaceC0625o0oo0OOo, InterfaceC0810oO0OooOo {
    public final /* synthetic */ int OooO;
    public final int OooO0oO;
    public final int OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0962oOO0ooO0(androidx.activity.OooO0O0 oooO0O0, int i) {
        super(oooO0O0, androidx.activity.OooO0O0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
        this.OooO = i;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
    }

    @Override // com.ninja.engine.InterfaceC0625o0oo0OOo
    public final Object OooO00o() {
        switch (this.OooO) {
            case 0:
                ((androidx.activity.OooO0O0) this.OooO0O0).OooO0Oo();
                return C0455o0OoOo00.OooO0o0;
            default:
                ((androidx.activity.OooO0O0) this.OooO0O0).OooO0Oo();
                return C0455o0OoOo00.OooO0o0;
        }
    }

    @Override // com.ninja.engine.AbstractC0262o00ooO00
    public final InterfaceC0810oO0OooOo OooO0OO() {
        AbstractC1079oOOoO.OooO00o.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0962oOO0ooO0) {
            C0962oOO0ooO0 c0962oOO0ooO0 = (C0962oOO0ooO0) obj;
            if (this.OooO0Oo.equals(c0962oOO0ooO0.OooO0Oo) && this.OooO0o0.equals(c0962oOO0ooO0.OooO0o0) && this.OooO0oo == c0962oOO0ooO0.OooO0oo && this.OooO0oO == c0962oOO0ooO0.OooO0oO && AbstractC0809oO0OooOO.OooO0o0(this.OooO0O0, c0962oOO0ooO0.OooO0O0) && AbstractC0809oO0OooOO.OooO0o0(OooO0Oo(), c0962oOO0ooO0.OooO0Oo())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof C0962oOO0ooO0)) {
            return false;
        } else {
            InterfaceC0810oO0OooOo interfaceC0810oO0OooOo = this.OooO00o;
            if (interfaceC0810oO0OooOo == null) {
                OooO0OO();
                this.OooO00o = this;
                interfaceC0810oO0OooOo = this;
            }
            return obj.equals(interfaceC0810oO0OooOo);
        }
    }

    public final int hashCode() {
        int hashCode;
        if (OooO0Oo() == null) {
            hashCode = 0;
        } else {
            hashCode = OooO0Oo().hashCode() * 31;
        }
        return this.OooO0o0.hashCode() + ((this.OooO0Oo.hashCode() + hashCode) * 31);
    }

    public final String toString() {
        InterfaceC0810oO0OooOo interfaceC0810oO0OooOo = this.OooO00o;
        if (interfaceC0810oO0OooOo == null) {
            OooO0OO();
            this.OooO00o = this;
            interfaceC0810oO0OooOo = this;
        }
        if (interfaceC0810oO0OooOo != this) {
            return interfaceC0810oO0OooOo.toString();
        }
        String str = this.OooO0Oo;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AbstractC1230oOoOo0o.OooO0oo("function ", str, " (Kotlin reflection is not available)");
    }
}
