package com.ninja.engine;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class oOO0O0O0 extends AbstractC0018OooOOo0 {
    public static final Parcelable.Creator<oOO0O0O0> CREATOR = new C0016OooOOOo(5);
    public Bundle OooO0OO;

    public oOO0O0O0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0OO = parcel.readBundle(classLoader == null ? oOO0O0O0.class.getClassLoader() : classLoader);
    }

    @Override // com.ninja.engine.AbstractC0018OooOOo0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.OooO0OO);
    }
}
