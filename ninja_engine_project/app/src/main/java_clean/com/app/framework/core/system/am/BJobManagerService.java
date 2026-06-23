package com.app.framework.core.system.am;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.text.TextUtils;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.BProcessManagerService;
import com.app.framework.core.system.ISystemService;
import com.app.framework.core.system.ProcessRecord;
import com.app.framework.core.system.am.IBJobManagerService;
import com.app.framework.core.system.pm.BPackageManagerService;
import com.app.framework.entity.JobRecord;
import com.app.framework.proxy.ProxyManifest;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1574oo0o0o0;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BJobManagerService extends IBJobManagerService.Stub implements ISystemService {
    private static final BJobManagerService sService = new BJobManagerService();
    private final Map<String, JobRecord> mJobRecords = new HashMap();

    private String formatKey(String str, int i) {
        return str + "_" + i;
    }

    public static BJobManagerService get() {
        return sService;
    }

    @Override // com.app.framework.core.system.am.IBJobManagerService
    public int cancel(String str, int i, int i2) {
        return i;
    }

    @Override // com.app.framework.core.system.am.IBJobManagerService
    public void cancelAll(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : this.mJobRecords.keySet()) {
            if (str2.startsWith(str + "_")) {
                this.mJobRecords.get(str2);
            }
        }
    }

    @Override // com.app.framework.core.system.am.IBJobManagerService
    public JobRecord queryJobRecord(String str, int i, int i2) {
        return this.mJobRecords.get(formatKey(str, i));
    }

    @Override // com.app.framework.core.system.am.IBJobManagerService
    public JobInfo schedule(JobInfo jobInfo, int i) {
        ComponentName service = jobInfo.getService();
        Intent intent = new Intent();
        intent.setComponent(service);
        ResolveInfo resolveService = BPackageManagerService.get().resolveService(intent, 128, null, i);
        if (resolveService == null) {
            return jobInfo;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        ProcessRecord findProcessRecord = BProcessManagerService.get().findProcessRecord(serviceInfo.packageName, serviceInfo.processName, i);
        if (findProcessRecord == null && (findProcessRecord = BProcessManagerService.get().startProcessLocked(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid())) == null) {
            throw new RuntimeException("Unable to create Process " + serviceInfo.processName);
        }
        return scheduleJob(findProcessRecord, jobInfo, serviceInfo);
    }

    public JobInfo scheduleJob(ProcessRecord processRecord, JobInfo jobInfo, ServiceInfo serviceInfo) {
        JobRecord jobRecord = new JobRecord();
        jobRecord.mJobInfo = jobInfo;
        jobRecord.mServiceInfo = serviceInfo;
        this.mJobRecords.put(formatKey(processRecord.processName, jobInfo.getId()), jobRecord);
        ((InterfaceC1574oo0o0o0) C0217o00o0oO0.create(InterfaceC1574oo0o0o0.class, jobInfo, false))._set_service(new ComponentName(BlackBoxCore.getHostPkg(), ProxyManifest.getProxyJobService(processRecord.bpid)));
        return jobInfo;
    }

    @Override // com.app.framework.core.system.ISystemService
    public void systemReady() {
    }
}


