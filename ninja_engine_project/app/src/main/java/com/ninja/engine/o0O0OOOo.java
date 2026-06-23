package com.ninja.engine;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final /* synthetic */ class o0O0OOOo implements InterfaceC0966oOO0ooo0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ androidx.activity.OooO00o OooO0O0;

    public /* synthetic */ o0O0OOOo(o000OO00 o000oo00, int i) {
        this.OooO00o = i;
        this.OooO0O0 = o000oo00;
    }

    @Override // com.ninja.engine.InterfaceC0966oOO0ooo0
    public final void OooO00o() {
        switch (this.OooO00o) {
            case 0:
                androidx.activity.OooO00o oooO00o = this.OooO0O0;
                Bundle OooO0OO = ((C0086o000Oo00) oooO00o.OooO0o0.OooO0Oo).OooO0OO("android:support:activity-result");
                if (OooO0OO != null) {
                    C0297o0O0OOo c0297o0O0OOo = oooO00o.OooOO0;
                    c0297o0O0OOo.getClass();
                    ArrayList<Integer> integerArrayList = OooO0OO.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = OooO0OO.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0297o0O0OOo.OooO0Oo = OooO0OO.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = OooO0OO.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0297o0O0OOo.OooO0oO;
                        bundle2.putAll(bundle);
                        for (int i = 0; i < stringArrayList.size(); i++) {
                            String str = stringArrayList.get(i);
                            HashMap hashMap = c0297o0O0OOo.OooO0O0;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = c0297o0O0OOo.OooO00o;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.intValue();
                            String str2 = stringArrayList.get(i);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0589o0oOoOO0 c0589o0oOoOO0 = (C0589o0oOoOO0) ((o000OO00) this.OooO0O0).OooOOo.OooO0O0;
                c0589o0oOoOO0.Oooo0.OooO0O0(c0589o0oOoOO0, c0589o0oOoOO0, null);
                return;
        }
    }
}
