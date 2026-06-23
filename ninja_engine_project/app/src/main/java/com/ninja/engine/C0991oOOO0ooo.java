package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* renamed from: com.ninja.engine.oOOO0ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991oOOO0ooo extends SparseArray implements Parcelable {
    public static final Parcelable.Creator<C0991oOOO0ooo> CREATOR = new C0016OooOOOo(6);

    public C0991oOOO0ooo(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
