package com.ninja.engine;
/* renamed from: com.ninja.engine.oOO00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909oOO00Oo extends AbstractC0262o00ooO00 implements InterfaceC0741oO00oO0o, InterfaceC0638o0oo0oo0 {
    public final boolean OooO0oO;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0909oOO00Oo(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            com.ninja.engine.o00oo r1 = com.ninja.engine.C0249o00oo.OooO00o
            java.lang.Class<com.ninja.engine.o00o0o0o> r2 = com.ninja.engine.C0215o00o0o0o.class
            r0 = 0
            r3 = 1
            r0 = r0 & r3
            r6 = 0
            if (r0 != r3) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            r0 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.OooO0oO = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0909oOO00Oo.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // com.ninja.engine.InterfaceC0638o0oo0oo0
    public final Object OooO0O0(Object obj) {
        OooO0o();
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0262o00ooO00
    public final InterfaceC0810oO0OooOo OooO0OO() {
        AbstractC1079oOOoO.OooO00o.getClass();
        return this;
    }

    public final void OooO0o() {
        if (!this.OooO0oO) {
            InterfaceC0810oO0OooOo OooO0o0 = OooO0o0();
            if (OooO0o0 != this) {
                ((C0909oOO00Oo) ((InterfaceC0741oO00oO0o) OooO0o0)).OooO0o();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public final InterfaceC0810oO0OooOo OooO0o0() {
        if (!this.OooO0oO) {
            InterfaceC0810oO0OooOo interfaceC0810oO0OooOo = this.OooO00o;
            if (interfaceC0810oO0OooOo == null) {
                OooO0OO();
                this.OooO00o = this;
            } else {
                return interfaceC0810oO0OooOo;
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0909oOO00Oo) {
            C0909oOO00Oo c0909oOO00Oo = (C0909oOO00Oo) obj;
            if (OooO0Oo().equals(c0909oOO00Oo.OooO0Oo()) && this.OooO0Oo.equals(c0909oOO00Oo.OooO0Oo) && this.OooO0o0.equals(c0909oOO00Oo.OooO0o0) && AbstractC0809oO0OooOO.OooO0o0(this.OooO0O0, c0909oOO00Oo.OooO0O0)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof InterfaceC0741oO00oO0o)) {
            return false;
        } else {
            return obj.equals(OooO0o0());
        }
    }

    public final int hashCode() {
        int hashCode = this.OooO0Oo.hashCode();
        return this.OooO0o0.hashCode() + ((hashCode + (OooO0Oo().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC0810oO0OooOo OooO0o0 = OooO0o0();
        if (OooO0o0 != this) {
            return OooO0o0.toString();
        }
        return AbstractC1230oOoOo0o.OooO(new StringBuilder("property "), this.OooO0Oo, " (Kotlin reflection is not available)");
    }
}
