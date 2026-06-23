package com.ninja.engine;

import android.text.SpannableStringBuilder;
/* renamed from: com.ninja.engine.o00o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188o00o0 {
    public static final String OooO0Oo;
    public static final C0188o00o0 OooO0o;
    public static final String OooO0o0;
    public static final C0188o00o0 OooO0oO;
    public final boolean OooO00o;
    public final int OooO0O0;
    public final C0224o00oO000 OooO0OO;

    static {
        C0224o00oO000 c0224o00oO000 = AbstractC1300oOooO0oo.OooO0OO;
        OooO0Oo = Character.toString((char) 8206);
        OooO0o0 = Character.toString((char) 8207);
        OooO0o = new C0188o00o0(false, 2, c0224o00oO000);
        OooO0oO = new C0188o00o0(true, 2, c0224o00oO000);
    }

    public C0188o00o0(boolean z, int i, C0224o00oO000 c0224o00oO000) {
        this.OooO00o = z;
        this.OooO0O0 = i;
        this.OooO0OO = c0224o00oO000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r1 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (r2 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r0.OooO0OO <= 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
        switch(r0.OooO00o()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L57;
            case 17: goto L57;
            case 18: goto L53;
            default: goto L65;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO00o(java.lang.CharSequence r9) {
        /*
            com.ninja.engine.o00o00oo r0 = new com.ninja.engine.o00o00oo
            r0.<init>(r9)
            r9 = 0
            r0.OooO0OO = r9
            r1 = 0
            r2 = 0
            r3 = 0
        Lb:
            int r4 = r0.OooO0OO
            int r5 = r0.OooO0O0
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L70
            if (r1 != 0) goto L70
            java.lang.CharSequence r5 = r0.OooO00o
            char r4 = r5.charAt(r4)
            r0.OooO0Oo = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.OooO0OO
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.OooO0OO
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.OooO0OO = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.OooO0OO
            int r4 = r4 + r6
            r0.OooO0OO = r4
            char r4 = r0.OooO0Oo
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = com.ninja.engine.C0199o00o00oo.OooO0o0
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L6a
            if (r4 == r6) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6e
        L5a:
            int r3 = r3 + (-1)
            r2 = 0
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = 1
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = -1
            goto Lb
        L66:
            if (r3 != 0) goto L6e
        L68:
            r9 = 1
            goto L8f
        L6a:
            if (r3 != 0) goto L6e
        L6c:
            r9 = -1
            goto L8f
        L6e:
            r1 = r3
            goto Lb
        L70:
            if (r1 != 0) goto L73
            goto L8f
        L73:
            if (r2 == 0) goto L77
            r9 = r2
            goto L8f
        L77:
            int r2 = r0.OooO0OO
            if (r2 <= 0) goto L8f
            byte r2 = r0.OooO00o()
            switch(r2) {
                case 14: goto L8c;
                case 15: goto L8c;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r3 = r3 + 1
            goto L77
        L86:
            if (r1 != r3) goto L89
            goto L68
        L89:
            int r3 = r3 + (-1)
            goto L77
        L8c:
            if (r1 != r3) goto L89
            goto L6c
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0188o00o0.OooO00o(java.lang.CharSequence):int");
    }

    public static int OooO0O0(CharSequence charSequence) {
        C0199o00o00oo c0199o00o00oo = new C0199o00o00oo(charSequence);
        c0199o00o00oo.OooO0OO = c0199o00o00oo.OooO0O0;
        int i = 0;
        int i2 = 0;
        while (c0199o00o00oo.OooO0OO > 0) {
            byte OooO00o = c0199o00o00oo.OooO00o();
            if (OooO00o != 0) {
                if (OooO00o != 1 && OooO00o != 2) {
                    if (OooO00o != 9) {
                        switch (OooO00o) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    i2 = i;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return 1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder OooO0OO(CharSequence charSequence, C0224o00oO000 c0224o00oO000) {
        C0224o00oO000 c0224o00oO0002;
        char c;
        C0224o00oO000 c0224o00oO0003;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean OooO0O0 = c0224o00oO000.OooO0O0(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.OooO0O0 & 2;
        String str2 = "";
        String str3 = OooO0o0;
        String str4 = OooO0Oo;
        boolean z = this.OooO00o;
        if (i != 0) {
            if (OooO0O0) {
                c0224o00oO0003 = AbstractC1300oOooO0oo.OooO0O0;
            } else {
                c0224o00oO0003 = AbstractC1300oOooO0oo.OooO00o;
            }
            boolean OooO0O02 = c0224o00oO0003.OooO0O0(charSequence, charSequence.length());
            if (!z && (OooO0O02 || OooO00o(charSequence) == 1)) {
                str = str4;
            } else if (!z || (OooO0O02 && OooO00o(charSequence) != -1)) {
                str = "";
            } else {
                str = str3;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (OooO0O0 != z) {
            if (OooO0O0) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (OooO0O0) {
            c0224o00oO0002 = AbstractC1300oOooO0oo.OooO0O0;
        } else {
            c0224o00oO0002 = AbstractC1300oOooO0oo.OooO00o;
        }
        boolean OooO0O03 = c0224o00oO0002.OooO0O0(charSequence, charSequence.length());
        if (!z && (OooO0O03 || OooO0O0(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!OooO0O03 || OooO0O0(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
