package com.ninja.engine;

import android.graphics.Rect;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOOO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0986oOOO0oO {
    public final Object OooO00o;
    public final Object OooO0O0;

    public C0986oOOO0oO(Rect rect, Rect rect2) {
        this.OooO00o = rect;
        this.OooO0O0 = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0986oOOO0oO)) {
            return false;
        }
        C0986oOOO0oO c0986oOOO0oO = (C0986oOOO0oO) obj;
        if (!Objects.equals(c0986oOOO0oO.OooO00o, this.OooO00o) || !Objects.equals(c0986oOOO0oO.OooO0O0, this.OooO0O0)) {
            return false;
        }
        return true;
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
        Object obj2 = this.OooO0O0;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.OooO00o + " " + this.OooO0O0 + "}";
    }
}
