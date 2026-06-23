package com.app.framework.fake.service;

import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.ScanClass;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1980oooO0ooo;
@ScanClass({VpnCommonProxy.class})
/* loaded from: classes.dex */
public class IVpnManagerProxy extends BinderInvocationStub {
    public static final String TAG = "IVpnManagerProxy";
    public static final String VPN_MANAGEMENT_SERVICE = "vpn_management";

    public IVpnManagerProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService(VPN_MANAGEMENT_SERVICE));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1980oooO0ooo) C0217o00o0oO0.create(InterfaceC1980oooO0ooo.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService(VPN_MANAGEMENT_SERVICE));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(VPN_MANAGEMENT_SERVICE);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
