package com.bumptech.glide.load;

import com.ninja.engine.AbstractC0714oO00OOoo;

public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);
    
    public final boolean OooO00o;

    ImageHeaderParser$ImageType(boolean z) {
        this.OooO00o = z;
    }

    public boolean hasAlpha() {
        return this.OooO00o;
    }

    public boolean isWebp() {
        int i = AbstractC0714oO00OOoo.OooO00o[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
