package com.ninja.engine;

import android.content.pm.PackageParser;
import java.io.File;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.content.pm.PackageParser")
/* loaded from: classes.dex */
public interface OooOOO0 {
    @InterfaceC0166o00OoO00
    Method _check_collectCertificates(PackageParser.Package r1, int i);

    @InterfaceC0166o00OoO00
    Method _check_parsePackage(File file, int i);

    Void collectCertificates(PackageParser.Package r1, int i);

    PackageParser.Package parsePackage(File file, int i);
}
