package com.ninja.engine;

import android.view.MenuItem;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.oOooo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItem$OnMenuItemClickListenerC1323oOooo00 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] OooO0Oo = {MenuItem.class};
    public final /* synthetic */ int OooO00o = 0;
    public Object OooO0O0;
    public Object OooO0OO;

    public /* synthetic */ MenuItem$OnMenuItemClickListenerC1323oOooo00() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.OooO00o) {
            case 0:
                Method method = (Method) this.OooO0OO;
                try {
                    Class<?> returnType = method.getReturnType();
                    Class<?> cls = Boolean.TYPE;
                    Object obj = this.OooO0O0;
                    if (returnType == cls) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.OooO0O0).onMenuItemClick(((MenuItemC1166oOo00o0O) this.OooO0OO).OooO(menuItem));
        }
    }

    public MenuItem$OnMenuItemClickListenerC1323oOooo00(MenuItemC1166oOo00o0O menuItemC1166oOo00o0O, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.OooO0OO = menuItemC1166oOo00o0O;
        this.OooO0O0 = onMenuItemClickListener;
    }
}


