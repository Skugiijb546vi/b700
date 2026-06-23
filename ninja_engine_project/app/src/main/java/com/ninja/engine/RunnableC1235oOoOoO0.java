package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOoOoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1235oOoOoO0 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C1237oOoOoO0O OooO0O0;
    public final /* synthetic */ o0OOo000 OooO0OO;

    public /* synthetic */ RunnableC1235oOoOoO0(o0OOo000 o0ooo000, C1237oOoOoO0O c1237oOoOoO0O, int i) {
        this.OooO00o = i;
        this.OooO0OO = o0ooo000;
        this.OooO0O0 = c1237oOoOoO0O;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                ArrayList arrayList = this.OooO0OO.OooO0O0;
                C1237oOoOoO0O c1237oOoOoO0O = this.OooO0O0;
                if (arrayList.contains(c1237oOoOoO0O)) {
                    AbstractC1230oOoOo0o.OooO00o(c1237oOoOoO0O.OooO0OO.OooOooo, c1237oOoOoO0O.OooO00o);
                    return;
                }
                return;
            default:
                o0OOo000 o0ooo000 = this.OooO0OO;
                ArrayList arrayList2 = o0ooo000.OooO0O0;
                C1237oOoOoO0O c1237oOoOoO0O2 = this.OooO0O0;
                arrayList2.remove(c1237oOoOoO0O2);
                o0ooo000.OooO0OO.remove(c1237oOoOoO0O2);
                return;
        }
    }
}
