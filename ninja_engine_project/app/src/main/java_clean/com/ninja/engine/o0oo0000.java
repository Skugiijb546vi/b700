package com.ninja.engine;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o0oo0000 extends AbstractC1466oo0O0OO0 {
    public final boolean OooO0o;
    public final HashMap OooO0OO = new HashMap();
    public final HashMap OooO0Oo = new HashMap();
    public final HashMap OooO0o0 = new HashMap();
    public boolean OooO0oO = false;
    public boolean OooO0oo = false;

    public o0oo0000(boolean z) {
        this.OooO0o = z;
    }

    @Override // com.ninja.engine.AbstractC1466oo0O0OO0
    public final void OooO00o() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.OooO0oO = true;
    }

    public final void OooO0O0(String str) {
        HashMap hashMap = this.OooO0Oo;
        o0oo0000 o0oo0000Var = (o0oo0000) hashMap.get(str);
        if (o0oo0000Var != null) {
            o0oo0000Var.OooO00o();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.OooO0o0;
        C1467oo0O0OOO c1467oo0O0OOO = (C1467oo0O0OOO) hashMap2.get(str);
        if (c1467oo0O0OOO != null) {
            c1467oo0O0OOO.OooO00o();
            hashMap2.remove(str);
        }
    }

    public final void OooO0OO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (this.OooO0oo) {
            Log.isLoggable("FragmentManager", 2);
        } else if (this.OooO0OO.remove(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0) != null && Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0593o0oOoOo0.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0oo0000.class != obj.getClass()) {
            return false;
        }
        o0oo0000 o0oo0000Var = (o0oo0000) obj;
        if (this.OooO0OO.equals(o0oo0000Var.OooO0OO) && this.OooO0Oo.equals(o0oo0000Var.OooO0Oo) && this.OooO0o0.equals(o0oo0000Var.OooO0o0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.OooO0Oo.hashCode();
        return this.OooO0o0.hashCode() + ((hashCode + (this.OooO0OO.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.OooO0OO.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.OooO0Oo.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.OooO0o0.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}


