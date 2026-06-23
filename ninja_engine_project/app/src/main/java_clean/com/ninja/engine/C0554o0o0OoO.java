package com.ninja.engine;

import java.util.List;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0o0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554o0o0OoO {
    public String OooO00o;
    public String OooO0O0;
    public List OooO0OO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0554o0o0OoO)) {
            return false;
        }
        C0554o0o0OoO c0554o0o0OoO = (C0554o0o0OoO) obj;
        if (Objects.equals(this.OooO00o, c0554o0o0OoO.OooO00o) && Objects.equals(this.OooO0O0, c0554o0o0OoO.OooO0O0) && Objects.equals(this.OooO0OO, c0554o0o0OoO.OooO0OO)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.OooO00o, this.OooO0O0, this.OooO0OO);
    }
}


