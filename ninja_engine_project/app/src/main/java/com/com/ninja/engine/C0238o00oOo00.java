package com.ninja.engine;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.o00oOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238o00oOo00 implements o0OO0o {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0238o00oOo00(int i) {
        this.OooO00o = i;
    }

    @Override // com.ninja.engine.o0OO0o
    public final Class OooO00o() {
        switch (this.OooO00o) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.ninja.engine.o0OO0o
    public final o0OO0oO0 OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return new C0247o00oOooO((ByteBuffer) obj, 0);
            case 1:
                return new C0042OoooO0O(obj);
            default:
                return new com.bumptech.glide.load.data.OooO00o((ParcelFileDescriptor) obj);
        }
    }
}
