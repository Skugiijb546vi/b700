package com.ninja.engine;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* renamed from: com.ninja.engine.o00o0OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0207o00o0OOo implements InterfaceC1108oOOoo, InterfaceC0719oO00OoO0 {
    public final /* synthetic */ int OooO00o = 1;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public C0207o00o0OOo(Resources resources, InterfaceC1108oOOoo interfaceC1108oOOoo) {
        AbstractC0694o0ooooo0.OooOO0O(resources, "Argument must not be null");
        this.OooO0O0 = resources;
        AbstractC0694o0ooooo0.OooOO0O(interfaceC1108oOOoo, "Argument must not be null");
        this.OooO0OO = interfaceC1108oOOoo;
    }

    public static C0207o00o0OOo OooO0OO(Bitmap bitmap, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO) {
        if (bitmap == null) {
            return null;
        }
        return new C0207o00o0OOo(bitmap, interfaceC0206o00o0OOO);
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final int OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return AbstractC1401oo00OOO0.OooO0OO((Bitmap) this.OooO0O0);
            default:
                return ((InterfaceC1108oOOoo) this.OooO0OO).OooO00o();
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Class OooO0O0() {
        switch (this.OooO00o) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final void OooO0Oo() {
        switch (this.OooO00o) {
            case 0:
                ((InterfaceC0206o00o0OOO) this.OooO0OO).OooO((Bitmap) this.OooO0O0);
                return;
            default:
                ((InterfaceC1108oOOoo) this.OooO0OO).OooO0Oo();
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Object get() {
        switch (this.OooO00o) {
            case 0:
                return (Bitmap) this.OooO0O0;
            default:
                return new BitmapDrawable((Resources) this.OooO0O0, (Bitmap) ((InterfaceC1108oOOoo) this.OooO0OO).get());
        }
    }

    @Override // com.ninja.engine.InterfaceC0719oO00OoO0
    public final void initialize() {
        switch (this.OooO00o) {
            case 0:
                ((Bitmap) this.OooO0O0).prepareToDraw();
                return;
            default:
                InterfaceC1108oOOoo interfaceC1108oOOoo = (InterfaceC1108oOOoo) this.OooO0OO;
                if (interfaceC1108oOOoo instanceof InterfaceC0719oO00OoO0) {
                    ((InterfaceC0719oO00OoO0) interfaceC1108oOOoo).initialize();
                    return;
                }
                return;
        }
    }

    public C0207o00o0OOo(Bitmap bitmap, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO) {
        AbstractC0694o0ooooo0.OooOO0O(bitmap, "Bitmap must not be null");
        this.OooO0O0 = bitmap;
        AbstractC0694o0ooooo0.OooOO0O(interfaceC0206o00o0OOO, "BitmapPool must not be null");
        this.OooO0OO = interfaceC0206o00o0OOO;
    }
}
