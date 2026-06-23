package com.ninja.engine;
/* renamed from: com.ninja.engine.oOOoOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104oOOoOoOo implements InterfaceC0305o0O0OoO0 {
    public final C1228oOoOo0O0 OooO00o;
    public final /* synthetic */ ComponentCallbacks2C1106oOOoOoo0 OooO0O0;

    public C1104oOOoOoOo(ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0, C1228oOoOo0O0 c1228oOoOo0O0) {
        this.OooO0O0 = componentCallbacks2C1106oOOoOoo0;
        this.OooO00o = c1228oOoOo0O0;
    }

    @Override // com.ninja.engine.InterfaceC0305o0O0OoO0
    public final void OooO00o(boolean z) {
        if (z) {
            synchronized (this.OooO0O0) {
                this.OooO00o.OooO0oO();
            }
        }
    }
}


