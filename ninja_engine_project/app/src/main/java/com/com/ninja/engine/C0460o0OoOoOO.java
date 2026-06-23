package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.o0OoOoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460o0OoOoOO extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C0460o0OoOoOO> CREATOR = new C0016OooOOOo(2);
    public boolean OooO0OO;

    public C0460o0OoOoOO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0OO = parcel.readInt() == 1;
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0OO ? 1 : 0);
    }
}
