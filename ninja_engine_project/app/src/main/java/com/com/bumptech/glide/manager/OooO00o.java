package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ninja.engine.AbstractC1401oo00OOO0;
import com.ninja.engine.C0415o0Oo0O0O;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C0545o0o0OOOo;
import com.ninja.engine.C0601o0oOooO0;
import com.ninja.engine.C0606o0oOoooO;
import com.ninja.engine.C0761oO0O0oO;
import com.ninja.engine.C0771oO0OO0oo;
import com.ninja.engine.C0919oOO00oOo;
import com.ninja.engine.ComponentCallbacks2C1106oOOoOoo0;
import com.ninja.engine.InterfaceC0624o0oo0OOO;
import com.ninja.engine.o000OO00;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class OooO00o implements Handler.Callback {
    public static final C0919oOO00oOo OooO0o0 = new C0919oOO00oOo(8);
    public volatile ComponentCallbacks2C1106oOOoOoo0 OooO00o;
    public final C0919oOO00oOo OooO0O0;
    public final InterfaceC0624o0oo0OOO OooO0OO;
    public final C0415o0Oo0O0O OooO0Oo;

    public OooO00o(C0919oOO00oOo c0919oOO00oOo) {
        InterfaceC0624o0oo0OOO c0455o0OoOo00;
        c0919oOO00oOo = c0919oOO00oOo == null ? OooO0o0 : c0919oOO00oOo;
        this.OooO0O0 = c0919oOO00oOo;
        this.OooO0Oo = new C0415o0Oo0O0O(c0919oOO00oOo);
        if (C0771oO0OO0oo.OooO0o && C0771oO0OO0oo.OooO0o0) {
            c0455o0OoOo00 = new C0545o0o0OOOo();
        } else {
            c0455o0OoOo00 = new C0455o0OoOo00(29);
        }
        this.OooO0OO = c0455o0OoOo00;
    }

    public static Activity OooO00o(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return OooO00o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final ComponentCallbacks2C1106oOOoOoo0 OooO0O0(Context context) {
        boolean z;
        if (context != null) {
            char[] cArr = AbstractC1401oo00OOO0.OooO00o;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof o000OO00) {
                    o000OO00 o000oo00 = (o000OO00) context;
                    boolean z2 = false;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return OooO0O0(o000oo00.getApplicationContext());
                    }
                    if (!o000oo00.isDestroyed()) {
                        this.OooO0OO.OooOO0O(o000oo00);
                        Activity OooO00o = OooO00o(o000oo00);
                        z2 = (OooO00o == null || !OooO00o.isFinishing()) ? true : true;
                        com.bumptech.glide.OooO00o OooO00o2 = com.bumptech.glide.OooO00o.OooO00o(o000oo00.getApplicationContext());
                        C0606o0oOoooO OooOo00 = o000oo00.OooOo00();
                        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO0Oo;
                        c0415o0Oo0O0O.getClass();
                        AbstractC1401oo00OOO0.OooO00o();
                        androidx.lifecycle.OooO00o oooO00o = o000oo00.OooO0Oo;
                        AbstractC1401oo00OOO0.OooO00o();
                        ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0 = (ComponentCallbacks2C1106oOOoOoo0) ((HashMap) c0415o0Oo0O0O.OooO0O0).get(oooO00o);
                        if (componentCallbacks2C1106oOOoOoo0 == null) {
                            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(oooO00o);
                            C0601o0oOooO0 c0601o0oOooO0 = new C0601o0oOooO0(c0415o0Oo0O0O, OooOo00);
                            ((C0919oOO00oOo) c0415o0Oo0O0O.OooO0OO).getClass();
                            ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo02 = new ComponentCallbacks2C1106oOOoOoo0(OooO00o2, lifecycleLifecycle, c0601o0oOooO0, o000oo00);
                            ((HashMap) c0415o0Oo0O0O.OooO0O0).put(oooO00o, componentCallbacks2C1106oOOoOoo02);
                            lifecycleLifecycle.OooOO0o(new C0761oO0O0oO(c0415o0Oo0O0O, oooO00o));
                            if (z2) {
                                componentCallbacks2C1106oOOoOoo02.OooOO0();
                            }
                            return componentCallbacks2C1106oOOoOoo02;
                        }
                        return componentCallbacks2C1106oOOoOoo0;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return OooO0O0(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.OooO00o == null) {
                synchronized (this) {
                    try {
                        if (this.OooO00o == null) {
                            com.bumptech.glide.OooO00o OooO00o3 = com.bumptech.glide.OooO00o.OooO00o(context.getApplicationContext());
                            C0919oOO00oOo c0919oOO00oOo = this.OooO0O0;
                            C0455o0OoOo00 c0455o0OoOo00 = new C0455o0OoOo00(10);
                            C0601o0oOooO0 c0601o0oOooO02 = new C0601o0oOooO0(4);
                            Context applicationContext = context.getApplicationContext();
                            c0919oOO00oOo.getClass();
                            this.OooO00o = new ComponentCallbacks2C1106oOOoOoo0(OooO00o3, c0455o0OoOo00, c0601o0oOooO02, applicationContext);
                        }
                    } finally {
                    }
                }
            }
            return this.OooO00o;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
