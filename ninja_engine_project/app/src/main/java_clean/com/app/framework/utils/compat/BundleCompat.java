package com.app.framework.utils.compat;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
public class BundleCompat {
    public static IBinder getBinder(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        if (bundleExtra != null) {
            return getBinder(bundleExtra, "binder");
        }
        return null;
    }

    public static void putBinder(Intent intent, String str, IBinder iBinder) {
        Bundle bundle = new Bundle();
        putBinder(bundle, "binder", iBinder);
        intent.putExtra(str, bundle);
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}


