package com.app.framework.fake.delegate;

import android.app.IServiceConnection;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.GmsCore;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1382oo000ooO;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class ServiceConnectionDelegate extends IServiceConnection.Stub {
    private static final Map<IBinder, ServiceConnectionDelegate> sServiceConnectDelegate = new HashMap();
    private final ComponentName mComponentName;
    private final IServiceConnection mConn;
    private final String mTargetPackage;

    private ServiceConnectionDelegate(IServiceConnection iServiceConnection, ComponentName componentName, String str) {
        this.mConn = iServiceConnection;
        this.mComponentName = componentName;
        this.mTargetPackage = str;
    }

    public static IServiceConnection createProxy(IServiceConnection iServiceConnection, Intent intent) {
        final IBinder asBinder = iServiceConnection.asBinder();
        ServiceConnectionDelegate serviceConnectionDelegate = sServiceConnectDelegate.get(asBinder);
        if (serviceConnectionDelegate == null) {
            try {
                asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.app.framework.fake.delegate.ServiceConnectionDelegate.1
                    @Override // android.os.IBinder.DeathRecipient
                    public void binderDied() {
                        ServiceConnectionDelegate.sServiceConnectDelegate.remove(asBinder);
                        asBinder.unlinkToDeath(this, 0);
                    }
                }, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            ServiceConnectionDelegate serviceConnectionDelegate2 = new ServiceConnectionDelegate(iServiceConnection, intent.getComponent(), intent.getPackage());
            sServiceConnectDelegate.put(asBinder, serviceConnectionDelegate2);
            return serviceConnectionDelegate2;
        }
        return serviceConnectionDelegate;
    }

    public static ServiceConnectionDelegate getDelegate(IBinder iBinder) {
        return sServiceConnectDelegate.get(iBinder);
    }

    private IBinder wrapGmsBrokerIfNeeded(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            ComponentName componentName = this.mComponentName;
            if (GmsCore.GMS_PKG.equals(componentName != null ? componentName.getPackageName() : this.mTargetPackage)) {
                if (!"com.google.android.gms.common.internal.IGmsServiceBroker".equals(iBinder.getInterfaceDescriptor())) {
                    Objects.toString(this.mComponentName);
                    return iBinder;
                }
                String appPackageName = BActivityThread.getAppPackageName();
                if (appPackageName != null) {
                    Objects.toString(this.mComponentName);
                    return new GmsBrokerBinderProxy(iBinder, appPackageName);
                }
            }
        } catch (Exception unused) {
        }
        return iBinder;
    }

    @Override // android.app.IServiceConnection
    public void connected(ComponentName componentName, IBinder iBinder) {
        connected(componentName, iBinder, false);
    }

    @Override // android.app.IServiceConnection.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (Build.VERSION.SDK_INT < 36 || i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(IServiceConnection.Stub.DESCRIPTOR);
        ComponentName componentName = parcel.readInt() != 0 ? (ComponentName) ComponentName.CREATOR.createFromParcel(parcel) : null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.readStrongBinder();
        connected(componentName, readStrongBinder, parcel.readInt() != 0);
        return true;
    }

    public void connected(ComponentName componentName, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            try {
                iBinder.getInterfaceDescriptor();
            } catch (Exception unused) {
            }
        }
        Objects.toString(componentName);
        Objects.toString(this.mComponentName);
        IBinder wrapGmsBrokerIfNeeded = wrapGmsBrokerIfNeeded(iBinder);
        if (componentName == null) {
            componentName = this.mComponentName;
        }
        if (BuildCompat.isOreo()) {
            ((InterfaceC1382oo000ooO) C0217o00o0oO0.create(InterfaceC1382oo000ooO.class, this.mConn, false)).connected(componentName, wrapGmsBrokerIfNeeded, z);
        } else {
            this.mConn.connected(componentName, wrapGmsBrokerIfNeeded);
        }
    }
}


