package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o00o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200o00o0O extends AnimatorListenerAdapter {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0200o00o0O(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.OooO0O0;
                actionBarOverlayLayout.OooOo0o = null;
                actionBarOverlayLayout.OooOO0 = false;
                return;
            case 6:
                ((InterfaceC1474oo0O0o00) this.OooO0O0).OooO0O0();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.OooO00o) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.OooO0O0;
                actionBarOverlayLayout.OooOo0o = null;
                actionBarOverlayLayout.OooOO0 = false;
                return;
            case 1:
                o000O00O o000o00o = (o000O00O) this.OooO0O0;
                ArrayList arrayList = new ArrayList(o000o00o.OooO0o0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0291o0O00o0) arrayList.get(i)).OooO00o(o000o00o);
                }
                return;
            case 2:
                C0434o0OoO0 c0434o0OoO0 = (C0434o0OoO0) this.OooO0O0;
                c0434o0OoO0.OooOOo0();
                c0434o0OoO0.OooOOo.start();
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.OooO0O0).OooO0oo = null;
                return;
            case 4:
            default:
                super.onAnimationEnd(animator);
                return;
            case 5:
                ((AbstractC1358oo0000o0) this.OooO0O0).OooOOO();
                animator.removeListener(this);
                return;
            case 6:
                ((InterfaceC1474oo0O0o00) this.OooO0O0).OooO00o();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        int i = this.OooO00o;
        super.onAnimationRepeat(animator);
        switch (i) {
            case 4:
                C0763oO0O0oOO c0763oO0O0oOO = (C0763oO0O0oOO) this.OooO0O0;
                c0763oO0O0oOO.OooO0o = (c0763oO0O0oOO.OooO0o + 1) % c0763oO0O0oOO.OooO0o0.OooO0OO.length;
                c0763oO0O0oOO.OooO0oO = true;
                return;
            default:
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.OooO00o) {
            case 1:
                o000O00O o000o00o = (o000O00O) this.OooO0O0;
                ArrayList arrayList = new ArrayList(o000o00o.OooO0o0);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0291o0O00o0) arrayList.get(i)).OooO0O0(o000o00o);
                }
                return;
            case 6:
                ((InterfaceC1474oo0O0o00) this.OooO0O0).OooO0OO();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0200o00o0O(InterfaceC1474oo0O0o00 interfaceC1474oo0O0o00, View view) {
        this.OooO00o = 6;
        this.OooO0O0 = interfaceC1474oo0O0o00;
    }
}
