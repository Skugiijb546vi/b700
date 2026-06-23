package com.ninja.engine;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oOO0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950oOO0oOO extends StringRequest {
    public final /* synthetic */ String OooO00o;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ String OooO0OO;
    public final /* synthetic */ String OooO0Oo;
    public final /* synthetic */ String OooO0o;
    public final /* synthetic */ String OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950oOO0oOO(String str, com.android.volley.Response.Listener c0824oO0o0OO0, com.android.volley.Response.ErrorListener c0951oOO0oOO0, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(1, str, c0824oO0o0OO0, c0951oOO0oOO0);
        this.OooO00o = str2;
        this.OooO0O0 = str3;
        this.OooO0OO = str4;
        this.OooO0Oo = str5;
        this.OooO0o0 = str6;
        this.OooO0o = str7;
    }

    @Override // com.android.volley.Request
    public final Map getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("token-key", this.OooO00o);
        hashMap.put("username-activation", this.OooO0O0);
        hashMap.put("password-activation", this.OooO0OO);
        hashMap.put("user-device-id", this.OooO0Oo);
        hashMap.put("version", this.OooO0o0);
        String str = this.OooO0o;
        if (str != null && !str.isEmpty()) {
            hashMap.put("rev", str);
        }
        return hashMap;
    }
}


