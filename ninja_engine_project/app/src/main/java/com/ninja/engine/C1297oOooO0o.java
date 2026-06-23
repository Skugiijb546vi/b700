package com.ninja.engine;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
/* renamed from: com.ninja.engine.oOooO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297oOooO0o extends AbstractC1091oOOoOOOO {
    public final /* synthetic */ Context OooO0OO;
    public final /* synthetic */ TextPaint OooO0Oo;
    public final /* synthetic */ C1299oOooO0oO OooO0o;
    public final /* synthetic */ AbstractC1091oOOoOOOO OooO0o0;

    public C1297oOooO0o(C1299oOooO0oO c1299oOooO0oO, Context context, TextPaint textPaint, AbstractC1091oOOoOOOO abstractC1091oOOoOOOO) {
        this.OooO0o = c1299oOooO0oO;
        this.OooO0OO = context;
        this.OooO0Oo = textPaint;
        this.OooO0o0 = abstractC1091oOOoOOOO;
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void OooOoO(int i) {
        this.OooO0o0.OooOoO(i);
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void OooOoOO(Typeface typeface, boolean z) {
        this.OooO0o.OooO0oO(this.OooO0OO, this.OooO0Oo, typeface);
        this.OooO0o0.OooOoOO(typeface, z);
    }
}
