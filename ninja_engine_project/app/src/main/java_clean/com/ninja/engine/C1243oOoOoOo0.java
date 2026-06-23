package com.ninja.engine;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOoOoOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243oOoOoOo0 {
    public final ArrayList OooO;
    public float OooO00o;
    public float OooO0O0;
    public boolean OooO0OO;
    public final Object OooO0Oo;
    public boolean OooO0o;
    public final AbstractC0809oO0OooOO OooO0o0;
    public long OooO0oO;
    public final float OooO0oo;
    public final ArrayList OooOO0;
    public C1242oOoOoOo OooOO0O;
    public float OooOO0o;
    public boolean OooOOO0;
    public static final C0560o0oO0O00 OooOOO = new C0560o0oO0O00(1);
    public static final C0560o0oO0O00 OooOOOO = new C0560o0oO0O00(2);
    public static final C0560o0oO0O00 OooOOOo = new C0560o0oO0O00(3);
    public static final C0560o0oO0O00 OooOOo0 = new C0560o0oO0O00(4);
    public static final C0560o0oO0O00 OooOOo = new C0560o0oO0O00(5);
    public static final C0560o0oO0O00 OooOOoo = new C0560o0oO0O00(0);

    public C1243oOoOoOo0(Object obj) {
        float f;
        C0378o0OOo0O c0378o0OOo0O = C0380o0OOo0OO.OooOOo0;
        this.OooO00o = 0.0f;
        this.OooO0O0 = Float.MAX_VALUE;
        this.OooO0OO = false;
        this.OooO0o = false;
        this.OooO0oO = 0L;
        this.OooO = new ArrayList();
        this.OooOO0 = new ArrayList();
        this.OooO0Oo = obj;
        this.OooO0o0 = c0378o0OOo0O;
        if (c0378o0OOo0O != OooOOOo && c0378o0OOo0O != OooOOo0 && c0378o0OOo0O != OooOOo) {
            if (c0378o0OOo0O == OooOOoo || c0378o0OOo0O == OooOOO || c0378o0OOo0O == OooOOOO) {
                this.OooO0oo = 0.00390625f;
                this.OooOO0O = null;
                this.OooOO0o = Float.MAX_VALUE;
                this.OooOOO0 = false;
            }
            f = 1.0f;
        } else {
            f = 0.1f;
        }
        this.OooO0oo = f;
        this.OooOO0O = null;
        this.OooOO0o = Float.MAX_VALUE;
        this.OooOOO0 = false;
    }

    public final void OooO00o(float f) {
        this.OooO0o0.o00Oo0(this.OooO0Oo, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooOO0;
            if (i < arrayList.size()) {
                if (arrayList.get(i) == null) {
                    i++;
                } else {
                    AbstractC1230oOoOo0o.OooOO0O(arrayList.get(i));
                    throw null;
                }
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void OooO0O0() {
        if (this.OooOO0O.OooO0O0 > 0.0d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.OooO0o) {
                    this.OooOOO0 = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}


