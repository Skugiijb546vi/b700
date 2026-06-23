package com.ninja.engine;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;
/* loaded from: classes.dex */
public final class oOO00O implements InterfaceC1419oo00o, DialogInterface.OnClickListener {
    public DialogInterfaceC0074o0000oOO OooO00o;
    public ListAdapter OooO0O0;
    public CharSequence OooO0OO;
    public final /* synthetic */ AppCompatSpinner OooO0Oo;

    public oOO00O(AppCompatSpinner appCompatSpinner) {
        this.OooO0Oo = appCompatSpinner;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final boolean OooO00o() {
        DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO = this.OooO00o;
        if (dialogInterfaceC0074o0000oOO != null) {
            return dialogInterfaceC0074o0000oOO.isShowing();
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final int OooO0O0() {
        return 0;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final Drawable OooO0OO() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooO0o0(CharSequence charSequence) {
        this.OooO0OO = charSequence;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooOO0O(int i, int i2) {
        if (this.OooO0O0 == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.OooO0Oo;
        C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.OooO0OO;
        C0069o0000o0 c0069o0000o0 = (C0069o0000o0) c0073o0000oO0.OooO0O0;
        if (charSequence != null) {
            c0069o0000o0.OooO0Oo = charSequence;
        }
        ListAdapter listAdapter = this.OooO0O0;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        c0069o0000o0.OooO0oO = listAdapter;
        c0069o0000o0.OooO0oo = this;
        c0069o0000o0.OooOO0O = selectedItemPosition;
        c0069o0000o0.OooOO0 = true;
        DialogInterfaceC0074o0000oOO OooO00o = c0073o0000oO0.OooO00o();
        this.OooO00o = OooO00o;
        AlertController$RecycleListView alertController$RecycleListView = OooO00o.OooO0o.OooO0o0;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.OooO00o.show();
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final int OooOO0o() {
        return 0;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooOOO(ListAdapter listAdapter) {
        this.OooO0O0 = listAdapter;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final CharSequence OooOOO0() {
        return this.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void dismiss() {
        DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO = this.OooO00o;
        if (dialogInterfaceC0074o0000oOO != null) {
            dialogInterfaceC0074o0000oOO.dismiss();
            this.OooO00o = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AppCompatSpinner appCompatSpinner = this.OooO0Oo;
        appCompatSpinner.setSelection(i);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i, this.OooO0O0.getItemId(i));
        }
        dismiss();
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooO(int i) {
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooO0o(Drawable drawable) {
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooO0oo(int i) {
    }

    @Override // com.ninja.engine.InterfaceC1419oo00o
    public final void OooOO0(int i) {
    }
}


