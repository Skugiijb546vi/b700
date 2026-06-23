package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.app.framework.core.system.JarConfig;
/* renamed from: com.ninja.engine.o0O0o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313o0O0o0O {
    public static final SparseIntArray OooOO0;
    public int OooO;
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public int OooO0oO;
    public String OooO0oo;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        OooOO0 = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0o);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (OooOO0.get(index)) {
                case 1:
                    this.OooO0o0 = obtainStyledAttributes.getFloat(index, this.OooO0o0);
                    break;
                case 2:
                    this.OooO0OO = obtainStyledAttributes.getInt(index, this.OooO0OO);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC0694o0ooooo0.OooO0Oo[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.OooO00o = C0317o0O0o0o0.OooO0o(obtainStyledAttributes, index, this.OooO00o);
                    break;
                case 6:
                    this.OooO0O0 = obtainStyledAttributes.getInteger(index, this.OooO0O0);
                    break;
                case 7:
                    this.OooO0Oo = obtainStyledAttributes.getFloat(index, this.OooO0Oo);
                    break;
                case 8:
                    this.OooO0oO = obtainStyledAttributes.getInteger(index, this.OooO0oO);
                    break;
                case 9:
                    this.OooO0o = obtainStyledAttributes.getFloat(index, this.OooO0o);
                    break;
                case JarConfig.MAX_CACHE_SIZE /* 10 */:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.OooO0oo = string;
                            if (string.indexOf("/") <= 0) {
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index, this.OooO);
                            break;
                        }
                    }
                    this.OooO = obtainStyledAttributes.getResourceId(index, -1);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}


