package com.ninja.engine;

import android.content.Context;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.configuration.AppLifecycleCallback;
/* renamed from: com.ninja.engine.o00O0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0140o00O0oo0 {
    public static final C1278oOoo0o00 OooO00o = new C1278oOoo0o00(C0138o00O0oOo.OooO00o);

    public static void OooO00o(Context context) {
        C1278oOoo0o00 c1278oOoo0o00 = OooO00o;
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        try {
            C0215o00o0o0o c0215o00o0o0o = (C0215o00o0o0o) c1278oOoo0o00.OooO00o();
            c0215o00o0o0o.getClass();
            try {
                BlackBoxCore.get().doAttachBaseContext(context, new C0214o00o0o0O(context, c0215o00o0o0o));
            } catch (Exception e) {
                e.getMessage();
            }
            ((C0215o00o0o0o) c1278oOoo0o00.OooO00o()).getClass();
            try {
                BlackBoxCore.get().addAppLifecycleCallback(new AppLifecycleCallback());
            } catch (Exception e2) {
                e2.getMessage();
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }
}
