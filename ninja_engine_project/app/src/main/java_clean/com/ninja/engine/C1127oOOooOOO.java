package com.ninja.engine;

import android.content.Context;
import android.net.Uri;
/* renamed from: com.ninja.engine.oOOooOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127oOOooOOO implements InterfaceC1125oOOooO0o {
    public static final oOOO00o0 OooO0O0 = new oOOO00o0("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, oOOO00o0.OooO0o0);
    public final Context OooO00o;

    public C1127oOOooOOO(Context context) {
        this.OooO00o = context.getApplicationContext();
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final boolean OooO00o(Object obj, C0973oOOO00o c0973oOOO00o) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1125oOOooO0o
    public final /* bridge */ /* synthetic */ InterfaceC1108oOOoo OooO0O0(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        return OooO0OO((Uri) obj, c0973oOOO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ninja.engine.InterfaceC1108oOOoo OooO0OO(android.net.Uri r9, com.ninja.engine.C0973oOOO00o r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1127oOOooOOO.OooO0OO(android.net.Uri, com.ninja.engine.oOOO00o):com.ninja.engine.oOOoo");
    }
}


