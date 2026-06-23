package com.ninja.engine;

import android.os.Parcel;
import android.util.SparseIntArray;
/* renamed from: com.ninja.engine.oo00oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436oo00oo0 extends AbstractC1437oo00oo00 {
    public int OooO;
    public final SparseIntArray OooO0Oo;
    public final int OooO0o;
    public final Parcel OooO0o0;
    public final int OooO0oO;
    public final String OooO0oo;
    public int OooOO0;
    public int OooOO0O;

    /* JADX WARN: Type inference failed for: r5v0, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    public C1436oo00oo0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1218oOoOOoo(), new C1218oOoOOoo(), new C1218oOoOOoo());
    }

    @Override // com.ninja.engine.AbstractC1437oo00oo00
    public final C1436oo00oo0 OooO00o() {
        Parcel parcel = this.OooO0o0;
        int dataPosition = parcel.dataPosition();
        int i = this.OooOO0;
        if (i == this.OooO0o) {
            i = this.OooO0oO;
        }
        return new C1436oo00oo0(parcel, dataPosition, i, AbstractC1230oOoOo0o.OooO(new StringBuilder(), this.OooO0oo, "  "), this.OooO00o, this.OooO0O0, this.OooO0OO);
    }

    @Override // com.ninja.engine.AbstractC1437oo00oo00
    public final boolean OooO0o0(int i) {
        while (this.OooOO0 < this.OooO0oO) {
            int i2 = this.OooOO0O;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.OooOO0;
            Parcel parcel = this.OooO0o0;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.OooOO0O = parcel.readInt();
            this.OooOO0 += readInt;
        }
        if (this.OooOO0O != i) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.AbstractC1437oo00oo00
    public final void OooO0oo(int i) {
        int i2 = this.OooO;
        SparseIntArray sparseIntArray = this.OooO0Oo;
        Parcel parcel = this.OooO0o0;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.OooO = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C1436oo00oo0(Parcel parcel, int i, int i2, String str, C0145o00OO0oO c0145o00OO0oO, C0145o00OO0oO c0145o00OO0oO2, C0145o00OO0oO c0145o00OO0oO3) {
        super(c0145o00OO0oO, c0145o00OO0oO2, c0145o00OO0oO3);
        this.OooO0Oo = new SparseIntArray();
        this.OooO = -1;
        this.OooOO0O = -1;
        this.OooO0o0 = parcel;
        this.OooO0o = i;
        this.OooO0oO = i2;
        this.OooOO0 = i;
        this.OooO0oo = str;
    }
}


