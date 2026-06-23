package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* renamed from: com.ninja.engine.o0OO0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350o0OO0oOo implements Parcelable {
    public static final Parcelable.Creator<C0350o0OO0oOo> CREATOR = new o0O0O00(7);
    public final long OooO00o;

    public C0350o0OO0oOo(long j) {
        this.OooO00o = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0350o0OO0oOo) && this.OooO00o == ((C0350o0OO0oOo) obj).OooO00o) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.OooO00o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.OooO00o);
    }
}


