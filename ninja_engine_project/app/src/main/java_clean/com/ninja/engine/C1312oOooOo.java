package com.ninja.engine;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
/* renamed from: com.ninja.engine.oOooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312oOooOo implements InterfaceC1315oOooOoOO, oOO000o, InterfaceC1397oo00OO00 {
    public static final String[] OooO0O0 = {"_data"};
    public final ContentResolver OooO00o;

    public /* synthetic */ C1312oOooOo(ContentResolver contentResolver) {
        this.OooO00o = contentResolver;
    }

    @Override // com.ninja.engine.InterfaceC1397oo00OO00
    public InterfaceC0346o0OO0o0 OooO00o(Uri uri) {
        return new o00OOO00(this.OooO00o, uri, 1);
    }

    @Override // com.ninja.engine.InterfaceC1315oOooOoOO
    public Cursor OooO0O0(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.OooO00o.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, OooO0O0, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        return new C1396oo00OO0(this);
    }
}


