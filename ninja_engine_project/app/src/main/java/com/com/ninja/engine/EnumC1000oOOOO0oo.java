package com.ninja.engine;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.ninja.engine.oOOOO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1000oOOOO0oo {
    public static final EnumC1000oOOOO0oo OooO00o;
    public static final EnumC1000oOOOO0oo OooO0O0;
    public static final EnumC1000oOOOO0oo OooO0OO;
    public static final EnumC1000oOOOO0oo OooO0Oo;
    public static final /* synthetic */ EnumC1000oOOOO0oo[] OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, com.ninja.engine.oOOOO0oo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.ninja.engine.oOOOO0oo] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.ninja.engine.oOOOO0oo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.ninja.engine.oOOOO0oo] */
    static {
        ?? r4 = new Enum("IMMEDIATE", 0);
        OooO00o = r4;
        ?? r5 = new Enum("HIGH", 1);
        OooO0O0 = r5;
        ?? r6 = new Enum("NORMAL", 2);
        OooO0OO = r6;
        ?? r7 = new Enum("LOW", 3);
        OooO0Oo = r7;
        OooO0o0 = new EnumC1000oOOOO0oo[]{r4, r5, r6, r7};
    }

    public static EnumC1000oOOOO0oo valueOf(String str) {
        return (EnumC1000oOOOO0oo) Enum.valueOf(EnumC1000oOOOO0oo.class, str);
    }

    public static EnumC1000oOOOO0oo[] values() {
        return (EnumC1000oOOOO0oo[]) OooO0o0.clone();
    }
}
