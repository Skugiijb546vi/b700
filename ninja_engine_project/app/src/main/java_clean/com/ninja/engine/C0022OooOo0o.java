package com.ninja.engine;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* renamed from: com.ninja.engine.OooOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022OooOo0o extends AbstractC0809oO0OooOO {
    public final AtomicReferenceFieldUpdater OooOo;
    public final AtomicReferenceFieldUpdater OooOo0;
    public final AtomicReferenceFieldUpdater OooOo0O;
    public final AtomicReferenceFieldUpdater OooOo0o;
    public final AtomicReferenceFieldUpdater OooOoO0;

    public C0022OooOo0o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.OooOo0 = atomicReferenceFieldUpdater;
        this.OooOo0O = atomicReferenceFieldUpdater2;
        this.OooOo0o = atomicReferenceFieldUpdater3;
        this.OooOo = atomicReferenceFieldUpdater4;
        this.OooOoO0 = atomicReferenceFieldUpdater5;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final boolean OooO(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, C0024OooOoO0 c0024OooOoO0, C0024OooOoO0 c0024OooOoO02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.OooOo0o;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0023OooOoO, c0024OooOoO0, c0024OooOoO02)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0023OooOoO) == c0024OooOoO0);
        return false;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final boolean OooO0oO(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, C0021OooOo0O c0021OooOo0O) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0021OooOo0O c0021OooOo0O2 = C0021OooOo0O.OooO0O0;
        do {
            atomicReferenceFieldUpdater = this.OooOo;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0023OooOoO, c0021OooOo0O, c0021OooOo0O2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0023OooOoO) == c0021OooOo0O);
        return false;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final boolean OooO0oo(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.OooOoO0;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractFutureC0023OooOoO, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractFutureC0023OooOoO) == obj);
        return false;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void OoooOo0(C0024OooOoO0 c0024OooOoO0, C0024OooOoO0 c0024OooOoO02) {
        this.OooOo0O.lazySet(c0024OooOoO0, c0024OooOoO02);
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void OoooOoO(C0024OooOoO0 c0024OooOoO0, Thread thread) {
        this.OooOo0.lazySet(c0024OooOoO0, thread);
    }
}


