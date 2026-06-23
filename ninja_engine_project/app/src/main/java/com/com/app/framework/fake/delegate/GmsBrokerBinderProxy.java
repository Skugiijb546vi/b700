package com.app.framework.fake.delegate;

import android.app.Application;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.delegate.GmsBrokerBinderProxy;
import java.io.FileDescriptor;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class GmsBrokerBinderProxy implements IBinder {
    private static final String[] BUNDLE_PACKAGE_KEYS = {"com.google.android.gms.games.key.gamePackageName", "com.google.android.gms.games.key.GAME_PACKAGE_NAME"};
    private static final String GMS_BROKER_DESCRIPTOR = "com.google.android.gms.common.internal.IGmsServiceBroker";
    private static final int SAFE_PARCEL_HEADER = -45243;
    private static final String TAG = "GmsBrokerProxy";
    private static volatile IBinder sLastGamesServiceBinder;
    private final String mGuestPackage;
    private final IBinder mReal;

    /* loaded from: classes.dex */
    public static class FakeGamesServiceBinder extends Binder {
        private static final String FTAG = "FakeGamesSvc";
        private final String mDesc;

        public FakeGamesServiceBinder(String str) {
            this.mDesc = str;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return this.mDesc;
        }

        @Override // android.os.Binder, android.os.IBinder
        public boolean isBinderAlive() {
            return true;
        }

        @Override // android.os.Binder, android.os.IBinder
        public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (parcel2 != null) {
                parcel2.writeNoException();
                if (i != 5012) {
                    parcel2.writeInt(i != 12035 ? i != 12036 ? 0 : 819200 : 3145728);
                    return true;
                }
                parcel2.writeString("fakePlayerId");
                return true;
            }
            return true;
        }

        @Override // android.os.Binder, android.os.IBinder
        public boolean pingBinder() {
            return true;
        }

        @Override // android.os.Binder, android.os.IBinder
        public IInterface queryLocalInterface(String str) {
            return null;
        }

        @Override // android.os.Binder, android.os.IBinder
        public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class LoggingServiceBinder extends Binder {
        private static final String LTAG = "GmsSvcProxy";
        private final String mDesc;
        private final IBinder mReal;

        public LoggingServiceBinder(IBinder iBinder, String str) {
            this.mReal = iBinder;
            this.mDesc = str == null ? "unknown" : str;
        }

        public static /* synthetic */ boolean OooO00o(int i) {
            return lambda$onTransact$0(i);
        }

        public static /* synthetic */ boolean lambda$onTransact$0(int i) {
            return (i >= 32 && i < 127) || i == 46;
        }

        private static int readSafeParcelStatusCode(Parcel parcel) {
            int i = -1;
            if (parcel.readInt() != GmsBrokerBinderProxy.SAFE_PARCEL_HEADER) {
                return -1;
            }
            int dataPosition = parcel.dataPosition() + parcel.readInt();
            while (parcel.dataPosition() < dataPosition) {
                int readInt = parcel.readInt();
                int i2 = readInt & 65535;
                int i3 = (readInt >>> 16) & 65535;
                if (i3 == 65535) {
                    i3 = parcel.readInt();
                }
                if (i2 == 1 && i3 == 4) {
                    i = parcel.readInt();
                } else {
                    parcel.setDataPosition(parcel.dataPosition() + i3);
                }
            }
            parcel.setDataPosition(dataPosition);
            return i;
        }

        private static void writeSafeParcelGameRunToken(Parcel parcel, String str) {
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(GmsBrokerBinderProxy.SAFE_PARCEL_HEADER);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            int dataPosition3 = parcel.dataPosition();
            parcel.writeInt(-65535);
            parcel.writeInt(0);
            int dataPosition4 = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition5 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition3 + 4);
            parcel.writeInt(dataPosition5 - dataPosition4);
            parcel.setDataPosition(dataPosition5);
            int dataPosition6 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition + 4);
            parcel.writeInt(dataPosition6 - dataPosition2);
            parcel.setDataPosition(dataPosition6);
        }

        private static void writeSafeParcelStatus(Parcel parcel, int i) {
            int dataPosition = parcel.dataPosition();
            parcel.writeInt(GmsBrokerBinderProxy.SAFE_PARCEL_HEADER);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            parcel.writeInt(262145);
            parcel.writeInt(i);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition + 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return this.mDesc;
        }

        @Override // android.os.Binder, android.os.IBinder
        public boolean isBinderAlive() {
            return this.mReal.isBinderAlive();
        }

        @Override // android.os.Binder, android.os.IBinder
        public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
            try {
                this.mReal.linkToDeath(deathRecipient, i);
            } catch (RemoteException unused) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:240:0x0195 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:241:0x0196  */
        /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, com.app.framework.fake.delegate.OooO00o] */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
            /*
                Method dump skipped, instructions count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.delegate.GmsBrokerBinderProxy.LoggingServiceBinder.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        @Override // android.os.Binder, android.os.IBinder
        public boolean pingBinder() {
            return this.mReal.pingBinder();
        }

        @Override // android.os.Binder, android.os.IBinder
        public IInterface queryLocalInterface(String str) {
            return null;
        }

        @Override // android.os.Binder, android.os.IBinder
        public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
            return this.mReal.unlinkToDeath(deathRecipient, i);
        }
    }

    public GmsBrokerBinderProxy(IBinder iBinder, String str) {
        this.mReal = iBinder;
        this.mGuestPackage = str;
        BlackBoxCore.getHostPkg();
    }

    private IInterface createJavaLevelProxy() {
        Class<?> cls;
        final Object createRealBroker;
        Application application;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            cls = tryLoadClass(contextClassLoader, GMS_BROKER_DESCRIPTOR);
            if (cls == null) {
                contextClassLoader = null;
            }
        } else {
            contextClassLoader = null;
            cls = null;
        }
        if (cls == null && (application = BActivityThread.getApplication()) != null) {
            ClassLoader classLoader = application.getClassLoader();
            Class<?> tryLoadClass = tryLoadClass(classLoader, GMS_BROKER_DESCRIPTOR);
            if (tryLoadClass != null) {
                contextClassLoader = classLoader;
            }
            cls = tryLoadClass;
        }
        if (cls == null || contextClassLoader == null || (createRealBroker = createRealBroker(contextClassLoader.loadClass("com.google.android.gms.common.internal.IGmsServiceBroker$Stub"), cls, contextClassLoader)) == null) {
            return null;
        }
        final String hostPkg = BlackBoxCore.getHostPkg();
        final String str = this.mGuestPackage;
        return (IInterface) Proxy.newProxyInstance(contextClassLoader, new Class[]{cls}, new InvocationHandler() { // from class: com.app.framework.fake.delegate.GmsBrokerBinderProxy.1
            {
                GmsBrokerBinderProxy.this = this;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                Object obj2;
                Object obj3;
                if ("asBinder".equals(method.getName()) && (objArr == null || objArr.length == 0)) {
                    return GmsBrokerBinderProxy.this;
                }
                method.getName();
                boolean z = "getService".equals(method.getName()) && objArr != null && objArr.length >= 2;
                if (objArr != null) {
                    for (Object obj4 : objArr) {
                        if (obj4 != null && !(obj4 instanceof IBinder) && !(obj4 instanceof IInterface)) {
                            GmsBrokerBinderProxy.patchCallingPackage(obj4, str, hostPkg, method.getName());
                        }
                    }
                }
                if (z && (obj3 = objArr[1]) != null) {
                    GmsBrokerBinderProxy.dumpGetServiceRequest(obj3);
                }
                if (z && (obj2 = objArr[0]) != null) {
                    objArr[0] = GmsBrokerBinderProxy.wrapCallbackForLogging(obj2);
                }
                try {
                    return method.invoke(createRealBroker, objArr);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    Throwable th = e;
                    if (cause != null) {
                        th = e.getCause();
                    }
                    if (z) {
                        th.getClass();
                        th.getMessage();
                    }
                    throw th;
                }
            }
        });
    }

    private Object createRealBroker(Class<?> cls, Class<?> cls2, ClassLoader classLoader) {
        Class<?>[] declaredClasses;
        Method[] declaredMethods;
        Object instantiateProxy;
        Method findAsInterfaceMethod = findAsInterfaceMethod(cls, cls2);
        if (findAsInterfaceMethod != null) {
            try {
                Object invoke = findAsInterfaceMethod.invoke(null, this.mReal);
                if (invoke != null) {
                    findAsInterfaceMethod.getName();
                    return invoke;
                }
            } catch (Exception unused) {
            }
        }
        for (Class<?> cls3 : cls.getDeclaredClasses()) {
            if (cls2.isAssignableFrom(cls3) && (instantiateProxy = instantiateProxy(cls3)) != null) {
                cls3.getClass();
                return instantiateProxy;
            }
        }
        String str = cls2.getPackage() != null ? cls2.getPackage().getName() + "." : "";
        String[] strArr = {"zz", "zz"};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
                Object tryProxyClass = tryProxyClass(classLoader, str + str2 + c, cls2);
                if (tryProxyClass != null) {
                    return tryProxyClass;
                }
                for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                    Object tryProxyClass2 = tryProxyClass(classLoader, str + str2 + c + c2, cls2);
                    if (tryProxyClass2 != null) {
                        return tryProxyClass2;
                    }
                }
            }
        }
        for (Method method : cls.getDeclaredMethods()) {
            Modifier.isStatic(method.getModifiers());
            method.getReturnType().getClass();
            method.getName();
            for (int i2 = 0; i2 < method.getParameterTypes().length; i2++) {
                method.getParameterTypes()[i2].getClass();
            }
        }
        return null;
    }

    public static void dumpGetServiceRequest(Object obj) {
        Field[] declaredFields;
        StringBuilder sb;
        String str;
        try {
            for (Class<?> cls = obj.getClass(); cls != null && cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            if (obj2 instanceof IBinder) {
                                sb = new StringBuilder();
                                sb.append("IBinder@");
                                str = Integer.toHexString(System.identityHashCode(obj2));
                            } else if (obj2 instanceof Bundle) {
                                Bundle bundle = (Bundle) obj2;
                                sb = new StringBuilder("Bundle{");
                                for (String str2 : bundle.keySet()) {
                                    sb.append(str2);
                                    sb.append("=");
                                    sb.append(bundle.get(str2));
                                    sb.append(", ");
                                }
                                str = "}";
                            } else if (obj2.getClass().isArray()) {
                                sb = new StringBuilder();
                                sb.append(obj2.getClass().getComponentType().getSimpleName());
                                sb.append("[");
                                sb.append(Array.getLength(obj2));
                                str = "]";
                            } else {
                                String.valueOf(obj2);
                            }
                            sb.append(str);
                        }
                        field.getName();
                    }
                }
            }
            Field declaredField = obj.getClass().getDeclaredField("zzd");
            declaredField.setAccessible(true);
            declaredField.getInt(obj);
        } catch (NoSuchFieldException | Exception unused) {
        }
    }

    private static Method findAsInterfaceMethod(Class<?> cls, Class<?> cls2) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == IBinder.class) {
                Class<?> returnType = method.getReturnType();
                if (cls2.isAssignableFrom(returnType) || IInterface.class.isAssignableFrom(returnType)) {
                    method.setAccessible(true);
                    return method;
                }
            }
        }
        return null;
    }

    private Parcel fullScanAndRewrite(Parcel parcel, String str) {
        int dataSize = parcel.dataSize();
        if (dataSize < 20) {
            return null;
        }
        int length = this.mGuestPackage.length();
        int pad4 = pad4((length + 1) * 2) + 4;
        int i = 0;
        while (true) {
            if (i + pad4 > dataSize) {
                i = -1;
                break;
            }
            parcel.setDataPosition(i);
            if (parcel.readInt() == length) {
                try {
                    parcel.setDataPosition(i);
                    if (this.mGuestPackage.equals(parcel.readString())) {
                        break;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
            i += 4;
        }
        if (i < 0) {
            hexDump(parcel, 0, 64);
            return null;
        }
        Parcel obtain = Parcel.obtain();
        if (i > 0) {
            obtain.appendFrom(parcel, 0, i);
        }
        obtain.writeString(str);
        int dataPosition = obtain.dataPosition() - i;
        if (dataPosition < pad4) {
            int i2 = (pad4 - dataPosition) / 4;
            for (int i3 = 0; i3 < i2; i3++) {
                obtain.writeInt(0);
            }
        }
        int i4 = i + pad4;
        int i5 = dataSize - i4;
        if (i5 > 0) {
            obtain.appendFrom(parcel, i4, i5);
        }
        obtain.setDataPosition(0);
        return obtain;
    }

    private static String hexDump(Parcel parcel, int i, int i2) {
        int min = Math.min(i2 + i, parcel.dataSize());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i3 = i + 4;
            if (i3 > min) {
                return sb.toString();
            }
            parcel.setDataPosition(i);
            int readInt = parcel.readInt();
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(String.format("%08x", Integer.valueOf(readInt)));
            i = i3;
        }
    }

    private Object instantiateProxy(Class<?> cls) {
        Constructor<?>[] declaredConstructors;
        try {
            for (Constructor<?> constructor : cls.getDeclaredConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                    constructor.setAccessible(true);
                    return constructor.newInstance(this.mReal);
                }
            }
            return null;
        } catch (Exception unused) {
            cls.getClass();
            return null;
        }
    }

    public static /* synthetic */ Object lambda$wrapCallbackForLogging$0(IBinder iBinder, Object obj, Object obj2, Method method, Object[] objArr) {
        if ("asBinder".equals(method.getName())) {
            return iBinder;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            if (e.getCause() != null) {
                throw e.getCause();
            }
            throw e;
        }
    }

    private static int pad4(int i) {
        return (i + 3) & (-4);
    }

    private static void patchBundleExtras(Object obj, String str, String str2) {
        Field[] declaredFields;
        if (obj == null) {
            return;
        }
        try {
            for (Class<?> cls = obj.getClass(); cls != null && cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers()) && Bundle.class.isAssignableFrom(field.getType())) {
                        field.setAccessible(true);
                        Bundle bundle = (Bundle) field.get(obj);
                        if (bundle != null) {
                            patchBundlePackageKeys(bundle, str, str2);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void patchBundlePackageKeys(Bundle bundle, String str, String str2) {
        String[] strArr;
        for (String str3 : BUNDLE_PACKAGE_KEYS) {
            if (str.equals(bundle.getString(str3))) {
                bundle.putString(str3, str2);
            }
        }
    }

    public static void patchCallingPackage(Object obj, String str, String str2, String str3) {
        Field[] declaredFields;
        try {
            for (Class<?> cls = obj.getClass(); cls != null && cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.getType() == String.class) {
                        field.setAccessible(true);
                        if (str.equals(field.get(obj))) {
                            field.set(obj, str2);
                            field.getName();
                            return;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private Parcel rawScanAndRewrite(Parcel parcel, String str) {
        int i;
        int i2;
        int dataSize = parcel.dataSize();
        Parcel parcel2 = null;
        if (dataSize < 20) {
            return null;
        }
        parcel.setDataPosition(0);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            try {
                i = -1;
                if (i4 > Math.min(dataSize, 64)) {
                    i2 = -1;
                    break;
                }
                parcel.setDataPosition(i3);
                if (parcel.readInt() == 56) {
                    parcel.setDataPosition(i3);
                    if (GMS_BROKER_DESCRIPTOR.equals(parcel.readString())) {
                        i2 = parcel.dataPosition();
                        break;
                    }
                }
                i3 = i4;
            } catch (Exception unused) {
            }
        }
        if (i2 < 0) {
            return null;
        }
        parcel.setDataPosition(i2);
        parcel.readStrongBinder();
        int dataPosition = parcel.dataPosition();
        int length = this.mGuestPackage.length();
        int pad4 = pad4((length + 1) * 2) + 4;
        int i5 = dataPosition;
        while (true) {
            if (i5 + pad4 > dataSize) {
                break;
            }
            parcel.setDataPosition(i5);
            if (parcel.readInt() == length) {
                parcel.dataPosition();
                try {
                    parcel.setDataPosition(i5);
                    if (this.mGuestPackage.equals(parcel.readString())) {
                        i = i5;
                        break;
                    }
                } catch (Exception unused2) {
                    continue;
                }
            }
            i5 += 4;
        }
        if (i < 0) {
            hexDump(parcel, dataPosition, 64);
            return null;
        }
        pad4((str.length() + 1) * 2);
        parcel2 = Parcel.obtain();
        if (i > 0) {
            parcel2.appendFrom(parcel, 0, i);
        }
        parcel2.writeString(str);
        int dataPosition2 = parcel2.dataPosition() - i;
        if (dataPosition2 < pad4) {
            int i6 = (pad4 - dataPosition2) / 4;
            for (int i7 = 0; i7 < i6; i7++) {
                parcel2.writeInt(0);
            }
        }
        int i8 = i + pad4;
        int i9 = dataSize - i8;
        if (i9 > 0) {
            parcel2.appendFrom(parcel, i8, i9);
        }
        parcel2.setDataPosition(0);
        return parcel2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0036, code lost:
        r4 = r18.dataPosition();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.os.Parcel rewriteSafeParcelField4(android.os.Parcel r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.delegate.GmsBrokerBinderProxy.rewriteSafeParcelField4(android.os.Parcel, java.lang.String):android.os.Parcel");
    }

    private static Class<?> tryLoadClass(ClassLoader classLoader, String str) {
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Object tryProxyClass(ClassLoader classLoader, String str, Class<?> cls) {
        Class<?> tryLoadClass = tryLoadClass(classLoader, str);
        if (tryLoadClass == null || !cls.isAssignableFrom(tryLoadClass)) {
            return null;
        }
        return instantiateProxy(tryLoadClass);
    }

    public static Object wrapCallbackForLogging(final Object obj) {
        try {
            final IBinder asBinder = obj instanceof IInterface ? ((IInterface) obj).asBinder() : obj instanceof IBinder ? (IBinder) obj : (IBinder) obj.getClass().getMethod("asBinder", null).invoke(obj, null);
            if (asBinder == null) {
                return obj;
            }
            final Binder binder = new Binder() { // from class: com.app.framework.fake.delegate.GmsBrokerBinderProxy.2
                @Override // android.os.Binder, android.os.IBinder
                public String getInterfaceDescriptor() {
                    try {
                        return asBinder.getInterfaceDescriptor();
                    } catch (RemoteException unused) {
                        return "com.google.android.gms.common.internal.IGmsCallbacks";
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:106:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // android.os.Binder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onTransact(int r9, android.os.Parcel r10, android.os.Parcel r11, int r12) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
                        r1 = 1
                        r2 = 0
                        if (r9 == r1) goto L14
                        r1 = 3
                        if (r9 != r1) goto La
                        goto L14
                    La:
                        r10.setDataPosition(r2)
                        android.os.IBinder r0 = r1
                        boolean r9 = r0.transact(r9, r10, r11, r12)
                        return r9
                    L14:
                        r1 = 0
                        r10.setDataPosition(r2)     // Catch: java.lang.Exception -> L48
                        r10.enforceInterface(r0)     // Catch: java.lang.Exception -> L48
                        int r3 = r10.readInt()     // Catch: java.lang.Exception -> L48
                        int r4 = r10.dataPosition()     // Catch: java.lang.Exception -> L48
                        android.os.IBinder r5 = r10.readStrongBinder()     // Catch: java.lang.Exception -> L48
                        int r6 = r10.dataPosition()     // Catch: java.lang.Exception -> L48
                        if (r5 == 0) goto L65
                        if (r3 != 0) goto L65
                        java.lang.String r0 = r5.getInterfaceDescriptor()     // Catch: java.lang.Exception -> L34
                        goto L35
                    L34:
                        r0 = r1
                    L35:
                        com.app.framework.fake.delegate.GmsBrokerBinderProxy$LoggingServiceBinder r3 = new com.app.framework.fake.delegate.GmsBrokerBinderProxy$LoggingServiceBinder     // Catch: java.lang.Exception -> L48
                        r3.<init>(r5, r0)     // Catch: java.lang.Exception -> L48
                        if (r0 == 0) goto L4b
                        java.lang.String r5 = "games.internal.connect"
                        boolean r0 = r0.contains(r5)     // Catch: java.lang.Exception -> L48
                        if (r0 == 0) goto L4b
                        com.app.framework.fake.delegate.GmsBrokerBinderProxy.OooO0O0(r3)     // Catch: java.lang.Exception -> L48
                        goto L4b
                    L48:
                        r0 = move-exception
                        r3 = r1
                        goto La4
                    L4b:
                        android.os.Parcel r0 = android.os.Parcel.obtain()     // Catch: java.lang.Exception -> L48
                        r0.appendFrom(r10, r2, r4)     // Catch: java.lang.Exception -> L60
                        r0.writeStrongBinder(r3)     // Catch: java.lang.Exception -> L60
                        int r3 = r10.dataSize()     // Catch: java.lang.Exception -> L60
                        int r3 = r3 - r6
                        if (r3 <= 0) goto L9f
                        r0.appendFrom(r10, r6, r3)     // Catch: java.lang.Exception -> L60
                        goto L9f
                    L60:
                        r3 = move-exception
                        r7 = r3
                        r3 = r0
                        r0 = r7
                        goto La4
                    L65:
                        if (r3 == 0) goto Lae
                        if (r5 != 0) goto Lae
                        java.lang.String r3 = "com.google.android.gms.games.internal.IGamesService"
                        com.app.framework.fake.delegate.GmsBrokerBinderProxy$FakeGamesServiceBinder r4 = new com.app.framework.fake.delegate.GmsBrokerBinderProxy$FakeGamesServiceBinder     // Catch: java.lang.Exception -> L48
                        r4.<init>(r3)     // Catch: java.lang.Exception -> L48
                        android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch: java.lang.Exception -> L48
                        r10.setDataPosition(r2)     // Catch: java.lang.Exception -> L9c
                        r10.enforceInterface(r0)     // Catch: java.lang.Exception -> L9c
                        int r0 = r10.dataPosition()     // Catch: java.lang.Exception -> L9c
                        r3.appendFrom(r10, r2, r0)     // Catch: java.lang.Exception -> L9c
                        r3.writeInt(r2)     // Catch: java.lang.Exception -> L9c
                        r3.writeStrongBinder(r4)     // Catch: java.lang.Exception -> L9c
                        r10.readInt()     // Catch: java.lang.Exception -> L9c
                        r10.readStrongBinder()     // Catch: java.lang.Exception -> L9c
                        int r0 = r10.dataPosition()     // Catch: java.lang.Exception -> L9c
                        int r4 = r10.dataSize()     // Catch: java.lang.Exception -> L9c
                        int r4 = r4 - r0
                        if (r4 <= 0) goto L9e
                        r3.appendFrom(r10, r0, r4)     // Catch: java.lang.Exception -> L9c
                        goto L9e
                    L9c:
                        r0 = move-exception
                        goto La4
                    L9e:
                        r0 = r3
                    L9f:
                        r0.setDataPosition(r2)     // Catch: java.lang.Exception -> L60
                        r1 = r0
                        goto Lae
                    La4:
                        r0.getMessage()
                        if (r3 == 0) goto Lad
                        r3.recycle()
                        goto Lae
                    Lad:
                        r1 = r3
                    Lae:
                        if (r1 == 0) goto La
                        android.os.IBinder r10 = r1     // Catch: java.lang.Throwable -> Lba
                        boolean r9 = r10.transact(r9, r1, r11, r12)     // Catch: java.lang.Throwable -> Lba
                        r1.recycle()
                        return r9
                    Lba:
                        r9 = move-exception
                        r1.recycle()
                        throw r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.app.framework.fake.delegate.GmsBrokerBinderProxy.AnonymousClass2.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
                }

                @Override // android.os.Binder, android.os.IBinder
                public IInterface queryLocalInterface(String str) {
                    return null;
                }
            };
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            if (interfaces.length == 0) {
                interfaces = obj.getClass().getSuperclass() != null ? obj.getClass().getSuperclass().getInterfaces() : new Class[0];
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls : interfaces) {
                if (IInterface.class.isAssignableFrom(cls)) {
                    arrayList.add(cls);
                }
            }
            if (arrayList.isEmpty()) {
                return obj;
            }
            Object newProxyInstance = Proxy.newProxyInstance(classLoader, (Class[]) arrayList.toArray(new Class[0]), new InvocationHandler() { // from class: com.ninja.engine.oO0000Oo
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    Object lambda$wrapCallbackForLogging$0;
                    lambda$wrapCallbackForLogging$0 = GmsBrokerBinderProxy.lambda$wrapCallbackForLogging$0(binder, obj, obj2, method, objArr);
                    return lambda$wrapCallbackForLogging$0;
                }
            });
            newProxyInstance.getClass();
            return newProxyInstance;
        } catch (Exception e) {
            e.getMessage();
            return obj;
        }
    }

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) {
        this.mReal.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        this.mReal.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.mReal.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.mReal.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.mReal.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.mReal.pingBinder();
    }

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        if (GMS_BROKER_DESCRIPTOR.equals(str)) {
            try {
                return createJavaLevelProxy();
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // android.os.IBinder
    public boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        parcel.dataSize();
        String hostPkg = BlackBoxCore.getHostPkg();
        String str = this.mGuestPackage;
        if (str != null && hostPkg != null && !str.equals(hostPkg)) {
            try {
                Parcel rewriteSafeParcelField4 = rewriteSafeParcelField4(parcel, hostPkg);
                if (rewriteSafeParcelField4 == null) {
                    rewriteSafeParcelField4 = rawScanAndRewrite(parcel, hostPkg);
                }
                if (rewriteSafeParcelField4 == null) {
                    rewriteSafeParcelField4 = fullScanAndRewrite(parcel, hostPkg);
                }
                if (rewriteSafeParcelField4 != null) {
                    boolean transact = this.mReal.transact(i, rewriteSafeParcelField4, parcel2, i2);
                    rewriteSafeParcelField4.recycle();
                    return transact;
                }
                parcel.dataSize();
            } catch (Exception unused) {
            }
        }
        parcel.setDataPosition(0);
        return this.mReal.transact(i, parcel, parcel2, i2);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.mReal.unlinkToDeath(deathRecipient, i);
    }
}
