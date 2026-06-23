package com.app.framework.utils.compat;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
public class StartActivityCompat {
    private static int appThreadIndex;
    private static int callingFeatureIdIndex;
    private static int callingPageIndex;
    private static int flagsIndex;
    private static int index;
    private static int intentIndex;
    private static int optionsIndex;
    private static int profilerInfoIndex;
    private static int requestCodeIndex;
    private static int resolvedTypeIndex;
    private static int resultToIndex;
    private static int resultWhoIndex;

    static {
        if (!BuildCompat.isR()) {
            int i = index;
            appThreadIndex = i;
            callingPageIndex = i + 1;
            intentIndex = i + 2;
            resolvedTypeIndex = i + 3;
            resultToIndex = i + 4;
            resultWhoIndex = i + 5;
            requestCodeIndex = i + 6;
            flagsIndex = i + 7;
            profilerInfoIndex = i + 8;
            index = i + 10;
            optionsIndex = i + 9;
            return;
        }
        int i2 = index;
        appThreadIndex = i2;
        callingPageIndex = i2 + 1;
        callingFeatureIdIndex = i2 + 2;
        intentIndex = i2 + 3;
        resolvedTypeIndex = i2 + 4;
        resultToIndex = i2 + 5;
        resultWhoIndex = i2 + 6;
        requestCodeIndex = i2 + 7;
        flagsIndex = i2 + 8;
        profilerInfoIndex = i2 + 9;
        index = i2 + 11;
        optionsIndex = i2 + 10;
    }

    public static int getAppThreadIndex() {
        return appThreadIndex;
    }

    public static String getCallingPackage(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = callingPageIndex;
            if (length < i) {
                return null;
            }
            return (String) objArr[i];
        }
        return null;
    }

    public static int getCallingPageIndex() {
        return callingPageIndex;
    }

    public static int getFlags(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = flagsIndex;
            if (length < i) {
                return -1;
            }
            return ((Integer) objArr[i]).intValue();
        }
        return -1;
    }

    public static int getFlagsIndex() {
        return flagsIndex;
    }

    public static Object getIApplicationThread(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = appThreadIndex;
            if (length < i) {
                return null;
            }
            return objArr[i];
        }
        return null;
    }

    public static Intent getIntent(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = intentIndex;
            if (length < i) {
                return null;
            }
            return (Intent) objArr[i];
        }
        return null;
    }

    public static int getIntentIndex() {
        return intentIndex;
    }

    public static Bundle getOptions(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = optionsIndex;
            if (length < i) {
                return null;
            }
            return (Bundle) objArr[i];
        }
        return null;
    }

    public static int getOptionsIndex() {
        return optionsIndex;
    }

    public static Object getProfilerInfo(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = profilerInfoIndex;
            if (length < i) {
                return null;
            }
            return objArr[i];
        }
        return null;
    }

    public static int getProfilerInfoIndex() {
        return profilerInfoIndex;
    }

    public static int getRequestCode(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = requestCodeIndex;
            if (length < i) {
                return -1;
            }
            return ((Integer) objArr[i]).intValue();
        }
        return -1;
    }

    public static int getRequestCodeIndex() {
        return requestCodeIndex;
    }

    public static String getResolvedType(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = resolvedTypeIndex;
            if (length < i) {
                return null;
            }
            return (String) objArr[i];
        }
        return null;
    }

    public static int getResolvedTypeIndex() {
        return resolvedTypeIndex;
    }

    public static IBinder getResultTo(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = resultToIndex;
            if (length < i) {
                return null;
            }
            return (IBinder) objArr[i];
        }
        return null;
    }

    public static int getResultToIndex() {
        return resultToIndex;
    }

    public static String getResultWho(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = resultWhoIndex;
            if (length < i) {
                return null;
            }
            return (String) objArr[i];
        }
        return null;
    }

    public static int getResultWhoIndex() {
        return resultWhoIndex;
    }

    public static void setAppThreadIndex(int i) {
        appThreadIndex = i;
    }

    public static void setCallingPageIndex(int i) {
        callingPageIndex = i;
    }

    public static void setFlagsIndex(int i) {
        flagsIndex = i;
    }

    public static void setIntentIndex(int i) {
        intentIndex = i;
    }

    public static void setOptionsIndex(int i) {
        optionsIndex = i;
    }

    public static void setProfilerInfoIndex(int i) {
        profilerInfoIndex = i;
    }

    public static void setRequestCodeIndex(int i) {
        requestCodeIndex = i;
    }

    public static void setResolvedTypeIndex(int i) {
        resolvedTypeIndex = i;
    }

    public static void setResultToIndex(int i) {
        resultToIndex = i;
    }

    public static void setResultWhoIndex(int i) {
        resultWhoIndex = i;
    }
}
