package com.ninja.engine;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.ninja.engine.encryption.EncryptorInstance;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oOoOoOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1241oOoOoOOo extends AbstractComponentCallbacksC0593o0oOoOo0 {
    /* JADX WARN: Type inference failed for: r15v2, types: [com.ninja.engine.oOoOoO0o] */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.ninja.engine.oOooooOO] */
    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_splash, viewGroup, false);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 1.0f, 0.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(800L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        ((ImageView) inflate.findViewById(R.id.splash_logo)).startAnimation(animationSet);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(600L);
        alphaAnimation2.setStartOffset(400L);
        alphaAnimation2.setFillBefore(true);
        ((TextView) inflate.findViewById(R.id.splash_app_name)).startAnimation(alphaAnimation2);
        final long currentTimeMillis = System.currentTimeMillis();
        final Handler handler = new Handler(Looper.getMainLooper());
        if (MainActivity.OooO00o == null) {
            MainActivity.OooO00o = Oooo000().getSharedPreferences("configuration-app", 0);
        }
        try {
            String TextDecryptor = EncryptorInstance.TextDecryptor(MainActivity.getURL(1));
            String TextDecryptor2 = EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3));
            String str = AbstractC2033oooOoo0.OooO00o;
            AbstractC2033oooOoo0.OooO00o = TextDecryptor + TextDecryptor2 + "/xapi/";
        } catch (Exception unused) {
        }
        if (MainActivity.OooO00o.getString("username-activation", null) != null && MainActivity.OooO00o.getString("password-activation", null) != null && MainActivity.OooO00o.getString("user-status", "").equals("logged-in")) {
            final String string = MainActivity.OooO00o.getString("username-activation", "");
            final String string2 = MainActivity.OooO00o.getString("password-activation", "");
            final String generateTokenKey = MainActivity.generateTokenKey();
            Volley.newRequestQueue(Oooo000()).add(new C1239oOoOoOO(AbstractC1230oOoOo0o.OooO0oO(EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3)), "/upload/login-access.php"), new Response.Listener() { // from class: com.ninja.engine.oOooooOO
                @Override // com.android.volley.Response.Listener
                public final void onResponse(Object obj) {
                    String str2 = generateTokenKey;
                    long j = currentTimeMillis;
                    Handler handler2 = handler;
                    String str3 = (String) obj;
                    C1241oOoOoOOo c1241oOoOoOOo = C1241oOoOoOOo.this;
                    c1241oOoOoOOo.getClass();
                    try {
                        if (((JSONObject) new JSONArray(EncryptorInstance.decryptOpenSSL256bit(str3, str2)).get(0)).optBoolean("geo_restricted", false)) {
                            handler2.postDelayed(new RunnableC1234oOoOoO(c1241oOoOoOOo, 1), Math.max(0L, 2500 - (System.currentTimeMillis() - j)));
                            return;
                        }
                    } catch (Exception unused2) {
                    }
                    AbstractC2033oooOoo0.OooO0OO(new C0131o00O0o(AbstractC2033oooOoo0.OooO0O0(), string, string2, 21), new C1240oOoOoOO0(c1241oOoOoOOo, j, handler2));
                }
            }, new Response.ErrorListener() { // from class: com.ninja.engine.oOoOoO0o
                @Override // com.android.volley.Response.ErrorListener
                public final void onErrorResponse(VolleyError volleyError) {
                    C1241oOoOoOOo c1241oOoOoOOo = C1241oOoOoOOo.this;
                    c1241oOoOoOOo.getClass();
                    AbstractC2033oooOoo0.OooO0OO(new C0131o00O0o(AbstractC2033oooOoo0.OooO0O0(), string, string2, 21), new C1240oOoOoOO0(c1241oOoOoOOo, currentTimeMillis, handler));
                }
            }, generateTokenKey, string, string2));
        } else {
            handler.postDelayed(new RunnableC1234oOoOoO(this, 0), 2500L);
        }
        return inflate;
    }

    public final void Oooo0o() {
        C0606o0oOoooO OooOo00 = Oooo000().OooOo00();
        OooOo00.getClass();
        C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(OooOo00);
        c0172o00OoOo.OooO0O0 = 17432576;
        c0172o00OoOo.OooO0OO = 17432577;
        c0172o00OoOo.OooO0Oo = 0;
        c0172o00OoOo.OooO0o0 = 0;
        c0172o00OoOo.OooO0o0(R.id.fragmentContainerView, new C0829oO0o0Ooo(), null, 2);
        c0172o00OoOo.OooO0Oo(false);
    }
}


