package com.ninja.engine;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
/* loaded from: classes.dex */
public final class o0OOOO0o implements Cloneable {
    public URLConnection OooO00o;

    public final void OooO00o(C0413o0Oo0O0 c0413o0Oo0O0) {
        URLConnection openConnection = new URL(c0413o0Oo0O0.OooO00o).openConnection();
        this.OooO00o = openConnection;
        openConnection.setReadTimeout(c0413o0Oo0O0.OooO0oO);
        this.OooO00o.setConnectTimeout(c0413o0Oo0O0.OooO0oo);
        Locale locale = Locale.ENGLISH;
        long j = c0413o0Oo0O0.OooO0o0;
        this.OooO00o.addRequestProperty("Range", "bytes=" + j + "-");
        URLConnection uRLConnection = this.OooO00o;
        if (c0413o0Oo0O0.OooO == null) {
            C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
            if (((String) c0303o0O0Oo0o.OooO0OO) == null) {
                synchronized (C0303o0O0Oo0o.class) {
                    try {
                        if (((String) c0303o0O0Oo0o.OooO0OO) == null) {
                            c0303o0O0Oo0o.OooO0OO = "PRDownloader";
                        }
                    } finally {
                    }
                }
            }
            c0413o0Oo0O0.OooO = (String) c0303o0O0Oo0o.OooO0OO;
        }
        uRLConnection.addRequestProperty("User-Agent", c0413o0Oo0O0.OooO);
        this.OooO00o.connect();
    }

    public final int OooO0O0() {
        URLConnection uRLConnection = this.OooO00o;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    public final Object clone() {
        return new Object();
    }
}


