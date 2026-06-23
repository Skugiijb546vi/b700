package com.ninja.engine;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
/* renamed from: com.ninja.engine.oO00OOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0714oO00OOoo {
    public static final /* synthetic */ int[] OooO00o;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        OooO00o = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            OooO00o[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            OooO00o[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}


