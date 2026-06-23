package com.ninja.engine;
/* renamed from: com.ninja.engine.ooOOOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1799ooOOOoO0 {
    public static oO0O0O0o OooO00o(EnumC0759oO0O0o enumC0759oO0O0o) {
        AbstractC0809oO0OooOO.OooOOOo(enumC0759oO0O0o, "state");
        int ordinal = enumC0759oO0O0o.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return oO0O0O0o.ON_RESUME;
            }
            return oO0O0O0o.ON_START;
        }
        return oO0O0O0o.ON_CREATE;
    }
}


