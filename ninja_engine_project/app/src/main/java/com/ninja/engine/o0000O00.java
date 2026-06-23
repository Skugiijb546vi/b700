package com.ninja.engine;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o0000O00 implements Parcelable {
    public static final Parcelable.Creator<o0000O00> CREATOR = new o0O0O00(1);
    public final int OooO00o;
    public final Intent OooO0O0;

    public o0000O00(int i, Intent intent) {
        this.OooO00o = i;
        this.OooO0O0 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.OooO00o;
        if (i != -1) {
            if (i != 0) {
                str = String.valueOf(i);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.OooO0O0);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.OooO00o);
        Intent intent = this.OooO0O0;
        if (intent == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public o0000O00(Parcel parcel) {
        this.OooO00o = parcel.readInt();
        this.OooO0O0 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
