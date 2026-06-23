package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1066oOOo0Oo;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1794ooOOOOoO;
import com.ninja.engine.C0268o00ooOo;
import com.ninja.engine.C0270o00ooOoO;
import com.ninja.engine.C0271o00ooOoo;
import com.ninja.engine.C0437o0OoO0OO;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C1068oOOo0OoO;
import com.ninja.engine.C1070oOOo0o;
import com.ninja.engine.C1080oOOoO0O;
import com.ninja.engine.InterfaceC1078oOOo0oo0;
import com.ninja.engine.R;
import java.util.List;
/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1066oOOo0Oo implements InterfaceC1078oOOo0oo0 {
    public final C0437o0OoO0OO OooOOOo;
    public final View.OnLayoutChangeListener OooOOo;
    public C0271o00ooOoo OooOOo0;

    public CarouselLayoutManager() {
        C0437o0OoO0OO c0437o0OoO0OO = new C0437o0OoO0OO();
        new C0270o00ooOoO();
        this.OooOOo = new View.OnLayoutChangeListener() { // from class: com.ninja.engine.o00ooOo0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new RunnableC0061o00000oO(4, carouselLayoutManager));
                }
            }
        };
        this.OooOOOo = c0437o0OoO0OO;
        o00O0O();
        o00000(0);
    }

    public static C0455o0OoOo00 o000000(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((AbstractC1794ooOOOOoO) list.get(i5)).getClass();
            float abs = Math.abs(0.0f - f);
            if (0.0f <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (0.0f > f && abs <= f3) {
                i3 = i5;
                f3 = abs;
            }
            if (0.0f <= f4) {
                i2 = i5;
                f4 = 0.0f;
            }
            if (0.0f > f5) {
                i4 = i5;
                f5 = 0.0f;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C0455o0OoOo00((AbstractC1794ooOOOOoO) list.get(i), (AbstractC1794ooOOOOoO) list.get(i3));
    }

    @Override // com.ninja.engine.InterfaceC1078oOOo0oo0
    public final PointF OooO00o(int i) {
        return null;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0Oo() {
        return o000000O();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0o0() {
        return !o000000O();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0(C1080oOOoO0O c1080oOOoO0O) {
        OooOo0O();
        return 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0O(C1080oOOoO0O c1080oOOoO0O) {
        return 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0o(C1080oOOoO0O c1080oOOoO0O) {
        return 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOO(C1080oOOoO0O c1080oOOoO0O) {
        return 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOO0(C1080oOOoO0O c1080oOOoO0O) {
        OooOo0O();
        return 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOOO(C1080oOOoO0O c1080oOOoO0O) {
        return 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOOo() {
        return new C1068oOOo0OoO(-2, -2);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooOoO0(View view, Rect rect) {
        super.OooOoO0(view, rect);
        rect.centerY();
        if (o000000O()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean Oooo0o0() {
        return true;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO(AccessibilityEvent accessibilityEvent) {
        super.OoooO(accessibilityEvent);
        if (OooOo0O() > 0) {
            accessibilityEvent.setFromIndex(AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0)));
            accessibilityEvent.setToIndex(AbstractC1066oOOo0Oo.Oooo00o(OooOo0(OooOo0O() - 1)));
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.OooOOo);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO00(RecyclerView recyclerView) {
        C0437o0OoO0OO c0437o0OoO0OO = this.OooOOOo;
        Context context = recyclerView.getContext();
        float f = c0437o0OoO0OO.OooO00o;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0437o0OoO0OO.OooO00o = f;
        float f2 = c0437o0OoO0OO.OooO0O0;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0437o0OoO0OO.OooO0O0 = f2;
        Oooooo0();
        recyclerView.addOnLayoutChangeListener(this.OooOOo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
        if (r10 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
        if (o000000o() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        if (r10 == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (o000000o() != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View OoooO0O(android.view.View r7, int r8, com.ninja.engine.C1070oOOo0o r9, com.ninja.engine.C1080oOOoO0O r10) {
        /*
            r6 = this;
            int r10 = r6.OooOo0O()
            r0 = 0
            if (r10 != 0) goto L8
            return r0
        L8:
            com.ninja.engine.o00ooOoo r10 = r6.OooOOo0
            int r10 = r10.OooO00o
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r8 == r3) goto L41
            r4 = 2
            if (r8 == r4) goto L3f
            r4 = 17
            if (r8 == r4) goto L37
            r4 = 33
            if (r8 == r4) goto L34
            r4 = 66
            if (r8 == r4) goto L2b
            r4 = 130(0x82, float:1.82E-43)
            if (r8 == r4) goto L28
        L25:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L42
        L28:
            if (r10 != r3) goto L25
            goto L3f
        L2b:
            if (r10 != 0) goto L25
            boolean r8 = r6.o000000o()
            if (r8 == 0) goto L3f
            goto L41
        L34:
            if (r10 != r3) goto L25
            goto L41
        L37:
            if (r10 != 0) goto L25
            boolean r8 = r6.o000000o()
            if (r8 == 0) goto L41
        L3f:
            r8 = 1
            goto L42
        L41:
            r8 = -1
        L42:
            if (r8 != r1) goto L45
            return r0
        L45:
            java.lang.String r10 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 0
            int r7 = com.ninja.engine.AbstractC1066oOOo0Oo.Oooo00o(r7)
            if (r8 != r2) goto L88
            if (r7 != 0) goto L56
            return r0
        L56:
            android.view.View r7 = r6.OooOo0(r1)
            int r7 = com.ninja.engine.AbstractC1066oOOo0Oo.Oooo00o(r7)
            int r7 = r7 - r3
            if (r7 < 0) goto L77
            int r8 = r6.OooOoo0()
            if (r7 < r8) goto L68
            goto L77
        L68:
            r6.o0O0O00(r7)
            com.ninja.engine.oOOoO0o r7 = r9.OooO(r7, r4)
            android.view.View r7 = r7.OooO00o
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r10)
            throw r7
        L77:
            boolean r7 = r6.o000000o()
            if (r7 == 0) goto L83
            int r7 = r6.OooOo0O()
            int r1 = r7 + (-1)
        L83:
            android.view.View r7 = r6.OooOo0(r1)
            goto Lc7
        L88:
            int r8 = r6.OooOoo0()
            int r8 = r8 - r3
            if (r7 != r8) goto L90
            return r0
        L90:
            int r7 = r6.OooOo0O()
            int r7 = r7 - r3
            android.view.View r7 = r6.OooOo0(r7)
            int r7 = com.ninja.engine.AbstractC1066oOOo0Oo.Oooo00o(r7)
            int r7 = r7 + r3
            if (r7 < 0) goto Lb6
            int r8 = r6.OooOoo0()
            if (r7 < r8) goto La7
            goto Lb6
        La7:
            r6.o0O0O00(r7)
            com.ninja.engine.oOOoO0o r7 = r9.OooO(r7, r4)
            android.view.View r7 = r7.OooO00o
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r10)
            throw r7
        Lb6:
            boolean r7 = r6.o000000o()
            if (r7 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r7 = r6.OooOo0O()
            int r1 = r7 + (-1)
        Lc3:
            android.view.View r7 = r6.OooOo0(r1)
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.OoooO0O(android.view.View, int, com.ninja.engine.oOOo0o, com.ninja.engine.oOOoO0O):android.view.View");
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOOO(int i, int i2) {
        OooOoo0();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOoO(int i, int i2) {
        OooOoo0();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Ooooo00(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (c1080oOOoO0O.OooO0O0() > 0 && o000OOo() > 0.0f) {
            o000000o();
            View view = c1070oOOo0o.OooO(0, Long.MAX_VALUE).OooO00o;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        Oooooo(c1070oOOo0o);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Ooooo0o(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() != 0) {
            AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0));
        }
    }

    public final void o00000(int i) {
        C0271o00ooOoo c0271o00ooOoo;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "invalid orientation:"));
        }
        OooO0OO(null);
        C0271o00ooOoo c0271o00ooOoo2 = this.OooOOo0;
        if (c0271o00ooOoo2 == null || i != c0271o00ooOoo2.OooO00o) {
            if (i != 0) {
                if (i == 1) {
                    c0271o00ooOoo = new C0271o00ooOoo(this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                c0271o00ooOoo = new C0271o00ooOoo(this, 1);
            }
            this.OooOOo0 = c0271o00ooOoo;
            o00O0O();
        }
    }

    public final boolean o000000O() {
        return this.OooOOo0.OooO00o == 0;
    }

    public final boolean o000000o() {
        return o000000O() && OooOoo() == 1;
    }

    public final int o000OOo() {
        if (o000000O()) {
            return this.OooOOO;
        }
        return this.OooOOOO;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int o00Oo0(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (!o000000O() || OooOo0O() == 0 || i == 0) {
            return 0;
        }
        View view = c1070oOOo0o.OooO(0, Long.MAX_VALUE).OooO00o;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o00Ooo(int i) {
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int o00o0O(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (!OooO0o0() || OooOo0O() == 0 || i == 0) {
            return 0;
        }
        View view = c1070oOOo0o.OooO(0, Long.MAX_VALUE).OooO00o;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final float o0O0O00(int i) {
        this.OooOOo0.OooO0Oo();
        throw null;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o0Oo0oo(RecyclerView recyclerView, int i) {
        C0268o00ooOo c0268o00ooOo = new C0268o00ooOo(this, recyclerView.getContext(), 0);
        c0268o00ooOo.OooO00o = i;
        o0OO00O(c0268o00ooOo);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean ooOO(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0270o00ooOoO();
        this.OooOOo = new View.OnLayoutChangeListener() { // from class: com.ninja.engine.o00ooOo0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 != i5 || i22 != i6 || i32 != i7 || i4 != i8) {
                    view.post(new RunnableC0061o00000oO(4, carouselLayoutManager));
                }
            }
        };
        this.OooOOOo = new C0437o0OoO0OO();
        o00O0O();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooO0o0);
            obtainStyledAttributes.getInt(0, 0);
            o00O0O();
            o00000(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
