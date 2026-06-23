package com.ninja.engine;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0OOO0 {
    public static final o0OOO0 OooO00o;
    public static final o0OOO0 OooO0O0;
    public static final o0OOO0 OooO0OO;
    public static final /* synthetic */ o0OOO0[] OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, com.ninja.engine.o0OOO0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.ninja.engine.o0OOO0] */
    static {
        Enum r2 = new Enum("PREFER_ARGB_8888", 0);
        OooO00o = r2;
        Enum r3 = new Enum("PREFER_RGB_565", 1);
        OooO0O0 = r3;
        OooO0Oo = new o0OOO0[]{r2, r3};
        OooO0OO = r2;
    }

    public static o0OOO0 valueOf(String str) {
        return (o0OOO0) Enum.valueOf(o0OOO0.class, str);
    }

    public static o0OOO0[] values() {
        return (o0OOO0[]) OooO0Oo.clone();
    }
}

