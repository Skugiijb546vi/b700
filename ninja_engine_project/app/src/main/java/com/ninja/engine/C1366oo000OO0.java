package com.ninja.engine;

import android.view.View;
import com.app.framework.utils.ShellUtils;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.ninja.engine.oo000OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366oo000OO0 {
    public final View OooO0O0;
    public final HashMap OooO00o = new HashMap();
    public final ArrayList OooO0OO = new ArrayList();

    public C1366oo000OO0(View view) {
        this.OooO0O0 = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1366oo000OO0) {
            C1366oo000OO0 c1366oo000OO0 = (C1366oo000OO0) obj;
            if (this.OooO0O0 == c1366oo000OO0.OooO0O0 && this.OooO00o.equals(c1366oo000OO0.OooO00o)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() + (this.OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        String OooO0oO = AbstractC1230oOoOo0o.OooO0oO(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.OooO0O0 + ShellUtils.COMMAND_LINE_END, "    values:");
        for (String str : this.OooO00o.keySet()) {
            OooO0oO = OooO0oO + "    " + str + ": " + hashMap.get(str) + ShellUtils.COMMAND_LINE_END;
        }
        return OooO0oO;
    }
}
