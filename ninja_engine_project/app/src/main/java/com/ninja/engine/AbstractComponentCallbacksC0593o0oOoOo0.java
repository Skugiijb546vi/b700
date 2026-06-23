package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.ninja.engine.o0oOoOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0593o0oOoOo0 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0760oO0O0o0O, InterfaceC1468oo0O0OOo, InterfaceC0786oO0OOooO, InterfaceC1192oOoOO0OO {
    public static final Object OoooO = new Object();
    public int OooO;
    public Bundle OooO0O0;
    public SparseArray OooO0OO;
    public Bundle OooO0Oo;
    public Bundle OooO0o;
    public AbstractComponentCallbacksC0593o0oOoOo0 OooO0oO;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public C0606o0oOoooO OooOOo;
    public int OooOOo0;
    public C0589o0oOoOO0 OooOOoo;
    public String OooOo;
    public AbstractComponentCallbacksC0593o0oOoOo0 OooOo0;
    public int OooOo0O;
    public int OooOo0o;
    public boolean OooOoO;
    public boolean OooOoO0;
    public boolean OooOoOO;
    public boolean OooOoo;
    public ViewGroup OooOooO;
    public View OooOooo;
    public boolean Oooo0;
    public boolean Oooo000;
    public C0586o0oOoO0 Oooo00o;
    public LayoutInflater Oooo0O0;
    public boolean Oooo0OO;
    public String Oooo0o0;
    public androidx.lifecycle.OooO00o Oooo0oO;
    public C0622o0oo0OO Oooo0oo;
    public final ArrayList OoooO0;
    public C1228oOoOo0O0 OoooO00;
    public final C0583o0oOo0o OoooO0O;
    public int OooO00o = -1;
    public String OooO0o0 = UUID.randomUUID().toString();
    public String OooO0oo = null;
    public Boolean OooOO0 = null;
    public C0606o0oOoooO OooOo00 = new C0606o0oOoooO();
    public final boolean OooOoo0 = true;
    public boolean Oooo00O = true;
    public EnumC0759oO0O0o Oooo0o = EnumC0759oO0O0o.OooO0o0;
    public final androidx.lifecycle.OooO0O0 Oooo = new androidx.lifecycle.OooO0O0();

    public AbstractComponentCallbacksC0593o0oOoOo0() {
        new AtomicInteger();
        this.OoooO0 = new ArrayList();
        this.OoooO0O = new C0583o0oOo0o(this);
        OooOOO();
    }

    public final Context OooO() {
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOOoo;
        if (c0589o0oOoOO0 == null) {
            return null;
        }
        return c0589o0oOoOO0.Oooo00O;
    }

    @Override // com.ninja.engine.InterfaceC1192oOoOO0OO
    public final C0086o000Oo00 OooO00o() {
        return (C0086o000Oo00) this.OoooO00.OooO0Oo;
    }

    public AbstractC0692o0ooooOo OooO0O0() {
        return new C0574o0oOo(this);
    }

    @Override // com.ninja.engine.InterfaceC0786oO0OOooO
    public final C0910oOO00Oo0 OooO0OO() {
        Application application;
        Context applicationContext = Oooo00O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(Oooo00O().getApplicationContext());
        }
        C0910oOO00Oo0 c0910oOO00Oo0 = new C0910oOO00Oo0();
        LinkedHashMap linkedHashMap = c0910oOO00Oo0.OooO00o;
        if (application != null) {
            linkedHashMap.put(C0455o0OoOo00.OooO0oo, application);
        }
        linkedHashMap.put(AbstractC0694o0ooooo0.OooOOO, this);
        linkedHashMap.put(AbstractC0694o0ooooo0.OooOOOO, this);
        Bundle bundle = this.OooO0o;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0694o0ooooo0.OooOOOo, bundle);
        }
        return c0910oOO00Oo0;
    }

    @Override // com.ninja.engine.InterfaceC1468oo0O0OOo
    public final C1467oo0O0OOO OooO0Oo() {
        if (this.OooOOo != null) {
            if (OooOO0() != 1) {
                HashMap hashMap = this.OooOOo.Oooo0o0.OooO0o0;
                C1467oo0O0OOO c1467oo0O0OOO = (C1467oo0O0OOO) hashMap.get(this.OooO0o0);
                if (c1467oo0O0OOO == null) {
                    C1467oo0O0OOO c1467oo0O0OOO2 = new C1467oo0O0OOO();
                    hashMap.put(this.OooO0o0, c1467oo0O0OOO2);
                    return c1467oo0O0OOO2;
                }
                return c1467oo0O0OOO;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.o0oOoO0, java.lang.Object] */
    public final C0586o0oOoO0 OooO0o() {
        if (this.Oooo00o == null) {
            Object obj = new Object();
            Object obj2 = OoooO;
            obj.OooO0oO = obj2;
            obj.OooO0oo = obj2;
            obj.OooO = obj2;
            obj.OooOO0 = 1.0f;
            obj.OooOO0O = null;
            this.Oooo00o = obj;
        }
        return this.Oooo00o;
    }

    @Override // com.ninja.engine.InterfaceC0760oO0O0o0O
    public final androidx.lifecycle.OooO00o OooO0o0() {
        return this.Oooo0oO;
    }

    public final o000OO00 OooO0oO() {
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOOoo;
        if (c0589o0oOoOO0 == null) {
            return null;
        }
        return (o000OO00) c0589o0oOoOO0.Oooo000;
    }

    public final C0606o0oOoooO OooO0oo() {
        if (this.OooOOoo != null) {
            return this.OooOo00;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final int OooOO0() {
        EnumC0759oO0O0o enumC0759oO0O0o = this.Oooo0o;
        if (enumC0759oO0O0o != EnumC0759oO0O0o.OooO0O0 && this.OooOo0 != null) {
            return Math.min(enumC0759oO0O0o.ordinal(), this.OooOo0.OooOO0());
        }
        return enumC0759oO0O0o.ordinal();
    }

    public final C0606o0oOoooO OooOO0O() {
        C0606o0oOoooO c0606o0oOoooO = this.OooOOo;
        if (c0606o0oOoooO != null) {
            return c0606o0oOoooO;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Resources OooOO0o() {
        return Oooo00O().getResources();
    }

    public final void OooOOO() {
        this.Oooo0oO = new androidx.lifecycle.OooO00o(this);
        this.OoooO00 = new C1228oOoOo0O0(this);
        ArrayList arrayList = this.OoooO0;
        C0583o0oOo0o c0583o0oOo0o = this.OoooO0O;
        if (!arrayList.contains(c0583o0oOo0o)) {
            if (this.OooO00o >= 0) {
                c0583o0oOo0o.OooO00o();
            } else {
                arrayList.add(c0583o0oOo0o);
            }
        }
    }

    public final String OooOOO0(int i) {
        return OooOO0o().getString(i);
    }

    public final void OooOOOO() {
        OooOOO();
        this.Oooo0o0 = this.OooO0o0;
        this.OooO0o0 = UUID.randomUUID().toString();
        this.OooOO0O = false;
        this.OooOO0o = false;
        this.OooOOO0 = false;
        this.OooOOO = false;
        this.OooOOOO = false;
        this.OooOOo0 = 0;
        this.OooOOo = null;
        this.OooOo00 = new C0606o0oOoooO();
        this.OooOOoo = null;
        this.OooOo0O = 0;
        this.OooOo0o = 0;
        this.OooOo = null;
        this.OooOoO0 = false;
        this.OooOoO = false;
    }

    public final boolean OooOOOo() {
        if (this.OooOOoo != null && this.OooOO0O) {
            return true;
        }
        return false;
    }

    public final boolean OooOOo() {
        if (this.OooOOo0 > 0) {
            return true;
        }
        return false;
    }

    public final boolean OooOOo0() {
        boolean OooOOo0;
        if (!this.OooOoO0) {
            C0606o0oOoooO c0606o0oOoooO = this.OooOOo;
            if (c0606o0oOoooO == null) {
                return false;
            }
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooOo0;
            c0606o0oOoooO.getClass();
            if (abstractComponentCallbacksC0593o0oOoOo0 == null) {
                OooOOo0 = false;
            } else {
                OooOOo0 = abstractComponentCallbacksC0593o0oOoOo0.OooOOo0();
            }
            if (!OooOOo0) {
                return false;
            }
        }
        return true;
    }

    public void OooOOoo() {
        this.OooOoo = true;
    }

    public void OooOo() {
        this.OooOoo = true;
    }

    public void OooOo0(Bundle bundle) {
        this.OooOoo = true;
        Oooo0(bundle);
        C0606o0oOoooO c0606o0oOoooO = this.OooOo00;
        if (c0606o0oOoooO.OooOOoo < 1) {
            c0606o0oOoooO.OooOooo = false;
            c0606o0oOoooO.Oooo000 = false;
            c0606o0oOoooO.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO.OooOo00(1);
        }
    }

    public void OooOo00(Context context) {
        Activity activity;
        this.OooOoo = true;
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOOoo;
        if (c0589o0oOoOO0 == null) {
            activity = null;
        } else {
            activity = c0589o0oOoOO0.Oooo000;
        }
        if (activity != null) {
            this.OooOoo = true;
        }
    }

    public View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void OooOo0o() {
        this.OooOoo = true;
    }

    public void OooOoO() {
        this.OooOoo = true;
    }

    public LayoutInflater OooOoO0(Bundle bundle) {
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOOoo;
        if (c0589o0oOoOO0 != null) {
            o000OO00 o000oo00 = c0589o0oOoOO0.Oooo0O0;
            LayoutInflater cloneInContext = o000oo00.getLayoutInflater().cloneInContext(o000oo00);
            cloneInContext.setFactory2(this.OooOo00.OooO0o);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void OooOoo() {
        this.OooOoo = true;
    }

    public void OooOoo0() {
        this.OooOoo = true;
    }

    public void OooOooO(Bundle bundle) {
        this.OooOoo = true;
    }

    public void OooOooo(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.OooOo00.Oooo0OO();
        this.OooOOOo = true;
        this.Oooo0oo = new C0622o0oo0OO(this, OooO0Oo());
        View OooOo0O = OooOo0O(layoutInflater, viewGroup);
        this.OooOooo = OooOo0O;
        if (OooOo0O != null) {
            this.Oooo0oo.OooO0o();
            AbstractC1091oOOoOOOO.OooOooo(this.OooOooo, this.Oooo0oo);
            View view = this.OooOooo;
            C0622o0oo0OO c0622o0oo0OO = this.Oooo0oo;
            AbstractC0809oO0OooOO.OooOOOo(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, c0622o0oo0OO);
            AbstractC1137oOOoooO.OooOO0o(this.OooOooo, this.Oooo0oo);
            androidx.lifecycle.OooO0O0 oooO0O0 = this.Oooo;
            C0622o0oo0OO c0622o0oo0OO2 = this.Oooo0oo;
            oooO0O0.getClass();
            androidx.lifecycle.OooO0O0.OooO00o("setValue");
            oooO0O0.OooO0oO++;
            oooO0O0.OooO0o0 = c0622o0oo0OO2;
            oooO0O0.OooO0OO(null);
        } else if (this.Oooo0oo.OooO0OO == null) {
            this.Oooo0oo = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final void Oooo0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.OooOo00.OoooO00(parcelable);
            C0606o0oOoooO c0606o0oOoooO = this.OooOo00;
            c0606o0oOoooO.OooOooo = false;
            c0606o0oOoooO.Oooo000 = false;
            c0606o0oOoooO.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO.OooOo00(1);
        }
    }

    public final o000OO00 Oooo000() {
        o000OO00 OooO0oO = OooO0oO();
        if (OooO0oO != null) {
            return OooO0oO;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context Oooo00O() {
        Context OooO = OooO();
        if (OooO != null) {
            return OooO;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View Oooo00o() {
        View view = this.OooOooo;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void Oooo0O0(int i, int i2, int i3, int i4) {
        if (this.Oooo00o == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        OooO0o().OooO0O0 = i;
        OooO0o().OooO0OO = i2;
        OooO0o().OooO0Oo = i3;
        OooO0o().OooO0o0 = i4;
    }

    public final void Oooo0OO(Bundle bundle) {
        C0606o0oOoooO c0606o0oOoooO = this.OooOOo;
        if (c0606o0oOoooO != null && (c0606o0oOoooO.OooOooo || c0606o0oOoooO.Oooo000)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.OooO0o = bundle;
    }

    public final void Oooo0o0(Intent intent) {
        C0589o0oOoOO0 c0589o0oOoOO0 = this.OooOOoo;
        if (c0589o0oOoOO0 != null) {
            c0589o0oOoOO0.Oooo00O.startActivity(intent, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.OooOoo = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Oooo000().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.OooOoo = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.OooO0o0);
        if (this.OooOo0O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.OooOo0O));
        }
        if (this.OooOo != null) {
            sb.append(" tag=");
            sb.append(this.OooOo);
        }
        sb.append(")");
        return sb.toString();
    }

    public void OooOoOO(Bundle bundle) {
    }
}

