package com.ninja.engine;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
/* renamed from: com.ninja.engine.Oooooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055Oooooo0 extends AbstractC1083oOOoO0o {
    public final TextView OooOo;
    public final View OooOo0;
    public final View OooOo00;
    public final View OooOo0O;
    public final View OooOo0o;
    public final MaterialButton OooOoO;
    public final ImageView OooOoO0;
    public final MaterialButton OooOoOO;
    public final MaterialButton OooOoo;
    public final MaterialButton OooOoo0;
    public final MaterialButton OooOooO;
    public final /* synthetic */ C0054Oooooo OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055Oooooo0(C0054Oooooo c0054Oooooo, View view) {
        super(view);
        this.OooOooo = c0054Oooooo;
        CardView cardView = (CardView) view.findViewById(R.id.card_account);
        this.OooOo00 = view.findViewById(R.id.layout_card_content);
        this.OooOo0 = view.findViewById(R.id.layout_header);
        this.OooOo0O = view.findViewById(R.id.layout_expandable);
        this.OooOo0o = view.findViewById(R.id.view_active_bar);
        this.OooOo = (TextView) view.findViewById(R.id.tv_account_name);
        this.OooOoO0 = (ImageView) view.findViewById(R.id.btn_edit_name);
        this.OooOoO = (MaterialButton) view.findViewById(R.id.btn_use_account);
        this.OooOoOO = (MaterialButton) view.findViewById(R.id.btn_remove_account);
        this.OooOoo0 = (MaterialButton) view.findViewById(R.id.btn_google_login);
        this.OooOoo = (MaterialButton) view.findViewById(R.id.btn_facebook_login);
        this.OooOooO = (MaterialButton) view.findViewById(R.id.btn_guest_login);
    }

    public static void OooOo00(MaterialButton materialButton, Context context, boolean z) {
        if (z) {
            materialButton.setIcon(context.getDrawable(R.drawable.ic_check_circle_green));
            materialButton.setIconTint(null);
            return;
        }
        materialButton.setIcon(null);
    }
}


