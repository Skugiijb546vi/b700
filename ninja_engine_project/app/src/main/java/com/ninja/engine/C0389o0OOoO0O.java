package com.ninja.engine;

import android.app.Dialog;
import android.view.View;
/* renamed from: com.ninja.engine.o0OOoO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389o0OOoO0O extends AbstractC0692o0ooooOo {
    public final /* synthetic */ AbstractC0692o0ooooOo Oooo000;
    public final /* synthetic */ DialogInterface$OnCancelListenerC0390o0OOoO0o Oooo00O;

    public C0389o0OOoO0O(DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o, C0574o0oOo c0574o0oOo) {
        this.Oooo00O = dialogInterface$OnCancelListenerC0390o0OOoO0o;
        this.Oooo000 = c0574o0oOo;
    }

    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final View Oooo0o(int i) {
        AbstractC0692o0ooooOo abstractC0692o0ooooOo = this.Oooo000;
        if (abstractC0692o0ooooOo.Oooo0oO()) {
            return abstractC0692o0ooooOo.Oooo0o(i);
        }
        Dialog dialog = this.Oooo00O.OooooOo;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final boolean Oooo0oO() {
        if (!this.Oooo000.Oooo0oO() && !this.Oooo00O.OoooooO) {
            return false;
        }
        return true;
    }
}
