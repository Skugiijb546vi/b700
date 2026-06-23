package com.ninja.engine;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oO0O0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763oO0O0oOO extends AbstractC0104o000o0o {
    public void OooOO0o() {}
    public int OooO0oo() { return 0; }
    public android.content.IntentFilter OooO0oO() { return new android.content.IntentFilter(); }
    public static final o0O0000O OooO = new o0O0000O(Float.class, "animationFraction", 6);
    public ObjectAnimator OooO0OO;
    public final C0534o0o0O0o OooO0Oo;
    public int OooO0o;
    public final oO0O OooO0o0;
    public boolean OooO0oO;
    public float OooO0oo;

    public C0763oO0O0oOO(oO0O oo0o) {
        super(3);
        this.OooO0o = 1;
        this.OooO0o0 = oo0o;
        this.OooO0Oo = new C0534o0o0O0o(1);
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooO0OO() {
        ObjectAnimator objectAnimator = this.OooO0OO;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOO0() {
        OooOOo();
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOOo() {
        if (this.OooO0OO == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, OooO, 0.0f, 1.0f);
            this.OooO0OO = ofFloat;
            ofFloat.setDuration(333L);
            this.OooO0OO.setInterpolator(null);
            this.OooO0OO.setRepeatCount(-1);
            this.OooO0OO.addListener(new C0200o00o0O(4, this));
        }
        OooOOo();
        this.OooO0OO.start();
    }

    public final void OooOOo() {
        this.OooO0oO = true;
        this.OooO0o = 1;
        Iterator it = ((ArrayList) this.OooO0O0).iterator();
        while (it.hasNext()) {
            C0423o0Oo0Ooo c0423o0Oo0Ooo = (C0423o0Oo0Ooo) it.next();
            oO0O oo0o = this.OooO0o0;
            c0423o0Oo0Ooo.OooO0OO = oo0o.OooO0OO[0];
            c0423o0Oo0Ooo.OooO0Oo = oo0o.OooO0oO / 2;
        }
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOO0(C0291o0O00o0 c0291o0O00o0) {
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOO() {
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOo0() {
    }
}


