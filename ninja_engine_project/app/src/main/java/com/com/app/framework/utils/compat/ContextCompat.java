package com.app.framework.utils.compat;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import com.app.framework.BlackBoxCore;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1633oo0ooo;
import com.ninja.engine.InterfaceC1680ooO0O0O;
import com.ninja.engine.InterfaceC1766ooOO0o0O;
import com.ninja.engine.InterfaceC2003oooOOOoO;
import com.ninja.engine.InterfaceC2048oooo0000;
/* loaded from: classes.dex */
public class ContextCompat {
    public static final String TAG = "ContextCompat";

    public static void fix(Context context) {
        if (context == null) {
            return;
        }
        int i = 0;
        do {
            try {
                if (!(context instanceof ContextWrapper)) {
                    if (context == null) {
                        return;
                    }
                    ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, context, false))._set_mPackageManager(null);
                    context.getPackageManager();
                    ((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, context, false))._set_mBasePackageName(BlackBoxCore.getHostPkg());
                    ((InterfaceC1766ooOO0o0O) C0217o00o0oO0.create(InterfaceC1766ooOO0o0O.class, context, false))._set_mOpPackageName(BlackBoxCore.getHostPkg());
                    try {
                        ((InterfaceC1633oo0ooo) C0217o00o0oO0.create(InterfaceC1633oo0ooo.class, context.getContentResolver(), false))._set_mPackageName(BlackBoxCore.getHostPkg());
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    if (BuildCompat.isS()) {
                        try {
                            fixAttributionSourceState(((InterfaceC1680ooO0O0O) C0217o00o0oO0.create(InterfaceC1680ooO0O0O.class, context, false)).getAttributionSource(), Process.myUid());
                            return;
                        } catch (Exception e2) {
                            e2.getMessage();
                            return;
                        }
                    }
                    return;
                }
                context = ((ContextWrapper) context).getBaseContext();
                i++;
            } catch (Exception e3) {
                e3.getMessage();
                e3.printStackTrace();
                return;
            }
        } while (i < 10);
    }

    public static void fixAttributionSourceState(Object obj, int i) {
        if (obj == null || ((InterfaceC2003oooOOOoO) C0217o00o0oO0.create(InterfaceC2003oooOOOoO.class, obj, false))._check_mAttributionSourceState() == null) {
            return;
        }
        InterfaceC2048oooo0000 interfaceC2048oooo0000 = (InterfaceC2048oooo0000) C0217o00o0oO0.create(InterfaceC2048oooo0000.class, ((InterfaceC2003oooOOOoO) C0217o00o0oO0.create(InterfaceC2003oooOOOoO.class, obj, false)).mAttributionSourceState(), false);
        interfaceC2048oooo0000._set_packageName(BlackBoxCore.getHostPkg());
        interfaceC2048oooo0000._set_uid(Integer.valueOf(i));
        fixAttributionSourceState(((InterfaceC2003oooOOOoO) C0217o00o0oO0.create(InterfaceC2003oooOOOoO.class, obj, false)).getNext(), i);
    }
}
