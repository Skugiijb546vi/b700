package com.ninja.engine;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.ninja.engine.oOOOO0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0999oOOOO0oO {
    public static final EnumC0999oOOOO0oO OooO00o;
    public static final /* synthetic */ EnumC0999oOOOO0oO[] OooO0O0;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0999oOOOO0oO EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.ninja.engine.oOOOO0oO] */
    static {
        Enum r2 = new Enum("SRGB", 0);
        Enum r3 = new Enum("DISPLAY_P3", 1);
        OooO00o = r3;
        OooO0O0 = new EnumC0999oOOOO0oO[]{r2, r3};
    }

    public static EnumC0999oOOOO0oO valueOf(String str) {
        return (EnumC0999oOOOO0oO) Enum.valueOf(EnumC0999oOOOO0oO.class, str);
    }

    public static EnumC0999oOOOO0oO[] values() {
        return (EnumC0999oOOOO0oO[]) OooO0O0.clone();
    }
}

