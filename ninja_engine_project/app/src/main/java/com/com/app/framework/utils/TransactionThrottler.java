package com.app.framework.utils;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class TransactionThrottler {
    private static final int MAX_FAILURES_PER_WINDOW = 50;
    private static final String TAG = "TransactionThrottler";
    private static final long THROTTLE_DURATION_MS = 1000;
    private static final long WINDOW_DURATION_MS = 15000;
    private final AtomicInteger failureCount = new AtomicInteger(0);
    private final AtomicLong windowStartTime = new AtomicLong(0);
    private final AtomicLong lastThrottleTime = new AtomicLong(0);

    public int getFailureCount() {
        return this.failureCount.get();
    }

    public void recordFailure() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.windowStartTime.get();
        if (j == 0) {
            this.windowStartTime.set(currentTimeMillis);
        }
        if (currentTimeMillis - j > WINDOW_DURATION_MS) {
            this.failureCount.set(1);
            this.windowStartTime.set(currentTimeMillis);
        } else {
            this.failureCount.incrementAndGet();
        }
        this.failureCount.get();
    }

    public void reset() {
        this.failureCount.set(0);
        this.windowStartTime.set(0L);
        this.lastThrottleTime.set(0L);
    }

    public boolean shouldThrottle() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.windowStartTime.get() > WINDOW_DURATION_MS) {
            this.failureCount.set(0);
            this.windowStartTime.set(currentTimeMillis);
            return false;
        } else if (currentTimeMillis - this.lastThrottleTime.get() < 1000) {
            return true;
        } else {
            if (this.failureCount.get() >= 50) {
                this.lastThrottleTime.set(currentTimeMillis);
                this.failureCount.get();
                return true;
            }
            return false;
        }
    }
}
