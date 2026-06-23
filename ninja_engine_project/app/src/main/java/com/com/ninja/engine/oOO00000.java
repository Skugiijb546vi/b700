package com.ninja.engine;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
/* loaded from: classes.dex */
public class oOO00000 extends AbstractC0104o000o0o implements Menu {
    public final MenuC0887oO0oo0oo OooO0OO;

    public oOO00000(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        super(context);
        if (menuC0887oO0oo0oo != null) {
            this.OooO0OO = menuC0887oO0oo0oo;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO(this.OooO0OO.add(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.OooO0OO.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = OooO(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.OooO0OO.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0O0;
        if (c1218oOoOOoo != null) {
            c1218oOoOOoo.clear();
        }
        this.OooO0OO.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.OooO0OO.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return OooO(this.OooO0OO.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return OooO(this.OooO0OO.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.OooO0OO.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.OooO0OO.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.OooO0OO.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.OooO0OO.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C1218oOoOOoo) this.OooO0O0) != null) {
            int i2 = 0;
            while (true) {
                C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0O0;
                if (i2 >= c1218oOoOOoo.OooO0OO) {
                    break;
                }
                if (((InterfaceMenuItemC1272oOoo0OOo) c1218oOoOOoo.OooO0o(i2)).getGroupId() == i) {
                    ((C1218oOoOOoo) this.OooO0O0).OooO0oo(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.OooO0OO.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C1218oOoOOoo) this.OooO0O0) != null) {
            int i2 = 0;
            while (true) {
                C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0O0;
                if (i2 >= c1218oOoOOoo.OooO0OO) {
                    break;
                } else if (((InterfaceMenuItemC1272oOoo0OOo) c1218oOoOOoo.OooO0o(i2)).getItemId() == i) {
                    ((C1218oOoOOoo) this.OooO0O0).OooO0oo(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.OooO0OO.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.OooO0OO.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.OooO0OO.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.OooO0OO.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.OooO0OO.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.OooO0OO.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO(this.OooO0OO.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.OooO0OO.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO(this.OooO0OO.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.OooO0OO.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO(this.OooO0OO.add(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.OooO0OO.addSubMenu(charSequence);
    }
}
