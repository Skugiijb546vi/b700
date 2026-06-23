package com.ninja.engine;

import com.android.volley.DefaultRetryPolicy;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class oO00O0o0 implements InterfaceC0904oOO000o0 {
    public static final oOOO00o0 OooO0O0 = oOOO00o0.OooO00o(Integer.valueOf((int) DefaultRetryPolicy.DEFAULT_TIMEOUT_MS), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final C0331o0O0oo OooO00o;

    public oO00O0o0(C0331o0O0oo c0331o0O0oo) {
        this.OooO00o = c0331o0O0oo;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        oO0000O oo0000o = (oO0000O) obj;
        C0331o0O0oo c0331o0O0oo = this.OooO00o;
        if (c0331o0O0oo != null) {
            oOO000OO OooO00o = oOO000OO.OooO00o(oo0000o);
            oOO000O0 ooo000o0 = (oOO000O0) c0331o0O0oo.OooO0O0;
            Object OooO00o2 = ooo000o0.OooO00o(OooO00o);
            ArrayDeque arrayDeque = oOO000OO.OooO0Oo;
            synchronized (arrayDeque) {
                arrayDeque.offer(OooO00o);
            }
            oO0000O oo0000o2 = (oO0000O) OooO00o2;
            if (oo0000o2 == null) {
                ooo000o0.OooO0Oo(oOO000OO.OooO00o(oo0000o), oo0000o);
            } else {
                oo0000o = oo0000o2;
            }
        }
        return new C0903oOO000Oo(oo0000o, new oO00O0o(oo0000o, ((Integer) c0973oOOO00o.OooO0OO(OooO0O0)).intValue()));
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Object obj) {
        oO0000O oo0000o = (oO0000O) obj;
        return true;
    }
}


