package com.ninja.engine;

import com.app.framework.utils.StackTraceFilter;
import java.lang.Thread;
/* renamed from: com.ninja.engine.oOooo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1333oOooo0oO implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceFilter.lambda$install$0(thread, th);
    }
}
