package com.app.framework.fake.service;

import android.content.pm.PackageInfo;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class IWebViewUpdateServiceProxy extends ClassInvocationStub {
    public static final String TAG = "IWebViewUpdateServiceProxy";

    @ProxyMethod("disableWebViewPackage")
    /* loaded from: classes.dex */
    public static class DisableWebViewPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                String str = (String) objArr[0];
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("enableWebViewPackage")
    /* loaded from: classes.dex */
    public static class EnableWebViewPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                String str = (String) objArr[0];
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return Boolean.TRUE;
            }
        }
    }

    @ProxyMethod("getCurrentWebViewPackage")
    /* loaded from: classes.dex */
    public static class GetCurrentWebViewPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("getValidWebViewPackages")
    /* loaded from: classes.dex */
    public static class GetValidWebViewPackages extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null && (invoke instanceof PackageInfo[])) {
                    if (((PackageInfo[]) invoke).length > 0) {
                        return invoke;
                    }
                }
            } catch (Exception unused) {
            }
            return new PackageInfo[0];
        }
    }

    @ProxyMethod("getWebViewPackages")
    /* loaded from: classes.dex */
    public static class GetWebViewPackages extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
            } catch (Exception unused) {
            }
            return new ArrayList();
        }
    }

    @ProxyMethod("getWebViewProvider")
    /* loaded from: classes.dex */
    public static class GetWebViewProvider extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("getWebViewProviderInfo")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderInfo extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("isMultiProcessEnabled")
    /* loaded from: classes.dex */
    public static class IsMultiProcessEnabled extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("isWebViewPackage")
    /* loaded from: classes.dex */
    public static class IsWebViewPackage extends MethodHook {
        private boolean isKnownWebViewPackage(String str) {
            if (str == null) {
                return false;
            }
            return str.equals("com.google.android.webview") || str.equals("com.google.android.webview.dev") || str.equals("com.google.android.webview.beta") || str.equals("com.google.android.webview.canary") || str.equals("com.android.webview") || str.equals("com.huawei.webview") || str.equals("com.samsung.android.webview") || str.equals("com.oneplus.webview");
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr == null || objArr.length <= 0 || !isKnownWebViewPackage((String) objArr[0])) {
                try {
                    return method.invoke(obj, objArr);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
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


