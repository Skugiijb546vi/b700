package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.app.framework.core.system.JarConfig;
import java.util.ArrayList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class o0O0O00 implements Parcelable.Creator {
    public final /* synthetic */ int OooO00o;

    public o0O0O00(int i) {
        this.OooO00o = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ninja.engine.o000OOo] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.ninja.engine.o0oOooOo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.ninja.engine.o0oOoooo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ninja.engine.ooo0o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View$BaseSavedState, java.lang.Object, com.ninja.engine.oO0oOo00] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.ninja.engine.oOO0O000, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.View$BaseSavedState, com.ninja.engine.oOO0OO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ninja.engine.ooOOO0O0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ninja.engine.oOooo0O0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$BaseSavedState, com.ninja.engine.o00O00oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ninja.engine.o00Ooo0O, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        switch (this.OooO00o) {
            case 0:
                C0084o000OOo obj = new C0084o000OOo();
                obj.OooO00o = parcel.readInt();
                return obj;
            case 1:
                return new o0000O00(parcel);
            case 2:
                C0124o00O00oO baseSavedState = new C0124o00O00oO(parcel);
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                baseSavedState.OooO00o = z;
                return baseSavedState;
            case 3:
                return new C0175o00OoOoo(parcel);
            case 4:
                return new C0178o00Ooo00(parcel);
            case 5:
                C0179o00Ooo0O obj2 = new C0179o00Ooo0O();
                obj2.OooO = 255;
                obj2.OooOO0O = -2;
                obj2.OooOO0o = -2;
                obj2.OooOOO0 = -2;
                obj2.OooOo00 = Boolean.TRUE;
                obj2.OooO00o = parcel.readInt();
                obj2.OooO0O0 = (Integer) parcel.readSerializable();
                obj2.OooO0OO = (Integer) parcel.readSerializable();
                obj2.OooO0Oo = (Integer) parcel.readSerializable();
                obj2.OooO0o0 = (Integer) parcel.readSerializable();
                obj2.OooO0o = (Integer) parcel.readSerializable();
                obj2.OooO0oO = (Integer) parcel.readSerializable();
                obj2.OooO0oo = (Integer) parcel.readSerializable();
                obj2.OooO = parcel.readInt();
                obj2.OooOO0 = parcel.readString();
                obj2.OooOO0O = parcel.readInt();
                obj2.OooOO0o = parcel.readInt();
                obj2.OooOOO0 = parcel.readInt();
                obj2.OooOOOO = parcel.readString();
                obj2.OooOOOo = parcel.readString();
                obj2.OooOOo0 = parcel.readInt();
                obj2.OooOOoo = (Integer) parcel.readSerializable();
                obj2.OooOo0 = (Integer) parcel.readSerializable();
                obj2.OooOo0O = (Integer) parcel.readSerializable();
                obj2.OooOo0o = (Integer) parcel.readSerializable();
                obj2.OooOo = (Integer) parcel.readSerializable();
                obj2.OooOoO0 = (Integer) parcel.readSerializable();
                obj2.OooOoO = (Integer) parcel.readSerializable();
                obj2.OooOoo = (Integer) parcel.readSerializable();
                obj2.OooOoOO = (Integer) parcel.readSerializable();
                obj2.OooOoo0 = (Integer) parcel.readSerializable();
                obj2.OooOo00 = (Boolean) parcel.readSerializable();
                obj2.OooOOO = (Locale) parcel.readSerializable();
                obj2.OooOooO = (Boolean) parcel.readSerializable();
                return obj2;
            case 6:
                return new o0O0o((C0906oOO000oo) parcel.readParcelable(C0906oOO000oo.class.getClassLoader()), (C0906oOO000oo) parcel.readParcelable(C0906oOO000oo.class.getClassLoader()), (C0350o0OO0oOo) parcel.readParcelable(C0350o0OO0oOo.class.getClassLoader()), (C0906oOO000oo) parcel.readParcelable(C0906oOO000oo.class.getClassLoader()), parcel.readInt());
            case 7:
                return new C0350o0OO0oOo(parcel.readLong());
            case 8:
                C0603o0oOooOo obj3 = new C0603o0oOooOo();
                obj3.OooO00o = parcel.readString();
                obj3.OooO0O0 = parcel.readInt();
                return obj3;
            case 9:
                C0607o0oOoooo obj4 = new C0607o0oOoooo();
                obj4.OooO0o0 = null;
                obj4.OooO0o = new ArrayList();
                obj4.OooO0oO = new ArrayList();
                obj4.OooO00o = parcel.createStringArrayList();
                obj4.OooO0O0 = parcel.createStringArrayList();
                obj4.OooO0OO = (C0175o00OoOoo[]) parcel.createTypedArray(C0175o00OoOoo.CREATOR);
                obj4.OooO0Oo = parcel.readInt();
                obj4.OooO0o0 = parcel.readString();
                obj4.OooO0o = parcel.createStringArrayList();
                obj4.OooO0oO = parcel.createTypedArrayList(C0178o00Ooo00.CREATOR);
                obj4.OooO0oo = parcel.createTypedArrayList(C0603o0oOooOo.CREATOR);
                return obj4;
            case JarConfig.MAX_CACHE_SIZE /* 10 */:
                return new C0610o0oo00O(parcel);
            case 11:
                C1934ooo0o obj5 = new C1934ooo0o();
                obj5.OooO00o = parcel.readInt();
                obj5.OooO0O0 = parcel.readInt();
                boolean z4 = true;
                if (parcel.readInt() != 1) {
                    z4 = false;
                }
                obj5.OooO0OO = z4;
                return obj5;
            case 12:
                C0866oO0oOo00 baseSavedState2 = new C0866oO0oOo00(parcel);
                baseSavedState2.OooO00o = ((Integer) parcel.readValue(C0866oO0oOo00.class.getClassLoader())).intValue();
                return baseSavedState2;
            case 13:
                return C0906oOO000oo.OooO00o(parcel.readInt(), parcel.readInt());
            case 14:
                oOO0O000 obj6 = new oOO0O000();
                obj6.OooO00o = parcel.readInt();
                obj6.OooO0O0 = (C0991oOOO0ooo) parcel.readParcelable(oOO0O000.class.getClassLoader());
                return obj6;
            case 15:
                oOO0OO0 baseSavedState3 = new oOO0OO0(parcel);
                baseSavedState3.OooO00o = parcel.readInt();
                return baseSavedState3;
            case 16:
                return new ParcelImpl(parcel);
            case 17:
                C1779ooOOO0O0 obj7 = new C1779ooOOO0O0();
                obj7.OooO00o = parcel.readInt();
                obj7.OooO0O0 = parcel.readInt();
                boolean z5 = true;
                if (parcel.readInt() != 1) {
                    z5 = false;
                }
                obj7.OooO0Oo = z5;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj7.OooO0OO = iArr;
                    parcel.readIntArray(iArr);
                }
                return obj7;
            default:
                C1328oOooo0O0 obj8 = new C1328oOooo0O0();
                obj8.OooO00o = parcel.readInt();
                obj8.OooO0O0 = parcel.readInt();
                int readInt2 = parcel.readInt();
                obj8.OooO0OO = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj8.OooO0Oo = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                obj8.OooO0o0 = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    obj8.OooO0o = iArr3;
                    parcel.readIntArray(iArr3);
                }
                boolean z6 = false;
                if (parcel.readInt() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                obj8.OooO0oo = z2;
                if (parcel.readInt() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                obj8.OooO = z3;
                if (parcel.readInt() == 1) {
                    z6 = true;
                }
                obj8.OooOO0 = z6;
                obj8.OooO0oO = parcel.readArrayList(C1779ooOOO0O0.class.getClassLoader());
                return obj8;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.OooO00o) {
            case 0:
                return new C0084o000OOo[i];
            case 1:
                return new o0000O00[i];
            case 2:
                return new C0124o00O00oO[i];
            case 3:
                return new C0175o00OoOoo[i];
            case 4:
                return new C0178o00Ooo00[i];
            case 5:
                return new C0179o00Ooo0O[i];
            case 6:
                return new o0O0o[i];
            case 7:
                return new C0350o0OO0oOo[i];
            case 8:
                return new C0603o0oOooOo[i];
            case 9:
                return new C0607o0oOoooo[i];
            case JarConfig.MAX_CACHE_SIZE /* 10 */:
                return new C0610o0oo00O[i];
            case 11:
                return new C1934ooo0o[i];
            case 12:
                return new C0866oO0oOo00[i];
            case 13:
                return new C0906oOO000oo[i];
            case 14:
                return new oOO0O000[i];
            case 15:
                return new oOO0OO0[i];
            case 16:
                return new ParcelImpl[i];
            case 17:
                return new C1779ooOOO0O0[i];
            default:
                return new C1328oOooo0O0[i];
        }
    }
}



