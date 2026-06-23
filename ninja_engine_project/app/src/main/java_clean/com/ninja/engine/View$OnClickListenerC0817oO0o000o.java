package com.ninja.engine;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.toolbox.Volley;
import com.ninja.engine.encryption.EncryptorInstance;
/* renamed from: com.ninja.engine.oO0o000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnClickListenerC0817oO0o000o implements View.OnClickListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0829oO0o0Ooo OooO0O0;

    public /* synthetic */ View$OnClickListenerC0817oO0o000o(C0829oO0o0Ooo c0829oO0o0Ooo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0829oO0o0Ooo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.OooO00o) {
            case 0:
                C0829oO0o0Ooo c0829oO0o0Ooo = this.OooO0O0;
                if (c0829oO0o0Ooo.o000oOoO != null) {
                    c0829oO0o0Ooo.Oooo0o0(new Intent("android.intent.action.VIEW", Uri.parse(c0829oO0o0Ooo.o000oOoO)));
                    return;
                }
                return;
            default:
                C0829oO0o0Ooo c0829oO0o0Ooo2 = this.OooO0O0;
                C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(c0829oO0o0Ooo2.Oooo000());
                LayoutInflater layoutInflater = c0829oO0o0Ooo2.Oooo0O0;
                if (layoutInflater == null) {
                    layoutInflater = c0829oO0o0Ooo2.OooOoO0(null);
                    c0829oO0o0Ooo2.Oooo0O0 = layoutInflater;
                }
                View inflate = layoutInflater.inflate(R.layout.dialog_resellers, (ViewGroup) null);
                ((C0069o0000o0) c0073o0000oO0.OooO0O0).OooO = inflate;
                DialogInterfaceC0074o0000oOO OooO00o = c0073o0000oO0.OooO00o();
                if (OooO00o.getWindow() != null) {
                    OooO00o.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                }
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_resellers);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_loading);
                TextView textView2 = (TextView) inflate.findViewById(R.id.tv_empty);
                c0829oO0o0Ooo2.Oooo000();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                ((Button) inflate.findViewById(R.id.btn_close_dialog)).setOnClickListener(new View$OnClickListenerC0056OoooooO(5, OooO00o));
                String str = EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3));
                String generateTokenKey = MainActivity.generateTokenKey();
                Volley.newRequestQueue(c0829oO0o0Ooo2.Oooo000()).add(new C0828oO0o0OoO(AbstractC1230oOoOo0o.OooO0oO(str, "/upload/reseller-list.php"), new C0823oO0o0OO(c0829oO0o0Ooo2, generateTokenKey, str, textView, textView2, recyclerView, 0), new C1825ooOOoOoo(textView, textView2, 0), generateTokenKey));
                OooO00o.show();
                if (OooO00o.getWindow() != null) {
                    OooO00o.getWindow().setLayout((int) (c0829oO0o0Ooo2.OooOO0o().getDisplayMetrics().widthPixels * 0.85d), (int) (c0829oO0o0Ooo2.OooOO0o().getDisplayMetrics().heightPixels * 0.7d));
                    return;
                }
                return;
        }
    }
}


