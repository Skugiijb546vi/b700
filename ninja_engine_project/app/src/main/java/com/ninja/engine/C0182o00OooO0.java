package com.ninja.engine;

import android.util.AttributeSet;
/* renamed from: com.ninja.engine.o00OooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182o00OooO0 extends AbstractC0308o0O0Ooo0 {
    public int OooO;
    public int OooO0oo;
    public C0181o00OooO OooOO0;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.ninja.engine.oO000o0o, com.ninja.engine.o00OooO] */
    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0
    public final void OooO0oO(AttributeSet attributeSet) {
        AbstractC0705oO000o0o abstractC0705oO000o0o = new AbstractC0705oO000o0o();
        abstractC0705oO000o0o.o00oO0o = 0;
        abstractC0705oO000o0o.o00oO0O = true;
        abstractC0705oO000o0o.o0ooOO0 = 0;
        abstractC0705oO000o0o.o0ooOOo = false;
        this.OooOO0 = abstractC0705oO000o0o;
        this.OooO0Oo = abstractC0705oO000o0o;
        OooO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r0 == 6) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r0 == 6) goto L12;
     */
    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oo(com.ninja.engine.C0316o0O0o0o r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.OooO0oo
            r5.OooO = r0
            r1 = 0
            r2 = 6
            r3 = 1
            r4 = 5
            if (r7 == 0) goto L14
            if (r0 != r4) goto Lf
        Lc:
            r5.OooO = r3
            goto L1a
        Lf:
            if (r0 != r2) goto L1a
        L11:
            r5.OooO = r1
            goto L1a
        L14:
            if (r0 != r4) goto L17
            goto L11
        L17:
            if (r0 != r2) goto L1a
            goto Lc
        L1a:
            boolean r7 = r6 instanceof com.ninja.engine.C0181o00OooO
            if (r7 == 0) goto L24
            com.ninja.engine.o00OooO r6 = (com.ninja.engine.C0181o00OooO) r6
            int r7 = r5.OooO
            r6.o00oO0o = r7
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0182o00OooO0.OooO0oo(com.ninja.engine.o0O0o0o, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.OooOO0.o00oO0O;
    }

    public int getMargin() {
        return this.OooOO0.o0ooOO0;
    }

    public int getType() {
        return this.OooO0oo;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.OooOO0.o00oO0O = z;
    }

    public void setDpMargin(int i) {
        this.OooOO0.o0ooOO0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.OooOO0.o0ooOO0 = i;
    }

    public void setType(int i) {
        this.OooO0oo = i;
    }
}

