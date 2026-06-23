package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.C0131o00O0o;
/* loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() != null) {
                C0131o00O0o OooOoo0 = C0131o00O0o.OooOoo0(context);
                Context context2 = (Context) OooOoo0.OooO0Oo;
                try {
                    try {
                        AbstractC1091oOOoOOOO.OooO00o("Startup");
                        OooOoo0.OooOOOO(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                        return true;
                    } catch (PackageManager.NameNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    Trace.endSection();
                }
            }
            return true;
        }
        throw new RuntimeException("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
