package com.ninja.engine;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oO0o0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827oO0o0Oo extends StringRequest {
    public final /* synthetic */ String OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827oO0o0Oo(String str, C0818oO0o0O c0818oO0o0O, C0435o0OoO000 c0435o0OoO000, String str2) {
        super(1, str, c0818oO0o0O, c0435o0OoO000);
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


