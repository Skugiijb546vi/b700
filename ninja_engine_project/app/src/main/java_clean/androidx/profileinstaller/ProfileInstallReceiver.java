package androidx.profileinstaller;

import android.content.BroadcastReceiver;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
        if (r6 == 23) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r6.getAction()
            java.lang.String r1 = "androidx.profileinstaller.action.INSTALL_PROFILE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            com.ninja.engine.oOOOOo0O r6 = new com.ninja.engine.oOOOOo0O
            r6.<init>()
            com.ninja.engine.o00O r0 = new com.ninja.engine.o00O
            r1 = 20
            r0.<init>(r1, r4)
            r1 = 1
            com.ninja.engine.AbstractC0809oO0OooOO.o0OOO0o(r5, r6, r0, r1)
            goto Lec
        L21:
            java.lang.String r1 = "androidx.profileinstaller.action.SKIP_FILE"
            boolean r1 = r1.equals(r0)
            r2 = 10
            if (r1 == 0) goto L7f
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto Lec
            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "WRITE_SKIP_FILE"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L62
            android.content.Context r6 = r5.getApplicationContext()
            java.lang.String r6 = r6.getPackageName()
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r1 = 0
            android.content.pm.PackageInfo r6 = r0.getPackageInfo(r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            java.io.File r5 = r5.getFilesDir()
            com.ninja.engine.AbstractC0809oO0OooOO.OoooO(r6, r5)
            r4.setResultCode(r2)
            goto Lec
        L5c:
            r5 = 7
            r4.setResultCode(r5)
            goto Lec
        L62:
            java.lang.String r0 = "DELETE_SKIP_FILE"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto Lec
            java.io.File r5 = r5.getFilesDir()
            java.io.File r6 = new java.io.File
            java.lang.String r0 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r6.<init>(r5, r0)
            r6.delete()
            r5 = 11
            r4.setResultCode(r5)
            goto Lec
        L7f:
            java.lang.String r1 = "androidx.profileinstaller.action.SAVE_PROFILE"
            boolean r1 = r1.equals(r0)
            r3 = 24
            if (r1 == 0) goto L9d
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r3) goto L9a
            int r5 = android.os.Process.myPid()
            android.os.Process.sendSignal(r5, r2)
            r5 = 12
        L96:
            r4.setResultCode(r5)
            goto Lec
        L9a:
            r5 = 13
            goto L96
        L9d:
            java.lang.String r1 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lec
            android.os.Bundle r6 = r6.getExtras()
            if (r6 == 0) goto Lec
            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "DROP_SHADER_CACHE"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto Le7
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r6 < r0) goto Lc8
            android.content.Context r5 = com.ninja.engine.AbstractC0031Oooo00O.OooO0O0(r5)
        Lc3:
            java.io.File r5 = r5.getCacheDir()
            goto Ld8
        Lc8:
            if (r6 < r3) goto Ld3
            android.content.Context r5 = com.ninja.engine.AbstractC0031Oooo00O.OooO0O0(r5)
        Lce:
            java.io.File r5 = r5.getCodeCacheDir()
            goto Ld8
        Ld3:
            r0 = 23
            if (r6 != r0) goto Lc3
            goto Lce
        Ld8:
            boolean r5 = com.ninja.engine.AbstractC0694o0ooooo0.OooOOoo(r5)
            if (r5 == 0) goto Le4
            r5 = 14
        Le0:
            r4.setResultCode(r5)
            goto Lec
        Le4:
            r5 = 15
            goto Le0
        Le7:
            r5 = 16
            r4.setResultCode(r5)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileInstallReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}


