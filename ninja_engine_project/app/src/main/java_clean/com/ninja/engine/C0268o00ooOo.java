package com.ninja.engine;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
/* renamed from: com.ninja.engine.o00ooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268o00ooOo extends oO0OO00 {
    public final /* synthetic */ int OooOOOo;
    public final /* synthetic */ Object OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0268o00ooOo(Object obj, Context context, int i) {
        super(context);
        this.OooOOOo = i;
        this.OooOOo0 = obj;
    }

    @Override // com.ninja.engine.oO0OO00
    public int OooO0O0(View view, int i) {
        switch (this.OooOOOo) {
            case 0:
                ((CarouselLayoutManager) this.OooOOo0).getClass();
                return 0;
            default:
                return super.OooO0O0(view, i);
        }
    }

    @Override // com.ninja.engine.oO0OO00
    public int OooO0OO(View view, int i) {
        switch (this.OooOOOo) {
            case 0:
                ((CarouselLayoutManager) this.OooOOo0).getClass();
                return 0;
            default:
                return super.OooO0OO(view, i);
        }
    }

    @Override // com.ninja.engine.oO0OO00
    public float OooO0Oo(DisplayMetrics displayMetrics) {
        switch (this.OooOOOo) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.OooO0Oo(displayMetrics);
        }
    }

    @Override // com.ninja.engine.oO0OO00
    public PointF OooO0o(int i) {
        switch (this.OooOOOo) {
            case 0:
                return ((CarouselLayoutManager) this.OooOOo0).OooO00o(i);
            default:
                return super.OooO0o(i);
        }
    }

    @Override // com.ninja.engine.oO0OO00
    public int OooO0o0(int i) {
        switch (this.OooOOOo) {
            case 1:
                return Math.min(100, super.OooO0o0(i));
            default:
                return super.OooO0o0(i);
        }
    }

    @Override // com.ninja.engine.oO0OO00
    public void OooO0oo(View view, C1077oOOo0oOo c1077oOOo0oOo) {
        switch (this.OooOOOo) {
            case 1:
                C1001oOOOOO c1001oOOOOO = (C1001oOOOOO) this.OooOOo0;
                int[] OooO00o = c1001oOOOOO.OooO00o(c1001oOOOOO.OooO00o.getLayoutManager(), view);
                int i = OooO00o[0];
                int i2 = OooO00o[1];
                int ceil = (int) Math.ceil(OooO0o0(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.OooO;
                    c1077oOOo0oOo.OooO00o = i;
                    c1077oOOo0oOo.OooO0O0 = i2;
                    c1077oOOo0oOo.OooO0OO = ceil;
                    c1077oOOo0oOo.OooO0o0 = decelerateInterpolator;
                    c1077oOOo0oOo.OooO0o = true;
                    return;
                }
                return;
            default:
                super.OooO0oo(view, c1077oOOo0oOo);
                return;
        }
    }
}


