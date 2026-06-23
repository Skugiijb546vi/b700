package com.app.framework.utils.compat;

import android.content.pm.PackageParser;
import android.os.Build;
import android.util.DisplayMetrics;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0194o00o00O0;
import com.ninja.engine.InterfaceC0352o0OO0ooO;
import com.ninja.engine.InterfaceC0446o0OoOOO;
import com.ninja.engine.InterfaceC0674o0ooo0oo;
import com.ninja.engine.InterfaceC0742oO00oOO;
import com.ninja.engine.InterfaceC1289oOooO0;
import com.ninja.engine.InterfaceC2060oooo0O0O;
import com.ninja.engine.OooOOO0;
import com.ninja.engine.oO000OOo;
import java.io.File;
/* loaded from: classes.dex */
public class PackageParserCompat {
    private static final int myUserId = 0;
    public static final int[] GIDS = new int[0];
    private static final int API_LEVEL = Build.VERSION.SDK_INT;

    public static void collectCertificates(PackageParser packageParser, PackageParser.Package r5, int i) {
        if (BuildCompat.isPie()) {
            ((InterfaceC1289oOooO0) C0217o00o0oO0.create(InterfaceC1289oOooO0.class, null, true)).collectCertificates(r5, true);
            return;
        }
        int i2 = API_LEVEL;
        if (i2 >= 24) {
            ((InterfaceC0742oO00oOO) C0217o00o0oO0.create(InterfaceC0742oO00oOO.class, null, true)).collectCertificates(r5, i);
        } else if (i2 >= 23) {
            ((InterfaceC0674o0ooo0oo) C0217o00o0oO0.create(InterfaceC0674o0ooo0oo.class, packageParser, true)).collectCertificates(r5, i);
        } else if (i2 >= 22) {
            ((OooOOO0) C0217o00o0oO0.create(OooOOO0.class, packageParser, true)).collectCertificates(r5, i);
        } else if (i2 >= 21) {
            ((InterfaceC0352o0OO0ooO) C0217o00o0oO0.create(InterfaceC0352o0OO0ooO.class, packageParser, true)).collectCertificates(r5, i);
        } else {
            ((InterfaceC2060oooo0O0O) C0217o00o0oO0.create(InterfaceC2060oooo0O0O.class, packageParser, false)).collectCertificates(r5, i);
        }
    }

    public static PackageParser createParser(File file) {
        int i = API_LEVEL;
        if (i >= 23) {
            return ((oO000OOo) C0217o00o0oO0.create(oO000OOo.class, null, false))._new();
        }
        if (i >= 22) {
            return ((InterfaceC0194o00o00O0) C0217o00o0oO0.create(InterfaceC0194o00o00O0.class, null, false))._new();
        }
        if (i >= 21) {
            return ((InterfaceC0446o0OoOOO) C0217o00o0oO0.create(InterfaceC0446o0OoOOO.class, null, false))._new();
        }
        return null;
    }

    public static PackageParser.Package parsePackage(PackageParser packageParser, File file, int i) {
        int i2 = API_LEVEL;
        return i2 >= 23 ? ((InterfaceC0674o0ooo0oo) C0217o00o0oO0.create(InterfaceC0674o0ooo0oo.class, packageParser, true)).parsePackage(file, i) : i2 >= 22 ? ((OooOOO0) C0217o00o0oO0.create(OooOOO0.class, packageParser, true)).parsePackage(file, i) : i2 >= 21 ? ((InterfaceC0352o0OO0ooO) C0217o00o0oO0.create(InterfaceC0352o0OO0ooO.class, packageParser, true)).parsePackage(file, i) : ((InterfaceC2060oooo0O0O) C0217o00o0oO0.create(InterfaceC2060oooo0O0O.class, packageParser, true)).parsePackage(file, null, new DisplayMetrics(), i);
    }
}


