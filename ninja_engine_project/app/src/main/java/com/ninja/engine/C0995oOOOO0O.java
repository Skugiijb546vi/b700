package com.ninja.engine;
/* renamed from: com.ninja.engine.oOOOO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0995oOOOO0O implements oOOOO0O0 {
    public final Object[] OooO00o;
    public int OooO0O0;

    public C0995oOOOO0O() {
        this.OooO00o = new Object[256];
    }

    @Override // com.ninja.engine.oOOOO0O0
    public Object OooO() {
        int i = this.OooO0O0;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.OooO00o;
        Object obj = objArr[i2];
        AbstractC0809oO0OooOO.OooOOO0(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.OooO0O0--;
        return obj;
    }

    public void OooO00o(Object obj) {
        int i = this.OooO0O0;
        Object[] objArr = this.OooO00o;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.OooO0O0 = i + 1;
        }
    }

    @Override // com.ninja.engine.oOOOO0O0
    public boolean OooO0OO(Object obj) {
        Object[] objArr;
        boolean z;
        AbstractC0809oO0OooOO.OooOOOo(obj, "instance");
        int i = this.OooO0O0;
        int i2 = 0;
        while (true) {
            objArr = this.OooO00o;
            if (i2 < i) {
                if (objArr[i2] == obj) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            int i3 = this.OooO0O0;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = obj;
            this.OooO0O0 = i3 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!".toString());
    }

    public C0995oOOOO0O(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.OooO00o = new Object[i];
    }
}
