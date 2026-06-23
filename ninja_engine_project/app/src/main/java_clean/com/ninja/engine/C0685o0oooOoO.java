package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
/* renamed from: com.ninja.engine.o0oooOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0685o0oooOoO extends AbstractC0340o0O0oooO {
    public final Handler OooO0Oo;
    public final long OooO0o;
    public final int OooO0o0;
    public Bitmap OooO0oO;

    public C0685o0oooOoO(Handler handler, int i, long j) {
        this.OooO0Oo = handler;
        this.OooO0o0 = i;
        this.OooO0o = j;
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0oO(Drawable drawable) {
        this.OooO0oO = null;
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0oo(Object obj) {
        this.OooO0oO = (Bitmap) obj;
        Handler handler = this.OooO0Oo;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.OooO0o);
    }
}


