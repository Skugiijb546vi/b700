package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* renamed from: com.ninja.engine.o0oooOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682o0oooOOo implements InterfaceC1108oOOoo, InterfaceC0719oO00OoO0 {
    public final Drawable OooO00o;
    public final /* synthetic */ int OooO0O0;

    public C0682o0oooOOo(Drawable drawable, int i) {
        this.OooO0O0 = i;
        AbstractC0694o0ooooo0.OooOO0O(drawable, "Argument must not be null");
        this.OooO00o = drawable;
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final int OooO00o() {
        switch (this.OooO0O0) {
            case 0:
                C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) ((C0680o0oooOO) this.OooO00o).OooO00o.OooO0O0;
                C1245oOoOoo c1245oOoOoo = c0689o0oooo0O.OooO00o;
                return (c1245oOoOoo.OooOO0.length * 4) + c1245oOoOoo.OooO0Oo.limit() + c1245oOoOoo.OooO.length + c0689o0oooo0O.OooOOO;
            default:
                Drawable drawable = this.OooO00o;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Class OooO0O0() {
        switch (this.OooO0O0) {
            case 0:
                return C0680o0oooOO.class;
            default:
                return this.OooO00o.getClass();
        }
    }

    public final void OooO0OO() {
        Drawable drawable = this.OooO00o;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof C0680o0oooOO) {
            ((C0689o0oooo0O) ((C0680o0oooOO) drawable).OooO00o.OooO0O0).OooOO0o.prepareToDraw();
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final void OooO0Oo() {
        C0836oO0o0oO0 c0836oO0o0oO0;
        C0836oO0o0oO0 c0836oO0o0oO02;
        C0836oO0o0oO0 c0836oO0o0oO03;
        switch (this.OooO0O0) {
            case 0:
                C0680o0oooOO c0680o0oooOO = (C0680o0oooOO) this.OooO00o;
                c0680o0oooOO.stop();
                c0680o0oooOO.OooO0Oo = true;
                C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) c0680o0oooOO.OooO00o.OooO0O0;
                c0689o0oooo0O.OooO0OO.clear();
                Bitmap bitmap = c0689o0oooo0O.OooOO0o;
                if (bitmap != null) {
                    c0689o0oooo0O.OooO0o0.OooO(bitmap);
                    c0689o0oooo0O.OooOO0o = null;
                }
                c0689o0oooo0O.OooO0o = false;
                C0685o0oooOoO c0685o0oooOoO = c0689o0oooo0O.OooO;
                ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0 = c0689o0oooo0O.OooO0Oo;
                if (c0685o0oooOoO != null) {
                    componentCallbacks2C1106oOOoOoo0.OooOO0o(c0685o0oooOoO);
                    c0689o0oooo0O.OooO = null;
                }
                C0685o0oooOoO c0685o0oooOoO2 = c0689o0oooo0O.OooOO0O;
                if (c0685o0oooOoO2 != null) {
                    componentCallbacks2C1106oOOoOoo0.OooOO0o(c0685o0oooOoO2);
                    c0689o0oooo0O.OooOO0O = null;
                }
                C0685o0oooOoO c0685o0oooOoO3 = c0689o0oooo0O.OooOOO0;
                if (c0685o0oooOoO3 != null) {
                    componentCallbacks2C1106oOOoOoo0.OooOO0o(c0685o0oooOoO3);
                    c0689o0oooo0O.OooOOO0 = null;
                }
                C1245oOoOoo c1245oOoOoo = c0689o0oooo0O.OooO00o;
                c1245oOoOoo.OooOO0o = null;
                byte[] bArr = c1245oOoOoo.OooO;
                C0415o0Oo0O0O c0415o0Oo0O0O = c1245oOoOoo.OooO0OO;
                if (bArr != null && (c0836oO0o0oO03 = (C0836oO0o0oO0) c0415o0Oo0O0O.OooO0OO) != null) {
                    c0836oO0o0oO03.OooO0oo(bArr);
                }
                int[] iArr = c1245oOoOoo.OooOO0;
                if (iArr != null && (c0836oO0o0oO02 = (C0836oO0o0oO0) c0415o0Oo0O0O.OooO0OO) != null) {
                    c0836oO0o0oO02.OooO0oo(iArr);
                }
                Bitmap bitmap2 = c1245oOoOoo.OooOOO0;
                if (bitmap2 != null) {
                    ((InterfaceC0206o00o0OOO) c0415o0Oo0O0O.OooO0O0).OooO(bitmap2);
                }
                c1245oOoOoo.OooOOO0 = null;
                c1245oOoOoo.OooO0Oo = null;
                c1245oOoOoo.OooOOoo = null;
                byte[] bArr2 = c1245oOoOoo.OooO0o0;
                if (bArr2 != null && (c0836oO0o0oO0 = (C0836oO0o0oO0) c0415o0Oo0O0O.OooO0OO) != null) {
                    c0836oO0o0oO0.OooO0oo(bArr2);
                }
                c0689o0oooo0O.OooOO0 = true;
                return;
            default:
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Object get() {
        Drawable drawable = this.OooO00o;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }

    @Override // com.ninja.engine.InterfaceC0719oO00OoO0
    public void initialize() {
        switch (this.OooO0O0) {
            case 0:
                ((C0689o0oooo0O) ((C0680o0oooOO) this.OooO00o).OooO00o.OooO0O0).OooOO0o.prepareToDraw();
                return;
            default:
                OooO0OO();
                return;
        }
    }

    private final void OooO0o0() {
    }
}
