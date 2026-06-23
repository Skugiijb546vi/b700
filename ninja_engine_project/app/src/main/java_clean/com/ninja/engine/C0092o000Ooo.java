package com.ninja.engine;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.o000Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092o000Ooo extends AbstractC0418o0Oo0OOO implements InterfaceC1317oOooOoo {
    public o000O000 OooOOO;
    public boolean OooOOOO;
    public o000O000 OooOOOo;
    public int OooOOo;
    public AbstractC0694o0ooooo0 OooOOo0;
    public int OooOOoo;
    public boolean OooOo00;

    public C0092o000Ooo(o000O000 o000o000, Resources resources) {
        this.OooO0o0 = 255;
        this.OooO0oO = -1;
        this.OooOOo = -1;
        this.OooOOoo = -1;
        OooO0Oo(new o000O000(o000o000, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0092o000Ooo OooO0o0(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0092o000Ooo.OooO0o0(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):com.ninja.engine.o000Ooo");
    }

    @Override // com.ninja.engine.AbstractC0418o0Oo0OOO
    public final void OooO0Oo(o000O000 o000o000) {
        this.OooO00o = o000o000;
        int i = this.OooO0oO;
        if (i >= 0) {
            Drawable OooO0Oo = o000o000.OooO0Oo(i);
            this.OooO0OO = OooO0Oo;
            if (OooO0Oo != null) {
                OooO0O0(OooO0Oo);
            }
        }
        this.OooO0Oo = null;
        this.OooOOO = o000o000;
        this.OooOOOo = o000o000;
    }

    public final Drawable OooO0o() {
        if (!this.OooOOOO) {
            super.mutate();
            o000O000 o000o000 = this.OooOOO;
            o000o000.Oooo0 = o000o000.Oooo0.clone();
            o000o000.Oooo0O0 = o000o000.Oooo0O0.clone();
            this.OooOOOO = true;
        }
        return this;
    }

    @Override // com.ninja.engine.AbstractC0418o0Oo0OOO, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // com.ninja.engine.AbstractC0418o0Oo0OOO, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0694o0ooooo0 abstractC0694o0ooooo0 = this.OooOOo0;
        if (abstractC0694o0ooooo0 != null) {
            abstractC0694o0ooooo0.OoooO0O();
            this.OooOOo0 = null;
            OooO0OO(this.OooOOo);
            this.OooOOo = -1;
            this.OooOOoo = -1;
        }
    }

    @Override // com.ninja.engine.AbstractC0418o0Oo0OOO, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.OooOo00) {
            OooO0o();
            o000O000 o000o000 = this.OooOOOo;
            o000o000.Oooo0 = o000o000.Oooo0.clone();
            o000o000.Oooo0O0 = o000o000.Oooo0O0.clone();
            this.OooOo00 = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        if (OooO0OO(r1) != false) goto L16;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r14) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0092o000Ooo.onStateChange(int[]):boolean");
    }

    @Override // com.ninja.engine.AbstractC0418o0Oo0OOO, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC0694o0ooooo0 abstractC0694o0ooooo0 = this.OooOOo0;
        if (abstractC0694o0ooooo0 != null && (visible || z2)) {
            if (z) {
                abstractC0694o0ooooo0.OoooO0();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}


