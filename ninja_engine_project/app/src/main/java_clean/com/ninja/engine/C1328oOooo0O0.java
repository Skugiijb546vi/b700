package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* renamed from: com.ninja.engine.oOooo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328oOooo0O0 implements Parcelable {
    public static final Parcelable.Creator<C1328oOooo0O0> CREATOR = new o0O0O00(18);
    public boolean OooO;
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int[] OooO0Oo;
    public int[] OooO0o;
    public int OooO0o0;
    public List OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO00o);
        parcel.writeInt(this.OooO0O0);
        parcel.writeInt(this.OooO0OO);
        if (this.OooO0OO > 0) {
            parcel.writeIntArray(this.OooO0Oo);
        }
        parcel.writeInt(this.OooO0o0);
        if (this.OooO0o0 > 0) {
            parcel.writeIntArray(this.OooO0o);
        }
        parcel.writeInt(this.OooO0oo ? 1 : 0);
        parcel.writeInt(this.OooO ? 1 : 0);
        parcel.writeInt(this.OooOO0 ? 1 : 0);
        parcel.writeList(this.OooO0oO);
    }
}


