package com.app.framework.core.env;

import com.app.framework.BlackBoxCore;
import com.app.framework.utils.FileUtils;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.File;
import java.util.Locale;
/* loaded from: classes.dex */
public class BEnvironment {
    private static final File sVirtualRoot = new File(BlackBoxCore.getContext().getCacheDir().getParent(), "ninja");
    private static final File sExternalVirtualRoot = BlackBoxCore.getContext().getExternalFilesDir("ninja");
    public static File JUNIT_JAR = new File(getCacheDir(), "junit.apk");
    public static File EMPTY_JAR = new File(getCacheDir(), "empty.apk");

    public static File getAccountsConf() {
        return new File(getSystemDir(), "accounts.conf");
    }

    public static File getAppDir(String str) {
        return new File(sVirtualRoot, AbstractC1230oOoOo0o.OooOO0o("data/app/", str));
    }

    public static File getAppLibDir(String str) {
        return new File(getAppDir(str), "lib");
    }

    public static File getAppRootDir() {
        return getAppDir("");
    }

    public static File getBaseApkDir(String str) {
        return new File(sVirtualRoot, AbstractC1230oOoOo0o.OooO0oo("data/app/", str, "/base.apk"));
    }

    public static File getCacheDir() {
        return new File(sVirtualRoot, "cache");
    }

    public static File getDataCacheDir(String str, int i) {
        return new File(getDataDir(str, i), "cache");
    }

    public static File getDataDatabasesDir(String str, int i) {
        return new File(getDataDir(str, i), "databases");
    }

    public static File getDataDir(String str, int i) {
        return new File(sVirtualRoot, String.format(Locale.CHINA, "data/user/%d/%s", Integer.valueOf(i), str));
    }

    public static File getDataFilesDir(String str, int i) {
        return new File(getDataDir(str, i), "files");
    }

    public static File getDataLibDir(String str, int i) {
        return new File(getDataDir(str, i), "lib");
    }

    public static File getDeDataDir(String str, int i) {
        return new File(sVirtualRoot, String.format(Locale.CHINA, "data/user_de/%d/%s", Integer.valueOf(i), str));
    }

    public static File getExternalDataCacheDir(String str, int i) {
        return new File(getExternalDataDir(str, i), "cache");
    }

    public static File getExternalDataDir(String str, int i) {
        File externalUserDir = getExternalUserDir(i);
        Locale locale = Locale.CHINA;
        return new File(externalUserDir, AbstractC1230oOoOo0o.OooOO0o("Android/data/", str));
    }

    public static File getExternalDataFilesDir(String str, int i) {
        return new File(getExternalDataDir(str, i), "files");
    }

    public static File getExternalUserDir(int i) {
        return new File(sExternalVirtualRoot, String.format(Locale.CHINA, "storage/emulated/%d/", Integer.valueOf(i)));
    }

    public static File getExternalVirtualRoot() {
        return sExternalVirtualRoot;
    }

    public static File getFakeLocationConf() {
        return new File(getSystemDir(), "fake-location.conf");
    }

    public static File getPackageConf(String str) {
        return new File(getAppDir(str), "package.conf");
    }

    public static File getProcDir() {
        return new File(sVirtualRoot, "proc");
    }

    public static File getSharedUserConf() {
        return new File(getSystemDir(), "shared-user.conf");
    }

    public static File getSystemDir() {
        return new File(sVirtualRoot, "system");
    }

    public static File getUidConf() {
        return new File(getSystemDir(), "uid.conf");
    }

    public static File getUserDir(int i) {
        return new File(sVirtualRoot, String.format(Locale.CHINA, "data/user/%d", Integer.valueOf(i)));
    }

    public static File getUserInfoConf() {
        return new File(getSystemDir(), "user.conf");
    }

    public static File getVirtualRoot() {
        return sVirtualRoot;
    }

    public static File getXPModuleConf() {
        return new File(getSystemDir(), "xposed-module.conf");
    }

    public static File getXSharedPreferences(String str, String str2) {
        return new File(getDataDir(str, BlackBoxCore.getUserId()), AbstractC1230oOoOo0o.OooO0oo("shared_prefs/", str2, ".xml"));
    }

    public static void load() {
        FileUtils.mkdirs(sVirtualRoot);
        FileUtils.mkdirs(sExternalVirtualRoot);
        FileUtils.mkdirs(getSystemDir());
        FileUtils.mkdirs(getCacheDir());
        FileUtils.mkdirs(getProcDir());
    }

    public static File getProcDir(int i) {
        File file = new File(getProcDir(), String.format(Locale.CHINA, "%d", Integer.valueOf(i)));
        FileUtils.mkdirs(file);
        return file;
    }
}
