package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.OooO00o;
import androidx.lifecycle.SavedStateHandleController;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1466oo0O0OO0;
import com.ninja.engine.C0086o000Oo00;
import com.ninja.engine.C1467oo0O0OOO;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1191oOoOO0O;
import com.ninja.engine.InterfaceC1192oOoOO0OO;
import com.ninja.engine.InterfaceC1468oo0O0OOo;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC1800ooOOOoOo {
    public final InterfaceC1192oOoOO0OO OooO00o;

    public Recreator(InterfaceC1192oOoOO0OO interfaceC1192oOoOO0OO) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC1192oOoOO0OO, "owner");
        this.OooO00o = interfaceC1192oOoOO0OO;
    }

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        Object obj;
        boolean z;
        if (oo0o0o0o == oO0O0O0o.ON_CREATE) {
            interfaceC0760oO0O0o0O.OooO0o0().OooO0o(this);
            Bundle OooO0OO = this.OooO00o.OooO00o().OooO0OO("androidx.savedstate.Restarter");
            if (OooO0OO == null) {
                return;
            }
            ArrayList<String> stringArrayList = OooO0OO.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC1191oOoOO0O.class);
                        AbstractC0809oO0OooOO.OooOOOO(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                AbstractC0809oO0OooOO.OooOOOO(newInstance, "{\n                constr…wInstance()\n            }");
                                InterfaceC1191oOoOO0O interfaceC1191oOoOO0O = (InterfaceC1191oOoOO0O) newInstance;
                                InterfaceC1192oOoOO0OO interfaceC1192oOoOO0OO = this.OooO00o;
                                AbstractC0809oO0OooOO.OooOOOo(interfaceC1192oOoOO0OO, "owner");
                                if (interfaceC1192oOoOO0OO instanceof InterfaceC1468oo0O0OOo) {
                                    C1467oo0O0OOO OooO0Oo = ((InterfaceC1468oo0O0OOo) interfaceC1192oOoOO0OO).OooO0Oo();
                                    C0086o000Oo00 OooO00o = interfaceC1192oOoOO0OO.OooO00o();
                                    OooO0Oo.getClass();
                                    Iterator it = new HashSet(OooO0Oo.OooO00o.keySet()).iterator();
                                    while (it.hasNext()) {
                                        String str2 = (String) it.next();
                                        AbstractC0809oO0OooOO.OooOOOo(str2, "key");
                                        AbstractC1466oo0O0OO0 abstractC1466oo0O0OO0 = (AbstractC1466oo0O0OO0) OooO0Oo.OooO00o.get(str2);
                                        AbstractC0809oO0OooOO.OooOO0o(abstractC1466oo0O0OO0);
                                        OooO00o OooO0o0 = interfaceC1192oOoOO0OO.OooO0o0();
                                        AbstractC0809oO0OooOO.OooOOOo(OooO00o, "registry");
                                        AbstractC0809oO0OooOO.OooOOOo(OooO0o0, "lifecycle");
                                        HashMap hashMap = abstractC1466oo0O0OO0.OooO00o;
                                        if (hashMap == null) {
                                            obj = null;
                                        } else {
                                            synchronized (hashMap) {
                                                obj = abstractC1466oo0O0OO0.OooO00o.get("androidx.lifecycle.savedstate.vm.tag");
                                            }
                                        }
                                        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                        if (savedStateHandleController != null && !(z = savedStateHandleController.OooO00o)) {
                                            if (!(!z)) {
                                                throw new IllegalStateException("Already attached to lifecycleOwner".toString());
                                            }
                                            savedStateHandleController.OooO00o = true;
                                            OooO0o0.OooO00o(savedStateHandleController);
                                            throw null;
                                        }
                                    }
                                    if (!new HashSet(OooO0Oo.OooO00o.keySet()).isEmpty()) {
                                        OooO00o.OooO0o();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC1230oOoOo0o.OooOO0o("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC1230oOoOo0o.OooO0oo("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
