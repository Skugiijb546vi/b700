package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import com.android.volley.toolbox.HttpClientStack;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes.dex */
public class HurlStack extends BaseHttpStack {
    private static final int HTTP_CONTINUE = 100;
    private final SSLSocketFactory mSslSocketFactory;
    private final UrlRewriter mUrlRewriter;

    /* loaded from: classes.dex */
    public static class UrlConnectionInputStream extends FilterInputStream {
        private final HttpURLConnection mConnection;

        public UrlConnectionInputStream(HttpURLConnection httpURLConnection) {
            super(HurlStack.inputStreamFromConnection(httpURLConnection));
            this.mConnection = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            super.close();
            this.mConnection.disconnect();
        }
    }

    /* loaded from: classes.dex */
    public interface UrlRewriter extends com.android.volley.toolbox.UrlRewriter {
    }

    public HurlStack() {
        this(null);
    }

    private void addBody(HttpURLConnection httpURLConnection, Request<?> request, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey(HttpHeaderParser.HEADER_CONTENT_TYPE)) {
            httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, request.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(createOutputStream(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void addBodyIfExists(HttpURLConnection httpURLConnection, Request<?> request) {
        byte[] body = request.getBody();
        if (body != null) {
            addBody(httpURLConnection, request, body);
        }
    }

    public static List<Header> convertHeaders(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new Header(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static boolean hasResponseBody(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream inputStreamFromConnection(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection openConnection(URL url, Request<?> request) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection createConnection = createConnection(url);
        int timeoutMs = request.getTimeoutMs();
        createConnection.setConnectTimeout(timeoutMs);
        createConnection.setReadTimeout(timeoutMs);
        createConnection.setUseCaches(false);
        createConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.mSslSocketFactory) != null) {
            ((HttpsURLConnection) createConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        return createConnection;
    }

    public HttpURLConnection createConnection(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    public InputStream createInputStream(Request<?> request, HttpURLConnection httpURLConnection) {
        return new UrlConnectionInputStream(httpURLConnection);
    }

    public OutputStream createOutputStream(Request<?> request, HttpURLConnection httpURLConnection, int i) {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public HttpResponse executeRequest(Request<?> request, Map<String, String> map) {
        String url = request.getUrl();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        UrlRewriter urlRewriter = this.mUrlRewriter;
        if (urlRewriter != null) {
            String rewriteUrl = urlRewriter.rewriteUrl(url);
            if (rewriteUrl != null) {
                url = rewriteUrl;
            } else {
                throw new IOException(AbstractC1230oOoOo0o.OooOO0o("URL blocked by rewriter: ", url));
            }
        }
        HttpURLConnection openConnection = openConnection(new URL(url), request);
        try {
            for (String str : hashMap.keySet()) {
                openConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            setConnectionParametersForRequest(openConnection, request);
            int responseCode = openConnection.getResponseCode();
            if (responseCode != -1) {
                if (!hasResponseBody(request.getMethod(), responseCode)) {
                    HttpResponse httpResponse = new HttpResponse(responseCode, convertHeaders(openConnection.getHeaderFields()));
                    openConnection.disconnect();
                    return httpResponse;
                }
                return new HttpResponse(responseCode, convertHeaders(openConnection.getHeaderFields()), openConnection.getContentLength(), createInputStream(request, openConnection));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                openConnection.disconnect();
            }
            throw th;
        }
    }

    public void setConnectionParametersForRequest(HttpURLConnection httpURLConnection, Request<?> request) {
        String str;
        String str2;
        switch (request.getMethod()) {
            case -1:
                byte[] postBody = request.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    addBody(httpURLConnection, request, postBody);
                    return;
                }
                return;
            case 0:
                str = "GET";
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                addBodyIfExists(httpURLConnection, request);
                return;
            case 2:
                str2 = "PUT";
                httpURLConnection.setRequestMethod(str2);
                addBodyIfExists(httpURLConnection, request);
                return;
            case 3:
                str = "DELETE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = "HEAD";
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = "OPTIONS";
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = "TRACE";
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = HttpClientStack.HttpPatch.METHOD_NAME;
                httpURLConnection.setRequestMethod(str2);
                addBodyIfExists(httpURLConnection, request);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public HurlStack(UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    public HurlStack(UrlRewriter urlRewriter, SSLSocketFactory sSLSocketFactory) {
        this.mUrlRewriter = urlRewriter;
        this.mSslSocketFactory = sSLSocketFactory;
    }
}


