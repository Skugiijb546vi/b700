package com.ninja.engine;
/* renamed from: com.ninja.engine.o0ooooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693o0ooooo implements Appendable {
    public final Appendable OooO00o;
    public boolean OooO0O0 = true;

    public C0693o0ooooo(Appendable appendable) {
        this.OooO00o = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        boolean z = this.OooO0O0;
        Appendable appendable = this.OooO00o;
        if (z) {
            this.OooO0O0 = false;
            appendable.append("  ");
        }
        this.OooO0O0 = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.OooO0O0;
        Appendable appendable = this.OooO00o;
        boolean z2 = false;
        if (z) {
            this.OooO0O0 = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.OooO0O0 = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}


