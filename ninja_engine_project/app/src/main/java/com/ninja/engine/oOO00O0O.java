package com.ninja.engine;

import android.animation.TimeInterpolator;
import com.app.framework.utils.ShellUtils;
/* loaded from: classes.dex */
public final class oOO00O0O {
    public long OooO00o;
    public long OooO0O0;
    public TimeInterpolator OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public final TimeInterpolator OooO00o() {
        TimeInterpolator timeInterpolator = this.OooO0OO;
        if (timeInterpolator == null) {
            return o000OO0O.OooO0O0;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oOO00O0O)) {
            return false;
        }
        oOO00O0O ooo00o0o = (oOO00O0O) obj;
        if (this.OooO00o != ooo00o0o.OooO00o || this.OooO0O0 != ooo00o0o.OooO0O0 || this.OooO0Oo != ooo00o0o.OooO0Oo || this.OooO0o0 != ooo00o0o.OooO0o0) {
            return false;
        }
        return OooO00o().getClass().equals(ooo00o0o.OooO00o().getClass());
    }

    public final int hashCode() {
        long j = this.OooO00o;
        long j2 = this.OooO0O0;
        return ((((OooO00o().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.OooO0Oo) * 31) + this.OooO0o0;
    }

    public final String toString() {
        return ShellUtils.COMMAND_LINE_END + oOO00O0O.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.OooO00o + " duration: " + this.OooO0O0 + " interpolator: " + OooO00o().getClass() + " repeatCount: " + this.OooO0Oo + " repeatMode: " + this.OooO0o0 + "}\n";
    }
}
