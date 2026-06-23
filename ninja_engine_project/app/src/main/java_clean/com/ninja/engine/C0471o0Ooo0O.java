package com.ninja.engine;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o0Ooo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471o0Ooo0O extends InputConnectionWrapper {
    public final TextView OooO00o;
    public final C0601o0oOooO0 OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471o0Ooo0O(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i;
        C0601o0oOooO0 c0601o0oOooO0 = new C0601o0oOooO0(2);
        this.OooO00o = editText;
        this.OooO0O0 = c0601o0oOooO0;
        if (C0469o0Ooo00O.OooOO0O != null) {
            C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
            if (OooO00o.OooO0O0() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                C0463o0OoOoo0 c0463o0OoOoo0 = OooO00o.OooO0o0;
                c0463o0OoOoo0.getClass();
                Bundle bundle = editorInfo.extras;
                oOO0000O ooo0000o = (oOO0000O) c0463o0OoOoo0.OooO0OO.OooO00o;
                int OooO00o2 = ooo0000o.OooO00o(4);
                if (OooO00o2 != 0) {
                    i = ((ByteBuffer) ooo0000o.OooO0Oo).getInt(OooO00o2 + ooo0000o.OooO00o);
                } else {
                    i = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
                Bundle bundle2 = editorInfo.extras;
                c0463o0OoOoo0.OooO00o.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.OooO00o.getEditableText();
        this.OooO0O0.getClass();
        if (!C0601o0oOooO0.OooO0o(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.OooO00o.getEditableText();
        this.OooO0O0.getClass();
        if (C0601o0oOooO0.OooO0o(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}


