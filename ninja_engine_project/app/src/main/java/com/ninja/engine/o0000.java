package com.ninja.engine;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class o0000 {
    public static final Class OooO00o;
    public static final Field OooO0O0;
    public static final Field OooO0OO;
    public static final Method OooO0Oo;
    public static final Method OooO0o;
    public static final Method OooO0o0;
    public static final Handler OooO0oO;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0017
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            r0 = 3
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r2 = 2
            r3 = 0
            r4 = 1
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r6.<init>(r7)
            com.ninja.engine.o0000.OooO0oO = r6
            r6 = 0
            java.lang.Class<android.app.ActivityThread> r7 = android.app.ActivityThread.class
            goto L18
        L17:
            r7 = r6
        L18:
            com.ninja.engine.o0000.OooO00o = r7
            java.lang.String r7 = "mMainThread"
            java.lang.reflect.Field r7 = r5.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L24
            r7.setAccessible(r4)     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
            r7 = r6
        L25:
            com.ninja.engine.o0000.OooO0O0 = r7
            java.lang.String r7 = "mToken"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L31
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L31
            goto L32
        L31:
            r5 = r6
        L32:
            com.ninja.engine.o0000.OooO0OO = r5
            java.lang.Class r5 = com.ninja.engine.o0000.OooO00o
            java.lang.String r7 = "performStopActivity"
            if (r5 != 0) goto L3c
        L3a:
            r5 = r6
            goto L4f
        L3c:
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3a
            r8[r3] = r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3a
            r8[r4] = r9     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r2] = r9     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L3a
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L3a
        L4f:
            com.ninja.engine.o0000.OooO0Oo = r5
            java.lang.Class r5 = com.ninja.engine.o0000.OooO00o
            if (r5 != 0) goto L57
        L55:
            r5 = r6
            goto L66
        L57:
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L55
            r8[r3] = r1     // Catch: java.lang.Throwable -> L55
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L55
            r8[r4] = r9     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> L55
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L55
        L66:
            com.ninja.engine.o0000.OooO0o0 = r5
            java.lang.Class r5 = com.ninja.engine.o0000.OooO00o
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 == r8) goto L74
            r8 = 27
            if (r7 != r8) goto La5
        L74:
            if (r5 != 0) goto L77
            goto La5
        L77:
            java.lang.String r7 = "requestRelaunchActivity"
            r8 = 9
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.Throwable -> La5
            r8[r3] = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r8[r4] = r1     // Catch: java.lang.Throwable -> La5
            r8[r2] = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> La5
            r8[r0] = r1     // Catch: java.lang.Throwable -> La5
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> La5
            r1 = 4
            r8[r1] = r0     // Catch: java.lang.Throwable -> La5
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r2 = 5
            r8[r2] = r1     // Catch: java.lang.Throwable -> La5
            r2 = 6
            r8[r2] = r1     // Catch: java.lang.Throwable -> La5
            r1 = 7
            r8[r1] = r0     // Catch: java.lang.Throwable -> La5
            r1 = 8
            r8[r1] = r0     // Catch: java.lang.Throwable -> La5
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r7, r8)     // Catch: java.lang.Throwable -> La5
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> La5
            r6 = r0
        La5:
            com.ninja.engine.o0000.OooO0o = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0000.<clinit>():void");
    }
}
