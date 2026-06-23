package com.ninja.engine;

import android.content.res.Resources;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133oOOooo {
    public final Resources OooO00o;
    public final Resources.Theme OooO0O0;

    public C1133oOOooo(Resources resources, Resources.Theme theme) {
        this.OooO00o = resources;
        this.OooO0O0 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1133oOOooo.class != obj.getClass()) {
            return false;
        }
        C1133oOOooo c1133oOOooo = (C1133oOOooo) obj;
        if (this.OooO00o.equals(c1133oOOooo.OooO00o) && Objects.equals(this.OooO0O0, c1133oOOooo.OooO0O0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.OooO00o, this.OooO0O0);
    }
}
