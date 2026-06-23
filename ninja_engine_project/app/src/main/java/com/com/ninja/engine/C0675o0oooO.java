package com.ninja.engine;
/* renamed from: com.ninja.engine.o0oooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675o0oooO implements Cloneable {
    public C0919oOO00oOo OooO00o;

    /* renamed from: OooO00o */
    public final C0675o0oooO clone() {
        try {
            return (C0675o0oooO) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean OooO0O0(Object obj) {
        if (obj instanceof C0675o0oooO) {
            return AbstractC1401oo00OOO0.OooO0O0(this.OooO00o, ((C0675o0oooO) obj).OooO00o);
        }
        return false;
    }

    public final int OooO0OO() {
        C0919oOO00oOo c0919oOO00oOo = this.OooO00o;
        if (c0919oOO00oOo != null) {
            return c0919oOO00oOo.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0675o0oooO) && OooO0O0(obj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return OooO0OO();
    }
}
