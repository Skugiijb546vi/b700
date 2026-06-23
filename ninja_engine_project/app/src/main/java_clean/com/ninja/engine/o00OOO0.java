package com.ninja.engine;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class o00OOO0 implements InterfaceC0346o0OO0o0 {
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;
    public final Comparable OooO0OO;
    public final Object OooO0Oo;

    public /* synthetic */ o00OOO0(int i, Comparable comparable, Object obj) {
        this.OooO00o = i;
        this.OooO0Oo = obj;
        this.OooO0OO = comparable;
    }

    public abstract Object OooO(Uri uri, ContentResolver contentResolver);

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        switch (this.OooO00o) {
            case 0:
                Object obj = this.OooO0O0;
                if (obj != null) {
                    try {
                        OooO0oO(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.OooO0O0;
                if (obj2 != null) {
                    try {
                        OooO0oO(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final int OooO0o() {
        switch (this.OooO00o) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0o0(EnumC1000oOOOO0oo enumC1000oOOOO0oo, o0OO0o00 o0oo0o00) {
        switch (this.OooO00o) {
            case 0:
                try {
                    Object OooO0oo = OooO0oo((AssetManager) this.OooO0Oo, (String) this.OooO0OO);
                    this.OooO0O0 = OooO0oo;
                    o0oo0o00.OooO0Oo(OooO0oo);
                    return;
                } catch (IOException e) {
                    Log.isLoggable("AssetPathFetcher", 3);
                    o0oo0o00.OooO0O0(e);
                    return;
                }
            default:
                try {
                    Object OooO = OooO((Uri) this.OooO0OO, (ContentResolver) this.OooO0Oo);
                    this.OooO0O0 = OooO;
                    o0oo0o00.OooO0Oo(OooO);
                    return;
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("LocalUriFetcher", 3);
                    o0oo0o00.OooO0O0(e2);
                    return;
                }
        }
    }

    public abstract void OooO0oO(Object obj);

    public abstract Object OooO0oo(AssetManager assetManager, String str);

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
        int i = this.OooO00o;
    }

    private final void OooO0O0() {
    }

    private final void OooO0Oo() {
    }
}


