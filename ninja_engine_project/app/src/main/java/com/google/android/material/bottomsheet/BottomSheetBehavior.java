package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1452oo0O000o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0026OooOoo;
import com.ninja.engine.C0028OooOooO;
import com.ninja.engine.C0038Oooo0oo;
import com.ninja.engine.C0073o0000oO0;
import com.ninja.engine.C0225o00oO00O;
import com.ninja.engine.C0226o00oO00o;
import com.ninja.engine.C0237o00oOo;
import com.ninja.engine.C0251o00oo000;
import com.ninja.engine.C0327o0O0oOo;
import com.ninja.engine.C0868oO0oOoO;
import com.ninja.engine.C0875oO0oOooo;
import com.ninja.engine.C1204oOoOOOO0;
import com.ninja.engine.C1462oo0O0O0;
import com.ninja.engine.R;
import com.ninja.engine.o00O0O0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0326o0O0oOOO {
    public final C0875oO0oOooo OooO;
    public final int OooO00o;
    public boolean OooO0O0;
    public final float OooO0OO;
    public final int OooO0Oo;
    public boolean OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public final int OooO0oo;
    public final ColorStateList OooOO0;
    public final int OooOO0O;
    public final int OooOO0o;
    public final boolean OooOOO;
    public int OooOOO0;
    public final boolean OooOOOO;
    public final boolean OooOOOo;
    public final boolean OooOOo;
    public final boolean OooOOo0;
    public final boolean OooOOoo;
    public final boolean OooOo;
    public final boolean OooOo0;
    public final boolean OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public boolean OooOoO;
    public final C1204oOoOOOO0 OooOoO0;
    public final C0237o00oOo OooOoOO;
    public final int OooOoo;
    public final ValueAnimator OooOoo0;
    public int OooOooO;
    public int OooOooo;
    public boolean Oooo;
    public boolean Oooo0;
    public final float Oooo000;
    public int Oooo00O;
    public final float Oooo00o;
    public boolean Oooo0O0;
    public final boolean Oooo0OO;
    public C1462oo0O0O0 Oooo0o;
    public int Oooo0o0;
    public boolean Oooo0oO;
    public int Oooo0oo;
    public int OoooO;
    public int OoooO0;
    public final float OoooO00;
    public int OoooO0O;
    public WeakReference OoooOO0;
    public final ArrayList OoooOOO;
    public VelocityTracker OoooOOo;
    public int OoooOo0;
    public int OoooOoO;
    public boolean OoooOoo;
    public HashMap Ooooo00;
    public final SparseIntArray Ooooo0o;
    public final C0225o00oO00O OooooO0;
    public WeakReference o000oOoO;

    public BottomSheetBehavior() {
        this.OooO00o = 0;
        this.OooO0O0 = true;
        this.OooOO0O = -1;
        this.OooOO0o = -1;
        this.OooOoOO = new C0237o00oOo(this);
        this.Oooo000 = 0.5f;
        this.Oooo00o = -1.0f;
        this.Oooo0OO = true;
        this.Oooo0o0 = 4;
        this.OoooO00 = 0.1f;
        this.OoooOOO = new ArrayList();
        this.OoooOoO = -1;
        this.Ooooo0o = new SparseIntArray();
        this.OooooO0 = new C0225o00oO00O(this, 0);
    }

    public static View OooOoO(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (AbstractC1452oo0O000o.OooO(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View OooOoO = OooOoO(viewGroup.getChildAt(i));
                if (OooOoO != null) {
                    return OooOoO;
                }
            }
        }
        return null;
    }

    public static int OooOoOO(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(OooOoOO(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.OooOO0O, marginLayoutParams.width), OooOoOO(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.OooOO0o, marginLayoutParams.height));
        return true;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0Oo(C0327o0O0oOo c0327o0O0oOo) {
        this.OoooOO0 = null;
        this.Oooo0o = null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0o() {
        this.OoooOO0 = null;
        this.Oooo0o = null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        C1462oo0O0O0 c1462oo0O0O0;
        if (view.isShown() && this.Oooo0OO) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.OoooOo0 = -1;
                this.OoooOoO = -1;
                VelocityTracker velocityTracker = this.OoooOOo;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.OoooOOo = null;
                }
            }
            if (this.OoooOOo == null) {
                this.OoooOOo = VelocityTracker.obtain();
            }
            this.OoooOOo.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.OoooOoo = false;
                    this.OoooOo0 = -1;
                    if (this.Oooo0oO) {
                        this.Oooo0oO = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.OoooOoO = (int) motionEvent.getY();
                if (this.Oooo0o0 != 2) {
                    WeakReference weakReference = this.o000oOoO;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.OooOOO(view2, x, this.OoooOoO)) {
                        this.OoooOo0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.OoooOoo = true;
                    }
                }
                if (this.OoooOo0 == -1 && !coordinatorLayout.OooOOO(view, x, this.OoooOoO)) {
                    z = true;
                } else {
                    z = false;
                }
                this.Oooo0oO = z;
            }
            if (!this.Oooo0oO && (c1462oo0O0O0 = this.Oooo0o) != null && c1462oo0O0O0.OooOOOO(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.o000oOoO;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.Oooo0oO || this.Oooo0o0 == 1 || coordinatorLayout.OooOOO(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Oooo0o == null || (i = this.OoooOoO) == -1 || Math.abs(i - motionEvent.getY()) <= this.Oooo0o.OooO0O0) {
                return false;
            }
            return true;
        }
        this.Oooo0oO = true;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
        if (r0 == (-1)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
        r12 = java.lang.Math.min(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
        r9.OoooO0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
        if (r0 == (-1)) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.ninja.engine.o0O0Oo0o, java.lang.Object] */
    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0oo(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooO0oo(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOO0(View view) {
        WeakReference weakReference = this.o000oOoO;
        if (weakReference == null || view != weakReference.get() || this.Oooo0o0 == 3) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOO0o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.o000oOoO;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < OooOoo0()) {
                int OooOoo0 = top - OooOoo0();
                iArr[1] = OooOoo0;
                AbstractC1460oo0O00oo.OooOO0O(view, -OooOoo0);
                Oooo00O(3);
            } else if (!this.Oooo0OO) {
                return;
            } else {
                iArr[1] = i2;
                AbstractC1460oo0O00oo.OooOO0O(view, -i2);
                Oooo00O(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.Oooo00O;
            if (i4 > i5 && !this.Oooo0) {
                int i6 = top - i5;
                iArr[1] = i6;
                AbstractC1460oo0O00oo.OooOO0O(view, -i6);
                Oooo00O(4);
            } else if (!this.Oooo0OO) {
                return;
            } else {
                iArr[1] = i2;
                AbstractC1460oo0O00oo.OooOO0O(view, -i2);
                Oooo00O(1);
            }
        }
        OooOoO0(view.getTop());
        this.Oooo0oo = i2;
        this.Oooo = true;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOO(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOOo(View view, Parcelable parcelable) {
        C0226o00oO00o c0226o00oO00o = (C0226o00oO00o) parcelable;
        int i = this.OooO00o;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.OooO0o0 = c0226o00oO00o.OooO0Oo;
            }
            if (i == -1 || (i & 2) == 2) {
                this.OooO0O0 = c0226o00oO00o.OooO0o0;
            }
            if (i == -1 || (i & 4) == 4) {
                this.Oooo0 = c0226o00oO00o.OooO0o;
            }
            if (i == -1 || (i & 8) == 8) {
                this.Oooo0O0 = c0226o00oO00o.OooO0oO;
            }
        }
        int i2 = c0226o00oO00o.OooO0OO;
        if (i2 != 1 && i2 != 2) {
            this.Oooo0o0 = i2;
        } else {
            this.Oooo0o0 = 4;
        }
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final Parcelable OooOOo0(View view) {
        return new C0226o00oO00o(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOOoo(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Oooo0oo = 0;
        this.Oooo = false;
        return (i & 2) != 0;
    }

    public final int OooOo() {
        int i;
        return this.OooO0o ? Math.min(Math.max(this.OooO0oO, this.OoooO - ((this.OoooO0O * 9) / 16)), this.OoooO0) + this.OooOo0O : (this.OooOOO || this.OooOOOO || (i = this.OooOOO0) <= 0) ? this.OooO0o0 + this.OooOo0O : Math.max(this.OooO0o0, i + this.OooO0oo);
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOo0(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.Oooo0o0;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C1462oo0O0O0 c1462oo0O0O0 = this.Oooo0o;
        if (c1462oo0O0O0 != null && (this.Oooo0OO || i == 1)) {
            c1462oo0O0O0.OooO(motionEvent);
        }
        if (actionMasked == 0) {
            this.OoooOo0 = -1;
            this.OoooOoO = -1;
            VelocityTracker velocityTracker = this.OoooOOo;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.OoooOOo = null;
            }
        }
        if (this.OoooOOo == null) {
            this.OoooOOo = VelocityTracker.obtain();
        }
        this.OoooOOo.addMovement(motionEvent);
        if (this.Oooo0o != null && ((this.Oooo0OO || this.Oooo0o0 == 1) && actionMasked == 2 && !this.Oooo0oO)) {
            float abs = Math.abs(this.OoooOoO - motionEvent.getY());
            C1462oo0O0O0 c1462oo0O0O02 = this.Oooo0o;
            if (abs > c1462oo0O0O02.OooO0O0) {
                c1462oo0O0O02.OooO0O0(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Oooo0oO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r4.getTop() <= r2.OooOooo) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (java.lang.Math.abs(r3 - r2.OooOooO) < java.lang.Math.abs(r3 - r2.Oooo00O)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.Oooo00O)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.Oooo00O)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        if (java.lang.Math.abs(r3 - r2.OooOooo) < java.lang.Math.abs(r3 - r2.Oooo00O)) goto L18;
     */
    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo00(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.OooOoo0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Oooo00O(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.o000oOoO
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.Oooo
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.Oooo0oo
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.OooO0O0
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.OooOooo
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.Oooo0
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.OoooOOo
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.OooO0OO
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.OoooOOo
            int r6 = r2.OoooOo0
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.Oooo00o(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.Oooo0oo
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.OooO0O0
            if (r1 == 0) goto L74
            int r5 = r2.OooOooO
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.Oooo00O
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.OooOooo
            if (r3 >= r1) goto L83
            int r6 = r2.Oooo00O
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.Oooo00O
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.OooO0O0
            if (r3 == 0) goto L99
        L97:
            r0 = 4
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.OooOooo
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.Oooo00O
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = 6
        Laf:
            r3 = 0
            r2.Oooo0(r4, r0, r3)
            r2.Oooo = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOo00(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final void OooOo0O() {
        int OooOo = OooOo();
        if (this.OooO0O0) {
            this.Oooo00O = Math.max(this.OoooO - OooOo, this.OooOooO);
        } else {
            this.Oooo00O = this.OoooO - OooOo;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        r0 = r0.getRootWindowInsets();
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float OooOo0o() {
        /*
            r5 = this;
            com.ninja.engine.oO0oOooo r0 = r5.OooO
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.OoooOO0
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.OoooOO0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.OooOooO()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = com.ninja.engine.AbstractC0033Oooo0O0.OooO0o0(r0)
            if (r0 == 0) goto L79
            com.ninja.engine.oO0oOooo r2 = r5.OooO
            com.ninja.engine.oO0oOoO r3 = r2.OooO00o
            com.ninja.engine.oOoOOOO0 r3 = r3.OooO00o
            com.ninja.engine.o0O0ooO0 r3 = r3.OooO0o0
            android.graphics.RectF r2 = r2.OooO0oo()
            float r2 = r3.OooO00o(r2)
            android.view.RoundedCorner r3 = com.ninja.engine.AbstractC0187o00o.OooO0oo(r0)
            if (r3 == 0) goto L4e
            int r3 = com.ninja.engine.AbstractC0187o00o.OooO0OO(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = 0
        L4f:
            com.ninja.engine.oO0oOooo r2 = r5.OooO
            com.ninja.engine.oO0oOoO r4 = r2.OooO00o
            com.ninja.engine.oOoOOOO0 r4 = r4.OooO00o
            com.ninja.engine.o0O0ooO0 r4 = r4.OooO0o
            android.graphics.RectF r2 = r2.OooO0oo()
            float r2 = r4.OooO00o(r2)
            android.view.RoundedCorner r0 = com.ninja.engine.AbstractC0187o00o.OooOOO0(r0)
            if (r0 == 0) goto L74
            int r0 = com.ninja.engine.AbstractC0187o00o.OooO0OO(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.OooOo0o():float");
    }

    public final void OooOoO0(int i) {
        if (((View) this.OoooOO0.get()) != null) {
            ArrayList arrayList = this.OoooOOO;
            if (!arrayList.isEmpty()) {
                int i2 = this.Oooo00O;
                if (i <= i2 && i2 != OooOoo0()) {
                    OooOoo0();
                }
                if (arrayList.size() > 0) {
                    AbstractC1230oOoOo0o.OooOO0O(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int OooOoo(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.OooOooo;
                    }
                    throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Invalid state to get top offset: "));
                }
                return this.OoooO;
            }
            return this.Oooo00O;
        }
        return OooOoo0();
    }

    public final int OooOoo0() {
        if (this.OooO0O0) {
            return this.OooOooO;
        }
        return Math.max(this.OooOoo, this.OooOOo ? 0 : this.OooOo0o);
    }

    public final boolean OooOooO() {
        WeakReference weakReference = this.OoooOO0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.OoooOO0.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final void OooOooo(int i) {
        if (i == -1) {
            if (!this.OooO0o) {
                this.OooO0o = true;
            } else {
                return;
            }
        } else if (this.OooO0o || this.OooO0o0 != i) {
            this.OooO0o = false;
            this.OooO0o0 = Math.max(0, i);
        } else {
            return;
        }
        Oooo0o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r3 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        Oooo00O(2);
        Oooo0OO(r4, true);
        r2.OooOoOO.OooO00o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1.OooOOO(r3.getLeft(), r0) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Oooo0(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.OooOoo(r4)
            com.ninja.engine.oo0O0O0 r1 = r2.Oooo0o
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.OooOOO(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.OooOOo = r3
            r3 = -1
            r1.OooO0OO = r3
            r3 = 0
            boolean r3 = r1.OooO0oo(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.OooO00o
            if (r5 != 0) goto L30
            android.view.View r5 = r1.OooOOo
            if (r5 == 0) goto L30
            r5 = 0
            r1.OooOOo = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.Oooo00O(r3)
            r3 = 1
            r2.Oooo0OO(r4, r3)
            com.ninja.engine.o00oOo r3 = r2.OooOoOO
            r3.OooO00o(r4)
            goto L43
        L40:
            r2.Oooo00O(r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.Oooo0(android.view.View, int, boolean):void");
    }

    public final void Oooo000(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.Oooo0 && i == 5) {
                return;
            }
            if (i == 6 && this.OooO0O0 && OooOoo(i) <= this.OooOooO) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference weakReference = this.OoooOO0;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.OoooOO0.get();
                o00O0O0 o00o0o0 = new o00O0O0(this, view, i2);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (view.isAttachedToWindow()) {
                        view.post(o00o0o0);
                        return;
                    }
                }
                o00o0o0.run();
                return;
            }
            Oooo00O(i);
            return;
        }
        StringBuilder sb = new StringBuilder("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO(sb, str, " should not be set externally."));
    }

    public final void Oooo00O(int i) {
        if (this.Oooo0o0 == i) {
            return;
        }
        this.Oooo0o0 = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.Oooo0;
        }
        WeakReference weakReference = this.OoooOO0;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            Oooo0o0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Oooo0o0(false);
        }
        Oooo0OO(i, true);
        ArrayList arrayList = this.OoooOOO;
        if (arrayList.size() <= 0) {
            Oooo0O0();
        } else {
            AbstractC1230oOoOo0o.OooOO0O(arrayList.get(0));
            throw null;
        }
    }

    public final boolean Oooo00o(View view, float f) {
        if (this.Oooo0O0) {
            return true;
        }
        if (view.getTop() < this.Oooo00O) {
            return false;
        }
        return Math.abs(((f * this.OoooO00) + ((float) view.getTop())) - ((float) this.Oooo00O)) / ((float) OooOo()) > 0.5f;
    }

    public final void Oooo0O0() {
        View view;
        C0038Oooo0oo c0038Oooo0oo;
        C0073o0000oO0 c0073o0000oO0;
        int i;
        boolean z;
        C0028OooOooO c0028OooOooO;
        WeakReference weakReference = this.OoooOO0;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            AbstractC1460oo0O00oo.OooOOO0(view, 524288);
            AbstractC1460oo0O00oo.OooO(view, 0);
            AbstractC1460oo0O00oo.OooOOO0(view, 262144);
            AbstractC1460oo0O00oo.OooO(view, 0);
            AbstractC1460oo0O00oo.OooOOO0(view, 1048576);
            AbstractC1460oo0O00oo.OooO(view, 0);
            SparseIntArray sparseIntArray = this.Ooooo0o;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                AbstractC1460oo0O00oo.OooOOO0(view, i2);
                AbstractC1460oo0O00oo.OooO(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.OooO0O0 && this.Oooo0o0 != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                C0073o0000oO0 c0073o0000oO02 = new C0073o0000oO0(6, this);
                ArrayList OooO0o0 = AbstractC1460oo0O00oo.OooO0o0(view);
                int i4 = 0;
                while (true) {
                    if (i4 < OooO0o0.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0038Oooo0oo) OooO0o0.get(i4)).OooO00o).getLabel())) {
                            i = ((C0038Oooo0oo) OooO0o0.get(i4)).OooO00o();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = -1;
                        for (int i6 = 0; i6 < 32 && i5 == -1; i6++) {
                            int i7 = AbstractC1460oo0O00oo.OooO0o0[i6];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < OooO0o0.size(); i8++) {
                                if (((C0038Oooo0oo) OooO0o0.get(i8)).OooO00o() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i5 = i7;
                            }
                        }
                        i = i5;
                    }
                }
                if (i != -1) {
                    C0038Oooo0oo c0038Oooo0oo2 = new C0038Oooo0oo(null, i, string, c0073o0000oO02, null);
                    View.AccessibilityDelegate OooO0OO = AbstractC1460oo0O00oo.OooO0OO(view);
                    if (OooO0OO == null) {
                        c0028OooOooO = null;
                    } else if (OooO0OO instanceof C0026OooOoo) {
                        c0028OooOooO = ((C0026OooOoo) OooO0OO).OooO00o;
                    } else {
                        c0028OooOooO = new C0028OooOooO(OooO0OO);
                    }
                    if (c0028OooOooO == null) {
                        c0028OooOooO = new C0028OooOooO();
                    }
                    AbstractC1460oo0O00oo.OooOOOo(view, c0028OooOooO);
                    AbstractC1460oo0O00oo.OooOOO0(view, c0038Oooo0oo2.OooO00o());
                    AbstractC1460oo0O00oo.OooO0o0(view).add(c0038Oooo0oo2);
                    AbstractC1460oo0O00oo.OooO(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.Oooo0 && this.Oooo0o0 != 5) {
                AbstractC1460oo0O00oo.OooOOO(view, C0038Oooo0oo.OooOO0, new C0073o0000oO0(5, this));
            }
            int i9 = this.Oooo0o0;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        AbstractC1460oo0O00oo.OooOOO(view, C0038Oooo0oo.OooO, new C0073o0000oO0(4, this));
                        c0038Oooo0oo = C0038Oooo0oo.OooO0oo;
                        c0073o0000oO0 = new C0073o0000oO0(3, this);
                    } else {
                        return;
                    }
                } else {
                    if (this.OooO0O0) {
                        i3 = 3;
                    }
                    c0038Oooo0oo = C0038Oooo0oo.OooO0oo;
                    c0073o0000oO0 = new C0073o0000oO0(i3, this);
                }
            } else {
                if (this.OooO0O0) {
                    i3 = 4;
                }
                c0038Oooo0oo = C0038Oooo0oo.OooO;
                c0073o0000oO0 = new C0073o0000oO0(i3, this);
            }
            AbstractC1460oo0O00oo.OooOOO(view, c0038Oooo0oo, c0073o0000oO0);
        }
    }

    public final void Oooo0OO(int i, boolean z) {
        boolean z2;
        C0875oO0oOooo c0875oO0oOooo = this.OooO;
        ValueAnimator valueAnimator = this.OooOoo0;
        if (i == 2) {
            return;
        }
        if (this.Oooo0o0 == 3 && (this.OooOo || OooOooO())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.OooOoO != z2 && c0875oO0oOooo != null) {
            this.OooOoO = z2;
            float f = 1.0f;
            if (z && valueAnimator != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                float f2 = c0875oO0oOooo.OooO00o.OooOO0;
                if (z2) {
                    f = OooOo0o();
                }
                valueAnimator.setFloatValues(f2, f);
                valueAnimator.start();
                return;
            }
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            if (this.OooOoO) {
                f = OooOo0o();
            }
            C0868oO0oOoO c0868oO0oOoO = c0875oO0oOooo.OooO00o;
            if (c0868oO0oOoO.OooOO0 != f) {
                c0868oO0oOoO.OooOO0 = f;
                c0875oO0oOooo.OooO0o0 = true;
                c0875oO0oOooo.invalidateSelf();
            }
        }
    }

    public final void Oooo0o() {
        View view;
        if (this.OoooOO0 != null) {
            OooOo0O();
            if (this.Oooo0o0 == 4 && (view = (View) this.OoooOO0.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void Oooo0o0(boolean z) {
        WeakReference weakReference = this.OoooOO0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.Ooooo00 != null) {
                    return;
                }
                this.Ooooo00 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.OoooOO0.get() && z) {
                    this.Ooooo00.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.Ooooo00 = null;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        int i;
        this.OooO00o = 0;
        this.OooO0O0 = true;
        this.OooOO0O = -1;
        this.OooOO0o = -1;
        this.OooOoOO = new C0237o00oOo(this);
        this.Oooo000 = 0.5f;
        this.Oooo00o = -1.0f;
        this.Oooo0OO = true;
        this.Oooo0o0 = 4;
        this.OoooO00 = 0.1f;
        this.OoooOOO = new ArrayList();
        this.OoooOoO = -1;
        this.Ooooo0o = new SparseIntArray();
        this.OooooO0 = new C0225o00oO00O(this, 0);
        this.OooO0oo = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooO0Oo);
        int i2 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.OooOO0 = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.OooOoO0 = C1204oOoOOOO0.OooO0O0(context, attributeSet, R.attr.bottomSheetStyle, 2131952445).OooO00o();
        }
        C1204oOoOOOO0 c1204oOoOOOO0 = this.OooOoO0;
        if (c1204oOoOOOO0 != null) {
            C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(c1204oOoOOOO0);
            this.OooO = c0875oO0oOooo;
            c0875oO0oOooo.OooOO0(context);
            ColorStateList colorStateList = this.OooOO0;
            if (colorStateList != null) {
                this.OooO.OooOO0o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.OooO.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(OooOo0o(), 1.0f);
        this.OooOoo0 = ofFloat;
        ofFloat.setDuration(500L);
        this.OooOoo0.addUpdateListener(new C0251o00oo000(0, this));
        this.Oooo00o = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.OooOO0O = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.OooOO0o = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i = peekValue.data) != -1) {
            OooOooo(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            OooOooo(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.Oooo0 != z) {
            this.Oooo0 = z;
            if (!z && this.Oooo0o0 == 5) {
                Oooo000(4);
            }
            Oooo0O0();
        }
        this.OooOOO = obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.OooO0O0 != z2) {
            this.OooO0O0 = z2;
            if (this.OoooOO0 != null) {
                OooOo0O();
            }
            Oooo00O((this.OooO0O0 && this.Oooo0o0 == 6) ? i2 : this.Oooo0o0);
            Oooo0OO(this.Oooo0o0, true);
            Oooo0O0();
        }
        this.Oooo0O0 = obtainStyledAttributes.getBoolean(12, false);
        this.Oooo0OO = obtainStyledAttributes.getBoolean(4, true);
        this.OooO00o = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.Oooo000 = f;
            if (this.OoooOO0 != null) {
                this.OooOooo = (int) ((1.0f - f) * this.OoooO);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 == null || peekValue2.type != 16) {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                dimensionPixelOffset = peekValue2.data;
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.OooOoo = dimensionPixelOffset;
            Oooo0OO(this.Oooo0o0, true);
            this.OooO0Oo = obtainStyledAttributes.getInt(11, 500);
            this.OooOOOO = obtainStyledAttributes.getBoolean(17, false);
            this.OooOOOo = obtainStyledAttributes.getBoolean(18, false);
            this.OooOOo0 = obtainStyledAttributes.getBoolean(19, false);
            this.OooOOo = obtainStyledAttributes.getBoolean(20, true);
            this.OooOOoo = obtainStyledAttributes.getBoolean(14, false);
            this.OooOo00 = obtainStyledAttributes.getBoolean(15, false);
            this.OooOo0 = obtainStyledAttributes.getBoolean(16, false);
            this.OooOo = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.OooO0OO = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
