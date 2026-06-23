package com.app.framework.fake.service;

import android.content.Context;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
public class WorkManagerProxy extends ClassInvocationStub {
    public static final String TAG = "WorkManagerProxy";

    @ProxyMethod("cancelAllWork")
    /* loaded from: classes.dex */
    public static class CancelAllWork extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @ProxyMethod("cancelWorkById")
    /* loaded from: classes.dex */
    public static class CancelWorkById extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String str = (String) objArr[0];
                    }
                } catch (Exception unused) {
                    return null;
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enqueue")
    /* loaded from: classes.dex */
    public static class Enqueue extends MethodHook {
        private Object createMockWorkResult() {
            try {
                Class.forName("androidx.work.Operation");
            } catch (Exception unused) {
            }
            return null;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    try {
                        if (obj2 != null) {
                            Objects.toString(obj2);
                        }
                    } catch (Exception unused) {
                        return createMockWorkResult();
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enqueueUniquePeriodicWork")
    /* loaded from: classes.dex */
    public static class EnqueueUniquePeriodicWork extends MethodHook {
        private Object createMockWorkResult() {
            try {
                Class.forName("androidx.work.Operation");
            } catch (Exception unused) {
            }
            return null;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String str = (String) objArr[0];
                    }
                } catch (Exception unused) {
                    return createMockWorkResult();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("enqueueUniqueWork")
    /* loaded from: classes.dex */
    public static class EnqueueUniqueWork extends MethodHook {
        private Object createMockWorkResult() {
            try {
                Class.forName("androidx.work.Operation");
            } catch (Exception unused) {
            }
            return null;
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        String str = (String) objArr[0];
                    }
                } catch (Exception unused) {
                    return createMockWorkResult();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("getWorkInfos")
    /* loaded from: classes.dex */
    public static class GetWorkInfos extends MethodHook {
        private Object createEmptyWorkInfoList() {
            try {
                Class.forName("androidx.work.WorkInfo");
                return Collections.emptyList();
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        }

        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (Exception unused) {
                return createEmptyWorkInfoList();
            }
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        try {
            Context context = BlackBoxCore.getContext();
            if (context != null) {
                return Class.forName("androidx.work.WorkManager").getMethod("getInstance", Context.class).invoke(null, context);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


