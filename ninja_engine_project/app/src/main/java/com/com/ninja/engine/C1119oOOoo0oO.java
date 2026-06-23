package com.ninja.engine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.ninja.engine.encryption.EncryptorInstance;
/* renamed from: com.ninja.engine.oOOoo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1119oOOoo0oO extends AbstractComponentCallbacksC0593o0oOoOo0 {
    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_resellers, viewGroup, false);
        CardView cardView = (CardView) inflate.findViewById(R.id.card_telegram);
        CardView cardView2 = (CardView) inflate.findViewById(R.id.card_support);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_resellers);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_loading);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_empty);
        Oooo000();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        String str = EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3));
        String generateTokenKey = MainActivity.generateTokenKey();
        RequestQueue newRequestQueue = Volley.newRequestQueue(Oooo000());
        newRequestQueue.add(new C1117oOOoo0Oo(AbstractC1230oOoOo0o.OooO0oO(str, "/upload/social-info.php"), new C0818oO0o0O(this, generateTokenKey, cardView, cardView2, 1), new C0386o0OOoO(1), generateTokenKey));
        String generateTokenKey2 = MainActivity.generateTokenKey();
        newRequestQueue.add(new C1118oOOoo0o(AbstractC1230oOoOo0o.OooO0oO(str, "/upload/reseller-list.php"), new C0823oO0o0OO(this, generateTokenKey2, str, textView, textView2, recyclerView, 1), new C1825ooOOoOoo(textView, textView2, 1), generateTokenKey2));
        return inflate;
    }
}
