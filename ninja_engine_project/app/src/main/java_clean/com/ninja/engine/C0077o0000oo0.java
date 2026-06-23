package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
/* renamed from: com.ninja.engine.o0000oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077o0000oo0 implements InterfaceC1108oOOoo {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public /* synthetic */ C0077o0000oo0(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final int OooO00o() {
        int intrinsicWidth;
        int intrinsicHeight;
        switch (this.OooO00o) {
            case 0:
                intrinsicWidth = ((AnimatedImageDrawable) this.OooO0O0).getIntrinsicWidth();
                intrinsicHeight = ((AnimatedImageDrawable) this.OooO0O0).getIntrinsicHeight();
                return AbstractC1401oo00OOO0.OooO0Oo(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
            case 1:
                return ((byte[]) this.OooO0O0).length;
            case 2:
                return 1;
            default:
                return AbstractC1401oo00OOO0.OooO0OO((Bitmap) this.OooO0O0);
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Class OooO0O0() {
        switch (this.OooO00o) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return this.OooO0O0.getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final void OooO0Oo() {
        switch (this.OooO00o) {
            case 0:
                ((AnimatedImageDrawable) this.OooO0O0).stop();
                ((AnimatedImageDrawable) this.OooO0O0).clearAnimationCallbacks();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC1108oOOoo
    public final Object get() {
        switch (this.OooO00o) {
            case 0:
                return (AnimatedImageDrawable) this.OooO0O0;
            case 1:
                return (byte[]) this.OooO0O0;
            case 2:
                return this.OooO0O0;
            default:
                return (Bitmap) this.OooO0O0;
        }
    }

    public C0077o0000oo0(File file) {
        this.OooO00o = 2;
        AbstractC0694o0ooooo0.OooOO0O(file, "Argument must not be null");
        this.OooO0O0 = file;
    }

    public C0077o0000oo0(byte[] bArr) {
        this.OooO00o = 1;
        AbstractC0694o0ooooo0.OooOO0O(bArr, "Argument must not be null");
        this.OooO0O0 = bArr;
    }

    private final void OooO0OO() {
    }

    private final void OooO0o() {
    }

    private final void OooO0o0() {
    }
}


