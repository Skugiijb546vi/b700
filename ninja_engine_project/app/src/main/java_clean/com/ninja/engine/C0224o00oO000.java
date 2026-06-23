package com.ninja.engine;

import android.os.Handler;
import android.os.Looper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* renamed from: com.ninja.engine.o00oO000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224o00oO000 implements InterfaceC1933ooo0OoO {
    public boolean OooO00o;
    public final Object OooO0O0;

    public C0224o00oO000() {
        this.OooO0O0 = new Handler(Looper.getMainLooper(), new C0191o00o0000(1));
    }

    public boolean OooO00o() {
        return this.OooO00o;
    }

    public boolean OooO0O0(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            C0455o0OoOo00 c0455o0OoOo00 = (C0455o0OoOo00) this.OooO0O0;
            if (c0455o0OoOo00 == null) {
                return OooO00o();
            }
            int OooOOoo = c0455o0OoOo00.OooOOoo(charSequence, i);
            if (OooOOoo == 0) {
                return true;
            }
            if (OooOOoo != 1) {
                return OooO00o();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }

    public synchronized void OooO0OO(InterfaceC1108oOOoo interfaceC1108oOOoo, boolean z) {
        try {
            if (!this.OooO00o && !z) {
                this.OooO00o = true;
                interfaceC1108oOOoo.OooO0Oo();
                this.OooO00o = false;
            }
            ((Handler) this.OooO0O0).obtainMessage(1, interfaceC1108oOOoo).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    @Override // com.ninja.engine.InterfaceC1933ooo0OoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ninja.engine.C1536oo0OoOoO OooOOOO(android.view.View r11, com.ninja.engine.C1536oo0OoOoO r12, com.ninja.engine.C1598oo0oOOoO r13) {
        /*
            r10 = this;
            com.ninja.engine.oo0OoOOo r0 = r12.OooO00o
            r1 = 7
            com.ninja.engine.oO00OooO r1 = r0.OooO0o(r1)
            r2 = 32
            com.ninja.engine.oO00OooO r0 = r0.OooO0o(r2)
            int r2 = r1.OooO0O0
            java.lang.Object r3 = r10.OooO0O0
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            r3.OooOo0o = r2
            boolean r2 = com.ninja.engine.AbstractC1091oOOoOOOO.OooOo0o(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r3.OooOOOO
            if (r7 == 0) goto L32
            int r4 = r12.OooO00o()
            r3.OooOo0O = r4
            int r7 = r13.OooO0Oo
            int r4 = r4 + r7
        L32:
            boolean r7 = r3.OooOOOo
            int r8 = r1.OooO00o
            if (r7 == 0) goto L40
            if (r2 == 0) goto L3d
            int r5 = r13.OooO0OO
            goto L3f
        L3d:
            int r5 = r13.OooO00o
        L3f:
            int r5 = r5 + r8
        L40:
            boolean r7 = r3.OooOOo0
            int r9 = r1.OooO0OO
            if (r7 == 0) goto L4f
            if (r2 == 0) goto L4b
            int r13 = r13.OooO00o
            goto L4d
        L4b:
            int r13 = r13.OooO0OO
        L4d:
            int r6 = r13 + r9
        L4f:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r2 = r3.OooOOoo
            r7 = 1
            if (r2 == 0) goto L62
            int r2 = r13.leftMargin
            if (r2 == r8) goto L62
            r13.leftMargin = r8
            r2 = 1
            goto L63
        L62:
            r2 = 0
        L63:
            boolean r8 = r3.OooOo00
            if (r8 == 0) goto L6e
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6e
            r13.rightMargin = r9
            r2 = 1
        L6e:
            boolean r8 = r3.OooOo0
            if (r8 == 0) goto L7b
            int r8 = r13.topMargin
            int r1 = r1.OooO0O0
            if (r8 == r1) goto L7b
            r13.topMargin = r1
            goto L7c
        L7b:
            r7 = r2
        L7c:
            if (r7 == 0) goto L81
            r11.setLayoutParams(r13)
        L81:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r11 = r10.OooO00o
            if (r11 == 0) goto L90
            int r13 = r0.OooO0Oo
            r3.OooOOO0 = r13
        L90:
            boolean r13 = r3.OooOOOO
            if (r13 != 0) goto L96
            if (r11 == 0) goto L99
        L96:
            r3.Oooo0o()
        L99:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0224o00oO000.OooOOOO(android.view.View, com.ninja.engine.oo0OoOoO, com.ninja.engine.oo0oOOoO):com.ninja.engine.oo0OoOoO");
    }

    public C0224o00oO000(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.OooO0O0 = bottomSheetBehavior;
        this.OooO00o = z;
    }

    public C0224o00oO000(C0455o0OoOo00 c0455o0OoOo00, boolean z) {
        this.OooO0O0 = c0455o0OoOo00;
        this.OooO00o = z;
    }
}


