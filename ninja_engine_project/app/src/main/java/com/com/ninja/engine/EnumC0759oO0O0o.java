package com.ninja.engine;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.ninja.engine.oO0O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0759oO0O0o {
    public static final EnumC0759oO0O0o OooO00o;
    public static final EnumC0759oO0O0o OooO0O0;
    public static final EnumC0759oO0O0o OooO0OO;
    public static final EnumC0759oO0O0o OooO0Oo;
    public static final /* synthetic */ EnumC0759oO0O0o[] OooO0o;
    public static final EnumC0759oO0O0o OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, com.ninja.engine.oO0O0o] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, com.ninja.engine.oO0O0o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, com.ninja.engine.oO0O0o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, com.ninja.engine.oO0O0o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, com.ninja.engine.oO0O0o] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        OooO00o = r5;
        ?? r6 = new Enum("INITIALIZED", 1);
        OooO0O0 = r6;
        ?? r7 = new Enum("CREATED", 2);
        OooO0OO = r7;
        ?? r8 = new Enum("STARTED", 3);
        OooO0Oo = r8;
        ?? r9 = new Enum("RESUMED", 4);
        OooO0o0 = r9;
        OooO0o = new EnumC0759oO0O0o[]{r5, r6, r7, r8, r9};
    }

    public static EnumC0759oO0O0o valueOf(String str) {
        return (EnumC0759oO0O0o) Enum.valueOf(EnumC0759oO0O0o.class, str);
    }

    public static EnumC0759oO0O0o[] values() {
        return (EnumC0759oO0O0o[]) OooO0o.clone();
    }
}
