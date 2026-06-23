package com.ninja.engine;

import java.io.File;
@InterfaceC0158o00Oo0O0("com.android.internal.content.NativeLibraryHelper")
/* renamed from: com.ninja.engine.oooO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1954oooO0O {

    @InterfaceC0158o00Oo0O0("com.android.internal.content.NativeLibraryHelper$Handle")
    /* renamed from: com.ninja.engine.oooO0O$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0170o00OoOOO
        Object create(File file);

        @InterfaceC0160o00Oo0o
        boolean extractNativeLibs();
    }

    @InterfaceC0170o00OoOOO
    Integer copyNativeBinaries(OooO00o oooO00o, File file, String str);

    @InterfaceC0170o00OoOOO
    Integer findSupportedAbi(OooO00o oooO00o, @InterfaceC0169o00OoOO0("[Ljava.lang.String;") String[] strArr);
}
