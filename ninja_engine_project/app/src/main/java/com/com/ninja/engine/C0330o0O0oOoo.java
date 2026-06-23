package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* renamed from: com.ninja.engine.o0O0oOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330o0O0oOoo extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C0330o0O0oOoo> CREATOR = new C0016OooOOOo(3);
    public SparseArray OooO0OO;

    public C0330o0O0oOoo(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.OooO0OO = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.OooO0OO.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.OooO0OO;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.OooO0OO.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.OooO0OO.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
