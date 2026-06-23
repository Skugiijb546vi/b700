package com.ninja.engine;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;
import java.util.Map;
/* renamed from: com.ninja.engine.ooo0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1932ooo0Oo0 extends ContextWrapper {
    public static final C0675o0oooO OooOO0O;
    public final int OooO;
    public final C0836oO0o0oO0 OooO00o;
    public final C0325o0O0oOO0 OooO0O0;
    public final C0601o0oOooO0 OooO0OO;
    public final C0601o0oOooO0 OooO0Oo;
    public final Map OooO0o;
    public final List OooO0o0;
    public final C0496o0o000OO OooO0oO;
    public final o00O OooO0oo;
    public C1105oOOoOoo OooOO0;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0oooO, java.lang.Object] */
    static {
        Object obj = new Object();
        obj.OooO00o = C0929oOO0OOOo.OooO00o;
        OooOO0O = obj;
    }

    public C1932ooo0Oo0(Context context, C0836oO0o0oO0 c0836oO0o0oO0, C1228oOoOo0O0 c1228oOoOo0O0, C0601o0oOooO0 c0601o0oOooO0, C0601o0oOooO0 c0601o0oOooO02, C0145o00OO0oO c0145o00OO0oO, List list, C0496o0o000OO c0496o0o000OO, o00O o00o, int i) {
        super(context.getApplicationContext());
        this.OooO00o = c0836oO0o0oO0;
        this.OooO0OO = c0601o0oOooO0;
        this.OooO0Oo = c0601o0oOooO02;
        this.OooO0o0 = list;
        this.OooO0o = c0145o00OO0oO;
        this.OooO0oO = c0496o0o000OO;
        this.OooO0oo = o00o;
        this.OooO = i;
        this.OooO0O0 = new C0325o0O0oOO0(c1228oOoOo0O0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ninja.engine.o00Ooooo, com.ninja.engine.oOOoOoo] */
    public final synchronized C1105oOOoOoo OooO00o() {
        try {
            if (this.OooOO0 == null) {
                this.OooO0Oo.getClass();
                AbstractC0186o00Ooooo abstractC0186o00Ooooo = new AbstractC0186o00Ooooo();
                abstractC0186o00Ooooo.OooOo00 = true;
                this.OooOO0 = abstractC0186o00Ooooo;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.OooOO0;
    }

    public final C1089oOOoOOO OooO0O0() {
        return (C1089oOOoOOO) this.OooO0O0.get();
    }
}

