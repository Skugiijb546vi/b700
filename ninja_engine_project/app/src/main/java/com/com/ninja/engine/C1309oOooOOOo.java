package com.ninja.engine;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.app.framework.utils.ShellUtils;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOooOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1309oOooOOOo {
    public static C0323o0O0oO0o OooO00o(View view, C0323o0O0oO0o c0323o0O0oO0o) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0323o0O0oO0o);
        }
        if (c0323o0O0oO0o.OooO00o.OooOo0O() == 2) {
            return c0323o0O0oO0o;
        }
        InterfaceC0322o0O0oO0O interfaceC0322o0O0oO0O = c0323o0O0oO0o.OooO00o;
        ClipData OooO0O0 = interfaceC0322o0O0oO0O.OooO0O0();
        int OooOOOo = interfaceC0322o0O0oO0O.OooOOOo();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < OooO0O0.getItemCount(); i++) {
            ClipData.Item itemAt = OooO0O0.getItemAt(i);
            if ((OooOOOo & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), ShellUtils.COMMAND_LINE_END);
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
