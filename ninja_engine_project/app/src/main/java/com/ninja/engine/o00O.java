package com.ninja.engine;

import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o00O implements InterfaceC0899oO0oooo, InterfaceC0353o0OO0ooo, oOO000o, o00OOO0O, InterfaceC0891oO0ooO0O, InterfaceC1982oooOO0, InterfaceC0954oOO0oOo, InterfaceC0473o0Ooo0Oo, InterfaceC0526o0o0O0, InterfaceC0553o0o0Oo0o, o0OO0oO0, InterfaceC1004oOOOOo0o, InterfaceC1444oo00oooO, InterfaceC0488o0Ooooo, o00000 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public o00O(int i) {
        this.OooO00o = i;
        switch (i) {
            case 15:
                this.OooO0O0 = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.OooO0O0 = new C0455o0OoOo00(25);
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0553o0o0Oo0o
    public Cursor OooO(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.OooO0O0;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        if (menuC0887oO0oo0oo instanceof SubMenuC1265oOoo0O) {
            ((SubMenuC1265oOoo0O) menuC0887oO0oo0oo).OooOoO.OooOO0O().OooO0OO(false);
        }
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = ((o000000) this.OooO0O0).OooO0o0;
        if (interfaceC0899oO0oooo != null) {
            interfaceC0899oO0oooo.OooO0O0(menuC0887oO0oo0oo, z);
        }
    }

    @Override // com.ninja.engine.o0OO0oO0
    public void OooO0OO() {
        ((C1057oOOo00oO) this.OooO0O0).OooO0O0();
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 4:
                return new C0549o0o0Oo((AssetManager) this.OooO0O0, 0, this);
            default:
                return new C0230o00oOO(1, (C0455o0OoOo00) this.OooO0O0);
        }
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public boolean OooO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        o000000 o000000Var = (o000000) this.OooO0O0;
        if (menuC0887oO0oo0oo == o000000Var.OooO0OO) {
            return false;
        }
        o000000Var.OooOoO0 = ((SubMenuC1265oOoo0O) menuC0887oO0oo0oo).OooOoOO.OooO00o;
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = o000000Var.OooO0o0;
        if (interfaceC0899oO0oooo == null) {
            return false;
        }
        return interfaceC0899oO0oooo.OooO0o(menuC0887oO0oo0oo);
    }

    @Override // com.ninja.engine.InterfaceC0488o0Ooooo
    public boolean OooO0o0(Object obj, File file, C0973oOOO00o c0973oOOO00o) {
        InputStream inputStream = (InputStream) obj;
        C0836oO0o0oO0 c0836oO0o0oO0 = (C0836oO0o0oO0) this.OooO0O0;
        byte[] bArr = (byte[]) c0836oO0o0oO0.OooO0Oo(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c0836oO0o0oO0.OooO0oo(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        c0836oO0o0oO0.OooO0oo(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                c0836oO0o0oO0.OooO0oo(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
        }
    }

    @Override // com.ninja.engine.InterfaceC0473o0Ooo0Oo
    public boolean OooO0oO(CharSequence charSequence, int i, int i2, C1373oo000o0 c1373oo000o0) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), (String) this.OooO0O0)) {
            c1373oo000o0.OooO0OO = (c1373oo000o0.OooO0OO & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public C0323o0O0oO0o OooO0oo() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.OooO0O0).build();
        return new C0323o0O0oO0o(new C0331o0O0oo(build));
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOO0() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = (AbstractC1066oOOo0Oo) this.OooO0O0;
        return abstractC1066oOOo0Oo.OooOOOO - abstractC1066oOOo0Oo.OooOooO();
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public void OooOO0O(Bundle bundle) {
        ((ContentInfo.Builder) this.OooO0O0).setExtras(bundle);
    }

    @Override // com.ninja.engine.InterfaceC0954oOO0oOo
    public C1536oo0OoOoO OooOO0o(View view, C1536oo0OoOoO c1536oo0OoOoO) {
        boolean z;
        boolean z2;
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.OooO0O0;
        if (!Objects.equals(coordinatorLayout.OooOOO, c1536oo0OoOoO)) {
            coordinatorLayout.OooOOO = c1536oo0OoOoO;
            if (c1536oo0OoOoO.OooO0Oo() > 0) {
                z = true;
            } else {
                z = false;
            }
            coordinatorLayout.OooOOOO = z;
            if (!z && coordinatorLayout.getBackground() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.setWillNotDraw(z2);
            if (!c1536oo0OoOoO.OooO00o.OooOOO0()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (childAt.getFitsSystemWindows() && (abstractC0326o0O0oOOO = ((C0327o0O0oOo) childAt.getLayoutParams()).OooO00o) != null) {
                        c1536oo0OoOoO = abstractC0326o0O0oOOO.OooO0OO(c1536oo0OoOoO);
                        if (c1536oo0OoOoO.OooO00o.OooOOO0()) {
                            break;
                        }
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c1536oo0OoOoO;
    }

    @Override // com.ninja.engine.InterfaceC0526o0o0O0
    public Object OooOOO() {
        C1344oOooooOo c1344oOooooOo = (C1344oOooooOo) this.OooO0O0;
        return new C0500o0o000oo((oO00000) c1344oOooooOo.OooO00o, (oO00000) c1344oOooooOo.OooO0O0, (oO00000) c1344oOooooOo.OooO0OO, (oO00000) c1344oOooooOo.OooO0Oo, (InterfaceC0491o0o00) c1344oOooooOo.OooO0o0, (InterfaceC0502o0o00O0) c1344oOooooOo.OooO0o, (C0131o00O0o) c1344oOooooOo.OooO0oO);
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOOO0(View view) {
        ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
        return (view.getTop() - ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.top) - ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).topMargin;
    }

    @Override // com.ninja.engine.o00OOO0O
    public InterfaceC0346o0OO0o0 OooOOOO(AssetManager assetManager, String str) {
        return new C0538o0o0OO(assetManager, str, 1);
    }

    @Override // com.ninja.engine.o0OO0oO0
    public Object OooOOOo() {
        C1057oOOo00oO c1057oOOo00oO = (C1057oOOo00oO) this.OooO0O0;
        c1057oOOo00oO.reset();
        return c1057oOOo00oO;
    }

    @Override // com.ninja.engine.InterfaceC1004oOOOOo0o
    public void OooOOo(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) obj;
        }
        ((ProfileInstallReceiver) this.OooO0O0).setResultCode(i);
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public void OooOOo0(int i, long j, long j2) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloaded_bytes", Long.valueOf(j));
            contentValues.put("last_modified_at", Long.valueOf(j2));
            ((SQLiteDatabase) this.OooO0O0).update("prdownloader", contentValues, "id = ? ", new String[]{String.valueOf(i)});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public View OooOOoo(int i) {
        return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOo0(i);
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOo(View view) {
        ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
        return view.getBottom() + ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.bottom + ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).bottomMargin;
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public void OooOo0(Uri uri) {
        ((ContentInfo.Builder) this.OooO0O0).setLinkUri(uri);
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOo00() {
        return ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo00O();
    }

    @Override // com.ninja.engine.InterfaceC0891oO0ooO0O
    public void OooOo0O(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        ((View$OnKeyListenerC0276o00ooo0o) this.OooO0O0).OooO0oO.removeCallbacksAndMessages(menuC0887oO0oo0oo);
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public void OooOo0o(C0647o0ooO0O0 c0647o0ooO0O0) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(c0647o0ooO0O0.OooO00o));
            contentValues.put("url", c0647o0ooO0O0.OooO0O0);
            contentValues.put("etag", c0647o0ooO0O0.OooO0OO);
            contentValues.put("dir_path", c0647o0ooO0O0.OooO0Oo);
            contentValues.put("file_name", c0647o0ooO0O0.OooO0o0);
            contentValues.put("total_bytes", Long.valueOf(c0647o0ooO0O0.OooO0o));
            contentValues.put("downloaded_bytes", Long.valueOf(c0647o0ooO0O0.OooO0oO));
            contentValues.put("last_modified_at", Long.valueOf(c0647o0ooO0O0.OooO0oo));
            ((SQLiteDatabase) this.OooO0O0).insert("prdownloader", null, contentValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, com.ninja.engine.o0ooO0O0] */
    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public C0647o0ooO0O0 OooOoO(int i) {
        C0647o0ooO0O0 c0647o0ooO0O0;
        Object r2;
        Cursor cursor = null;
        r1 = null;
        C0647o0ooO0O0 c0647o0ooO0O02 = null;
        cursor = null;
        try {
            try {
                Cursor rawQuery = ((SQLiteDatabase) this.OooO0O0).rawQuery("SELECT * FROM prdownloader WHERE id = " + i, null);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.moveToFirst()) {
                                r2 = new Object();
                                try {
                                    r2.OooO00o = i;
                                    r2.OooO0O0 = rawQuery.getString(rawQuery.getColumnIndex("url"));
                                    r2.OooO0OO = rawQuery.getString(rawQuery.getColumnIndex("etag"));
                                    r2.OooO0Oo = rawQuery.getString(rawQuery.getColumnIndex("dir_path"));
                                    r2.OooO0o0 = rawQuery.getString(rawQuery.getColumnIndex("file_name"));
                                    r2.OooO0o = rawQuery.getLong(rawQuery.getColumnIndex("total_bytes"));
                                    r2.OooO0oO = rawQuery.getLong(rawQuery.getColumnIndex("downloaded_bytes"));
                                    r2.OooO0oo = rawQuery.getLong(rawQuery.getColumnIndex("last_modified_at"));
                                    c0647o0ooO0O02 = r2;
                                } catch (Exception e) {
                                    e = e;
                                    cursor = rawQuery;
                                    c0647o0ooO0O0 = r2;
                                    e.printStackTrace();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return c0647o0ooO0O0;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r2 = 0;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                    return c0647o0ooO0O02;
                }
                return c0647o0ooO0O02;
            } catch (Exception e3) {
                e = e3;
                c0647o0ooO0O0 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
        return r1;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.ninja.engine.o0ooO0O0] */
    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List OooOoOO(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "SELECT * FROM prdownloader WHERE last_modified_at <= "
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 86400(0x15180, float:1.21072E-40)
            int r7 = r7 * r2
            long r2 = (long) r7
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r7 = 0
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            long r4 = r4 - r2
            java.lang.Object r2 = r6.OooO0O0     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r3.<init>(r0)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r3.append(r4)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            android.database.Cursor r7 = r2.rawQuery(r0, r7)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            if (r7 == 0) goto La6
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            if (r0 == 0) goto La6
        L33:
            com.ninja.engine.o0ooO0O0 r0 = new com.ninja.engine.o0ooO0O0     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.<init>()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "id"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            int r2 = r7.getInt(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO00o = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "url"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0O0 = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "etag"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0OO = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "dir_path"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0Oo = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "file_name"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0o0 = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "total_bytes"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            long r2 = r7.getLong(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0o = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "downloaded_bytes"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            long r2 = r7.getLong(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0oO = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            java.lang.String r2 = "last_modified_at"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            long r2 = r7.getLong(r2)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r0.OooO0oo = r2     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            r1.add(r0)     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La4
            if (r0 != 0) goto L33
            goto La6
        La2:
            r0 = move-exception
            goto Lb3
        La4:
            r0 = move-exception
            goto Lac
        La6:
            if (r7 == 0) goto Lb2
        La8:
            r7.close()
            goto Lb2
        Lac:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> La2
            if (r7 == 0) goto Lb2
            goto La8
        Lb2:
            return r1
        Lb3:
            if (r7 == 0) goto Lb8
            r7.close()
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o00O.OooOoOO(int):java.util.List");
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public void OooOoo(int i) {
        ((ContentInfo.Builder) this.OooO0O0).setFlags(i);
    }

    @Override // com.ninja.engine.InterfaceC0891oO0ooO0O
    public void OooOoo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, C0892oO0ooO0o c0892oO0ooO0o) {
        View$OnKeyListenerC0276o00ooo0o view$OnKeyListenerC0276o00ooo0o = (View$OnKeyListenerC0276o00ooo0o) this.OooO0O0;
        C0275o00ooo0O c0275o00ooo0O = null;
        view$OnKeyListenerC0276o00ooo0o.OooO0oO.removeCallbacksAndMessages(null);
        ArrayList arrayList = view$OnKeyListenerC0276o00ooo0o.OooO;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (menuC0887oO0oo0oo == ((C0275o00ooo0O) arrayList.get(i)).OooO0O0) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            c0275o00ooo0O = (C0275o00ooo0O) arrayList.get(i2);
        }
        view$OnKeyListenerC0276o00ooo0o.OooO0oO.postAtTime(new RunnableC0273o00ooo0(this, c0275o00ooo0O, c0892oO0ooO0o, menuC0887oO0oo0oo), menuC0887oO0oo0oo, SystemClock.uptimeMillis() + 200);
    }

    public Object OooOooO(C0215o00o0o0o c0215o00o0o0o, InterfaceC0741oO00oO0o interfaceC0741oO00oO0o) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0741oO00oO0o, "property");
        Boolean bool = Boolean.FALSE;
        String str = ((AbstractC0262o00ooO00) interfaceC0741oO00oO0o).OooO0Oo;
        AbstractC0809oO0OooOO.OooOOOo(str, "key");
        SharedPreferences sharedPreferences = (SharedPreferences) ((C1278oOoo0o00) this.OooO0O0).OooO00o();
        if (bool instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Number) bool).intValue()));
        }
        if (bool instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Number) bool).longValue()));
        }
        if (bool instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Number) bool).floatValue()));
        }
        if (bool instanceof String) {
            String string = sharedPreferences.getString(str, (String) bool);
            AbstractC0809oO0OooOO.OooOO0o(string);
            return string;
        }
        return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
    }

    @Override // com.ninja.engine.InterfaceC0553o0o0Oo0o
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.OooO0O0;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public void remove(int i) {
        try {
            ((SQLiteDatabase) this.OooO0O0).execSQL("DELETE FROM prdownloader WHERE id = " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ o00O(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    public o00O(ClipData clipData, int i) {
        this.OooO00o = 6;
        this.OooO0O0 = AbstractC0187o00o.OooO0o0(clipData, i);
    }

    public o00O(Context context, int i) {
        this.OooO00o = i;
        switch (i) {
            case 3:
                this.OooO0O0 = new SQLiteOpenHelper(context, "prdownloader.db", (SQLiteDatabase.CursorFactory) null, 1).getWritableDatabase();
                return;
            default:
                this.OooO0O0 = new C1278oOoo0o00(new C0141o00O0ooo(context, null));
                return;
        }
    }

    public o00O(Context context, Uri uri) {
        this.OooO00o = 12;
        this.OooO0O0 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ninja.engine.oOoOo0o0, com.ninja.engine.o0O0oo] */
    public o00O(View view) {
        C0331o0O0oo c0331o0O0oo;
        this.OooO00o = 22;
        if (Build.VERSION.SDK_INT >= 30) {
            C0331o0O0oo c0331o0O0oo2 = new C0331o0O0oo(28, view);
            c0331o0O0oo2.OooO0Oo = view;
            c0331o0O0oo = c0331o0O0oo2;
        } else {
            c0331o0O0oo = new C0331o0O0oo(28, view);
        }
        this.OooO0O0 = c0331o0O0oo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.oOoOo0o0, com.ninja.engine.o0O0oo, java.lang.Object] */
    public o00O(WindowInsetsController windowInsetsController) {
        this.OooO00o = 22;
        C0331o0O0oo c0331o0O0oo = new C0331o0O0oo(28, (Object) null);
        c0331o0O0oo.OooO0o0 = windowInsetsController;
        this.OooO0O0 = c0331o0O0oo;
    }

    public o00O(C0331o0O0oo c0331o0O0oo) {
        this.OooO00o = 13;
        this.OooO0O0 = Collections.unmodifiableMap(new HashMap((HashMap) c0331o0O0oo.OooO0O0));
    }

    public o00O(InputStream inputStream, C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = 14;
        C1057oOOo00oO c1057oOOo00oO = new C1057oOOo00oO(inputStream, c0836oO0o0oO0);
        this.OooO0O0 = c1057oOOo00oO;
        c1057oOOo00oO.mark(5242880);
    }

    @Override // com.ninja.engine.InterfaceC0473o0Ooo0Oo
    public Object OooO00o() {
        return this;
    }
}

