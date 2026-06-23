package com.ninja.engine;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* renamed from: com.ninja.engine.oo000o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1374oo000o00 extends AbstractC1091oOOoOOOO {
    public static FontFamily Oooo0(C0575o0oOo0[] c0575o0oOo0Arr, ContentResolver contentResolver) {
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (C0575o0oOo0 c0575o0oOo0 : c0575o0oOo0Arr) {
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(c0575o0oOo0.OooO00o, "r", null);
            } catch (IOException unused) {
            }
            if (openFileDescriptor == null) {
                if (openFileDescriptor == null) {
                }
            } else {
                Font build = new Font.Builder(openFileDescriptor).setWeight(c0575o0oOo0.OooO0OO).setSlant(c0575o0oOo0.OooO0Oo ? 1 : 0).setTtcIndex(c0575o0oOo0.OooO0O0).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            }
            openFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static Font Oooo00o(FontFamily fontFamily, int i) {
        int i2;
        int i3;
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = 400;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        FontStyle fontStyle = new FontStyle(i2, i3);
        Font font = fontFamily.getFont(0);
        int Oooo0O0 = Oooo0O0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int Oooo0O02 = Oooo0O0(fontStyle, font2.getStyle());
            if (Oooo0O02 < Oooo0O0) {
                font = font2;
                Oooo0O0 = Oooo0O02;
            }
        }
        return font;
    }

    public static int Oooo0O0(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0o(Context context, C0575o0oOo0[] c0575o0oOo0Arr, int i) {
        try {
            FontFamily Oooo0 = Oooo0(c0575o0oOo0Arr, context.getContentResolver());
            if (Oooo0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(Oooo0).setStyle(Oooo00o(Oooo0, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0o0(Context context, C0573o0oOOooo c0573o0oOOooo, Resources resources, int i) {
        C0576o0oOo00[] c0576o0oOo00Arr;
        try {
            FontFamily.Builder builder = null;
            for (C0576o0oOo00 c0576o0oOo00 : c0573o0oOOooo.OooO00o) {
                try {
                    Font build = new Font.Builder(resources, c0576o0oOo00.OooO0o).setWeight(c0576o0oOo00.OooO0O0).setSlant(c0576o0oOo00.OooO0OO ? 1 : 0).setTtcIndex(c0576o0oOo00.OooO0o0).setFontVariationSettings(c0576o0oOo00.OooO0Oo).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(Oooo00o(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0oO(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily Oooo0 = Oooo0((C0575o0oOo0[]) list.get(0), contentResolver);
            if (Oooo0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(Oooo0);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily Oooo02 = Oooo0((C0575o0oOo0[]) list.get(i2), contentResolver);
                if (Oooo02 != null) {
                    customFallbackBuilder.addCustomFallback(Oooo02);
                }
            }
            return customFallbackBuilder.setStyle(Oooo00o(Oooo0, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final Typeface OooO0oo(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final C0575o0oOo0 OooOO0o(C0575o0oOo0[] c0575o0oOo0Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
