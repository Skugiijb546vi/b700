package com.ninja.engine;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class o0O0OOO implements InterfaceC1213oOoOOo0O {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ o0O0OOO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC1213oOoOOo0O
    public final Bundle OooO00o() {
        o000OO00 o000oo00;
        switch (this.OooO00o) {
            case 0:
                androidx.activity.OooO00o oooO00o = (androidx.activity.OooO00o) this.OooO0O0;
                oooO00o.getClass();
                Bundle bundle = new Bundle();
                C0297o0O0OOo c0297o0O0OOo = oooO00o.OooOO0;
                c0297o0O0OOo.getClass();
                HashMap hashMap = c0297o0O0OOo.OooO0O0;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0297o0O0OOo.OooO0Oo));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0297o0O0OOo.OooO0oO.clone());
                return bundle;
            case 1:
                break;
            default:
                return ((C0606o0oOoooO) this.OooO0O0).OoooO0();
        }
        do {
            o000oo00 = (o000OO00) this.OooO0O0;
        } while (o000OO00.OooOo0O(o000oo00.OooOo00()));
        o000oo00.OooOOoo.OooO0Oo(oO0O0O0o.ON_STOP);
        return new Bundle();
    }
}
