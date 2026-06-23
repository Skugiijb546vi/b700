package com.ninja.engine;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.ninja.engine.OooOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0023OooOoO implements Future {
    public static final AbstractC0809oO0OooOO OooO0o;
    public static final Object OooO0oO;
    public volatile Object OooO00o;
    public volatile C0021OooOo0O OooO0O0;
    public volatile C0024OooOoO0 OooO0OO;
    public static final boolean OooO0Oo = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger OooO0o0 = Logger.getLogger(AbstractFutureC0023OooOoO.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.ninja.engine.oO0OooOO] */
    /* JADX WARN: Type inference failed for: r4v6 */
    static {
        C0022OooOo0o c0022OooOo0o;
        try {
            th = null;
            c0022OooOo0o = new C0022OooOo0o(AtomicReferenceFieldUpdater.newUpdater(C0024OooOoO0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(C0024OooOoO0.class, C0024OooOoO0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0023OooOoO.class, C0024OooOoO0.class, "OooO0OO"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0023OooOoO.class, C0021OooOo0O.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0023OooOoO.class, Object.class, "OooO00o"));
        } catch (Throwable th) {
            th = th;
            c0022OooOo0o = new Object();
        }
        OooO0o = c0022OooOo0o;
        if (th != null) {
            OooO0o0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        OooO0oO = new Object();
    }

    public static void OooO0O0(AbstractFutureC0023OooOoO abstractFutureC0023OooOoO) {
        C0024OooOoO0 c0024OooOoO0;
        C0021OooOo0O c0021OooOo0O;
        do {
            c0024OooOoO0 = abstractFutureC0023OooOoO.OooO0OO;
        } while (!OooO0o.OooO(abstractFutureC0023OooOoO, c0024OooOoO0, C0024OooOoO0.OooO0OO));
        while (c0024OooOoO0 != null) {
            Thread thread = c0024OooOoO0.OooO00o;
            if (thread != null) {
                c0024OooOoO0.OooO00o = null;
                LockSupport.unpark(thread);
            }
            c0024OooOoO0 = c0024OooOoO0.OooO0O0;
        }
        do {
            c0021OooOo0O = abstractFutureC0023OooOoO.OooO0O0;
        } while (!OooO0o.OooO0oO(abstractFutureC0023OooOoO, c0021OooOo0O));
        C0021OooOo0O c0021OooOo0O2 = null;
        while (c0021OooOo0O != null) {
            C0021OooOo0O c0021OooOo0O3 = c0021OooOo0O.OooO00o;
            c0021OooOo0O.OooO00o = c0021OooOo0O2;
            c0021OooOo0O2 = c0021OooOo0O;
            c0021OooOo0O = c0021OooOo0O3;
        }
        while (c0021OooOo0O2 != null) {
            c0021OooOo0O2 = c0021OooOo0O2.OooO00o;
            try {
                throw null;
                break;
            } catch (RuntimeException e) {
                OooO0o0.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object OooO0OO(Object obj) {
        if (!(obj instanceof OooOo00)) {
            if (!(obj instanceof AbstractC0020OooOo0)) {
                if (obj == OooO0oO) {
                    return null;
                }
                return obj;
            }
            ((AbstractC0020OooOo0) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((OooOo00) obj).OooO00o;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final void OooO00o(StringBuilder sb) {
        Object obj;
        String valueOf;
        String str = "]";
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append(str);
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public final void OooO0Oo(C0024OooOoO0 c0024OooOoO0) {
        c0024OooOoO0.OooO00o = null;
        while (true) {
            C0024OooOoO0 c0024OooOoO02 = this.OooO0OO;
            if (c0024OooOoO02 == C0024OooOoO0.OooO0OO) {
                return;
            }
            C0024OooOoO0 c0024OooOoO03 = null;
            while (c0024OooOoO02 != null) {
                C0024OooOoO0 c0024OooOoO04 = c0024OooOoO02.OooO0O0;
                if (c0024OooOoO02.OooO00o != null) {
                    c0024OooOoO03 = c0024OooOoO02;
                } else if (c0024OooOoO03 != null) {
                    c0024OooOoO03.OooO0O0 = c0024OooOoO04;
                    if (c0024OooOoO03.OooO00o == null) {
                        break;
                    }
                } else if (!OooO0o.OooO(this, c0024OooOoO02, c0024OooOoO04)) {
                    break;
                }
                c0024OooOoO02 = c0024OooOoO04;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        OooOo00 oooOo00;
        Object obj = this.OooO00o;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (OooO0Oo) {
                oooOo00 = new OooOo00(z, new CancellationException("Future.cancel() was called."));
            } else if (z) {
                oooOo00 = OooOo00.OooO0O0;
            } else {
                oooOo00 = OooOo00.OooO0OO;
            }
            if (OooO0o.OooO0oo(this, obj, oooOo00)) {
                OooO0O0(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.OooO00o;
        if ((obj2 != null) && true) {
            return OooO0OO(obj2);
        }
        C0024OooOoO0 c0024OooOoO0 = this.OooO0OO;
        C0024OooOoO0 c0024OooOoO02 = C0024OooOoO0.OooO0OO;
        if (c0024OooOoO0 != c0024OooOoO02) {
            C0024OooOoO0 c0024OooOoO03 = new C0024OooOoO0();
            do {
                AbstractC0809oO0OooOO abstractC0809oO0OooOO = OooO0o;
                abstractC0809oO0OooOO.OoooOo0(c0024OooOoO03, c0024OooOoO0);
                if (abstractC0809oO0OooOO.OooO(this, c0024OooOoO0, c0024OooOoO03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            OooO0Oo(c0024OooOoO03);
                            throw new InterruptedException();
                        }
                        obj = this.OooO00o;
                    } while (!((obj != null) & true));
                    return OooO0OO(obj);
                }
                c0024OooOoO0 = this.OooO0OO;
            } while (c0024OooOoO0 != c0024OooOoO02);
            return OooO0OO(this.OooO00o);
        }
        return OooO0OO(this.OooO00o);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.OooO00o instanceof OooOo00;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.OooO00o != null) {
            z = true;
        } else {
            z = false;
        }
        return z & true;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.OooO00o instanceof OooOo00) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    if (this instanceof ScheduledFuture) {
                        str = "remaining delay=[" + this.getDelay(TimeUnit.MILLISECONDS) + " ms]";
                    } else {
                        str = null;
                    }
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            OooO00o(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractFutureC0023OooOoO.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}



