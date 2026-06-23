package com.app.framework.util;

import android.os.Build;
import android.text.TextUtils;
import com.app.framework.utils.ShellUtils;
/* loaded from: classes.dex */
public class XiaomiDeviceDetector {
    private static final String TAG = "XiaomiDeviceDetector";
    private static final String[] XIAOMI_MANUFACTURERS = {"Xiaomi", "Redmi", "POCO", "Black Shark", "Mi"};
    private static final String[] MIUI_VERSION_PATTERNS = {"MIUI", "HyperOS", "MIUI Global", "MIUI China"};
    private static final String[] XIAOMI_MODELS = {"Mi ", "Redmi ", "POCO ", "Black Shark ", "Xiaomi "};
    private static boolean sIsXiaomiDevice = false;
    private static String sMiuiVersion = null;
    private static String sDeviceModel = null;
    private static int sAndroidVersion = 0;

    private static boolean checkXiaomiSystemProperties() {
        try {
            if (TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name")) && TextUtils.isEmpty(getSystemProperty("ro.miui.version.code"))) {
                return !TextUtils.isEmpty(getSystemProperty("ro.miui.build.version"));
            }
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    private static boolean containsMiuiVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : MIUI_VERSION_PATTERNS) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private static String extractMiuiVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(" ");
        for (int i = 0; i < split.length - 1; i++) {
            if (split[i].equalsIgnoreCase("MIUI") || split[i].equalsIgnoreCase("HyperOS")) {
                return split[i] + " " + split[i + 1];
            }
        }
        return str;
    }

    private static String extractVersionNumber(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(" ");
        if (split.length > 1) {
            String[] split2 = split[1].split("\\.");
            if (split2.length > 0) {
                return split2[0];
            }
        }
        return null;
    }

    public static int getAndroidVersion() {
        int i = sAndroidVersion;
        if (i > 0) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        sAndroidVersion = i2;
        return i2;
    }

    public static String getDeviceInfo() {
        StringBuilder sb = new StringBuilder("Device: ");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append("\nAndroid: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (API ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(")\nXiaomi Device: ");
        sb.append(isXiaomiDevice());
        sb.append(ShellUtils.COMMAND_LINE_END);
        if (isXiaomiDevice()) {
            sb.append("MIUI Version: ");
            sb.append(getMiuiVersion());
            sb.append("\nMIUI 12+: ");
            sb.append(isMiui12OrHigher());
            sb.append("\nMIUI 13+: ");
            sb.append(isMiui13OrHigher());
            sb.append("\nHyperOS: ");
            sb.append(isHyperOS());
            sb.append(ShellUtils.COMMAND_LINE_END);
        }
        return sb.toString();
    }

    public static String getDeviceModel() {
        String str = sDeviceModel;
        if (str != null) {
            return str;
        }
        String str2 = Build.MODEL;
        sDeviceModel = str2;
        return str2;
    }

    public static String getMiuiVersion() {
        String systemProperty;
        String str = sMiuiVersion;
        if (str != null) {
            return str;
        }
        if (isXiaomiDevice()) {
            try {
                systemProperty = getSystemProperty("ro.miui.ui.version.name");
                sMiuiVersion = systemProperty;
            } catch (Exception e) {
                e.getMessage();
            }
            if (TextUtils.isEmpty(systemProperty)) {
                String systemProperty2 = getSystemProperty("ro.miui.version.code");
                sMiuiVersion = systemProperty2;
                if (TextUtils.isEmpty(systemProperty2)) {
                    String str2 = Build.DISPLAY;
                    if (!TextUtils.isEmpty(str2) && containsMiuiVersion(str2)) {
                        String extractMiuiVersion = extractMiuiVersion(str2);
                        sMiuiVersion = extractMiuiVersion;
                        return extractMiuiVersion;
                    }
                    sMiuiVersion = "Unknown";
                    return "Unknown";
                }
                return sMiuiVersion;
            }
            return sMiuiVersion;
        }
        return null;
    }

    private static String getSystemProperty(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static boolean isHyperOS() {
        if (isXiaomiDevice()) {
            String miuiVersion = getMiuiVersion();
            if (TextUtils.isEmpty(miuiVersion) || "Unknown".equals(miuiVersion)) {
                return false;
            }
            return miuiVersion.contains("HyperOS") || miuiVersion.contains("OS1.");
        }
        return false;
    }

    public static boolean isMiui12OrHigher() {
        if (isXiaomiDevice()) {
            String miuiVersion = getMiuiVersion();
            if (!TextUtils.isEmpty(miuiVersion) && !"Unknown".equals(miuiVersion)) {
                try {
                    String extractVersionNumber = extractVersionNumber(miuiVersion);
                    if (!TextUtils.isEmpty(extractVersionNumber)) {
                        return Integer.parseInt(extractVersionNumber) >= 12;
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isMiui13OrHigher() {
        if (isXiaomiDevice()) {
            String miuiVersion = getMiuiVersion();
            if (!TextUtils.isEmpty(miuiVersion) && !"Unknown".equals(miuiVersion)) {
                try {
                    String extractVersionNumber = extractVersionNumber(miuiVersion);
                    if (!TextUtils.isEmpty(extractVersionNumber)) {
                        return Integer.parseInt(extractVersionNumber) >= 13;
                    }
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isXiaomiDevice() {
        if (sIsXiaomiDevice) {
            return true;
        }
        try {
        } catch (Exception e) {
            e.getMessage();
        }
        if (isXiaomiManufacturer(Build.MANUFACTURER)) {
            sIsXiaomiDevice = true;
            return true;
        } else if (isXiaomiManufacturer(Build.BRAND)) {
            sIsXiaomiDevice = true;
            return true;
        } else if (isXiaomiModel(Build.MODEL)) {
            sIsXiaomiDevice = true;
            return true;
        } else if (isXiaomiModel(Build.PRODUCT)) {
            sIsXiaomiDevice = true;
            return true;
        } else if (isXiaomiModel(Build.DEVICE)) {
            sIsXiaomiDevice = true;
            return true;
        } else if (isXiaomiFingerprint(Build.FINGERPRINT)) {
            sIsXiaomiDevice = true;
            return true;
        } else {
            if (checkXiaomiSystemProperties()) {
                sIsXiaomiDevice = true;
                return true;
            }
            sIsXiaomiDevice = false;
            return false;
        }
    }

    private static boolean isXiaomiFingerprint(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("xiaomi") || lowerCase.contains("redmi") || lowerCase.contains("poco") || lowerCase.contains("blackshark") || lowerCase.contains("mi ");
    }

    private static boolean isXiaomiManufacturer(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : XIAOMI_MANUFACTURERS) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isXiaomiModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        for (String str2 : XIAOMI_MODELS) {
            if (lowerCase.contains(str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
