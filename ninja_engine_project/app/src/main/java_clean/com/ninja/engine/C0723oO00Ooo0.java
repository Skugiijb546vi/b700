package com.ninja.engine;

import java.io.InputStream;
/* renamed from: com.ninja.engine.oO00Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723oO00Ooo0 implements o0OO0o {
    public final C0836oO0o0oO0 OooO00o;

    public C0723oO00Ooo0(C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = c0836oO0o0oO0;
    }

    @Override // com.ninja.engine.o0OO0o
    public final Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.ninja.engine.o0OO0o
    public final o0OO0oO0 OooO0O0(Object obj) {
        return new o00O((InputStream) obj, this.OooO00o);
    }
}


