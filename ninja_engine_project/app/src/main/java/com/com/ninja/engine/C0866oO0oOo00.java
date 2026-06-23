package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* renamed from: com.ninja.engine.oO0oOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866oO0oOo00 extends View.BaseSavedState {
    public static final Parcelable.Creator<C0866oO0oOo00> CREATOR = new o0O0O00(12);
    public int OooO00o;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.OooO00o;
        if (i != 1) {
            if (i != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return AbstractC1230oOoOo0o.OooO(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.OooO00o));
    }
}
