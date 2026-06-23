package com.ninja.engine;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0oOoOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594o0oOoOoO implements InterfaceC0076o0000oo {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0606o0oOoooO OooO0O0;

    public /* synthetic */ C0594o0oOoOoO(C0606o0oOoooO c0606o0oOoooO, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0606o0oOoooO;
    }

    @Override // com.ninja.engine.InterfaceC0076o0000oo
    public final void OooO0OO(Object obj) {
        int i;
        switch (this.OooO00o) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((Boolean) arrayList.get(i2)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i2] = i;
                }
                C0606o0oOoooO c0606o0oOoooO = this.OooO0O0;
                C0603o0oOooOo c0603o0oOooOo = (C0603o0oOooOo) c0606o0oOoooO.OooOoo.pollFirst();
                if (c0603o0oOooOo != null) {
                    c0606o0oOoooO.OooO0OO.OooOOOO(c0603o0oOooOo.OooO00o);
                    return;
                }
                return;
            default:
                o0000O00 o0000o00 = (o0000O00) obj;
                C0606o0oOoooO c0606o0oOoooO2 = this.OooO0O0;
                C0603o0oOooOo c0603o0oOooOo2 = (C0603o0oOooOo) c0606o0oOoooO2.OooOoo.pollFirst();
                if (c0603o0oOooOo2 != null) {
                    AbstractComponentCallbacksC0593o0oOoOo0 OooOOOO = c0606o0oOoooO2.OooO0OO.OooOOOO(c0603o0oOooOo2.OooO00o);
                    if (OooOOOO != null) {
                        int i3 = o0000o00.OooO00o;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            OooOOOO.toString();
                            Objects.toString(o0000o00.OooO0O0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}


