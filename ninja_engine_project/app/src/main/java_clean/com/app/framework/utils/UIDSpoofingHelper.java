package com.app.framework.utils;

import android.os.Process;
import com.android.volley.toolbox.ImageRequest;
/* loaded from: classes.dex */
public class UIDSpoofingHelper {
    private static final String TAG = "UIDSpoofingHelper";

    public static int getBestUIDForOperation(String str, String str2) {
        char c;
        try {
            switch (str.hashCode()) {
                case -2109357178:
                    if (str.equals("job_enqueue")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1315792640:
                    if (str.equals("settings_access")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -782042377:
                    if (str.equals("content_provider")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 513871065:
                    if (str.equals("job_schedule")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 718857390:
                    if (str.equals("package_operation")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1) {
                return getJobSchedulingUID(str2);
            }
            if (c == 2 || c == 3) {
                return getSystemUID();
            }
            if (c != 4) {
                int packageUID = getPackageUID(str2);
                return packageUID > 0 ? packageUID : getSystemUID();
            }
            return getPackageUID(str2);
        } catch (Exception unused) {
            return getSystemUID();
        }
    }

    public static int getJobSchedulingUID(String str) {
        try {
            int packageUID = getPackageUID(str);
            return packageUID > 0 ? packageUID : getSystemUID();
        } catch (Exception unused) {
            return getSystemUID();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        r1 = r0.getPackageUid(r1, 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getPackageUID(java.lang.String r1) {
        /*
            android.content.Context r0 = com.app.framework.BlackBoxCore.getContext()     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L13
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L13
            int r1 = com.ninja.engine.AbstractC1311oOooOOoo.OooO00o(r0, r1)     // Catch: java.lang.Exception -> L18
            if (r1 <= 0) goto L13
            return r1
        L13:
            int r1 = getSystemUID()     // Catch: java.lang.Exception -> L18
            return r1
        L18:
            int r1 = getSystemUID()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.utils.UIDSpoofingHelper.getPackageUID(java.lang.String):int");
    }

    public static int getSystemUID() {
        return ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
    }

    public static void logUIDInfo(String str, String str2) {
        try {
            String.format("UID Info - Operation: %s, Package: %s, Current: %d, Best: %d, NeedsSpoofing: %s", str, str2, Integer.valueOf(Process.myUid()), Integer.valueOf(getBestUIDForOperation(str, str2)), Boolean.valueOf(needsUIDSpoofing(str, str2)));
        } catch (Exception unused) {
        }
    }

    public static boolean needsUIDSpoofing(String str, String str2) {
        try {
            return Process.myUid() != getPackageUID(str2);
        } catch (Exception unused) {
            return true;
        }
    }
}


