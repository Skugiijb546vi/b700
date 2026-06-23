package androidx.lifecycle;

import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1800ooOOOoOo {
    public boolean OooO00o;

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        if (oo0o0o0o == oO0O0O0o.ON_DESTROY) {
            this.OooO00o = false;
            interfaceC0760oO0O0o0O.OooO0o0().OooO0o(this);
        }
    }
}
