package com.ninja.engine;

import android.util.Log;
import com.app.framework.core.system.JarConfig;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;
/* renamed from: com.ninja.engine.o00OoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172o00OoOo implements InterfaceC0605o0oOooo0 {
    public int OooO;
    public final ArrayList OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;
    public String OooO0oo;
    public CharSequence OooOO0;
    public int OooOO0O;
    public CharSequence OooOO0o;
    public ArrayList OooOOO;
    public ArrayList OooOOO0;
    public boolean OooOOOO;
    public final C0606o0oOoooO OooOOOo;
    public int OooOOo;
    public boolean OooOOo0;

    public C0172o00OoOo(C0606o0oOoooO c0606o0oOoooO) {
        c0606o0oOoooO.OooOoo();
        C0589o0oOoOO0 c0589o0oOoOO0 = c0606o0oOoooO.OooOo00;
        if (c0589o0oOoOO0 != null) {
            c0589o0oOoOO0.Oooo00O.getClassLoader();
        }
        this.OooO00o = new ArrayList();
        this.OooOOOO = false;
        this.OooOOo = -1;
        this.OooOOOo = c0606o0oOoooO;
    }

    @Override // com.ninja.engine.InterfaceC0605o0oOooo0
    public final boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.OooO0oO) {
            C0606o0oOoooO c0606o0oOoooO = this.OooOOOo;
            if (c0606o0oOoooO.OooO0Oo == null) {
                c0606o0oOoooO.OooO0Oo = new ArrayList();
            }
            c0606o0oOoooO.OooO0Oo.add(this);
            return true;
        }
        return true;
    }

    public final void OooO0O0(C0614o0oo00o c0614o0oo00o) {
        this.OooO00o.add(c0614o0oo00o);
        c0614o0oo00o.OooO0Oo = this.OooO0O0;
        c0614o0oo00o.OooO0o0 = this.OooO0OO;
        c0614o0oo00o.OooO0o = this.OooO0Oo;
        c0614o0oo00o.OooO0oO = this.OooO0o0;
    }

    public final void OooO0OO(int i) {
        if (!this.OooO0oO) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0614o0oo00o c0614o0oo00o = (C0614o0oo00o) arrayList.get(i2);
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = c0614o0oo00o.OooO0O0;
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOOo0 += i;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(c0614o0oo00o.OooO0O0);
                    int i3 = c0614o0oo00o.OooO0O0.OooOOo0;
                }
            }
        }
    }

    public final int OooO0Oo(boolean z) {
        int i;
        if (!this.OooOOo0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new C0815oO0o000());
                OooO0o("  ", printWriter, true);
                printWriter.close();
            }
            this.OooOOo0 = true;
            boolean z2 = this.OooO0oO;
            C0606o0oOoooO c0606o0oOoooO = this.OooOOOo;
            if (z2) {
                i = c0606o0oOoooO.OooO.getAndIncrement();
            } else {
                i = -1;
            }
            this.OooOOo = i;
            c0606o0oOoooO.OooOo0O(this, z);
            return this.OooOOo;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void OooO0o(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.OooO0oo);
            printWriter.print(" mIndex=");
            printWriter.print(this.OooOOo);
            printWriter.print(" mCommitted=");
            printWriter.println(this.OooOOo0);
            if (this.OooO0o != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.OooO0o));
            }
            if (this.OooO0O0 != 0 || this.OooO0OO != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.OooO0O0));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.OooO0OO));
            }
            if (this.OooO0Oo != 0 || this.OooO0o0 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.OooO0Oo));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.OooO0o0));
            }
            if (this.OooO != 0 || this.OooOO0 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.OooO));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.OooOO0);
            }
            if (this.OooOO0O != 0 || this.OooOO0o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.OooOO0O));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.OooOO0o);
            }
        }
        ArrayList arrayList = this.OooO00o;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0614o0oo00o c0614o0oo00o = (C0614o0oo00o) arrayList.get(i);
                switch (c0614o0oo00o.OooO00o) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case JarConfig.MAX_CACHE_SIZE /* 10 */:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c0614o0oo00o.OooO00o;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0614o0oo00o.OooO0O0);
                if (z) {
                    if (c0614o0oo00o.OooO0Oo != 0 || c0614o0oo00o.OooO0o0 != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0614o0oo00o.OooO0Oo));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0614o0oo00o.OooO0o0));
                    }
                    if (c0614o0oo00o.OooO0o != 0 || c0614o0oo00o.OooO0oO != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0614o0oo00o.OooO0o));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0614o0oo00o.OooO0oO));
                    }
                }
            }
        }
    }

    public final void OooO0o0(int i, AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, String str, int i2) {
        String str2 = abstractComponentCallbacksC0593o0oOoOo0.Oooo0o0;
        if (str2 != null) {
            AbstractC0615o0oo00o0.OooO0O0(abstractComponentCallbacksC0593o0oOoOo0, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0593o0oOoOo0.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = abstractComponentCallbacksC0593o0oOoOo0.OooOo;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0593o0oOoOo0 + ": was " + abstractComponentCallbacksC0593o0oOoOo0.OooOo + " now " + str);
                }
                abstractComponentCallbacksC0593o0oOoOo0.OooOo = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = abstractComponentCallbacksC0593o0oOoOo0.OooOo0O;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0593o0oOoOo0 + ": was " + abstractComponentCallbacksC0593o0oOoOo0.OooOo0O + " now " + i);
                    }
                    abstractComponentCallbacksC0593o0oOoOo0.OooOo0O = i;
                    abstractComponentCallbacksC0593o0oOoOo0.OooOo0o = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " with tag " + str + " to container view with no id");
                }
            }
            OooO0O0(new C0614o0oo00o(i2, abstractComponentCallbacksC0593o0oOoOo0));
            abstractComponentCallbacksC0593o0oOoOo0.OooOOo = this.OooOOOo;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void OooO0oO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOOo;
        if (c0606o0oOoooO != null && c0606o0oOoooO != this.OooOOOo) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0593o0oOoOo0.toString() + " is already attached to a FragmentManager.");
        }
        OooO0O0(new C0614o0oo00o(4, abstractComponentCallbacksC0593o0oOoOo0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.OooOOo >= 0) {
            sb.append(" #");
            sb.append(this.OooOOo);
        }
        if (this.OooO0oo != null) {
            sb.append(" ");
            sb.append(this.OooO0oo);
        }
        sb.append("}");
        return sb.toString();
    }
}


