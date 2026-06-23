package com.ninja.engine;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
/* renamed from: com.ninja.engine.o00o0O00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202o00o0O00 implements InterfaceC1125oOOooO0o {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public C0202o00o0O00(Resources resources, InterfaceC1125oOOooO0o interfaceC1125oOOooO0o) {
        this.OooO00o = 0;
        this.OooO0OO = resources;
        this.OooO0O0 = interfaceC1125oOOooO0o;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                return ((InterfaceC1125oOOooO0o) this.OooO0O0).OooO00o(obj, c0973oOOO00o);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                InputStream inputStream = (InputStream) obj;
                ((C0577o0oOo000) this.OooO0O0).getClass();
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.InputStream] */
    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        C1057oOOo00oO c1057oOOo00oO;
        boolean z;
        C0501o0o00O c0501o0o00O;
        C0501o0o00O c0501o0o00O2;
        switch (this.OooO00o) {
            case 0:
                InterfaceC1108oOOoo OooO0O0 = ((InterfaceC1125oOOooO0o) this.OooO0O0).OooO0O0(obj, i, i2, c0973oOOO00o);
                if (OooO0O0 == null) {
                    return null;
                }
                return new C0207o00o0OOo((Resources) this.OooO0OO, OooO0O0);
            case 1:
                InterfaceC1108oOOoo OooO0OO = ((C1127oOOooOOO) this.OooO0O0).OooO0OO((Uri) obj, c0973oOOO00o);
                if (OooO0OO == null) {
                    return null;
                }
                return AbstractC0692o0ooooOo.OooOOO0((InterfaceC0206o00o0OOO) this.OooO0OO, (Drawable) ((C0682o0oooOOo) OooO0OO).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C1057oOOo00oO) {
                    c1057oOOo00oO = (C1057oOOo00oO) inputStream;
                    z = false;
                } else {
                    c1057oOOo00oO = new C1057oOOo00oO(inputStream, (C0836oO0o0oO0) this.OooO0OO);
                    z = true;
                }
                ArrayDeque arrayDeque = C0501o0o00O.OooO0OO;
                synchronized (arrayDeque) {
                    c0501o0o00O = (C0501o0o00O) arrayDeque.poll();
                    c0501o0o00O2 = c0501o0o00O;
                }
                if (c0501o0o00O == null) {
                    c0501o0o00O2 = new C0501o0o00O();
                }
                c0501o0o00O2.OooO00o = c1057oOOo00oO;
                C0851oO0oO0oo c0851oO0oO0oo = new C0851oO0oO0oo(c0501o0o00O2);
                C1126oOOooOO c1126oOOooOO = new C1126oOOooOO(c1057oOOo00oO, 4, c0501o0o00O2);
                try {
                    C0577o0oOo000 c0577o0oOo000 = (C0577o0oOo000) this.OooO0O0;
                    return c0577o0oOo000.OooO00o(new C0131o00O0o(c0851oO0oO0oo, c0577o0oOo000.OooO0Oo, c0577o0oOo000.OooO0OO), i, i2, c0973oOOO00o, c1126oOOooOO);
                } finally {
                    c0501o0o00O2.OooO00o();
                    if (z) {
                        c1057oOOo00oO.OooO0O0();
                    }
                }
        }
    }

    public /* synthetic */ C0202o00o0O00(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }
}


