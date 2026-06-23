package com.app.framework.fake.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.GoogleSignInHelper;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.oO00OOOo;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes.dex */
public class ICredentialManagerProxy extends BinderInvocationStub {
    private static final String SERVICE_NAME = "credential";
    public static final String TAG = "PlayIntegrity";
    private static Object sPendingCallback;
    private static BroadcastReceiver sTokenReceiver;

    @ProxyMethod("executeGetCredential")
    /* loaded from: classes.dex */
    public static class ExecuteGetCredential extends MethodHook {
        private static int getActiveUserId() {
            int userId = BlackBoxCore.getUserId();
            if (userId < 0) {
                return 0;
            }
            return userId;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object obj2 = objArr[1];
            int activeUserId = getActiveUserId();
            String cachedIdToken = GoogleSignInHelper.getCachedIdToken(BlackBoxCore.getContext(), activeUserId);
            if (cachedIdToken != null) {
                try {
                    GoogleSignInHelper.deliverTokenViaCallback(obj2, cachedIdToken);
                    return ICredentialManagerProxy.OooO0o0();
                } catch (Exception unused) {
                }
            }
            ICredentialManagerProxy.sPendingCallback = obj2;
            ICredentialManagerProxy.registerTokenReceiver();
            GoogleSignInHelper.launchWebViewSignIn(BlackBoxCore.getContext(), activeUserId);
            return ICredentialManagerProxy.OooO0o0();
        }
    }

    public ICredentialManagerProxy() {
        super(getBinder());
    }

    public static /* bridge */ /* synthetic */ Object OooO0o0() {
        return createDummyCancellationSignal();
    }

    private static Object createDummyCancellationSignal() {
        try {
            Class<?> cls = Class.forName("android.os.ICancellationSignal");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new oO00OOOo(0));
        } catch (Exception unused) {
            return null;
        }
    }

    private static IBinder getBinder() {
        try {
            return AbstractC0694o0ooooo0.OooO0OO().getService(SERVICE_NAME);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object lambda$createDummyCancellationSignal$0(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if ("cancel".equals(name)) {
            return null;
        }
        if ("asBinder".equals(name)) {
            return new Binder();
        }
        if ("toString".equals(name)) {
            return "DummyCancellationSignal";
        }
        if ("hashCode".equals(name)) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if ("equals".equals(name)) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        return null;
    }

    public static void registerTokenReceiver() {
        Context context = BlackBoxCore.getContext();
        BroadcastReceiver broadcastReceiver = sTokenReceiver;
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
        }
        sTokenReceiver = new BroadcastReceiver() { // from class: com.app.framework.fake.service.ICredentialManagerProxy.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Object obj;
                Object obj2;
                String action = intent.getAction();
                if (GoogleSignInHelper.ACTION_GSI_TOKEN.equals(action)) {
                    String stringExtra = intent.getStringExtra("id_token");
                    if (stringExtra != null && (obj2 = ICredentialManagerProxy.sPendingCallback) != null) {
                        try {
                            GoogleSignInHelper.deliverTokenViaCallback(obj2, stringExtra);
                        } catch (Exception unused2) {
                        }
                    }
                } else if (GoogleSignInHelper.ACTION_GSI_CANCEL.equals(action) && (obj = ICredentialManagerProxy.sPendingCallback) != null) {
                    GoogleSignInHelper.deliverError(obj, "USER_CANCELED", "Cancelled");
                }
                ICredentialManagerProxy.sPendingCallback = null;
                try {
                    context2.unregisterReceiver(this);
                } catch (Exception unused3) {
                }
                ICredentialManagerProxy.sTokenReceiver = null;
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GoogleSignInHelper.ACTION_GSI_TOKEN);
        intentFilter.addAction(GoogleSignInHelper.ACTION_GSI_CANCEL);
        context.registerReceiver(sTokenReceiver, intentFilter, 4);
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        IBinder binder = getBinder();
        if (binder == null) {
            return null;
        }
        try {
            return Class.forName("android.credentials.ICredentialManager$Stub").getMethod("asInterface", IBinder.class).invoke(null, binder);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService(SERVICE_NAME);
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}
