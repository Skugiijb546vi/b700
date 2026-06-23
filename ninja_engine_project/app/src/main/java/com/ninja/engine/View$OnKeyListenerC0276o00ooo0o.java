package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o00ooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0276o00ooo0o extends AbstractC0896oO0oooO0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final boolean OooO0o;
    public final int OooO0o0;
    public final Handler OooO0oO;
    public View OooOOOO;
    public View OooOOOo;
    public boolean OooOOo;
    public int OooOOo0;
    public boolean OooOOoo;
    public InterfaceC0899oO0oooo OooOo;
    public int OooOo0;
    public int OooOo00;
    public boolean OooOo0o;
    public PopupWindow.OnDismissListener OooOoO;
    public ViewTreeObserver OooOoO0;
    public boolean OooOoOO;
    public final ArrayList OooO0oo = new ArrayList();
    public final ArrayList OooO = new ArrayList();
    public final o00O00 OooOO0 = new o00O00(2, this);
    public final View$OnAttachStateChangeListenerC0274o00ooo00 OooOO0O = new View$OnAttachStateChangeListenerC0274o00ooo00(0, this);
    public final o00O OooOO0o = new o00O(5, this);
    public int OooOOO0 = 0;
    public int OooOOO = 0;
    public boolean OooOo0O = false;

    public View$OnKeyListenerC0276o00ooo0o(Context context, View view, int i, int i2, boolean z) {
        this.OooO0O0 = context;
        this.OooOOOO = view;
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = z;
        this.OooOOo0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.OooO0OO = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.OooO0oO = new Handler();
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO(boolean z) {
        Iterator it = this.OooO.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0275o00ooo0O) it.next()).OooO00o.OooO0OO.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0884oO0oo0Oo) adapter).notifyDataSetChanged();
        }
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final boolean OooO00o() {
        ArrayList arrayList = this.OooO;
        if (arrayList.size() <= 0 || !((C0275o00ooo0O) arrayList.get(0)).OooO00o.OooOoO.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        int i;
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (menuC0887oO0oo0oo == ((C0275o00ooo0O) arrayList.get(i2)).OooO0O0) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0275o00ooo0O) arrayList.get(i3)).OooO0O0.OooO0OO(false);
        }
        C0275o00ooo0O c0275o00ooo0O = (C0275o00ooo0O) arrayList.remove(i2);
        c0275o00ooo0O.OooO0O0.OooOOo(this);
        boolean z2 = this.OooOoOO;
        C0900oO0oooo0 c0900oO0oooo0 = c0275o00ooo0O.OooO00o;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC1171oOo00oo0.OooO0O0(c0900oO0oooo0.OooOoO, null);
            } else {
                c0900oO0oooo0.getClass();
            }
            c0900oO0oooo0.OooOoO.setAnimationStyle(0);
        }
        c0900oO0oooo0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i = ((C0275o00ooo0O) arrayList.get(size2 - 1)).OooO0OO;
        } else if (this.OooOOOO.getLayoutDirection() == 1) {
            i = 0;
        } else {
            i = 1;
        }
        this.OooOOo0 = i;
        if (size2 == 0) {
            dismiss();
            InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooOo;
            if (interfaceC0899oO0oooo != null) {
                interfaceC0899oO0oooo.OooO0O0(menuC0887oO0oo0oo, true);
            }
            ViewTreeObserver viewTreeObserver = this.OooOoO0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.OooOoO0.removeGlobalOnLayoutListener(this.OooOO0);
                }
                this.OooOoO0 = null;
            }
            this.OooOOOo.removeOnAttachStateChangeListener(this.OooOO0O);
            this.OooOoO.onDismiss();
        } else if (z) {
            ((C0275o00ooo0O) arrayList.get(0)).OooO0O0.OooO0OO(false);
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0OO(SubMenuC1265oOoo0O subMenuC1265oOoo0O) {
        Iterator it = this.OooO.iterator();
        while (it.hasNext()) {
            C0275o00ooo0O c0275o00ooo0O = (C0275o00ooo0O) it.next();
            if (subMenuC1265oOoo0O == c0275o00ooo0O.OooO0O0) {
                c0275o00ooo0O.OooO00o.OooO0OO.requestFocus();
                return true;
            }
        }
        if (subMenuC1265oOoo0O.hasVisibleItems()) {
            OooOOOO(subMenuC1265oOoo0O);
            InterfaceC0899oO0oooo interfaceC0899oO0oooo = this.OooOo;
            if (interfaceC0899oO0oooo != null) {
                interfaceC0899oO0oooo.OooO0o(subMenuC1265oOoo0O);
            }
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final void OooO0Oo() {
        boolean z;
        if (OooO00o()) {
            return;
        }
        ArrayList arrayList = this.OooO0oo;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOoO0((MenuC0887oO0oo0oo) it.next());
        }
        arrayList.clear();
        View view = this.OooOOOO;
        this.OooOOOo = view;
        if (view != null) {
            if (this.OooOoO0 == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.OooOoO0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.OooOO0);
            }
            this.OooOOOo.addOnAttachStateChangeListener(this.OooOO0O);
        }
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final C0432o0Oo0ooO OooO0oO() {
        ArrayList arrayList = this.OooO;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0275o00ooo0O) arrayList.get(arrayList.size() - 1)).OooO00o.OooO0OO;
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
        this.OooOo = interfaceC0899oO0oooo;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOOO(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        menuC0887oO0oo0oo.OooO0O0(this, this.OooO0O0);
        if (OooO00o()) {
            OooOoO0(menuC0887oO0oo0oo);
        } else {
            this.OooO0oo.add(menuC0887oO0oo0oo);
        }
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOo(boolean z) {
        this.OooOo0O = z;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOo0(View view) {
        if (this.OooOOOO != view) {
            this.OooOOOO = view;
            this.OooOOO = Gravity.getAbsoluteGravity(this.OooOOO0, view.getLayoutDirection());
        }
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOOoo(int i) {
        if (this.OooOOO0 != i) {
            this.OooOOO0 = i;
            this.OooOOO = Gravity.getAbsoluteGravity(i, this.OooOOOO.getLayoutDirection());
        }
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo0(PopupWindow.OnDismissListener onDismissListener) {
        this.OooOoO = onDismissListener;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo00(int i) {
        this.OooOOo = true;
        this.OooOo00 = i;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo0O(boolean z) {
        this.OooOo0o = z;
    }

    @Override // com.ninja.engine.AbstractC0896oO0oooO0
    public final void OooOo0o(int i) {
        this.OooOOoo = true;
        this.OooOo0 = i;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [com.ninja.engine.oO0oooo0, com.ninja.engine.oO0OOoO] */
    public final void OooOoO0(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        View view;
        C0275o00ooo0O c0275o00ooo0O;
        Rect rect;
        int i;
        boolean z;
        char c;
        int i2;
        int i3;
        int i4;
        MenuItem menuItem;
        C0884oO0oo0Oo c0884oO0oo0Oo;
        int i5;
        int i6;
        int firstVisiblePosition;
        Context context = this.OooO0O0;
        LayoutInflater from = LayoutInflater.from(context);
        C0884oO0oo0Oo c0884oO0oo0Oo2 = new C0884oO0oo0Oo(menuC0887oO0oo0oo, from, this.OooO0o, R.layout.abc_cascading_menu_item_layout);
        if (!OooO00o() && this.OooOo0O) {
            c0884oO0oo0Oo2.OooO0OO = true;
        } else if (OooO00o()) {
            c0884oO0oo0Oo2.OooO0OO = AbstractC0896oO0oooO0.OooOo(menuC0887oO0oo0oo);
        }
        int OooOOOo = AbstractC0896oO0oooO0.OooOOOo(c0884oO0oo0Oo2, context, this.OooO0OO);
        C0781oO0OOoO c0781oO0OOoO = new C0781oO0OOoO(context, null, this.OooO0Oo, this.OooO0o0);
        C0120o000oooO c0120o000oooO = c0781oO0OOoO.OooOoO;
        c0781oO0OOoO.OooOooO = this.OooOO0o;
        c0781oO0OOoO.OooOOOo = this;
        c0120o000oooO.setOnDismissListener(this);
        c0781oO0OOoO.OooOOOO = this.OooOOOO;
        c0781oO0OOoO.OooOO0o = this.OooOOO;
        c0781oO0OOoO.OooOoO0 = true;
        c0120o000oooO.setFocusable(true);
        c0120o000oooO.setInputMethodMode(2);
        c0781oO0OOoO.OooOOO(c0884oO0oo0Oo2);
        c0781oO0OOoO.OooOOOo(OooOOOo);
        c0781oO0OOoO.OooOO0o = this.OooOOO;
        ArrayList arrayList = this.OooO;
        if (arrayList.size() > 0) {
            c0275o00ooo0O = (C0275o00ooo0O) arrayList.get(arrayList.size() - 1);
            MenuC0887oO0oo0oo menuC0887oO0oo0oo2 = c0275o00ooo0O.OooO0O0;
            int size = menuC0887oO0oo0oo2.OooO0o.size();
            int i7 = 0;
            while (true) {
                if (i7 < size) {
                    menuItem = menuC0887oO0oo0oo2.getItem(i7);
                    if (menuItem.hasSubMenu() && menuC0887oO0oo0oo == menuItem.getSubMenu()) {
                        break;
                    }
                    i7++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C0432o0Oo0ooO c0432o0Oo0ooO = c0275o00ooo0O.OooO00o.OooO0OO;
                ListAdapter adapter = c0432o0Oo0ooO.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i5 = headerViewListAdapter.getHeadersCount();
                    c0884oO0oo0Oo = (C0884oO0oo0Oo) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0884oO0oo0Oo = (C0884oO0oo0Oo) adapter;
                    i5 = 0;
                }
                int count = c0884oO0oo0Oo.getCount();
                int i8 = 0;
                while (true) {
                    if (i8 < count) {
                        if (menuItem == c0884oO0oo0Oo.getItem(i8)) {
                            i6 = -1;
                            break;
                        }
                        i8++;
                    } else {
                        i6 = -1;
                        i8 = -1;
                        break;
                    }
                }
                if (i8 == i6 || (firstVisiblePosition = (i8 + i5) - c0432o0Oo0ooO.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= c0432o0Oo0ooO.getChildCount()) {
                    view = null;
                } else {
                    view = c0432o0Oo0ooO.getChildAt(firstVisiblePosition);
                }
            }
        } else {
            view = null;
            c0275o00ooo0O = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C0900oO0oooo0.OooOooo;
                if (method != null) {
                    try {
                        method.invoke(c0120o000oooO, Boolean.FALSE);
                    } catch (Exception unused) {
                    }
                }
            } else {
                AbstractC0898oO0oooOo.OooO00o(c0120o000oooO, false);
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23) {
                AbstractC1171oOo00oo0.OooO00o(c0120o000oooO, null);
            }
            C0432o0Oo0ooO c0432o0Oo0ooO2 = ((C0275o00ooo0O) arrayList.get(arrayList.size() - 1)).OooO00o.OooO0OO;
            int[] iArr = new int[2];
            c0432o0Oo0ooO2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.OooOOOo.getWindowVisibleDisplayFrame(rect2);
            if (this.OooOOo0 != 1 ? iArr[0] - OooOOOo >= 0 : c0432o0Oo0ooO2.getWidth() + iArr[0] + OooOOOo > rect2.right) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            this.OooOOo0 = i;
            if (i9 >= 26) {
                c0781oO0OOoO.OooOOOO = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.OooOOOO.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.OooOOO & 7) == 5) {
                    c = 0;
                    iArr2[0] = this.OooOOOO.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c = 0;
                }
                i2 = iArr3[c] - iArr2[c];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.OooOOO & 5) == 5) {
                if (z) {
                    i4 = i2 + OooOOOo;
                } else {
                    i4 = i2 - view.getWidth();
                }
            } else if (z) {
                i4 = i2 + view.getWidth();
            } else {
                i4 = i2 - OooOOOo;
            }
            c0781oO0OOoO.OooO0o = i4;
            c0781oO0OOoO.OooOO0O = true;
            c0781oO0OOoO.OooOO0 = true;
            c0781oO0OOoO.OooO0oo(i3);
        } else {
            if (this.OooOOo) {
                c0781oO0OOoO.OooO0o = this.OooOo00;
            }
            if (this.OooOOoo) {
                c0781oO0OOoO.OooO0oo(this.OooOo0);
            }
            Rect rect3 = this.OooO00o;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            c0781oO0OOoO.OooOo = rect;
        }
        arrayList.add(new C0275o00ooo0O(c0781oO0OOoO, menuC0887oO0oo0oo, this.OooOOo0));
        c0781oO0OOoO.OooO0Oo();
        C0432o0Oo0ooO c0432o0Oo0ooO3 = c0781oO0OOoO.OooO0OO;
        c0432o0Oo0ooO3.setOnKeyListener(this);
        if (c0275o00ooo0O == null && this.OooOo0o && menuC0887oO0oo0oo.OooOOO0 != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0432o0Oo0ooO3, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuC0887oO0oo0oo.OooOOO0);
            c0432o0Oo0ooO3.addHeaderView(frameLayout, null, false);
            c0781oO0OOoO.OooO0Oo();
        }
    }

    @Override // com.ninja.engine.InterfaceC1216oOoOOoOO
    public final void dismiss() {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        if (size > 0) {
            C0275o00ooo0O[] c0275o00ooo0OArr = (C0275o00ooo0O[]) arrayList.toArray(new C0275o00ooo0O[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0275o00ooo0O c0275o00ooo0O = c0275o00ooo0OArr[i];
                if (c0275o00ooo0O.OooO00o.OooOoO.isShowing()) {
                    c0275o00ooo0O.OooO00o.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0275o00ooo0O c0275o00ooo0O;
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c0275o00ooo0O = (C0275o00ooo0O) arrayList.get(i);
                if (!c0275o00ooo0O.OooO00o.OooOoO.isShowing()) {
                    break;
                }
                i++;
            } else {
                c0275o00ooo0O = null;
                break;
            }
        }
        if (c0275o00ooo0O != null) {
            c0275o00ooo0O.OooO0O0.OooO0OO(false);
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
}

