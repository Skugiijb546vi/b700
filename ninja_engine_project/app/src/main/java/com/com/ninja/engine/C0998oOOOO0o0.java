package com.ninja.engine;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOOOO0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998oOOOO0o0 {
    public final TextPaint OooO00o;
    public final TextDirectionHeuristic OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;

    public C0998oOOOO0o0(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.OooO00o = textPaint;
        textDirection = params.getTextDirection();
        this.OooO0O0 = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.OooO0OO = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.OooO0Oo = hyphenationFrequency;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r7.OooO0Oo != r8.OooO0Oo) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r1 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r3.getTypeface() != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r5.getTypeface() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.ninja.engine.C0998oOOOO0o0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.ninja.engine.oOOOO0o0 r8 = (com.ninja.engine.C0998oOOOO0o0) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L22
            int r3 = r8.OooO0OO
            int r4 = r7.OooO0OO
            if (r4 == r3) goto L1b
        L18:
            r1 = 0
            goto Lb7
        L1b:
            int r3 = r7.OooO0Oo
            int r4 = r8.OooO0Oo
            if (r3 == r4) goto L22
            goto L18
        L22:
            android.text.TextPaint r3 = r7.OooO00o
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.OooO00o
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L33
            goto L18
        L33:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.OooO00o
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            goto L18
        L42:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4f
            goto L18
        L4f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L5c
            goto L18
        L5c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L6b
            goto L18
        L6b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L76
            goto L18
        L76:
            r4 = 24
            if (r1 < r4) goto L89
            android.os.LocaleList r1 = com.ninja.engine.AbstractC0031Oooo00O.OooO0Oo(r3)
            android.os.LocaleList r4 = com.ninja.engine.AbstractC0031Oooo00O.OooO0Oo(r5)
            boolean r1 = com.ninja.engine.AbstractC0031Oooo00O.OooOoo0(r4, r1)
            if (r1 != 0) goto L98
            goto L18
        L89:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L98
            goto L18
        L98:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La6
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb6
            goto L18
        La6:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb6
            goto L18
        Lb6:
            r1 = 1
        Lb7:
            if (r1 != 0) goto Lba
            return r2
        Lba:
            android.text.TextDirectionHeuristic r1 = r7.OooO0O0
            android.text.TextDirectionHeuristic r8 = r8.OooO0O0
            if (r1 != r8) goto Lc1
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0998oOOOO0o0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.OooO0O0;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.OooO0Oo;
        int i3 = this.OooO0OO;
        TextPaint textPaint = this.OooO00o;
        if (i >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb;
        Object textLocale;
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.OooO00o;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb = new StringBuilder(", textLocale=");
            textLocale = textPaint.getTextLocales();
        } else {
            sb = new StringBuilder(", textLocale=");
            textLocale = textPaint.getTextLocale();
        }
        sb.append(textLocale);
        sb2.append(sb.toString());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.OooO0O0);
        sb2.append(", breakStrategy=" + this.OooO0OO);
        sb2.append(", hyphenationFrequency=" + this.OooO0Oo);
        sb2.append("}");
        return sb2.toString();
    }

    public C0998oOOOO0o0(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = AbstractC0984oOOO0o0O.OooO0oO(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.OooO00o = textPaint;
        this.OooO0O0 = textDirectionHeuristic;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
    }
}
