package com.ninja.engine;

import android.text.Editable;
/* renamed from: com.ninja.engine.o0o0o00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559o0o0o00O extends AbstractC1310oOooOOo {
    public final /* synthetic */ C0495o0o000O0 OooO00o;

    public C0559o0o0o00O(C0495o0o000O0 c0495o0o000O0) {
        this.OooO00o = c0495o0o000O0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.OooO00o.OooO0O0().OooO00o();
    }

    @Override // com.ninja.engine.AbstractC1310oOooOOo, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.OooO00o.OooO0O0().OooO0O0();
    }
}


