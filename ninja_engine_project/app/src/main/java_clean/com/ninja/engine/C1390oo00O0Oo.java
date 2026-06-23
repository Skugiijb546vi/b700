package com.ninja.engine;

import java.io.File;
/* renamed from: com.ninja.engine.oo00O0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1390oo00O0Oo implements InterfaceC0904oOO000o0 {
    public static final C1390oo00O0Oo OooO0O0 = new C1390oo00O0Oo(0);
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C1390oo00O0Oo(int i) {
        this.OooO00o = i;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        switch (this.OooO00o) {
            case 0:
                return new C0903oOO000Oo(new C0947oOO0oO00(obj), new C0233o00oOOOo(1, obj));
            case 1:
                File file = (File) obj;
                return new C0903oOO000Oo(new C0947oOO0oO00(file), new C0233o00oOOOo(0, file));
            default:
                return null;
        }
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return true;
            case 1:
                File file = (File) obj;
                return true;
            default:
                return false;
        }
    }
}


