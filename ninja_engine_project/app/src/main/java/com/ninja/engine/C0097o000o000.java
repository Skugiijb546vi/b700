package com.ninja.engine;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.app.framework.core.system.JarConfig;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o000o000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097o000o000 implements InterfaceC0954oOO0oOo, InterfaceC0899oO0oooo {
    public final /* synthetic */ LayoutInflater$Factory2C0109o000oOoo OooO00o;

    public /* synthetic */ C0097o000o000(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo) {
        this.OooO00o = layoutInflater$Factory2C0109o000oOoo;
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
        this.OooO00o.OooOOOO(menuC0887oO0oo0oo);
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public boolean OooO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        Window.Callback callback = this.OooO00o.OooOO0o.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, menuC0887oO0oo0oo);
            return true;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0954oOO0oOo
    public C1536oo0OoOoO OooOO0o(View view, C1536oo0OoOoO c1536oo0OoOoO) {
        boolean z;
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        int i;
        boolean z2;
        int OooO0O0;
        int OooO0OO;
        boolean z3;
        boolean z4;
        int i2;
        C1536oo0OoOoO c1536oo0OoOoO2 = c1536oo0OoOoO;
        int OooO0Oo = c1536oo0OoOoO.OooO0Oo();
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = this.OooO00o;
        layoutInflater$Factory2C0109o000oOoo.getClass();
        int OooO0Oo2 = c1536oo0OoOoO.OooO0Oo();
        ActionBarContextView actionBarContextView = layoutInflater$Factory2C0109o000oOoo.OooOo0O;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflater$Factory2C0109o000oOoo.OooOo0O.getLayoutParams();
            if (layoutInflater$Factory2C0109o000oOoo.OooOo0O.isShown()) {
                if (layoutInflater$Factory2C0109o000oOoo.Ooooo0o == null) {
                    layoutInflater$Factory2C0109o000oOoo.Ooooo0o = new Rect();
                    layoutInflater$Factory2C0109o000oOoo.OooooO0 = new Rect();
                }
                Rect rect = layoutInflater$Factory2C0109o000oOoo.Ooooo0o;
                Rect rect2 = layoutInflater$Factory2C0109o000oOoo.OooooO0;
                rect.set(c1536oo0OoOoO.OooO0O0(), c1536oo0OoOoO.OooO0Oo(), c1536oo0OoOoO.OooO0OO(), c1536oo0OoOoO.OooO00o());
                ViewGroup viewGroup = layoutInflater$Factory2C0109o000oOoo.OooOoOO;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = AbstractC1479oo0O0oOo.OooO00o;
                    AbstractC1477oo0O0oO0.OooO00o(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC1479oo0O0oOo.OooO00o) {
                        AbstractC1479oo0O0oOo.OooO00o = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC1479oo0O0oOo.OooO0O0 = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC1479oo0O0oOo.OooO0O0.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = AbstractC1479oo0O0oOo.OooO0O0;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                C1536oo0OoOoO OooO0oo = AbstractC1460oo0O00oo.OooO0oo(layoutInflater$Factory2C0109o000oOoo.OooOoOO);
                if (OooO0oo == null) {
                    OooO0O0 = 0;
                } else {
                    OooO0O0 = OooO0oo.OooO0O0();
                }
                if (OooO0oo == null) {
                    OooO0OO = 0;
                } else {
                    OooO0OO = OooO0oo.OooO0OO();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                Context context = layoutInflater$Factory2C0109o000oOoo.OooOO0O;
                if (i3 > 0 && layoutInflater$Factory2C0109o000oOoo.OooOoo == null) {
                    View view2 = new View(context);
                    layoutInflater$Factory2C0109o000oOoo.OooOoo = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = OooO0O0;
                    layoutParams.rightMargin = OooO0OO;
                    layoutInflater$Factory2C0109o000oOoo.OooOoOO.addView(layoutInflater$Factory2C0109o000oOoo.OooOoo, -1, layoutParams);
                } else {
                    View view3 = layoutInflater$Factory2C0109o000oOoo.OooOoo;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != OooO0O0 || marginLayoutParams2.rightMargin != OooO0OO) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = OooO0O0;
                            marginLayoutParams2.rightMargin = OooO0OO;
                            layoutInflater$Factory2C0109o000oOoo.OooOoo.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = layoutInflater$Factory2C0109o000oOoo.OooOoo;
                if (view4 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && view4.getVisibility() != 0) {
                    View view5 = layoutInflater$Factory2C0109o000oOoo.OooOoo;
                    if ((view5.getWindowSystemUiVisibility() & JarConfig.DEFAULT_BUFFER_SIZE) != 0) {
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    view5.setBackgroundColor(AbstractC0809oO0OooOO.OooOoo0(context, i2));
                }
                if (!layoutInflater$Factory2C0109o000oOoo.Oooo00o && z4) {
                    OooO0Oo2 = 0;
                }
                z = z4;
                z2 = z3;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                layoutInflater$Factory2C0109o000oOoo.OooOo0O.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view6 = layoutInflater$Factory2C0109o000oOoo.OooOoo;
        if (view6 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view6.setVisibility(i);
        }
        if (OooO0Oo != OooO0Oo2) {
            int OooO0O02 = c1536oo0OoOoO.OooO0O0();
            int OooO0OO2 = c1536oo0OoOoO.OooO0OO();
            int OooO00o = c1536oo0OoOoO.OooO00o();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                c1523oo0Oo0o0 = new C1525oo0Oo0oo(c1536oo0OoOoO2);
            } else if (i8 >= 29) {
                c1523oo0Oo0o0 = new C1524oo0Oo0oO(c1536oo0OoOoO2);
            } else {
                c1523oo0Oo0o0 = new C1523oo0Oo0o0(c1536oo0OoOoO2);
            }
            c1523oo0Oo0o0.OooO0oO(C0724oO00OooO.OooO0O0(OooO0O02, OooO0Oo2, OooO0OO2, OooO00o));
            c1536oo0OoOoO2 = c1523oo0Oo0o0.OooO0O0();
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        WindowInsets OooO0o = c1536oo0OoOoO2.OooO0o();
        if (OooO0o != null) {
            WindowInsets OooO0O03 = AbstractC1449oo0O000.OooO0O0(view, OooO0o);
            if (!OooO0O03.equals(OooO0o)) {
                return C1536oo0OoOoO.OooO0oO(view, OooO0O03);
            }
            return c1536oo0OoOoO2;
        }
        return c1536oo0OoOoO2;
    }
}
