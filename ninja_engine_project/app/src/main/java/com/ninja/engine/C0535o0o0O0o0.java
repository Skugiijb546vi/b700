package com.ninja.engine;

import java.util.Random;
/* renamed from: com.ninja.engine.o0o0O0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535o0o0O0o0 extends AbstractC0019OooOOoo {
    public final C0533o0o0O0OO OooO0OO = new ThreadLocal();

    @Override // com.ninja.engine.AbstractC0019OooOOoo
    public final Random OooO00o() {
        Object obj = this.OooO0OO.get();
        AbstractC0809oO0OooOO.OooOOOO(obj, "get(...)");
        return (Random) obj;
    }
}
