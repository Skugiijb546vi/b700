package com.app.framework.app;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.GoogleSignInWebViewActivity;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public class GoogleSignInWebViewActivity extends Activity {
    private static final String CLIENT_ID = "697261581904-997ch5oh85im8rcq2lt172jbu92gjha6.apps.googleusercontent.com";
    private static final String FIREBASE_ORIGIN = "https://api-project-697261581904.firebaseapp.com";
    private static final String REDIRECT_URI = "https://api-project-697261581904.firebaseapp.com/__/auth/handler";
    private static final String TAG = "PlayIntegrity";
    private WebView webView;
    private boolean tokenHandled = false;
    private int mUserId = 0;

    /* renamed from: com.app.framework.app.GoogleSignInWebViewActivity$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends WebViewClient {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPageFinished$0(String str) {
            if (str != null) {
                String replace = str.replace("\"", "");
                if (replace.contains("id_token=")) {
                    GoogleSignInWebViewActivity.this.extractAndDeliver(replace);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str != null) {
                if (str.startsWith(GoogleSignInWebViewActivity.REDIRECT_URI) || str.startsWith(GoogleSignInWebViewActivity.REDIRECT_URI)) {
                    webView.evaluateJavascript("(function(){ return window.location.hash; })()", new ValueCallback() { // from class: com.app.framework.app.OooO00o
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj) {
                            GoogleSignInWebViewActivity.AnonymousClass2.this.lambda$onPageFinished$0((String) obj);
                        }
                    });
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            CharSequence description;
            if (webResourceRequest.isForMainFrame()) {
                webResourceError.getErrorCode();
                description = webResourceError.getDescription();
                Objects.toString(description);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String fragment;
            Uri url = webResourceRequest.getUrl();
            if (url == null) {
                return false;
            }
            String uri = url.toString();
            if ((uri.startsWith(GoogleSignInWebViewActivity.REDIRECT_URI) || uri.startsWith(GoogleSignInWebViewActivity.REDIRECT_URI)) && (fragment = url.getFragment()) != null && fragment.contains("id_token=")) {
                GoogleSignInWebViewActivity.this.extractAndDeliver(fragment);
                return true;
            }
            return false;
        }
    }

    private void bringGameToFront() {
        ComponentName componentName;
        try {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (activityManager == null) {
                return;
            }
            int taskId = getTaskId();
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo.id != taskId) {
                    componentName = taskInfo.baseActivity;
                    if (componentName != null) {
                        componentName.getClassName();
                    }
                    appTask.moveToFront();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void extractAndDeliver(String str) {
        String str2;
        if (this.tokenHandled) {
            return;
        }
        this.tokenHandled = true;
        String[] split = str.replace("#", "").split("&");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str2 = null;
                break;
            }
            String str3 = split[i];
            if (str3.startsWith("id_token=")) {
                str2 = str3.substring(9);
                break;
            }
            i++;
        }
        if (str2 == null || str2.isEmpty()) {
            Intent intent = new Intent(GoogleSignInHelper.ACTION_GSI_CANCEL);
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
        } else {
            GoogleSignInHelper.cacheToken(BlackBoxCore.getContext(), str2, this.mUserId);
            Intent intent2 = new Intent(GoogleSignInHelper.ACTION_GSI_TOKEN);
            intent2.putExtra("id_token", str2);
            intent2.setPackage(getPackageName());
            sendBroadcast(intent2);
        }
        bringGameToFront();
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.webView;
        if (webView != null && webView.canGoBack()) {
            this.webView.goBack();
            return;
        }
        Intent intent = new Intent(GoogleSignInHelper.ACTION_GSI_CANCEL);
        intent.setPackage(getPackageName());
        sendBroadcast(intent);
        bringGameToFront();
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        int intExtra = intent != null ? intent.getIntExtra(GoogleSignInHelper.EXTRA_USER_ID, -1) : -1;
        this.mUserId = intExtra;
        if (intExtra < 0) {
            int userId = BlackBoxCore.getUserId();
            this.mUserId = userId;
            if (userId < 0) {
                this.mUserId = 0;
            }
        }
        final String str = "https://accounts.google.com/o/oauth2/v2/auth?client_id=697261581904-997ch5oh85im8rcq2lt172jbu92gjha6.apps.googleusercontent.com&redirect_uri=" + Uri.encode(REDIRECT_URI) + "&response_type=id_token&scope=openid%20email%20profile&nonce=" + UUID.randomUUID().toString().replace("-", "") + "&prompt=select_account%20consent";
        WebView webView = new WebView(this);
        this.webView = webView;
        setContentView(webView);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(2);
        settings.setMixedContentMode(0);
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            settings.setUserAgentString(userAgentString.replace("; wv", ""));
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.webView, true);
        this.webView.clearCache(true);
        this.webView.clearHistory();
        this.webView.getSettings().setMixedContentMode(0);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.getSettings().setDatabaseEnabled(true);
        this.webView.addJavascriptInterface(new Object() { // from class: com.app.framework.app.GoogleSignInWebViewActivity.1
            @JavascriptInterface
            public void onHash(String str2) {
                if (str2 == null || !str2.contains("id_token=")) {
                    return;
                }
                GoogleSignInWebViewActivity.this.extractAndDeliver(str2);
            }
        }, "TokenBridge");
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.setWebViewClient(new AnonymousClass2());
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.app.framework.app.GoogleSignInWebViewActivity.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                //GoogleSignInWebViewActivity.this.mUserId;
                WebStorage.getInstance().deleteAllData();
                GoogleSignInWebViewActivity.this.webView.clearFormData();
                GoogleSignInWebViewActivity.this.webView.clearCache(true);
                GoogleSignInWebViewActivity.this.webView.clearHistory();
                GoogleSignInWebViewActivity.this.webView.loadUrl(str);
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
        }
        super.onDestroy();
    }
}
