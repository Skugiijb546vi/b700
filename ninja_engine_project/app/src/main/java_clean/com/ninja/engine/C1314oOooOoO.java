package com.ninja.engine;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
/* renamed from: com.ninja.engine.oOooOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314oOooOoO implements InterfaceC1315oOooOoOO, oOO000o, InterfaceC1397oo00OO00 {
    public static final String[] OooO0OO = {"_data"};
    public final /* synthetic */ int OooO00o;
    public final ContentResolver OooO0O0;

    public /* synthetic */ C1314oOooOoO(ContentResolver contentResolver, int i) {
        this.OooO00o = i;
        this.OooO0O0 = contentResolver;
    }

    @Override // com.ninja.engine.InterfaceC1397oo00OO00
    public InterfaceC0346o0OO0o0 OooO00o(Uri uri) {
        switch (this.OooO00o) {
            case 1:
                return new o00OOO00(this.OooO0O0, uri, 0);
            default:
                return new o00OOO0(1, uri, this.OooO0O0) {
                    public Object OooO0oo(android.content.res.AssetManager assetManager, String str) { return null; }
                    public Object OooO(android.net.Uri uri, android.content.ContentResolver contentResolver) { return null; }
                    public Class OooO00o() { return null; }
                    public void OooO0oO(Object obj) {}
                };
        }
    }

    @Override // com.ninja.engine.InterfaceC1315oOooOoOO
    public Cursor OooO0O0(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.OooO0O0.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, OooO0OO, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 1:
                return new C1396oo00OO0(this);
            default:
                return new C1396oo00OO0(this);
        }
    }
}


