package com.ninja.engine;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class oOO00OOO implements InterfaceC0265o00ooOO, InterfaceC0965oOO0ooo, o00000O0 {
    public final Object OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;
    public static final C0601o0oOooO0 OooO0o0 = new C0601o0oOooO0(29);
    public static final C1390oo00O0Oo OooO0o = new C1390oo00O0Oo(2);

    public oOO00OOO(int i) {
        switch (i) {
            case 4:
                this.OooO00o = new ArrayList();
                this.OooO0O0 = new HashMap();
                this.OooO0OO = new HashMap();
                return;
            case 8:
                this.OooO00o = new C1218oOoOOoo();
                this.OooO0O0 = new SparseArray();
                this.OooO0OO = new C0832oO0o0o00();
                this.OooO0Oo = new C1218oOoOOoo();
                return;
            default:
                this.OooO0O0 = new C0995oOOOO0O(10);
                this.OooO0Oo = new C1218oOoOOoo(0);
                this.OooO00o = new ArrayList();
                this.OooO0OO = new HashSet();
                return;
        }
    }

    public InterfaceC0904oOO000o0 OooO(oOO00OO ooo00oo) {
        return ooo00oo.OooO0OO.OooO0Oo(this);
    }

    @Override // com.ninja.engine.InterfaceC0965oOO0ooo
    public void OooO00o() {
        C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) this.OooO0Oo;
        if (!c0792oO0Oo0Oo.OooOOOo()) {
            return;
        }
        c0792oO0Oo0Oo.Ooooo00.post(new RunnableC0090o000OoOO((View) this.OooO00o, 6, (Button) this.OooO0OO));
    }

    @Override // com.ninja.engine.o00000O0
    public boolean OooO0O0(o00000O o00000o, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        C1281oOoo0oO OooOOOo = OooOOOo(o00000o);
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0Oo;
        Menu menu = (Menu) c1218oOoOOoo.get(menuC0887oO0oo0oo);
        if (menu == null) {
            menu = new oOO00000((Context) this.OooO0OO, menuC0887oO0oo0oo);
            c1218oOoOOoo.put(menuC0887oO0oo0oo, menu);
        }
        return ((ActionMode.Callback) this.OooO0O0).onCreateActionMode(OooOOOo, menu);
    }

    @Override // com.ninja.engine.o00000O0
    public boolean OooO0OO(o00000O o00000o, MenuItem menuItem) {
        return ((ActionMode.Callback) this.OooO0O0).onActionItemClicked(OooOOOo(o00000o), new MenuItemC1166oOo00o0O((Context) this.OooO0OO, (InterfaceMenuItemC1272oOoo0OOo) menuItem));
    }

    @Override // com.ninja.engine.o00000O0
    public boolean OooO0Oo(o00000O o00000o, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        C1281oOoo0oO OooOOOo = OooOOOo(o00000o);
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0Oo;
        Menu menu = (Menu) c1218oOoOOoo.get(menuC0887oO0oo0oo);
        if (menu == null) {
            menu = new oOO00000((Context) this.OooO0OO, menuC0887oO0oo0oo);
            c1218oOoOOoo.put(menuC0887oO0oo0oo, menu);
        }
        return ((ActionMode.Callback) this.OooO0O0).onPrepareActionMode(OooOOOo, menu);
    }

    @Override // com.ninja.engine.InterfaceC0965oOO0ooo
    public void OooO0o() {
        C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) this.OooO0Oo;
        if (!c0792oO0Oo0Oo.OooOOOo()) {
            return;
        }
        c0792oO0Oo0Oo.Ooooo00.post(new o00Oo00(this, (View) this.OooO00o, (File) this.OooO0O0, (Button) this.OooO0OO, 1));
    }

    public void OooO0o0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (!((ArrayList) this.OooO00o).contains(abstractComponentCallbacksC0593o0oOoOo0)) {
            synchronized (((ArrayList) this.OooO00o)) {
                ((ArrayList) this.OooO00o).add(abstractComponentCallbacksC0593o0oOoOo0);
            }
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0593o0oOoOo0);
    }

    public synchronized void OooO0oO(Class cls, Class cls2, oOO000o ooo000o) {
        oOO00OO ooo00oo = new oOO00OO(cls, cls2, ooo000o);
        ArrayList arrayList = (ArrayList) this.OooO00o;
        arrayList.add(arrayList.size(), ooo00oo);
    }

    @Override // com.ninja.engine.o00000O0
    public void OooO0oo(o00000O o00000o) {
        ((ActionMode.Callback) this.OooO0O0).onDestroyActionMode(OooOOOo(o00000o));
    }

    public synchronized InterfaceC0904oOO000o0 OooOO0(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.OooO00o).iterator();
            boolean z = false;
            while (it.hasNext()) {
                oOO00OO ooo00oo = (oOO00OO) it.next();
                if (((HashSet) this.OooO0OO).contains(ooo00oo)) {
                    z = true;
                } else if (ooo00oo.OooO00o.isAssignableFrom(cls) && ooo00oo.OooO0O0.isAssignableFrom(cls2)) {
                    ((HashSet) this.OooO0OO).add(ooo00oo);
                    arrayList.add(OooO(ooo00oo));
                    ((HashSet) this.OooO0OO).remove(ooo00oo);
                }
            }
            if (arrayList.size() > 1) {
                ((C0601o0oOooO0) this.OooO0O0).getClass();
                return new C0549o0o0Oo(arrayList, 2, (oOOOO0O0) this.OooO0Oo);
            } else if (arrayList.size() == 1) {
                return (InterfaceC0904oOO000o0) arrayList.get(0);
            } else if (z) {
                return OooO0o;
            } else {
                throw new RuntimeException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
            }
        } catch (Throwable th) {
            ((HashSet) this.OooO0OO).clear();
            throw th;
        }
    }

    @Override // com.ninja.engine.InterfaceC0265o00ooOO
    public void OooOO0O() {
        View view = (View) this.OooO00o;
        view.clearAnimation();
        ((ViewGroup) this.OooO0O0).endViewTransition(view);
        ((C0373o0OOOooO) this.OooO0OO).OooO0o();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString((C1237oOoOoO0O) this.OooO0Oo);
        }
    }

    public synchronized ArrayList OooOO0o(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.OooO00o).iterator();
            while (it.hasNext()) {
                oOO00OO ooo00oo = (oOO00OO) it.next();
                if (!((HashSet) this.OooO0OO).contains(ooo00oo) && ooo00oo.OooO00o.isAssignableFrom(cls)) {
                    ((HashSet) this.OooO0OO).add(ooo00oo);
                    arrayList.add(ooo00oo.OooO0OO.OooO0Oo(this));
                    ((HashSet) this.OooO0OO).remove(ooo00oo);
                }
            }
        } catch (Throwable th) {
            ((HashSet) this.OooO0OO).clear();
            throw th;
        }
        return arrayList;
    }

    public AbstractComponentCallbacksC0593o0oOoOo0 OooOOO(String str) {
        androidx.fragment.app.OooO00o oooO00o = (androidx.fragment.app.OooO00o) ((HashMap) this.OooO0O0).get(str);
        if (oooO00o != null) {
            return oooO00o.OooO0OO;
        }
        return null;
    }

    public void OooOOO0(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((C1218oOoOOoo) this.OooO0Oo).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    OooOOO0(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public AbstractComponentCallbacksC0593o0oOoOo0 OooOOOO(String str) {
        for (androidx.fragment.app.OooO00o oooO00o : ((HashMap) this.OooO0O0).values()) {
            if (oooO00o != null) {
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
                if (!str.equals(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0)) {
                    abstractComponentCallbacksC0593o0oOoOo0 = abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooO0OO.OooOOOO(str);
                }
                if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                    return abstractComponentCallbacksC0593o0oOoOo0;
                }
            }
        }
        return null;
    }

    public C1281oOoo0oO OooOOOo(o00000O o00000o) {
        ArrayList arrayList = (ArrayList) this.OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1281oOoo0oO c1281oOoo0oO = (C1281oOoo0oO) arrayList.get(i);
            if (c1281oOoo0oO != null && c1281oOoo0oO.OooO0O0 == o00000o) {
                return c1281oOoo0oO;
            }
        }
        C1281oOoo0oO c1281oOoo0oO2 = new C1281oOoo0oO((Context) this.OooO0OO, o00000o);
        arrayList.add(c1281oOoo0oO2);
        return c1281oOoo0oO2;
    }

    public ArrayList OooOOo() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0;
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.OooO00o oooO00o : ((HashMap) this.OooO0O0).values()) {
            if (oooO00o != null) {
                abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
            } else {
                abstractComponentCallbacksC0593o0oOoOo0 = null;
            }
            arrayList.add(abstractComponentCallbacksC0593o0oOoOo0);
        }
        return arrayList;
    }

    public ArrayList OooOOo0() {
        ArrayList arrayList = new ArrayList();
        for (androidx.fragment.app.OooO00o oooO00o : ((HashMap) this.OooO0O0).values()) {
            if (oooO00o != null) {
                arrayList.add(oooO00o);
            }
        }
        return arrayList;
    }

    public synchronized ArrayList OooOOoo(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.OooO00o).iterator();
        while (it.hasNext()) {
            oOO00OO ooo00oo = (oOO00OO) it.next();
            if (!arrayList.contains(ooo00oo.OooO0O0) && ooo00oo.OooO00o.isAssignableFrom(cls)) {
                arrayList.add(ooo00oo.OooO0O0);
            }
        }
        return arrayList;
    }

    public void OooOo0(androidx.fragment.app.OooO00o oooO00o) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
        String str = abstractComponentCallbacksC0593o0oOoOo0.OooO0o0;
        HashMap hashMap = (HashMap) this.OooO0O0;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0, oooO00o);
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0593o0oOoOo0.toString();
        }
    }

    public List OooOo00() {
        ArrayList arrayList;
        if (((ArrayList) this.OooO00o).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.OooO00o)) {
            arrayList = new ArrayList((ArrayList) this.OooO00o);
        }
        return arrayList;
    }

    public void OooOo0O(androidx.fragment.app.OooO00o oooO00o) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoOO) {
            ((o0oo0000) this.OooO0Oo).OooO0OO(abstractComponentCallbacksC0593o0oOoOo0);
        }
        if (((androidx.fragment.app.OooO00o) ((HashMap) this.OooO0O0).put(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC0593o0oOoOo0.toString();
        }
    }

    public oOO00OOO(Context context, ActionMode.Callback callback) {
        this.OooO0OO = context;
        this.OooO0O0 = callback;
        this.OooO00o = new ArrayList();
        this.OooO0Oo = new C1218oOoOOoo();
    }

    public oOO00OOO(Typeface typeface, oOO0000O ooo0000o) {
        int i;
        int i2;
        this.OooO0Oo = typeface;
        this.OooO00o = ooo0000o;
        this.OooO0OO = new C0902oOO0000o(1024);
        int OooO00o = ooo0000o.OooO00o(6);
        if (OooO00o != 0) {
            int i3 = OooO00o + ooo0000o.OooO00o;
            i = ((ByteBuffer) ooo0000o.OooO0Oo).getInt(((ByteBuffer) ooo0000o.OooO0Oo).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.OooO0O0 = new char[i * 2];
        int OooO00o2 = ooo0000o.OooO00o(6);
        if (OooO00o2 != 0) {
            int i4 = OooO00o2 + ooo0000o.OooO00o;
            i2 = ((ByteBuffer) ooo0000o.OooO0Oo).getInt(((ByteBuffer) ooo0000o.OooO0Oo).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C1373oo000o0 c1373oo000o0 = new C1373oo000o0(this, i5);
            oOO0000 OooO0OO = c1373oo000o0.OooO0OO();
            int OooO00o3 = OooO0OO.OooO00o(4);
            Character.toChars(OooO00o3 != 0 ? ((ByteBuffer) OooO0OO.OooO0Oo).getInt(OooO00o3 + OooO0OO.OooO00o) : 0, (char[]) this.OooO0O0, i5 * 2);
            AbstractC0809oO0OooOO.OooOO0("invalid metadata codepoint length", c1373oo000o0.OooO0O0() > 0);
            ((C0902oOO0000o) this.OooO0OO).OooO00o(c1373oo000o0, 0, c1373oo000o0.OooO0O0() - 1);
        }
    }

    public oOO00OOO(View view, ViewGroup viewGroup, C0373o0OOOooO c0373o0OOOooO, C1237oOoOoO0O c1237oOoOoO0O) {
        this.OooO00o = view;
        this.OooO0O0 = viewGroup;
        this.OooO0OO = c0373o0OOOooO;
        this.OooO0Oo = c1237oOoOoO0O;
    }

    public oOO00OOO(C0131o00O0o c0131o00O0o) {
        C0601o0oOooO0 c0601o0oOooO0 = OooO0o0;
        this.OooO00o = new ArrayList();
        this.OooO0OO = new HashSet();
        this.OooO0Oo = c0131o00O0o;
        this.OooO0O0 = c0601o0oOooO0;
    }

    public /* synthetic */ oOO00OOO(Object obj, Object obj2, Object obj3, Object obj4) {
        this.OooO00o = obj2;
        this.OooO0O0 = obj3;
        this.OooO0OO = obj4;
        this.OooO0Oo = obj;
    }
}
