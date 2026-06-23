package com.ninja.engine;

import com.app.framework.core.system.user.BUserHandle;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.ninja.engine.o0oOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0570o0oOOoo {
    public static final C0839oO0o0ooO OooO00o = new C0839oO0o0ooO(16);
    public static final ThreadPoolExecutor OooO0O0;
    public static final Object OooO0OO;
    public static final C1218oOoOOoo OooO0Oo;

    /* JADX WARN: Type inference failed for: r9v0, types: [com.ninja.engine.oOOoOoO, java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        Object obj = new Object();
        obj.OooO00o = "fonts-androidx";
        obj.OooO0O0 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) BUserHandle.AID_APP_START, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        OooO0O0 = threadPoolExecutor;
        OooO0OO = new Object();
        OooO0Oo = new C1218oOoOOoo(0);
    }

    public static String OooO00o(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C0557o0o0OoOo) list.get(i2)).OooO0o0);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0052 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:33:0x0052, B:36:0x005b, B:38:0x0061, B:40:0x0067, B:42:0x0074, B:50:0x0095, B:53:0x00a1, B:46:0x007d, B:48:0x0090, B:17:0x0030, B:19:0x0038, B:22:0x003c, B:24:0x0040, B:29:0x004b, B:59:0x00af, B:41:0x006e, B:47:0x008a), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b A[Catch: all -> 0x0019, TRY_ENTER, TryCatch #3 {all -> 0x0019, blocks: (B:3:0x0008, B:5:0x0010, B:10:0x001c, B:11:0x0020, B:33:0x0052, B:36:0x005b, B:38:0x0061, B:40:0x0067, B:42:0x0074, B:50:0x0095, B:53:0x00a1, B:46:0x007d, B:48:0x0090, B:17:0x0030, B:19:0x0038, B:22:0x003c, B:24:0x0040, B:29:0x004b, B:59:0x00af, B:41:0x006e, B:47:0x008a), top: B:66:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0571o0oOOoo0 OooO0O0(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            com.ninja.engine.AbstractC1091oOOoOOOO.OooO00o(r1)
            com.ninja.engine.oO0o0ooO r1 = com.ninja.engine.AbstractC0570o0oOOoo.OooO00o
            java.lang.Object r2 = r1.OooO0o(r8)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1c
            com.ninja.engine.o0oOOoo0 r8 = new com.ninja.engine.o0oOOoo0     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L19:
            r8 = move-exception
            goto Lb9
        L1c:
            com.ninja.engine.o0000oO0 r10 = com.ninja.engine.AbstractC0556o0o0OoOO.OooO00o(r9, r10)     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> Laf
            int r2 = r10.OooO00o     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.lang.Object r10 = r10.OooO0O0
            java.util.List r10 = (java.util.List) r10
            r4 = -3
            if (r2 == 0) goto L30
            if (r2 == r0) goto L2e
        L2c:
            r2 = -3
            goto L50
        L2e:
            r2 = -2
            goto L50
        L30:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            com.ninja.engine.o0oOo0[] r2 = (com.ninja.engine.C0575o0oOo0[]) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L4f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L3c
            goto L4f
        L3c:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            r6 = 0
        L3e:
            if (r6 >= r5) goto L4d
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L19
            int r7 = r7.OooO0o0     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L4b
            if (r7 >= 0) goto L49
            goto L2c
        L49:
            r2 = r7
            goto L50
        L4b:
            int r6 = r6 + r0
            goto L3e
        L4d:
            r2 = 0
            goto L50
        L4f:
            r2 = 1
        L50:
            if (r2 == 0) goto L5b
            com.ninja.engine.o0oOOoo0 r8 = new com.ninja.engine.o0oOOoo0     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L5b:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L19
            if (r2 <= r0) goto L7d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 29
            if (r0 < r2) goto L7d
            com.ninja.engine.oOOoOOOO r0 = com.ninja.engine.AbstractC1367oo000OOO.OooO00o     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            com.ninja.engine.AbstractC1091oOOoOOOO.OooO00o(r0)     // Catch: java.lang.Throwable -> L19
            com.ninja.engine.oOOoOOOO r0 = com.ninja.engine.AbstractC1367oo000OOO.OooO00o     // Catch: java.lang.Throwable -> L78
            android.graphics.Typeface r9 = r0.OooO0oO(r9, r10, r11)     // Catch: java.lang.Throwable -> L78
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            goto L93
        L78:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7d:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            com.ninja.engine.o0oOo0[] r10 = (com.ninja.engine.C0575o0oOo0[]) r10     // Catch: java.lang.Throwable -> L19
            com.ninja.engine.oOOoOOOO r0 = com.ninja.engine.AbstractC1367oo000OOO.OooO00o     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            com.ninja.engine.AbstractC1091oOOoOOOO.OooO00o(r0)     // Catch: java.lang.Throwable -> L19
            com.ninja.engine.oOOoOOOO r0 = com.ninja.engine.AbstractC1367oo000OOO.OooO00o     // Catch: java.lang.Throwable -> Laa
            android.graphics.Typeface r9 = r0.OooO0o(r9, r10, r11)     // Catch: java.lang.Throwable -> Laa
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
        L93:
            if (r9 == 0) goto La1
            r1.OooOO0(r8, r9)     // Catch: java.lang.Throwable -> L19
            com.ninja.engine.o0oOOoo0 r8 = new com.ninja.engine.o0oOOoo0     // Catch: java.lang.Throwable -> L19
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        La1:
            com.ninja.engine.o0oOOoo0 r8 = new com.ninja.engine.o0oOOoo0     // Catch: java.lang.Throwable -> L19
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Laa:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        Laf:
            com.ninja.engine.o0oOOoo0 r8 = new com.ninja.engine.o0oOOoo0     // Catch: java.lang.Throwable -> L19
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Lb9:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0570o0oOOoo.OooO0O0(java.lang.String, android.content.Context, java.util.List, int):com.ninja.engine.o0oOOoo0");
    }
}

