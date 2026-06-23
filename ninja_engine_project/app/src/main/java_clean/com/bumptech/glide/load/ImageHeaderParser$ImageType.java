package com.bumptech.glide.load;

import com.ninja.engine.AbstractC0714oO00OOoo;
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(0),
    JPEG(1),
    RAW(2),
    PNG_A(3),
    PNG(4),
    WEBP_A(5),
    WEBP(6),
    ANIMATED_WEBP(7),
    AVIF(8),
    ANIMATED_AVIF(9),
    UNKNOWN(10);
    
    public final boolean OooO00o;

    ImageHeaderParser$ImageType(int i) {
        this.OooO00o = r2;
    }

    public boolean hasAlpha() {
        return this.OooO00o;
    }

    public boolean isWebp() {
        int i = AbstractC0714oO00OOoo.OooO00o[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}


