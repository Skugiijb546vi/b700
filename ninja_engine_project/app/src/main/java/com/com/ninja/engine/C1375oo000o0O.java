package com.ninja.engine;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.oo000o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375oo000o0O extends ReplacementSpan {
    public final C1373oo000o0 OooO0O0;
    public TextPaint OooO0o0;
    public final Paint.FontMetricsInt OooO00o = new Paint.FontMetricsInt();
    public short OooO0OO = -1;
    public float OooO0Oo = 1.0f;

    public C1375oo000o0O(C1373oo000o0 c1373oo000o0) {
        AbstractC0809oO0OooOO.OooOOO(c1373oo000o0, "rasterizer cannot be null");
        this.OooO0O0 = c1373oo000o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        if ((r2 instanceof android.text.TextPaint) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        r4 = (android.text.TextPaint) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if ((r2 instanceof android.text.TextPaint) != false) goto L29;
     */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r14, java.lang.CharSequence r15, int r16, int r17, float r18, int r19, int r20, int r21, android.graphics.Paint r22) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r22
            boolean r3 = r1 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L46
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.CharacterStyle> r3 = android.text.style.CharacterStyle.class
            r5 = r16
            r6 = r17
            java.lang.Object[] r1 = r1.getSpans(r5, r6, r3)
            android.text.style.CharacterStyle[] r1 = (android.text.style.CharacterStyle[]) r1
            int r3 = r1.length
            if (r3 == 0) goto L3e
            int r3 = r1.length
            r5 = 1
            r6 = 0
            if (r3 != r5) goto L24
            r3 = r1[r6]
            if (r3 != r0) goto L24
            goto L3e
        L24:
            android.text.TextPaint r3 = r0.OooO0o0
            if (r3 != 0) goto L2f
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>()
            r0.OooO0o0 = r3
        L2f:
            r4 = r3
            r4.set(r2)
        L33:
            int r3 = r1.length
            if (r6 >= r3) goto L4b
            r3 = r1[r6]
            r3.updateDrawState(r4)
            int r6 = r6 + 1
            goto L33
        L3e:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L4b
        L42:
            r4 = r2
            android.text.TextPaint r4 = (android.text.TextPaint) r4
            goto L4b
        L46:
            boolean r1 = r2 instanceof android.text.TextPaint
            if (r1 == 0) goto L4b
            goto L42
        L4b:
            if (r4 == 0) goto L7b
            int r1 = r4.bgColor
            if (r1 == 0) goto L7b
            short r1 = r0.OooO0OO
            float r1 = (float) r1
            float r8 = r18 + r1
            r1 = r19
            float r7 = (float) r1
            r1 = r21
            float r9 = (float) r1
            int r1 = r4.getColor()
            android.graphics.Paint$Style r3 = r4.getStyle()
            int r5 = r4.bgColor
            r4.setColor(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            r5 = r14
            r6 = r18
            r10 = r4
            r5.drawRect(r6, r7, r8, r9, r10)
            r4.setStyle(r3)
            r4.setColor(r1)
        L7b:
            com.ninja.engine.o0Ooo00O r1 = com.ninja.engine.C0469o0Ooo00O.OooO00o()
            r1.getClass()
            r1 = r20
            float r10 = (float) r1
            if (r4 == 0) goto L88
            r2 = r4
        L88:
            com.ninja.engine.oo000o0 r1 = r0.OooO0O0
            com.ninja.engine.oOO00OOO r3 = r1.OooO0O0
            java.lang.Object r4 = r3.OooO0Oo
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4
            android.graphics.Typeface r12 = r2.getTypeface()
            r2.setTypeface(r4)
            int r1 = r1.OooO00o
            int r7 = r1 * 2
            r8 = 2
            java.lang.Object r1 = r3.OooO0O0
            r6 = r1
            char[] r6 = (char[]) r6
            r5 = r14
            r9 = r18
            r11 = r2
            r5.drawText(r6, r7, r8, r9, r10, r11)
            r2.setTypeface(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1375oo000o0O.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.OooO00o;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C1373oo000o0 c1373oo000o0 = this.OooO0O0;
        oOO0000 OooO0OO = c1373oo000o0.OooO0OO();
        int OooO00o = OooO0OO.OooO00o(14);
        short s2 = 0;
        if (OooO00o != 0) {
            s = ((ByteBuffer) OooO0OO.OooO0Oo).getShort(OooO00o + OooO0OO.OooO00o);
        } else {
            s = 0;
        }
        this.OooO0Oo = abs / s;
        oOO0000 OooO0OO2 = c1373oo000o0.OooO0OO();
        int OooO00o2 = OooO0OO2.OooO00o(14);
        if (OooO00o2 != 0) {
            ((ByteBuffer) OooO0OO2.OooO0Oo).getShort(OooO00o2 + OooO0OO2.OooO00o);
        }
        oOO0000 OooO0OO3 = c1373oo000o0.OooO0OO();
        int OooO00o3 = OooO0OO3.OooO00o(12);
        if (OooO00o3 != 0) {
            s2 = ((ByteBuffer) OooO0OO3.OooO0Oo).getShort(OooO00o3 + OooO0OO3.OooO00o);
        }
        short s3 = (short) (s2 * this.OooO0Oo);
        this.OooO0OO = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
