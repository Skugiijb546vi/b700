package com.app.framework.fake.service;

import android.net.wifi.WifiInfo;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0198o00o00oO;
import com.ninja.engine.InterfaceC0528o0o0O000;
import com.ninja.engine.oO0O0O0;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IWifiManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IWifiManagerProxy";

    @ProxyMethod("getConnectionInfo")
    /* loaded from: classes.dex */
    public static class GetConnectionInfo extends MethodHook {
        public static String intIP2StringIP(int i) {
            return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
        }

        public static int ip2Int(String str) {
            String[] split = str.split("\\.");
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                i |= Integer.parseInt(split[i2]) << (i2 * 8);
            }
            return i;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            WifiInfo wifiInfo = (WifiInfo) method.invoke(obj, objArr);
            ((InterfaceC0198o00o00oO) C0217o00o0oO0.create(InterfaceC0198o00o00oO.class, wifiInfo, false))._set_mBSSID("ac:62:5a:82:65:c4");
            ((InterfaceC0198o00o00oO) C0217o00o0oO0.create(InterfaceC0198o00o00oO.class, wifiInfo, false))._set_mMacAddress("ac:62:5a:82:65:c4");
            ((InterfaceC0198o00o00oO) C0217o00o0oO0.create(InterfaceC0198o00o00oO.class, wifiInfo, false))._set_mWifiSsid(((oO0O0O0) C0217o00o0oO0.create(oO0O0O0.class, null, false)).createFromAsciiEncoded("BlackBox_Wifi"));
            return wifiInfo;
        }
    }

    public IWifiManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("wifi"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC0528o0o0O000) C0217o00o0oO0.create(InterfaceC0528o0o0O000.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("wifi"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("wifi");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


