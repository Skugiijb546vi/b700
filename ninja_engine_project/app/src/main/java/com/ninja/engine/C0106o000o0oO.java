package com.ninja.engine;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
/* renamed from: com.ninja.engine.o000o0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106o000o0oO extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflater$Factory2C0109o000oOoo OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106o000o0oO(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo, o0O0oo00 o0o0oo00) {
        super(o0o0oo00, null);
        this.OooO = layoutInflater$Factory2C0109o000oOoo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.OooO.OooOOo(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO;
                layoutInflater$Factory2C0109o000oOoo.OooOOOo(layoutInflater$Factory2C0109o000oOoo.OooOoO0(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }
}
