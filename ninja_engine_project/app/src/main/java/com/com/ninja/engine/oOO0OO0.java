package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* loaded from: classes.dex */
public final class oOO0OO0 extends View.BaseSavedState {
    public static final Parcelable.Creator<oOO0OO0> CREATOR = new o0O0O00(15);
    public int OooO00o;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.OooO00o + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.OooO00o);
    }
}
