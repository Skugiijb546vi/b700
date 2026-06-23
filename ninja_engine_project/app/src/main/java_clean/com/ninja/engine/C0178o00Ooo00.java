package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o00Ooo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178o00Ooo00 implements Parcelable {
    public static final Parcelable.Creator<C0178o00Ooo00> CREATOR = new o0O0O00(4);
    public final ArrayList OooO00o;
    public final ArrayList OooO0O0;

    public C0178o00Ooo00(Parcel parcel) {
        this.OooO00o = parcel.createStringArrayList();
        this.OooO0O0 = parcel.createTypedArrayList(C0175o00OoOoo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.OooO00o);
        parcel.writeTypedList(this.OooO0O0);
    }
}


