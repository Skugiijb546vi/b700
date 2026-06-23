package com.ninja.engine;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class oOO000OO {
    public static final ArrayDeque OooO0Oo;
    public int OooO00o;
    public int OooO0O0;
    public Object OooO0OO;

    static {
        char[] cArr = AbstractC1401oo00OOO0.OooO00o;
        OooO0Oo = new ArrayDeque(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static oOO000OO OooO00o(Object obj) {
        oOO000OO ooo000oo;
        oOO000OO ooo000oo2;
        ArrayDeque arrayDeque = OooO0Oo;
        synchronized (arrayDeque) {
            ooo000oo = (oOO000OO) arrayDeque.poll();
            ooo000oo2 = ooo000oo;
        }
        if (ooo000oo == null) {
            ooo000oo2 = new Object();
        }
        ooo000oo2.OooO0OO = obj;
        ooo000oo2.OooO0O0 = 0;
        ooo000oo2.OooO00o = 0;
        return ooo000oo2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oOO000OO)) {
            return false;
        }
        oOO000OO ooo000oo = (oOO000OO) obj;
        if (this.OooO0O0 != ooo000oo.OooO0O0 || this.OooO00o != ooo000oo.OooO00o || !this.OooO0OO.equals(ooo000oo.OooO0OO)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode() + (((this.OooO00o * 31) + this.OooO0O0) * 31);
    }
}
