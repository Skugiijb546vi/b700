package com.app.framework.utils;

import com.app.framework.utils.DexFileRecovery;
import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$attemptRecovery$0;
        lambda$attemptRecovery$0 = DexFileRecovery.SystemApkStrategy.lambda$attemptRecovery$0(file, str);
        return lambda$attemptRecovery$0;
    }
}


