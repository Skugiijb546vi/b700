package com.app.framework.fake.service;

import android.os.Build;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class IDnsResolverProxy extends BinderInvocationStub {
    public static final String DNS_RESOLVER_SERVICE = "dnsresolver";
    public static final String TAG = "IDnsResolverProxy";

    @ProxyMethod("getDnsResolverStats")
    /* loaded from: classes.dex */
    public static class GetDnsResolverStats extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    return method.invoke(obj, objArr);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    @ProxyMethod("isNetworkValidated")
    /* loaded from: classes.dex */
    public static class IsNetworkValidated extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.TRUE;
        }
    }

    @ProxyMethod("resolveDns")
    /* loaded from: classes.dex */
    public static class ResolveDns extends MethodHook {
        private Object createFallbackDnsResult() {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(InetAddress.getByName("8.8.8.8"));
                arrayList.add(InetAddress.getByName("8.8.4.4"));
                return arrayList;
            } catch (Exception e) {
                e.getMessage();
                return new ArrayList();
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createFallbackDnsResult();
            } catch (Exception e) {
                e.getMessage();
                return createFallbackDnsResult();
            }
        }
    }

    @ProxyMethod("setDnsQueryTimeout")
    /* loaded from: classes.dex */
    public static class SetDnsQueryTimeout extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        Object obj2 = objArr[0];
                        if (obj2 instanceof Integer) {
                            objArr[0] = Integer.valueOf(Math.min(((Integer) obj2).intValue(), (int) BUserHandle.AID_APP_START));
                        }
                    }
                } catch (Exception e) {
                    e.getMessage();
                    return null;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("setDnsServersForNetwork")
    /* loaded from: classes.dex */
    public static class SetDnsServersForNetwork extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("setPrivateDnsConfiguration")
    /* loaded from: classes.dex */
    public static class SetPrivateDnsConfiguration extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    return method.invoke(obj, objArr);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    public IDnsResolverProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(DNS_RESOLVER_SERVICE));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        try {
            replaceSystemService(DNS_RESOLVER_SERVICE);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


