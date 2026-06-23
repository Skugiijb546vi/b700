package com.ninja.engine;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
/* renamed from: com.ninja.engine.o0OOOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370o0OOOoOo implements ImageDecoder.OnHeaderDecodedListener {
    public final C0771oO0OO0oo OooO00o = C0771oO0OO0oo.OooO00o();
    public final int OooO0O0;
    public final int OooO0OO;
    public final o0OOO0 OooO0Oo;
    public final boolean OooO0o;
    public final C0416o0Oo0OO OooO0o0;
    public final EnumC0999oOOOO0oO OooO0oO;

    public C0370o0OOOoOo(int i, int i2, C0973oOOO00o c0973oOOO00o) {
        boolean z;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO0Oo = (o0OOO0) c0973oOOO00o.OooO0OO(C0577o0oOo000.OooO0o);
        this.OooO0o0 = (C0416o0Oo0OO) c0973oOOO00o.OooO0OO(C0416o0Oo0OO.OooO0oO);
        oOOO00o0 oooo00o0 = C0577o0oOo000.OooO;
        if (c0973oOOO00o.OooO0OO(oooo00o0) != null && ((Boolean) c0973oOOO00o.OooO0OO(oooo00o0)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.OooO0o = z;
        this.OooO0oO = (EnumC0999oOOOO0oO) c0973oOOO00o.OooO0OO(C0577o0oOo000.OooO0oO);
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, com.ninja.engine.o0OOOoO] */
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        boolean isWideGamut;
        if (this.OooO00o.OooO0OO(this.OooO0O0, this.OooO0OO, this.OooO0o, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.OooO0Oo == o0OOO0.OooO0O0) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new android.graphics.ImageDecoder.OnPartialImageListener() {
            @Override
            public boolean onPartialImage(android.graphics.ImageDecoder.DecodeException e) {
                return false;
            }
        });
        size = imageInfo.getSize();
        int i = this.OooO0O0;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.OooO0OO;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float OooO0O0 = this.OooO0o0.OooO0O0(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * OooO0O0);
        int round2 = Math.round(OooO0O0 * size.getHeight());
        if (Log.isLoggable("ImageDecoder", 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        EnumC0999oOOOO0oO enumC0999oOOOO0oO = this.OooO0oO;
        if (enumC0999oOOOO0oO != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (enumC0999oOOOO0oO == EnumC0999oOOOO0oO.OooO00o) {
                    colorSpace2 = imageInfo.getColorSpace();
                    if (colorSpace2 != null) {
                        colorSpace3 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace3.isWideGamut();
                        if (isWideGamut) {
                            named = ColorSpace.Named.DISPLAY_P3;
                            colorSpace = ColorSpace.get(named);
                            imageDecoder.setTargetColorSpace(colorSpace);
                        }
                    }
                }
            } else if (i3 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            imageDecoder.setTargetColorSpace(colorSpace);
        }
    }
}


