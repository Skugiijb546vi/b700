package com.ninja.engine;

import android.util.Log;
/* renamed from: com.ninja.engine.o0oo00o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0615o0oo00o0 {
    public static final C0613o0oo00Oo OooO00o = C0613o0oo00Oo.OooO00o;

    public static C0613o0oo00Oo OooO00o(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        while (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOOOo()) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOO0O();
            }
            abstractComponentCallbacksC0593o0oOoOo0 = abstractComponentCallbacksC0593o0oOoOo0.OooOo0;
        }
        return OooO00o;
    }

    public static final void OooO0O0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, String str) {
        AbstractC0809oO0OooOO.OooOOOo(abstractComponentCallbacksC0593o0oOoOo0, "fragment");
        AbstractC0809oO0OooOO.OooOOOo(str, "previousFragmentId");
        C0611o0oo00O0 c0611o0oo00O0 = new C0611o0oo00O0(abstractComponentCallbacksC0593o0oOoOo0, "Attempting to reuse fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " with previous ID " + str);
        if (Log.isLoggable("FragmentManager", 3)) {
            c0611o0oo00O0.OooO00o.getClass();
        }
        OooO00o(abstractComponentCallbacksC0593o0oOoOo0).getClass();
        EnumC0612o0oo00OO enumC0612o0oo00OO = EnumC0612o0oo00OO.OooO00o;
        if (enumC0612o0oo00OO instanceof Void) {
            Void r3 = (Void) enumC0612o0oo00OO;
        }
    }
}


