package com.ninja.engine;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o00oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237o00oOo {
    public final /* synthetic */ int OooO00o;
    public int OooO0O0;
    public boolean OooO0OO;
    public final Runnable OooO0Oo;
    public final /* synthetic */ AbstractC0326o0O0oOOO OooO0o0;

    public C0237o00oOo(BottomSheetBehavior bottomSheetBehavior) {
        this.OooO00o = 0;
        this.OooO0o0 = bottomSheetBehavior;
        this.OooO0Oo = new o00000OO(3, this);
    }

    public final void OooO00o(int i) {
        Runnable runnable = this.OooO0Oo;
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = this.OooO0o0;
        switch (this.OooO00o) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0326o0O0oOOO;
                WeakReference weakReference = bottomSheetBehavior.OoooOO0;
                if (weakReference != null && weakReference.get() != null) {
                    this.OooO0O0 = i;
                    if (!this.OooO0OO) {
                        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                        ((View) bottomSheetBehavior.OoooOO0.get()).postOnAnimation((o00000OO) runnable);
                        this.OooO0OO = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0326o0O0oOOO;
                WeakReference weakReference2 = sideSheetBehavior.OooOOOo;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.OooO0O0 = i;
                    if (!this.OooO0OO) {
                        WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
                        ((View) sideSheetBehavior.OooOOOo.get()).postOnAnimation((RunnableC0061o00000oO) runnable);
                        this.OooO0OO = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C0237o00oOo(SideSheetBehavior sideSheetBehavior) {
        this.OooO00o = 1;
        this.OooO0o0 = sideSheetBehavior;
        this.OooO0Oo = new RunnableC0061o00000oO(17, this);
    }
}


