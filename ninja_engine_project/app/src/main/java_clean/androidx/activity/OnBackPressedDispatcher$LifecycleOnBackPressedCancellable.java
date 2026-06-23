package androidx.activity;

import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC0955oOO0oOoO;
import com.ninja.engine.C0957oOO0oo;
import com.ninja.engine.C0962oOO0ooO0;
import com.ninja.engine.InterfaceC0266o00ooOO0;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC1800ooOOOoOo, InterfaceC0266o00ooOO0 {
    public final androidx.lifecycle.OooO00o OooO00o;
    public final AbstractC0955oOO0oOoO OooO0O0;
    public C0957oOO0oo OooO0OO;
    public final /* synthetic */ OooO0O0 OooO0Oo;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(OooO0O0 oooO0O0, androidx.lifecycle.OooO00o oooO00o, AbstractC0955oOO0oOoO abstractC0955oOO0oOoO) {
        AbstractC0809oO0OooOO.OooOOOo(abstractC0955oOO0oOoO, "onBackPressedCallback");
        this.OooO0Oo = oooO0O0;
        this.OooO00o = oooO00o;
        this.OooO0O0 = abstractC0955oOO0oOoO;
        oooO00o.OooO00o(this);
    }

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        if (oo0o0o0o == oO0O0O0o.ON_START) {
            OooO0O0 oooO0O0 = this.OooO0Oo;
            oooO0O0.getClass();
            AbstractC0955oOO0oOoO abstractC0955oOO0oOoO = this.OooO0O0;
            AbstractC0809oO0OooOO.OooOOOo(abstractC0955oOO0oOoO, "onBackPressedCallback");
            oooO0O0.OooO0O0.addLast(abstractC0955oOO0oOoO);
            C0957oOO0oo c0957oOO0oo = new C0957oOO0oo(oooO0O0, abstractC0955oOO0oOoO);
            abstractC0955oOO0oOoO.OooO0O0.add(c0957oOO0oo);
            oooO0O0.OooO0Oo();
            abstractC0955oOO0oOoO.OooO0OO = new C0962oOO0ooO0(oooO0O0, 1);
            this.OooO0OO = c0957oOO0oo;
        } else if (oo0o0o0o == oO0O0O0o.ON_STOP) {
            C0957oOO0oo c0957oOO0oo2 = this.OooO0OO;
            if (c0957oOO0oo2 != null) {
                c0957oOO0oo2.cancel();
            }
        } else if (oo0o0o0o == oO0O0O0o.ON_DESTROY) {
            cancel();
        }
    }

    @Override // com.ninja.engine.InterfaceC0266o00ooOO0
    public final void cancel() {
        this.OooO00o.OooO0o(this);
        AbstractC0955oOO0oOoO abstractC0955oOO0oOoO = this.OooO0O0;
        abstractC0955oOO0oOoO.getClass();
        abstractC0955oOO0oOoO.OooO0O0.remove(this);
        C0957oOO0oo c0957oOO0oo = this.OooO0OO;
        if (c0957oOO0oo != null) {
            c0957oOO0oo.cancel();
        }
        this.OooO0OO = null;
    }
}


