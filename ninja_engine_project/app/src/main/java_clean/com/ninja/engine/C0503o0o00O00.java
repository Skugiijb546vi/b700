package com.ninja.engine;

import java.security.MessageDigest;
import java.util.Map;
/* renamed from: com.ninja.engine.o0o00O00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503o0o00O00 implements InterfaceC0745oO00oOo {
    public final C0973oOOO00o OooO;
    public final Object OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final Class OooO0o;
    public final Class OooO0o0;
    public final InterfaceC0745oO00oOo OooO0oO;
    public final Map OooO0oo;
    public int OooOO0;

    public C0503o0o00O00(Object obj, InterfaceC0745oO00oOo interfaceC0745oO00oOo, int i, int i2, C0257o00oo0o c0257o00oo0o, Class cls, Class cls2, C0973oOOO00o c0973oOOO00o) {
        AbstractC0694o0ooooo0.OooOO0O(obj, "Argument must not be null");
        this.OooO0O0 = obj;
        AbstractC0694o0ooooo0.OooOO0O(interfaceC0745oO00oOo, "Signature must not be null");
        this.OooO0oO = interfaceC0745oO00oOo;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        AbstractC0694o0ooooo0.OooOO0O(c0257o00oo0o, "Argument must not be null");
        this.OooO0oo = c0257o00oo0o;
        AbstractC0694o0ooooo0.OooOO0O(cls, "Resource class must not be null");
        this.OooO0o0 = cls;
        AbstractC0694o0ooooo0.OooOO0O(cls2, "Transcode class must not be null");
        this.OooO0o = cls2;
        AbstractC0694o0ooooo0.OooOO0O(c0973oOOO00o, "Argument must not be null");
        this.OooO = c0973oOOO00o;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0503o0o00O00)) {
            return false;
        }
        C0503o0o00O00 c0503o0o00O00 = (C0503o0o00O00) obj;
        if (!this.OooO0O0.equals(c0503o0o00O00.OooO0O0) || !this.OooO0oO.equals(c0503o0o00O00.OooO0oO) || this.OooO0Oo != c0503o0o00O00.OooO0Oo || this.OooO0OO != c0503o0o00O00.OooO0OO || !this.OooO0oo.equals(c0503o0o00O00.OooO0oo) || !this.OooO0o0.equals(c0503o0o00O00.OooO0o0) || !this.OooO0o.equals(c0503o0o00O00.OooO0o) || !this.OooO.equals(c0503o0o00O00.OooO)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        if (this.OooOO0 == 0) {
            int hashCode = this.OooO0O0.hashCode();
            this.OooOO0 = hashCode;
            int hashCode2 = ((((this.OooO0oO.hashCode() + (hashCode * 31)) * 31) + this.OooO0OO) * 31) + this.OooO0Oo;
            this.OooOO0 = hashCode2;
            int hashCode3 = this.OooO0oo.hashCode() + (hashCode2 * 31);
            this.OooOO0 = hashCode3;
            int hashCode4 = this.OooO0o0.hashCode() + (hashCode3 * 31);
            this.OooOO0 = hashCode4;
            int hashCode5 = this.OooO0o.hashCode() + (hashCode4 * 31);
            this.OooOO0 = hashCode5;
            this.OooOO0 = this.OooO.OooO0O0.hashCode() + (hashCode5 * 31);
        }
        return this.OooOO0;
    }

    public final String toString() {
        return "EngineKey{model=" + this.OooO0O0 + ", width=" + this.OooO0OO + ", height=" + this.OooO0Oo + ", resourceClass=" + this.OooO0o0 + ", transcodeClass=" + this.OooO0o + ", signature=" + this.OooO0oO + ", hashCode=" + this.OooOO0 + ", transformations=" + this.OooO0oo + ", options=" + this.OooO + '}';
    }
}


