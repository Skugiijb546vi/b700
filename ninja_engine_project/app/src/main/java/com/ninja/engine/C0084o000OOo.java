package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.o000OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084o000OOo implements Parcelable {
    public static final Parcelable.Creator<C0084o000OOo> CREATOR = new o0O0O00(0);
    public int OooO00o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO00o);
    }
}
