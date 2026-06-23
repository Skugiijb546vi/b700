package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oOoooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607o0oOoooo implements Parcelable {
    public static final Parcelable.Creator<C0607o0oOoooo> CREATOR = new o0O0O00(9);
    public ArrayList OooO00o;
    public ArrayList OooO0O0;
    public C0175o00OoOoo[] OooO0OO;
    public int OooO0Oo;
    public ArrayList OooO0o;
    public String OooO0o0;
    public ArrayList OooO0oO;
    public ArrayList OooO0oo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.OooO00o);
        parcel.writeStringList(this.OooO0O0);
        parcel.writeTypedArray(this.OooO0OO, i);
        parcel.writeInt(this.OooO0Oo);
        parcel.writeString(this.OooO0o0);
        parcel.writeStringList(this.OooO0o);
        parcel.writeTypedList(this.OooO0oO);
        parcel.writeTypedList(this.OooO0oo);
    }
}


