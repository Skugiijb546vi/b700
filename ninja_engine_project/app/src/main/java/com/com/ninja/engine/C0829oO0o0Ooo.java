package com.ninja.engine;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSpinner;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputEditText;
import com.ninja.engine.encryption.EncryptorInstance;
/* renamed from: com.ninja.engine.oO0o0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0829oO0o0Ooo extends AbstractComponentCallbacksC0593o0oOoOo0 {
    public boolean OoooOO0 = false;
    public String o000oOoO = null;

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
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
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) inflate.findViewById(R.id.spinner_language);
        final TextInputEditText textInputEditText = (TextInputEditText) inflate.findViewById(R.id.username_activation);
        final TextInputEditText textInputEditText2 = (TextInputEditText) inflate.findViewById(R.id.password_activation);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.ic_paste);
        final TextView textView = (TextView) inflate.findViewById(R.id.paste_text);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.paste_container);
        Button button = (Button) inflate.findViewById(R.id.login);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.btn_find_reseller);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.ic_telegram);
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.ic_web);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(Oooo000(), R.array.languages, R.layout.spinner_item_white);
        createFromResource.setDropDownViewResource(R.layout.spinner_dropdown_item_white);
        appCompatSpinner.setAdapter((SpinnerAdapter) createFromResource);
        String OooOoo0 = AbstractC0692o0ooooOo.OooOoo0(Oooo000());
        char c = 65535;
        switch (OooOoo0.hashCode()) {
            case -1883983667:
                if (OooOoo0.equals("Chinese")) {
                    c = 0;
                    break;
                }
                break;
            case -1074763917:
                if (OooOoo0.equals("Russian")) {
                    c = 1;
                    break;
                }
                break;
            case 69730482:
                if (OooOoo0.equals("Hindi")) {
                    c = 2;
                    break;
                }
                break;
            case 699082148:
                if (OooOoo0.equals("Turkish")) {
                    c = 3;
                    break;
                }
                break;
            case 1301275074:
                if (OooOoo0.equals("Kurdish")) {
                    c = 4;
                    break;
                }
                break;
            case 1969163468:
                if (OooOoo0.equals("Arabic")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 3;
                appCompatSpinner.setSelection(i);
                break;
            case 1:
                i = 4;
                appCompatSpinner.setSelection(i);
                break;
            case 2:
                appCompatSpinner.setSelection(5);
                break;
            case 3:
                appCompatSpinner.setSelection(2);
                break;
            case 4:
                i = 6;
                appCompatSpinner.setSelection(i);
                break;
            case 5:
                appCompatSpinner.setSelection(1);
                break;
            default:
                appCompatSpinner.setSelection(0);
                break;
        }
        if (MainActivity.OooO00o.getString("username-activation", null) != null && MainActivity.OooO00o.getString("password-activation", null) != null) {
            textInputEditText.setText(MainActivity.OooO00o.getString("username-activation", null));
            textInputEditText2.setText(MainActivity.OooO00o.getString("password-activation", null));
            this.OoooOO0 = true;
            imageView.setImageResource(R.drawable.ic_clear_field);
            textView.setText(R.string.clear_fields);
        }
        appCompatSpinner.setOnTouchListener(new View$OnTouchListenerC0816oO0o000O(this, appCompatSpinner, 0));
        C0825oO0o0OOO c0825oO0o0OOO = new C0825oO0o0OOO(imageView, textView, textInputEditText, textInputEditText2, this);
        textInputEditText.addTextChangedListener(c0825oO0o0OOO);
        textInputEditText2.addTextChangedListener(c0825oO0o0OOO);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.oO0o0O0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                C0829oO0o0Ooo c0829oO0o0Ooo = this;
                boolean z = c0829oO0o0Ooo.OoooOO0;
                ImageView imageView4 = imageView;
                TextView textView2 = textView;
                TextInputEditText textInputEditText3 = textInputEditText;
                TextInputEditText textInputEditText4 = textInputEditText2;
                if (!z) {
                    ClipData primaryClip = ((ClipboardManager) c0829oO0o0Ooo.Oooo000().getSystemService("clipboard")).getPrimaryClip();
                    if (primaryClip != null) {
                        String[] split = primaryClip.getItemAt(0).getText().toString().split(":");
                        if (split.length == 2) {
                            c0829oO0o0Ooo.OoooOO0 = true;
                            imageView4.setImageResource(R.drawable.ic_clear_field);
                            textView2.setText(R.string.clear_fields);
                            textInputEditText3.setText(split[0]);
                            str2 = split[1];
                        }
                    }
                    Toast.makeText(c0829oO0o0Ooo.Oooo000(), c0829oO0o0Ooo.OooOOO0(R.string.clipboard_empty), 0).show();
                    return;
                }
                c0829oO0o0Ooo.OoooOO0 = false;
                imageView4.setImageResource(R.drawable.ic_content_paste);
                textView2.setText(R.string.paste_clipboard);
                str2 = "";
                textInputEditText3.setText("");
                textInputEditText4.setText(str2);
            }
        });
        button.setOnClickListener(new View$OnClickListenerC1111oOOoo000(this, textInputEditText, textInputEditText2, 2));
        linearLayout2.setOnClickListener(new View$OnClickListenerC0817oO0o000o(this, 1));
        String generateTokenKey = MainActivity.generateTokenKey();
        RequestQueue newRequestQueue = Volley.newRequestQueue(Oooo000());
        newRequestQueue.add(new C0827oO0o0Oo(EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3)) + "/upload/social-info.php", new C0818oO0o0O(this, generateTokenKey, imageView2, imageView3, 0), new C0435o0OoO000(3, this), generateTokenKey));
        return inflate;
    }

    public final void Oooo0o() {
        C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(Oooo000());
        LayoutInflater layoutInflater = this.Oooo0O0;
        if (layoutInflater == null) {
            layoutInflater = OooOoO0(null);
            this.Oooo0O0 = layoutInflater;
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_join_telegram, (ViewGroup) null);
        ((C0069o0000o0) c0073o0000oO0.OooO0O0).OooO = inflate;
        DialogInterfaceC0074o0000oOO OooO00o = c0073o0000oO0.OooO00o();
        if (OooO00o.getWindow() != null) {
            OooO00o.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        OooO00o.setCancelable(false);
        OooO00o.setCanceledOnTouchOutside(false);
        ((Button) inflate.findViewById(R.id.btn_join_channel)).setOnClickListener(new View$OnClickListenerC0820oO0o0O00(this, OooO00o, 1));
        OooO00o.show();
    }
}
