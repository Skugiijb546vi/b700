package com.app.framework.fake.frameworks;

import android.os.IBinder;
import android.os.IInterface;
import com.app.framework.BlackBoxCore;
import com.app.framework.utils.Reflector;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class VirtualServiceManager<Service extends IInterface> {
    private static final long GLOBAL_FAILURE_RESET_INTERVAL_MS = 30000;
    private static final long MIN_SERVICE_CREATION_INTERVAL_MS = 50;
    private static final long RETRY_TIMEOUT_MS = 2000;
    public static final String TAG = "VirtualServiceManager";
    private static final AtomicInteger globalServiceFailureCount = new AtomicInteger(0);
    private static long lastGlobalFailureReset = 0;
    private Service mService;
    private final AtomicBoolean mServiceCreationFailed = new AtomicBoolean(false);
    private long mLastRetryTime = 0;
    private long mLastServiceCreationTime = 0;

    private Class<Service> getTClass() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    private void markServiceCreationFailed() {
        this.mServiceCreationFailed.set(true);
        this.mLastRetryTime = System.currentTimeMillis();
    }

    public void clearServiceCache() {
        this.mService = null;
        getServiceName();
    }

    public Service getService() {
        IBinder service;
        if (this.mServiceCreationFailed.get()) {
            if (System.currentTimeMillis() - this.mLastRetryTime < RETRY_TIMEOUT_MS) {
                getServiceName();
                return null;
            }
            this.mServiceCreationFailed.set(false);
        }
        Service service2 = this.mService;
        if (service2 != null && service2.asBinder().pingBinder() && this.mService.asBinder().isBinderAlive()) {
            return this.mService;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mLastServiceCreationTime < MIN_SERVICE_CREATION_INTERVAL_MS) {
            getServiceName();
            return this.mService;
        }
        try {
            service = BlackBoxCore.get().getService(getServiceName());
        } catch (Throwable unused) {
            getServiceName();
            markServiceCreationFailed();
            return null;
        }
        if (service == null) {
            getServiceName();
            markServiceCreationFailed();
            return null;
        } else if (!service.isBinderAlive()) {
            getServiceName();
            markServiceCreationFailed();
            return null;
        } else {
            Service service3 = (Service) Reflector.on(getTClass().getName().concat("$Stub")).method("asInterface", IBinder.class).call(service);
            this.mService = service3;
            if (service3 != null) {
                try {
                    if (!service3.asBinder().isBinderAlive()) {
                        getServiceName();
                        this.mService = null;
                        markServiceCreationFailed();
                        return null;
                    }
                    final Service service4 = this.mService;
                    try {
                        service4.asBinder().linkToDeath(new IBinder.DeathRecipient() { // from class: com.app.framework.fake.frameworks.VirtualServiceManager.1
                            @Override // android.os.IBinder.DeathRecipient
                            public void binderDied() {
                                try {
                                    IInterface iInterface = service4;
                                    if (iInterface != null && iInterface.asBinder() != null) {
                                        service4.asBinder().unlinkToDeath(this, 0);
                                    }
                                } catch (Exception unused2) {
                                    VirtualServiceManager.this.getServiceName();
                                }
                                VirtualServiceManager virtualServiceManager = VirtualServiceManager.this;
                                virtualServiceManager.mService = null;
                                virtualServiceManager.getServiceName();
                            }
                        }, 0);
                    } catch (Exception unused2) {
                        getServiceName();
                    }
                    getServiceName();
                    this.mServiceCreationFailed.set(false);
                    this.mLastServiceCreationTime = currentTimeMillis;
                } catch (Exception unused3) {
                    getServiceName();
                    this.mService = null;
                    markServiceCreationFailed();
                    return null;
                }
                getServiceName();
                markServiceCreationFailed();
                return null;
            }
            getServiceName();
            markServiceCreationFailed();
            return this.mService;
        }
    }

    public abstract String getServiceName();

    public boolean isServiceHealthy() {
        Service service = this.mService;
        if (service == null) {
            return false;
        }
        try {
            if (service.asBinder().pingBinder()) {
                return this.mService.asBinder().isBinderAlive();
            }
            return false;
        } catch (Exception unused) {
            getServiceName();
            return false;
        }
    }
}
