package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.ninja.engine.AbstractC1437oo00oo00;
import com.ninja.engine.C1436oo00oo0;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC1437oo00oo00 abstractC1437oo00oo00) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.OooO00o;
        if (abstractC1437oo00oo00.OooO0o0(1)) {
            i = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readInt();
        }
        iconCompat.OooO00o = i;
        byte[] bArr = iconCompat.OooO0OO;
        if (abstractC1437oo00oo00.OooO0o0(2)) {
            Parcel parcel = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.OooO0OO = bArr;
        iconCompat.OooO0Oo = abstractC1437oo00oo00.OooO0o(iconCompat.OooO0Oo, 3);
        int i2 = iconCompat.OooO0o0;
        if (abstractC1437oo00oo00.OooO0o0(4)) {
            i2 = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readInt();
        }
        iconCompat.OooO0o0 = i2;
        int i3 = iconCompat.OooO0o;
        if (abstractC1437oo00oo00.OooO0o0(5)) {
            i3 = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readInt();
        }
        iconCompat.OooO0o = i3;
        iconCompat.OooO0oO = (ColorStateList) abstractC1437oo00oo00.OooO0o(iconCompat.OooO0oO, 6);
        String str = iconCompat.OooO;
        if (abstractC1437oo00oo00.OooO0o0(7)) {
            str = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readString();
        }
        iconCompat.OooO = str;
        String str2 = iconCompat.OooOO0;
        if (abstractC1437oo00oo00.OooO0o0(8)) {
            str2 = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.readString();
        }
        iconCompat.OooOO0 = str2;
        iconCompat.OooO0oo = PorterDuff.Mode.valueOf(iconCompat.OooO);
        switch (iconCompat.OooO00o) {
            case -1:
                parcelable = iconCompat.OooO0Oo;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.OooO0O0 = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.OooO0Oo;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.OooO0OO;
                    iconCompat.OooO0O0 = bArr3;
                    iconCompat.OooO00o = 3;
                    iconCompat.OooO0o0 = 0;
                    iconCompat.OooO0o = bArr3.length;
                    break;
                }
                iconCompat.OooO0O0 = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.OooO0OO, Charset.forName("UTF-16"));
                iconCompat.OooO0O0 = str3;
                if (iconCompat.OooO00o == 2 && iconCompat.OooOO0 == null) {
                    iconCompat.OooOO0 = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.OooO0O0 = iconCompat.OooO0OO;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC1437oo00oo00 abstractC1437oo00oo00) {
        abstractC1437oo00oo00.getClass();
        iconCompat.OooO = iconCompat.OooO0oo.name();
        switch (iconCompat.OooO00o) {
            case -1:
            case 1:
            case 5:
                iconCompat.OooO0Oo = (Parcelable) iconCompat.OooO0O0;
                break;
            case 2:
                iconCompat.OooO0OO = ((String) iconCompat.OooO0O0).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.OooO0OO = (byte[]) iconCompat.OooO0O0;
                break;
            case 4:
            case 6:
                iconCompat.OooO0OO = iconCompat.OooO0O0.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.OooO00o;
        if (-1 != i) {
            abstractC1437oo00oo00.OooO0oo(1);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeInt(i);
        }
        byte[] bArr = iconCompat.OooO0OO;
        if (bArr != null) {
            abstractC1437oo00oo00.OooO0oo(2);
            int length = bArr.length;
            Parcel parcel = ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.OooO0Oo;
        if (parcelable != null) {
            abstractC1437oo00oo00.OooO0oo(3);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.OooO0o0;
        if (i2 != 0) {
            abstractC1437oo00oo00.OooO0oo(4);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeInt(i2);
        }
        int i3 = iconCompat.OooO0o;
        if (i3 != 0) {
            abstractC1437oo00oo00.OooO0oo(5);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.OooO0oO;
        if (colorStateList != null) {
            abstractC1437oo00oo00.OooO0oo(6);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.OooO;
        if (str != null) {
            abstractC1437oo00oo00.OooO0oo(7);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeString(str);
        }
        String str2 = iconCompat.OooOO0;
        if (str2 != null) {
            abstractC1437oo00oo00.OooO0oo(8);
            ((C1436oo00oo0) abstractC1437oo00oo00).OooO0o0.writeString(str2);
        }
    }
}


