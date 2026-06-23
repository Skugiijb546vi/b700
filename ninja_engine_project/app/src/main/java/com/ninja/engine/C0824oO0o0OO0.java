package com.ninja.engine;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.volley.Response;
import com.ninja.engine.encryption.EncryptorInstance;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oO0o0OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0824oO0o0OO0 implements Response.Listener {
    public final /* synthetic */ int OooO00o = 0;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ String OooO0OO;
    public final /* synthetic */ Object OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ C0824oO0o0OO0(C0829oO0o0Ooo c0829oO0o0Ooo, String str, DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO, String str2, String str3) {
        this.OooO0Oo = c0829oO0o0Ooo;
        this.OooO0O0 = str;
        this.OooO0o = dialogInterfaceC0074o0000oOO;
        this.OooO0OO = str2;
        this.OooO0o0 = str3;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(Object obj) {
        o000OO00 Oooo000;
        String OooOOO0;
        String trim;
        JSONObject jSONObject;
        String optString;
        String OooO0O0;
        C0952oOO0oOOO c0952oOO0oOOO;
        switch (this.OooO00o) {
            case 0:
                String str = this.OooO0O0;
                final DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO = (DialogInterfaceC0074o0000oOO) this.OooO0o;
                final String str2 = this.OooO0OO;
                final String str3 = (String) this.OooO0o0;
                String str4 = (String) obj;
                final C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO0Oo;
                c0829oO0o0Ooo.getClass();
                try {
                    JSONObject jSONObject2 = (JSONObject) new JSONArray(EncryptorInstance.decryptOpenSSL256bit(str4, str)).get(0);
                    if (jSONObject2.optBoolean("geo_restricted", false)) {
                        dialogInterfaceC0074o0000oOO.dismiss();
                        Oooo000 = c0829oO0o0Ooo.Oooo000();
                        OooOOO0 = c0829oO0o0Ooo.OooOOO0(R.string.key_activation_country_restricted);
                    } else if (jSONObject2.has("fk_disabled")) {
                        dialogInterfaceC0074o0000oOO.dismiss();
                        c0829oO0o0Ooo.Oooo0o();
                        return;
                    } else {
                        final boolean has = jSONObject2.has("is_fk");
                        if (jSONObject2.getString("status").equals("enable")) {
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ninja.engine.oO0o0O0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final C0829oO0o0Ooo c0829oO0o0Ooo2 = c0829oO0o0Ooo;
                                    c0829oO0o0Ooo2.getClass();
                                    String OooO0O02 = AbstractC2033oooOoo0.OooO0O0();
                                    final String str5 = str2;
                                    final String str6 = str3;
                                    C0131o00O0o c0131o00O0o = new C0131o00O0o(OooO0O02, str5, str6, 21);
                                    final DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO2 = dialogInterfaceC0074o0000oOO;
                                    final boolean z = has;
                                    AbstractC2033oooOoo0.OooO0OO(c0131o00O0o, new InterfaceC2035oooOoo0O() { // from class: com.ninja.engine.oO0o0O0O
                                        @Override // com.ninja.engine.InterfaceC2035oooOoo0O
                                        public final void OooO00o(int i) {
                                            o000OO00 Oooo0002;
                                            int i2;
                                            C0829oO0o0Ooo c0829oO0o0Ooo3 = c0829oO0o0Ooo2;
                                            c0829oO0o0Ooo3.getClass();
                                            dialogInterfaceC0074o0000oOO2.dismiss();
                                            boolean z2 = z;
                                            if (i != 0) {
                                                if (i != 2) {
                                                    if (i != 3) {
                                                        if (i != 4) {
                                                            SharedPreferences.Editor edit = MainActivity.OooO00o.edit();
                                                            String str7 = str5;
                                                            SharedPreferences.Editor putString = edit.putString("username-activation", str7);
                                                            String str8 = str6;
                                                            putString.putString("password-activation", str8).putString("user-status", "logged-in").apply();
                                                            long j = i;
                                                            Bundle bundle = new Bundle();
                                                            bundle.putString("username-activation", str7);
                                                            bundle.putString("password-activation", str8);
                                                            bundle.putLong("remaining-time", (Long.parseLong(String.valueOf(System.currentTimeMillis()).substring(0, String.valueOf(System.currentTimeMillis()).length() - 3)) + j) - 22);
                                                            bundle.putString("check-user", "success");
                                                            Intent intent = new Intent(c0829oO0o0Ooo3.Oooo000(), com.ninja.engine.view.main.MainActivity.class);
                                                            intent.putExtras(bundle);
                                                            c0829oO0o0Ooo3.Oooo0o0(intent);
                                                            c0829oO0o0Ooo3.Oooo000().finish();
                                                            return;
                                                        }
                                                        Oooo0002 = c0829oO0o0Ooo3.Oooo000();
                                                        i2 = R.string.key_activation_expired;
                                                    } else {
                                                        Oooo0002 = c0829oO0o0Ooo3.Oooo000();
                                                        i2 = R.string.key_activation_used_on_another_device;
                                                    }
                                                } else {
                                                    if (!z2) {
                                                        Oooo0002 = c0829oO0o0Ooo3.Oooo000();
                                                        i2 = R.string.key_activation_wrong;
                                                    }
                                                    c0829oO0o0Ooo3.Oooo0o();
                                                }
                                                Toast.makeText(Oooo0002, c0829oO0o0Ooo3.OooOOO0(i2), 0).show();
                                                return;
                                            }
                                            if (!z2) {
                                                Oooo0002 = c0829oO0o0Ooo3.Oooo000();
                                                i2 = R.string.something_went_wrong;
                                                Toast.makeText(Oooo0002, c0829oO0o0Ooo3.OooOOO0(i2), 0).show();
                                                return;
                                            }
                                            c0829oO0o0Ooo3.Oooo0o();
                                        }
                                    });
                                }
                            }, 1750L);
                            return;
                        }
                        dialogInterfaceC0074o0000oOO.dismiss();
                        Oooo000 = c0829oO0o0Ooo.Oooo000();
                        OooOOO0 = c0829oO0o0Ooo.OooOOO0(R.string.maintenance_message);
                    }
                    Toast.makeText(Oooo000, OooOOO0, 0).show();
                    return;
                } catch (JSONException unused) {
                    dialogInterfaceC0074o0000oOO.dismiss();
                    c0829oO0o0Ooo.Oooo000().finish();
                    return;
                }
            default:
                String str5 = this.OooO0O0;
                AtomicReference atomicReference = (AtomicReference) this.OooO0Oo;
                String str6 = this.OooO0OO;
                File file = (File) this.OooO0o0;
                CountDownLatch countDownLatch = (CountDownLatch) this.OooO0o;
                try {
                    try {
                        String decryptOpenSSL256bit = EncryptorInstance.decryptOpenSSL256bit((String) obj, str5);
                        if (decryptOpenSSL256bit == null) {
                            trim = "";
                        } else {
                            trim = decryptOpenSSL256bit.trim();
                        }
                        if (trim.startsWith("[")) {
                            jSONObject = new JSONArray(trim).optJSONObject(0);
                            if (jSONObject == null) {
                                throw new IllegalStateException("Empty JSON array response");
                            }
                        } else {
                            jSONObject = new JSONObject(trim);
                        }
                        optString = jSONObject.optString("status");
                    } catch (Exception unused2) {
                        atomicReference.set(C0952oOO0oOOO.OooO00o("parse-or-write-failed"));
                    }
                    if ("not-modified".equalsIgnoreCase(optString)) {
                        c0952oOO0oOOO = new C0952oOO0oOOO(1, null);
                    } else if ("failed".equalsIgnoreCase(jSONObject.optString("check-user"))) {
                        c0952oOO0oOOO = C0952oOO0oOOO.OooO00o("auth");
                    } else {
                        if ("ok".equalsIgnoreCase(optString) && "aes-256-gcm".equalsIgnoreCase(jSONObject.optString("alg")) && (OooO0O0 = AbstractC0953oOO0oOOo.OooO0O0(jSONObject.optString("version", str6))) != null && str6.equals(OooO0O0) && !jSONObject.optString("n").isEmpty() && !jSONObject.optString("c").isEmpty() && !jSONObject.optString("t").isEmpty() && !jSONObject.optString("rev").isEmpty()) {
                            AbstractC0953oOO0oOOo.OooO0OO(jSONObject.toString().getBytes(StandardCharsets.UTF_8), file);
                            file.getAbsolutePath();
                            c0952oOO0oOOO = new C0952oOO0oOOO(1, null);
                        }
                        return;
                    }
                    atomicReference.set(c0952oOO0oOOO);
                    return;
                } finally {
                    countDownLatch.countDown();
                }
        }
    }

    public /* synthetic */ C0824oO0o0OO0(String str, AtomicReference atomicReference, String str2, File file, CountDownLatch countDownLatch) {
        this.OooO0O0 = str;
        this.OooO0Oo = atomicReference;
        this.OooO0OO = str2;
        this.OooO0o0 = file;
        this.OooO0o = countDownLatch;
    }
}
