package com.ninja.engine;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.o0oo00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610o0oo00O implements Parcelable {
    public static final Parcelable.Creator<C0610o0oo00O> CREATOR = new o0O0O00(10);
    public final boolean OooO;
    public final String OooO00o;
    public final String OooO0O0;
    public final boolean OooO0OO;
    public final int OooO0Oo;
    public final String OooO0o;
    public final int OooO0o0;
    public final boolean OooO0oO;
    public final boolean OooO0oo;
    public final Bundle OooOO0;
    public final boolean OooOO0O;
    public final int OooOO0o;
    public Bundle OooOOO0;

    public C0610o0oo00O(Parcel parcel) {
        this.OooO00o = parcel.readString();
        this.OooO0O0 = parcel.readString();
        this.OooO0OO = parcel.readInt() != 0;
        this.OooO0Oo = parcel.readInt();
        this.OooO0o0 = parcel.readInt();
        this.OooO0o = parcel.readString();
        this.OooO0oO = parcel.readInt() != 0;
        this.OooO0oo = parcel.readInt() != 0;
        this.OooO = parcel.readInt() != 0;
        this.OooOO0 = parcel.readBundle();
        this.OooOO0O = parcel.readInt() != 0;
        this.OooOOO0 = parcel.readBundle();
        this.OooOO0o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.OooO00o);
        sb.append(" (");
        sb.append(this.OooO0O0);
        sb.append(")}:");
        if (this.OooO0OO) {
            sb.append(" fromLayout");
        }
        int i = this.OooO0o0;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.OooO0o;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.OooO0oO) {
            sb.append(" retainInstance");
        }
        if (this.OooO0oo) {
            sb.append(" removing");
        }
        if (this.OooO) {
            sb.append(" detached");
        }
        if (this.OooOO0O) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO00o);
        parcel.writeString(this.OooO0O0);
        parcel.writeInt(this.OooO0OO ? 1 : 0);
        parcel.writeInt(this.OooO0Oo);
        parcel.writeInt(this.OooO0o0);
        parcel.writeString(this.OooO0o);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
        parcel.writeInt(this.OooO0oo ? 1 : 0);
        parcel.writeInt(this.OooO ? 1 : 0);
        parcel.writeBundle(this.OooOO0);
        parcel.writeInt(this.OooOO0O ? 1 : 0);
        parcel.writeBundle(this.OooOOO0);
        parcel.writeInt(this.OooOO0o);
    }

    public C0610o0oo00O(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        this.OooO00o = abstractComponentCallbacksC0593o0oOoOo0.getClass().getName();
        this.OooO0O0 = abstractComponentCallbacksC0593o0oOoOo0.OooO0o0;
        this.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0.OooOOO0;
        this.OooO0Oo = abstractComponentCallbacksC0593o0oOoOo0.OooOo0O;
        this.OooO0o0 = abstractComponentCallbacksC0593o0oOoOo0.OooOo0o;
        this.OooO0o = abstractComponentCallbacksC0593o0oOoOo0.OooOo;
        this.OooO0oO = abstractComponentCallbacksC0593o0oOoOo0.OooOoOO;
        this.OooO0oo = abstractComponentCallbacksC0593o0oOoOo0.OooOO0o;
        this.OooO = abstractComponentCallbacksC0593o0oOoOo0.OooOoO;
        this.OooOO0 = abstractComponentCallbacksC0593o0oOoOo0.OooO0o;
        this.OooOO0O = abstractComponentCallbacksC0593o0oOoOo0.OooOoO0;
        this.OooOO0o = abstractComponentCallbacksC0593o0oOoOo0.Oooo0o.ordinal();
    }
}


