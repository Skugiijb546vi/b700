package com.ninja.engine;

import android.window.BackEvent;
/* renamed from: com.ninja.engine.o000O0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081o000O0oO {
    public static final C0081o000O0oO OooO00o = new C0081o000O0oO();

    public final BackEvent OooO00o(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float OooO0O0(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int OooO0OO(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float OooO0Oo(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float OooO0o0(BackEvent backEvent) {
        AbstractC0809oO0OooOO.OooOOOo(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}


