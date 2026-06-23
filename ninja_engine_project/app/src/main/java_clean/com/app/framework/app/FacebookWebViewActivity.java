package com.app.framework.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;
/* loaded from: classes.dex */
public class FacebookWebViewActivity extends Activity {
    public static final String EXTRA_URL = "fb_oauth_url";
    public static final String EXTRA_USER_ID = "fb_target_user_id";
    private static final String TAG = "FacebookWebView";
    private boolean redirectHandled = false;
    private int targetUserId = -1;
    private WebView webView;

    /* JADX INFO: Access modifiers changed from: private */
    public void handleRedirect(Uri uri) {
        if (this.redirectHandled) {
            return;
        }
        this.redirectHandled = true;
        Objects.toString(uri);
        int i = this.targetUserId;
        if (i >= 0) {
            try {
                FacebookSignInHelper.cacheTokenFromRedirect(uri, i);
            } catch (Exception unused) {
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        startActivity(intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.webView;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.webView.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.targetUserId = getIntent() != null ? getIntent().getIntExtra(EXTRA_USER_ID, -1) : -1;
        String stringExtra = getIntent() != null ? getIntent().getStringExtra(EXTRA_URL) : null;
        if (stringExtra == null) {
            finish();
            return;
        }
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.app.framework.app.FacebookWebViewActivity.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
            }
        });
        WebStorage.getInstance().deleteAllData();
        WebView webView = new WebView(this);
        this.webView = webView;
        setContentView(webView);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setCacheMode(2);
        settings.setMixedContentMode(0);
        WebView.setWebContentsDebuggingEnabled(true);
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            settings.setUserAgentString(userAgentString.replace("; wv", ""));
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.webView, true);
        this.webView.clearFormData();
        this.webView.clearCache(true);
        this.webView.clearHistory();
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.setWebViewClient(new WebViewClient() { // from class: com.app.framework.app.FacebookWebViewActivity.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                super.onPageStarted(webView2, str, bitmap);
                if (str != null) {
                    if (str.startsWith("fb165073083517174://") || str.startsWith("fbconnect://")) {
                        FacebookWebViewActivity.this.handleRedirect(Uri.parse(str));
                    } else if (str.startsWith("intent://")) {
                        try {
                            Uri data = Intent.parseUri(str, 1).getData();
                            if (data != null) {
                                FacebookWebViewActivity.this.handleRedirect(data);
                            }
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                CharSequence description;
                if (webResourceRequest.getUrl() != null) {
                    webResourceRequest.getUrl().toString();
                }
                webResourceError.getErrorCode();
                description = webResourceError.getDescription();
                Objects.toString(description);
                webResourceRequest.isForMainFrame();
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                String uri;
                int indexOf;
                Uri url = webResourceRequest.getUrl();
                if (url == null) {
                    return false;
                }
                String scheme = url.getScheme();
                if ("fb165073083517174".equals(scheme) || "fbconnect".equals(scheme)) {
                    url.toString();
                    FacebookWebViewActivity.this.handleRedirect(url);
                    return true;
                } else if ("intent".equals(scheme)) {
                    url.toString();
                    try {
                        Intent parseUri = Intent.parseUri(url.toString(), 1);
                        Uri data = parseUri.getData();
                        if (data != null) {
                            String scheme2 = data.getScheme();
                            if (!"fb165073083517174".equals(scheme2)) {
                                if ("fbconnect".equals(scheme2)) {
                                }
                            }
                            data.toString();
                            FacebookWebViewActivity.this.handleRedirect(data);
                            return true;
                        }
                        String scheme3 = parseUri.getScheme();
                        if (("fb165073083517174".equals(scheme3) || "fbconnect".equals(scheme3)) && (indexOf = (uri = url.toString()).indexOf("#Intent;")) > 9) {
                            String substring = uri.substring(9, indexOf);
                            Uri parse = Uri.parse(scheme3 + "://" + substring);
                            Objects.toString(parse);
                            FacebookWebViewActivity.this.handleRedirect(parse);
                            return true;
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    return true;
                } else {
                    return false;
                }
            }
        });
        this.webView.loadUrl(stringExtra);
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


