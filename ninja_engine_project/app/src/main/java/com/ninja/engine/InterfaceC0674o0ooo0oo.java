package com.ninja.engine;

import android.content.pm.PackageParser;
import java.io.File;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.content.pm.PackageParser")
/* renamed from: com.ninja.engine.o0ooo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0674o0ooo0oo {
    @InterfaceC0166o00OoO00
    Method _check_collectCertificates(PackageParser.Package r1, int i);

    @InterfaceC0166o00OoO00
    Method _check_parsePackage(File file, int i);

    Void collectCertificates(PackageParser.Package r1, int i);

    PackageParser.Package parsePackage(File file, int i);
}
