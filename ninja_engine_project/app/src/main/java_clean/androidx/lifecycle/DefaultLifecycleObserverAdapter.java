package androidx.lifecycle;

import com.ninja.engine.AbstractC0369o0OOOoO0;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.InterfaceC0363o0OOOo;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC1800ooOOOoOo {
    public final InterfaceC0363o0OOOo OooO00o;
    public final InterfaceC1800ooOOOoOo OooO0O0;

    public DefaultLifecycleObserverAdapter(InterfaceC0363o0OOOo interfaceC0363o0OOOo, InterfaceC1800ooOOOoOo interfaceC1800ooOOOoOo) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0363o0OOOo, "defaultLifecycleObserver");
        this.OooO00o = interfaceC0363o0OOOo;
        this.OooO0O0 = interfaceC1800ooOOOoOo;
    }

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        int i = AbstractC0369o0OOOoO0.OooO00o[oo0o0o0o.ordinal()];
        InterfaceC0363o0OOOo interfaceC0363o0OOOo = this.OooO00o;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                interfaceC0363o0OOOo.getClass();
                break;
            case 3:
                interfaceC0363o0OOOo.OooO00o();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1800ooOOOoOo interfaceC1800ooOOOoOo = this.OooO0O0;
        if (interfaceC1800ooOOOoOo != null) {
            interfaceC1800ooOOOoOo.OooO0O0(interfaceC0760oO0O0o0O, oo0o0o0o);
        }
    }
}


