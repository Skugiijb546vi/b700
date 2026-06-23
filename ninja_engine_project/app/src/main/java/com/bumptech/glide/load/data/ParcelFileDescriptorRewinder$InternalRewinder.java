package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {
    public final ParcelFileDescriptor OooO00o;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.OooO00o = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() {
        ParcelFileDescriptor parcelFileDescriptor = this.OooO00o;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }
}
