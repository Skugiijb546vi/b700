package com.ninja.engine;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o0OO00O implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public o0OO00O(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.OooO00o = 9;
        this.OooO0OO = swipeDismissBehavior;
        this.OooO0O0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0886oO0oo0o0 interfaceC0886oO0oo0o0;
        switch (this.OooO00o) {
            case 0:
                o000000 o000000Var = (o000000) this.OooO0OO;
                MenuC0887oO0oo0oo menuC0887oO0oo0oo = o000000Var.OooO0OO;
                if (menuC0887oO0oo0oo != null && (interfaceC0886oO0oo0o0 = menuC0887oO0oo0oo.OooO0o0) != null) {
                    interfaceC0886oO0oo0o0.OooO00o(menuC0887oO0oo0oo);
                }
                View view = (View) o000000Var.OooO0oo;
                if (view != null && view.getWindowToken() != null) {
                    C0355o0OOO0o c0355o0OOO0o = (C0355o0OOO0o) this.OooO0O0;
                    if (!c0355o0OOO0o.OooO0O0()) {
                        if (c0355o0OOO0o.OooO0o != null) {
                            c0355o0OOO0o.OooO0Oo(0, 0, false, false);
                        }
                    }
                    o000000Var.OooOo00 = c0355o0OOO0o;
                }
                o000000Var.OooOo0O = null;
                return;
            case 1:
                ((C0062o00000oo) this.OooO0O0).OooO00o = this.OooO0OO;
                return;
            case 2:
                ((Application) this.OooO0O0).unregisterActivityLifecycleCallbacks((C0062o00000oo) this.OooO0OO);
                return;
            case 3:
                try {
                    Method method = o0000.OooO0Oo;
                    Object obj = this.OooO0OO;
                    Object obj2 = this.OooO0O0;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        o0000.OooO0o0.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 4:
                AbstractC1137oOOoooO abstractC1137oOOoooO = (AbstractC1137oOOoooO) ((C1275oOoo0OoO) this.OooO0O0).OooO00o;
                if (abstractC1137oOOoooO != null) {
                    abstractC1137oOOoooO.OooOO0O((Typeface) this.OooO0OO);
                    return;
                }
                return;
            case 5:
                C0771oO0OO0oo OooO00o = C0771oO0OO0oo.OooO00o();
                OooO00o.getClass();
                AbstractC1401oo00OOO0.OooO00o();
                OooO00o.OooO0Oo.set(true);
                ((ViewTreeObserver$OnDrawListenerC0544o0o0OOOO) this.OooO0OO).OooO0O0.OooO0O0 = true;
                ((ViewTreeObserver$OnDrawListenerC0544o0o0OOOO) this.OooO0OO).OooO00o.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener) this.OooO0O0);
                ((ViewTreeObserver$OnDrawListenerC0544o0o0OOOO) this.OooO0OO).OooO0O0.OooO00o.clear();
                return;
            case 6:
                o oVar = (o) this.OooO0OO;
                if (oVar.OooO0Oo) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.OooO0O0).run();
                    return;
                } catch (Throwable th) {
                    oVar.OooO0OO.OooOo0o(th);
                    return;
                }
            case 7:
                try {
                    ((ThreadFactoryC0059o00000Oo) this.OooO0OO).getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused2) {
                }
                ((Runnable) this.OooO0O0).run();
                return;
            case 8:
                ((InterfaceC0319o0O0o0oo) this.OooO0O0).OooO00o(this.OooO0OO);
                return;
            default:
                C1462oo0O0O0 c1462oo0O0O0 = ((SwipeDismissBehavior) this.OooO0OO).OooO00o;
                if (c1462oo0O0O0 != null && c1462oo0O0O0.OooO0o()) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    ((View) this.OooO0O0).postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o0OO00O(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0OO = obj;
        this.OooO0O0 = obj2;
    }

    public /* synthetic */ o0OO00O(Object obj, Object obj2, int i, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }
}


