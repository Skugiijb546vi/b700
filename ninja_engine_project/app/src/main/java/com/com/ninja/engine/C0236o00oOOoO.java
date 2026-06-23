package com.ninja.engine;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.ninja.engine.o00oOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236o00oOOoO implements InterfaceC1125oOOooO0o {
    public static final C0455o0OoOo00 OooO0o = new C0455o0OoOo00(21);
    public static final C0235o00oOOo0 OooO0oO = new C0235o00oOOo0(0);
    public final Context OooO00o;
    public final List OooO0O0;
    public final C0235o00oOOo0 OooO0OO;
    public final C0455o0OoOo00 OooO0Oo;
    public final C0415o0Oo0O0O OooO0o0;

    public C0236o00oOOoO(Context context, ArrayList arrayList, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, C0836oO0o0oO0 c0836oO0o0oO0) {
        C0455o0OoOo00 c0455o0OoOo00 = OooO0o;
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = arrayList;
        this.OooO0Oo = c0455o0OoOo00;
        this.OooO0o0 = new C0415o0Oo0O0O(interfaceC0206o00o0OOO, c0836oO0o0oO0, 18, false);
        this.OooO0OO = OooO0oO;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) c0973oOOO00o.OooO0OO(AbstractC0691o0ooooO0.OooO0O0)).booleanValue() && AbstractC0692o0ooooOo.OooOooO(this.OooO0O0, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        C0686o0oooo c0686o0oooo;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C0235o00oOOo0 c0235o00oOOo0 = this.OooO0OO;
        synchronized (c0235o00oOOo0) {
            try {
                C0686o0oooo c0686o0oooo2 = (C0686o0oooo) c0235o00oOOo0.OooO00o.poll();
                if (c0686o0oooo2 == null) {
                    c0686o0oooo2 = new C0686o0oooo();
                }
                c0686o0oooo = c0686o0oooo2;
                c0686o0oooo.OooO0O0 = null;
                Arrays.fill(c0686o0oooo.OooO00o, (byte) 0);
                c0686o0oooo.OooO0OO = new C0690o0oooo0o();
                c0686o0oooo.OooO0Oo = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c0686o0oooo.OooO0O0 = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                c0686o0oooo.OooO0O0.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return OooO0OO(byteBuffer, i, i2, c0686o0oooo, c0973oOOO00o);
        } finally {
            this.OooO0OO.OooO0OO(c0686o0oooo);
        }
    }

    public final C0682o0oooOOo OooO0OO(ByteBuffer byteBuffer, int i, int i2, C0686o0oooo c0686o0oooo, C0973oOOO00o c0973oOOO00o) {
        Bitmap.Config config;
        int highestOneBit;
        int i3 = oO0o0000.OooO00o;
        SystemClock.elapsedRealtimeNanos();
        try {
            C0690o0oooo0o OooO0O0 = c0686o0oooo.OooO0O0();
            if (OooO0O0.OooO0OO > 0 && OooO0O0.OooO0O0 == 0) {
                if (c0973oOOO00o.OooO0OO(AbstractC0691o0ooooO0.OooO00o) == o0OOO0.OooO0O0) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int min = Math.min(OooO0O0.OooO0oO / i2, OooO0O0.OooO0o / i);
                if (min == 0) {
                    highestOneBit = 0;
                } else {
                    highestOneBit = Integer.highestOneBit(min);
                }
                int max = Math.max(1, highestOneBit);
                Log.isLoggable("BufferGifDecoder", 2);
                C0455o0OoOo00 c0455o0OoOo00 = this.OooO0Oo;
                C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO0o0;
                c0455o0OoOo00.getClass();
                C1245oOoOoo c1245oOoOoo = new C1245oOoOoo(c0415o0Oo0O0O, OooO0O0, byteBuffer, max);
                c1245oOoOoo.OooO0OO(config);
                c1245oOoOoo.OooOO0O = (c1245oOoOoo.OooOO0O + 1) % c1245oOoOoo.OooOO0o.OooO0OO;
                Bitmap OooO0O02 = c1245oOoOoo.OooO0O0();
                if (OooO0O02 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        SystemClock.elapsedRealtimeNanos();
                    }
                    return null;
                }
                C0682o0oooOOo c0682o0oooOOo = new C0682o0oooOOo(new C0680o0oooOO(new o000O00(1, new C0689o0oooo0O(com.bumptech.glide.OooO00o.OooO00o(this.OooO00o), c1245oOoOoo, i, i2, C1392oo00O0o0.OooO0O0, OooO0O02))), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return c0682o0oooOOo;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
