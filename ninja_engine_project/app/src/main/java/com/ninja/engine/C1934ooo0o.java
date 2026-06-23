package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.ooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1934ooo0o implements Parcelable {
    public static final Parcelable.Creator<C1934ooo0o> CREATOR = new o0O0O00(11);
    public int OooO00o;
    public int OooO0O0;
    public boolean OooO0OO;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO00o);
        parcel.writeInt(this.OooO0O0);
        parcel.writeInt(this.OooO0OO ? 1 : 0);
    }
}
