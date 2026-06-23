package com.ninja.engine;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oOOoo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1117oOOoo0Oo extends StringRequest {
    public final /* synthetic */ String OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1117oOOoo0Oo(String str, C0818oO0o0O c0818oO0o0O, C0386o0OOoO c0386o0OOoO, String str2) {
        super(1, str, c0818oO0o0O, c0386o0OOoO);
        this.OooO00o = str2;
    }

    @Override // com.android.volley.Request
    public final Map getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("user-status", "user");
        hashMap.put("token-key", this.OooO00o);
        return hashMap;
    }
}
