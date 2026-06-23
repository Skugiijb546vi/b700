package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0038Oooo0oo;
import com.ninja.engine.C0225o00oO00O;
import com.ninja.engine.C0237o00oOo;
import com.ninja.engine.C0327o0O0oOo;
import com.ninja.engine.C0875oO0oOooo;
import com.ninja.engine.C1204oOoOOOO0;
import com.ninja.engine.C1219oOoOOoo0;
import com.ninja.engine.C1462oo0O0O0;
import com.ninja.engine.InterfaceC0052OooooOO;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0326o0O0oOOO {
    public C1462oo0O0O0 OooO;
    public AbstractC1091oOOoOOOO OooO00o;
    public final C0875oO0oOooo OooO0O0;
    public final ColorStateList OooO0OO;
    public final C1204oOoOOOO0 OooO0Oo;
    public final float OooO0o;
    public final C0237o00oOo OooO0o0;
    public final boolean OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public final float OooOO0O;
    public int OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public WeakReference OooOOOo;
    public final int OooOOo;
    public WeakReference OooOOo0;
    public VelocityTracker OooOOoo;
    public final LinkedHashSet OooOo0;
    public int OooOo00;
    public final C0225o00oO00O OooOo0O;

    public SideSheetBehavior() {
        this.OooO0o0 = new C0237o00oOo(this);
        this.OooO0oO = true;
        this.OooO0oo = 5;
        this.OooOO0O = 0.1f;
        this.OooOOo = -1;
        this.OooOo0 = new LinkedHashSet();
        this.OooOo0O = new C0225o00oO00O(this, 1);
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0Oo(C0327o0O0oOo c0327o0O0oOo) {
        this.OooOOOo = null;
        this.OooO = null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0o() {
        this.OooOOOo = null;
        this.OooO = null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C1462oo0O0O0 c1462oo0O0O0;
        VelocityTracker velocityTracker;
        if ((view.isShown() || AbstractC1460oo0O00oo.OooO0Oo(view) != null) && this.OooO0oO) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.OooOOoo) != null) {
                velocityTracker.recycle();
                this.OooOOoo = null;
            }
            if (this.OooOOoo == null) {
                this.OooOOoo = VelocityTracker.obtain();
            }
            this.OooOOoo.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.OooOO0) {
                    this.OooOO0 = false;
                    return false;
                }
            } else {
                this.OooOo00 = (int) motionEvent.getX();
            }
            if (!this.OooOO0 && (c1462oo0O0O0 = this.OooO) != null && c1462oo0O0O0.OooOOOO(motionEvent)) {
                return true;
            }
            return false;
        }
        this.OooOO0 = true;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x010f, code lost:
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
        r2.setShapeAppearanceModel(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
        if (r2 != null) goto L84;
     */
    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooO0oo(androidx.coordinatorlayout.widget.CoordinatorLayout r11, android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.OooO0oo(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOOOo(View view, Parcelable parcelable) {
        int i = ((C1219oOoOOoo0) parcelable).OooO0OO;
        this.OooO0oo = (i == 1 || i == 2) ? 5 : 5;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final Parcelable OooOOo0(View view) {
        return new C1219oOoOOoo0(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r1.OooOOO(r0, r3.getTop()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r3 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        OooOo0O(2);
        r2.OooO0o0.OooO00o(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOo(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            com.ninja.engine.oOOoOOOO r0 = r2.OooO00o
            int r0 = r0.OooOOO()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.ninja.engine.AbstractC1230oOoOo0o.OooO0o(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            com.ninja.engine.oOOoOOOO r0 = r2.OooO00o
            int r0 = r0.OooOOO0()
        L1f:
            com.ninja.engine.oo0O0O0 r1 = r2.OooO
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.OooOOO(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.OooOOo = r3
            r3 = -1
            r1.OooO0OO = r3
            r3 = 0
            boolean r3 = r1.OooO0oo(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.OooO00o
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.OooOOo
            if (r5 == 0) goto L4b
            r5 = 0
            r1.OooOOo = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.OooOo0O(r3)
            com.ninja.engine.o00oOo r3 = r2.OooO0o0
            r3.OooO00o(r4)
            goto L5a
        L57:
            r2.OooOo0O(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.OooOo(android.view.View, int, boolean):void");
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOo0(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.OooO0oo == 1 && actionMasked == 0) {
            return true;
        }
        if (OooOo0o()) {
            this.OooO.OooO(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.OooOOoo) != null) {
            velocityTracker.recycle();
            this.OooOOoo = null;
        }
        if (this.OooOOoo == null) {
            this.OooOOoo = VelocityTracker.obtain();
        }
        this.OooOOoo.addMovement(motionEvent);
        if (OooOo0o() && actionMasked == 2 && !this.OooOO0 && OooOo0o()) {
            float abs = Math.abs(this.OooOo00 - motionEvent.getX());
            C1462oo0O0O0 c1462oo0O0O0 = this.OooO;
            if (abs > c1462oo0O0O0.OooO0O0) {
                c1462oo0O0O0.OooO0O0(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.OooOO0;
    }

    public final void OooOo0O(int i) {
        View view;
        int i2;
        if (this.OooO0oo == i) {
            return;
        }
        this.OooO0oo = i;
        WeakReference weakReference = this.OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.OooO0oo == 5) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.OooOo0.iterator();
        if (!it.hasNext()) {
            OooOoO0();
        } else {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public final boolean OooOo0o() {
        if (this.OooO != null && (this.OooO0oO || this.OooO0oo == 1)) {
            return true;
        }
        return false;
    }

    public final void OooOoO0() {
        View view;
        WeakReference weakReference = this.OooOOOo;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1460oo0O00oo.OooOOO0(view, 262144);
        AbstractC1460oo0O00oo.OooO(view, 0);
        AbstractC1460oo0O00oo.OooOOO0(view, 1048576);
        AbstractC1460oo0O00oo.OooO(view, 0);
        if (this.OooO0oo != 5) {
            AbstractC1460oo0O00oo.OooOOO(view, C0038Oooo0oo.OooOO0, new InterfaceC0052OooooOO() { // from class: com.ninja.engine.oOoOOoOo
                @Override // com.ninja.engine.InterfaceC0052OooooOO
                public final boolean OooO0O0(View view2) {
                    String str;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i = r2;
                    if (i != 1 && i != 2) {
                        WeakReference weakReference2 = sideSheetBehavior.OooOOOo;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            View view3 = (View) sideSheetBehavior.OooOOOo.get();
                            RunnableC1138oOOoooO0 runnableC1138oOOoooO0 = new RunnableC1138oOOoooO0(i, 1, sideSheetBehavior);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                                if (view3.isAttachedToWindow()) {
                                    view3.post(runnableC1138oOOoooO0);
                                }
                            }
                            runnableC1138oOOoooO0.run();
                        } else {
                            sideSheetBehavior.OooOo0O(i);
                        }
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("STATE_");
                    if (i == 1) {
                        str = "DRAGGING";
                    } else {
                        str = "SETTLING";
                    }
                    throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO(sb, str, " should not be set externally."));
                }
            });
        }
        if (this.OooO0oo != 3) {
            AbstractC1460oo0O00oo.OooOOO(view, C0038Oooo0oo.OooO0oo, new InterfaceC0052OooooOO() { // from class: com.ninja.engine.oOoOOoOo
                @Override // com.ninja.engine.InterfaceC0052OooooOO
                public final boolean OooO0O0(View view2) {
                    String str;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i = r2;
                    if (i != 1 && i != 2) {
                        WeakReference weakReference2 = sideSheetBehavior.OooOOOo;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            View view3 = (View) sideSheetBehavior.OooOOOo.get();
                            RunnableC1138oOOoooO0 runnableC1138oOOoooO0 = new RunnableC1138oOOoooO0(i, 1, sideSheetBehavior);
                            ViewParent parent = view3.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                                if (view3.isAttachedToWindow()) {
                                    view3.post(runnableC1138oOOoooO0);
                                }
                            }
                            runnableC1138oOOoooO0.run();
                        } else {
                            sideSheetBehavior.OooOo0O(i);
                        }
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("STATE_");
                    if (i == 1) {
                        str = "DRAGGING";
                    } else {
                        str = "SETTLING";
                    }
                    throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO(sb, str, " should not be set externally."));
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.OooO0o0 = new C0237o00oOo(this);
        this.OooO0oO = true;
        this.OooO0oo = 5;
        this.OooOO0O = 0.1f;
        this.OooOOo = -1;
        this.OooOo0 = new LinkedHashSet();
        this.OooOo0O = new C0225o00oO00O(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooOoo);
        if (obtainStyledAttributes.hasValue(3)) {
            this.OooO0OO = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.OooO0Oo = C1204oOoOOOO0.OooO0O0(context, attributeSet, 0, 2131952595).OooO00o();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.OooOOo = resourceId;
            WeakReference weakReference = this.OooOOo0;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.OooOOo0 = null;
            WeakReference weakReference2 = this.OooOOOo;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C1204oOoOOOO0 c1204oOoOOOO0 = this.OooO0Oo;
        if (c1204oOoOOOO0 != null) {
            C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(c1204oOoOOOO0);
            this.OooO0O0 = c0875oO0oOooo;
            c0875oO0oOooo.OooOO0(context);
            ColorStateList colorStateList = this.OooO0OO;
            if (colorStateList != null) {
                this.OooO0O0.OooOO0o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.OooO0O0.setTint(typedValue.data);
            }
        }
        this.OooO0o = obtainStyledAttributes.getDimension(2, -1.0f);
        this.OooO0oO = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}


