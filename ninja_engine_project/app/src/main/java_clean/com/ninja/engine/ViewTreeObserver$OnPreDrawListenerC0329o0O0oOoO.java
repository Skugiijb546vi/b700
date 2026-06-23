package com.ninja.engine;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0O0oOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int OooO00o = 0;
    public final Object OooO0O0;

    public ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO(CoordinatorLayout coordinatorLayout) {
        this.OooO0O0 = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        switch (this.OooO00o) {
            case 0:
                ((CoordinatorLayout) this.OooO0O0).OooOOOO(0);
                return true;
            default:
                Log.isLoggable("ViewTarget", 2);
                C1476oo0O0o0o c1476oo0O0o0o = (C1476oo0O0o0o) ((WeakReference) this.OooO0O0).get();
                if (c1476oo0O0o0o != null) {
                    ArrayList arrayList = c1476oo0O0o0o.OooO0O0;
                    if (!arrayList.isEmpty()) {
                        View view = c1476oo0O0o0o.OooO00o;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i2 = 0;
                        if (layoutParams != null) {
                            i = layoutParams.width;
                        } else {
                            i = 0;
                        }
                        int OooO00o = c1476oo0O0o0o.OooO00o(view.getWidth(), i, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            i2 = layoutParams2.height;
                        }
                        int OooO00o2 = c1476oo0O0o0o.OooO00o(view.getHeight(), i2, paddingBottom);
                        if (OooO00o > 0 || OooO00o == Integer.MIN_VALUE) {
                            if (OooO00o2 > 0 || OooO00o2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((C1220oOoOOooO) ((InterfaceC1334oOooo0oo) it.next())).OooOO0o(OooO00o, OooO00o2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c1476oo0O0o0o.OooO0OO);
                                }
                                c1476oo0O0o0o.OooO0OO = null;
                                arrayList.clear();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
        }
    }

    public ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO(C1476oo0O0o0o c1476oo0O0o0o) {
        this.OooO0O0 = new WeakReference(c1476oo0O0o0o);
    }
}


