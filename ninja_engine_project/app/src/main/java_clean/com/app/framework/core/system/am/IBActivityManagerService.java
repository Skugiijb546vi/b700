package com.app.framework.core.system.am;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.framework.entity.AppConfig;
import com.app.framework.entity.UnbindRecord;
import com.app.framework.entity.am.PendingResultData;
import com.app.framework.entity.am.RunningAppProcessInfo;
import com.app.framework.entity.am.RunningServiceInfo;
/* loaded from: classes.dex */
public interface IBActivityManagerService extends IInterface {
    public static final String DESCRIPTOR = "com.app.framework.core.system.am.IBActivityManagerService";

    /* loaded from: classes.dex */
    public static class Default implements IBActivityManagerService {
        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public Intent bindService(Intent intent, IBinder iBinder, String str, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void finishBroadcast(PendingResultData pendingResultData) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public ComponentName getCallingActivity(IBinder iBinder, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public String getCallingPackage(IBinder iBinder, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void getIntentSender(IBinder iBinder, String str, int i, int i2) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public String getPackageForIntentSender(IBinder iBinder, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public RunningAppProcessInfo getRunningAppProcesses(String str, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public RunningServiceInfo getRunningServices(String str, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public int getUidForIntentSender(IBinder iBinder, int i) {
            return 0;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public AppConfig initProcess(String str, String str2, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void onActivityCreated(int i, IBinder iBinder, IBinder iBinder2) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void onActivityDestroyed(IBinder iBinder) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void onActivityResumed(IBinder iBinder) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void onFinishActivity(IBinder iBinder) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void onServiceDestroy(Intent intent, int i) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public UnbindRecord onServiceUnbind(Intent intent, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void onStartCommand(Intent intent, int i) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public IBinder peekService(Intent intent, String str, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void restartProcess(String str, String str2, int i) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void scheduleBroadcastReceiver(Intent intent, PendingResultData pendingResultData, int i) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public Intent sendBroadcast(Intent intent, String str, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public int startActivities(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
            return 0;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void startActivity(Intent intent, int i) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public int startActivityAms(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
            return 0;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public ComponentName startService(Intent intent, String str, boolean z, int i) {
            return null;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public int stopService(Intent intent, String str, int i) {
            return 0;
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void stopServiceToken(ComponentName componentName, IBinder iBinder, int i) {
        }

        @Override // com.app.framework.core.system.am.IBActivityManagerService
        public void unbindService(IBinder iBinder, int i) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IBActivityManagerService {
        static final int TRANSACTION_acquireContentProviderClient = 14;
        static final int TRANSACTION_bindService = 8;
        static final int TRANSACTION_finishBroadcast = 24;
        static final int TRANSACTION_getCallingActivity = 26;
        static final int TRANSACTION_getCallingPackage = 25;
        static final int TRANSACTION_getIntentSender = 27;
        static final int TRANSACTION_getPackageForIntentSender = 28;
        static final int TRANSACTION_getRunningAppProcesses = 21;
        static final int TRANSACTION_getRunningServices = 22;
        static final int TRANSACTION_getUidForIntentSender = 29;
        static final int TRANSACTION_initProcess = 1;
        static final int TRANSACTION_onActivityCreated = 17;
        static final int TRANSACTION_onActivityDestroyed = 19;
        static final int TRANSACTION_onActivityResumed = 18;
        static final int TRANSACTION_onFinishActivity = 20;
        static final int TRANSACTION_onServiceDestroy = 13;
        static final int TRANSACTION_onServiceUnbind = 12;
        static final int TRANSACTION_onStartCommand = 11;
        static final int TRANSACTION_peekService = 16;
        static final int TRANSACTION_restartProcess = 2;
        static final int TRANSACTION_scheduleBroadcastReceiver = 23;
        static final int TRANSACTION_sendBroadcast = 15;
        static final int TRANSACTION_startActivities = 5;
        static final int TRANSACTION_startActivity = 3;
        static final int TRANSACTION_startActivityAms = 4;
        static final int TRANSACTION_startService = 6;
        static final int TRANSACTION_stopService = 7;
        static final int TRANSACTION_stopServiceToken = 10;
        static final int TRANSACTION_unbindService = 9;

        /* loaded from: classes.dex */
        public static class Proxy implements IBActivityManagerService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, providerInfo, 0);
                    this.mRemote.transact(Stub.TRANSACTION_acquireContentProviderClient, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public Intent bindService(Intent intent, IBinder iBinder, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) _Parcel.readTypedObject(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void finishBroadcast(PendingResultData pendingResultData) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, pendingResultData, 0);
                    this.mRemote.transact(Stub.TRANSACTION_finishBroadcast, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public ComponentName getCallingActivity(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_getCallingActivity, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ComponentName) _Parcel.readTypedObject(obtain2, ComponentName.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public String getCallingPackage(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_getCallingPackage, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void getIntentSender(IBinder iBinder, String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(Stub.TRANSACTION_getIntentSender, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IBActivityManagerService.DESCRIPTOR;
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public String getPackageForIntentSender(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_getPackageForIntentSender, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public RunningAppProcessInfo getRunningAppProcesses(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_getRunningAppProcesses, obtain, obtain2, 0);
                    obtain2.readException();
                    return (RunningAppProcessInfo) _Parcel.readTypedObject(obtain2, RunningAppProcessInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public RunningServiceInfo getRunningServices(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_getRunningServices, obtain, obtain2, 0);
                    obtain2.readException();
                    return (RunningServiceInfo) _Parcel.readTypedObject(obtain2, RunningServiceInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public int getUidForIntentSender(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_getUidForIntentSender, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public AppConfig initProcess(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (AppConfig) _Parcel.readTypedObject(obtain2, AppConfig.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void onActivityCreated(int i, IBinder iBinder, IBinder iBinder2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeStrongBinder(iBinder2);
                    this.mRemote.transact(Stub.TRANSACTION_onActivityCreated, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void onActivityDestroyed(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_onActivityDestroyed, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void onActivityResumed(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_onActivityResumed, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void onFinishActivity(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_onFinishActivity, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void onServiceDestroy(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_onServiceDestroy, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public UnbindRecord onServiceUnbind(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_onServiceUnbind, obtain, obtain2, 0);
                    obtain2.readException();
                    return (UnbindRecord) _Parcel.readTypedObject(obtain2, UnbindRecord.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void onStartCommand(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_onStartCommand, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public IBinder peekService(Intent intent, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void restartProcess(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void scheduleBroadcastReceiver(Intent intent, PendingResultData pendingResultData, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    _Parcel.writeTypedObject(obtain, pendingResultData, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_scheduleBroadcastReceiver, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public Intent sendBroadcast(Intent intent, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_sendBroadcast, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) _Parcel.readTypedObject(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public int startActivities(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeTypedArray(intentArr, 0);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(iBinder);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void startActivity(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public int startActivityAms(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public ComponentName startService(Intent intent, String str, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ComponentName) _Parcel.readTypedObject(obtain2, ComponentName.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public int stopService(Intent intent, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void stopServiceToken(ComponentName componentName, IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.app.framework.core.system.am.IBActivityManagerService
            public void unbindService(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IBActivityManagerService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_unbindService, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IBActivityManagerService.DESCRIPTOR);
        }

        public static IBActivityManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IBActivityManagerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IBActivityManagerService)) ? new Proxy(iBinder) : (IBActivityManagerService) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            Parcelable initProcess;
            int startActivityAms;
            IBinder acquireContentProviderClient;
            String callingPackage;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IBActivityManagerService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IBActivityManagerService.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    initProcess = initProcess(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case 2:
                    restartProcess(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    startActivity((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    startActivityAms = startActivityAms(parcel.readInt(), (Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(startActivityAms);
                    return true;
                case 5:
                    startActivityAms = startActivities(parcel.readInt(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readStrongBinder(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(startActivityAms);
                    return true;
                case 6:
                    initProcess = startService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case 7:
                    startActivityAms = stopService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(startActivityAms);
                    return true;
                case 8:
                    initProcess = bindService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case TRANSACTION_unbindService /* 9 */:
                    unbindService(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    stopServiceToken((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_onStartCommand /* 11 */:
                    onStartCommand((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_onServiceUnbind /* 12 */:
                    initProcess = onServiceUnbind((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case TRANSACTION_onServiceDestroy /* 13 */:
                    onServiceDestroy((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_acquireContentProviderClient /* 14 */:
                    acquireContentProviderClient = acquireContentProviderClient((ProviderInfo) _Parcel.readTypedObject(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(acquireContentProviderClient);
                    return true;
                case TRANSACTION_sendBroadcast /* 15 */:
                    initProcess = sendBroadcast((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case 16:
                    acquireContentProviderClient = peekService((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(acquireContentProviderClient);
                    return true;
                case TRANSACTION_onActivityCreated /* 17 */:
                    onActivityCreated(parcel.readInt(), parcel.readStrongBinder(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_onActivityResumed /* 18 */:
                    onActivityResumed(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_onActivityDestroyed /* 19 */:
                    onActivityDestroyed(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_onFinishActivity /* 20 */:
                    onFinishActivity(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getRunningAppProcesses /* 21 */:
                    initProcess = getRunningAppProcesses(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case TRANSACTION_getRunningServices /* 22 */:
                    initProcess = getRunningServices(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case TRANSACTION_scheduleBroadcastReceiver /* 23 */:
                    scheduleBroadcastReceiver((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR), (PendingResultData) _Parcel.readTypedObject(parcel, PendingResultData.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_finishBroadcast /* 24 */:
                    finishBroadcast((PendingResultData) _Parcel.readTypedObject(parcel, PendingResultData.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getCallingPackage /* 25 */:
                    callingPackage = getCallingPackage(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(callingPackage);
                    return true;
                case TRANSACTION_getCallingActivity /* 26 */:
                    initProcess = getCallingActivity(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, initProcess, 1);
                    return true;
                case TRANSACTION_getIntentSender /* 27 */:
                    getIntentSender(parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getPackageForIntentSender /* 28 */:
                    callingPackage = getPackageForIntentSender(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(callingPackage);
                    return true;
                case TRANSACTION_getUidForIntentSender /* 29 */:
                    startActivityAms = getUidForIntentSender(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(startActivityAms);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    IBinder acquireContentProviderClient(ProviderInfo providerInfo);

    Intent bindService(Intent intent, IBinder iBinder, String str, int i);

    void finishBroadcast(PendingResultData pendingResultData);

    ComponentName getCallingActivity(IBinder iBinder, int i);

    String getCallingPackage(IBinder iBinder, int i);

    void getIntentSender(IBinder iBinder, String str, int i, int i2);

    String getPackageForIntentSender(IBinder iBinder, int i);

    RunningAppProcessInfo getRunningAppProcesses(String str, int i);

    RunningServiceInfo getRunningServices(String str, int i);

    int getUidForIntentSender(IBinder iBinder, int i);

    AppConfig initProcess(String str, String str2, int i);

    void onActivityCreated(int i, IBinder iBinder, IBinder iBinder2);

    void onActivityDestroyed(IBinder iBinder);

    void onActivityResumed(IBinder iBinder);

    void onFinishActivity(IBinder iBinder);

    void onServiceDestroy(Intent intent, int i);

    UnbindRecord onServiceUnbind(Intent intent, int i);

    void onStartCommand(Intent intent, int i);

    IBinder peekService(Intent intent, String str, int i);

    void restartProcess(String str, String str2, int i);

    void scheduleBroadcastReceiver(Intent intent, PendingResultData pendingResultData, int i);

    Intent sendBroadcast(Intent intent, String str, int i);

    int startActivities(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle);

    void startActivity(Intent intent, int i);

    int startActivityAms(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle);

    ComponentName startService(Intent intent, String str, boolean z, int i);

    int stopService(Intent intent, String str, int i);

    void stopServiceToken(ComponentName componentName, IBinder iBinder, int i);

    void unbindService(IBinder iBinder, int i);
}


