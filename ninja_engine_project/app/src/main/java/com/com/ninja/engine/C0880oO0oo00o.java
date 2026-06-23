package com.ninja.engine;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
/* renamed from: com.ninja.engine.oO0oo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880oO0oo00o implements InterfaceC0346o0OO0o0 {
    public static final String[] OooO0Oo = {"_data"};
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public /* synthetic */ C0880oO0oo00o(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return File.class;
            default:
                return ((InterfaceC0654o0ooOO) this.OooO0OO).OooO00o();
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        int i = this.OooO00o;
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
                Cursor query = ((Context) this.OooO0O0).getContentResolver().query((Uri) this.OooO0OO, OooO0Oo, null, null, null);
                String str = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_data"));
                        }
                    } finally {
                        query.close();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    o0oo0o00.OooO0O0(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.OooO0OO)));
                    return;
                }
                o0oo0o00.OooO0Oo(new File(str));
                return;
            default:
                o0oo0o00.OooO0Oo(((InterfaceC0654o0ooOO) this.OooO0OO).OooOO0((byte[]) this.OooO0O0));
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
        int i = this.OooO00o;
    }

    private final void OooO0O0() {
    }

    private final void OooO0Oo() {
    }

    private final void OooO0oO() {
    }

    private final void OooO0oo() {
    }
}
