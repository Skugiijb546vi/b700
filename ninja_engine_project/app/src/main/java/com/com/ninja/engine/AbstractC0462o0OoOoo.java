package com.ninja.engine;

import android.graphics.Rect;
import android.view.View;
/* renamed from: com.ninja.engine.o0OoOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0462o0OoOoo {
    public int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public AbstractC0462o0OoOoo(InterfaceC0467o0Ooo00 interfaceC0467o0Ooo00) {
        this.OooO00o = 0;
        this.OooO0OO = new o0OOOO0();
        this.OooO0O0 = interfaceC0467o0Ooo00;
    }

    public static AbstractC0462o0OoOoo OooO00o(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C0974oOOO00oO(abstractC1066oOOo0Oo, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C0974oOOO00oO(abstractC1066oOOo0Oo, 0);
    }

    public abstract int OooO();

    public abstract int OooO0O0(View view);

    public abstract int OooO0OO(View view);

    public abstract int OooO0Oo(View view);

    public abstract int OooO0o();

    public abstract int OooO0o0(View view);

    public abstract int OooO0oO();

    public abstract int OooO0oo();

    public abstract int OooOO0();

    public abstract int OooOO0O();

    public abstract int OooOO0o();

    public abstract int OooOOO(View view);

    public int OooOOO0() {
        if (Integer.MIN_VALUE == this.OooO00o) {
            return 0;
        }
        return OooOO0o() - this.OooO00o;
    }

    public abstract int OooOOOO(View view);

    public abstract void OooOOOo(int i);

    public AbstractC0462o0OoOoo(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo) {
        this.OooO00o = Integer.MIN_VALUE;
        this.OooO0OO = new Rect();
        this.OooO0O0 = abstractC1066oOOo0Oo;
    }
}
