package com.app.framework.proxy;

import com.app.framework.BlackBoxCore;
import java.util.Locale;
/* loaded from: classes.dex */
public class ProxyManifest {
    public static final int FREE_COUNT = 50;

    public static String TransparentProxyActivity(int i) {
        return String.format(Locale.CHINA, "com.app.framework.proxy.TransparentProxyActivity$P%d", Integer.valueOf(i));
    }

    public static String getBindProvider() {
        return BlackBoxCore.getHostPkg() + ".base.SystemCallProvider";
    }

    public static String getProcessName(int i) {
        return BlackBoxCore.getHostPkg() + ":p" + i;
    }

    public static String getProxyActivity(int i) {
        return String.format(Locale.CHINA, "com.app.framework.proxy.ProxyActivity$P%d", Integer.valueOf(i));
    }

    public static String getProxyAuthorities(int i) {
        return String.format(Locale.CHINA, "%s.proxy_content_provider_%d", BlackBoxCore.getHostPkg(), Integer.valueOf(i));
    }

    public static String getProxyFileProvider() {
        return BlackBoxCore.getHostPkg() + ".base.FileProvider";
    }

    public static String getProxyJobService(int i) {
        return String.format(Locale.CHINA, "com.app.framework.proxy.ProxyJobService$P%d", Integer.valueOf(i));
    }

    public static String getProxyPendingActivity(int i) {
        return String.format(Locale.CHINA, "com.app.framework.proxy.ProxyPendingActivity$P%d", Integer.valueOf(i));
    }

    public static String getProxyReceiver() {
        return BlackBoxCore.getHostPkg() + ".stub_receiver";
    }

    public static String getProxyService(int i) {
        return String.format(Locale.CHINA, "com.app.framework.proxy.ProxyService$P%d", Integer.valueOf(i));
    }

    public static boolean isProxy(String str) {
        return getBindProvider().equals(str) || str.contains("proxy_content_provider_");
    }
}
