package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: com.ninja.engine.ooOOO0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779ooOOO0O0 implements Parcelable {
    public static final Parcelable.Creator<C1779ooOOO0O0> CREATOR = new o0O0O00(17);
    public int OooO00o;
    public int OooO0O0;
    public int[] OooO0OO;
    public boolean OooO0Oo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.OooO00o + ", mGapDir=" + this.OooO0O0 + ", mHasUnwantedGapAfter=" + this.OooO0Oo + ", mGapPerSpan=" + Arrays.toString(this.OooO0OO) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO00o);
        parcel.writeInt(this.OooO0O0);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
        int[] iArr = this.OooO0OO;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.OooO0OO);
            return;
        }
        parcel.writeInt(0);
    }
}


