package com.ninja.engine;

import android.graphics.Bitmap;
/* renamed from: com.ninja.engine.oOoOo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1227oOoOo0O {
    public static final /* synthetic */ int[] OooO00o;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        OooO00o = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
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
            OooO00o[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
