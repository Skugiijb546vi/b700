package com.ninja.engine;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oO0o0O00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnClickListenerC0820oO0o0O00 implements View.OnClickListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0829oO0o0Ooo OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ View$OnClickListenerC0820oO0o0O00(C0829oO0o0Ooo c0829oO0o0Ooo, Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0829oO0o0Ooo;
        this.OooO0OO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.OooO00o) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.OooO0OO;
                C0829oO0o0Ooo c0829oO0o0Ooo = this.OooO0O0;
                c0829oO0o0Ooo.getClass();
                try {
                    c0829oO0o0Ooo.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject.getString("technical_support"))));
                    return;
                } catch (JSONException unused) {
                    return;
                }
            default:
                C0829oO0o0Ooo c0829oO0o0Ooo2 = this.OooO0O0;
                c0829oO0o0Ooo2.getClass();
                ((DialogInterfaceC0074o0000oOO) this.OooO0OO).dismiss();
                if (c0829oO0o0Ooo2.o000oOoO != null) {
                    c0829oO0o0Ooo2.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(c0829oO0o0Ooo2.o000oOoO)));
                    return;
                }
                return;
        }
    }
}


