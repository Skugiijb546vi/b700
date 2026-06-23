package com.ninja.engine;
/* loaded from: classes.dex */
public abstract class o00OO extends AbstractC0692o0ooooOo {
    public static void o00O0O(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        AbstractC0809oO0OooOO.OooOOOo(iArr, "<this>");
        AbstractC0809oO0OooOO.OooOOOo(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void o00Oo0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        AbstractC0809oO0OooOO.OooOOOo(objArr, "<this>");
        AbstractC0809oO0OooOO.OooOOOo(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void o00Ooo(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        o00Oo0(objArr, objArr2, i, i2, i3);
    }
}
