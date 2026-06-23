package com.ninja.engine;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oO0o0OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826oO0o0OOo extends StringRequest {
    public final /* synthetic */ String OooO00o;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ String OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826oO0o0OOo(String str, C0824oO0o0OO0 c0824oO0o0OO0, C0709oO000oOo c0709oO000oOo, String str2, String str3, String str4) {
        super(1, str, c0824oO0o0OO0, c0709oO000oOo);
        this.OooO00o = str2;
        this.OooO0O0 = str3;
        this.OooO0OO = str4;
    }

    @Override // com.android.volley.Request
    public final Map getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("user-status", "user");
        hashMap.put("token-key", this.OooO00o);
        hashMap.put("username-activation", this.OooO0O0);
        hashMap.put("password-activation", this.OooO0OO);
        hashMap.put("user-device-id", AbstractC2033oooOoo0.OooO0O0());
        return hashMap;
    }
}
