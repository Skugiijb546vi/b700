package com.ninja.engine;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* renamed from: com.ninja.engine.o0o0OoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0556o0o0OoOO {
    public static final C0839oO0o0ooO OooO00o = new C0839oO0o0ooO(2);
    public static final C0382o0OOo0o OooO0O0 = new C0382o0OOo0o(1);

    public static C0073o0000oO0 OooO00o(Context context, List list) {
        AbstractC1091oOOoOOOO.OooO00o("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C0557o0o0OoOo c0557o0o0OoOo = (C0557o0o0OoOo) list.get(i);
                ProviderInfo OooO0O02 = OooO0O0(context.getPackageManager(), c0557o0o0OoOo, context.getResources());
                if (OooO0O02 == null) {
                    C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(4);
                    Trace.endSection();
                    return c0073o0000oO0;
                }
                arrayList.add(OooO0OO(context, c0557o0o0OoOo, OooO0O02.authority));
            }
            C0073o0000oO0 c0073o0000oO02 = new C0073o0000oO0(arrayList);
            Trace.endSection();
            return c0073o0000oO02;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.ninja.engine.o0o0OoO, java.lang.Object] */
    public static ProviderInfo OooO0O0(PackageManager packageManager, C0557o0o0OoOo c0557o0o0OoOo, Resources resources) {
        AbstractC1091oOOoOOOO.OooO00o("FontProvider.getProvider");
        try {
            List list = c0557o0o0OoOo.OooO0Oo;
            String str = c0557o0o0OoOo.OooO00o;
            String str2 = c0557o0o0OoOo.OooO0O0;
            if (list == null) {
                list = AbstractC0694o0ooooo0.Oooo0o0(resources, 0);
            }
            Object obj = new Object();
            obj.OooO00o = str;
            obj.OooO0O0 = str2;
            obj.OooO0OO = list;
            C0839oO0o0ooO c0839oO0o0ooO = OooO00o;
            ProviderInfo providerInfo = (ProviderInfo) c0839oO0o0ooO.OooO0o(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    C0382o0OOo0o c0382o0OOo0o = OooO0O0;
                    Collections.sort(arrayList, c0382o0OOo0o);
                    for (int i = 0; i < list.size(); i++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                        Collections.sort(arrayList2, c0382o0OOo0o);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                    break;
                                }
                            }
                            c0839oO0o0ooO.OooOO0(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static C0575o0oOo0[] OooO0OO(Context context, C0557o0o0OoOo c0557o0o0OoOo, String str) {
        InterfaceC0553o0o0Oo0o o00o;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        AbstractC1091oOOoOOOO.OooO00o("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                o00o = new C0331o0O0oo(context, build);
            } else {
                o00o = new o00O(context, build);
            }
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            AbstractC1091oOOoOOOO.OooO00o("ContentQueryWrapper.query");
            Cursor OooO = o00o.OooO(build, strArr, new String[]{c0557o0o0OoOo.OooO0OO});
            Trace.endSection();
            if (OooO != null && OooO.getCount() > 0) {
                int columnIndex = OooO.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = OooO.getColumnIndex("_id");
                int columnIndex3 = OooO.getColumnIndex("file_id");
                int columnIndex4 = OooO.getColumnIndex("font_ttc_index");
                int columnIndex5 = OooO.getColumnIndex("font_weight");
                int columnIndex6 = OooO.getColumnIndex("font_italic");
                while (OooO.moveToNext()) {
                    if (columnIndex != -1) {
                        i = OooO.getInt(columnIndex);
                    } else {
                        i = 0;
                    }
                    if (columnIndex4 != -1) {
                        i2 = OooO.getInt(columnIndex4);
                    } else {
                        i2 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, OooO.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, OooO.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i3 = OooO.getInt(columnIndex5);
                    } else {
                        i3 = 400;
                    }
                    if (columnIndex6 != -1 && OooO.getInt(columnIndex6) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new C0575o0oOo0(uri, i2, i3, z, i));
                }
                arrayList = arrayList2;
            }
            if (OooO != null) {
                OooO.close();
            }
            o00o.close();
            C0575o0oOo0[] c0575o0oOo0Arr = (C0575o0oOo0[]) arrayList.toArray(new C0575o0oOo0[0]);
            Trace.endSection();
            return c0575o0oOo0Arr;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}

