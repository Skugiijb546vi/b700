package com.ninja.engine;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class oO0000O implements InterfaceC0745oO00oOo {
    public final oO000Oo0 OooO0O0;
    public final URL OooO0OO;
    public final String OooO0Oo;
    public URL OooO0o;
    public String OooO0o0;
    public volatile byte[] OooO0oO;
    public int OooO0oo;

    public oO0000O(String str) {
        oO0O00o0 oo0o00o0 = oO000Oo0.OooO00o;
        this.OooO0OO = null;
        if (!TextUtils.isEmpty(str)) {
            this.OooO0Oo = str;
            AbstractC0694o0ooooo0.OooOO0O(oo0o00o0, "Argument must not be null");
            this.OooO0O0 = oo0o00o0;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final void OooO0O0(MessageDigest messageDigest) {
        if (this.OooO0oO == null) {
            this.OooO0oO = OooO0OO().getBytes(InterfaceC0745oO00oOo.OooO00o);
        }
        messageDigest.update(this.OooO0oO);
    }

    public final String OooO0OO() {
        String str = this.OooO0Oo;
        if (str == null) {
            URL url = this.OooO0OO;
            AbstractC0694o0ooooo0.OooOO0O(url, "Argument must not be null");
            return url.toString();
        }
        return str;
    }

    public final URL OooO0Oo() {
        if (this.OooO0o == null) {
            if (TextUtils.isEmpty(this.OooO0o0)) {
                String str = this.OooO0Oo;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.OooO0OO;
                    AbstractC0694o0ooooo0.OooOO0O(url, "Argument must not be null");
                    str = url.toString();
                }
                this.OooO0o0 = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.OooO0o = new URL(this.OooO0o0);
        }
        return this.OooO0o;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof oO0000O)) {
            return false;
        }
        oO0000O oo0000o = (oO0000O) obj;
        if (!OooO0OO().equals(oo0000o.OooO0OO()) || !this.OooO0O0.equals(oo0000o.OooO0O0)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0745oO00oOo
    public final int hashCode() {
        if (this.OooO0oo == 0) {
            int hashCode = OooO0OO().hashCode();
            this.OooO0oo = hashCode;
            this.OooO0oo = this.OooO0O0.hashCode() + (hashCode * 31);
        }
        return this.OooO0oo;
    }

    public final String toString() {
        return OooO0OO();
    }

    public oO0000O(URL url) {
        oO0O00o0 oo0o00o0 = oO000Oo0.OooO00o;
        AbstractC0694o0ooooo0.OooOO0O(url, "Argument must not be null");
        this.OooO0OO = url;
        this.OooO0Oo = null;
        AbstractC0694o0ooooo0.OooOO0O(oo0o00o0, "Argument must not be null");
        this.OooO0O0 = oo0o00o0;
    }
}


