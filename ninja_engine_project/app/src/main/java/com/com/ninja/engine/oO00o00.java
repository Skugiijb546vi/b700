package com.ninja.engine;
/* loaded from: classes.dex */
public final class oO00o00 extends AbstractC0784oO0OOoOo {
    static {
        new AbstractC0784oO0OOoOo(1, 0, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oO00o00) {
            if (!isEmpty() || !((oO00o00) obj).isEmpty()) {
                oO00o00 oo00o00 = (oO00o00) obj;
                if (this.OooO00o == oo00o00.OooO00o) {
                    if (this.OooO0O0 == oo00o00.OooO0O0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.OooO00o * 31) + this.OooO0O0;
    }

    public final boolean isEmpty() {
        if (this.OooO00o > this.OooO0O0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.OooO00o + ".." + this.OooO0O0;
    }
}
