package com.ninja.engine;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class oOOO00 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View OooO00o;
    public ViewTreeObserver OooO0O0;
    public final Runnable OooO0OO;

    public oOOO00(View view, Runnable runnable) {
        this.OooO00o = view;
        this.OooO0O0 = view.getViewTreeObserver();
        this.OooO0OO = runnable;
    }

    public static void OooO00o(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                oOOO00 oooo00 = new oOOO00(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(oooo00);
                view.addOnAttachStateChangeListener(oooo00);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.OooO0O0.isAlive();
        View view = this.OooO00o;
        if (isAlive) {
            viewTreeObserver = this.OooO0O0;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.OooO0OO.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.OooO0O0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.OooO0O0.isAlive();
        View view2 = this.OooO00o;
        if (isAlive) {
            viewTreeObserver = this.OooO0O0;
        } else {
            viewTreeObserver = view2.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}


