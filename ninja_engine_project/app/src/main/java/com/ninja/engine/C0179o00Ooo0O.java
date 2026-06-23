package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
/* renamed from: com.ninja.engine.o00Ooo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179o00Ooo0O implements Parcelable {
    public static final Parcelable.Creator<C0179o00Ooo0O> CREATOR = new o0O0O00(5);
    public int OooO;
    public int OooO00o;
    public Integer OooO0O0;
    public Integer OooO0OO;
    public Integer OooO0Oo;
    public Integer OooO0o;
    public Integer OooO0o0;
    public Integer OooO0oO;
    public Integer OooO0oo;
    public String OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public Locale OooOOO;
    public int OooOOO0;
    public CharSequence OooOOOO;
    public CharSequence OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public Integer OooOOoo;
    public Integer OooOo;
    public Integer OooOo0;
    public Boolean OooOo00;
    public Integer OooOo0O;
    public Integer OooOo0o;
    public Integer OooOoO;
    public Integer OooOoO0;
    public Integer OooOoOO;
    public Integer OooOoo;
    public Integer OooOoo0;
    public Boolean OooOooO;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeInt(this.OooO00o);
        parcel.writeSerializable(this.OooO0O0);
        parcel.writeSerializable(this.OooO0OO);
        parcel.writeSerializable(this.OooO0Oo);
        parcel.writeSerializable(this.OooO0o0);
        parcel.writeSerializable(this.OooO0o);
        parcel.writeSerializable(this.OooO0oO);
        parcel.writeSerializable(this.OooO0oo);
        parcel.writeInt(this.OooO);
        parcel.writeString(this.OooOO0);
        parcel.writeInt(this.OooOO0O);
        parcel.writeInt(this.OooOO0o);
        parcel.writeInt(this.OooOOO0);
        CharSequence charSequence = this.OooOOOO;
        String str2 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        CharSequence charSequence2 = this.OooOOOo;
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        parcel.writeString(str2);
        parcel.writeInt(this.OooOOo0);
        parcel.writeSerializable(this.OooOOoo);
        parcel.writeSerializable(this.OooOo0);
        parcel.writeSerializable(this.OooOo0O);
        parcel.writeSerializable(this.OooOo0o);
        parcel.writeSerializable(this.OooOo);
        parcel.writeSerializable(this.OooOoO0);
        parcel.writeSerializable(this.OooOoO);
        parcel.writeSerializable(this.OooOoo);
        parcel.writeSerializable(this.OooOoOO);
        parcel.writeSerializable(this.OooOoo0);
        parcel.writeSerializable(this.OooOo00);
        parcel.writeSerializable(this.OooOOO);
        parcel.writeSerializable(this.OooOooO);
    }
}
