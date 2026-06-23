package com.ninja.engine;

import java.io.Serializable;
/* renamed from: com.ninja.engine.oOOO0oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987oOOO0oO0 implements Serializable {
    public final Object OooO00o;
    public final Object OooO0O0;

    public C0987oOOO0oO0(Object obj, Object obj2) {
        this.OooO00o = obj;
        this.OooO0O0 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0987oOOO0oO0)) {
            return false;
        }
        C0987oOOO0oO0 c0987oOOO0oO0 = (C0987oOOO0oO0) obj;
        if (AbstractC0809oO0OooOO.OooO0o0(this.OooO00o, c0987oOOO0oO0.OooO00o) && AbstractC0809oO0OooOO.OooO0o0(this.OooO0O0, c0987oOOO0oO0.OooO0O0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.OooO00o;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.OooO0O0;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "(" + this.OooO00o + ", " + this.OooO0O0 + ')';
    }
}


