package com.app.framework.fake.service;

import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.fake.hook.ScanClass;
import com.ninja.engine.AbstractC0037Oooo0oO;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.OooO0o;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
@ScanClass({VpnCommonProxy.class})
/* loaded from: classes.dex */
public class IConnectivityManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IConnectivityManagerProxy";

    @ProxyMethod("addDefaultNetworkActiveListener")
    /* loaded from: classes.dex */
    public static class AddDefaultNetworkActiveListener extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return 0;
            }
        }
    }

    @ProxyMethod("getActiveNetwork")
    /* loaded from: classes.dex */
    public static class GetActiveNetwork extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return (Network) Network.class.getConstructor(Integer.TYPE).newInstance(1);
            } catch (Exception unused) {
                try {
                    try {
                        Constructor declaredConstructor = Network.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return (Network) declaredConstructor.newInstance(null);
                    } catch (Exception unused2) {
                        return method.invoke(obj, objArr);
                    }
                } catch (Exception e) {
                    e.getMessage();
                    return method.invoke(obj, objArr);
                }
            }
        }
    }

    @ProxyMethod("getActiveNetworkInfoForUid")
    /* loaded from: classes.dex */
    public static class GetActiveNetworkInfoForUid extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getAllNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetAllNetworkInfo extends MethodHook {
        private Object createNetworkInfoArray() {
            try {
                return IConnectivityManagerProxy.OooO0Oo();
            } catch (Exception e) {
                e.getMessage();
                return new Object[0];
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createNetworkInfoArray();
            } catch (Exception e) {
                e.getMessage();
                return createNetworkInfoArray();
            }
        }
    }

    @ProxyMethod("getDnsServers")
    /* loaded from: classes.dex */
    public static class GetDnsServers extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(InetAddress.getByName("8.8.8.8"));
                arrayList.add(InetAddress.getByName("8.8.4.4"));
                return arrayList;
            } catch (Exception e) {
                e.getMessage();
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("getLinkProperties")
    /* loaded from: classes.dex */
    public static class GetLinkProperties extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object OooO00o = IConnectivityManagerProxy.OooO00o();
                return OooO00o != null ? OooO00o : method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("getNetworkCapabilities")
    /* loaded from: classes.dex */
    public static class GetNetworkCapabilities extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object OooO0O0 = IConnectivityManagerProxy.OooO0O0();
                return OooO0O0 != null ? OooO0O0 : method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("getNetworkForType")
    /* loaded from: classes.dex */
    public static class GetNetworkForType extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    return invoke;
                }
                try {
                    try {
                        return (Network) Network.class.getConstructor(Integer.TYPE).newInstance(1);
                    } catch (Exception unused) {
                        Constructor declaredConstructor = Network.class.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        return (Network) declaredConstructor.newInstance(null);
                    }
                } catch (Exception unused2) {
                    return null;
                }
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfo extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return IConnectivityManagerProxy.OooO0OO();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithInt extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithNetwork extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString10 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString11 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString12 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString13 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString14 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString15 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString16 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString17 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString18 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString19 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString2 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString3 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString4 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString5 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString6 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString7 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString8 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getNetworkInfo")
    /* loaded from: classes.dex */
    public static class GetNetworkInfoWithString9 extends MethodHook {
        private Object createBasicNetworkInfo() {
            try {
                return IConnectivityManagerProxy.OooO0OO();
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createBasicNetworkInfo();
            } catch (Exception e) {
                e.getMessage();
                return createBasicNetworkInfo();
            }
        }
    }

    @ProxyMethod("getPrivateDnsServerName")
    /* loaded from: classes.dex */
    public static class GetPrivateDnsServerName extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    @ProxyMethod("isActiveNetworkMetered")
    /* loaded from: classes.dex */
    public static class IsActiveNetworkMetered extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : Boolean.FALSE;
            } catch (Exception e) {
                e.getMessage();
                return Boolean.FALSE;
            }
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

    @ProxyMethod("isPrivateDnsActive")
    /* loaded from: classes.dex */
    public static class IsPrivateDnsActive extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            return Boolean.FALSE;
        }
    }

    @ProxyMethod("registerDefaultNetworkCallback")
    /* loaded from: classes.dex */
    public static class RegisterDefaultNetworkCallback extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return 0;
            }
        }
    }

    @ProxyMethod("registerNetworkCallback")
    /* loaded from: classes.dex */
    public static class RegisterNetworkCallback extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return 0;
            }
        }
    }

    @ProxyMethod("registerNetworkCallback")
    /* loaded from: classes.dex */
    public static class RegisterNetworkCallbackWithRequest extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return 0;
            }
        }
    }

    @ProxyMethod("removeDefaultNetworkActiveListener")
    /* loaded from: classes.dex */
    public static class RemoveDefaultNetworkActiveListener extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return 0;
            }
        }
    }

    @ProxyMethod("requestNetwork")
    /* loaded from: classes.dex */
    public static class RequestNetwork extends MethodHook {
        private Object createMockNetworkRequestResult() {
            try {
                Class.forName("android.net.NetworkRequest");
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Object invoke = method.invoke(obj, objArr);
                return invoke != null ? invoke : createMockNetworkRequestResult();
            } catch (Exception e) {
                e.getMessage();
                return createMockNetworkRequestResult();
            }
        }
    }

    @ProxyMethod("unregisterNetworkCallback")
    /* loaded from: classes.dex */
    public static class UnregisterNetworkCallback extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                e.getMessage();
                return 0;
            }
        }
    }

    public IConnectivityManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("connectivity"));
    }

    public static /* bridge */ /* synthetic */ Object OooO00o() {
        return createLinkProperties();
    }

    public static /* bridge */ /* synthetic */ Object OooO0O0() {
        return createNetworkCapabilities();
    }

    public static /* bridge */ /* synthetic */ Object OooO0OO() {
        return createNetworkInfo(1, 0, "WIFI", "");
    }

    public static /* bridge */ /* synthetic */ Object OooO0Oo() {
        return createNetworkInfoArray();
    }

    private static Object createLinkProperties() {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.net.LinkProperties").getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(null);
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(InetAddress.getByName("8.8.8.8"));
                arrayList.add(InetAddress.getByName("8.8.4.4"));
                newInstance.getClass().getMethod("setDnsServers", List.class).invoke(newInstance, arrayList);
            } catch (Exception e) {
                e.getMessage();
            }
            return newInstance;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    private static Object createNetworkCapabilities() {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.net.NetworkCapabilities").getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object newInstance = declaredConstructor.newInstance(null);
            try {
                Method method = newInstance.getClass().getMethod("addTransportType", Integer.TYPE);
                method.invoke(newInstance, 1);
                method.invoke(newInstance, 0);
            } catch (Exception e) {
                e.getMessage();
            }
            try {
                Method method2 = newInstance.getClass().getMethod("addCapability", Integer.TYPE);
                method2.invoke(newInstance, 12);
                method2.invoke(newInstance, 16);
                method2.invoke(newInstance, 14);
                method2.invoke(newInstance, 13);
                method2.invoke(newInstance, 15);
                method2.invoke(newInstance, 20);
            } catch (Exception e2) {
                e2.getMessage();
            }
            return newInstance;
        } catch (Exception e3) {
            e3.getMessage();
            return null;
        }
    }

    private static Object createNetworkInfo(int i, int i2, String str, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                NetworkInfo OooO0oo = AbstractC0037Oooo0oO.OooO0oo(i, i2, str, str2);
                OooO0oo.setDetailedState(NetworkInfo.DetailedState.CONNECTED, null, null);
                return OooO0oo;
            }
            try {
                Class<?> cls = Class.forName("android.net.NetworkInfo");
                Class<?> cls2 = Integer.TYPE;
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2, cls2, String.class, String.class);
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(Integer.valueOf(i), Integer.valueOf(i2), str, str2);
                cls.getDeclaredMethod("setDetailedState", NetworkInfo.DetailedState.class, String.class, String.class).invoke(newInstance, NetworkInfo.DetailedState.CONNECTED, null, null);
                return newInstance;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    private static Object createNetworkInfoArray() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                NetworkInfo OooO0oO = AbstractC0037Oooo0oO.OooO0oO();
                NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.CONNECTED;
                OooO0oO.setDetailedState(detailedState, null, null);
                NetworkInfo OooOoO = AbstractC0037Oooo0oO.OooOoO();
                OooOoO.setDetailedState(detailedState, null, null);
                return new NetworkInfo[]{OooO0oO, OooOoO};
            }
            try {
                Class<?> cls = Class.forName("android.net.NetworkInfo");
                Class<?> cls2 = Integer.TYPE;
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(cls2, cls2, String.class, String.class);
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(1, 0, "WIFI", "");
                Method declaredMethod = cls.getDeclaredMethod("setDetailedState", NetworkInfo.DetailedState.class, String.class, String.class);
                NetworkInfo.DetailedState detailedState2 = NetworkInfo.DetailedState.CONNECTED;
                declaredMethod.invoke(newInstance, detailedState2, null, null);
                Object newInstance2 = declaredConstructor.newInstance(0, 0, "MOBILE", "");
                declaredMethod.invoke(newInstance2, detailedState2, null, null);
                Object[] objArr = (Object[]) Array.newInstance(cls, 2);
                Array.set(objArr, 0, newInstance);
                Array.set(objArr, 1, newInstance2);
                return objArr;
            } catch (Exception e) {
                e.getMessage();
                return new Object[0];
            }
        } catch (Exception e2) {
            e2.getMessage();
            return new Object[0];
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((OooO0o) C0217o00o0oO0.create(OooO0o.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("connectivity"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("connectivity");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


