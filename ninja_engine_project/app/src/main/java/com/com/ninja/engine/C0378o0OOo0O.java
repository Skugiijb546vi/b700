package com.ninja.engine;
/* renamed from: com.ninja.engine.o0OOo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378o0OOo0O extends AbstractC0809oO0OooOO {
    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final float Oooo0OO(Object obj) {
        return ((C0380o0OOo0OO) obj).OooOOOO.OooO0O0 * 10000.0f;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void o00Oo0(Object obj, float f) {
        C0380o0OOo0OO c0380o0OOo0OO = (C0380o0OOo0OO) obj;
        c0380o0OOo0OO.OooOOOO.OooO0O0 = f / 10000.0f;
        c0380o0OOo0OO.invalidateSelf();
    }
}
