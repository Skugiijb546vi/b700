package com.app.framework.fake.service.context.providers;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Process;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.utils.compat.ContextCompat;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.InterfaceC2003oooOOOoO;
import com.ninja.engine.o0O00OOO;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ContentProviderStub extends ClassInvocationStub implements BContentProvider {
    public static final String TAG = "ContentProviderStub";
    private String mAppPkg;
    private IInterface mBase;

    private void fixAttributionSourceUid(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            int hostUid = BlackBoxCore.getHostUid();
            Class<?> cls = obj.getClass();
            try {
                try {
                    try {
                        Field declaredField = cls.getDeclaredField("mUid");
                        declaredField.setAccessible(true);
                        declaredField.set(obj, Integer.valueOf(hostUid));
                    } catch (Exception e) {
                        e.getMessage();
                    }
                } catch (NoSuchFieldException unused) {
                    Method declaredMethod = cls.getDeclaredMethod("setUid", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(obj, Integer.valueOf(hostUid));
                }
            } catch (NoSuchFieldException unused2) {
                Field declaredField2 = cls.getDeclaredField("uid");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, Integer.valueOf(hostUid));
            }
            try {
                Field declaredField3 = cls.getDeclaredField("mPackageName");
                declaredField3.setAccessible(true);
                declaredField3.set(obj, this.mAppPkg);
            } catch (Exception unused3) {
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r5.equals("delete") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object getSafeDefaultValue(java.lang.String r5) {
        /*
            r4 = this;
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = -1
            switch(r0) {
                case -1335458389: goto L28;
                case -1183618453: goto L1d;
                case -838846263: goto L12;
                default: goto L10;
            }
        L10:
            r1 = -1
            goto L31
        L12:
            java.lang.String r0 = "update"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L1b
            goto L10
        L1b:
            r1 = 2
            goto L31
        L1d:
            java.lang.String r0 = "bulkInsert"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L26
            goto L10
        L26:
            r1 = 1
            goto L31
        L28:
            java.lang.String r0 = "delete"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L31
            goto L10
        L31:
            switch(r1) {
                case 0: goto L36;
                case 1: goto L36;
                case 2: goto L36;
                default: goto L34;
            }
        L34:
            r5 = 0
            return r5
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.service.context.providers.ContentProviderStub.getSafeDefaultValue(java.lang.String):java.lang.Object");
    }

    private boolean isConfigStyleCall(Method method, Object[] objArr) {
        if (method == null || !"call".equals(method.getName()) || objArr == null || objArr.length == 0) {
            return false;
        }
        boolean z = false;
        boolean z2 = false;
        for (Object obj : objArr) {
            if (obj instanceof String) {
                String lowerCase = ((String) obj).toLowerCase();
                z2 = ("settings".equals(lowerCase) || lowerCase.contains("settings")) ? true : true;
                if (lowerCase.contains("config")) {
                    z = true;
                }
            }
        }
        if (z) {
            return z2 || objArr.length >= 3;
        }
        return false;
    }

    private boolean isSystemProviderAuthority(String str) {
        if (str == null) {
            return false;
        }
        return str.equals("settings") || str.equals("settings_global") || str.equals("settings_system") || str.equals("settings_secure") || str.equals("media") || str.equals("telephony") || str.startsWith("android.provider.Settings");
    }

    private boolean isUidMismatchError(Throwable th) {
        String message;
        if (th == null || (message = th.getMessage()) == null) {
            return false;
        }
        return (message.contains("Calling uid") && message.contains("doesn't match source uid")) || (message.contains("uid") && message.contains("permission")) || message.contains("SecurityException") || message.contains("UID mismatch");
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return this.mBase;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String message;
        Class<?> cls;
        if ("asBinder".equals(method.getName())) {
            return method.invoke(this.mBase, objArr);
        }
        String appPackageName = BActivityThread.getAppPackageName();
        String name = method.getName();
        if (objArr != null && objArr.length > 0) {
            if ("call".equals(name)) {
                new StringBuilder(AbstractC1230oOoOo0o.OooO0oo("ContentProvider.", name, " args: "));
                for (Object obj2 : objArr) {
                    if (obj2 != null) {
                        if (!(obj2 instanceof String)) {
                            obj2 = "...";
                        }
                        obj2.toString();
                    }
                }
            }
            try {
                cls = o0O00OOO.classReady(InterfaceC2003oooOOOoO.class);
            } catch (Throwable th) {
                th.toString();
                cls = null;
            }
            for (int i = 0; i < objArr.length; i++) {
                Object obj3 = objArr[i];
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (appPackageName != null && appPackageName.equals(str)) {
                        objArr[i] = this.mAppPkg;
                    }
                } else if (obj3 != null && cls != null && cls.isInstance(obj3)) {
                    int hostUid = BlackBoxCore.getHostUid();
                    Process.myUid();
                    try {
                        ContextCompat.fixAttributionSourceState(obj3, hostUid);
                    } catch (Exception e) {
                        e.getMessage();
                    }
                } else if (obj3 != null) {
                    if (!obj3.getClass().getName().contains("AttributionSource")) {
                    }
                    try {
                        fixAttributionSourceUid(obj3);
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                }
            }
        }
        if (!name.equals("query") && !name.equals("insert") && !name.equals("update") && !name.equals("delete") && !name.equals("bulkInsert") && !name.equals("call")) {
            try {
                return method.invoke(this.mBase, objArr);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (isUidMismatchError(cause)) {
                    cause.getMessage();
                    return getSafeDefaultValue(name, method.getReturnType());
                }
                throw th2.getCause();
            }
        }
        try {
            Object invoke = method.invoke(this.mBase, objArr);
            if (isConfigStyleCall(method, objArr)) {
                if (invoke == null) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("value", new HashMap());
                    return bundle;
                } else if (invoke instanceof Bundle) {
                    Bundle bundle2 = (Bundle) invoke;
                    if (!(bundle2.get("value") instanceof Map)) {
                        bundle2.putSerializable("value", new HashMap());
                    }
                }
            }
            return invoke;
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (isUidMismatchError(cause2)) {
                cause2.getMessage();
                return getSafeDefaultValue(name, method.getReturnType());
            } else if ((cause2 instanceof RuntimeException) && (message = cause2.getMessage()) != null && (message.contains("uid") || message.contains("permission"))) {
                return getSafeDefaultValue(name, method.getReturnType());
            } else {
                if (name.equals("call")) {
                    th3.getMessage();
                    return getSafeDefaultValue(name, method.getReturnType());
                }
                throw th3.getCause();
            }
        }
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void onBindMethod() {
    }

    @Override // com.app.framework.fake.service.context.providers.BContentProvider
    public IInterface wrapper(IInterface iInterface, String str) {
        this.mBase = iInterface;
        this.mAppPkg = str;
        injectHook();
        return (IInterface) getProxyInvocation();
    }

    private Object getSafeDefaultValue(String str, Class<?> cls) {
        if (cls == null) {
            return getSafeDefaultValue(str);
        }
        if (cls == String.class) {
            return "true";
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 1;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 1L;
        }
        return (cls == Float.TYPE || cls == Float.class) ? Float.valueOf(1.0f) : (cls == Boolean.TYPE || cls == Boolean.class) ? Boolean.TRUE : cls == Bundle.class ? new Bundle() : getSafeDefaultValue(str);
    }
}


