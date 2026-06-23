package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* renamed from: com.ninja.engine.oOoOOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219oOoOOoo0 extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C1219oOoOOoo0> CREATOR = new C0016OooOOOo(8);
    public final int OooO0OO;

    public C1219oOoOOoo0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0OO = parcel.readInt();
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0OO);
    }

    public C1219oOoOOoo0(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.OooO0OO = sideSheetBehavior.OooO0oo;
    }
}


