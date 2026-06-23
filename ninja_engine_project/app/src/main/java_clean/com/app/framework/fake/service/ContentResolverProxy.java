package com.app.framework.fake.service;

import android.net.Uri;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ContentResolverProxy extends ClassInvocationStub {
    public static final String TAG = "ContentResolverProxy";

    @ProxyMethod("delete")
    /* loaded from: classes.dex */
    public static class Delete extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Uri) {
                    String uri = ((Uri) obj2).toString();
                    if (!uri.contains("audio")) {
                        uri.contains("media");
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("insert")
    /* loaded from: classes.dex */
    public static class Insert extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Uri) {
                    String uri = ((Uri) obj2).toString();
                    if (!uri.contains("audio")) {
                        uri.contains("media");
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("query")
    /* loaded from: classes.dex */
    public static class Query extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Uri) {
                    String uri = ((Uri) obj2).toString();
                    if (uri.contains("audio") || uri.contains("media") || uri.contains("content://media/external/audio") || uri.contains("content://media/internal/audio") || uri.contains("content://media/external/file") || uri.contains("content://media/internal/file")) {
                        return method.invoke(obj, objArr);
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("query")
    /* loaded from: classes.dex */
    public static class QueryWithProjection extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Uri) {
                    String uri = ((Uri) obj2).toString();
                    if (uri.contains("audio") || uri.contains("media") || uri.contains("content://media/external/audio") || uri.contains("content://media/internal/audio") || uri.contains("content://media/external/file") || uri.contains("content://media/internal/file")) {
                        return method.invoke(obj, objArr);
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @ProxyMethod("update")
    /* loaded from: classes.dex */
    public static class Update extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof Uri) {
                    String uri = ((Uri) obj2).toString();
                    if (!uri.contains("audio")) {
                        uri.contains("media");
                    }
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
        return BlackBoxCore.getContext().getContentResolver();
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public void inject(Object obj, Object obj2) {
    }

    @Override // com.app.framework.fake.hook.IInjectHook
    public boolean isBadEnv() {
        return false;
    }
}


