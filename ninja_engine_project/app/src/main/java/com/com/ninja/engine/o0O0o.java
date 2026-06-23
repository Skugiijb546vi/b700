package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o0O0o implements Parcelable {
    public static final Parcelable.Creator<o0O0o> CREATOR = new o0O0O00(6);
    public final C0906oOO000oo OooO00o;
    public final C0906oOO000oo OooO0O0;
    public final C0350o0OO0oOo OooO0OO;
    public final C0906oOO000oo OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;

    public o0O0o(C0906oOO000oo c0906oOO000oo, C0906oOO000oo c0906oOO000oo2, C0350o0OO0oOo c0350o0OO0oOo, C0906oOO000oo c0906oOO000oo3, int i) {
        Objects.requireNonNull(c0906oOO000oo, "start cannot be null");
        Objects.requireNonNull(c0906oOO000oo2, "end cannot be null");
        Objects.requireNonNull(c0350o0OO0oOo, "validator cannot be null");
        this.OooO00o = c0906oOO000oo;
        this.OooO0O0 = c0906oOO000oo2;
        this.OooO0Oo = c0906oOO000oo3;
        this.OooO0o0 = i;
        this.OooO0OO = c0350o0OO0oOo;
        if (c0906oOO000oo3 != null && c0906oOO000oo.OooO00o.compareTo(c0906oOO000oo3.OooO00o) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0906oOO000oo3 != null && c0906oOO000oo3.OooO00o.compareTo(c0906oOO000oo2.OooO00o) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= AbstractC1399oo00OO0o.OooO0Oo(null).getMaximum(7)) {
            this.OooO0oO = c0906oOO000oo.OooO0Oo(c0906oOO000oo2) + 1;
            this.OooO0o = (c0906oOO000oo2.OooO0OO - c0906oOO000oo.OooO0OO) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0o)) {
            return false;
        }
        o0O0o o0o0o = (o0O0o) obj;
        if (this.OooO00o.equals(o0o0o.OooO00o) && this.OooO0O0.equals(o0o0o.OooO0O0) && Objects.equals(this.OooO0Oo, o0o0o.OooO0Oo) && this.OooO0o0 == o0o0o.OooO0o0 && this.OooO0OO.equals(o0o0o.OooO0OO)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, this.OooO0O0, this.OooO0Oo, Integer.valueOf(this.OooO0o0), this.OooO0OO});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.OooO00o, 0);
        parcel.writeParcelable(this.OooO0O0, 0);
        parcel.writeParcelable(this.OooO0Oo, 0);
        parcel.writeParcelable(this.OooO0OO, 0);
        parcel.writeInt(this.OooO0o0);
    }
}
