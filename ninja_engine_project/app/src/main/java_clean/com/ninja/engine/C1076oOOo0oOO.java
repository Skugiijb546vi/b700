package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.oOOo0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076oOOo0oOO extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<C1076oOOo0oOO> CREATOR = new C0016OooOOOo(7);
    public Parcelable OooO0OO;

    public C1076oOOo0oOO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0OO = parcel.readParcelable(classLoader == null ? AbstractC1066oOOo0Oo.class.getClassLoader() : classLoader);
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.OooO0OO, 0);
    }
}


