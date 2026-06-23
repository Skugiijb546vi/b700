package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o00OoOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175o00OoOoo implements Parcelable {
    public static final Parcelable.Creator<C0175o00OoOoo> CREATOR = new o0O0O00(3);
    public final CharSequence OooO;
    public final int[] OooO00o;
    public final ArrayList OooO0O0;
    public final int[] OooO0OO;
    public final int[] OooO0Oo;
    public final String OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;
    public final int OooOO0;
    public final CharSequence OooOO0O;
    public final ArrayList OooOO0o;
    public final boolean OooOOO;
    public final ArrayList OooOOO0;

    public C0175o00OoOoo(Parcel parcel) {
        this.OooO00o = parcel.createIntArray();
        this.OooO0O0 = parcel.createStringArrayList();
        this.OooO0OO = parcel.createIntArray();
        this.OooO0Oo = parcel.createIntArray();
        this.OooO0o0 = parcel.readInt();
        this.OooO0o = parcel.readString();
        this.OooO0oO = parcel.readInt();
        this.OooO0oo = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.OooO = (CharSequence) creator.createFromParcel(parcel);
        this.OooOO0 = parcel.readInt();
        this.OooOO0O = (CharSequence) creator.createFromParcel(parcel);
        this.OooOO0o = parcel.createStringArrayList();
        this.OooOOO0 = parcel.createStringArrayList();
        this.OooOOO = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.OooO00o);
        parcel.writeStringList(this.OooO0O0);
        parcel.writeIntArray(this.OooO0OO);
        parcel.writeIntArray(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0);
        parcel.writeString(this.OooO0o);
        parcel.writeInt(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        TextUtils.writeToParcel(this.OooO, parcel, 0);
        parcel.writeInt(this.OooOO0);
        TextUtils.writeToParcel(this.OooOO0O, parcel, 0);
        parcel.writeStringList(this.OooOO0o);
        parcel.writeStringList(this.OooOOO0);
        parcel.writeInt(this.OooOOO ? 1 : 0);
    }

    public C0175o00OoOoo(C0172o00OoOo c0172o00OoOo) {
        int size = c0172o00OoOo.OooO00o.size();
        this.OooO00o = new int[size * 6];
        if (!c0172o00OoOo.OooO0oO) {
            throw new IllegalStateException("Not on back stack");
        }
        this.OooO0O0 = new ArrayList(size);
        this.OooO0OO = new int[size];
        this.OooO0Oo = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0614o0oo00o c0614o0oo00o = (C0614o0oo00o) c0172o00OoOo.OooO00o.get(i2);
            int i3 = i + 1;
            this.OooO00o[i] = c0614o0oo00o.OooO00o;
            ArrayList arrayList = this.OooO0O0;
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = c0614o0oo00o.OooO0O0;
            arrayList.add(abstractComponentCallbacksC0593o0oOoOo0 != null ? abstractComponentCallbacksC0593o0oOoOo0.OooO0o0 : null);
            int[] iArr = this.OooO00o;
            iArr[i3] = c0614o0oo00o.OooO0OO ? 1 : 0;
            iArr[i + 2] = c0614o0oo00o.OooO0Oo;
            iArr[i + 3] = c0614o0oo00o.OooO0o0;
            int i4 = i + 5;
            iArr[i + 4] = c0614o0oo00o.OooO0o;
            i += 6;
            iArr[i4] = c0614o0oo00o.OooO0oO;
            this.OooO0OO[i2] = c0614o0oo00o.OooO0oo.ordinal();
            this.OooO0Oo[i2] = c0614o0oo00o.OooO.ordinal();
        }
        this.OooO0o0 = c0172o00OoOo.OooO0o;
        this.OooO0o = c0172o00OoOo.OooO0oo;
        this.OooO0oO = c0172o00OoOo.OooOOo;
        this.OooO0oo = c0172o00OoOo.OooO;
        this.OooO = c0172o00OoOo.OooOO0;
        this.OooOO0 = c0172o00OoOo.OooOO0O;
        this.OooOO0O = c0172o00OoOo.OooOO0o;
        this.OooOO0o = c0172o00OoOo.OooOOO0;
        this.OooOOO0 = c0172o00OoOo.OooOOO;
        this.OooOOO = c0172o00OoOo.OooOOOO;
    }
}


