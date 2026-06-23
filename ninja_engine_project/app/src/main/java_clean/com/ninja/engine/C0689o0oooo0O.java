package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oooo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689o0oooo0O {
    public C0685o0oooOoO OooO;
    public final C1245oOoOoo OooO00o;
    public final Handler OooO0O0;
    public final ArrayList OooO0OO;
    public final ComponentCallbacks2C1106oOOoOoo0 OooO0Oo;
    public boolean OooO0o;
    public final InterfaceC0206o00o0OOO OooO0o0;
    public boolean OooO0oO;
    public C1100oOOoOo0o OooO0oo;
    public boolean OooOO0;
    public C0685o0oooOoO OooOO0O;
    public Bitmap OooOO0o;
    public int OooOOO;
    public C0685o0oooOoO OooOOO0;
    public int OooOOOO;
    public int OooOOOo;

    public C0689o0oooo0O(com.bumptech.glide.OooO00o oooO00o, C1245oOoOoo c1245oOoOoo, int i, int i2, C1392oo00O0o0 c1392oo00O0o0, Bitmap bitmap) {
        InterfaceC0206o00o0OOO interfaceC0206o00o0OOO = oooO00o.OooO00o;
        C1932ooo0Oo0 c1932ooo0Oo0 = oooO00o.OooO0OO;
        ComponentCallbacks2C1106oOOoOoo0 OooO0Oo = com.bumptech.glide.OooO00o.OooO0Oo(c1932ooo0Oo0.getBaseContext());
        ComponentCallbacks2C1106oOOoOoo0 OooO0Oo2 = com.bumptech.glide.OooO00o.OooO0Oo(c1932ooo0Oo0.getBaseContext());
        OooO0Oo2.getClass();
        C1100oOOoOo0o OooO00o = new C1100oOOoOo0o(OooO0Oo2.OooO00o, OooO0Oo2, Bitmap.class, OooO0Oo2.OooO0O0).OooO00o(ComponentCallbacks2C1106oOOoOoo0.OooOO0O).OooO00o(((C1105oOOoOoo) ((C1105oOOoOoo) ((C1105oOOoOoo) new AbstractC0186o00Ooooo() {}.OooO0Oo(C0395o0OOoo.OooO0OO)).OooOOOo()).OooOOO0()).OooO0oo(i, i2));
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = OooO0Oo;
        Handler handler = new Handler(Looper.getMainLooper(), new C0687o0oooo0(0, this));
        this.OooO0o0 = interfaceC0206o00o0OOO;
        this.OooO0O0 = handler;
        this.OooO0oo = OooO00o;
        this.OooO00o = c1245oOoOoo;
        OooO0OO(c1392oo00O0o0, bitmap);
    }

    public final void OooO00o() {
        int i;
        int i2;
        if (this.OooO0o && !this.OooO0oO) {
            C0685o0oooOoO c0685o0oooOoO = this.OooOOO0;
            if (c0685o0oooOoO != null) {
                this.OooOOO0 = null;
                OooO0O0(c0685o0oooOoO);
                return;
            }
            this.OooO0oO = true;
            C1245oOoOoo c1245oOoOoo = this.OooO00o;
            C0690o0oooo0o c0690o0oooo0o = c1245oOoOoo.OooOO0o;
            int i3 = c0690o0oooo0o.OooO0OO;
            if (i3 > 0 && (i2 = c1245oOoOoo.OooOO0O) >= 0) {
                if (i2 >= 0 && i2 < i3) {
                    i = ((C0683o0oooOo) c0690o0oooo0o.OooO0o0.get(i2)).OooO;
                } else {
                    i = -1;
                }
            } else {
                i = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i;
            int i4 = (c1245oOoOoo.OooOO0O + 1) % c1245oOoOoo.OooOO0o.OooO0OO;
            c1245oOoOoo.OooOO0O = i4;
            this.OooOO0O = new C0685o0oooOoO(this.OooO0O0, i4, uptimeMillis);
            C1100oOOoOo0o OooOo0O = this.OooO0oo.OooO00o((C1105oOOoOoo) new AbstractC0186o00Ooooo() {}.OooOO0o(new C0947oOO0oO00(Double.valueOf(Math.random())))).OooOo0O(c1245oOoOoo);
            OooOo0O.OooOo0(this.OooOO0O, OooOo0O);
        }
    }

    public final void OooO0O0(C0685o0oooOoO c0685o0oooOoO) {
        C0689o0oooo0O c0689o0oooo0O;
        int i;
        this.OooO0oO = false;
        boolean z = this.OooOO0;
        Handler handler = this.OooO0O0;
        if (z) {
            handler.obtainMessage(2, c0685o0oooOoO).sendToTarget();
        } else if (!this.OooO0o) {
            this.OooOOO0 = c0685o0oooOoO;
        } else {
            if (c0685o0oooOoO.OooO0oO != null) {
                Bitmap bitmap = this.OooOO0o;
                if (bitmap != null) {
                    this.OooO0o0.OooO(bitmap);
                    this.OooOO0o = null;
                }
                C0685o0oooOoO c0685o0oooOoO2 = this.OooO;
                this.OooO = c0685o0oooOoO;
                ArrayList arrayList = this.OooO0OO;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0680o0oooOO c0680o0oooOO = (C0680o0oooOO) ((InterfaceC0688o0oooo00) arrayList.get(size));
                    Drawable.Callback callback = c0680o0oooOO.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        c0680o0oooOO.stop();
                        c0680o0oooOO.invalidateSelf();
                    } else {
                        c0680o0oooOO.invalidateSelf();
                        C0685o0oooOoO c0685o0oooOoO3 = ((C0689o0oooo0O) c0680o0oooOO.OooO00o.OooO0O0).OooO;
                        if (c0685o0oooOoO3 != null) {
                            i = c0685o0oooOoO3.OooO0o0;
                        } else {
                            i = -1;
                        }
                        if (i == c0689o0oooo0O.OooO00o.OooOO0o.OooO0OO - 1) {
                            c0680o0oooOO.OooO0o++;
                        }
                        int i2 = c0680o0oooOO.OooO0oO;
                        if (i2 != -1 && c0680o0oooOO.OooO0o >= i2) {
                            c0680o0oooOO.stop();
                        }
                    }
                }
                if (c0685o0oooOoO2 != null) {
                    handler.obtainMessage(2, c0685o0oooOoO2).sendToTarget();
                }
            }
            OooO00o();
        }
    }

    public final void OooO0OO(InterfaceC1351oo00000O interfaceC1351oo00000O, Bitmap bitmap) {
        AbstractC0694o0ooooo0.OooOO0O(interfaceC1351oo00000O, "Argument must not be null");
        AbstractC0694o0ooooo0.OooOO0O(bitmap, "Argument must not be null");
        this.OooOO0o = bitmap;
        this.OooO0oo = this.OooO0oo.OooO00o(new AbstractC0186o00Ooooo() {}.OooOOO(interfaceC1351oo00000O, true));
        this.OooOOO = AbstractC1401oo00OOO0.OooO0OO(bitmap);
        this.OooOOOO = bitmap.getWidth();
        this.OooOOOo = bitmap.getHeight();
    }
}


