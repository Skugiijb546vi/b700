package com.app.framework.entity.pm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.framework.BlackBoxCore;
import java.util.Objects;
/* loaded from: classes.dex */
public class InstalledPackage implements Parcelable {
    public static final Parcelable.Creator<InstalledPackage> CREATOR = new Parcelable.Creator<InstalledPackage>() { // from class: com.app.framework.entity.pm.InstalledPackage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstalledPackage createFromParcel(Parcel parcel) {
            return new InstalledPackage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InstalledPackage[] newArray(int i) {
            return new InstalledPackage[i];
        }
    };
    public String packageName;
    public int userId;

    public InstalledPackage() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.packageName, ((InstalledPackage) obj).packageName);
    }

    public ApplicationInfo getApplication() {
        return BlackBoxCore.getBPackageManager().getApplicationInfo(this.packageName, 128, this.userId);
    }

    public PackageInfo getPackageInfo() {
        return BlackBoxCore.getBPackageManager().getPackageInfo(this.packageName, 128, this.userId);
    }

    public int hashCode() {
        return Objects.hash(this.packageName);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.userId);
        parcel.writeString(this.packageName);
    }

    public InstalledPackage(Parcel parcel) {
        this.userId = parcel.readInt();
        this.packageName = parcel.readString();
    }

    public InstalledPackage(String str) {
        this.packageName = str;
    }
}


