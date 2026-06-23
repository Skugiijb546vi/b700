package com.ninja.engine;

import android.util.Base64;
import java.util.List;
/* renamed from: com.ninja.engine.o0o0OoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557o0o0OoOo {
    public final String OooO00o;
    public final String OooO0O0;
    public final String OooO0OO;
    public final List OooO0Oo;
    public final String OooO0o0;

    public C0557o0o0OoOo(String str, String str2, String str3, List list) {
        str.getClass();
        this.OooO00o = str;
        str2.getClass();
        this.OooO0O0 = str2;
        this.OooO0OO = str3;
        list.getClass();
        this.OooO0Oo = list;
        this.OooO0o0 = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.OooO00o + ", mProviderPackage: " + this.OooO0O0 + ", mQuery: " + this.OooO0OO + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.OooO0Oo;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}


