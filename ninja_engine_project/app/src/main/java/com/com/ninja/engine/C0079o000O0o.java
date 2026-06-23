package com.ninja.engine;

import android.animation.TimeInterpolator;
/* renamed from: com.ninja.engine.o000O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079o000O0o implements TimeInterpolator {
    public int[] OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((f * this.OooO0OO) + 0.5f);
        int i2 = this.OooO0O0;
        int[] iArr = this.OooO00o;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        if (i3 < i2) {
            f2 = i / this.OooO0OO;
        } else {
            f2 = 0.0f;
        }
        return (i3 / i2) + f2;
    }
}
