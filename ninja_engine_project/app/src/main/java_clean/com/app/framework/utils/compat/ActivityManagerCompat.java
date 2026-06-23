package com.app.framework.utils.compat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1705ooO0OoOo;
import com.ninja.engine.InterfaceC1878ooOoOO0O;
import com.ninja.engine.InterfaceC1912ooOooO0;
import com.ninja.engine.InterfaceC1972oooO0o00;
/* loaded from: classes.dex */
public class ActivityManagerCompat {
    public static final int INTENT_SENDER_ACTIVITY = 2;
    public static final int INTENT_SENDER_ACTIVITY_RESULT = 3;
    public static final int INTENT_SENDER_BROADCAST = 1;
    public static final int INTENT_SENDER_SERVICE = 4;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int START_FLAG_DEBUG = 2;
    public static final int START_FLAG_NATIVE_DEBUGGING = 8;
    public static final int START_FLAG_TRACK_ALLOCATION = 4;
    public static final int USER_OP_SUCCESS = 0;

    public static boolean finishActivity(IBinder iBinder, int i, Intent intent) {
        return (Build.VERSION.SDK_INT >= 24 ? ((InterfaceC1972oooO0o00) C0217o00o0oO0.create(InterfaceC1972oooO0o00.class, AbstractC0809oO0OooOO.OooO00o().getDefault(), false)).finishActivity(iBinder, i, intent, 0) : ((InterfaceC1912ooOooO0) C0217o00o0oO0.create(InterfaceC1912ooOooO0.class, AbstractC0809oO0OooOO.OooO00o().getDefault(), false)).finishActivity(iBinder, i, intent, false)).booleanValue();
    }

    public static void setActivityOrientation(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            th.printStackTrace();
            Activity mParent = ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, activity, false)).mParent();
            while (true) {
                Activity mParent2 = ((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, mParent, false)).mParent();
                if (mParent2 == null) {
                    try {
                        ((InterfaceC1878ooOoOO0O) C0217o00o0oO0.create(InterfaceC1878ooOoOO0O.class, AbstractC0809oO0OooOO.OooO00o().getDefault(), false)).setRequestedOrientation(((InterfaceC1705ooO0OoOo) C0217o00o0oO0.create(InterfaceC1705ooO0OoOo.class, mParent, false)).mToken(), i);
                        return;
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        return;
                    }
                }
                mParent = mParent2;
            }
        }
    }
}


