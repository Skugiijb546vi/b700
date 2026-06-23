package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.oO0oOO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853oO0oOO00 extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C0853oO0oOO00> CREATOR = new C0016OooOOOo(4);
    public boolean OooO0OO;

    public C0853oO0oOO00(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0853oO0oOO00.class.getClassLoader();
        }
        this.OooO0OO = parcel.readInt() == 1;
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0OO ? 1 : 0);
    }
}
