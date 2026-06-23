package com.ninja.engine;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/* renamed from: com.ninja.engine.oo00000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class locks.LockC1352oo00000o implements Lock {
    @Override // java.util.concurrent.locks.Lock
    public final Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() {
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
    }
}
