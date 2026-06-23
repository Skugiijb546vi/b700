package androidx.lifecycle;

import android.os.Bundle;
import com.ninja.engine.C1189oOoOO00O;
import com.ninja.engine.C1190oOoOO00o;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1800ooOOOoOo {
    public final C1189oOoOO00O OooO00o;

    public SavedStateHandleAttacher(C1189oOoOO00O c1189oOoOO00O) {
        this.OooO00o = c1189oOoOO00O;
    }

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        if (oo0o0o0o == oO0O0O0o.ON_CREATE) {
            interfaceC0760oO0O0o0O.OooO0o0().OooO0o(this);
            C1189oOoOO00O c1189oOoOO00O = this.OooO00o;
            if (!c1189oOoOO00O.OooO0O0) {
                Bundle OooO0OO = c1189oOoOO00O.OooO00o.OooO0OO("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = c1189oOoOO00O.OooO0OO;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (OooO0OO != null) {
                    bundle.putAll(OooO0OO);
                }
                c1189oOoOO00O.OooO0OO = bundle;
                c1189oOoOO00O.OooO0O0 = true;
                C1190oOoOO00o c1190oOoOO00o = (C1190oOoOO00o) c1189oOoOO00O.OooO0Oo.OooO00o();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oo0o0o0o).toString());
    }
}
