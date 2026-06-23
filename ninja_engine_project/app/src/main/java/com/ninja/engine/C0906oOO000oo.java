package com.ninja.engine;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
/* renamed from: com.ninja.engine.oOO000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906oOO000oo implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0906oOO000oo> CREATOR = new o0O0O00(13);
    public final Calendar OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final long OooO0o;
    public final int OooO0o0;
    public String OooO0oO;

    public C0906oOO000oo(Calendar calendar) {
        calendar.set(5, 1);
        Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(calendar);
        this.OooO00o = OooO0O0;
        this.OooO0O0 = OooO0O0.get(2);
        this.OooO0OO = OooO0O0.get(1);
        this.OooO0Oo = OooO0O0.getMaximum(7);
        this.OooO0o0 = OooO0O0.getActualMaximum(5);
        this.OooO0o = OooO0O0.getTimeInMillis();
    }

    public static C0906oOO000oo OooO00o(int i, int i2) {
        Calendar OooO0Oo = AbstractC1399oo00OO0o.OooO0Oo(null);
        OooO0Oo.set(1, i);
        OooO0Oo.set(2, i2);
        return new C0906oOO000oo(OooO0Oo);
    }

    public static C0906oOO000oo OooO0O0(long j) {
        Calendar OooO0Oo = AbstractC1399oo00OO0o.OooO0Oo(null);
        OooO0Oo.setTimeInMillis(j);
        return new C0906oOO000oo(OooO0Oo);
    }

    public final String OooO0OO() {
        String formatDateTime;
        if (this.OooO0oO == null) {
            long timeInMillis = this.OooO00o.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = AbstractC1399oo00OO0o.OooO00o("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.OooO0oO = formatDateTime;
        }
        return this.OooO0oO;
    }

    public final int OooO0Oo(C0906oOO000oo c0906oOO000oo) {
        if (this.OooO00o instanceof GregorianCalendar) {
            return (c0906oOO000oo.OooO0O0 - this.OooO0O0) + ((c0906oOO000oo.OooO0OO - this.OooO0OO) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO00o.compareTo(((C0906oOO000oo) obj).OooO00o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0906oOO000oo)) {
            return false;
        }
        C0906oOO000oo c0906oOO000oo = (C0906oOO000oo) obj;
        if (this.OooO0O0 == c0906oOO000oo.OooO0O0 && this.OooO0OO == c0906oOO000oo.OooO0OO) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OooO0O0), Integer.valueOf(this.OooO0OO)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.OooO0OO);
        parcel.writeInt(this.OooO0O0);
    }
}
