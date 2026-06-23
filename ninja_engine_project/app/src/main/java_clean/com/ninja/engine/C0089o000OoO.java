package com.ninja.engine;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
/* renamed from: com.ninja.engine.o000OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089o000OoO extends AbstractC0694o0ooooo0 {
    @Override public void Oooo0oo(boolean z) {}
    public final boolean OooOo0;
    public final ObjectAnimator OooOo00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, java.lang.Object, com.ninja.engine.o000O0o] */
    public C0089o000OoO(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int i2;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i3 = z ? numberOfFrames - 1 : 0;
        if (z) {
            i = 0;
        } else {
            i = numberOfFrames - 1;
        }
        o000O0o obj = new o000O0o();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.OooO0O0 = numberOfFrames2;
        int[] iArr = obj.OooO00o;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.OooO00o = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.OooO00o;
        int i4 = 0;
        for (int i5 = 0; i5 < numberOfFrames2; i5++) {
            if (z) {
                i2 = (numberOfFrames2 - i5) - 1;
            } else {
                i2 = i5;
            }
            int duration = animationDrawable.getDuration(i2);
            iArr2[i5] = duration;
            i4 += duration;
        }
        obj.OooO0OO = i4;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i3, i);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.OooO0OO);
        ofInt.setInterpolator(obj);
        this.OooOo0 = z2;
        this.OooOo00 = ofInt;
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final boolean OooO0oO() {
        return this.OooOo0;
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void Oooo0oO() {
        this.OooOo00.reverse();
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void OoooO0() {
        this.OooOo00.start();
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void OoooO0O() {
        this.OooOo00.cancel();
    }
}




