package com.ninja.engine;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.ninja.engine.encryption.EncryptorInstance;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOOoo000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnClickListenerC1111oOOoo000 implements View.OnClickListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;
    public final /* synthetic */ KeyEvent.Callback OooO0Oo;

    public /* synthetic */ View$OnClickListenerC1111oOOoo000(Object obj, Object obj2, KeyEvent.Callback callback, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
        this.OooO0Oo = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o000OO00 Oooo000;
        int i;
        switch (this.OooO00o) {
            case 0:
                C1109oOOoo0 c1109oOOoo0 = (C1109oOOoo0) this.OooO0OO;
                C1114oOOoo0O c1114oOOoo0O = (C1114oOOoo0O) this.OooO0O0;
                c1114oOOoo0O.getClass();
                try {
                    Context context = c1114oOOoo0O.OooO0o;
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + c1109oOOoo0.OooO0O0)));
                } catch (Exception unused) {
                }
                ((AlertDialog) this.OooO0Oo).dismiss();
                return;
            case 1:
                C1109oOOoo0 c1109oOOoo02 = (C1109oOOoo0) this.OooO0OO;
                C1114oOOoo0O c1114oOOoo0O2 = (C1114oOOoo0O) this.OooO0O0;
                c1114oOOoo0O2.getClass();
                try {
                    Context context2 = c1114oOOoo0O2.OooO0o;
                    context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://wa.me/" + c1109oOOoo02.OooO0OO)));
                } catch (Exception unused2) {
                }
                ((AlertDialog) this.OooO0Oo).dismiss();
                return;
            default:
                C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO0O0;
                c0829oO0o0Ooo.getClass();
                Editable text = ((TextInputEditText) this.OooO0OO).getText();
                Objects.requireNonNull(text);
                String trim = text.toString().trim();
                Editable text2 = ((TextInputEditText) this.OooO0Oo).getText();
                Objects.requireNonNull(text2);
                String trim2 = text2.toString().trim();
                if (trim.isEmpty() && trim2.isEmpty()) {
                    Oooo000 = c0829oO0o0Ooo.Oooo000();
                    i = R.string.key_activation_required;
                } else if (trim.isEmpty()) {
                    Oooo000 = c0829oO0o0Ooo.Oooo000();
                    i = R.string.username_error;
                } else if (trim2.isEmpty()) {
                    Oooo000 = c0829oO0o0Ooo.Oooo000();
                    i = R.string.password_error;
                } else {
                    ConnectivityManager connectivityManager = (ConnectivityManager) c0829oO0o0Ooo.Oooo000().getSystemService("connectivity");
                    if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
                        if (c0829oO0o0Ooo.Oooo000().getCurrentFocus() != null) {
                            ((InputMethodManager) c0829oO0o0Ooo.Oooo000().getSystemService("input_method")).hideSoftInputFromWindow(c0829oO0o0Ooo.Oooo000().getCurrentFocus().getWindowToken(), 0);
                        }
                        DialogInterfaceC0074o0000oOO OooO00o = new C0073o0000oO0(c0829oO0o0Ooo.Oooo000()).OooO00o();
                        LayoutInflater layoutInflater = c0829oO0o0Ooo.Oooo0O0;
                        if (layoutInflater == null) {
                            layoutInflater = c0829oO0o0Ooo.OooOoO0(null);
                            c0829oO0o0Ooo.Oooo0O0 = layoutInflater;
                        }
                        View inflate = layoutInflater.inflate(R.layout.dialog_loading, (ViewGroup) null);
                        C0068o0000o c0068o0000o = OooO00o.OooO0o;
                        c0068o0000o.OooO0o = inflate;
                        c0068o0000o.OooO0oO = 0;
                        c0068o0000o.OooO0oo = false;
                        if (OooO00o.getWindow() != null) {
                            OooO00o.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        }
                        OooO00o.setCancelable(false);
                        OooO00o.setCanceledOnTouchOutside(false);
                        OooO00o.show();
                        String generateTokenKey = MainActivity.generateTokenKey();
                        RequestQueue newRequestQueue = Volley.newRequestQueue(c0829oO0o0Ooo.Oooo000());
                        newRequestQueue.add(new C0826oO0o0OOo(EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3)) + "/upload/login-access.php", new C0824oO0o0OO0(c0829oO0o0Ooo, generateTokenKey, OooO00o, trim, trim2), new C0709oO000oOo(c0829oO0o0Ooo, OooO00o), generateTokenKey, trim, trim2));
                        return;
                    }
                    Toast.makeText(c0829oO0o0Ooo.Oooo000(), c0829oO0o0Ooo.OooOOO0(R.string.check_internet), 0).show();
                    return;
                }
                Toast.makeText(Oooo000, c0829oO0o0Ooo.OooOOO0(i), 0).show();
                return;
        }
    }
}


