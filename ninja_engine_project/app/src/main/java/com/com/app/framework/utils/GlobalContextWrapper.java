package com.app.framework.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.app.framework.BlackBoxCore;
/* loaded from: classes.dex */
public class GlobalContextWrapper extends ContextWrapper {
    private static final String TAG = "GlobalContextWrapper";
    private final Context fallbackContext;
    private final String packageName;

    public GlobalContextWrapper(Context context) {
        this(context, context != null ? context.getPackageName() : "unknown");
    }

    public static Context createSafeContext(Context context) {
        return createSafeContext(context, context != null ? context.getPackageName() : "unknown");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getApplicationContext();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return this.fallbackContext.getApplicationContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getAssets();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return this.fallbackContext.getAssets();
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        Context baseContext = super.getBaseContext();
        return baseContext != null ? baseContext : this.fallbackContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getClassLoader();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return this.fallbackContext.getClassLoader();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ContentResolver getContentResolver() {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getContentResolver();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return this.fallbackContext.getContentResolver();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getPackageManager();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            return this.fallbackContext.getPackageManager();
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        String str = this.packageName;
        return str != null ? str : getBaseContext() != null ? getBaseContext().getPackageName() : "unknown";
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getResources();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            return this.fallbackContext.getResources();
        } catch (Exception e2) {
            e2.getMessage();
            try {
                return new Resources(null, null, null);
            } catch (Exception e3) {
                e3.getMessage();
                return null;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        try {
            Context baseContext = getBaseContext();
            if (baseContext != null) {
                return baseContext.getSystemService(str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return this.fallbackContext.getSystemService(str);
    }

    public GlobalContextWrapper(Context context, String str) {
        super(context == null ? BlackBoxCore.getContext() : context);
        this.fallbackContext = BlackBoxCore.getContext();
        this.packageName = str;
    }

    public static Context createSafeContext(Context context, String str) {
        if (context == null) {
            return new GlobalContextWrapper(null, str);
        }
        if (context instanceof GlobalContextWrapper) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            try {
                if (((ContextWrapper) context).getBaseContext() == null) {
                    return new GlobalContextWrapper(context, str);
                }
            } catch (Exception e) {
                e.getMessage();
                return new GlobalContextWrapper(context, str);
            }
        }
        return new GlobalContextWrapper(context, str);
    }
}
