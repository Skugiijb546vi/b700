package com.ninja.engine;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o00ooo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC0274o00ooo00 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ View$OnAttachStateChangeListenerC0274o00ooo00(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                return;
            case 1:
                C0495o0o000O0 c0495o0o000O0 = (C0495o0o000O0) obj;
                if (c0495o0o000O0.OooOo0 != null && (accessibilityManager = c0495o0o000O0.OooOo00) != null) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (c0495o0o000O0.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new accessibility_AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo(c0495o0o000O0.OooOo0));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
                AbstractC1449oo0O000.OooO0OO(view2);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.OooO00o) {
            case 0:
                View$OnKeyListenerC0276o00ooo0o view$OnKeyListenerC0276o00ooo0o = (View$OnKeyListenerC0276o00ooo0o) this.OooO0O0;
                ViewTreeObserver viewTreeObserver = view$OnKeyListenerC0276o00ooo0o.OooOoO0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        view$OnKeyListenerC0276o00ooo0o.OooOoO0 = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC0276o00ooo0o.OooOoO0.removeGlobalOnLayoutListener(view$OnKeyListenerC0276o00ooo0o.OooOO0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                C0495o0o000O0 c0495o0o000O0 = (C0495o0o000O0) this.OooO0O0;
                C0435o0OoO000 c0435o0OoO000 = c0495o0o000O0.OooOo0;
                if (c0435o0OoO000 != null && (accessibilityManager = c0495o0o000O0.OooOo00) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new accessibility_AccessibilityManager$TouchExplorationStateChangeListenerC0029OooOooo(c0435o0OoO000));
                    return;
                }
                return;
            case 2:
                return;
            default:
                View$OnKeyListenerC1346oOooooo0 view$OnKeyListenerC1346oOooooo0 = (View$OnKeyListenerC1346oOooooo0) this.OooO0O0;
                ViewTreeObserver viewTreeObserver2 = view$OnKeyListenerC1346oOooooo0.OooOOOo;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        view$OnKeyListenerC1346oOooooo0.OooOOOo = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC1346oOooooo0.OooOOOo.removeGlobalOnLayoutListener(view$OnKeyListenerC1346oOooooo0.OooOO0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void OooO00o(View view) {
    }

    private final void OooO0O0(View view) {
    }

    private final void OooO0OO(View view) {
    }
}


