package com.ninja.engine;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
/* renamed from: com.ninja.engine.o000o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0104o000o0o implements oOO000o {
    public Object OooO00o;
    public Object OooO0O0;

    public AbstractC0104o000o0o(int i) {
        this.OooO0O0 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.OooO0O0).add(new Object());
        }
    }

    public MenuItem OooO(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC1272oOoo0OOo) {
            InterfaceMenuItemC1272oOoo0OOo interfaceMenuItemC1272oOoo0OOo = (InterfaceMenuItemC1272oOoo0OOo) menuItem;
            if (((C1218oOoOOoo) this.OooO0O0) == null) {
                this.OooO0O0 = new C1218oOoOOoo();
            }
            MenuItem menuItem2 = (MenuItem) ((C1218oOoOOoo) this.OooO0O0).get(interfaceMenuItemC1272oOoo0OOo);
            if (menuItem2 == null) {
                MenuItemC1166oOo00o0O menuItemC1166oOo00o0O = new MenuItemC1166oOo00o0O((Context) this.OooO00o, interfaceMenuItemC1272oOoo0OOo);
                ((C1218oOoOOoo) this.OooO0O0).put(interfaceMenuItemC1272oOoo0OOo, menuItemC1166oOo00o0O);
                return menuItemC1166oOo00o0O;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void OooO0OO();

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        Class cls = (Class) this.OooO0O0;
        return new C1022oOOOo0oO((Context) this.OooO00o, ooo00ooo.OooOO0(File.class, cls), ooo00ooo.OooOO0(Uri.class, cls), cls);
    }

    public void OooO0o() {
        C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) this.OooO00o;
        HashSet hashSet = c1237oOoOoO0O.OooO0o0;
        if (hashSet.remove((C0267o00ooOOo) this.OooO0O0) && hashSet.isEmpty()) {
            c1237oOoOoO0O.OooO0O0();
        }
    }

    public void OooO0o0() {
        C0105o000o0o0 c0105o000o0o0 = (C0105o000o0o0) this.OooO00o;
        if (c0105o000o0o0 != null) {
            try {
                ((LayoutInflater$Factory2C0109o000oOoo) this.OooO0O0).OooOO0O.unregisterReceiver(c0105o000o0o0);
            } catch (IllegalArgumentException unused) {
            }
            this.OooO00o = null;
        }
    }

    public abstract IntentFilter OooO0oO();

    public abstract int OooO0oo();

    public abstract void OooOO0();

    public boolean OooOO0O() {
        C1237oOoOoO0O c1237oOoOoO0O = (C1237oOoOoO0O) this.OooO00o;
        int OooO0OO = AbstractC1230oOoOo0o.OooO0OO(c1237oOoOoO0O.OooO0OO.OooOooo);
        int i = c1237oOoOoO0O.OooO00o;
        if (OooO0OO != i && (OooO0OO == 2 || i == 2)) {
            return false;
        }
        return true;
    }

    public abstract void OooOO0o();

    public abstract void OooOOO();

    public abstract void OooOOO0(C0291o0O00o0 c0291o0O00o0);

    public void OooOOOO() {
        OooO0o0();
        IntentFilter OooO0oO = OooO0oO();
        if (OooO0oO.countActions() == 0) {
            return;
        }
        if (((C0105o000o0o0) this.OooO00o) == null) {
            this.OooO00o = new C0105o000o0o0(0, this);
        }
        ((LayoutInflater$Factory2C0109o000oOoo) this.OooO0O0).OooOO0O.registerReceiver((C0105o000o0o0) this.OooO00o, OooO0oO);
    }

    public abstract void OooOOOo();

    public abstract void OooOOo0();

    public AbstractC0104o000o0o(Context context) {
        this.OooO00o = context;
    }

    public AbstractC0104o000o0o(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo) {
        this.OooO0O0 = layoutInflater$Factory2C0109o000oOoo;
    }

    public /* synthetic */ AbstractC0104o000o0o(Object obj, Object obj2) {
        this.OooO00o = obj;
        this.OooO0O0 = obj2;
    }
}


