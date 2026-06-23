package com.ninja.engine;

import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
/* renamed from: com.ninja.engine.oO0o000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnTouchListenerC0816oO0o000O implements View.OnTouchListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ AppCompatSpinner OooO0O0;
    public final /* synthetic */ AbstractComponentCallbacksC0593o0oOoOo0 OooO0OO;

    public /* synthetic */ View$OnTouchListenerC0816oO0o000O(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, AppCompatSpinner appCompatSpinner, int i) {
        this.OooO00o = i;
        this.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0;
        this.OooO0O0 = appCompatSpinner;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.OooO00o) {
            case 0:
                C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO0OO;
                c0829oO0o0Ooo.getClass();
                this.OooO0O0.setOnItemSelectedListener(new oO0OOO(1, c0829oO0o0Ooo));
                return false;
            default:
                C1201oOoOOO0O c1201oOoOOO0O = (C1201oOoOOO0O) this.OooO0OO;
                c1201oOoOOO0O.getClass();
                this.OooO0O0.setOnItemSelectedListener(new oO0OOO(2, c1201oOoOOO0O));
                return false;
        }
    }
}


