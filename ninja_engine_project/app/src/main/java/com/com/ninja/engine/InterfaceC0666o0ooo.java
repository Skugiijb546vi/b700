package com.ninja.engine;

import android.content.pm.PackageParser;
import java.io.File;
@InterfaceC0158o00Oo0O0("android.content.pm.PackageParser")
/* renamed from: com.ninja.engine.o0ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0666o0ooo {
    @InterfaceC0159o00Oo0Oo
    PackageParser _new();

    @InterfaceC0153o00Oo
    void collectCertificates(PackageParser.Package r1, int i);

    @InterfaceC0153o00Oo
    PackageParser.Package parsePackage(File file, int i);
}
