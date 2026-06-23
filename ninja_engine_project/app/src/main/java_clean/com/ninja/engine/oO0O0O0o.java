package com.ninja.engine;
public enum oO0O0O0o {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final C1799ooOOOoO0 Companion = new C1799ooOOOoO0();

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


