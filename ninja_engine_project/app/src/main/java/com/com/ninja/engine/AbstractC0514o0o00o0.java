package com.ninja.engine;

import android.system.Os;
import java.io.FileDescriptor;
/* renamed from: com.ninja.engine.o0o00o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0514o0o00o0 {
    public static void OooO00o(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor OooO0O0(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long OooO0OO(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }
}
