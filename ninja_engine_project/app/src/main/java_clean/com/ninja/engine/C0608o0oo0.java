package com.ninja.engine;

import android.transition.Transition;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608o0oo0 implements Transition.TransitionListener {
    public final /* synthetic */ Object OooO00o;
    public final /* synthetic */ ArrayList OooO0O0;
    public final /* synthetic */ C0619o0oo0O0 OooO0oO;
    public final /* synthetic */ Object OooO0OO = null;
    public final /* synthetic */ ArrayList OooO0Oo = null;
    public final /* synthetic */ Object OooO0o0 = null;
    public final /* synthetic */ ArrayList OooO0o = null;

    public C0608o0oo0(C0619o0oo0O0 c0619o0oo0O0, Object obj, ArrayList arrayList) {
        this.OooO0oO = c0619o0oo0O0;
        this.OooO00o = obj;
        this.OooO0O0 = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C0619o0oo0O0 c0619o0oo0O0 = this.OooO0oO;
        Object obj = this.OooO00o;
        if (obj != null) {
            c0619o0oo0O0.OooOOO0(obj, this.OooO0O0, null);
        }
        Object obj2 = this.OooO0OO;
        if (obj2 != null) {
            c0619o0oo0O0.OooOOO0(obj2, this.OooO0Oo, null);
        }
        Object obj3 = this.OooO0o0;
        if (obj3 != null) {
            c0619o0oo0O0.OooOOO0(obj3, this.OooO0o, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}


