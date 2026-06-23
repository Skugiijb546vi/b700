package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class oOO0O000 implements Parcelable {
    public static final Parcelable.Creator<oOO0O000> CREATOR = new o0O0O00(14);
    public int OooO00o;
    public C0991oOOO0ooo OooO0O0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO00o);
        parcel.writeParcelable(this.OooO0O0, 0);
    }
}


