package com.ninja.engine;

import android.os.Handler;
import android.os.Looper;
/* renamed from: com.ninja.engine.o0O0Oooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0310o0O0Oooo {
    public static Handler OooO00o(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
