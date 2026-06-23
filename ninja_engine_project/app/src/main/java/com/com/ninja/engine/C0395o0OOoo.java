package com.ninja.engine;
/* renamed from: com.ninja.engine.o0OOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395o0OOoo {
    public static final C0395o0OOoo OooO0O0 = new C0395o0OOoo(0);
    public static final C0395o0OOoo OooO0OO = new C0395o0OOoo(1);
    public static final C0395o0OOoo OooO0Oo = new C0395o0OOoo(2);
    public static final C0395o0OOoo OooO0o0 = new C0395o0OOoo(3);
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0395o0OOoo(int i) {
        this.OooO00o = i;
    }

    public final boolean OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return true;
            default:
                return true;
        }
    }

    public final boolean OooO0O0() {
        switch (this.OooO00o) {
            case 0:
                return true;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return true;
        }
    }

    public final boolean OooO0OO(int i) {
        switch (this.OooO00o) {
            case 0:
                return i == 2;
            case 1:
                return false;
            case 2:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }

    public final boolean OooO0Oo(int i, int i2, boolean z) {
        switch (this.OooO00o) {
            case 0:
                return (i == 4 || i == 5) ? false : true;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return ((z && i == 3) || i == 1) && i2 == 2;
        }
    }
}
