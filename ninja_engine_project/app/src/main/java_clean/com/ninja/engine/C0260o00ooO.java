package com.ninja.engine;

import android.graphics.Typeface;
/* renamed from: com.ninja.engine.o00ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0260o00ooO extends AbstractC1091oOOoOOOO {
    public final Typeface OooO0OO;
    public final C0331o0O0oo OooO0Oo;
    public boolean OooO0o0;

    public C0260o00ooO(C0331o0O0oo c0331o0O0oo, Typeface typeface) {
        this.OooO0OO = typeface;
        this.OooO0Oo = c0331o0O0oo;
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void OooOoO(int i) {
        if (!this.OooO0o0) {
            o0O0O0O o0o0o0o = (o0O0O0O) this.OooO0Oo.OooO0O0;
            if (o0o0o0o.OooOO0(this.OooO0OO)) {
                o0o0o0o.OooO0oo(false);
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void OooOoOO(Typeface typeface, boolean z) {
        if (!this.OooO0o0) {
            o0O0O0O o0o0o0o = (o0O0O0O) this.OooO0Oo.OooO0O0;
            if (o0o0o0o.OooOO0(typeface)) {
                o0o0o0o.OooO0oo(false);
            }
        }
    }
}


