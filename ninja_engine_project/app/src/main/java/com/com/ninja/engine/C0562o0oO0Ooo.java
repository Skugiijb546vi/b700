package com.ninja.engine;

import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.o0oO0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562o0oO0Ooo {
    public final int OooO00o;
    public final Method OooO0O0;

    public C0562o0oO0Ooo(int i, Method method) {
        this.OooO00o = i;
        this.OooO0O0 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0562o0oO0Ooo)) {
            return false;
        }
        C0562o0oO0Ooo c0562o0oO0Ooo = (C0562o0oO0Ooo) obj;
        if (this.OooO00o == c0562o0oO0Ooo.OooO00o && this.OooO0O0.getName().equals(c0562o0oO0Ooo.OooO0O0.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0O0.getName().hashCode() + (this.OooO00o * 31);
    }
}
