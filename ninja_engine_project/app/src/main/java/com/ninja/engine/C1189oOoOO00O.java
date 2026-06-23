package com.ninja.engine;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
/* renamed from: com.ninja.engine.oOoOO00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189oOoOO00O implements InterfaceC1213oOoOOo0O {
    public final C0086o000Oo00 OooO00o;
    public boolean OooO0O0;
    public Bundle OooO0OO;
    public final C1278oOoo0o00 OooO0Oo;

    public C1189oOoOO00O(C0086o000Oo00 c0086o000Oo00, InterfaceC1468oo0O0OOo interfaceC1468oo0O0OOo) {
        AbstractC0809oO0OooOO.OooOOOo(c0086o000Oo00, "savedStateRegistry");
        AbstractC0809oO0OooOO.OooOOOo(interfaceC1468oo0O0OOo, "viewModelStoreOwner");
        this.OooO00o = c0086o000Oo00;
        this.OooO0Oo = new C1278oOoo0o00(new C0959oOO0oo00(3, interfaceC1468oo0O0OOo));
    }

    @Override // com.ninja.engine.InterfaceC1213oOoOOo0O
    public final Bundle OooO00o() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.OooO0OO;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C1190oOoOO00o) this.OooO0Oo.OooO00o()).OooO0OO.entrySet().iterator();
        if (!it.hasNext()) {
            this.OooO0O0 = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        AbstractC1230oOoOo0o.OooOO0O(entry.getValue());
        throw null;
    }
}
