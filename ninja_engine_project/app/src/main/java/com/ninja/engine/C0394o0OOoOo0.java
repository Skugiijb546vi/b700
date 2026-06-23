package com.ninja.engine;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.io.InputStream;
/* renamed from: com.ninja.engine.o0OOoOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394o0OOoOo0 implements oOO000o, InterfaceC0397o0OOoo0O, oO00000o {
    public final /* synthetic */ int OooO00o;
    public final Context OooO0O0;

    public /* synthetic */ C0394o0OOoOo0(Context context, int i) {
        this.OooO00o = i;
        this.OooO0O0 = context;
    }

    @Override // com.ninja.engine.InterfaceC0397o0OOoo0O
    public Class OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.ninja.engine.InterfaceC0397o0OOoo0O
    public Object OooO0OO(int i, Resources.Theme theme, Resources resources) {
        switch (this.OooO00o) {
            case 0:
                return resources.openRawResourceFd(i);
            default:
                return resources.openRawResource(i);
        }
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 0:
                return new C0549o0o0Oo(this.OooO0O0, this);
            case 1:
                return new C0549o0o0Oo(this.OooO0O0, this);
            case 2:
                return new C0877oO0oo0(this.OooO0O0, 1);
            default:
                return new C0549o0o0Oo(this.OooO0O0, ooo00ooo.OooOO0(Integer.class, AssetFileDescriptor.class));
        }
    }

    @Override // com.ninja.engine.InterfaceC0397o0OOoo0O
    public void OooO0o0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.ninja.engine.oO00000o
    public Object get() {
        return (ConnectivityManager) this.OooO0O0.getSystemService("connectivity");
    }
}
