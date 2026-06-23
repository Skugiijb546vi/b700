package com.ninja.engine;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.ninja.engine.o0oo00OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0612o0oo00OO {
    public static final EnumC0612o0oo00OO OooO00o;
    public static final EnumC0612o0oo00OO OooO0O0;
    public static final EnumC0612o0oo00OO OooO0OO;
    public static final /* synthetic */ EnumC0612o0oo00OO[] OooO0Oo;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0612o0oo00OO EF8;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, com.ninja.engine.o0oo00OO] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, com.ninja.engine.o0oo00OO] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, com.ninja.engine.o0oo00OO] */
    static {
        Enum r8 = new Enum("PENALTY_LOG", 0);
        Enum r9 = new Enum("PENALTY_DEATH", 1);
        Enum r10 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        OooO00o = r10;
        Enum r11 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        OooO0O0 = r11;
        Enum r12 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 4);
        Enum r13 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 5);
        Enum r14 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 6);
        Enum r15 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        OooO0OO = r15;
        OooO0Oo = new EnumC0612o0oo00OO[]{r8, r9, r10, r11, r12, r13, r14, r15};
    }

    public static EnumC0612o0oo00OO valueOf(String str) {
        return (EnumC0612o0oo00OO) Enum.valueOf(EnumC0612o0oo00OO.class, str);
    }

    public static EnumC0612o0oo00OO[] values() {
        return (EnumC0612o0oo00OO[]) OooO0Oo.clone();
    }
}

