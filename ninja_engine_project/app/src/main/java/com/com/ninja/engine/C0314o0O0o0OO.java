package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* renamed from: com.ninja.engine.o0O0o0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314o0O0o0OO {
    public int OooO00o;
    public int OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0oO);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.OooO0OO = obtainStyledAttributes.getFloat(index, this.OooO0OO);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.OooO00o);
                this.OooO00o = i2;
                this.OooO00o = C0317o0O0o0o0.OooO0Oo[i2];
            } else if (index == 4) {
                this.OooO0O0 = obtainStyledAttributes.getInt(index, this.OooO0O0);
            } else if (index == 3) {
                this.OooO0Oo = obtainStyledAttributes.getFloat(index, this.OooO0Oo);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
