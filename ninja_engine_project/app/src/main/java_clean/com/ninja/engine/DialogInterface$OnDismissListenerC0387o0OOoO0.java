package com.ninja.engine;

import android.app.Dialog;
import android.content.DialogInterface;
/* renamed from: com.ninja.engine.o0OOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnDismissListenerC0387o0OOoO0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface$OnCancelListenerC0390o0OOoO0o OooO00o;

    public DialogInterface$OnDismissListenerC0387o0OOoO0(DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o) {
        this.OooO00o = dialogInterface$OnCancelListenerC0390o0OOoO0o;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o = this.OooO00o;
        Dialog dialog = dialogInterface$OnCancelListenerC0390o0OOoO0o.OooooOo;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC0390o0OOoO0o.onDismiss(dialog);
        }
    }
}


