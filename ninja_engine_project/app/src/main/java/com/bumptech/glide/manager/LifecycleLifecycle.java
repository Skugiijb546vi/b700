package com.bumptech.glide.manager;

import com.ninja.engine.AbstractC1401oo00OOO0;
import com.ninja.engine.EnumC0759oO0O0o;
import com.ninja.engine.InterfaceC0757oO0O0Oo;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC0967oOO0oooO;
import com.ninja.engine.oO0O0O;
import com.ninja.engine.oO0O0O0o;
import com.ninja.engine.oO0O0Oo0;
import java.util.HashSet;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements oO0O0O, InterfaceC0757oO0O0Oo {
    public final HashSet OooO00o = new HashSet();
    public final androidx.lifecycle.OooO00o OooO0O0;

    public LifecycleLifecycle(androidx.lifecycle.OooO00o oooO00o) {
        this.OooO0O0 = oooO00o;
        oooO00o.OooO00o(this);
    }

    @Override // com.ninja.engine.oO0O0O
    public final void OooOO0o(oO0O0Oo0 oo0o0oo0) {
        this.OooO00o.add(oo0o0oo0);
        EnumC0759oO0O0o enumC0759oO0O0o = this.OooO0O0.OooO0OO;
        if (enumC0759oO0O0o == EnumC0759oO0O0o.OooO00o) {
            oo0o0oo0.OooOO0O();
        } else if (enumC0759oO0O0o.compareTo(EnumC0759oO0O0o.OooO0Oo) >= 0) {
            oo0o0oo0.OooOO0();
        } else {
            oo0o0oo0.OooO0O0();
        }
    }

    @Override // com.ninja.engine.oO0O0O
    public final void OooOOO0(oO0O0Oo0 oo0o0oo0) {
        this.OooO00o.remove(oo0o0oo0);
    }

    @InterfaceC0967oOO0oooO(oO0O0O0o.ON_DESTROY)
    public void onDestroy(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O) {
        Iterator it = AbstractC1401oo00OOO0.OooO0o0(this.OooO00o).iterator();
        while (it.hasNext()) {
            ((oO0O0Oo0) it.next()).OooOO0O();
        }
        interfaceC0760oO0O0o0O.OooO0o0().OooO0o(this);
    }

    @InterfaceC0967oOO0oooO(oO0O0O0o.ON_START)
    public void onStart(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O) {
        Iterator it = AbstractC1401oo00OOO0.OooO0o0(this.OooO00o).iterator();
        while (it.hasNext()) {
            ((oO0O0Oo0) it.next()).OooOO0();
        }
    }

    @InterfaceC0967oOO0oooO(oO0O0O0o.ON_STOP)
    public void onStop(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O) {
        Iterator it = AbstractC1401oo00OOO0.OooO0o0(this.OooO00o).iterator();
        while (it.hasNext()) {
            ((oO0O0Oo0) it.next()).OooO0O0();
        }
    }
}
