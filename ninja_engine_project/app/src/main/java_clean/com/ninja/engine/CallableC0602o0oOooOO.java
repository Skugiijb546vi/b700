package com.ninja.engine;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
/* renamed from: com.ninja.engine.o0oOooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0602o0oOooOO implements Callable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ Context OooO0OO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ CallableC0602o0oOooOO(String str, Context context, Object obj, int i, int i2) {
        this.OooO00o = i2;
        this.OooO0O0 = str;
        this.OooO0OO = context;
        this.OooO0o0 = obj;
        this.OooO0Oo = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        Context context = this.OooO0OO;
        String str = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                Object[] objArr = {(C0557o0o0OoOo) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC0570o0oOOoo.OooO0O0(str, context, Collections.unmodifiableList(arrayList), i);
            default:
                try {
                    return AbstractC0570o0oOOoo.OooO0O0(str, context, (List) obj, i);
                } catch (Throwable unused) {
                    return new C0571o0oOOoo0(-3);
                }
        }
    }
}


