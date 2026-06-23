package com.ninja.engine;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.ninja.engine.oo00OO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398oo00OO0O implements InterfaceC0904oOO000o0 {
    public static final Set OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final InterfaceC0904oOO000o0 OooO00o;

    public C1398oo00OO0O(InterfaceC0904oOO000o0 interfaceC0904oOO000o0) {
        this.OooO00o = interfaceC0904oOO000o0;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        return this.OooO00o.OooO00o(new oO0000O(((Uri) obj).toString()), i, i2, c0973oOOO00o);
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        return OooO0O0.contains(((Uri) obj).getScheme());
    }
}


