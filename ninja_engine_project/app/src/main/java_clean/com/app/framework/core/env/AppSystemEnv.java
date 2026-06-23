package com.app.framework.core.env;

import android.content.ComponentName;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.GmsCore;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class AppSystemEnv {
    private static final List<String> sPreInstallPackages;
    private static final List<String> sSuPackages;
    private static final List<String> sSystemPackages;
    private static final List<String> sXposedPackages;

    static {
        ArrayList arrayList = new ArrayList();
        sSystemPackages = arrayList;
        ArrayList arrayList2 = new ArrayList();
        sSuPackages = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        sXposedPackages = arrayList3;
        sPreInstallPackages = new ArrayList();
        arrayList.add("android");
        arrayList.add("com.google.android.webview");
        arrayList.add("com.google.android.webview.dev");
        arrayList.add("com.google.android.webview.beta");
        arrayList.add("com.google.android.webview.canary");
        arrayList.add("com.android.webview");
        arrayList.add("com.android.camera");
        arrayList.add("com.android.talkback");
        arrayList.add("com.miui.gallery");
        arrayList.add(GmsCore.GMS_PKG);
        arrayList.add(GmsCore.GSF_PKG);
        arrayList.add(GmsCore.VENDING_PKG);
        arrayList.add("com.google.android.play.games");
        arrayList.add("com.google.android.inputmethod.latin");
        arrayList.add("com.huawei.webview");
        arrayList.add("com.coloros.safecenter");
        arrayList2.add("com.noshufou.android.su");
        arrayList2.add("com.noshufou.android.su.elite");
        arrayList2.add("eu.chainfire.supersu");
        arrayList2.add("com.koushikdutta.superuser");
        arrayList2.add("com.thirdparty.superuser");
        arrayList2.add("com.yellowes.su");
        arrayList3.add("de.robv.android.xposed.installer");
    }

    public static List<String> getPreInstallPackages() {
        return sPreInstallPackages;
    }

    public static boolean isBlackPackage(String str) {
        if (BlackBoxCore.get().isHideRoot() && sSuPackages.contains(str)) {
            return true;
        }
        return BlackBoxCore.get().isHideXposed() && sXposedPackages.contains(str);
    }

    public static boolean isGmsPackage(String str) {
        if (str == null) {
            return false;
        }
        return str.equals(GmsCore.GMS_PKG) || str.equals(GmsCore.GSF_PKG) || str.equals(GmsCore.VENDING_PKG) || str.equals("com.google.android.play.games");
    }

    public static boolean isOpenPackage(ComponentName componentName) {
        return componentName != null && isOpenPackage(componentName.getPackageName());
    }

    public static boolean isOpenPackage(String str) {
        return sSystemPackages.contains(str);
    }
}


