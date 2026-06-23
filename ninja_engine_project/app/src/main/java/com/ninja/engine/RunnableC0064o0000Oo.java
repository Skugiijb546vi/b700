package com.ninja.engine;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import java.util.List;
import java.util.concurrent.Callable;
/* renamed from: com.ninja.engine.o0000Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0064o0000Oo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;
    public Object OooO0OO;
    public Object OooO0Oo;

    public /* synthetic */ RunnableC0064o0000Oo() {
        this.OooO00o = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.OooO00o) {
            case 0:
                C0068o0000o.OooO0O0(((C0068o0000o) this.OooO0Oo).OooO0o0, (View) this.OooO0O0, (View) this.OooO0OO);
                return;
            case 1:
                List list = (List) this.OooO0O0;
                C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) this.OooO0OO;
                if (list.contains(c1237oOoOoO0O)) {
                    list.remove(c1237oOoOoO0O);
                    ((o0OOo000) this.OooO0Oo).getClass();
                    AbstractC1230oOoOo0o.OooO00o(c1237oOoOoO0O.OooO0OO.OooOooo, c1237oOoOoO0O.OooO00o);
                    return;
                }
                return;
            case 2:
                try {
                    obj = ((Callable) this.OooO0O0).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.OooO0Oo).post(new o0OO00O((InterfaceC0319o0O0o0oo) this.OooO0OO, obj, 8, false));
                return;
            default:
                C1515oo0Oo00.OooO0oo((View) this.OooO0O0, (C1126oOOooOO) this.OooO0OO);
                ((ValueAnimator) this.OooO0Oo).start();
                return;
        }
    }

    public RunnableC0064o0000Oo(View view, C1520oo0Oo0OO c1520oo0Oo0OO, C1126oOOooOO c1126oOOooOO, ValueAnimator valueAnimator) {
        this.OooO00o = 3;
        this.OooO0O0 = view;
        this.OooO0OO = c1126oOOooOO;
        this.OooO0Oo = valueAnimator;
    }

    public /* synthetic */ RunnableC0064o0000Oo(Object obj, Object obj2, Object obj3, int i) {
        this.OooO00o = i;
        this.OooO0Oo = obj;
        this.OooO0O0 = obj2;
        this.OooO0OO = obj3;
    }
}
