package com.ninja.engine;

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.oO0o0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0828oO0o0OoO extends StringRequest {
    public final /* synthetic */ String OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0828oO0o0OoO(String str, C0823oO0o0OO c0823oO0o0OO, C1825ooOOoOoo c1825ooOOoOoo, String str2) {
        super(1, str, c0823oO0o0OO, c1825ooOOoOoo);
        this.OooO00o = str2;
    }

    @Override // com.android.volley.Request
    public final Map getParams() {
        HashMap hashMap = new HashMap();
        hashMap.put("user-status", "guest");
        hashMap.put("token-key", this.OooO00o);
        return hashMap;
    }
}


