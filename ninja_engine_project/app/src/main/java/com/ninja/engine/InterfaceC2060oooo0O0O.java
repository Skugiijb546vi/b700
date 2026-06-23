package com.ninja.engine;

import android.content.pm.PackageParser;
import android.util.DisplayMetrics;
import java.io.File;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.content.pm.PackageParser")
/* renamed from: com.ninja.engine.oooo0O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2060oooo0O0O {
    @InterfaceC0166o00OoO00
    Method _check_collectCertificates(PackageParser.Package r1, int i);

    @InterfaceC0166o00OoO00
    Method _check_parsePackage(File file, String str, DisplayMetrics displayMetrics, int i);

    Void collectCertificates(PackageParser.Package r1, int i);

    PackageParser.Package parsePackage(File file, String str, DisplayMetrics displayMetrics, int i);
}
