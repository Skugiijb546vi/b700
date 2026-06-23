package com.app.framework.fake.service;

import android.database.sqlite.SQLiteException;
import com.app.framework.fake.hook.ClassInvocationStub;
import com.app.framework.fake.hook.MethodHook;
import com.app.framework.fake.hook.ProxyMethod;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class SQLiteDatabaseProxy extends ClassInvocationStub {
    public static final String TAG = "SQLiteDatabaseProxy";

    @ProxyMethod("execSQL")
    /* loaded from: classes.dex */
    public static class ExecSQL extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String str = (String) objArr[0];
                if (str == null || !str.contains("DurableJob")) {
                    return method.invoke(obj, objArr);
                }
                return null;
            } catch (SQLiteException unused) {
                return null;
            } catch (Exception unused2) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("query")
    /* loaded from: classes.dex */
    public static class Query extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String str = (String) objArr[0];
                if (str == null || !str.equals("DurableJob")) {
                    return method.invoke(obj, objArr);
                }
                return null;
            } catch (SQLiteException unused) {
                return null;
            } catch (Exception unused2) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @ProxyMethod("rawQuery")
    /* loaded from: classes.dex */
    public static class RawQuery extends MethodHook {
        @Override // com.app.framework.fake.hook.MethodHook
        public Object hook(Object obj, Method method, Object[] objArr) {
            try {
                String str = (String) objArr[0];
                if (str == null || !str.contains("DurableJob")) {
                    return method.invoke(obj, objArr);
                }
                return null;
            } catch (SQLiteException unused) {
                return null;
            } catch (Exception unused2) {
                return method.invoke(obj, objArr);
            }
        }
    }

    @Override // com.app.framework.fake.hook.ClassInvocationStub
    public Object getWho() {
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
