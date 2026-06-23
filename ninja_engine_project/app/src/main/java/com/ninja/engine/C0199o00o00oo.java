package com.ninja.engine;
/* renamed from: com.ninja.engine.o00o00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199o00o00oo {
    public static final byte[] OooO0o0 = new byte[1792];
    public final CharSequence OooO00o;
    public final int OooO0O0;
    public int OooO0OO;
    public char OooO0Oo;

    static {
        for (int i = 0; i < 1792; i++) {
            OooO0o0[i] = Character.getDirectionality(i);
        }
    }

    public C0199o00o00oo(CharSequence charSequence) {
        this.OooO00o = charSequence;
        this.OooO0O0 = charSequence.length();
    }

    public final byte OooO00o() {
        CharSequence charSequence = this.OooO00o;
        char charAt = charSequence.charAt(this.OooO0OO - 1);
        this.OooO0Oo = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.OooO0OO);
            this.OooO0OO -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.OooO0OO--;
        char c = this.OooO0Oo;
        if (c < 1792) {
            return OooO0o0[c];
        }
        return Character.getDirectionality(c);
    }
}
