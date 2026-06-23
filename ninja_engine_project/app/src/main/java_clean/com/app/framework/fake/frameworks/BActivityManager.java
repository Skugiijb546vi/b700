package com.app.framework.fake.frameworks;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.am.IBActivityManagerService;
import com.app.framework.entity.AppConfig;
import com.app.framework.entity.UnbindRecord;
import com.app.framework.entity.am.PendingResultData;
import com.app.framework.entity.am.RunningAppProcessInfo;
import com.app.framework.entity.am.RunningServiceInfo;
/* loaded from: classes.dex */
public class BActivityManager extends VirtualServiceManager<IBActivityManagerService> {
    private static final String TAG = "BActivityManager";
    private static final BActivityManager sActivityManager = new BActivityManager();

    public static BActivityManager get() {
        return sActivityManager;
    }

    public IBinder acquireContentProviderClient(ProviderInfo providerInfo) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.acquireContentProviderClient(providerInfo);
            }
            return null;
        } catch (DeadObjectException unused) {
            clearServiceCache();
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public Intent bindService(Intent intent, IBinder iBinder, String str, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.bindService(intent, iBinder, str, i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void finishBroadcast(PendingResultData pendingResultData) {
        try {
            getService().finishBroadcast(pendingResultData);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public ComponentName getCallingActivity(IBinder iBinder, int i) {
        try {
            return getService().getCallingActivity(iBinder, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getCallingPackage(IBinder iBinder, int i) {
        try {
            return getService().getCallingPackage(iBinder, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getIntentSender(IBinder iBinder, String str, int i) {
        try {
            getService().getIntentSender(iBinder, str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getPackageForIntentSender(IBinder iBinder) {
        try {
            return getService().getPackageForIntentSender(iBinder, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public RunningAppProcessInfo getRunningAppProcesses(String str, int i) {
        try {
            return getService().getRunningAppProcesses(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public RunningServiceInfo getRunningServices(String str, int i) {
        try {
            return getService().getRunningServices(str, i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.app.framework.fake.frameworks.VirtualServiceManager
    public String getServiceName() {
        return ServiceManager.ACTIVITY_MANAGER;
    }

    public int getUidForIntentSender(IBinder iBinder) {
        try {
            return getService().getUidForIntentSender(iBinder, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public AppConfig initProcess(String str, String str2, int i) {
        AppConfig initProcess;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                IBActivityManagerService service = getService();
                if (service != null && (initProcess = service.initProcess(str, str2, i)) != null) {
                    return initProcess;
                }
            } catch (DeadObjectException unused) {
                clearServiceCache();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            } catch (Exception unused3) {
                return null;
            }
        }
        return null;
    }

    public void onActivityCreated(int i, IBinder iBinder, IBinder iBinder2) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.onActivityCreated(i, iBinder, iBinder2);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onActivityDestroyed(IBinder iBinder) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.onActivityDestroyed(iBinder);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onActivityResumed(IBinder iBinder) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.onActivityResumed(iBinder);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onFinishActivity(IBinder iBinder) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.onFinishActivity(iBinder);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void onServiceDestroy(Intent intent, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.onServiceDestroy(intent, i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public UnbindRecord onServiceUnbind(Intent intent, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.onServiceUnbind(intent, i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void onStartCommand(Intent intent, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.onStartCommand(intent, i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public IBinder peekService(Intent intent, String str, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.peekService(intent, str, i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void restartProcess(String str, String str2, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.restartProcess(str, str2, i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void scheduleBroadcastReceiver(Intent intent, PendingResultData pendingResultData, int i) {
        getService().scheduleBroadcastReceiver(intent, pendingResultData, i);
    }

    public Intent sendBroadcast(Intent intent, String str, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.sendBroadcast(intent, str, i);
            }
            return null;
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int startActivities(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.startActivities(i, intentArr, strArr, iBinder, bundle);
            }
            return -1;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void startActivity(Intent intent, int i) {
        IBActivityManagerService service;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                try {
                    service = getService();
                } catch (Exception unused) {
                    return;
                }
            } catch (DeadObjectException unused2) {
                clearServiceCache();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (service != null) {
                service.startActivity(intent, i);
                return;
            }
            try {
                Thread.sleep((i2 + 1) * 200);
            } catch (InterruptedException unused4) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public int startActivityAms(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
        IBActivityManagerService service;
        for (int i4 = 0; i4 < 3; i4++) {
            try {
                service = getService();
            } catch (DeadObjectException unused) {
                clearServiceCache();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return -1;
                }
            } catch (Exception unused3) {
                return -1;
            }
            if (service != null) {
                return service.startActivityAms(i, intent, str, iBinder, str2, i2, i3, bundle);
            }
            continue;
        }
        return -1;
    }

    public ComponentName startService(Intent intent, String str, boolean z, int i) {
        IBActivityManagerService service;
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                service = getService();
            } catch (DeadObjectException unused) {
                clearServiceCache();
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return null;
                }
            } catch (Exception unused3) {
                return null;
            }
            if (service != null) {
                return service.startService(intent, str, z, i);
            }
            continue;
        }
        return null;
    }

    public int stopService(Intent intent, String str, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                return service.stopService(intent, str, i);
            }
            return -1;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void stopServiceToken(ComponentName componentName, IBinder iBinder, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.stopServiceToken(componentName, iBinder, i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void unbindService(IBinder iBinder, int i) {
        try {
            IBActivityManagerService service = getService();
            if (service != null) {
                service.unbindService(iBinder, i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}



