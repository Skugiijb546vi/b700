package com.ninja.engine;

import android.app.Application;
import android.app.IServiceConnection;
import android.app.Instrumentation;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IIntentReceiver;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.os.IInterface;
import java.io.File;
import java.lang.ref.WeakReference;
@InterfaceC0158o00Oo0O0("android.app.LoadedApk")
/* renamed from: com.ninja.engine.ooOoOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1883ooOoOOo {

    @InterfaceC0158o00Oo0O0("android.app.LoadedApk$ReceiverDispatcher")
    /* renamed from: com.ninja.engine.ooOoOOo$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {

        @InterfaceC0158o00Oo0O0("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver")
        /* renamed from: com.ninja.engine.ooOoOOo$OooO00o$OooO00o  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0004OooO00o {
            @InterfaceC0160o00Oo0o
            WeakReference<?> mDispatcher();
        }

        @InterfaceC0153o00Oo
        IInterface getIIntentReceiver();

        @InterfaceC0160o00Oo0o
        IIntentReceiver mIIntentReceiver();

        @InterfaceC0160o00Oo0o
        BroadcastReceiver mReceiver();
    }

    @InterfaceC0158o00Oo0O0("android.app.LoadedApk$ServiceDispatcher")
    /* renamed from: com.ninja.engine.ooOoOOo$OooO0O0 */
    /* loaded from: classes.dex */
    public interface OooO0O0 {

        @InterfaceC0158o00Oo0O0("android.app.LoadedApk$ServiceDispatcher$InnerConnection")
        /* renamed from: com.ninja.engine.ooOoOOo$OooO0O0$OooO00o */
        /* loaded from: classes.dex */
        public interface OooO00o {
            @InterfaceC0160o00Oo0o
            WeakReference<?> mDispatcher();
        }

        @InterfaceC0160o00Oo0o
        ServiceConnection mConnection();

        @InterfaceC0160o00Oo0o
        Context mContext();
    }

    @InterfaceC0153o00Oo
    IServiceConnection forgetServiceDispatcher(Context context, ServiceConnection serviceConnection);

    @InterfaceC0153o00Oo
    ClassLoader getClassLoader();

    @InterfaceC0153o00Oo
    Object getResources();

    @InterfaceC0153o00Oo
    IServiceConnection getServiceDispatcher(ServiceConnection serviceConnection, Context context, Handler handler, int i);

    @InterfaceC0160o00Oo0o
    Application mApplication();

    @InterfaceC0160o00Oo0o
    ApplicationInfo mApplicationInfo();

    @InterfaceC0160o00Oo0o
    File mCredentialProtectedDataDirFile();

    @InterfaceC0160o00Oo0o
    String mDataDir();

    @InterfaceC0160o00Oo0o
    File mDataDirFile();

    @InterfaceC0160o00Oo0o
    File mDeviceProtectedDataDirFile();

    @InterfaceC0160o00Oo0o
    String mLibDir();

    @InterfaceC0160o00Oo0o
    boolean mPackageName();

    @InterfaceC0160o00Oo0o
    boolean mSecurityViolation();

    @InterfaceC0153o00Oo
    Application makeApplication(boolean z, Instrumentation instrumentation);
}


