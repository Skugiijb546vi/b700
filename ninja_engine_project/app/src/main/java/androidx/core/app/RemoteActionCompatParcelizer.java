package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.ninja.engine.AbstractC1437oo00oo00;
import com.ninja.engine.C1436oo00oo0;
import com.ninja.engine.InterfaceC1438oo00oo0O;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1437oo00oo00 abstractC1437oo00oo00) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1438oo00oo0O interfaceC1438oo00oo0O = remoteActionCompat.OooO00o;
        boolean z = true;
        if (abstractC1437oo00oo00.OooO0o0(1)) {
            interfaceC1438oo00oo0O = abstractC1437oo00oo00.OooO0oO();
        }
        remoteActionCompat.OooO00o = (IconCompat) interfaceC1438oo00oo0O;
        CharSequence charSequence = remoteActionCompat.OooO0O0;
        if (abstractC1437oo00oo00.OooO0o0(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0);
        }
        remoteActionCompat.OooO0O0 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.OooO0OO;
        if (abstractC1437oo00oo00.OooO0o0(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0);
        }
        remoteActionCompat.OooO0OO = charSequence2;
        remoteActionCompat.OooO0Oo = (PendingIntent) abstractC1437oo00oo00.OooO0o(remoteActionCompat.OooO0Oo, 4);
        boolean z2 = remoteActionCompat.OooO0o0;
        if (abstractC1437oo00oo00.OooO0o0(5)) {
            if (((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        remoteActionCompat.OooO0o0 = z2;
        boolean z3 = remoteActionCompat.OooO0o;
        if (abstractC1437oo00oo00.OooO0o0(6)) {
            if (((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.OooO0o = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1437oo00oo00 abstractC1437oo00oo00) {
        abstractC1437oo00oo00.getClass();
        IconCompat iconCompat = remoteActionCompat.OooO00o;
        abstractC1437oo00oo00.OooO0oo(1);
        abstractC1437oo00oo00.OooO(iconCompat);
        CharSequence charSequence = remoteActionCompat.OooO0O0;
        abstractC1437oo00oo00.OooO0oo(2);
        Parcel parcel = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.OooO0OO;
        abstractC1437oo00oo00.OooO0oo(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.OooO0Oo;
        abstractC1437oo00oo00.OooO0oo(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.OooO0o0;
        abstractC1437oo00oo00.OooO0oo(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.OooO0o;
        abstractC1437oo00oo00.OooO0oo(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
