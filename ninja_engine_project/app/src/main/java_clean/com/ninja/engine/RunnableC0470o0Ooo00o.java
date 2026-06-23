package com.ninja.engine;

import android.os.Trace;
/* renamed from: com.ninja.engine.o0Ooo00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0470o0Ooo00o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = oo000000.OooO00o;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (C0469o0Ooo00O.OooOO0O != null) {
                C0469o0Ooo00O.OooO00o().OooO0OO();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i2 = oo000000.OooO00o;
            Trace.endSection();
            throw th;
        }
    }
}


