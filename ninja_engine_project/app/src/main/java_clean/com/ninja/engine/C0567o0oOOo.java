package com.ninja.engine;
/* renamed from: com.ninja.engine.o0oOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567o0oOOo {
    public final /* synthetic */ int OooO00o;

    public final int OooO00o(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int OooO0O0() {
        switch (this.OooO00o) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String OooO0OO() {
        switch (this.OooO00o) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    public final Object OooO0Oo(int i) {
        switch (this.OooO00o) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }
}


