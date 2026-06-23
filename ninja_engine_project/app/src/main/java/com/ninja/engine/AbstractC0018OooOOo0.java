package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.OooOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018OooOOo0 implements Parcelable {
    public final Parcelable OooO00o;
    public static final OooOOOO OooO0O0 = new AbstractC0018OooOOo0();
    public static final Parcelable.Creator<AbstractC0018OooOOo0> CREATOR = new C0016OooOOOo(0);

    public AbstractC0018OooOOo0() {
        this.OooO00o = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO00o, i);
    }

    public AbstractC0018OooOOo0(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.OooO00o = readParcelable == null ? OooO0O0 : readParcelable;
    }

    public AbstractC0018OooOOo0(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.OooO00o = parcelable == OooO0O0 ? null : parcelable;
    }
}
