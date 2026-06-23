package com.app.framework.fake.delegate;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.util.ArrayMap;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.service.context.providers.ContentProviderStub;
import com.app.framework.fake.service.context.providers.SystemProviderStub;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0279o00oooOo;
import com.ninja.engine.InterfaceC0449o0OoOOOo;
import com.ninja.engine.InterfaceC0529o0o0O00O;
import com.ninja.engine.InterfaceC0555o0o0OoO0;
import com.ninja.engine.InterfaceC0735oO00o0o0;
import com.ninja.engine.InterfaceC0878oO0oo000;
import com.ninja.engine.InterfaceC1019oOOOo0Oo;
import com.ninja.engine.InterfaceC1492oo0OO0Oo;
import com.ninja.engine.InterfaceC1789ooOOOO0o;
import com.ninja.engine.InterfaceC2041oooOooo;
import com.ninja.engine.InterfaceC2057oooo0O;
import com.ninja.engine.InterfaceC2077oooo0oo;
import com.ninja.engine.o0O00OOO;
import com.ninja.engine.o0OOO00;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class ContentProviderDelegate {
    public static final String TAG = "ContentProviderDelegate";
    private static Set<String> sInjected = new HashSet();

    private static void clearContentProvider(Object obj) {
        if (!BuildCompat.isOreo()) {
            ((InterfaceC0449o0OoOOOo) C0217o00o0oO0.create(InterfaceC0449o0OoOOOo.class, obj, false))._set_mContentProvider(null);
            return;
        }
        Object mProviderHolder = ((InterfaceC0555o0o0OoO0) C0217o00o0oO0.create(InterfaceC0555o0o0OoO0.class, obj, false)).mProviderHolder();
        if (mProviderHolder != null) {
            ((InterfaceC2077oooo0oo) C0217o00o0oO0.create(InterfaceC2077oooo0oo.class, mProviderHolder, false))._set_mContentProvider(null);
        }
    }

    public static void clearSettingProvider() {
        Object sNameValueCache;
        Object sNameValueCache2;
        Object sNameValueCache3 = ((InterfaceC0878oO0oo000) C0217o00o0oO0.create(InterfaceC0878oO0oo000.class, null, false)).sNameValueCache();
        if (sNameValueCache3 != null) {
            clearContentProvider(sNameValueCache3);
        }
        Object sNameValueCache4 = ((InterfaceC0735oO00o0o0) C0217o00o0oO0.create(InterfaceC0735oO00o0o0.class, null, false)).sNameValueCache();
        if (sNameValueCache4 != null) {
            clearContentProvider(sNameValueCache4);
        }
        int i = Build.VERSION.SDK_INT;
        if (o0O00OOO.classReady(InterfaceC0279o00oooOo.class) != null && (sNameValueCache2 = ((o0OOO00) C0217o00o0oO0.create(o0OOO00.class, null, false)).sNameValueCache()) != null) {
            clearContentProvider(sNameValueCache2);
        }
        if (i >= 28) {
            try {
                if (o0O00OOO.classReady(InterfaceC2041oooOooo.class) == null || (sNameValueCache = ((InterfaceC2057oooo0O) C0217o00o0oO0.create(InterfaceC2057oooo0O.class, null, false)).sNameValueCache()) == null) {
                    return;
                }
                clearContentProvider(sNameValueCache);
            } catch (Throwable unused) {
            }
        }
    }

    public static void init() {
        IInterface wrapper;
        clearSettingProvider();
        BlackBoxCore.getContext().getContentResolver().call(Uri.parse("content://settings"), "", (String) null, (Bundle) null);
        for (Object obj : ((ArrayMap) ((InterfaceC0529o0o0O00O) C0217o00o0oO0.create(InterfaceC0529o0o0O00O.class, BlackBoxCore.mainThread(), false)).mProviderMap()).values()) {
            String[] mNames = ((InterfaceC1019oOOOo0Oo) C0217o00o0oO0.create(InterfaceC1019oOOOo0Oo.class, obj, false)).mNames();
            if (mNames != null && mNames.length > 0) {
                String str = mNames[0];
                if (!sInjected.contains(str)) {
                    sInjected.add(str);
                    IInterface mProvider = ((InterfaceC1019oOOOo0Oo) C0217o00o0oO0.create(InterfaceC1019oOOOo0Oo.class, obj, false)).mProvider();
                    str.getClass();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case 103772132:
                            if (str.equals("media")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 783201304:
                            if (str.equals("telephony")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1434631203:
                            if (str.equals("settings")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                            wrapper = new SystemProviderStub().wrapper(mProvider, BlackBoxCore.getHostPkg());
                            break;
                        default:
                            wrapper = new ContentProviderStub().wrapper(mProvider, BlackBoxCore.getHostPkg());
                            break;
                    }
                    ((InterfaceC1019oOOOo0Oo) C0217o00o0oO0.create(InterfaceC1019oOOOo0Oo.class, obj, false))._set_mProvider(wrapper);
                    ((InterfaceC1019oOOOo0Oo) C0217o00o0oO0.create(InterfaceC1019oOOOo0Oo.class, obj, false))._set_mNames(new String[]{str});
                }
            }
        }
    }

    public static void update(Object obj, String str) {
        IInterface wrapper;
        IInterface provider = BuildCompat.isOreo() ? ((InterfaceC1492oo0OO0Oo) C0217o00o0oO0.create(InterfaceC1492oo0OO0Oo.class, obj, false)).provider() : ((InterfaceC1789ooOOOO0o) C0217o00o0oO0.create(InterfaceC1789ooOOOO0o.class, obj, false)).provider();
        if (provider instanceof Proxy) {
            return;
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 103772132:
                if (str.equals("media")) {
                    c = 0;
                    break;
                }
                break;
            case 783201304:
                if (str.equals("telephony")) {
                    c = 1;
                    break;
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                wrapper = new SystemProviderStub().wrapper(provider, BlackBoxCore.getHostPkg());
                break;
            default:
                wrapper = new ContentProviderStub().wrapper(provider, BlackBoxCore.getHostPkg());
                break;
        }
        if (BuildCompat.isOreo()) {
            ((InterfaceC1492oo0OO0Oo) C0217o00o0oO0.create(InterfaceC1492oo0OO0Oo.class, obj, false))._set_provider(wrapper);
        } else {
            ((InterfaceC1789ooOOOO0o) C0217o00o0oO0.create(InterfaceC1789ooOOOO0o.class, obj, false))._set_provider(wrapper);
        }
    }
}


