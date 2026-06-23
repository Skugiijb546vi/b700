package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.app.framework.core.system.JarConfig;
/* renamed from: com.ninja.engine.o0O0o0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315o0O0o0Oo {
    public static final SparseIntArray OooOOO;
    public float OooO;
    public float OooO00o;
    public float OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public int OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public boolean OooOO0o;
    public float OooOOO0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOOO = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (OooOOO.get(index)) {
                case 1:
                    this.OooO00o = obtainStyledAttributes.getFloat(index, this.OooO00o);
                    break;
                case 2:
                    this.OooO0O0 = obtainStyledAttributes.getFloat(index, this.OooO0O0);
                    break;
                case 3:
                    this.OooO0OO = obtainStyledAttributes.getFloat(index, this.OooO0OO);
                    break;
                case 4:
                    this.OooO0Oo = obtainStyledAttributes.getFloat(index, this.OooO0Oo);
                    break;
                case 5:
                    this.OooO0o0 = obtainStyledAttributes.getFloat(index, this.OooO0o0);
                    break;
                case 6:
                    this.OooO0o = obtainStyledAttributes.getDimension(index, this.OooO0o);
                    break;
                case 7:
                    this.OooO0oO = obtainStyledAttributes.getDimension(index, this.OooO0oO);
                    break;
                case 8:
                    this.OooO = obtainStyledAttributes.getDimension(index, this.OooO);
                    break;
                case 9:
                    this.OooOO0 = obtainStyledAttributes.getDimension(index, this.OooOO0);
                    break;
                case JarConfig.MAX_CACHE_SIZE /* 10 */:
                    this.OooOO0O = obtainStyledAttributes.getDimension(index, this.OooOO0O);
                    break;
                case 11:
                    this.OooOO0o = true;
                    this.OooOOO0 = obtainStyledAttributes.getDimension(index, this.OooOOO0);
                    break;
                case 12:
                    this.OooO0oo = C0317o0O0o0o0.OooO0o(obtainStyledAttributes, index, this.OooO0oo);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
