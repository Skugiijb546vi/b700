package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o000o0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class Window$CallbackC0102o000o0OO implements Window.Callback {
    public final Window.Callback OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public final /* synthetic */ LayoutInflater$Factory2C0109o000oOoo OooO0o0;

    public Window$CallbackC0102o000o0OO(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo, Window.Callback callback) {
        this.OooO0o0 = layoutInflater$Factory2C0109o000oOoo;
        if (callback != null) {
            this.OooO00o = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void OooO00o(Window.Callback callback) {
        try {
            this.OooO0O0 = true;
            callback.onContentChanged();
        } finally {
            this.OooO0O0 = false;
        }
    }

    public final boolean OooO0O0(int i, Menu menu) {
        return this.OooO00o.onMenuOpened(i, menu);
    }

    public final void OooO0OO(int i, Menu menu) {
        this.OooO00o.onPanelClosed(i, menu);
    }

    public final void OooO0Oo(List list, Menu menu, int i) {
        AbstractC1506oo0OOo0o.OooO00o(this.OooO00o, list, menu, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.ninja.engine.oO0oo0o0, com.ninja.engine.oOoOoo0o, com.ninja.engine.o00000O, java.lang.Object] */
    public final C1281oOoo0oO OooO0o0(ActionMode.Callback callback) {
        boolean z;
        ViewGroup viewGroup;
        Context context;
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO0o0;
        oOO00OOO ooo00ooo = new oOO00OOO(layoutInflater$Factory2C0109o000oOoo.OooOO0O, callback);
        o00000O o00000o = layoutInflater$Factory2C0109o000oOoo.OooOo0;
        if (o00000o != null) {
            o00000o.OooO0O0();
        }
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(layoutInflater$Factory2C0109o000oOoo, 4, ooo00ooo);
        layoutInflater$Factory2C0109o000oOoo.OooOoO();
        C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
        if (c1511oo0OOoo0 != null) {
            C1509oo0OOoOo c1509oo0OOoOo = c1511oo0OOoo0.OooOoo0;
            if (c1509oo0OOoOo != null) {
                c1509oo0OOoOo.OooO0O0();
            }
            c1511oo0OOoo0.OooOo0O.setHideOnContentScrollEnabled(false);
            c1511oo0OOoo0.OooOoO0.OooO0o0();
            C1509oo0OOoOo c1509oo0OOoOo2 = new C1509oo0OOoOo(c1511oo0OOoo0, c1511oo0OOoo0.OooOoO0.getContext(), c0415o0Oo0O0O);
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = c1509oo0OOoOo2.OooO0Oo;
            menuC0887oO0oo0oo.OooOo0o();
            try {
                if (c1509oo0OOoOo2.OooO0o0.OooO0O0(c1509oo0OOoOo2, menuC0887oO0oo0oo)) {
                    c1511oo0OOoo0.OooOoo0 = c1509oo0OOoOo2;
                    c1509oo0OOoOo2.OooO0oo();
                    c1511oo0OOoo0.OooOoO0.OooO0OO(c1509oo0OOoOo2);
                    c1511oo0OOoo0.o000oOoO(true);
                } else {
                    c1509oo0OOoOo2 = null;
                }
                layoutInflater$Factory2C0109o000oOoo.OooOo0 = c1509oo0OOoOo2;
            } finally {
                menuC0887oO0oo0oo.OooOo0O();
            }
        }
        if (layoutInflater$Factory2C0109o000oOoo.OooOo0 == null) {
            C1470oo0O0OoO c1470oo0O0OoO = layoutInflater$Factory2C0109o000oOoo.OooOoO0;
            if (c1470oo0O0OoO != null) {
                c1470oo0O0OoO.OooO0O0();
            }
            o00000O o00000o2 = layoutInflater$Factory2C0109o000oOoo.OooOo0;
            if (o00000o2 != null) {
                o00000o2.OooO0O0();
            }
            if (layoutInflater$Factory2C0109o000oOoo.OooOOO != null) {
                boolean z2 = layoutInflater$Factory2C0109o000oOoo.OoooO00;
            }
            if (layoutInflater$Factory2C0109o000oOoo.OooOo0O == null) {
                boolean z3 = layoutInflater$Factory2C0109o000oOoo.Oooo0;
                Context context2 = layoutInflater$Factory2C0109o000oOoo.OooOO0O;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        o0O0oo00 o0o0oo00 = new o0O0oo00(context2, 0);
                        o0o0oo00.getTheme().setTo(newTheme);
                        context2 = o0o0oo00;
                    }
                    layoutInflater$Factory2C0109o000oOoo.OooOo0O = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                    layoutInflater$Factory2C0109o000oOoo.OooOo0o = popupWindow;
                    AbstractC0692o0ooooOo.Ooooo0o(popupWindow, 2);
                    layoutInflater$Factory2C0109o000oOoo.OooOo0o.setContentView(layoutInflater$Factory2C0109o000oOoo.OooOo0O);
                    layoutInflater$Factory2C0109o000oOoo.OooOo0o.setWidth(-1);
                    context2.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflater$Factory2C0109o000oOoo.OooOo0O.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    layoutInflater$Factory2C0109o000oOoo.OooOo0o.setHeight(-2);
                    layoutInflater$Factory2C0109o000oOoo.OooOo = new RunnableC0095o000Oooo(layoutInflater$Factory2C0109o000oOoo, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflater$Factory2C0109o000oOoo.OooOoOO.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflater$Factory2C0109o000oOoo.OooOoO();
                        C1511oo0OOoo0 c1511oo0OOoo02 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
                        if (c1511oo0OOoo02 != null) {
                            context = c1511oo0OOoo02.OoooOOO();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context2 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        layoutInflater$Factory2C0109o000oOoo.OooOo0O = (ActionBarContextView) viewStubCompat.OooO00o();
                    }
                }
            }
            if (layoutInflater$Factory2C0109o000oOoo.OooOo0O != null) {
                C1470oo0O0OoO c1470oo0O0OoO2 = layoutInflater$Factory2C0109o000oOoo.OooOoO0;
                if (c1470oo0O0OoO2 != null) {
                    c1470oo0O0OoO2.OooO0O0();
                }
                layoutInflater$Factory2C0109o000oOoo.OooOo0O.OooO0o0();
                Context context3 = layoutInflater$Factory2C0109o000oOoo.OooOo0O.getContext();
                ActionBarContextView actionBarContextView = layoutInflater$Factory2C0109o000oOoo.OooOo0O;
                C1249oOoOoo0o obj = new C1249oOoOoo0o();
                obj.OooO0OO = context3;
                obj.OooO0Oo = actionBarContextView;
                obj.OooO0o0 = (o00000O0) c0415o0Oo0O0O.OooO0O0;
                MenuC0887oO0oo0oo menuC0887oO0oo0oo2 = new MenuC0887oO0oo0oo(actionBarContextView.getContext());
                menuC0887oO0oo0oo2.OooOO0o = 1;
                obj.OooO0oo = menuC0887oO0oo0oo2;
                menuC0887oO0oo0oo2.OooO0o0 = obj;
                if (((o00000O0) c0415o0Oo0O0O.OooO0O0).OooO0O0(obj, menuC0887oO0oo0oo2)) {
                    obj.OooO0oo();
                    layoutInflater$Factory2C0109o000oOoo.OooOo0O.OooO0OO(obj);
                    layoutInflater$Factory2C0109o000oOoo.OooOo0 = obj;
                    if (layoutInflater$Factory2C0109o000oOoo.OooOoO && (viewGroup = layoutInflater$Factory2C0109o000oOoo.OooOoOO) != null && viewGroup.isLaidOut()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        layoutInflater$Factory2C0109o000oOoo.OooOo0O.setAlpha(0.0f);
                        C1470oo0O0OoO OooO00o = AbstractC1460oo0O00oo.OooO00o(layoutInflater$Factory2C0109o000oOoo.OooOo0O);
                        OooO00o.OooO00o(1.0f);
                        layoutInflater$Factory2C0109o000oOoo.OooOoO0 = OooO00o;
                        OooO00o.OooO0Oo(new C0098o000o00O(1, layoutInflater$Factory2C0109o000oOoo));
                    } else {
                        layoutInflater$Factory2C0109o000oOoo.OooOo0O.setAlpha(1.0f);
                        layoutInflater$Factory2C0109o000oOoo.OooOo0O.setVisibility(0);
                        if (layoutInflater$Factory2C0109o000oOoo.OooOo0O.getParent() instanceof View) {
                            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                            AbstractC1449oo0O000.OooO0OO((View) layoutInflater$Factory2C0109o000oOoo.OooOo0O.getParent());
                        }
                    }
                    if (layoutInflater$Factory2C0109o000oOoo.OooOo0o != null) {
                        layoutInflater$Factory2C0109o000oOoo.OooOO0o.getDecorView().post(layoutInflater$Factory2C0109o000oOoo.OooOo);
                    }
                } else {
                    layoutInflater$Factory2C0109o000oOoo.OooOo0 = null;
                }
            }
            layoutInflater$Factory2C0109o000oOoo.Oooo00o();
            layoutInflater$Factory2C0109o000oOoo.OooOo0 = layoutInflater$Factory2C0109o000oOoo.OooOo0;
        }
        layoutInflater$Factory2C0109o000oOoo.Oooo00o();
        o00000O o00000o3 = layoutInflater$Factory2C0109o000oOoo.OooOo0;
        if (o00000o3 == null) {
            return null;
        }
        return ooo00ooo.OooOOOo(o00000o3);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.OooO00o.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.OooO0OO;
        Window.Callback callback = this.OooO00o;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.OooO0o0.OooOOo(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r0 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r7 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.OooO00o
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            com.ninja.engine.o000oOoo r2 = r6.OooO0o0
            r2.OooOoO()
            com.ninja.engine.oo0OOoo0 r3 = r2.OooOOOO
            r4 = 0
            if (r3 == 0) goto L3d
            com.ninja.engine.oo0OOoOo r3 = r3.OooOoo0
            if (r3 != 0) goto L1d
        L1b:
            r0 = 0
            goto L39
        L1d:
            com.ninja.engine.oO0oo0oo r3 = r3.OooO0Oo
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = 1
            goto L6b
        L3d:
            com.ninja.engine.o000o0oo r0 = r2.Oooo0o
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.OooOooo(r0, r3, r7)
            if (r0 == 0) goto L52
            com.ninja.engine.o000o0oo r7 = r2.Oooo0o
            if (r7 == 0) goto L3b
            r7.OooOO0o = r1
            goto L3b
        L52:
            com.ninja.engine.o000o0oo r0 = r2.Oooo0o
            if (r0 != 0) goto L6a
            com.ninja.engine.o000o0oo r0 = r2.OooOoO0(r4)
            r2.Oooo000(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.OooOooo(r0, r3, r7)
            r0.OooOO0O = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = 0
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r1 = 0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.Window$CallbackC0102o000o0OO.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.OooO00o.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.OooO00o.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.OooO00o.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.OooO00o.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.OooO00o.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.OooO00o.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.OooO0O0) {
            this.OooO00o.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof MenuC0887oO0oo0oo)) {
            return false;
        }
        return this.OooO00o.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.OooO00o.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.OooO00o.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.OooO00o.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        OooO0O0(i, menu);
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO0o0;
        if (i == 108) {
            layoutInflater$Factory2C0109o000oOoo.OooOoO();
            C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
            if (c1511oo0OOoo0 != null && true != c1511oo0OOoo0.OooOooo) {
                c1511oo0OOoo0.OooOooo = true;
                ArrayList arrayList = c1511oo0OOoo0.Oooo000;
                if (arrayList.size() > 0) {
                    AbstractC1230oOoOo0o.OooOO0O(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            layoutInflater$Factory2C0109o000oOoo.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.OooO0Oo) {
            this.OooO00o.onPanelClosed(i, menu);
            return;
        }
        OooO0OO(i, menu);
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO0o0;
        if (i == 108) {
            layoutInflater$Factory2C0109o000oOoo.OooOoO();
            C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
            if (c1511oo0OOoo0 != null && c1511oo0OOoo0.OooOooo) {
                c1511oo0OOoo0.OooOooo = false;
                ArrayList arrayList = c1511oo0OOoo0.Oooo000;
                if (arrayList.size() > 0) {
                    AbstractC1230oOoOo0o.OooOO0O(arrayList.get(0));
                    throw null;
                }
            }
        } else if (i == 0) {
            C0107o000o0oo OooOoO0 = layoutInflater$Factory2C0109o000oOoo.OooOoO0(i);
            if (OooOoO0.OooOOO0) {
                layoutInflater$Factory2C0109o000oOoo.OooOOOo(OooOoO0, false);
            }
        } else {
            layoutInflater$Factory2C0109o000oOoo.getClass();
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC1502oo0OOo.OooO00o(this.OooO00o, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo;
        if (menu instanceof MenuC0887oO0oo0oo) {
            menuC0887oO0oo0oo = (MenuC0887oO0oo0oo) menu;
        } else {
            menuC0887oO0oo0oo = null;
        }
        if (i == 0 && menuC0887oO0oo0oo == null) {
            return false;
        }
        if (menuC0887oO0oo0oo != null) {
            menuC0887oO0oo0oo.OooOo = true;
        }
        boolean onPreparePanel = this.OooO00o.onPreparePanel(i, view, menu);
        if (menuC0887oO0oo0oo != null) {
            menuC0887oO0oo0oo.OooOo = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO0o0.OooOoO0(0).OooO0oo;
        if (menuC0887oO0oo0oo != null) {
            OooO0Oo(list, menuC0887oO0oo0oo, i);
        } else {
            OooO0Oo(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.OooO00o.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.OooO00o.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.OooO00o.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.OooO0o0.getClass();
        return OooO0o0(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1503oo0OOo0.OooO00o(this.OooO00o, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        this.OooO0o0.getClass();
        if (i != 0) {
            return AbstractC1503oo0OOo0.OooO0O0(this.OooO00o, callback, i);
        }
        return OooO0o0(callback);
    }
}



