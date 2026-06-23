package com.ninja.engine;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
/* loaded from: classes.dex */
public final class o00OOO00 extends o00OOO0 {
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00OOO00(ContentResolver contentResolver, Uri uri, int i) {
        super(1, uri, contentResolver);
        this.OooO0o0 = i;
    }

    @Override // com.ninja.engine.o00OOO0
    public final Object OooO(Uri uri, ContentResolver contentResolver) {
        switch (this.OooO0o0) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        switch (this.OooO0o0) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.ninja.engine.o00OOO0
    public final void OooO0oO(Object obj) {
        switch (this.OooO0o0) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((ParcelFileDescriptor) obj).close();
                return;
        }
    }
    public Object OooO0oo(android.content.res.AssetManager assetManager, String str) { return null; }
}


