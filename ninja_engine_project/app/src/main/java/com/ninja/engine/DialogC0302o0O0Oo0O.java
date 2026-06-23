package com.ninja.engine;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
/* renamed from: com.ninja.engine.o0O0Oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0302o0O0Oo0O extends Dialog implements InterfaceC0760oO0O0o0O, InterfaceC0963oOO0ooOO, InterfaceC1192oOoOO0OO {
    public androidx.lifecycle.OooO00o OooO00o;
    public final C1228oOoOo0O0 OooO0O0;
    public final androidx.activity.OooO0O0 OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0302o0O0Oo0O(Context context, int i) {
        super(context, i);
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        this.OooO0O0 = new C1228oOoOo0O0(this);
        this.OooO0OO = new androidx.activity.OooO0O0(new RunnableC0061o00000oO(8, this));
    }

    public static void OooO0O0(DialogC0302o0O0Oo0O dialogC0302o0O0Oo0O) {
        AbstractC0809oO0OooOO.OooOOOo(dialogC0302o0O0Oo0O, "this$0");
        super.onBackPressed();
    }

    @Override // com.ninja.engine.InterfaceC1192oOoOO0OO
    public final C0086o000Oo00 OooO00o() {
        return (C0086o000Oo00) this.OooO0O0.OooO0Oo;
    }

    public final androidx.lifecycle.OooO00o OooO0OO() {
        androidx.lifecycle.OooO00o oooO00o = this.OooO00o;
        if (oooO00o == null) {
            androidx.lifecycle.OooO00o oooO00o2 = new androidx.lifecycle.OooO00o(this);
            this.OooO00o = oooO00o2;
            return oooO00o2;
        }
        return oooO00o;
    }

    public final void OooO0Oo() {
        Window window = getWindow();
        AbstractC0809oO0OooOO.OooOO0o(window);
        View decorView = window.getDecorView();
        AbstractC0809oO0OooOO.OooOOOO(decorView, "window!!.decorView");
        AbstractC1091oOOoOOOO.OooOooo(decorView, this);
        Window window2 = getWindow();
        AbstractC0809oO0OooOO.OooOO0o(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0809oO0OooOO.OooOOOO(decorView2, "window!!.decorView");
        AbstractC1094oOOoOOo0.OooOOoo(decorView2, this);
        Window window3 = getWindow();
        AbstractC0809oO0OooOO.OooOO0o(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0809oO0OooOO.OooOOOO(decorView3, "window!!.decorView");
        AbstractC1137oOOoooO.OooOO0o(decorView3, this);
    }

    @Override // com.ninja.engine.InterfaceC0760oO0O0o0O
    public final androidx.lifecycle.OooO00o OooO0o0() {
        return OooO0OO();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        OooO0Oo();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.OooO0OO.OooO0O0();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0809oO0OooOO.OooOOOO(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            androidx.activity.OooO0O0 oooO0O0 = this.OooO0OO;
            oooO0O0.getClass();
            oooO0O0.OooO0o0 = onBackInvokedDispatcher;
            oooO0O0.OooO0OO(oooO0O0.OooO0oO);
        }
        this.OooO0O0.OooO0o0(bundle);
        OooO0OO().OooO0Oo(oO0O0O0o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC0809oO0OooOO.OooOOOO(onSaveInstanceState, "super.onSaveInstanceState()");
        this.OooO0O0.OooO0o(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        OooO0OO().OooO0Oo(oO0O0O0o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        OooO0OO().OooO0Oo(oO0O0O0o.ON_DESTROY);
        this.OooO00o = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        OooO0Oo();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        OooO0Oo();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        OooO0Oo();
        super.setContentView(view, layoutParams);
    }
}
