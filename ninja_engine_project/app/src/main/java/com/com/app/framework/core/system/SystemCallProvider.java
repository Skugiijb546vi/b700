package com.app.framework.core.system;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.app.framework.utils.compat.BundleCompat;
import java.util.Objects;
/* loaded from: classes.dex */
public class SystemCallProvider extends ContentProvider {
    public static final String TAG = "SystemCallProvider";

    private boolean initSystem() {
        try {
            BlackBoxSystem.getSystem().startup();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        IBinder service;
        try {
            Objects.toString(bundle);
            if ("VM".equals(str)) {
                Bundle bundle2 = new Bundle();
                if (bundle != null && (service = ServiceManager.getService(bundle.getString("_B_|_server_name_"))) != null) {
                    BundleCompat.putBinder(bundle2, "_B_|_server_", service);
                }
                return bundle2;
            }
            return super.call(str, str2, bundle);
        } catch (Exception e) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("error", e.getMessage());
            return bundle3;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            return initSystem();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
