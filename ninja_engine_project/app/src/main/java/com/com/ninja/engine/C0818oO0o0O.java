package com.ninja.engine;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.android.volley.Response;
import com.ninja.engine.encryption.EncryptorInstance;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oO0o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0818oO0o0O implements Response.Listener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ AbstractComponentCallbacksC0593o0oOoOo0 OooO0OO;
    public final /* synthetic */ View OooO0Oo;
    public final /* synthetic */ View OooO0o0;

    public /* synthetic */ C0818oO0o0O(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, String str, View view, View view2, int i) {
        this.OooO00o = i;
        this.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0;
        this.OooO0O0 = str;
        this.OooO0Oo = view;
        this.OooO0o0 = view2;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(Object obj) {
        switch (this.OooO00o) {
            case 0:
                String str = this.OooO0O0;
                ImageView imageView = (ImageView) this.OooO0Oo;
                ImageView imageView2 = (ImageView) this.OooO0o0;
                String str2 = (String) obj;
                C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO0OO;
                c0829oO0o0Ooo.getClass();
                try {
                    JSONObject jSONObject = (JSONObject) new JSONArray(EncryptorInstance.decryptOpenSSL256bit(str2, str)).get(0);
                    try {
                        c0829oO0o0Ooo.o000oOoO = jSONObject.getString("telegram");
                    } catch (JSONException unused) {
                    }
                    imageView.setOnClickListener(new View$OnClickListenerC0817oO0o000o(c0829oO0o0Ooo, 0));
                    imageView2.setOnClickListener(new View$OnClickListenerC0820oO0o0O00(c0829oO0o0Ooo, jSONObject, 0));
                    return;
                } catch (JSONException unused2) {
                    c0829oO0o0Ooo.Oooo000().finish();
                    return;
                }
            default:
                String str3 = this.OooO0O0;
                CardView cardView = (CardView) this.OooO0Oo;
                CardView cardView2 = (CardView) this.OooO0o0;
                String str4 = (String) obj;
                final C1119oOOoo0oO c1119oOOoo0oO = (C1119oOOoo0oO) this.OooO0OO;
                c1119oOOoo0oO.getClass();
                try {
                    final JSONObject jSONObject2 = (JSONObject) new JSONArray(EncryptorInstance.decryptOpenSSL256bit(str4, str3)).get(0);
                    cardView.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.oOOoo0OO
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    JSONObject jSONObject3 = jSONObject2;
                                    C1119oOOoo0oO c1119oOOoo0oO2 = c1119oOOoo0oO;
                                    c1119oOOoo0oO2.getClass();
                                    try {
                                        c1119oOOoo0oO2.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject3.getString("telegram"))));
                                        return;
                                    } catch (JSONException unused3) {
                                        return;
                                    }
                                default:
                                    JSONObject jSONObject4 = jSONObject2;
                                    C1119oOOoo0oO c1119oOOoo0oO3 = c1119oOOoo0oO;
                                    c1119oOOoo0oO3.getClass();
                                    try {
                                        c1119oOOoo0oO3.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject4.getString("technical_support"))));
                                        return;
                                    } catch (JSONException unused4) {
                                        return;
                                    }
                            }
                        }
                    });
                    cardView2.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.oOOoo0OO
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    JSONObject jSONObject3 = jSONObject2;
                                    C1119oOOoo0oO c1119oOOoo0oO2 = c1119oOOoo0oO;
                                    c1119oOOoo0oO2.getClass();
                                    try {
                                        c1119oOOoo0oO2.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject3.getString("telegram"))));
                                        return;
                                    } catch (JSONException unused3) {
                                        return;
                                    }
                                default:
                                    JSONObject jSONObject4 = jSONObject2;
                                    C1119oOOoo0oO c1119oOOoo0oO3 = c1119oOOoo0oO;
                                    c1119oOOoo0oO3.getClass();
                                    try {
                                        c1119oOOoo0oO3.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(jSONObject4.getString("technical_support"))));
                                        return;
                                    } catch (JSONException unused4) {
                                        return;
                                    }
                            }
                        }
                    });
                    return;
                } catch (JSONException unused3) {
                    return;
                }
        }
    }
}
