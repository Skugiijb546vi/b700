package com.ninja.engine;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* renamed from: com.ninja.engine.oo00O0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1393oo00O0oO implements Spannable {
    public boolean OooO00o = false;
    public Spannable OooO0O0;

    public C1393oo00O0oO(Spannable spannable) {
        this.OooO0O0 = spannable;
    }

    public final void OooO00o() {
        C0919oOO00oOo c0919oOO00oOo;
        Spannable spannable = this.OooO0O0;
        if (!this.OooO00o) {
            if (Build.VERSION.SDK_INT < 28) {
                c0919oOO00oOo = new C0919oOO00oOo(18);
            } else {
                c0919oOO00oOo = new C0919oOO00oOo(18);
            }
            if (c0919oOO00oOo.OooOO0(spannable)) {
                this.OooO0O0 = new SpannableString(spannable);
            }
        }
        this.OooO00o = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.OooO0O0.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.OooO0O0.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.OooO0O0.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.OooO0O0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.OooO0O0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.OooO0O0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.OooO0O0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.OooO0O0.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.OooO0O0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o();
        this.OooO0O0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        OooO00o();
        this.OooO0O0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.OooO0O0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.OooO0O0.toString();
    }
}


