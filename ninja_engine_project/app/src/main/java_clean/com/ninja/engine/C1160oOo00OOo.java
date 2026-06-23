package com.ninja.engine;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.android.volley.toolbox.ImageRequest;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oOo00OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160oOo00OOo extends AbstractC0104o000o0o {
    public static final int[] OooOO0O = {533, 567, 850, 750};
    public static final int[] OooOO0o = {1267, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 333, 0};
    public static final o0O0000O OooOOO0 = new o0O0000O(Float.class, "animationFraction", 7);
    public float OooO;
    public ObjectAnimator OooO0OO;
    public ObjectAnimator OooO0Oo;
    public final oO0O OooO0o;
    public final Interpolator[] OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;
    public C0291o0O00o0 OooOO0;

    public C1160oOo00OOo(Context context, oO0O oo0o) {
        super(2);
        this.OooO0oO = 0;
        this.OooOO0 = null;
        this.OooO0o = oo0o;
        this.OooO0o0 = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
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

    public void OooOO0o() {}
    public int OooO0oo() { return 0; }
    public android.content.IntentFilter OooO0oO() { return new android.content.IntentFilter(); }
    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOO() {
        ObjectAnimator objectAnimator = this.OooO0Oo;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            OooO0OO();
            if (((oO00Oo0) this.OooO00o).isVisible()) {
                this.OooO0Oo.setFloatValues(this.OooO, 1.0f);
                this.OooO0Oo.setDuration((long)((1.0f - this.OooO) * 1800.0f));
                this.OooO0Oo.start();
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOO0(C0291o0O00o0 c0291o0O00o0) {
        this.OooOO0 = c0291o0O00o0;
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOOo() {
        ObjectAnimator objectAnimator = this.OooO0OO;
        o0O0000O o0o0000o = OooOOO0;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, o0o0000o, 0.0f, 1.0f);
            this.OooO0OO = ofFloat;
            ofFloat.setDuration(1800L);
            this.OooO0OO.setInterpolator(null);
            this.OooO0OO.setRepeatCount(-1);
            this.OooO0OO.addListener(new C0764oO0O0oOo(this, 0));
        }
        if (this.OooO0Oo == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, o0o0000o, 1.0f);
            this.OooO0Oo = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.OooO0Oo.setInterpolator(null);
            this.OooO0Oo.addListener(new C0764oO0O0oOo(this, 1));
        }
        OooOOo();
        this.OooO0OO.start();
    }

    public final void OooOOo() {
        this.OooO0oO = 0;
        Iterator it = ((ArrayList) this.OooO0O0).iterator();
        while (it.hasNext()) {
            ((C0423o0Oo0Ooo) it.next()).OooO0OO = this.OooO0o.OooO0OO[0];
        }
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOOo0() {
        this.OooOO0 = null;
    }
}


