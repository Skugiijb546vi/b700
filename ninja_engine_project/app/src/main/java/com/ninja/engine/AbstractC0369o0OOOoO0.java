package com.ninja.engine;
/* renamed from: com.ninja.engine.o0OOOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0369o0OOOoO0 {
    public static final /* synthetic */ int[] OooO00o;

    static {
        int[] iArr = new int[oO0O0O0o.values().length];
        try {
            iArr[oO0O0O0o.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oO0O0O0o.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oO0O0O0o.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[oO0O0O0o.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[oO0O0O0o.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[oO0O0O0o.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[oO0O0O0o.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        OooO00o = iArr;
    }
}
