package com.ninja.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
/* renamed from: com.ninja.engine.oOOooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1122oOOooO0 implements InterfaceC0745oO00oOo {
    public static final C0838oO0o0oo OooOO0 = new C0838oO0o0oo(50);
    public final InterfaceC1351oo00000O OooO;
    public final C0836oO0o0oO0 OooO0O0;
    public final InterfaceC0745oO00oOo OooO0OO;
    public final InterfaceC0745oO00oOo OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final Class OooO0oO;
    public final C0973oOOO00o OooO0oo;

    public C1122oOOooO0(C0836oO0o0oO0 c0836oO0o0oO0, InterfaceC0745oO00oOo interfaceC0745oO00oOo, InterfaceC0745oO00oOo interfaceC0745oO00oOo2, int i, int i2, InterfaceC1351oo00000O interfaceC1351oo00000O, Class cls, C0973oOOO00o c0973oOOO00o) {
        this.OooO0O0 = c0836oO0o0oO0;
        this.OooO0OO = interfaceC0745oO00oOo;
        this.OooO0Oo = interfaceC0745oO00oOo2;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO = interfaceC1351oo00000O;
        this.OooO0oO = cls;
        this.OooO0oo = c0973oOOO00o;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        Object OooO0o;
        C0836oO0o0oO0 c0836oO0o0oO0 = this.OooO0O0;
        synchronized (c0836oO0o0oO0) {
            C0834oO0o0o0o c0834oO0o0o0o = c0836oO0o0oO0.OooO0O0;
            InterfaceC0994oOOOO00o interfaceC0994oOOOO00o = (InterfaceC0994oOOOO00o) ((ArrayDeque) c0834oO0o0o0o.OooO00o).poll();
            if (interfaceC0994oOOOO00o == null) {
                interfaceC0994oOOOO00o = c0834oO0o0o0o.OooO0O0();
            }
            C0833oO0o0o0O c0833oO0o0o0O = (C0833oO0o0o0O) interfaceC0994oOOOO00o;
            c0833oO0o0o0O.OooO0O0 = 8;
            c0833oO0o0o0O.OooO0OO = byte[].class;
            OooO0o = c0836oO0o0oO0.OooO0o(c0833oO0o0o0O, byte[].class);
        }
        byte[] bArr = (byte[]) OooO0o;
        ByteBuffer.wrap(bArr).putInt(this.OooO0o0).putInt(this.OooO0o).array();
        this.OooO0Oo.OooO0O0(messageDigest);
        this.OooO0OO.OooO0O0(messageDigest);
        messageDigest.update(bArr);
        InterfaceC1351oo00000O interfaceC1351oo00000O = this.OooO;
        if (interfaceC1351oo00000O != null) {
            interfaceC1351oo00000O.OooO0O0(messageDigest);
        }
        this.OooO0oo.OooO0O0(messageDigest);
        C0838oO0o0oo c0838oO0o0oo = OooOO0;
        Class cls = this.OooO0oO;
        byte[] bArr2 = (byte[]) c0838oO0o0oo.OooO00o(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(InterfaceC0745oO00oOo.OooO00o);
            c0838oO0o0oo.OooO0Oo(cls, bArr2);
        }
        messageDigest.update(bArr2);
        this.OooO0O0.OooO0oo(bArr);
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1122oOOooO0)) {
            return false;
        }
        C1122oOOooO0 c1122oOOooO0 = (C1122oOOooO0) obj;
        if (this.OooO0o != c1122oOOooO0.OooO0o || this.OooO0o0 != c1122oOOooO0.OooO0o0 || !AbstractC1401oo00OOO0.OooO0O0(this.OooO, c1122oOOooO0.OooO) || !this.OooO0oO.equals(c1122oOOooO0.OooO0oO) || !this.OooO0OO.equals(c1122oOOooO0.OooO0OO) || !this.OooO0Oo.equals(c1122oOOooO0.OooO0Oo) || !this.OooO0oo.equals(c1122oOOooO0.OooO0oo)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        int hashCode = ((((this.OooO0Oo.hashCode() + (this.OooO0OO.hashCode() * 31)) * 31) + this.OooO0o0) * 31) + this.OooO0o;
        InterfaceC1351oo00000O interfaceC1351oo00000O = this.OooO;
        if (interfaceC1351oo00000O != null) {
            hashCode = (hashCode * 31) + interfaceC1351oo00000O.hashCode();
        }
        int hashCode2 = this.OooO0oO.hashCode();
        return this.OooO0oo.OooO0O0.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.OooO0OO + ", signature=" + this.OooO0Oo + ", width=" + this.OooO0o0 + ", height=" + this.OooO0o + ", decodedResourceClass=" + this.OooO0oO + ", transformation='" + this.OooO + "', options=" + this.OooO0oo + '}';
    }
}


