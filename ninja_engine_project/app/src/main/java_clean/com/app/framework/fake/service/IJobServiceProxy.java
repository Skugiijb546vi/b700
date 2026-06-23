package com.app.framework.fake.service;

import android.app.job.JobInfo;
import android.os.RemoteException;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.fake.hook.BinderInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import com.app.framework.utils.UIDSpoofingHelper;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1992oooOO0oo;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class IJobServiceProxy extends BinderInvocationStub {
    public static final String TAG = "JobServiceStub";

    @ProxyMethod("cancel")
    /* loaded from: classes.dex */
    public static class Cancel extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                Integer num = (Integer) objArr[0];
                if (num == null) {
                    return method.invoke(obj, objArr);
                }
                objArr[0] = Integer.valueOf(BlackBoxCore.getBJobManager().cancel(BActivityThread.getAppConfig().processName, num.intValue()));
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("cancelAll")
    /* loaded from: classes.dex */
    public static class CancelAll extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                BlackBoxCore.getBJobManager().cancelAll(BActivityThread.getAppConfig().processName);
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("enqueue")
    /* loaded from: classes.dex */
    public static class Enqueue extends MethodHook {
        private JobInfo createMinimalJobInfo(String str) {
            return null;
        }

        private Object enqueueWithUIDSpoofing(Object obj, Method method, Object[] objArr, JobInfo jobInfo) {
            try {
                String packageName = jobInfo.getService().getPackageName();
                UIDSpoofingHelper.logUIDInfo("job_enqueue", packageName);
                if (UIDSpoofingHelper.needsUIDSpoofing("job_enqueue", packageName)) {
                    return 0;
                }
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        private Object handleNonJobInfoEnqueue(Object obj, Method method, Object[] objArr) {
            JobInfo createMinimalJobInfo;
            try {
                Object obj2 = objArr[0];
                if (!(obj2 instanceof String) || (createMinimalJobInfo = createMinimalJobInfo((String) obj2)) == null) {
                    return method.invoke(obj, objArr);
                }
                objArr[0] = createMinimalJobInfo;
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        private boolean isUIDValidationError(Exception exc) {
            String message;
            if (!(exc.getCause() instanceof IllegalArgumentException)) {
                return (exc.getCause() instanceof RemoteException) && (message = exc.getCause().getMessage()) != null && message.contains("cannot schedule job");
            }
            String message2 = exc.getCause().getMessage();
            return message2 != null && message2.contains("cannot schedule job");
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length == 0 || (obj2 = objArr[0]) == null) {
                        return 0;
                    }
                    if (obj2 instanceof JobInfo) {
                        JobInfo jobInfo = (JobInfo) obj2;
                        jobInfo.getService().getPackageName();
                        try {
                            JobInfo schedule = BlackBoxCore.getBJobManager().schedule(jobInfo);
                            if (schedule != null) {
                                objArr[0] = schedule;
                                return method.invoke(obj, objArr);
                            }
                        } catch (Exception unused) {
                        }
                        return enqueueWithUIDSpoofing(obj, method, objArr, jobInfo);
                    }
                    return handleNonJobInfoEnqueue(obj, method, objArr);
                } catch (Exception e) {
                    if (isUIDValidationError(e)) {
                        e.getCause().getMessage();
                        return 0;
                    }
                    try {
                        return method.invoke(obj, objArr);
                    } catch (Exception unused2) {
                    }
                }
            }
            return 0;
        }
    }

    @ProxyMethod("schedule")
    /* loaded from: classes.dex */
    public static class Schedule extends MethodHook {
        private JobInfo createMinimalJobInfo(String str) {
            return null;
        }

        private Object handleNonJobInfoSchedule(Object obj, Method method, Object[] objArr) {
            JobInfo createMinimalJobInfo;
            try {
                Object obj2 = objArr[0];
                if (!(obj2 instanceof String) || (createMinimalJobInfo = createMinimalJobInfo((String) obj2)) == null) {
                    return method.invoke(obj, objArr);
                }
                objArr[0] = createMinimalJobInfo;
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        private boolean isUIDValidationError(Exception exc) {
            String message;
            if (!(exc.getCause() instanceof IllegalArgumentException)) {
                return (exc.getCause() instanceof RemoteException) && (message = exc.getCause().getMessage()) != null && message.contains("cannot schedule job");
            }
            String message2 = exc.getCause().getMessage();
            return message2 != null && message2.contains("cannot schedule job");
        }

        private Object scheduleWithUIDSpoofing(Object obj, Method method, Object[] objArr, JobInfo jobInfo) {
            try {
                String packageName = jobInfo.getService().getPackageName();
                UIDSpoofingHelper.logUIDInfo("job_schedule", packageName);
                if (UIDSpoofingHelper.needsUIDSpoofing("job_schedule", packageName)) {
                    return 0;
                }
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (objArr != null) {
                try {
                    if (objArr.length == 0 || (obj2 = objArr[0]) == null) {
                        return 0;
                    }
                    if (obj2 instanceof JobInfo) {
                        JobInfo jobInfo = (JobInfo) obj2;
                        jobInfo.getService().getPackageName();
                        try {
                            JobInfo schedule = BlackBoxCore.getBJobManager().schedule(jobInfo);
                            if (schedule != null) {
                                objArr[0] = schedule;
                                return method.invoke(obj, objArr);
                            }
                        } catch (Exception unused) {
                        }
                        return scheduleWithUIDSpoofing(obj, method, objArr, jobInfo);
                    }
                    return handleNonJobInfoSchedule(obj, method, objArr);
                } catch (Exception e) {
                    if (isUIDValidationError(e)) {
                        e.getCause().getMessage();
                        return 0;
                    }
                    try {
                        return method.invoke(obj, objArr);
                    } catch (Exception unused2) {
                    }
                }
            }
            return 0;
        }
    }

    public IJobServiceProxy() {
        super(AbstractC0694o0ooooo0.OooO0OO().getService("jobscheduler"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return ((InterfaceC1992oooOO0oo) C0217o00o0oO0.create(InterfaceC1992oooOO0oo.class, null, false)).asInterface(AbstractC0694o0ooooo0.OooO0OO().getService("jobscheduler"));
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
        replaceSystemService("jobscheduler");
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


