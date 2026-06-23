package com.ninja.engine;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.ninja.engine.oo00OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396oo00OO0 implements InterfaceC0904oOO000o0 {
    public static final Set OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final InterfaceC1397oo00OO00 OooO00o;

    public C1396oo00OO0(InterfaceC1397oo00OO00 interfaceC1397oo00OO00) {
        this.OooO00o = interfaceC1397oo00OO00;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Uri uri = (Uri) obj;
        return new C0903oOO000Oo(new C0947oOO0oO00(uri), this.OooO00o.OooO00o(uri));
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        return OooO0O0.contains(((Uri) obj).getScheme());
    }
}
