package com.ninja.engine;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.o0oOOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0566o0oOOOoo extends AbstractC0468o0Ooo000 {
    public final WeakReference OooO00o;
    public final WeakReference OooO0O0;

    public C0566o0oOOOoo(TextView textView, C0485o0OoooO0 c0485o0OoooO0) {
        this.OooO00o = new WeakReference(textView);
        this.OooO0O0 = new WeakReference(c0485o0OoooO0);
    }

    @Override // com.ninja.engine.AbstractC0468o0Ooo000
    public final void OooO00o() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.OooO00o.get();
        InputFilter inputFilter = (InputFilter) this.OooO0O0.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
                        if (text == null) {
                            length = 0;
                        } else {
                            OooO00o.getClass();
                            length = text.length();
                        }
                        CharSequence OooO0o = OooO00o.OooO0o(text, 0, length);
                        if (text == OooO0o) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(OooO0o);
                        int selectionEnd = Selection.getSelectionEnd(OooO0o);
                        textView.setText(OooO0o);
                        if (OooO0o instanceof Spannable) {
                            Spannable spannable = (Spannable) OooO0o;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
