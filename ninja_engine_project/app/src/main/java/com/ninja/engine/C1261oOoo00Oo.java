package com.ninja.engine;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
/* renamed from: com.ninja.engine.oOoo00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261oOoo00Oo implements InterfaceC0904oOO000o0 {
    public final /* synthetic */ int OooO00o;
    public final InterfaceC0904oOO000o0 OooO0O0;

    public /* synthetic */ C1261oOoo00Oo(InterfaceC0904oOO000o0 interfaceC0904oOO000o0, int i) {
        this.OooO00o = i;
        this.OooO0O0 = interfaceC0904oOO000o0;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Uri uri;
        File file;
        switch (this.OooO00o) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else {
                    if (str.charAt(0) == '/') {
                        file = new File(str);
                    } else {
                        Uri parse = Uri.parse(str);
                        if (parse.getScheme() == null) {
                            file = new File(str);
                        } else {
                            uri = parse;
                        }
                    }
                    uri = Uri.fromFile(file);
                }
                if (uri == null) {
                    return null;
                }
                InterfaceC0904oOO000o0 interfaceC0904oOO000o0 = this.OooO0O0;
                if (!interfaceC0904oOO000o0.OooO0O0(uri)) {
                    return null;
                }
                return interfaceC0904oOO000o0.OooO00o(uri, i, i2, c0973oOOO00o);
            default:
                return this.OooO0O0.OooO00o(new oO0000O((URL) obj), i, i2, c0973oOOO00o);
        }
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                String str = (String) obj;
                return true;
            default:
                URL url = (URL) obj;
                return true;
        }
    }
}
