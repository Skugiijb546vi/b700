package com.ninja.engine;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oOOoo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118oOOoo0o extends StringRequest {
    public final /* synthetic */ String OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118oOOoo0o(String str, C0823oO0o0OO c0823oO0o0OO, C1825ooOOoOoo c1825ooOOoOoo, String str2) {
        super(1, str, c0823oO0o0OO, c1825ooOOoOoo);
        this.OooO00o = str2;
    }

    @Override // com.android.volley.Request
    public final Map getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("user-status", "user");
        hashMap.put("token-key", this.OooO00o);
        hashMap.put("username-activation", MainActivity.OooO00o.getString("username-activation", ""));
        hashMap.put("password-activation", MainActivity.OooO00o.getString("password-activation", ""));
        hashMap.put("user-device-id", AbstractC2033oooOoo0.OooO0O0());
        return hashMap;
    }
}
