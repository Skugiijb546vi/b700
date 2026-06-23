package com.ninja.engine;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;
/* renamed from: com.ninja.engine.o0o0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538o0o0OO extends o00OOO0 {
    public final /* synthetic */ int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0538o0o0OO(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.OooO0o0 = i;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        switch (this.OooO0o0) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.ninja.engine.o00OOO0
    public final void OooO0oO(Object obj) {
        switch (this.OooO0o0) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.ninja.engine.o00OOO0
    public final Object OooO0oo(AssetManager assetManager, String str) {
        switch (this.OooO0o0) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
