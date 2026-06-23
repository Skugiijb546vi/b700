package com.ninja.engine;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class oO0O0O0o {
    private static final /* synthetic */ oO0O0O0o[] $VALUES;
    public static final C1799ooOOOoO0 Companion;
    public static final oO0O0O0o ON_ANY;
    public static final oO0O0O0o ON_CREATE;
    public static final oO0O0O0o ON_DESTROY;
    public static final oO0O0O0o ON_PAUSE;
    public static final oO0O0O0o ON_RESUME;
    public static final oO0O0O0o ON_START;
    public static final oO0O0O0o ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.ooOOOoO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, com.ninja.engine.oO0O0O0o] */
    static {
        ?? r7 = new Enum("ON_CREATE", 0);
        ON_CREATE = r7;
        ?? r8 = new Enum("ON_START", 1);
        ON_START = r8;
        ?? r9 = new Enum("ON_RESUME", 2);
        ON_RESUME = r9;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        $VALUES = new oO0O0O0o[]{r7, r8, r9, r10, r11, r12, r13};
        Companion = new Object();
    }

    public static oO0O0O0o valueOf(String str) {
        return (oO0O0O0o) Enum.valueOf(oO0O0O0o.class, str);
    }

    public static oO0O0O0o[] values() {
        return (oO0O0O0o[]) $VALUES.clone();
    }

    public final EnumC0759oO0O0o OooO00o() {
        switch (AbstractC1802ooOOOoo0.OooO00o[ordinal()]) {
            case 1:
            case 2:
                return EnumC0759oO0O0o.OooO0OO;
            case 3:
            case 4:
                return EnumC0759oO0O0o.OooO0Oo;
            case 5:
                return EnumC0759oO0O0o.OooO0o0;
            case 6:
                return EnumC0759oO0O0o.OooO00o;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
