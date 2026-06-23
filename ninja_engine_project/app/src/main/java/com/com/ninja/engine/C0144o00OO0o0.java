package com.ninja.engine;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
/* renamed from: com.ninja.engine.o00OO0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144o00OO0o0 implements Iterator, Map.Entry {
    public int OooO00o;
    public int OooO0O0 = -1;
    public boolean OooO0OO;
    public final /* synthetic */ C0145o00OO0oO OooO0Oo;

    public C0144o00OO0o0(C0145o00OO0oO c0145o00OO0oO) {
        this.OooO0Oo = c0145o00OO0oO;
        this.OooO00o = c0145o00OO0oO.OooO0OO - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.OooO0OO) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.OooO0O0;
            C0145o00OO0oO c0145o00OO0oO = this.OooO0Oo;
            if (!AbstractC0809oO0OooOO.OooO0o0(key, c0145o00OO0oO.OooO0o(i)) || !AbstractC0809oO0OooOO.OooO0o0(entry.getValue(), c0145o00OO0oO.OooOO0(this.OooO0O0))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.OooO0OO) {
            return this.OooO0Oo.OooO0o(this.OooO0O0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.OooO0OO) {
            return this.OooO0Oo.OooOO0(this.OooO0O0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.OooO0O0 < this.OooO00o) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.OooO0OO) {
            int i = this.OooO0O0;
            C0145o00OO0oO c0145o00OO0oO = this.OooO0Oo;
            Object OooO0o = c0145o00OO0oO.OooO0o(i);
            Object OooOO0 = c0145o00OO0oO.OooOO0(this.OooO0O0);
            int i2 = 0;
            if (OooO0o == null) {
                hashCode = 0;
            } else {
                hashCode = OooO0o.hashCode();
            }
            if (OooOO0 != null) {
                i2 = OooOO0.hashCode();
            }
            return hashCode ^ i2;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.OooO0O0++;
            this.OooO0OO = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.OooO0OO) {
            this.OooO0Oo.OooO0oo(this.OooO0O0);
            this.OooO0O0--;
            this.OooO00o--;
            this.OooO0OO = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.OooO0OO) {
            return this.OooO0Oo.OooO(this.OooO0O0, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
