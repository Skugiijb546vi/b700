package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* renamed from: com.ninja.engine.oOooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301oOooOO extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C1301oOooOO> CREATOR = new C0016OooOOOo(9);
    public CharSequence OooO0OO;
    public boolean OooO0Oo;

    public C1301oOooOO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0OO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.OooO0Oo = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.OooO0OO) + "}";
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.OooO0OO, parcel, i);
        parcel.writeInt(this.OooO0Oo ? 1 : 0);
    }
}
