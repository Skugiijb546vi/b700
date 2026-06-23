package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ninja.engine.C1436oo00oo0;
import com.ninja.engine.InterfaceC1438oo00oo0O;
import com.ninja.engine.o0O0O00;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new o0O0O00(16);
    public final InterfaceC1438oo00oo0O OooO00o;

    public ParcelImpl(Parcel parcel) {
        this.OooO00o = new C1436oo00oo0(parcel).OooO0oO();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C1436oo00oo0(parcel).OooO(this.OooO00o);
    }
}
