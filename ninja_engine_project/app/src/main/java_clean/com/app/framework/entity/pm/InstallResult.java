package com.app.framework.entity.pm;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class InstallResult implements Parcelable {
    public static final Parcelable.Creator<InstallResult> CREATOR = new Parcelable.Creator<InstallResult>() { // from class: com.app.framework.entity.pm.InstallResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstallResult createFromParcel(Parcel parcel) {
            return new InstallResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstallResult[] newArray(int i) {
            return new InstallResult[i];
        }
    };
    public static final String TAG = "InstallResult";
    public String msg;
    public String packageName;
    public boolean success;

    public InstallResult() {
        this.success = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public InstallResult installError(String str) {
        this.msg = str;
        this.success = false;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.success ? (byte) 1 : (byte) 0);
        parcel.writeString(this.packageName);
        parcel.writeString(this.msg);
    }

    public InstallResult(Parcel parcel) {
        this.success = true;
        this.success = parcel.readByte() != 0;
        this.packageName = parcel.readString();
        this.msg = parcel.readString();
    }

    public InstallResult installError(String str, String str2) {
        this.msg = str2;
        this.success = false;
        this.packageName = str;
        return this;
    }
}


