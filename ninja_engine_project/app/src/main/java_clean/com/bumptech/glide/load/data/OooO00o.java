package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.ninja.engine.o0OO0oO0;
/* loaded from: classes.dex */
public final class OooO00o implements o0OO0oO0 {
    public final ParcelFileDescriptorRewinder$InternalRewinder OooO00o;

    public OooO00o(ParcelFileDescriptor parcelFileDescriptor) {
        this.OooO00o = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor OooO00o() {
        return this.OooO00o.rewind();
    }

    @Override // com.ninja.engine.o0OO0oO0
    public final void OooO0OO() {
    }

    @Override // com.ninja.engine.o0OO0oO0
    public final Object OooOOOo() {
        return this.OooO00o.rewind();
    }
}


