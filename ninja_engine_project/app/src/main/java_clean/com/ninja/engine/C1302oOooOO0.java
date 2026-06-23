package com.ninja.engine;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOooOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302oOooOO0 implements TextWatcher {
    public int OooO00o;
    public final /* synthetic */ EditText OooO0O0;
    public final /* synthetic */ TextInputLayout OooO0OO;

    public C1302oOooOO0(TextInputLayout textInputLayout, EditText editText) {
        this.OooO0OO = textInputLayout;
        this.OooO0O0 = editText;
        this.OooO00o = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.OooO0OO;
        textInputLayout.OooOo0(!textInputLayout.o0OOO0o, false);
        if (textInputLayout.OooOO0O) {
            textInputLayout.OooOOO(editable);
        }
        if (textInputLayout.OooOOoo) {
            textInputLayout.OooOo0O(editable);
        }
        EditText editText = this.OooO0O0;
        int lineCount = editText.getLineCount();
        int i = this.OooO00o;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.o00ooo;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.OooO00o = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}


