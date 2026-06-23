package com.ninja.engine;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o0OoooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485o0OoooO0 implements InputFilter {
    public final TextView OooO00o;
    public C0566o0oOOOoo OooO0O0;

    public C0485o0OoooO0(TextView textView) {
        this.OooO00o = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.OooO00o;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int OooO0O0 = C0469o0Ooo00O.OooO00o().OooO0O0();
        if (OooO0O0 != 0) {
            if (OooO0O0 != 1) {
                if (OooO0O0 != 3) {
                    return charSequence;
                }
            } else if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0469o0Ooo00O.OooO00o().OooO0o(charSequence, 0, charSequence.length());
            } else {
                return charSequence;
            }
        }
        C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C0566o0oOOOoo(textView, this);
        }
        OooO00o.OooO0oO(this.OooO0O0);
        return charSequence;
    }
}


