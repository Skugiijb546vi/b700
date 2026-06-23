package com.ninja.engine;

import android.graphics.Bitmap;
/* renamed from: com.ninja.engine.oo00OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1395oo00OO {
    public static final /* synthetic */ int[] OooO00o;

    static {
        Bitmap.Config config;
        int[] iArr = new int[Bitmap.Config.values().length];
        OooO00o = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            int[] iArr2 = OooO00o;
            config = Bitmap.Config.RGBA_F16;
            iArr2[config.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            OooO00o[Bitmap.Config.ARGB_8888.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
