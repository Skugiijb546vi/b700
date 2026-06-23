package com.app.framework.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.utils.FileUtils;
import com.app.framework.utils.TrieTree;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
@SuppressLint({"SdCardPath"})
/* loaded from: classes.dex */
public class IOCore {
    public static final String TAG = "IOCore";
    private final Map<String, String> mRedirectMap = new LinkedHashMap();
    private static final IOCore sIOCore = new IOCore();
    private static final TrieTree mTrieTree = new TrieTree();
    private static final TrieTree sBlackTree = new TrieTree();
    private static final Map<String, Map<String, String>> sCachePackageRedirect = new HashMap();
    private static volatile boolean sGameGuardLoaded = false;

    public static IOCore get() {
        return sIOCore;
    }

    private void hideRoot(Map<String, String> map) {
        map.put("/system/app/Superuser.apk", "/system/app/Superuser.apk-fake");
        map.put("/sbin/su", "/sbin/su-fake");
        map.put("/system/bin/su", "/system/bin/su-fake");
        map.put("/system/xbin/su", "/system/xbin/su-fake");
        map.put("/data/local/xbin/su", "/data/local/xbin/su-fake");
        map.put("/data/local/bin/su", "/data/local/bin/su-fake");
        map.put("/system/sd/xbin/su", "/system/sd/xbin/su-fake");
        map.put("/system/bin/failsafe/su", "/system/bin/failsafe/su-fake");
        map.put("/data/local/su", "/data/local/su-fake");
        map.put("/su/bin/su", "/su/bin/su-fake");
    }

    private void proc(Map<String, String> map) {
        int appPid = BlackBoxCore.getAppPid();
        String absolutePath = new File(BEnvironment.getProcDir(appPid), "cmdline").getAbsolutePath();
        map.put(("/proc/" + Process.myPid() + "/") + "cmdline", absolutePath);
        map.put("/proc/self/cmdline", absolutePath);
    }

    public void addBlackRedirect(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sBlackTree.add(str);
    }

    public void addRedirect(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.mRedirectMap.get(str) != null) {
            return;
        }
        mTrieTree.add(str);
        this.mRedirectMap.put(str, str2);
        if (!new File(str2).exists()) {
            FileUtils.mkdirs(str2);
        }
        NativeCore.addIORule(str, str2);
    }

    public void enableRedirect(Context context) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet = new HashSet();
        String packageName = context.getPackageName();
        try {
            ApplicationInfo applicationInfo = BlackBoxCore.getBPackageManager().getApplicationInfo(packageName, 128, BlackBoxCore.getUserId());
            int hostUserId = BlackBoxCore.getHostUserId();
            linkedHashMap.put("/data/data/" + packageName + "/lib", applicationInfo.nativeLibraryDir);
            linkedHashMap.put(String.format("/data/user/%d/%s/lib", Integer.valueOf(hostUserId), packageName), applicationInfo.nativeLibraryDir);
            linkedHashMap.put("/data/data/" + packageName, applicationInfo.dataDir);
            linkedHashMap.put(String.format("/data/user/%d/%s", Integer.valueOf(hostUserId), packageName), applicationInfo.dataDir);
            File file = new File(BEnvironment.getVirtualRoot(), "profiles");
            FileUtils.mkdirs(file.getAbsolutePath());
            linkedHashMap.put("/data/misc/profiles", file.getAbsolutePath());
            File file2 = new File(file, String.format("cur/%d/%s", Integer.valueOf(BlackBoxCore.getUserId()), packageName));
            File file3 = new File(file, String.format("ref/%d/%s", Integer.valueOf(BlackBoxCore.getUserId()), packageName));
            FileUtils.mkdirs(file2.getAbsolutePath());
            FileUtils.mkdirs(file3.getAbsolutePath());
            linkedHashMap.put(String.format("/data/misc/profiles/cur/%d/%s", Integer.valueOf(BlackBoxCore.getUserId()), packageName), file2.getAbsolutePath());
            linkedHashMap.put(String.format("/data/misc/profiles/ref/%d/%s", Integer.valueOf(BlackBoxCore.getUserId()), packageName), file3.getAbsolutePath());
            if (BlackBoxCore.getContext().getExternalCacheDir() != null && context.getExternalCacheDir() != null) {
                File externalUserDir = BEnvironment.getExternalUserDir(BlackBoxCore.getUserId());
                linkedHashMap.put("/sdcard", externalUserDir.getAbsolutePath());
                linkedHashMap.put(String.format("/storage/emulated/%d", Integer.valueOf(hostUserId)), externalUserDir.getAbsolutePath());
                hashSet.add("/sdcard/Pictures");
                hashSet.add(String.format("/storage/emulated/%d/Pictures", Integer.valueOf(hostUserId)));
            }
            if (BlackBoxCore.get().isHideRoot()) {
                hideRoot(linkedHashMap);
            }
            proc(linkedHashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String str : linkedHashMap.keySet()) {
            get().addRedirect(str, (String) linkedHashMap.get(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            get().addBlackRedirect((String) it.next());
        }
        NativeCore.enableIO();
    }

    public File redirectPath(File file) {
        if (file == null) {
            return null;
        }
        return new File(redirectPath(file.getAbsolutePath()));
    }

    public File redirectPath(File file, Map<String, String> map) {
        if (file == null) {
            return null;
        }
        return new File(redirectPath(file.getAbsolutePath(), map));
    }

    public String redirectPath(String str) {
        if (TextUtils.isEmpty(str) || str.contains("/ninja/")) {
            return str;
        }
        String search = sBlackTree.search(str);
        if (TextUtils.isEmpty(search)) {
            String search2 = mTrieTree.search(str);
            if (TextUtils.isEmpty(search2)) {
                return str;
            }
            String str2 = this.mRedirectMap.get(search2);
            Objects.requireNonNull(str2);
            return str.replace(search2, str2);
        }
        return search;
    }

    public String redirectPath(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String search = mTrieTree.search(str);
        if (TextUtils.isEmpty(search)) {
            return str;
        }
        String str2 = map.get(search);
        Objects.requireNonNull(str2);
        return str.replace(search, str2);
    }
}


