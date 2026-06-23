package com.ninja.engine;
/* renamed from: com.ninja.engine.oOo000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148oOo000O extends AbstractC0692o0ooooOo {
    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final void OooOOoo(C1214oOoOOo0o c1214oOoOOo0o, float f, float f2) {
        c1214oOoOOo0o.OooO0Oo(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        C1319oOooOooO c1319oOooOooO = new C1319oOooOooO(0.0f, 0.0f, f3, f3);
        c1319oOooOooO.OooO0o = 180.0f;
        c1319oOooOooO.OooO0oO = 90.0f;
        c1214oOoOOo0o.OooO0oO.add(c1319oOooOooO);
        C1207oOoOOOo c1207oOoOOOo = new C1207oOoOOOo(c1319oOooOooO);
        c1214oOoOOo0o.OooO00o(180.0f);
        c1214oOoOOo0o.OooO0oo.add(c1207oOoOOOo);
        c1214oOoOOo0o.OooO0o0 = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        c1214oOoOOo0o.OooO0OO = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        c1214oOoOOo0o.OooO0Oo = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
