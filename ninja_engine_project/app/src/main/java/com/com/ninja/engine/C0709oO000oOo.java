package com.ninja.engine;

import android.widget.Button;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.ninja.engine.encryption.EncryptorInstance;
import com.ninja.engine.view.update.UpdateRequiredActivity;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oO000oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0709oO000oOo implements Response.Listener, Response.ErrorListener, InterfaceC0971oOOO000 {
    public final /* synthetic */ Object OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0709oO000oOo(Object obj, Object obj2) {
        this.OooO00o = obj;
        this.OooO0O0 = obj2;
    }

    @Override // com.ninja.engine.InterfaceC0971oOOO000
    public void OooO00o(C1006oOOOOoOO c1006oOOOOoOO) {
        int i = UpdateRequiredActivity.Oooo000;
        Button button = (Button) this.OooO00o;
        AbstractC0809oO0OooOO.OooOOOo(button, "$downloadBtn");
        UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0O0;
        AbstractC0809oO0OooOO.OooOOOo(updateRequiredActivity, "this$0");
        button.post(new RunnableC0090o000OoOO(c1006oOOOOoOO, 8, updateRequiredActivity));
    }

    @Override // com.android.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
        C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO00o;
        c0829oO0o0Ooo.getClass();
        ((DialogInterfaceC0074o0000oOO) this.OooO0O0).dismiss();
        c0829oO0o0Ooo.Oooo000().finish();
    }

    @Override // com.android.volley.Response.Listener
    public void onResponse(Object obj) {
        String str = (String) this.OooO0O0;
        String str2 = (String) obj;
        C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) this.OooO00o;
        c0792oO0Oo0Oo.getClass();
        try {
            JSONObject jSONObject = new JSONObject(EncryptorInstance.decryptOpenSSL256bit(str2, str));
            if ("failed".equals(jSONObject.optString("check-user"))) {
                if (c0792oO0Oo0Oo.OooOOOo() && c0792oO0Oo0Oo.OooO0oO() != null) {
                    c0792oO0Oo0Oo.Oooo000().runOnUiThread(new RunnableC0706oO000oO(c0792oO0Oo0Oo, 8));
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("app-1");
            String string = jSONObject2.getString("version-app");
            String optString = jSONObject2.optString("URL Update", "");
            String OoooO00 = c0792oO0Oo0Oo.OoooO00();
            if (!string.equals(OoooO00)) {
                c0792oO0Oo0Oo.OooooO0 = true;
                try {
                    UpdateRequiredActivity.Oooo000(c0792oO0Oo0Oo.Oooo000(), OoooO00, string, optString);
                    c0792oO0Oo0Oo.Oooo000().finish();
                    return;
                } catch (Exception unused) {
                    c0792oO0Oo0Oo.OoooOOo(OoooO00, string, optString);
                    return;
                }
            }
            c0792oO0Oo0Oo.OooooO0 = true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
