package com.app.framework.fake.service;

import android.webkit.WebView;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public class WebViewFactoryProxy extends ClassInvocationStub {
    public static final String TAG = "WebViewFactoryProxy";

    @ProxyMethod("getWebViewPackage")
    /* loaded from: classes.dex */
    public static class GetWebViewPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : "com.google.android.webview";
            } catch (Exception unused) {
                return "com.google.android.webview";
            }
        }
    }

    @ProxyMethod("getWebViewProviderClass")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderClass extends MethodHook {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x000a
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // com.app.framework.fake.hook.MethodHook
        public java.lang.Object hook(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object[] r3) {
            /*
                r0 = this;
                java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L7
                if (r1 == 0) goto L7
                return r1
            L7:
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                return r1
            La:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.WebViewFactoryProxy.GetWebViewProviderClass.hook(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    @ProxyMethod("getWebViewProviderClassLoader")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderClassLoader extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
            } catch (Exception unused) {
            }
            try {
                ClassLoader classLoader = WebView.class.getClassLoader();
                Objects.toString(classLoader);
                return classLoader;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    @ProxyMethod("getWebViewProviderClassLoader")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderClassLoaderWithPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                String str = (String) objArr[0];
            }
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
            } catch (Exception unused) {
            }
            try {
                ClassLoader classLoader = WebView.class.getClassLoader();
                Objects.toString(classLoader);
                return classLoader;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    @ProxyMethod("getWebViewProviderClass")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderClassWithPackage extends MethodHook {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:11:0x0014
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // com.app.framework.fake.hook.MethodHook
        public java.lang.Object hook(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) {
            /*
                r1 = this;
                if (r4 == 0) goto La
                int r0 = r4.length
                if (r0 <= 0) goto La
                r0 = 0
                r0 = r4[r0]
                java.lang.String r0 = (java.lang.String) r0
            La:
                java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L11
                if (r2 == 0) goto L11
                return r2
            L11:
                java.lang.Class<android.webkit.WebView> r2 = android.webkit.WebView.class
                return r2
            L14:
                r2 = 0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.WebViewFactoryProxy.GetWebViewProviderClassWithPackage.hook(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
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

    @ProxyMethod("getWebViewProviderPackage")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderPackage extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : "com.google.android.webview";
            } catch (Exception unused) {
                return "com.google.android.webview";
            }
        }
    }

    @ProxyMethod("getWebViewProviderPackageInfo")
    /* loaded from: classes.dex */
    public static class GetWebViewProviderPackageInfo extends MethodHook {
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

    @ProxyMethod("isWebViewSupported")
    /* loaded from: classes.dex */
    public static class IsWebViewSupported extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
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


