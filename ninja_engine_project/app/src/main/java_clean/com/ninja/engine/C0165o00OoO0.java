package com.ninja.engine;

import com.app.framework.fake.frameworks.BPackageManager;
import com.app.framework.utils.DexCrashPrevention;
import java.io.File;
import java.io.FilenameFilter;
/* renamed from: com.ninja.engine.o00OoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0165o00OoO0 implements FilenameFilter {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0165o00OoO0(int i) {
        this.OooO00o = i;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.OooO00o) {
            case 0:
                return BPackageManager.lambda$findHashBasedApkPath$0(file, str);
            case 1:
                return DexCrashPrevention.lambda$findBaseApkPath$0(file, str);
            default:
                return DexCrashPrevention.lambda$getVirtualAppApkFiles$1(file, str);
        }
    }
}


