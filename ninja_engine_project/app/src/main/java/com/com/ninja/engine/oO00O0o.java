package com.ninja.engine;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* loaded from: classes.dex */
public final class oO00O0o implements InterfaceC0346o0OO0o0 {
    public final oO0000O OooO00o;
    public final int OooO0O0;
    public HttpURLConnection OooO0OO;
    public InputStream OooO0Oo;
    public volatile boolean OooO0o0;

    public oO00O0o(oO0000O oo0000o, int i) {
        this.OooO00o = oo0000o;
        this.OooO0O0 = i;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        return InputStream.class;
    }

    public final InputStream OooO0O0(URL url, int i, URL url2, Map map) {
        int i2;
        InputStream inputStream;
        int i3 = -1;
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C1834ooOOooOo("In re-direct loop", -1, null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i4 = this.OooO0O0;
                httpURLConnection.setConnectTimeout(i4);
                httpURLConnection.setReadTimeout(i4);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.OooO0OO = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.OooO0Oo = this.OooO0OO.getInputStream();
                    if (this.OooO0o0) {
                        return null;
                    }
                    try {
                        i2 = this.OooO0OO.getResponseCode();
                    } catch (IOException unused2) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                        i2 = -1;
                    }
                    int i5 = i2 / 100;
                    if (i5 == 2) {
                        HttpURLConnection httpURLConnection2 = this.OooO0OO;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                inputStream = new C0320o0O0oO(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    httpURLConnection2.getContentEncoding();
                                }
                                inputStream = httpURLConnection2.getInputStream();
                            }
                            this.OooO0Oo = inputStream;
                            return this.OooO0Oo;
                        } catch (IOException e) {
                            try {
                                i3 = httpURLConnection2.getResponseCode();
                            } catch (IOException unused3) {
                                Log.isLoggable("HttpUrlFetcher", 3);
                            }
                            throw new C1834ooOOooOo("Failed to obtain InputStream", i3, e);
                        }
                    } else if (i5 == 3) {
                        String headerField = this.OooO0OO.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                OooO0OO();
                                return OooO0O0(url3, i + 1, url, map);
                            } catch (MalformedURLException e2) {
                                throw new C1834ooOOooOo(AbstractC1230oOoOo0o.OooOO0o("Bad redirect url: ", headerField), i2, e2);
                            }
                        }
                        throw new C1834ooOOooOo("Received empty or null redirect url", i2, null);
                    } else if (i2 == -1) {
                        throw new C1834ooOOooOo("Http request failed", i2, null);
                    } else {
                        try {
                            throw new C1834ooOOooOo(this.OooO0OO.getResponseMessage(), i2, null);
                        } catch (IOException e3) {
                            throw new C1834ooOOooOo("Failed to get a response message", i2, e3);
                        }
                    }
                } catch (IOException e4) {
                    try {
                        i3 = this.OooO0OO.getResponseCode();
                    } catch (IOException unused4) {
                        Log.isLoggable("HttpUrlFetcher", 3);
                    }
                    throw new C1834ooOOooOo("Failed to connect or obtain data", i3, e4);
                }
            } catch (IOException e5) {
                throw new C1834ooOOooOo("URL.openConnection threw", 0, e5);
            }
        }
        throw new C1834ooOOooOo("Too many (> 5) redirects!", -1, null);
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        InputStream inputStream = this.OooO0Oo;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.OooO0OO;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.OooO0OO = null;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final int OooO0o() {
        return 2;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0o0(EnumC1000oOOOO0oo enumC1000oOOOO0oo, o0OO0o00 o0oo0o00) {
        oO0000O oo0000o = this.OooO00o;
        int i = oO0o0000.OooO00o;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                o0oo0o00.OooO0Oo(OooO0O0(oo0000o.OooO0Oo(), 0, null, oo0000o.OooO0O0.OooO00o()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e) {
                Log.isLoggable("HttpUrlFetcher", 3);
                o0oo0o00.OooO0O0(e);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
        this.OooO0o0 = true;
    }
}
