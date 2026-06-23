package com.ninja.engine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.ninja.engine.o0o0Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558o0o0Ooo0 implements InterfaceC0467o0Ooo00 {
    public final Context OooO00o;
    public final C0557o0o0OoOo OooO0O0;
    public final C0601o0oOooO0 OooO0OO;
    public final Object OooO0Oo;
    public Executor OooO0o;
    public Handler OooO0o0;
    public ThreadPoolExecutor OooO0oO;
    public AbstractC0809oO0OooOO OooO0oo;

    public C0558o0o0Ooo0(Context context, C0557o0o0OoOo c0557o0o0OoOo) {
        C0601o0oOooO0 c0601o0oOooO0 = C0568o0oOOoOO.OooO0Oo;
        this.OooO0Oo = new Object();
        AbstractC0809oO0OooOO.OooOOO(context, "Context cannot be null");
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = c0557o0o0OoOo;
        this.OooO0OO = c0601o0oOooO0;
    }

    public final void OooO00o() {
        synchronized (this.OooO0Oo) {
            try {
                this.OooO0oo = null;
                Handler handler = this.OooO0o0;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.OooO0o0 = null;
                ThreadPoolExecutor threadPoolExecutor = this.OooO0oO;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.OooO0o = null;
                this.OooO0oO = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC0467o0Ooo00
    public final void OooO0O0(AbstractC0809oO0OooOO abstractC0809oO0OooOO) {
        synchronized (this.OooO0Oo) {
            this.OooO0oo = abstractC0809oO0OooOO;
        }
        OooO0OO();
    }

    public final void OooO0OO() {
        synchronized (this.OooO0Oo) {
            try {
                if (this.OooO0oo == null) {
                    return;
                }
                if (this.OooO0o == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0300o0O0Oo("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.OooO0oO = threadPoolExecutor;
                    this.OooO0o = threadPoolExecutor;
                }
                this.OooO0o.execute(new RunnableC0061o00000oO(10, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0575o0oOo0 OooO0Oo() {
        try {
            C0601o0oOooO0 c0601o0oOooO0 = this.OooO0OO;
            Context context = this.OooO00o;
            C0557o0o0OoOo c0557o0o0OoOo = this.OooO0O0;
            c0601o0oOooO0.getClass();
            Object[] objArr = {c0557o0o0OoOo};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0073o0000oO0 OooO00o = AbstractC0556o0o0OoOO.OooO00o(context, Collections.unmodifiableList(arrayList));
            int i = OooO00o.OooO00o;
            if (i == 0) {
                C0575o0oOo0[] c0575o0oOo0Arr = (C0575o0oOo0[]) ((List) OooO00o.OooO0O0).get(0);
                if (c0575o0oOo0Arr != null && c0575o0oOo0Arr.length != 0) {
                    return c0575o0oOo0Arr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + i + ")");
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
