package com.app.framework.app.dispatcher;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.res.Configuration;
import com.app.framework.BlackBoxCore;
import com.app.framework.entity.JobRecord;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class AppJobServiceDispatcher {
    private static final AppJobServiceDispatcher sServiceDispatcher = new AppJobServiceDispatcher();
    private final Map<Integer, JobRecord> mJobRecords = new HashMap();

    public static AppJobServiceDispatcher get() {
        return sServiceDispatcher;
    }

    public JobService getJobService(int i) {
        JobService jobService;
        synchronized (this.mJobRecords) {
            JobRecord jobRecord = this.mJobRecords.get(Integer.valueOf(i));
            if (jobRecord == null || (jobService = jobRecord.mJobService) == null) {
                JobRecord queryJobRecord = BlackBoxCore.getBJobManager().queryJobRecord(BlackBoxCore.getAppProcessName(), i);
                JobService createJobService = BlackBoxCore.currentActivityThread().createJobService(queryJobRecord.mServiceInfo);
                queryJobRecord.mJobService = createJobService;
                if (createJobService == null) {
                    return null;
                }
                this.mJobRecords.put(Integer.valueOf(i), queryJobRecord);
                return queryJobRecord.mJobService;
            }
            return jobService;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                jobService.onConfigurationChanged(configuration);
            }
        }
    }

    public void onDestroy() {
    }

    public void onLowMemory() {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                jobService.onLowMemory();
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        try {
            JobService jobService = getJobService(jobParameters.getJobId());
            if (jobService == null) {
                return false;
            }
            return jobService.onStartJob(jobParameters);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        JobService jobService = getJobService(jobParameters.getJobId());
        if (jobService == null) {
            return false;
        }
        boolean onStopJob = jobService.onStopJob(jobParameters);
        jobService.onDestroy();
        synchronized (this.mJobRecords) {
            this.mJobRecords.remove(Integer.valueOf(jobParameters.getJobId()));
        }
        return onStopJob;
    }

    public void onTrimMemory(int i) {
        for (JobRecord jobRecord : this.mJobRecords.values()) {
            JobService jobService = jobRecord.mJobService;
            if (jobService != null) {
                jobService.onTrimMemory(i);
            }
        }
    }
}


