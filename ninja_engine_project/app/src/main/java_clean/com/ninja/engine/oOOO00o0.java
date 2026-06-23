package com.ninja.engine;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class oOOO00o0 {
    public static final C0919oOO00oOo OooO0o0 = new C0919oOO00oOo(3);
    public final Object OooO00o;
    public final oOOO00Oo OooO0O0;
    public final String OooO0OO;
    public volatile byte[] OooO0Oo;

    public oOOO00o0(String str, Object obj, oOOO00Oo oooo00oo) {
        if (!TextUtils.isEmpty(str)) {
            this.OooO0OO = str;
            this.OooO00o = obj;
            this.OooO0O0 = oooo00oo;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static oOOO00o0 OooO00o(Object obj, String str) {
        return new oOOO00o0(str, obj, OooO0o0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oOOO00o0) {
            return this.OooO0OO.equals(((oOOO00o0) obj).OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode();
    }

    public final String toString() {
        return AbstractC1230oOoOo0o.OooO(new StringBuilder("Option{key='"), this.OooO0OO, "'}");
    }
}


