package com.ninja.engine;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: com.ninja.engine.o0Ooo00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469o0Ooo00O {
    public static final Object OooOO0 = new Object();
    public static volatile C0469o0Ooo00O OooOO0O;
    public final o0OOOO0 OooO;
    public final ReentrantReadWriteLock OooO00o;
    public final C1446oo0O OooO0O0;
    public volatile int OooO0OO;
    public final Handler OooO0Oo;
    public final InterfaceC0467o0Ooo00 OooO0o;
    public final C0463o0OoOoo0 OooO0o0;
    public final C0601o0oOooO0 OooO0oO;
    public final int OooO0oo;

    public C0469o0Ooo00O(C0568o0oOOoOO c0568o0oOOoOO) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.OooO00o = reentrantReadWriteLock;
        this.OooO0OO = 3;
        InterfaceC0467o0Ooo00 interfaceC0467o0Ooo00 = (InterfaceC0467o0Ooo00) c0568o0oOOoOO.OooO0O0;
        this.OooO0o = interfaceC0467o0Ooo00;
        int i = c0568o0oOOoOO.OooO00o;
        this.OooO0oo = i;
        this.OooO = (o0OOOO0) c0568o0oOOoOO.OooO0OO;
        this.OooO0Oo = new Handler(Looper.getMainLooper());
        this.OooO0O0 = new C1446oo0O(0);
        this.OooO0oO = new C0601o0oOooO0(1);
        C0463o0OoOoo0 c0463o0OoOoo0 = new C0463o0OoOoo0(this);
        this.OooO0o0 = c0463o0OoOoo0;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.OooO0OO = 0;
            } catch (Throwable th) {
                this.OooO00o.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (OooO0O0() == 0) {
            try {
                interfaceC0467o0Ooo00.OooO0O0(new C0459o0OoOoO0(c0463o0OoOoo0));
            } catch (Throwable th2) {
                OooO0Oo(th2);
            }
        }
    }

    public static C0469o0Ooo00O OooO00o() {
        C0469o0Ooo00O c0469o0Ooo00O;
        boolean z;
        synchronized (OooOO0) {
            try {
                c0469o0Ooo00O = OooOO0O;
                if (c0469o0Ooo00O != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0469o0Ooo00O;
    }

    public final int OooO0O0() {
        this.OooO00o.readLock().lock();
        try {
            return this.OooO0OO;
        } finally {
            this.OooO00o.readLock().unlock();
        }
    }

    public final void OooO0OO() {
        boolean z;
        if (this.OooO0oo == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (OooO0O0() == 1) {
                return;
            }
            this.OooO00o.writeLock().lock();
            try {
                if (this.OooO0OO == 0) {
                    return;
                }
                this.OooO0OO = 0;
                this.OooO00o.writeLock().unlock();
                C0463o0OoOoo0 c0463o0OoOoo0 = this.OooO0o0;
                C0469o0Ooo00O c0469o0Ooo00O = c0463o0OoOoo0.OooO00o;
                try {
                    c0469o0Ooo00O.OooO0o.OooO0O0(new C0459o0OoOoO0(c0463o0OoOoo0));
                    return;
                } catch (Throwable th) {
                    c0469o0Ooo00O.OooO0Oo(th);
                    return;
                }
            } finally {
                this.OooO00o.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void OooO0Oo(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.OooO00o.writeLock().lock();
        try {
            this.OooO0OO = 2;
            arrayList.addAll(this.OooO0O0);
            this.OooO0O0.clear();
            this.OooO00o.writeLock().unlock();
            this.OooO0Oo.post(new RunnableC0263o00ooO0O(arrayList, this.OooO0OO, th));
        } catch (Throwable th2) {
            this.OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:32:0x0059, B:35:0x005e, B:37:0x0062, B:39:0x006f, B:44:0x008b, B:46:0x0095, B:48:0x0098, B:50:0x009b, B:52:0x00ab, B:53:0x00ae, B:56:0x00bd, B:59:0x00c4, B:61:0x00dd, B:42:0x0081), top: B:80:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:32:0x0059, B:35:0x005e, B:37:0x0062, B:39:0x006f, B:44:0x008b, B:46:0x0095, B:48:0x0098, B:50:0x009b, B:52:0x00ab, B:53:0x00ae, B:56:0x00bd, B:59:0x00c4, B:61:0x00dd, B:42:0x0081), top: B:80:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.ninja.engine.oo00O0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence OooO0o(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0469o0Ooo00O.OooO0o(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void OooO0o0() {
        ArrayList arrayList = new ArrayList();
        this.OooO00o.writeLock().lock();
        try {
            this.OooO0OO = 1;
            arrayList.addAll(this.OooO0O0);
            this.OooO0O0.clear();
            this.OooO00o.writeLock().unlock();
            this.OooO0Oo.post(new RunnableC0263o00ooO0O(arrayList, this.OooO0OO, (Throwable) null));
        } catch (Throwable th) {
            this.OooO00o.writeLock().unlock();
            throw th;
        }
    }

    public final void OooO0oO(AbstractC0468o0Ooo000 abstractC0468o0Ooo000) {
        AbstractC0809oO0OooOO.OooOOO(abstractC0468o0Ooo000, "initCallback cannot be null");
        this.OooO00o.writeLock().lock();
        try {
            if (this.OooO0OO != 1 && this.OooO0OO != 2) {
                this.OooO0O0.add(abstractC0468o0Ooo000);
                this.OooO00o.writeLock().unlock();
            }
            this.OooO0Oo.post(new RunnableC0263o00ooO0O(Arrays.asList(abstractC0468o0Ooo000), this.OooO0OO, (Throwable) null));
            this.OooO00o.writeLock().unlock();
        } catch (Throwable th) {
            this.OooO00o.writeLock().unlock();
            throw th;
        }
    }
}


