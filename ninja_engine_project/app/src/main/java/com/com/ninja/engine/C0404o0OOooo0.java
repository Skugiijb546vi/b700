package com.ninja.engine;

import java.io.File;
/* renamed from: com.ninja.engine.o0OOooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404o0OOooo0 {
    public final String OooO00o;
    public final long[] OooO0O0;
    public final File[] OooO0OO;
    public final File[] OooO0Oo;
    public C0067o0000Ooo OooO0o;
    public boolean OooO0o0;
    public final /* synthetic */ C0403o0OOooo OooO0oO;

    public C0404o0OOooo0(C0403o0OOooo c0403o0OOooo, String str) {
        this.OooO0oO = c0403o0OOooo;
        this.OooO00o = str;
        int i = c0403o0OOooo.OooO0oO;
        this.OooO0O0 = new long[i];
        this.OooO0OO = new File[i];
        this.OooO0Oo = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c0403o0OOooo.OooO0oO; i2++) {
            sb.append(i2);
            File[] fileArr = this.OooO0OO;
            String sb2 = sb.toString();
            File file = c0403o0OOooo.OooO00o;
            fileArr[i2] = new File(file, sb2);
            sb.append(".tmp");
            this.OooO0Oo[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String OooO00o() {
        long[] jArr;
        StringBuilder sb = new StringBuilder();
        for (long j : this.OooO0O0) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
