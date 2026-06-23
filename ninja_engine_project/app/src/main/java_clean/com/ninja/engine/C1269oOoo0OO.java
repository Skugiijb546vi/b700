package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oOoo0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269oOoo0OO {
    public int OooO;
    public final Menu OooO00o;
    public boolean OooO0oo;
    public int OooOO0;
    public CharSequence OooOO0O;
    public CharSequence OooOO0o;
    public char OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public char OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public boolean OooOOoo;
    public String OooOo;
    public boolean OooOo0;
    public boolean OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public ActionProvider$VisibilityListenerC0888oO0ooO OooOoO;
    public String OooOoO0;
    public CharSequence OooOoOO;
    public CharSequence OooOoo0;
    public final /* synthetic */ C1271oOoo0OOO OooOooo;
    public ColorStateList OooOoo = null;
    public PorterDuff.Mode OooOooO = null;
    public int OooO0O0 = 0;
    public int OooO0OO = 0;
    public int OooO0Oo = 0;
    public int OooO0o0 = 0;
    public boolean OooO0o = true;
    public boolean OooO0oO = true;

    public C1269oOoo0OO(C1271oOoo0OOO c1271oOoo0OOO, Menu menu) {
        this.OooOooo = c1271oOoo0OOO;
        this.OooO00o = menu;
    }

    public final Object OooO00o(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.OooOooo.OooO0OO.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void OooO0O0(MenuItem menuItem) {
        boolean z;
        MenuItem enabled = menuItem.setChecked(this.OooOOoo).setVisible(this.OooOo00).setEnabled(this.OooOo0);
        boolean z2 = false;
        if (this.OooOOo >= 1) {
            z = true;
        } else {
            z = false;
        }
        enabled.setCheckable(z).setTitleCondensed(this.OooOO0o).setIcon(this.OooOOO0);
        int i = this.OooOo0O;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.OooOoO0;
        C1271oOoo0OOO c1271oOoo0OOO = this.OooOooo;
        if (str != null) {
            if (!c1271oOoo0OOO.OooO0OO.isRestricted()) {
                if (c1271oOoo0OOO.OooO0Oo == null) {
                    c1271oOoo0OOO.OooO0Oo = C1271oOoo0OOO.OooO00o(c1271oOoo0OOO.OooO0OO);
                }
                Object obj = c1271oOoo0OOO.OooO0Oo;
                String str2 = this.OooOoO0;
                MenuItem$OnMenuItemClickListenerC1323oOooo00 menuItem$OnMenuItemClickListenerC1323oOooo00 = new MenuItem$OnMenuItemClickListenerC1323oOooo00();
                menuItem$OnMenuItemClickListenerC1323oOooo00.OooO0O0 = obj;
                Class<?> cls = obj.getClass();
                try {
                    menuItem$OnMenuItemClickListenerC1323oOooo00.OooO0OO = cls.getMethod(str2, MenuItem$OnMenuItemClickListenerC1323oOooo00.OooO0Oo);
                    menuItem.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC1323oOooo00);
                } catch (Exception e) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.OooOOo >= 2) {
            if (menuItem instanceof C0892oO0ooO0o) {
                ((C0892oO0ooO0o) menuItem).OooO0oO(true);
            } else if (menuItem instanceof MenuItemC1166oOo00o0O) {
                MenuItemC1166oOo00o0O menuItemC1166oOo00o0O = (MenuItemC1166oOo00o0O) menuItem;
                try {
                    Method method = menuItemC1166oOo00o0O.OooO0Oo;
                    InterfaceMenuItemC1272oOoo0OOo interfaceMenuItemC1272oOoo0OOo = menuItemC1166oOo00o0O.OooO0OO;
                    if (method == null) {
                        menuItemC1166oOo00o0O.OooO0Oo = interfaceMenuItemC1272oOoo0OOo.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1166oOo00o0O.OooO0Oo.invoke(interfaceMenuItemC1272oOoo0OOo, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.OooOo;
        if (str3 != null) {
            menuItem.setActionView((View) OooO00o(str3, C1271oOoo0OOO.OooO0o0, c1271oOoo0OOO.OooO00o));
            z2 = true;
        }
        int i2 = this.OooOo0o;
        if (i2 > 0 && !z2) {
            menuItem.setActionView(i2);
        }
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO = this.OooOoO;
        if (actionProvider$VisibilityListenerC0888oO0ooO != null && (menuItem instanceof InterfaceMenuItemC1272oOoo0OOo)) {
            ((InterfaceMenuItemC1272oOoo0OOo) menuItem).OooO0O0(actionProvider$VisibilityListenerC0888oO0ooO);
        }
        CharSequence charSequence = this.OooOoOO;
        boolean z3 = menuItem instanceof InterfaceMenuItemC1272oOoo0OOo;
        if (z3) {
            ((InterfaceMenuItemC1272oOoo0OOo) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0889oO0ooO0.OooO0o(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.OooOoo0;
        if (z3) {
            ((InterfaceMenuItemC1272oOoo0OOo) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0889oO0ooO0.OooOOO(menuItem, charSequence2);
        }
        char c = this.OooOOO;
        int i3 = this.OooOOOO;
        if (z3) {
            ((InterfaceMenuItemC1272oOoo0OOo) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0889oO0ooO0.OooO0Oo(menuItem, c, i3);
        }
        char c2 = this.OooOOOo;
        int i4 = this.OooOOo0;
        if (z3) {
            ((InterfaceMenuItemC1272oOoo0OOo) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0889oO0ooO0.OooOO0(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.OooOooO;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC1272oOoo0OOo) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0889oO0ooO0.OooO(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.OooOoo;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC1272oOoo0OOo) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0889oO0ooO0.OooO0oo(menuItem, colorStateList);
            }
        }
    }
}


