package com.ninja.engine;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* renamed from: com.ninja.engine.o0Ooo0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475o0Ooo0o0 {
    public int OooO00o = 1;
    public final C0902oOO0000o OooO0O0;
    public C0902oOO0000o OooO0OO;
    public C0902oOO0000o OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public final boolean OooO0oO;
    public final int[] OooO0oo;

    public C0475o0Ooo0o0(C0902oOO0000o c0902oOO0000o, boolean z, int[] iArr) {
        this.OooO0O0 = c0902oOO0000o;
        this.OooO0OO = c0902oOO0000o;
        this.OooO0oO = z;
        this.OooO0oo = iArr;
    }

    public final void OooO00o() {
        this.OooO00o = 1;
        this.OooO0OO = this.OooO0O0;
        this.OooO0o = 0;
    }

    public final boolean OooO0O0() {
        int[] iArr;
        oOO0000 OooO0OO = this.OooO0OO.OooO0O0.OooO0OO();
        int OooO00o = OooO0OO.OooO00o(6);
        if ((OooO00o != 0 && ((ByteBuffer) OooO0OO.OooO0Oo).get(OooO00o + OooO0OO.OooO00o) != 0) || this.OooO0o0 == 65039) {
            return true;
        }
        if (this.OooO0oO && ((iArr = this.OooO0oo) == null || Arrays.binarySearch(iArr, this.OooO0OO.OooO0O0.OooO00o(0)) < 0)) {
            return true;
        }
        return false;
    }
}


