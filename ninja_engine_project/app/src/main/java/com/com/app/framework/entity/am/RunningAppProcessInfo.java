package com.app.framework.entity.am;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class RunningAppProcessInfo implements Parcelable {
    public static final Parcelable.Creator<RunningAppProcessInfo> CREATOR = new Parcelable.Creator<RunningAppProcessInfo>() { // from class: com.app.framework.entity.am.RunningAppProcessInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RunningAppProcessInfo createFromParcel(Parcel parcel) {
            return new RunningAppProcessInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RunningAppProcessInfo[] newArray(int i) {
            return new RunningAppProcessInfo[i];
        }
    };
    public List<ActivityManager.RunningAppProcessInfo> mAppProcessInfoList;

    public RunningAppProcessInfo() {
        this.mAppProcessInfoList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mAppProcessInfoList = parcel.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mAppProcessInfoList);
    }

    public RunningAppProcessInfo(Parcel parcel) {
        this.mAppProcessInfoList = parcel.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
    }
}
