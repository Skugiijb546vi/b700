package com.ninja.engine;

import android.window.BackEvent;
/* renamed from: com.ninja.engine.o00OoOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173o00OoOo0 {
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final int OooO0Oo;

    public C0173o00OoOo0(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        C0081o000O0oO c0081o000O0oO = C0081o000O0oO.OooO00o;
        float OooO0Oo = c0081o000O0oO.OooO0Oo(backEvent);
        float OooO0o0 = c0081o000O0oO.OooO0o0(backEvent);
        float OooO0O0 = c0081o000O0oO.OooO0O0(backEvent);
        int OooO0OO = c0081o000O0oO.OooO0OO(backEvent);
        this.OooO00o = OooO0Oo;
        this.OooO0O0 = OooO0o0;
        this.OooO0OO = OooO0O0;
        this.OooO0Oo = OooO0OO;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.OooO00o + ", touchY=" + this.OooO0O0 + ", progress=" + this.OooO0OO + ", swipeEdge=" + this.OooO0Oo + '}';
    }
}
