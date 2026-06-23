package com.ninja.engine;

import android.animation.ValueAnimator;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.app.framework.core.system.JarConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o00000OO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ o00000OO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000000 o000000Var;
        Object obj = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) obj).run();
                return;
            case 1:
                C0067o0000Ooo c0067o0000Ooo = (C0067o0000Ooo) obj;
                c0067o0000Ooo.getClass();
                while (true) {
                    try {
                        c0067o0000Ooo.OooO0o0((C0060o00000o0) ((ReferenceQueue) c0067o0000Ooo.OooO0OO).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 2:
                View$OnTouchListenerC0789oO0Oo00 view$OnTouchListenerC0789oO0Oo00 = (View$OnTouchListenerC0789oO0Oo00) obj;
                if (view$OnTouchListenerC0789oO0Oo00.OooOOOO) {
                    boolean z = view$OnTouchListenerC0789oO0Oo00.OooOOO0;
                    o00OOO o00ooo = view$OnTouchListenerC0789oO0Oo00.OooO00o;
                    if (z) {
                        view$OnTouchListenerC0789oO0Oo00.OooOOO0 = false;
                        o00ooo.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        o00ooo.OooO0o0 = currentAnimationTimeMillis;
                        o00ooo.OooO0oO = -1L;
                        o00ooo.OooO0o = currentAnimationTimeMillis;
                        o00ooo.OooO0oo = 0.5f;
                    }
                    if ((o00ooo.OooO0oO > 0 && AnimationUtils.currentAnimationTimeMillis() > o00ooo.OooO0oO + o00ooo.OooO) || !view$OnTouchListenerC0789oO0Oo00.OooO0o0()) {
                        view$OnTouchListenerC0789oO0Oo00.OooOOOO = false;
                        return;
                    }
                    boolean z2 = view$OnTouchListenerC0789oO0Oo00.OooOOO;
                    View view = view$OnTouchListenerC0789oO0Oo00.OooO0OO;
                    if (z2) {
                        view$OnTouchListenerC0789oO0Oo00.OooOOO = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (o00ooo.OooO0o != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float OooO00o = o00ooo.OooO00o(currentAnimationTimeMillis2);
                        o00ooo.OooO0o = currentAnimationTimeMillis2;
                        view$OnTouchListenerC0789oO0Oo00.OooOOo0.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - o00ooo.OooO0o)) * ((OooO00o * 4.0f) + ((-4.0f) * OooO00o * OooO00o)) * o00ooo.OooO0Oo));
                        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                        view.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 3:
                C0237o00oOo c0237o00oOo = (C0237o00oOo) obj;
                c0237o00oOo.OooO0OO = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0237o00oOo.OooO0o0;
                C1462oo0O0O0 c1462oo0O0O0 = bottomSheetBehavior.Oooo0o;
                if (c1462oo0O0O0 != null && c1462oo0O0O0.OooO0o()) {
                    c0237o00oOo.OooO00o(c0237o00oOo.OooO0O0);
                    return;
                } else if (bottomSheetBehavior.Oooo0o0 == 2) {
                    bottomSheetBehavior.Oooo00O(c0237o00oOo.OooO0O0);
                    return;
                } else {
                    return;
                }
            case 4:
                try {
                    androidx.activity.OooO00o.OooO0o((androidx.activity.OooO00o) obj);
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 5:
                animation.Animation$AnimationListenerC0371o0OOOoo animation_animation_animationlistenerc0371o0ooooo = (animation.Animation$AnimationListenerC0371o0OOOoo) obj;
                animation_animation_animationlistenerc0371o0ooooo.OooO0O0.endViewTransition(animation_animation_animationlistenerc0371o0ooooo.OooO0OO);
                animation_animation_animationlistenerc0371o0ooooo.OooO0Oo.OooO0o();
                return;
            case 6:
                AbstractC0616o0oo00oO.OooO00o((ArrayList) obj, 4);
                return;
            case 7:
                DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o = (DialogInterface$OnCancelListenerC0390o0OOoO0o) obj;
                dialogInterface$OnCancelListenerC0390o0OOoO0o.OoooOOo.onDismiss(dialogInterface$OnCancelListenerC0390o0OOoO0o.OooooOo);
                return;
            case 8:
                AbstractC0418o0Oo0OOO abstractC0418o0Oo0OOO = (AbstractC0418o0Oo0OOO) obj;
                abstractC0418o0Oo0OOO.OooO00o(true);
                abstractC0418o0Oo0OOO.invalidateSelf();
                return;
            case 9:
                C0432o0Oo0ooO c0432o0Oo0ooO = (C0432o0Oo0ooO) obj;
                c0432o0Oo0ooO.OooOO0o = null;
                c0432o0Oo0ooO.drawableStateChanged();
                return;
            case JarConfig.MAX_CACHE_SIZE /* 10 */:
                oO0OO oo0oo = (oO0OO) obj;
                int i = oo0oo.OooOoOO;
                ValueAnimator valueAnimator = oo0oo.OooOoO;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                oo0oo.OooOoOO = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 11:
                ((C0606o0oOoooO) obj).OooOo(true);
                return;
            case 12:
                ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0 = (ComponentCallbacks2C1106oOOoOoo0) obj;
                componentCallbacks2C1106oOOoOoo0.OooO0OO.OooOO0o(componentCallbacks2C1106oOOoOoo0);
                return;
            case 13:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.OooO0o) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.OooO0o = false;
                    return;
                }
                return;
            case 14:
                ((StaggeredGridLayoutManager) obj).o000OOo();
                return;
            case 15:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).OooO0OO.OooO0oO;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 16:
                ActionMenuView actionMenuView = ((Toolbar) obj).OooO00o;
                if (actionMenuView != null && (o000000Var = actionMenuView.OooOo00) != null) {
                    o000000Var.OooOOOO();
                    return;
                }
                return;
            default:
                ((C1462oo0O0O0) obj).OooOOO0(0);
                return;
        }
    }
}
