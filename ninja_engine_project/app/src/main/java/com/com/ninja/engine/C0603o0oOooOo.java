package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.o0oOooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603o0oOooOo implements Parcelable {
    public static final Parcelable.Creator<C0603o0oOooOo> CREATOR = new o0O0O00(8);
    public String OooO00o;
    public int OooO0O0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO00o);
        parcel.writeInt(this.OooO0O0);
    }
}
