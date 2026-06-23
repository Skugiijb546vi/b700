package com.ninja.engine;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
/* renamed from: com.ninja.engine.oOOOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020oOOOo0o implements InterfaceC0346o0OO0o0 {
    public static final String[] OooOO0O = {"_data"};
    public volatile boolean OooO;
    public final Context OooO00o;
    public final InterfaceC0904oOO000o0 OooO0O0;
    public final InterfaceC0904oOO000o0 OooO0OO;
    public final Uri OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final C0973oOOO00o OooO0oO;
    public final Class OooO0oo;
    public volatile InterfaceC0346o0OO0o0 OooOO0;

    public C1020oOOOo0o(Context context, InterfaceC0904oOO000o0 interfaceC0904oOO000o0, InterfaceC0904oOO000o0 interfaceC0904oOO000o02, Uri uri, int i, int i2, C0973oOOO00o c0973oOOO00o, Class cls) {
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = interfaceC0904oOO000o0;
        this.OooO0OO = interfaceC0904oOO000o02;
        this.OooO0Oo = uri;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO0oO = c0973oOOO00o;
        this.OooO0oo = cls;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        return this.OooO0oo;
    }

    public final InterfaceC0346o0OO0o0 OooO0O0() {
        boolean isExternalStorageLegacy;
        int checkSelfPermission;
        C0903oOO000Oo OooO00o;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.OooO00o;
        C0973oOOO00o c0973oOOO00o = this.OooO0oO;
        int i = this.OooO0o;
        int i2 = this.OooO0o0;
        if (isExternalStorageLegacy) {
            Uri uri = this.OooO0Oo;
            try {
                Cursor query = context.getContentResolver().query(uri, OooOO0O, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                OooO00o = this.OooO0O0.OooO00o(file, i2, i, c0973oOOO00o);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri uri2 = this.OooO0Oo;
            boolean Oooo000 = AbstractC0692o0ooooOo.Oooo000(uri2);
            InterfaceC0904oOO000o0 interfaceC0904oOO000o0 = this.OooO0OO;
            if (!Oooo000 || !uri2.getPathSegments().contains("picker")) {
                checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
                if (checkSelfPermission == 0) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
            }
            OooO00o = interfaceC0904oOO000o0.OooO00o(uri2, i2, i, c0973oOOO00o);
        }
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 = this.OooOO0;
        if (interfaceC0346o0OO0o0 != null) {
            interfaceC0346o0OO0o0.OooO0OO();
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final int OooO0o() {
        return 1;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0o0(EnumC1000oOOOO0oo enumC1000oOOOO0oo, o0OO0o00 o0oo0o00) {
        try {
            InterfaceC0346o0OO0o0 OooO0O0 = OooO0O0();
            if (OooO0O0 == null) {
                o0oo0o00.OooO0O0(new IllegalArgumentException("Failed to build fetcher for: " + this.OooO0Oo));
                return;
            }
            this.OooOO0 = OooO0O0;
            if (this.OooO) {
                cancel();
            } else {
                OooO0O0.OooO0o0(enumC1000oOOOO0oo, o0oo0o00);
            }
        } catch (FileNotFoundException e) {
            o0oo0o00.OooO0O0(e);
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
        this.OooO = true;
        InterfaceC0346o0OO0o0 interfaceC0346o0OO0o0 = this.OooOO0;
        if (interfaceC0346o0OO0o0 != null) {
            interfaceC0346o0OO0o0.cancel();
        }
    }
}
