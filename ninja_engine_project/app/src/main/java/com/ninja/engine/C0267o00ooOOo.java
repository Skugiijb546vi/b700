package com.ninja.engine;
/* renamed from: com.ninja.engine.o00ooOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267o00ooOOo {
    public boolean OooO00o;
    public InterfaceC0265o00ooOO OooO0O0;
    public boolean OooO0OO;

    public final void OooO00o(InterfaceC0265o00ooOO interfaceC0265o00ooOO) {
        synchronized (this) {
            while (this.OooO0OO) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.OooO0O0 == interfaceC0265o00ooOO) {
                return;
            }
            this.OooO0O0 = interfaceC0265o00ooOO;
            if (this.OooO00o) {
                interfaceC0265o00ooOO.OooOO0O();
            }
        }
    }
}
