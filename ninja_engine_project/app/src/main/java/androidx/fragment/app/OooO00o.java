package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.OooO0O0;
import com.ninja.engine.AbstractC0615o0oo00o0;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1449oo0O000;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0;
import com.ninja.engine.C0415o0Oo0O0O;
import com.ninja.engine.C0583o0oOo0o;
import com.ninja.engine.C0586o0oOoO0;
import com.ninja.engine.C0589o0oOoOO0;
import com.ninja.engine.C0596o0oOoo;
import com.ninja.engine.C0606o0oOoooO;
import com.ninja.engine.C0610o0oo00O;
import com.ninja.engine.C0611o0oo00O0;
import com.ninja.engine.C0613o0oo00Oo;
import com.ninja.engine.C0622o0oo0OO;
import com.ninja.engine.C0797oO0OoO00;
import com.ninja.engine.C1236oOoOoO00;
import com.ninja.engine.C1237oOoOoO0O;
import com.ninja.engine.EnumC0612o0oo00OO;
import com.ninja.engine.EnumC0759oO0O0o;
import com.ninja.engine.InterfaceC0609o0oo000O;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1468oo0O0OOo;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.R;
import com.ninja.engine.View$OnAttachStateChangeListenerC0274o00ooo00;
import com.ninja.engine.o0OOo000;
import com.ninja.engine.o0oo0000;
import com.ninja.engine.oO0O0O0o;
import com.ninja.engine.oOO00OOO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class OooO00o {
    public final C0415o0Oo0O0O OooO00o;
    public final oOO00OOO OooO0O0;
    public final AbstractComponentCallbacksC0593o0oOoOo0 OooO0OO;
    public boolean OooO0Oo = false;
    public int OooO0o0 = -1;

    public OooO00o(C0415o0Oo0O0O c0415o0Oo0O0O, oOO00OOO ooo00ooo, AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        this.OooO00o = c0415o0Oo0O0O;
        this.OooO0O0 = ooo00ooo;
        this.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0;
    }

    public final void OooO() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = -1;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOo();
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0O0 = null;
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
            if (!c0606o0oOoooO.Oooo00O) {
                c0606o0oOoooO.OooOO0O();
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00 = new C0606o0oOoooO();
            }
            this.OooO00o.OooOOO(false);
            abstractComponentCallbacksC0593o0oOoOo0.OooO00o = -1;
            abstractComponentCallbacksC0593o0oOoOo0.OooOOoo = null;
            abstractComponentCallbacksC0593o0oOoOo0.OooOo0 = null;
            abstractComponentCallbacksC0593o0oOoOo0.OooOOo = null;
            if (!abstractComponentCallbacksC0593o0oOoOo0.OooOO0o || abstractComponentCallbacksC0593o0oOoOo0.OooOOo()) {
                o0oo0000 o0oo0000Var = (o0oo0000) this.OooO0O0.OooO0Oo;
                boolean z = true;
                if (o0oo0000Var.OooO0OO.containsKey(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0) && o0oo0000Var.OooO0o) {
                    z = o0oo0000Var.OooO0oO;
                }
                if (!z) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
            }
            abstractComponentCallbacksC0593o0oOoOo0.OooOOOO();
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onDetach()");
    }

    public final void OooO00o() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        Bundle bundle = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0;
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.Oooo0OO();
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 3;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOOoo();
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            if (Log.isLoggable("FragmentManager", 3)) {
                abstractComponentCallbacksC0593o0oOoOo0.toString();
            }
            View view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
            if (view != null) {
                Bundle bundle2 = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0;
                SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0593o0oOoOo0.OooO0OO;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    abstractComponentCallbacksC0593o0oOoOo0.OooO0OO = null;
                }
                if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
                    C0622o0oo0OO c0622o0oo0OO = abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo;
                    c0622o0oo0OO.OooO0Oo.OooO0o0(abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo);
                    abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo = null;
                }
                abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
                abstractComponentCallbacksC0593o0oOoOo0.OooOooO(bundle2);
                if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
                    if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
                        abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0O0(oO0O0O0o.ON_CREATE);
                    }
                } else {
                    throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onViewStateRestored()");
                }
            }
            abstractComponentCallbacksC0593o0oOoOo0.OooO0O0 = null;
            C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
            c0606o0oOoooO.OooOooo = false;
            c0606o0oOoooO.Oooo000 = false;
            c0606o0oOoooO.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO.OooOo00(4);
            this.OooO00o.OooO(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onActivityCreated()");
    }

    public final void OooO0O0() {
        View view;
        View view2;
        oOO00OOO ooo00ooo = this.OooO0O0;
        ooo00ooo.getClass();
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        ViewGroup viewGroup = abstractComponentCallbacksC0593o0oOoOo0.OooOooO;
        int i = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) ooo00ooo.OooO00o;
            int indexOf = arrayList.indexOf(abstractComponentCallbacksC0593o0oOoOo0);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = (AbstractComponentCallbacksC0593o0oOoOo0) arrayList.get(indexOf);
                        if (abstractComponentCallbacksC0593o0oOoOo02.OooOooO == viewGroup && (view = abstractComponentCallbacksC0593o0oOoOo02.OooOooo) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo03 = (AbstractComponentCallbacksC0593o0oOoOo0) arrayList.get(i2);
                    if (abstractComponentCallbacksC0593o0oOoOo03.OooOooO == viewGroup && (view2 = abstractComponentCallbacksC0593o0oOoOo03.OooOooo) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooOooO.addView(abstractComponentCallbacksC0593o0oOoOo0.OooOooo, i);
    }

    public final void OooO0OO() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = abstractComponentCallbacksC0593o0oOoOo0.OooO0oO;
        OooO00o oooO00o = null;
        oOO00OOO ooo00ooo = this.OooO0O0;
        if (abstractComponentCallbacksC0593o0oOoOo02 != null) {
            OooO00o oooO00o2 = (OooO00o) ((HashMap) ooo00ooo.OooO0O0).get(abstractComponentCallbacksC0593o0oOoOo02.OooO0o0);
            if (oooO00o2 != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooO0oo = abstractComponentCallbacksC0593o0oOoOo0.OooO0oO.OooO0o0;
                abstractComponentCallbacksC0593o0oOoOo0.OooO0oO = null;
                oooO00o = oooO00o2;
            } else {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " declared target fragment " + abstractComponentCallbacksC0593o0oOoOo0.OooO0oO + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = abstractComponentCallbacksC0593o0oOoOo0.OooO0oo;
            if (str != null && (oooO00o = (OooO00o) ((HashMap) ooo00ooo.OooO0O0).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0593o0oOoOo0);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC1230oOoOo0o.OooO(sb, abstractComponentCallbacksC0593o0oOoOo0.OooO0oo, " that does not belong to this FragmentManager!"));
            }
        }
        if (oooO00o != null) {
            oooO00o.OooOO0O();
        }
        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOOo;
        abstractComponentCallbacksC0593o0oOoOo0.OooOOoo = c0606o0oOoooO.OooOo00;
        abstractComponentCallbacksC0593o0oOoOo0.OooOo0 = c0606o0oOoooO.OooOo0O;
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO00o;
        c0415o0Oo0O0O.OooOOOo(false);
        ArrayList arrayList = abstractComponentCallbacksC0593o0oOoOo0.OoooO0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0583o0oOo0o) it.next()).OooO00o();
        }
        arrayList.clear();
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooO0O0(abstractComponentCallbacksC0593o0oOoOo0.OooOOoo, abstractComponentCallbacksC0593o0oOoOo0.OooO0O0(), abstractComponentCallbacksC0593o0oOoOo0);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 0;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00(abstractComponentCallbacksC0593o0oOoOo0.OooOOoo.Oooo00O);
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            Iterator it2 = abstractComponentCallbacksC0593o0oOoOo0.OooOOo.OooOOO0.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0609o0oo000O) it2.next()).OooO0O0();
            }
            C0606o0oOoooO c0606o0oOoooO2 = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
            c0606o0oOoooO2.OooOooo = false;
            c0606o0oOoooO2.Oooo000 = false;
            c0606o0oOoooO2.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO2.OooOo00(0);
            c0415o0Oo0O0O.OooOO0(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onAttach()");
    }

    public final int OooO0Oo() {
        C1237oOoOoO0O c1237oOoOoO0O;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOOo == null) {
            return abstractComponentCallbacksC0593o0oOoOo0.OooO00o;
        }
        int i = this.OooO0o0;
        int ordinal = abstractComponentCallbacksC0593o0oOoOo0.Oooo0o.ordinal();
        int i2 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i = Math.min(i, -1);
                    }
                } else {
                    i = Math.min(i, 5);
                }
            } else {
                i = Math.min(i, 1);
            }
        } else {
            i = Math.min(i, 0);
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOOO0) {
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOOO) {
                i = Math.max(this.OooO0o0, 2);
                View view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.OooO0o0 < 4 ? Math.min(i, abstractComponentCallbacksC0593o0oOoOo0.OooO00o) : Math.min(i, 1);
            }
        }
        if (!abstractComponentCallbacksC0593o0oOoOo0.OooOO0O) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0593o0oOoOo0.OooOooO;
        if (viewGroup != null) {
            o0OOo000 OooO0oO = o0OOo000.OooO0oO(viewGroup, abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOooO());
            OooO0oO.getClass();
            C1237oOoOoO0O OooO0o0 = OooO0oO.OooO0o0(abstractComponentCallbacksC0593o0oOoOo0);
            if (OooO0o0 != null) {
                i2 = OooO0o0.OooO0O0;
            }
            Iterator it = OooO0oO.OooO0OO.iterator();
            while (true) {
                if (it.hasNext()) {
                    c1237oOoOoO0O = (C1237oOoOoO0O) it.next();
                    if (c1237oOoOoO0O.OooO0OO.equals(abstractComponentCallbacksC0593o0oOoOo0) && !c1237oOoOoO0O.OooO0o) {
                        break;
                    }
                } else {
                    c1237oOoOoO0O = null;
                    break;
                }
            }
            if (c1237oOoOoO0O != null && (i2 == 0 || i2 == 1)) {
                i2 = c1237oOoOoO0O.OooO0O0;
            }
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (abstractComponentCallbacksC0593o0oOoOo0.OooOO0o) {
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOOo()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.Oooo000 && abstractComponentCallbacksC0593o0oOoOo0.OooO00o < 5) {
            i = Math.min(i, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        return i;
    }

    public final void OooO0o() {
        String str;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOOO0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        LayoutInflater OooOoO0 = abstractComponentCallbacksC0593o0oOoOo0.OooOoO0(abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0O0 = OooOoO0;
        ViewGroup viewGroup = abstractComponentCallbacksC0593o0oOoOo0.OooOooO;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0593o0oOoOo0.OooOo0o;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) abstractComponentCallbacksC0593o0oOoOo0.OooOOo.OooOo0.Oooo0o(i);
                    if (viewGroup == null) {
                        if (!abstractComponentCallbacksC0593o0oOoOo0.OooOOOO) {
                            try {
                                str = abstractComponentCallbacksC0593o0oOoOo0.OooOO0o().getResourceName(abstractComponentCallbacksC0593o0oOoOo0.OooOo0o);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0593o0oOoOo0.OooOo0o) + " (" + str + ") for fragment " + abstractComponentCallbacksC0593o0oOoOo0);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        C0613o0oo00Oo c0613o0oo00Oo = AbstractC0615o0oo00o0.OooO00o;
                        C0611o0oo00O0 c0611o0oo00O0 = new C0611o0oo00O0(abstractComponentCallbacksC0593o0oOoOo0, "Attempting to add fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " to container " + viewGroup + " which is not a FragmentContainerView");
                        if (Log.isLoggable("FragmentManager", 3)) {
                            c0611o0oo00O0.OooO00o.getClass();
                        }
                        AbstractC0615o0oo00o0.OooO00o(abstractComponentCallbacksC0593o0oOoOo0).getClass();
                        EnumC0612o0oo00OO enumC0612o0oo00OO = EnumC0612o0oo00OO.OooO0OO;
                        if (enumC0612o0oo00OO instanceof Void) {
                            Void r3 = (Void) enumC0612o0oo00OO;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooOooO = viewGroup;
        abstractComponentCallbacksC0593o0oOoOo0.OooOooo(OooOoO0, viewGroup, abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
        View view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0593o0oOoOo0.OooOooo.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0593o0oOoOo0);
            if (viewGroup != null) {
                OooO0O0();
            }
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOooo.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if (view2.isAttachedToWindow()) {
                AbstractC1449oo0O000.OooO0OO(abstractComponentCallbacksC0593o0oOoOo0.OooOooo);
            } else {
                View view3 = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
                view3.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0274o00ooo00(2, view3));
            }
            abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo00(2);
            this.OooO00o.OooOo0O(false);
            int visibility = abstractComponentCallbacksC0593o0oOoOo0.OooOooo.getVisibility();
            abstractComponentCallbacksC0593o0oOoOo0.OooO0o().OooOO0 = abstractComponentCallbacksC0593o0oOoOo0.OooOooo.getAlpha();
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOooO != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0593o0oOoOo0.OooOooo.findFocus();
                if (findFocus != null) {
                    abstractComponentCallbacksC0593o0oOoOo0.OooO0o().OooOO0O = findFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        findFocus.toString();
                        Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                    }
                }
                abstractComponentCallbacksC0593o0oOoOo0.OooOooo.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 2;
    }

    public final void OooO0o0() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        final AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        if (!abstractComponentCallbacksC0593o0oOoOo0.Oooo0OO) {
            C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO00o;
            c0415o0Oo0O0O.OooOOo0(false);
            Bundle bundle = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0;
            abstractComponentCallbacksC0593o0oOoOo0.OooOo00.Oooo0OO();
            abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 1;
            abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO00o(new InterfaceC1800ooOOOoOo() { // from class: androidx.fragment.app.Fragment$6
                @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
                public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
                    View view;
                    if (oo0o0o0o == oO0O0O0o.ON_STOP && (view = AbstractComponentCallbacksC0593o0oOoOo0.this.OooOooo) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            abstractComponentCallbacksC0593o0oOoOo0.OoooO00.OooO0o0(bundle);
            abstractComponentCallbacksC0593o0oOoOo0.OooOo0(bundle);
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0OO = true;
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
                abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO0Oo(oO0O0O0o.ON_CREATE);
                c0415o0Oo0O0O.OooOO0o(false);
                return;
            }
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onCreate()");
        }
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0(abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 1;
    }

    public final void OooO0oO() {
        boolean z;
        boolean z2;
        boolean z3;
        AbstractComponentCallbacksC0593o0oOoOo0 OooOOO;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOO0o && !abstractComponentCallbacksC0593o0oOoOo0.OooOOo()) {
            z = true;
        } else {
            z = false;
        }
        oOO00OOO ooo00ooo = this.OooO0O0;
        if (z) {
            C0610o0oo00O c0610o0oo00O = (C0610o0oo00O) ((HashMap) ooo00ooo.OooO0OO).remove(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0);
        }
        if (!z) {
            o0oo0000 o0oo0000Var = (o0oo0000) ooo00ooo.OooO0Oo;
            if (!o0oo0000Var.OooO0OO.containsKey(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0) || !o0oo0000Var.OooO0o) {
                z3 = true;
            } else {
                z3 = o0oo0000Var.OooO0oO;
            }
            if (!z3) {
                String str = abstractComponentCallbacksC0593o0oOoOo0.OooO0oo;
                if (str != null && (OooOOO = ooo00ooo.OooOOO(str)) != null && OooOOO.OooOoOO) {
                    abstractComponentCallbacksC0593o0oOoOo0.OooO0oO = OooOOO;
                }
                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 0;
                return;
            }
        }
        C0589o0oOoOO0 c0589o0oOoOO0 = abstractComponentCallbacksC0593o0oOoOo0.OooOOoo;
        if (c0589o0oOoOO0 instanceof InterfaceC1468oo0O0OOo) {
            z2 = ((o0oo0000) ooo00ooo.OooO0Oo).OooO0oO;
        } else {
            Context context = c0589o0oOoOO0.Oooo00O;
            if (context instanceof Activity) {
                z2 = !((Activity) context).isChangingConfigurations();
            } else {
                z2 = true;
            }
        }
        if (z || z2) {
            o0oo0000 o0oo0000Var2 = (o0oo0000) ooo00ooo.OooO0Oo;
            o0oo0000Var2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
            }
            o0oo0000Var2.OooO0O0(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0);
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOO0O();
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO0Oo(oO0O0O0o.ON_DESTROY);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 0;
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0OO = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = true;
        this.OooO00o.OooOOO0(false);
        Iterator it = ooo00ooo.OooOOo0().iterator();
        while (it.hasNext()) {
            OooO00o oooO00o = (OooO00o) it.next();
            if (oooO00o != null) {
                String str2 = abstractComponentCallbacksC0593o0oOoOo0.OooO0o0;
                AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = oooO00o.OooO0OO;
                if (str2.equals(abstractComponentCallbacksC0593o0oOoOo02.OooO0oo)) {
                    abstractComponentCallbacksC0593o0oOoOo02.OooO0oO = abstractComponentCallbacksC0593o0oOoOo0;
                    abstractComponentCallbacksC0593o0oOoOo02.OooO0oo = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0593o0oOoOo0.OooO0oo;
        if (str3 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooO0oO = ooo00ooo.OooOOO(str3);
        }
        ooo00ooo.OooOo0O(this);
    }

    public final void OooO0oo() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0593o0oOoOo0.OooOooO;
        if (viewGroup != null && (view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo00(1);
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
            C0622o0oo0OO c0622o0oo0OO = abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo;
            c0622o0oo0OO.OooO0o();
            if (c0622o0oo0OO.OooO0OO.OooO0OO.compareTo(EnumC0759oO0O0o.OooO0OO) >= 0) {
                abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0O0(oO0O0O0o.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 1;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOo0o();
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            C1236oOoOoO00 c1236oOoOoO00 = ((C0797oO0OoO00) C0415o0Oo0O0O.OooOoo(abstractComponentCallbacksC0593o0oOoOo0).OooO0OO).OooO0OO;
            if (c1236oOoOoO00.OooO0OO <= 0) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOOOo = false;
                this.OooO00o.OooOo0o(false);
                abstractComponentCallbacksC0593o0oOoOo0.OooOooO = null;
                abstractComponentCallbacksC0593o0oOoOo0.OooOooo = null;
                abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo = null;
                OooO0O0 oooO0O0 = abstractComponentCallbacksC0593o0oOoOo0.Oooo;
                oooO0O0.getClass();
                OooO0O0.OooO00o("setValue");
                oooO0O0.OooO0oO++;
                oooO0O0.OooO0o0 = null;
                oooO0O0.OooO0OO(null);
                abstractComponentCallbacksC0593o0oOoOo0.OooOOO = false;
                return;
            }
            AbstractC1230oOoOo0o.OooOO0O(c1236oOoOoO00.OooO0O0[0]);
            throw null;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onDestroyView()");
    }

    public final void OooOO0() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOOO0 && abstractComponentCallbacksC0593o0oOoOo0.OooOOO && !abstractComponentCallbacksC0593o0oOoOo0.OooOOOo) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
            }
            LayoutInflater OooOoO0 = abstractComponentCallbacksC0593o0oOoOo0.OooOoO0(abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0O0 = OooOoO0;
            abstractComponentCallbacksC0593o0oOoOo0.OooOooo(OooOoO0, null, abstractComponentCallbacksC0593o0oOoOo0.OooO0O0);
            View view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0593o0oOoOo0.OooOooo.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0593o0oOoOo0);
                if (abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                    abstractComponentCallbacksC0593o0oOoOo0.OooOooo.setVisibility(8);
                }
                abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo00(2);
                this.OooO00o.OooOo0O(false);
                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 2;
            }
        }
    }

    public final void OooOO0O() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        oOO00OOO ooo00ooo = this.OooO0O0;
        boolean z = this.OooO0Oo;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (z) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                return;
            }
            return;
        }
        try {
            this.OooO0Oo = true;
            boolean z2 = false;
            while (true) {
                int OooO0Oo = OooO0Oo();
                int i = abstractComponentCallbacksC0593o0oOoOo0.OooO00o;
                if (OooO0Oo != i) {
                    if (OooO0Oo > i) {
                        switch (i + 1) {
                            case 0:
                                OooO0OO();
                                continue;
                            case 1:
                                OooO0o0();
                                continue;
                            case 2:
                                OooOO0();
                                OooO0o();
                                continue;
                            case 3:
                                OooO00o();
                                continue;
                            case 4:
                                if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null && (viewGroup3 = abstractComponentCallbacksC0593o0oOoOo0.OooOooO) != null) {
                                    o0OOo000 OooO0oO = o0OOo000.OooO0oO(viewGroup3, abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOooO());
                                    int OooO0O0 = AbstractC1230oOoOo0o.OooO0O0(abstractComponentCallbacksC0593o0oOoOo0.OooOooo.getVisibility());
                                    OooO0oO.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                                    }
                                    OooO0oO.OooO0O0(OooO0O0, 2, this);
                                }
                                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 4;
                                continue;
                            case 5:
                                OooOOo0();
                                continue;
                            case 6:
                                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 6;
                                continue;
                            case 7:
                                OooOOO();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                OooO();
                                continue;
                            case 0:
                                OooO0oO();
                                continue;
                            case 1:
                                OooO0oo();
                                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 1;
                                continue;
                            case 2:
                                abstractComponentCallbacksC0593o0oOoOo0.OooOOO = false;
                                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 2;
                                continue;
                            case 3:
                                if (Log.isLoggable("FragmentManager", 3)) {
                                    Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                                }
                                if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null && abstractComponentCallbacksC0593o0oOoOo0.OooO0OO == null) {
                                    OooOOOo();
                                }
                                if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null && (viewGroup2 = abstractComponentCallbacksC0593o0oOoOo0.OooOooO) != null) {
                                    o0OOo000 OooO0oO2 = o0OOo000.OooO0oO(viewGroup2, abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOooO());
                                    OooO0oO2.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                                    }
                                    OooO0oO2.OooO0O0(1, 3, this);
                                }
                                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 3;
                                continue;
                            case 4:
                                OooOOo();
                                continue;
                            case 5:
                                abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 5;
                                continue;
                            case 6:
                                OooOO0o();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z2 = true;
                } else {
                    if (!z2 && i == -1 && abstractComponentCallbacksC0593o0oOoOo0.OooOO0o && !abstractComponentCallbacksC0593o0oOoOo0.OooOOo()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                        }
                        o0oo0000 o0oo0000Var = (o0oo0000) ooo00ooo.OooO0Oo;
                        o0oo0000Var.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                        }
                        o0oo0000Var.OooO0O0(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0);
                        ooo00ooo.OooOo0O(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                        }
                        abstractComponentCallbacksC0593o0oOoOo0.OooOOOO();
                    }
                    if (abstractComponentCallbacksC0593o0oOoOo0.Oooo0) {
                        if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null && (viewGroup = abstractComponentCallbacksC0593o0oOoOo0.OooOooO) != null) {
                            o0OOo000 OooO0oO3 = o0OOo000.OooO0oO(viewGroup, abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOooO());
                            if (abstractComponentCallbacksC0593o0oOoOo0.OooOoO0) {
                                OooO0oO3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                                }
                                OooO0oO3.OooO0O0(3, 1, this);
                            } else {
                                OooO0oO3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                                }
                                OooO0oO3.OooO0O0(2, 1, this);
                            }
                        }
                        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOOo;
                        if (c0606o0oOoooO != null && abstractComponentCallbacksC0593o0oOoOo0.OooOO0O && C0606o0oOoooO.Oooo000(abstractComponentCallbacksC0593o0oOoOo0)) {
                            c0606o0oOoooO.OooOooO = true;
                        }
                        abstractComponentCallbacksC0593o0oOoOo0.Oooo0 = false;
                        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOOO();
                    }
                    this.OooO0Oo = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.OooO0Oo = false;
            throw th;
        }
    }

    public final void OooOO0o() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo00(5);
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0O0(oO0O0O0o.ON_PAUSE);
        }
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO0Oo(oO0O0O0o.ON_PAUSE);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 6;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = true;
        this.OooO00o.OooOOOO(false);
    }

    public final void OooOOO() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        C0586o0oOoO0 c0586o0oOoO0 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
        if (c0586o0oOoO0 == null) {
            view = null;
        } else {
            view = c0586o0oOoO0.OooOO0O;
        }
        if (view != null) {
            if (view != abstractComponentCallbacksC0593o0oOoOo0.OooOooo) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != abstractComponentCallbacksC0593o0oOoOo0.OooOooo) {
                    }
                }
            }
            view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0.OooOooo.findFocus());
            }
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooO0o().OooOO0O = null;
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.Oooo0OO();
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo(true);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 7;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoO();
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            androidx.lifecycle.OooO00o oooO00o = abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO;
            oO0O0O0o oo0o0o0o = oO0O0O0o.ON_RESUME;
            oooO00o.OooO0Oo(oo0o0o0o);
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
                abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0OO.OooO0Oo(oo0o0o0o);
            }
            C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
            c0606o0oOoooO.OooOooo = false;
            c0606o0oOoooO.Oooo000 = false;
            c0606o0oOoooO.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO.OooOo00(7);
            this.OooO00o.OooOOo(false);
            abstractComponentCallbacksC0593o0oOoOo0.OooO0O0 = null;
            abstractComponentCallbacksC0593o0oOoOo0.OooO0OO = null;
            abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo = null;
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onResume()");
    }

    public final void OooOOO0(ClassLoader classLoader) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        Bundle bundle = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0593o0oOoOo0.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0.getString("android:target_state");
        abstractComponentCallbacksC0593o0oOoOo0.OooO0oo = string;
        if (string != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooO = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0.getInt("android:target_req_state", 0);
        }
        boolean z = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0593o0oOoOo0.Oooo00O = z;
        if (z) {
            return;
        }
        abstractComponentCallbacksC0593o0oOoOo0.Oooo000 = true;
    }

    public final void OooOOOO() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        C0610o0oo00O c0610o0oo00O = new C0610o0oo00O(abstractComponentCallbacksC0593o0oOoOo0);
        if (abstractComponentCallbacksC0593o0oOoOo0.OooO00o > -1 && c0610o0oo00O.OooOOO0 == null) {
            Bundle bundle = new Bundle();
            abstractComponentCallbacksC0593o0oOoOo0.OooOoOO(bundle);
            abstractComponentCallbacksC0593o0oOoOo0.OoooO00.OooO0o(bundle);
            bundle.putParcelable("android:support:fragments", abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OoooO0());
            this.OooO00o.OooOOoo(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
                OooOOOo();
            }
            if (abstractComponentCallbacksC0593o0oOoOo0.OooO0OO != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0593o0oOoOo0.OooO0OO);
            }
            if (abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo);
            }
            if (!abstractComponentCallbacksC0593o0oOoOo0.Oooo00O) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0593o0oOoOo0.Oooo00O);
            }
            c0610o0oo00O.OooOOO0 = bundle;
            if (abstractComponentCallbacksC0593o0oOoOo0.OooO0oo != null) {
                if (bundle == null) {
                    c0610o0oo00O.OooOOO0 = new Bundle();
                }
                c0610o0oo00O.OooOOO0.putString("android:target_state", abstractComponentCallbacksC0593o0oOoOo0.OooO0oo);
                int i = abstractComponentCallbacksC0593o0oOoOo0.OooO;
                if (i != 0) {
                    c0610o0oo00O.OooOOO0.putInt("android:target_req_state", i);
                }
            }
        } else {
            c0610o0oo00O.OooOOO0 = abstractComponentCallbacksC0593o0oOoOo0.OooO0O0;
        }
        C0610o0oo00O c0610o0oo00O2 = (C0610o0oo00O) ((HashMap) this.OooO0O0.OooO0OO).put(abstractComponentCallbacksC0593o0oOoOo0.OooO0o0, c0610o0oo00O);
    }

    public final void OooOOOo() {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0.OooOooo);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0593o0oOoOo0.OooOooo.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0593o0oOoOo0.OooO0OO = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0Oo.OooO0o(bundle);
        if (!bundle.isEmpty()) {
            abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo = bundle;
        }
    }

    public final void OooOOo() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
        c0606o0oOoooO.Oooo000 = true;
        c0606o0oOoooO.Oooo0o0.OooO0oo = true;
        c0606o0oOoooO.OooOo00(4);
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
            abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0O0(oO0O0O0o.ON_STOP);
        }
        abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO0Oo(oO0O0O0o.ON_STOP);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 4;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo();
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            this.OooO00o.OooOo0(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onStop()");
    }

    public final void OooOOo0() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (isLoggable) {
            Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
        }
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.Oooo0OO();
        abstractComponentCallbacksC0593o0oOoOo0.OooOo00.OooOo(true);
        abstractComponentCallbacksC0593o0oOoOo0.OooO00o = 5;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOoo0();
        if (abstractComponentCallbacksC0593o0oOoOo0.OooOoo) {
            androidx.lifecycle.OooO00o oooO00o = abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO;
            oO0O0O0o oo0o0o0o = oO0O0O0o.ON_START;
            oooO00o.OooO0Oo(oo0o0o0o);
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOooo != null) {
                abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0OO.OooO0Oo(oo0o0o0o);
            }
            C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOo00;
            c0606o0oOoooO.OooOooo = false;
            c0606o0oOoooO.Oooo000 = false;
            c0606o0oOoooO.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO.OooOo00(5);
            this.OooO00o.OooOo00(false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " did not call through to super.onStart()");
    }

    public OooO00o(C0415o0Oo0O0O c0415o0Oo0O0O, oOO00OOO ooo00ooo, AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, C0610o0oo00O c0610o0oo00O) {
        this.OooO00o = c0415o0Oo0O0O;
        this.OooO0O0 = ooo00ooo;
        this.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0;
        abstractComponentCallbacksC0593o0oOoOo0.OooO0OO = null;
        abstractComponentCallbacksC0593o0oOoOo0.OooO0Oo = null;
        abstractComponentCallbacksC0593o0oOoOo0.OooOOo0 = 0;
        abstractComponentCallbacksC0593o0oOoOo0.OooOOO = false;
        abstractComponentCallbacksC0593o0oOoOo0.OooOO0O = false;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = abstractComponentCallbacksC0593o0oOoOo0.OooO0oO;
        abstractComponentCallbacksC0593o0oOoOo0.OooO0oo = abstractComponentCallbacksC0593o0oOoOo02 != null ? abstractComponentCallbacksC0593o0oOoOo02.OooO0o0 : null;
        abstractComponentCallbacksC0593o0oOoOo0.OooO0oO = null;
        Bundle bundle = c0610o0oo00O.OooOOO0;
        abstractComponentCallbacksC0593o0oOoOo0.OooO0O0 = bundle == null ? new Bundle() : bundle;
    }

    public OooO00o(C0415o0Oo0O0O c0415o0Oo0O0O, oOO00OOO ooo00ooo, ClassLoader classLoader, C0596o0oOoo c0596o0oOoo, C0610o0oo00O c0610o0oo00O) {
        this.OooO00o = c0415o0Oo0O0O;
        this.OooO0O0 = ooo00ooo;
        AbstractComponentCallbacksC0593o0oOoOo0 OooO00o = c0596o0oOoo.OooO00o(c0610o0oo00O.OooO00o);
        Bundle bundle = c0610o0oo00O.OooOO0;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        OooO00o.Oooo0OO(bundle);
        OooO00o.OooO0o0 = c0610o0oo00O.OooO0O0;
        OooO00o.OooOOO0 = c0610o0oo00O.OooO0OO;
        OooO00o.OooOOOO = true;
        OooO00o.OooOo0O = c0610o0oo00O.OooO0Oo;
        OooO00o.OooOo0o = c0610o0oo00O.OooO0o0;
        OooO00o.OooOo = c0610o0oo00O.OooO0o;
        OooO00o.OooOoOO = c0610o0oo00O.OooO0oO;
        OooO00o.OooOO0o = c0610o0oo00O.OooO0oo;
        OooO00o.OooOoO = c0610o0oo00O.OooO;
        OooO00o.OooOoO0 = c0610o0oo00O.OooOO0O;
        OooO00o.Oooo0o = EnumC0759oO0O0o.values()[c0610o0oo00O.OooOO0o];
        Bundle bundle2 = c0610o0oo00O.OooOOO0;
        OooO00o.OooO0O0 = bundle2 == null ? new Bundle() : bundle2;
        this.OooO0OO = OooO00o;
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(OooO00o);
        }
    }
}
