package com.app.framework.entity.am;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0975oOOO00oo;
import com.ninja.engine.InterfaceC1007oOOOOoo;
import com.ninja.engine.InterfaceC1035oOOOoo;
import com.ninja.engine.oOO0Oo00;
import java.util.UUID;
/* loaded from: classes.dex */
public class PendingResultData implements Parcelable {
    public static final Parcelable.Creator<PendingResultData> CREATOR = new Parcelable.Creator<PendingResultData>() { // from class: com.app.framework.entity.am.PendingResultData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingResultData createFromParcel(Parcel parcel) {
            return new PendingResultData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingResultData[] newArray(int i) {
            return new PendingResultData[i];
        }
    };
    public boolean mAbortBroadcast;
    public String mBToken;
    public boolean mFinished;
    public int mFlags;
    public boolean mInitialStickyHint;
    public boolean mOrderedHint;
    public int mResultCode;
    public String mResultData;
    public Bundle mResultExtras;
    public int mSendingUser;
    public IBinder mToken;
    public int mType;

    public PendingResultData(BroadcastReceiver.PendingResult pendingResult) {
        Boolean mFinished;
        this.mBToken = UUID.randomUUID().toString();
        if (BuildCompat.isM()) {
            InterfaceC0975oOOO00oo interfaceC0975oOOO00oo = (InterfaceC0975oOOO00oo) C0217o00o0oO0.create(InterfaceC0975oOOO00oo.class, pendingResult, false);
            this.mType = interfaceC0975oOOO00oo.mType().intValue();
            this.mOrderedHint = interfaceC0975oOOO00oo.mOrderedHint().booleanValue();
            this.mInitialStickyHint = interfaceC0975oOOO00oo.mInitialStickyHint().booleanValue();
            this.mToken = interfaceC0975oOOO00oo.mToken();
            this.mSendingUser = interfaceC0975oOOO00oo.mSendingUser().intValue();
            this.mFlags = interfaceC0975oOOO00oo.mFlags().intValue();
            this.mResultData = interfaceC0975oOOO00oo.mResultData();
            this.mResultExtras = interfaceC0975oOOO00oo.mResultExtras();
            this.mAbortBroadcast = interfaceC0975oOOO00oo.mAbortBroadcast().booleanValue();
            mFinished = interfaceC0975oOOO00oo.mFinished();
        } else {
            oOO0Oo00 ooo0oo00 = (oOO0Oo00) C0217o00o0oO0.create(oOO0Oo00.class, pendingResult, false);
            this.mType = ooo0oo00.mType().intValue();
            this.mOrderedHint = ooo0oo00.mOrderedHint().booleanValue();
            this.mInitialStickyHint = ooo0oo00.mInitialStickyHint().booleanValue();
            this.mToken = ooo0oo00.mToken();
            this.mSendingUser = ooo0oo00.mSendingUser().intValue();
            this.mResultData = ooo0oo00.mResultData();
            this.mResultExtras = ooo0oo00.mResultExtras();
            this.mAbortBroadcast = ooo0oo00.mAbortBroadcast().booleanValue();
            mFinished = ooo0oo00.mFinished();
        }
        this.mFinished = mFinished.booleanValue();
    }

    public BroadcastReceiver.PendingResult build() {
        return BuildCompat.isM() ? ((InterfaceC1007oOOOOoo) C0217o00o0oO0.create(InterfaceC1007oOOOOoo.class, null, false))._new(this.mResultCode, this.mResultData, this.mResultExtras, this.mType, this.mOrderedHint, this.mInitialStickyHint, this.mToken, this.mSendingUser, this.mFlags) : ((InterfaceC1035oOOOoo) C0217o00o0oO0.create(InterfaceC1035oOOOoo.class, null, false))._new(this.mResultCode, this.mResultData, this.mResultExtras, this.mType, this.mOrderedHint, this.mInitialStickyHint, this.mToken, this.mSendingUser);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mOrderedHint = parcel.readByte() != 0;
        this.mInitialStickyHint = parcel.readByte() != 0;
        this.mToken = parcel.readStrongBinder();
        this.mSendingUser = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.readString();
        this.mResultExtras = parcel.readBundle();
        this.mAbortBroadcast = parcel.readByte() != 0;
        this.mFinished = parcel.readByte() != 0;
        this.mBToken = parcel.readString();
    }

    public String toString() {
        return "PendingResultData{mType=" + this.mType + ", mOrderedHint=" + this.mOrderedHint + ", mInitialStickyHint=" + this.mInitialStickyHint + ", mToken=" + this.mToken + ", mSendingUser=" + this.mSendingUser + ", mFlags=" + this.mFlags + ", mResultCode=" + this.mResultCode + ", mResultData='" + this.mResultData + "', mResultExtras=" + this.mResultExtras + ", mAbortBroadcast=" + this.mAbortBroadcast + ", mFinished=" + this.mFinished + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mType);
        parcel.writeByte(this.mOrderedHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mInitialStickyHint ? (byte) 1 : (byte) 0);
        parcel.writeStrongBinder(this.mToken);
        parcel.writeInt(this.mSendingUser);
        parcel.writeInt(this.mFlags);
        parcel.writeInt(this.mResultCode);
        parcel.writeString(this.mResultData);
        parcel.writeBundle(this.mResultExtras);
        parcel.writeByte(this.mAbortBroadcast ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mFinished ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mBToken);
    }

    public PendingResultData(Parcel parcel) {
        this.mType = parcel.readInt();
        this.mOrderedHint = parcel.readByte() != 0;
        this.mInitialStickyHint = parcel.readByte() != 0;
        this.mToken = parcel.readStrongBinder();
        this.mSendingUser = parcel.readInt();
        this.mFlags = parcel.readInt();
        this.mResultCode = parcel.readInt();
        this.mResultData = parcel.readString();
        this.mResultExtras = parcel.readBundle();
        this.mAbortBroadcast = parcel.readByte() != 0;
        this.mFinished = parcel.readByte() != 0;
        this.mBToken = parcel.readString();
    }
}
