package com.app.framework.fake.frameworks;

import android.app.job.JobInfo;
import android.os.RemoteException;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.system.ServiceManager;
import com.app.framework.core.system.am.IBJobManagerService;
import com.app.framework.entity.JobRecord;
/* loaded from: classes.dex */
public class BJobManager extends VirtualServiceManager<IBJobManagerService> {
    private static final BJobManager sJobManager = new BJobManager();

    public static BJobManager get() {
        return sJobManager;
    }

    public int cancel(String str, int i) {
        try {
            return getService().cancel(str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void cancelAll(String str) {
        try {
            getService().cancelAll(str, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.app.framework.fake.frameworks.VirtualServiceManager
    public String getServiceName() {
        return ServiceManager.JOB_MANAGER;
    }

    public JobRecord queryJobRecord(String str, int i) {
        try {
            return getService().queryJobRecord(str, i, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JobInfo schedule(JobInfo jobInfo) {
        try {
            return getService().schedule(jobInfo, BActivityThread.getUserId());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }
}
