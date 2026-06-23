package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* renamed from: com.ninja.engine.o00oO00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226o00oO00o extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C0226o00oO00o> CREATOR = new C0016OooOOOo(1);
    public final int OooO0OO;
    public final int OooO0Oo;
    public final boolean OooO0o;
    public final boolean OooO0o0;
    public final boolean OooO0oO;

    public C0226o00oO00o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0OO = parcel.readInt();
        this.OooO0Oo = parcel.readInt();
        this.OooO0o0 = parcel.readInt() == 1;
        this.OooO0o = parcel.readInt() == 1;
        this.OooO0oO = parcel.readInt() == 1;
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO0OO);
        parcel.writeInt(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0 ? 1 : 0);
        parcel.writeInt(this.OooO0o ? 1 : 0);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
    }

    public C0226o00oO00o(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.OooO0OO = bottomSheetBehavior.Oooo0o0;
        this.OooO0Oo = bottomSheetBehavior.OooO0o0;
        this.OooO0o0 = bottomSheetBehavior.OooO0O0;
        this.OooO0o = bottomSheetBehavior.Oooo0;
        this.OooO0oO = bottomSheetBehavior.Oooo0O0;
    }
}
