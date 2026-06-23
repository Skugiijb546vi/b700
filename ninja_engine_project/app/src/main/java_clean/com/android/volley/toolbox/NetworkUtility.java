package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.Cache;
import com.android.volley.ClientError;
import com.android.volley.Header;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.RetryPolicy;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
/* loaded from: classes.dex */
final class NetworkUtility {
    private static final int SLOW_REQUEST_THRESHOLD_MS = 3000;

    /* loaded from: classes.dex */
    public static class RetryInfo {
        private final VolleyError errorToRetry;
        private final String logPrefix;

        private RetryInfo(String str, VolleyError volleyError) {
            this.logPrefix = str;
            this.errorToRetry = volleyError;
        }
    }

    private NetworkUtility() {
    }

    public static void attemptRetryOnException(Request<?> request, RetryInfo retryInfo) {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(retryInfo.errorToRetry);
            String str = retryInfo.logPrefix;
            request.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
        } catch (VolleyError e) {
            String str2 = retryInfo.logPrefix;
            request.addMarker(str2 + "-timeout-giveup [timeout=" + timeoutMs + "]");
            throw e;
        }
    }

    public static NetworkResponse getNotModifiedNetworkResponse(Request<?> request, long j, List<Header> list) {
        Cache.Entry cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new NetworkResponse(304, (byte[]) null, true, j, list);
        }
        return new NetworkResponse(304, cacheEntry.data, true, j, HttpHeaderParser.combineHeaders(list, cacheEntry));
    }

    public static byte[] inputStreamToBytes(InputStream inputStream, int i, ByteArrayPool byteArrayPool) {
        byte[] bArr;
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(byteArrayPool, i);
        try {
            bArr = byteArrayPool.getBuf(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    poolingByteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    byteArrayPool.returnBuf(bArr);
                    poolingByteArrayOutputStream.close();
                    throw th;
                }
            }
            byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                VolleyLog.v("Error occurred when closing InputStream", new Object[0]);
            }
            byteArrayPool.returnBuf(bArr);
            poolingByteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static void logSlowRequests(long j, Request<?> request, byte[] bArr, int i) {
        if (VolleyLog.DEBUG || j > 3000) {
            VolleyLog.d("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount()));
        }
    }

    public static RetryInfo shouldRetryException(Request<?> request, IOException iOException, long j, HttpResponse httpResponse, byte[] bArr) {
        if (iOException instanceof SocketTimeoutException) {
            return new RetryInfo("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + request.getUrl(), iOException);
        } else if (httpResponse == null) {
            if (request.shouldRetryConnectionErrors()) {
                return new RetryInfo("connection", new NoConnectionError());
            }
            throw new NoConnectionError(iOException);
        } else {
            int statusCode = httpResponse.getStatusCode();
            VolleyLog.e("Unexpected response code %d for %s", Integer.valueOf(statusCode), request.getUrl());
            if (bArr != null) {
                NetworkResponse networkResponse = new NetworkResponse(statusCode, bArr, false, SystemClock.elapsedRealtime() - j, httpResponse.getHeaders());
                if (statusCode == 401 || statusCode == 403) {
                    return new RetryInfo("auth", new AuthFailureError(networkResponse));
                }
                if (statusCode < 400 || statusCode > 499) {
                    if (statusCode < 500 || statusCode > 599 || !request.shouldRetryServerErrors()) {
                        throw new ServerError(networkResponse);
                    }
                    return new RetryInfo("server", new ServerError(networkResponse));
                }
                throw new ClientError(networkResponse);
            }
            return new RetryInfo("network", new NetworkError());
        }
    }
}


