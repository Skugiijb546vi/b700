package com.app.framework.utils.compat;

import android.os.Build;
/* loaded from: classes.dex */
public class BuildCompat {
    private static ROMType sRomType;

    /* loaded from: classes.dex */
    public enum ROMType {
        EMUI,
        MIUI,
        FLYME,
        COLOR_OS,
        LETV,
        VIVO,
        _360,
        SAMSUNG,
        OTHER
    }

    public static int getPreviewSDKInt() {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                i = Build.VERSION.PREVIEW_SDK_INT;
                return i;
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    public static ROMType getROMType() {
        if (sRomType == null) {
            sRomType = isEMUI() ? ROMType.EMUI : isMIUI() ? ROMType.MIUI : isFlyme() ? ROMType.FLYME : isColorOS() ? ROMType.COLOR_OS : is360UI() ? ROMType._360 : isLetv() ? ROMType.LETV : isVivo() ? ROMType.VIVO : isSamsung() ? ROMType.SAMSUNG : ROMType.OTHER;
        }
        return sRomType;
    }

    public static boolean is360UI() {
        String str = SystemPropertiesCompat.get("ro.build.uiversion");
        return str != null && str.toUpperCase().contains("360UI");
    }

    public static boolean isColorOS() {
        return SystemPropertiesCompat.isExist("ro.build.version.opporom") || SystemPropertiesCompat.isExist("ro.rom.different.version");
    }

    public static boolean isEMUI() {
        if (Build.DISPLAY.toUpperCase().startsWith("EMUI")) {
            return true;
        }
        String str = SystemPropertiesCompat.get("ro.build.version.emui");
        return str != null && str.contains("EmotionUI");
    }

    public static boolean isFlyme() {
        return Build.DISPLAY.toLowerCase().contains("flyme");
    }

    public static boolean isL() {
        return true;
    }

    public static boolean isLetv() {
        return Build.MANUFACTURER.equalsIgnoreCase("Letv");
    }

    public static boolean isM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isMIUI() {
        return SystemPropertiesCompat.getInt("ro.miui.ui.version.code", 0) > 0;
    }

    public static boolean isN() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 24) {
            if (i2 >= 23) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isN_MR1() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 25) {
            if (i2 >= 24) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isOreo() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            if (i2 >= 25) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isPie() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            if (i2 >= 27) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isQ() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            if (i2 >= 28) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isR() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            if (i2 >= 29) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isS() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            if (i2 >= 30) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isSamsung() {
        return "samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isTiramisu() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33) {
            if (i2 >= 32) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isU() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            if (i2 >= 33) {
                i = Build.VERSION.PREVIEW_SDK_INT;
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isVivo() {
        return SystemPropertiesCompat.isExist("ro.vivo.os.build.display.id");
    }
}


