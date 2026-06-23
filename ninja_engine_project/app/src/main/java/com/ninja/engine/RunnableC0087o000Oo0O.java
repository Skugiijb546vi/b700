package com.ninja.engine;

import android.content.Context;
/* renamed from: com.ninja.engine.o000Oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0087o000Oo0O implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Context OooO0O0;

    public /* synthetic */ RunnableC0087o000Oo0O(Context context, int i) {
        this.OooO00o = i;
        this.OooO0O0 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.OooO00o
            switch(r0) {
                case 0: goto L36;
                case 1: goto L30;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            com.ninja.engine.oOOOOo0O r0 = new com.ninja.engine.oOOOOo0O
            r0.<init>()
            com.ninja.engine.oOO00oOo r1 = com.ninja.engine.AbstractC0809oO0OooOO.OooO0oo
            r2 = 0
            android.content.Context r3 = r11.OooO0O0
            com.ninja.engine.AbstractC0809oO0OooOO.o0OOO0o(r3, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            com.ninja.engine.o000Oo0O r1 = new com.ninja.engine.o000Oo0O
            android.content.Context r2 = r11.OooO0O0
            r3 = 3
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L30:
            android.content.Context r0 = r11.OooO0O0
            com.app.framework.BlackBoxCore.OooO0O0(r0)
            return
        L36:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb6
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.OooO0O0
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto Lb6
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L8f
            com.ninja.engine.oo0O r0 = com.ninja.engine.AbstractC0094o000OooO.OooO0oO
            r0.getClass()
            com.ninja.engine.o00OO0O r2 = new com.ninja.engine.o00OO0O
            r2.<init>(r0)
        L5e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            com.ninja.engine.o000OooO r0 = (com.ninja.engine.AbstractC0094o000OooO) r0
            if (r0 == 0) goto L5e
            com.ninja.engine.o000oOoo r0 = (com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo) r0
            android.content.Context r0 = r0.OooOO0O
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L7e
        L7d:
            r0 = 0
        L7e:
            if (r0 == 0) goto L94
            android.os.LocaleList r0 = com.ninja.engine.AbstractC0085o000Oo.OooO00o(r0)
            com.ninja.engine.oO0OoOO r2 = new com.ninja.engine.oO0OoOO
            com.ninja.engine.oO0OooO r6 = new com.ninja.engine.oO0OooO
            r6.<init>(r0)
            r2.<init>(r6)
            goto L96
        L8f:
            com.ninja.engine.oO0OoOO r2 = com.ninja.engine.AbstractC0094o000OooO.OooO0OO
            if (r2 == 0) goto L94
            goto L96
        L94:
            com.ninja.engine.oO0OoOO r2 = com.ninja.engine.C0798oO0OoOO.OooO0O0
        L96:
            com.ninja.engine.oO0Ooo r0 = r2.OooO00o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laf
            java.lang.String r0 = com.ninja.engine.AbstractC0694o0ooooo0.Oooo0o(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto Laf
            android.os.LocaleList r0 = com.ninja.engine.AbstractC0088o000Oo0o.OooO00o(r0)
            com.ninja.engine.AbstractC0085o000Oo.OooO0O0(r2, r0)
        Laf:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb6:
            com.ninja.engine.AbstractC0094o000OooO.OooO0o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.RunnableC0087o000Oo0O.run():void");
    }
}
