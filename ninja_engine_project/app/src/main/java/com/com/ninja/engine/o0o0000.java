package com.ninja.engine;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o0o0000 {
    public final ArrayList OooO00o;

    public o0o0000(int i) {
        switch (i) {
            case 1:
                this.OooO00o = new ArrayList();
                return;
            case 2:
                this.OooO00o = new ArrayList();
                return;
            default:
                this.OooO00o = new ArrayList();
                return;
        }
    }

    public synchronized InterfaceC1134oOOooo0 OooO00o(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C0455o0OoOo00.OooO0oO;
        }
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            C1350oo00000 c1350oo00000 = (C1350oo00000) it.next();
            if (c1350oo00000.OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(c1350oo00000.OooO0O0)) {
                return c1350oo00000.OooO0OO;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized ArrayList OooO0O0(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            C1350oo00000 c1350oo00000 = (C1350oo00000) it.next();
            if (c1350oo00000.OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(c1350oo00000.OooO0O0) && !arrayList.contains(c1350oo00000.OooO0O0)) {
                arrayList.add(c1350oo00000.OooO0O0);
            }
        }
        return arrayList;
    }
}
