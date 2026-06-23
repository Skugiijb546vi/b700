package com.app.framework.fake.service;

import android.content.Context;
import android.os.Process;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.io.File;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class WebViewProxy extends ClassInvocationStub {
    public static final String TAG = "WebViewProxy";

    @ProxyMethod("<init>")
    /* loaded from: classes.dex */
    public static class Constructor extends MethodHook {
        private void configureWebView(WebView webView, Context context) {
            try {
                WebSettings settings = webView.getSettings();
                if (settings != null) {
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setDatabaseEnabled(true);
                    settings.setCacheMode(-1);
                    settings.setMixedContentMode(0);
                    String userAgentString = settings.getUserAgentString();
                    if (userAgentString == null || userAgentString.contains("BlackBox")) {
                        return;
                    }
                    settings.setUserAgentString(userAgentString.concat(" BlackBox"));
                }
            } catch (Exception unused) {
            }
        }

        private WebView createFallbackWebView(Context context) {
            if (context != null) {
                try {
                    WebView webView = new WebView(context);
                    WebSettings settings = webView.getSettings();
                    if (settings != null) {
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                    }
                    return webView;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d A[Catch: Exception -> 0x0095, TRY_LEAVE, TryCatch #0 {Exception -> 0x0095, blocks: (B:10:0x0015, B:12:0x0051, B:13:0x0054, B:14:0x0085, B:16:0x008d), top: B:22:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.app.framework.fake.hook.MethodHook
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object hook(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            /*
                r5 = this;
                if (r8 == 0) goto Lf
                int r0 = r8.length     // Catch: java.lang.Exception -> L94
                if (r0 <= 0) goto Lf
                r0 = 0
                r0 = r8[r0]     // Catch: java.lang.Exception -> L94
                boolean r1 = r0 instanceof android.content.Context     // Catch: java.lang.Exception -> L94
                if (r1 == 0) goto Lf
                android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Exception -> L94
                goto L13
            Lf:
                android.content.Context r0 = com.app.framework.BlackBoxCore.getContext()     // Catch: java.lang.Exception -> L94
            L13:
                if (r0 == 0) goto L85
                r0.getPackageName()     // Catch: java.lang.Exception -> L95
                int r1 = com.app.framework.app.BActivityThread.getUserId()     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> L95
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L95
                r2.<init>()     // Catch: java.lang.Exception -> L95
                android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()     // Catch: java.lang.Exception -> L95
                java.lang.String r3 = r3.dataDir     // Catch: java.lang.Exception -> L95
                r2.append(r3)     // Catch: java.lang.Exception -> L95
                java.lang.String r3 = "/webview_"
                r2.append(r3)     // Catch: java.lang.Exception -> L95
                r2.append(r1)     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = "_"
                r2.append(r1)     // Catch: java.lang.Exception -> L95
                int r1 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L95
                r2.append(r1)     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L95
                java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L95
                r2.<init>(r1)     // Catch: java.lang.Exception -> L95
                boolean r3 = r2.exists()     // Catch: java.lang.Exception -> L95
                if (r3 != 0) goto L54
                r2.mkdirs()     // Catch: java.lang.Exception -> L95
            L54:
                java.lang.String r2 = "webview.data.dir"
                java.lang.System.setProperty(r2, r1)     // Catch: java.lang.Exception -> L95
                java.lang.String r2 = "webview.cache.dir"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L95
                r3.<init>()     // Catch: java.lang.Exception -> L95
                r3.append(r1)     // Catch: java.lang.Exception -> L95
                java.lang.String r4 = "/cache"
                r3.append(r4)     // Catch: java.lang.Exception -> L95
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L95
                java.lang.System.setProperty(r2, r3)     // Catch: java.lang.Exception -> L95
                java.lang.String r2 = "webview.cookies.dir"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L95
                r3.<init>()     // Catch: java.lang.Exception -> L95
                r3.append(r1)     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = "/cookies"
                r3.append(r1)     // Catch: java.lang.Exception -> L95
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L95
                java.lang.System.setProperty(r2, r1)     // Catch: java.lang.Exception -> L95
            L85:
                java.lang.Object r6 = r7.invoke(r6, r8)     // Catch: java.lang.Exception -> L95
                boolean r7 = r6 instanceof android.webkit.WebView     // Catch: java.lang.Exception -> L95
                if (r7 == 0) goto L93
                r7 = r6
                android.webkit.WebView r7 = (android.webkit.WebView) r7     // Catch: java.lang.Exception -> L95
                r5.configureWebView(r7, r0)     // Catch: java.lang.Exception -> L95
            L93:
                return r6
            L94:
                r0 = 0
            L95:
                android.webkit.WebView r6 = r5.createFallbackWebView(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.WebViewProxy.Constructor.hook(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    @ProxyMethod("getDataDirectory")
    /* loaded from: classes.dex */
    public static class GetDataDirectory extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Context context = BlackBoxCore.getContext();
                if (context != null) {
                    context.getPackageName();
                    String str = context.getApplicationInfo().dataDir + "/webview_" + String.valueOf(BActivityThread.getUserId()) + "_" + Process.myPid();
                    File file = new File(str);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    return str;
                }
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return "/data/data/" + BlackBoxCore.getHostPkg() + "/webview_fallback";
            }
        }
    }

    @ProxyMethod("getInstance")
    /* loaded from: classes.dex */
    public static class GetWebViewDatabaseInstance extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Context context = BlackBoxCore.getContext();
                if (context != null) {
                    context.getPackageName();
                    String valueOf = String.valueOf(BActivityThread.getUserId());
                    System.setProperty("webview.database.path", context.getApplicationInfo().dataDir + "/webview_db_" + valueOf + "_" + Process.myPid());
                }
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("loadUrl")
    /* loaded from: classes.dex */
    public static class LoadUrl extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            String str;
            if (objArr != null && objArr.length > 0 && (str = (String) objArr[0]) != null) {
                str.startsWith("file://");
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setDataDirectorySuffix")
    /* loaded from: classes.dex */
    public static class SetDataDirectorySuffix extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String str = (String) objArr[0];
                        Context context = BlackBoxCore.getContext();
                        if (context != null) {
                            context.getPackageName();
                        }
                        String valueOf = String.valueOf(BActivityThread.getUserId());
                        objArr[0] = str + "_" + valueOf + "_" + Process.myPid();
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
