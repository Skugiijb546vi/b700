package com.ninja.engine;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.app.framework.core.system.user.BUserHandle;
/* loaded from: classes.dex */
public class oO0OO00 {
    public final DecelerateInterpolator OooO;
    public int OooO00o = -1;
    public RecyclerView OooO0O0;
    public AbstractC1066oOOo0Oo OooO0OO;
    public boolean OooO0Oo;
    public View OooO0o;
    public boolean OooO0o0;
    public final C1077oOOo0oOo OooO0oO;
    public final LinearInterpolator OooO0oo;
    public PointF OooOO0;
    public final DisplayMetrics OooOO0O;
    public boolean OooOO0o;
    public int OooOOO;
    public float OooOOO0;
    public int OooOOOO;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.oOOo0oOo, java.lang.Object] */
    public oO0OO00(Context context) {
        Object obj = new Object();
        obj.OooO0Oo = -1;
        obj.OooO0o = false;
        obj.OooO00o = 0;
        obj.OooO0O0 = 0;
        obj.OooO0OO = Integer.MIN_VALUE;
        obj.OooO0o0 = null;
        this.OooO0oO = obj;
        this.OooO0oo = new LinearInterpolator();
        this.OooO = new DecelerateInterpolator();
        this.OooOO0o = false;
        this.OooOOO = 0;
        this.OooOOOO = 0;
        this.OooOO0O = context.getResources().getDisplayMetrics();
    }

    public static int OooO00o(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public final void OooO() {
        if (!this.OooO0o0) {
            return;
        }
        this.OooO0o0 = false;
        this.OooOOOO = 0;
        this.OooOOO = 0;
        this.OooOO0 = null;
        this.OooO0O0.Ooooo00.OooO00o = -1;
        this.OooO0o = null;
        this.OooO00o = -1;
        this.OooO0Oo = false;
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooO0OO;
        if (abstractC1066oOOo0Oo.OooO0o0 == this) {
            abstractC1066oOOo0Oo.OooO0o0 = null;
        }
        this.OooO0OO = null;
        this.OooO0O0 = null;
    }

    public int OooO0O0(View view, int i) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooO0OO;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0Oo()) {
            C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
            return OooO00o((view.getLeft() - ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.left) - ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).leftMargin, view.getRight() + ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.right + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).rightMargin, abstractC1066oOOo0Oo.OooOooo(), abstractC1066oOOo0Oo.OooOOO - abstractC1066oOOo0Oo.Oooo000(), i);
        }
        return 0;
    }

    public int OooO0OO(View view, int i) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooO0OO;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0o0()) {
            C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
            return OooO00o((view.getTop() - ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.top) - ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).topMargin, view.getBottom() + ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.bottom + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).bottomMargin, abstractC1066oOOo0Oo.Oooo00O(), abstractC1066oOOo0Oo.OooOOOO - abstractC1066oOOo0Oo.OooOooO(), i);
        }
        return 0;
    }

    public float OooO0Oo(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public PointF OooO0o(int i) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooO0OO;
        if (abstractC1066oOOo0Oo instanceof InterfaceC1078oOOo0oo0) {
            return ((InterfaceC1078oOOo0oo0) abstractC1066oOOo0Oo).OooO00o(i);
        }
        return null;
    }

    public int OooO0o0(int i) {
        float abs = Math.abs(i);
        if (!this.OooOO0o) {
            this.OooOOO0 = OooO0Oo(this.OooOO0O);
            this.OooOO0o = true;
        }
        return (int) Math.ceil(abs * this.OooOOO0);
    }

    public final void OooO0oO(int i, int i2) {
        PointF OooO0o;
        RecyclerView recyclerView = this.OooO0O0;
        int i3 = -1;
        if (this.OooO00o == -1 || recyclerView == null) {
            OooO();
        }
        if (this.OooO0Oo && this.OooO0o == null && this.OooO0OO != null && (OooO0o = OooO0o(this.OooO00o)) != null) {
            float f = OooO0o.x;
            if (f != 0.0f || OooO0o.y != 0.0f) {
                recyclerView.OoooOoO((int) Math.signum(f), (int) Math.signum(OooO0o.y), null);
            }
        }
        boolean z = false;
        this.OooO0Oo = false;
        View view = this.OooO0o;
        C1077oOOo0oOo c1077oOOo0oOo = this.OooO0oO;
        if (view != null) {
            this.OooO0O0.getClass();
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
            if (Oooo0 != null) {
                i3 = Oooo0.OooO0Oo();
            }
            if (i3 == this.OooO00o) {
                View view2 = this.OooO0o;
                C1080oOOoO0O c1080oOOoO0O = recyclerView.Ooooo00;
                OooO0oo(view2, c1077oOOo0oOo);
                c1077oOOo0oOo.OooO00o(recyclerView);
                OooO();
            } else {
                this.OooO0o = null;
            }
        }
        if (this.OooO0o0) {
            C1080oOOoO0O c1080oOOoO0O2 = recyclerView.Ooooo00;
            if (this.OooO0O0.OooOOO0.OooOo0O() == 0) {
                OooO();
            } else {
                int i4 = this.OooOOO;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.OooOOO = i5;
                int i6 = this.OooOOOO;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.OooOOOO = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF OooO0o2 = OooO0o(this.OooO00o);
                    if (OooO0o2 != null) {
                        float f2 = OooO0o2.x;
                        if (f2 != 0.0f || OooO0o2.y != 0.0f) {
                            float f3 = OooO0o2.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
                            float f4 = OooO0o2.x / sqrt;
                            OooO0o2.x = f4;
                            float f5 = OooO0o2.y / sqrt;
                            OooO0o2.y = f5;
                            this.OooOO0 = OooO0o2;
                            this.OooOOO = (int) (f4 * 10000.0f);
                            this.OooOOOO = (int) (f5 * 10000.0f);
                            int OooO0o0 = OooO0o0(BUserHandle.AID_APP_START);
                            LinearInterpolator linearInterpolator = this.OooO0oo;
                            c1077oOOo0oOo.OooO00o = (int) (this.OooOOO * 1.2f);
                            c1077oOOo0oOo.OooO0O0 = (int) (this.OooOOOO * 1.2f);
                            c1077oOOo0oOo.OooO0OO = (int) (OooO0o0 * 1.2f);
                            c1077oOOo0oOo.OooO0o0 = linearInterpolator;
                            c1077oOOo0oOo.OooO0o = true;
                        }
                    }
                    c1077oOOo0oOo.OooO0Oo = this.OooO00o;
                    OooO();
                }
            }
            if (c1077oOOo0oOo.OooO0Oo >= 0) {
                z = true;
            }
            c1077oOOo0oOo.OooO00o(recyclerView);
            if (z && this.OooO0o0) {
                this.OooO0Oo = true;
                recyclerView.OoooOo0.OooO00o();
            }
        }
    }

    public void OooO0oo(View view, C1077oOOo0oOo c1077oOOo0oOo) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.OooOO0;
        int i4 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i3 > 0) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        int OooO0O0 = OooO0O0(view, i);
        PointF pointF2 = this.OooOO0;
        if (pointF2 != null && pointF2.y != 0.0f) {
            i4 = i2 > 0 ? 1 : -1;
        }
        int OooO0OO = OooO0OO(view, i4);
        int ceil = (int) Math.ceil(OooO0o0((int) Math.sqrt((OooO0OO * OooO0OO) + (OooO0O0 * OooO0O0))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.OooO;
            c1077oOOo0oOo.OooO00o = -OooO0O0;
            c1077oOOo0oOo.OooO0O0 = -OooO0OO;
            c1077oOOo0oOo.OooO0OO = ceil;
            c1077oOOo0oOo.OooO0o0 = decelerateInterpolator;
            c1077oOOo0oOo.OooO0o = true;
        }
    }
}

