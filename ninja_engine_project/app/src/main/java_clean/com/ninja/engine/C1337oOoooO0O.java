package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.oOoooO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337oOoooO0O extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C1337oOoooO0O> CREATOR = new C0016OooOOOo(10);
    public int OooO0OO;
    public boolean OooO0Oo;

    public C1337oOoooO0O(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        this.OooO0OO = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.OooO0Oo = z;
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0OO);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
    }
}


