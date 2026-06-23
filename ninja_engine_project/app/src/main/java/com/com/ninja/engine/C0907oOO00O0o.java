package com.ninja.engine;
/* renamed from: com.ninja.engine.oOO00O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0907oOO00O0o {
    public Class OooO00o;
    public Class OooO0O0;
    public Class OooO0OO;

    public C0907oOO00O0o(Class cls, Class cls2, Class cls3) {
        this.OooO00o = cls;
        this.OooO0O0 = cls2;
        this.OooO0OO = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0907oOO00O0o.class != obj.getClass()) {
            return false;
        }
        C0907oOO00O0o c0907oOO00O0o = (C0907oOO00O0o) obj;
        if (this.OooO00o.equals(c0907oOO00O0o.OooO00o) && this.OooO0O0.equals(c0907oOO00O0o.OooO0O0) && AbstractC1401oo00OOO0.OooO0O0(this.OooO0OO, c0907oOO00O0o.OooO0OO)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.OooO0O0.hashCode() + (this.OooO00o.hashCode() * 31)) * 31;
        Class cls = this.OooO0OO;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.OooO00o + ", second=" + this.OooO0O0 + '}';
    }
}
