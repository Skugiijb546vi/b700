package com.ninja.engine;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o00oOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233o00oOOOo implements InterfaceC0346o0OO0o0 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public /* synthetic */ C0233o00oOOOo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.OooO0O0.getClass();
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
                try {
                    o0oo0o00.OooO0Oo(AbstractC0242o00oOoO0.OooO00o((File) this.OooO0O0));
                    return;
                } catch (IOException e) {
                    Log.isLoggable("ByteBufferFileLoader", 3);
                    o0oo0o00.OooO0O0(e);
                    return;
                }
            default:
                o0oo0o00.OooO0Oo(this.OooO0O0);
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


