package com.ninja.engine;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Objects;
/* renamed from: com.ninja.engine.oO0o0OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825oO0o0OOO implements TextWatcher {
    public final /* synthetic */ TextInputEditText OooO00o;
    public final /* synthetic */ TextInputEditText OooO0O0;
    public final /* synthetic */ ImageView OooO0OO;
    public final /* synthetic */ TextView OooO0Oo;
    public final /* synthetic */ C0829oO0o0Ooo OooO0o0;

    public C0825oO0o0OOO(ImageView imageView, TextView textView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, C0829oO0o0Ooo c0829oO0o0Ooo) {
        this.OooO0o0 = c0829oO0o0Ooo;
        this.OooO00o = textInputEditText;
        this.OooO0O0 = textInputEditText2;
        this.OooO0OO = imageView;
        this.OooO0Oo = textView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        Editable text = this.OooO00o.getText();
        Objects.requireNonNull(text);
        boolean isEmpty = text.toString().isEmpty();
        TextView textView = this.OooO0Oo;
        ImageView imageView = this.OooO0OO;
        C0829oO0o0Ooo c0829oO0o0Ooo = this.OooO0o0;
        if (isEmpty) {
            Editable text2 = this.OooO0O0.getText();
            Objects.requireNonNull(text2);
            if (text2.toString().isEmpty()) {
                c0829oO0o0Ooo.OoooOO0 = false;
                imageView.setImageResource(R.drawable.ic_content_paste);
                i4 = R.string.paste_clipboard;
                textView.setText(i4);
            }
        }
        c0829oO0o0Ooo.OoooOO0 = true;
        imageView.setImageResource(R.drawable.ic_clear_field);
        i4 = R.string.clear_fields;
        textView.setText(i4);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
