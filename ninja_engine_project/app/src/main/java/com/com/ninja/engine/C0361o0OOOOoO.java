package com.ninja.engine;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* renamed from: com.ninja.engine.o0OOOOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361o0OOOOoO extends C0455o0OoOo00 {
    @Override // com.ninja.engine.C0455o0OoOo00
    public final Signature[] OooOo0O(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
