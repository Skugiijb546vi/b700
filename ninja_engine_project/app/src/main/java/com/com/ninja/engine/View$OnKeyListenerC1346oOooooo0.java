package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
/* renamed from: com.ninja.engine.oOooooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC1346oOooooo0 extends AbstractC0896oO0oooO0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final C0900oO0oooo0 OooO;
    public final Context OooO0O0;
    public final MenuC0887oO0oo0oo OooO0OO;
    public final C0884oO0oo0Oo OooO0Oo;
    public final int OooO0o;
    public final boolean OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;
    public PopupWindow.OnDismissListener OooOO0o;
    public View OooOOO;
    public View OooOOO0;
    public InterfaceC0899oO0oooo OooOOOO;
    public ViewTreeObserver OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public int OooOOoo;
    public boolean OooOo0;
    public final o00O00 OooOO0 = new o00O00(3, this);
    public final View$OnAttachStateChangeListenerC0274o00ooo00 OooOO0O = new View$OnAttachStateChangeListenerC0274o00ooo00(3, this);
    public int OooOo00 = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [com.ninja.engine.oO0oooo0, com.ninja.engine.oO0OOoO] */
    public View$OnKeyListenerC1346oOooooo0(int i, int i2, Context context, View view, MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        this.OooO0O0 = context;
        this.OooO0OO = menuC0887oO0oo0oo;
        this.OooO0o0 = z;
        this.OooO0Oo = new C0884oO0oo0Oo(menuC0887oO0oo0oo, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.OooO0oO = i;
        this.OooO0oo = i2;
        Resources resources = context.getResources();
        this.OooO0o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.OooOOO0 = view;
        this.OooO = new C0781oO0OOoO(context, null, i, i2);
        menuC0887oO0oo0oo.OooO0O0(this, context);
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO(boolean z) {
        this.OooOOo = false;
        C0884oO0oo0Oo c0884oO0oo0Oo = this.OooO0Oo;
        if (c0884oO0oo0Oo != null) {
            c0884oO0oo0Oo.notifyDataSetChanged();
        }
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final boolean OooO00o() {
        if (!this.OooOOo0 && this.OooO.OooOoO.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        if (menuC0887oO0oo0oo != this.OooO0OO) {
            return;
        }
        dismiss();
        InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooOOOO;
        if (interfaceC0899oO0oooo != null) {
            interfaceC0899oO0oooo.OooO0O0(menuC0887oO0oo0oo, z);
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0OO(SubMenuC1265oOoo0O subMenuC1265oOoo0O) {
        if (subMenuC1265oOoo0O.hasVisibleItems()) {
            View view = this.OooOOO;
            C0897oO0oooOO c0897oO0oooOO = new C0897oO0oooOO(this.OooO0oO, this.OooO0oo, this.OooO0O0, view, subMenuC1265oOoo0O, this.OooO0o0);
            InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooOOOO;
            c0897oO0oooOO.OooO = interfaceC0899oO0oooo;
            AbstractC0896oO0oooO0 abstractC0896oO0oooO0 = c0897oO0oooOO.OooOO0;
            if (abstractC0896oO0oooO0 != null) {
                abstractC0896oO0oooO0.OooOOO0(interfaceC0899oO0oooo);
            }
            boolean OooOo = AbstractC0896oO0oooO0.OooOo(subMenuC1265oOoo0O);
            c0897oO0oooOO.OooO0oo = OooOo;
            AbstractC0896oO0oooO0 abstractC0896oO0oooO02 = c0897oO0oooOO.OooOO0;
            if (abstractC0896oO0oooO02 != null) {
                abstractC0896oO0oooO02.OooOOo(OooOo);
            }
            c0897oO0oooOO.OooOO0O = this.OooOO0o;
            this.OooOO0o = null;
            this.OooO0OO.OooO0OO(false);
            C0900oO0oooo0 c0900oO0oooo0 = this.OooO;
            int i = c0900oO0oooo0.OooO0o;
            int OooOO0o = c0900oO0oooo0.OooOO0o();
            if ((Gravity.getAbsoluteGravity(this.OooOo00, this.OooOOO0.getLayoutDirection()) & 7) == 5) {
                i += this.OooOOO0.getWidth();
            }
            if (!c0897oO0oooOO.OooO0O0()) {
                if (c0897oO0oooOO.OooO0o != null) {
                    c0897oO0oooOO.OooO0Oo(i, OooOO0o, true, true);
                }
            }
            InterfaceC0899oO0oooo interfaceC0899oO0oooo2 = this.OooOOOO;
            if (interfaceC0899oO0oooo2 != null) {
                interfaceC0899oO0oooo2.OooO0o(subMenuC1265oOoo0O);
            }
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final void OooO0Oo() {
        View view;
        boolean z;
        Rect rect;
        if (!OooO00o()) {
            if (!this.OooOOo0 && (view = this.OooOOO0) != null) {
                this.OooOOO = view;
                C0900oO0oooo0 c0900oO0oooo0 = this.OooO;
                c0900oO0oooo0.OooOoO.setOnDismissListener(this);
                c0900oO0oooo0.OooOOOo = this;
                c0900oO0oooo0.OooOoO0 = true;
                c0900oO0oooo0.OooOoO.setFocusable(true);
                View view2 = this.OooOOO;
                if (this.OooOOOo == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.OooOOOo = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.OooOO0);
                }
                view2.addOnAttachStateChangeListener(this.OooOO0O);
                c0900oO0oooo0.OooOOOO = view2;
                c0900oO0oooo0.OooOO0o = this.OooOo00;
                boolean z2 = this.OooOOo;
                Context context = this.OooO0O0;
                C0884oO0oo0Oo c0884oO0oo0Oo = this.OooO0Oo;
                if (!z2) {
                    this.OooOOoo = AbstractC0896oO0oooO0.OooOOOo(c0884oO0oo0Oo, context, this.OooO0o);
                    this.OooOOo = true;
                }
                c0900oO0oooo0.OooOOOo(this.OooOOoo);
                c0900oO0oooo0.OooOoO.setInputMethodMode(2);
                Rect rect2 = this.OooO00o;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                c0900oO0oooo0.OooOo = rect;
                c0900oO0oooo0.OooO0Oo();
                C0432o0Oo0ooO c0432o0Oo0ooO = c0900oO0oooo0.OooO0OO;
                c0432o0Oo0ooO.setOnKeyListener(this);
                if (this.OooOo0) {
                    MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO0OO;
                    if (menuC0887oO0oo0oo.OooOOO0 != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0432o0Oo0ooO, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(menuC0887oO0oo0oo.OooOOO0);
                        }
                        frameLayout.setEnabled(false);
                        c0432o0Oo0ooO.addHeaderView(frameLayout, null, false);
                    }
                }
                c0900oO0oooo0.OooOOO(c0884oO0oo0Oo);
                c0900oO0oooo0.OooO0Oo();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final C0432o0Oo0ooO OooO0oO() {
        return this.OooO.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOO0O() {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final Parcelable OooOO0o() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooOOO0(InterfaceC0899oO0oooo interfaceC0899oO0oooo) {
        this.OooOOOO = interfaceC0899oO0oooo;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOo(boolean z) {
        this.OooO0Oo.OooO0OO = z;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOo0(View view) {
        this.OooOOO0 = view;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOoo(int i) {
        this.OooOo00 = i;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo0(PopupWindow.OnDismissListener onDismissListener) {
        this.OooOO0o = onDismissListener;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo00(int i) {
        this.OooO.OooO0o = i;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo0O(boolean z) {
        this.OooOo0 = z;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo0o(int i) {
        this.OooO.OooO0oo(i);
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final void dismiss() {
        if (OooO00o()) {
            this.OooO.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.OooOOo0 = true;
        this.OooO0OO.OooO0OO(true);
        ViewTreeObserver viewTreeObserver = this.OooOOOo;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.OooOOOo = this.OooOOO.getViewTreeObserver();
            }
            this.OooOOOo.removeGlobalOnLayoutListener(this.OooOO0);
            this.OooOOOo = null;
        }
        this.OooOOO.removeOnAttachStateChangeListener(this.OooOO0O);
        PopupWindow.OnDismissListener onDismissListener = this.OooOO0o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o(Parcelable parcelable) {
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOOO(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
    }
}
