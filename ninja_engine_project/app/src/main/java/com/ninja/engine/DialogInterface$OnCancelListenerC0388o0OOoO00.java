package com.ninja.engine;

import android.app.Dialog;
import android.content.DialogInterface;
/* renamed from: com.ninja.engine.o0OOoO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterface$OnCancelListenerC0388o0OOoO00 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogInterface$OnCancelListenerC0390o0OOoO0o OooO00o;

    public DialogInterface$OnCancelListenerC0388o0OOoO00(DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o) {
        this.OooO00o = dialogInterface$OnCancelListenerC0390o0OOoO0o;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o = this.OooO00o;
        Dialog dialog = dialogInterface$OnCancelListenerC0390o0OOoO0o.OooooOo;
        if (dialog != null) {
            dialogInterface$OnCancelListenerC0390o0OOoO0o.onCancel(dialog);
        }
    }
}
