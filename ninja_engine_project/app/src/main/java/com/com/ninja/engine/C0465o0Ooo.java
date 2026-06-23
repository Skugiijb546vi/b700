package com.ninja.engine;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
/* renamed from: com.ninja.engine.o0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0465o0Ooo implements TextWatcher {
    public final EditText OooO00o;
    public C0477o0Ooo0oo OooO0OO;
    public final boolean OooO0O0 = false;
    public boolean OooO0Oo = true;

    public C0465o0Ooo(EditText editText) {
        this.OooO00o = editText;
    }

    public static void OooO00o(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
            if (editableText == null) {
                length = 0;
            } else {
                OooO00o.getClass();
                length = editableText.length();
            }
            OooO00o.OooO0o(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.OooO00o;
        if (!editText.isInEditMode() && this.OooO0Oo) {
            if ((this.OooO0O0 || C0469o0Ooo00O.OooOO0O != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
                int OooO0O0 = C0469o0Ooo00O.OooO00o().OooO0O0();
                if (OooO0O0 != 0) {
                    if (OooO0O0 != 1) {
                        if (OooO0O0 != 3) {
                            return;
                        }
                    } else {
                        C0469o0Ooo00O.OooO00o().OooO0o((Spannable) charSequence, i, i3 + i);
                        return;
                    }
                }
                C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
                if (this.OooO0OO == null) {
                    this.OooO0OO = new C0477o0Ooo0oo(editText);
                }
                OooO00o.OooO0oO(this.OooO0OO);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
