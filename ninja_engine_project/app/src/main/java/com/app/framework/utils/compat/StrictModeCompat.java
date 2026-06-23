package com.app.framework.utils.compat;

import com.app.framework.core.system.JarConfig;
import com.ninja.engine.AbstractC0692o0ooooOo;
/* loaded from: classes.dex */
public class StrictModeCompat {
    public static int DETECT_VM_FILE_URI_EXPOSURE;
    public static int PENALTY_DEATH_ON_FILE_URI_EXPOSURE;

    static {
        DETECT_VM_FILE_URI_EXPOSURE = AbstractC0692o0ooooOo.OooO0OO().DETECT_VM_FILE_URI_EXPOSURE() == null ? JarConfig.DEFAULT_BUFFER_SIZE : AbstractC0692o0ooooOo.OooO0OO().DETECT_VM_FILE_URI_EXPOSURE().intValue();
        PENALTY_DEATH_ON_FILE_URI_EXPOSURE = AbstractC0692o0ooooOo.OooO0OO().PENALTY_DEATH_ON_FILE_URI_EXPOSURE() == null ? 67108864 : AbstractC0692o0ooooOo.OooO0OO().PENALTY_DEATH_ON_FILE_URI_EXPOSURE().intValue();
    }

    public static boolean disableDeathOnFileUriExposure() {
        try {
            try {
                AbstractC0692o0ooooOo.OooO0OO().disableDeathOnFileUriExposure();
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        } catch (Throwable unused) {
            AbstractC0692o0ooooOo.OooO0OO()._set_sVmPolicyMask(Integer.valueOf(AbstractC0692o0ooooOo.OooO0OO().sVmPolicyMask().intValue() & (~(DETECT_VM_FILE_URI_EXPOSURE | PENALTY_DEATH_ON_FILE_URI_EXPOSURE))));
            return true;
        }
    }
}
