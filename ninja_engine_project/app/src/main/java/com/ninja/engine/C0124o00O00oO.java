package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* renamed from: com.ninja.engine.o00O00oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124o00O00oO extends View.BaseSavedState {
    public static final Parcelable.Creator<C0124o00O00oO> CREATOR = new o0O0O00(2);
    public boolean OooO00o;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.OooO00o ? (byte) 1 : (byte) 0);
    }
}
