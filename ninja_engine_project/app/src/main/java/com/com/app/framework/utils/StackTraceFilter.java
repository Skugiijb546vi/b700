package com.app.framework.utils;

import java.util.Arrays;
import java.util.stream.Stream;
/* loaded from: classes.dex */
public class StackTraceFilter {
    static {
        install();
    }

    public static /* synthetic */ boolean OooO0O0(StackTraceElement stackTraceElement) {
        return lambda$filterStackTrace$1(stackTraceElement);
    }

    public static /* synthetic */ StackTraceElement[] OooO0OO(int i) {
        return lambda$filterStackTrace$2(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOoOoOoo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.ooOOO0oO, java.lang.Object] */
    private static StackTraceElement[] filterStackTrace(StackTraceElement[] stackTraceElementArr) {
        Stream stream;
        Stream filter;
        Object[] array;
        stream = Arrays.stream(stackTraceElementArr);
        filter = stream.filter(new Object());
        array = filter.toArray(new Object());
        return (StackTraceElement[]) array;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public static void install() {
        try {
            Thread.setDefaultUncaughtExceptionHandler(new Object());
        } catch (Throwable unused) {
        }
    }

    private static boolean isSuspicious(String str) {
        return str.toLowerCase().contains("xposed") || str.toLowerCase().contains("epic") || str.toLowerCase().contains("virtual") || str.toLowerCase().contains("blackbox") || str.toLowerCase().contains("hook");
    }

    public static /* synthetic */ boolean lambda$filterStackTrace$1(StackTraceElement stackTraceElement) {
        return !isSuspicious(stackTraceElement.getClassName());
    }

    public static /* synthetic */ StackTraceElement[] lambda$filterStackTrace$2(int i) {
        return new StackTraceElement[i];
    }

    public static /* synthetic */ void lambda$install$0(Thread thread, Throwable th) {
        th.setStackTrace(filterStackTrace(th.getStackTrace()));
    }
}
