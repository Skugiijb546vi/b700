package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
/* renamed from: com.ninja.engine.o0o0OO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541o0o0OO0o implements InterfaceC1125oOOooO0o {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0541o0o0OO0o(int i) {
        this.OooO00o = i;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final /* bridge */ /* synthetic */ boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                File file = (File) obj;
                return true;
            case 1:
                Bitmap bitmap = (Bitmap) obj;
                return true;
            default:
                Drawable drawable = (Drawable) obj;
                return true;
        }
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                return new C0077o0000oo0((File) obj);
            case 1:
                return new C0077o0000oo0(3, (Bitmap) obj);
            default:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C0682o0oooOOo(drawable, 1);
                }
                return null;
        }
    }
}


