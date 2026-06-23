package com.ninja.engine;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o00O0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0127o00O0Oo {
    public static StaticLayout OooO00o(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, C0133o00O0o00 c0133o00O0o00) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            c0133o00O0o00.OooO00o(obtain, textView);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }
}
