package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* renamed from: com.ninja.engine.o00oO00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225o00oO00O extends AbstractC1094oOOoOOo0 {
    public final /* synthetic */ int OooO;
    public final /* synthetic */ AbstractC0326o0O0oOOO OooOO0;

    public /* synthetic */ C0225o00oO00O(AbstractC0326o0O0oOOO abstractC0326o0O0oOOO, int i) {
        this.OooO = i;
        this.OooOO0 = abstractC0326o0O0oOOO;
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final int OooO00o(View view, int i) {
        switch (this.OooO) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooOO0;
                return AbstractC0809oO0OooOO.OooOo00(i, sideSheetBehavior.OooO00o.OooOOOo(), sideSheetBehavior.OooO00o.OooOOOO());
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final int OooO0O0(View view, int i) {
        switch (this.OooO) {
            case 0:
                return AbstractC0809oO0OooOO.OooOo00(i, ((BottomSheetBehavior) this.OooOO0).OooOoo0(), OooOO0O());
            default:
                return view.getTop();
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public int OooOO0(View view) {
        switch (this.OooO) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooOO0;
                return sideSheetBehavior.OooOO0o + sideSheetBehavior.OooOOOO;
            default:
                return super.OooOO0(view);
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public int OooOO0O() {
        switch (this.OooO) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.OooOO0;
                if (bottomSheetBehavior.Oooo0) {
                    return bottomSheetBehavior.OoooO;
                }
                return bottomSheetBehavior.Oooo00O;
            default:
                return super.OooOO0O();
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final void OooOOOo(int i) {
        switch (this.OooO) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.OooOO0;
                    if (bottomSheetBehavior.Oooo0OO) {
                        bottomSheetBehavior.Oooo00O(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooOO0;
                    if (sideSheetBehavior.OooO0oO) {
                        sideSheetBehavior.OooOo0O(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0.OooO00o.OooOo(r6) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (java.lang.Math.abs(r7 - r0.OooO00o.OooOOO0()) < java.lang.Math.abs(r7 - r0.OooO00o.OooOOO())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r7 > r2.OooOooo) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (java.lang.Math.abs(r6.getTop() - r2.OooOoo0()) < java.lang.Math.abs(r6.getTop() - r2.OooOooo)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fb, code lost:
        if (java.lang.Math.abs(r7 - r2.OooOooo) < java.lang.Math.abs(r7 - r2.Oooo00O)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
        if (java.lang.Math.abs(r7 - r2.OooOooO) < java.lang.Math.abs(r7 - r2.Oooo00O)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
        if (r7 < java.lang.Math.abs(r7 - r2.Oooo00O)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0136, code lost:
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r2.Oooo00O)) goto L26;
     */
    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0225o00oO00O.OooOOo(android.view.View, float, float):void");
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final void OooOOo0(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.OooO) {
            case 0:
                ((BottomSheetBehavior) this.OooOO0).OooOoO0(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooOO0;
                WeakReference weakReference = sideSheetBehavior.OooOOo0;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.OooO00o.Oooo00O(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.OooOo0;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.OooO00o.OooO0OO(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        AbstractC1230oOoOo0o.OooOO0O(it.next());
                        throw null;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC1094oOOoOOo0
    public final boolean OooOo(View view, int i) {
        View view2;
        WeakReference weakReference;
        switch (this.OooO) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.OooOO0;
                int i2 = bottomSheetBehavior.Oooo0o0;
                if (i2 == 1 || bottomSheetBehavior.OoooOoo) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.OoooOo0 == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.o000oOoO;
                    if (weakReference2 != null) {
                        view2 = (View) weakReference2.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.OoooOO0;
                if (weakReference3 == null || weakReference3.get() != view) {
                    return false;
                }
                return true;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooOO0;
                if (sideSheetBehavior.OooO0oo == 1 || (weakReference = sideSheetBehavior.OooOOOo) == null || weakReference.get() != view) {
                    return false;
                }
                return true;
        }
    }
}
