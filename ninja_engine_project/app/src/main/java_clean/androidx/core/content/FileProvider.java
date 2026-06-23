package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0542o0o0OOO;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public String OooO0O0;
    public C0542o0o0OOO OooO0OO;
    public static final String[] OooO0o0 = {"_display_name", "_size"};
    public static final File OooO0o = new File("/");
    public static final HashMap OooO0oO = new HashMap();
    public final Object OooO00o = new Object();
    public final int OooO0Oo = 0;

    public static String OooO00o(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static C0542o0o0OOO OooO0OO(Context context, String str, int i) {
        C0542o0o0OOO c0542o0o0OOO;
        HashMap hashMap = OooO0oO;
        synchronized (hashMap) {
            try {
                c0542o0o0OOO = (C0542o0o0OOO) hashMap.get(str);
                if (c0542o0o0OOO == null) {
                    try {
                        try {
                            c0542o0o0OOO = OooO0o0(context, str, i);
                            hashMap.put(str, c0542o0o0OOO);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0542o0o0OOO;
    }

    public static Uri OooO0Oo(Context context, String str, File file) {
        C0542o0o0OOO OooO0OO = OooO0OO(context, str, 0);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : OooO0OO.OooO0O0.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (C0542o0o0OOO.OooO00o(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                boolean endsWith = path2.endsWith("/");
                int length = path2.length();
                if (!endsWith) {
                    length++;
                }
                String substring = canonicalPath.substring(length);
                return new Uri.Builder().scheme("content").authority(OooO0OO.OooO00o).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooOO0o("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static C0542o0o0OOO OooO0o0(Context context, String str, int i) {
        C0542o0o0OOO c0542o0o0OOO = new C0542o0o0OOO(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                resolveContentProvider.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = OooO0o;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    c0542o0o0OOO.OooO0O0.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return c0542o0o0OOO;
                }
            }
        } else {
            throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooOO0o("Couldn't find meta-data for provider with authority ", str));
        }
    }

    public final C0542o0o0OOO OooO0O0() {
        C0542o0o0OOO c0542o0o0OOO;
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0O0 != null) {
                    if (this.OooO0OO == null) {
                        this.OooO0OO = OooO0OO(getContext(), this.OooO0O0, this.OooO0Oo);
                    }
                    c0542o0o0OOO = this.OooO0OO;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0542o0o0OOO;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.OooO00o) {
            this.OooO0O0 = str;
        }
        HashMap hashMap = OooO0oO;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return OooO0O0().OooO0O0(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File OooO0O0 = OooO0O0().OooO0O0(uri);
        int lastIndexOf = OooO0O0.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(OooO0O0.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File OooO0O0 = OooO0O0().OooO0O0(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooOO0o("Invalid mode: ", str));
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(OooO0O0, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File OooO0O0 = OooO0O0().OooO0O0(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = OooO0o0;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = OooO0O0.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(OooO0O0.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}


