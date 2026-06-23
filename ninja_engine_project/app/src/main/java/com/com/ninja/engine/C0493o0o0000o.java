package com.ninja.engine;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* renamed from: com.ninja.engine.o0o0000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493o0o0000o {
    public final /* synthetic */ C0495o0o000O0 OooO00o;

    public C0493o0o0000o(C0495o0o000O0 c0495o0o000O0) {
        this.OooO00o = c0495o0o000O0;
    }

    public final void OooO00o(TextInputLayout textInputLayout) {
        C0495o0o000O0 c0495o0o000O0 = this.OooO00o;
        if (c0495o0o000O0.OooOOoo == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0495o0o000O0.OooOOoo;
        C0559o0o0o00O c0559o0o0o00O = c0495o0o000O0.OooOo0O;
        if (editText != null) {
            editText.removeTextChangedListener(c0559o0o0o00O);
            if (c0495o0o000O0.OooOOoo.getOnFocusChangeListener() == c0495o0o000O0.OooO0O0().OooO0o0()) {
                c0495o0o000O0.OooOOoo.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0495o0o000O0.OooOOoo = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0559o0o0o00O);
        }
        c0495o0o000O0.OooO0O0().OooOOO0(c0495o0o000O0.OooOOoo);
        c0495o0o000O0.OooOO0(c0495o0o000O0.OooO0O0());
    }
}
