package com.ninja.engine;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOoOoO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237oOoOoO0O {
    public int OooO00o;
    public int OooO0O0;
    public final AbstractComponentCallbacksC0593o0oOoOo0 OooO0OO;
    public final ArrayList OooO0Oo;
    public boolean OooO0o;
    public final HashSet OooO0o0;
    public boolean OooO0oO;
    public final androidx.fragment.app.OooO00o OooO0oo;

    public C1237oOoOoO0O(int i, int i2, androidx.fragment.app.OooO00o oooO00o, C0267o00ooOOo c0267o00ooOOo) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
        this.OooO0Oo = new ArrayList();
        this.OooO0o0 = new HashSet();
        this.OooO0o = false;
        this.OooO0oO = false;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = abstractComponentCallbacksC0593o0oOoOo0;
        c0267o00ooOOo.OooO00o(new C0331o0O0oo(29, this));
        this.OooO0oo = oooO00o;
    }

    public final void OooO00o() {
        if (this.OooO0o) {
            return;
        }
        this.OooO0o = true;
        if (this.OooO0o0.isEmpty()) {
            OooO0O0();
            return;
        }
        Iterator it = new ArrayList(this.OooO0o0).iterator();
        while (it.hasNext()) {
            C0267o00ooOOo c0267o00ooOOo = (C0267o00ooOOo) it.next();
            synchronized (c0267o00ooOOo) {
                try {
                    if (!c0267o00ooOOo.OooO00o) {
                        c0267o00ooOOo.OooO00o = true;
                        c0267o00ooOOo.OooO0OO = true;
                        InterfaceC0265o00ooOO interfaceC0265o00ooOO = c0267o00ooOOo.OooO0O0;
                        if (interfaceC0265o00ooOO != null) {
                            try {
                                interfaceC0265o00ooOO.OooOO0O();
                            } catch (Throwable th) {
                                synchronized (c0267o00ooOOo) {
                                    c0267o00ooOOo.OooO0OO = false;
                                    c0267o00ooOOo.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0267o00ooOOo) {
                            c0267o00ooOOo.OooO0OO = false;
                            c0267o00ooOOo.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void OooO0O0() {
        if (!this.OooO0oO) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.OooO0oO = true;
            Iterator it = this.OooO0Oo.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.OooO0oo.OooOO0O();
    }

    public final void OooO0OO(int i, int i2) {
        int OooOOOo = AbstractC1230oOoOo0o.OooOOOo(i2);
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.OooO0OO;
        if (OooOOOo != 0) {
            if (OooOOOo != 1) {
                if (OooOOOo == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                    }
                    this.OooO00o = 1;
                    this.OooO0O0 = 3;
                }
            } else if (this.OooO00o == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
                }
                this.OooO00o = 2;
                this.OooO0O0 = 2;
            }
        } else if (this.OooO00o != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0593o0oOoOo0);
            }
            this.OooO00o = i;
        }
    }

    public final void OooO0Oo() {
        float f;
        int i = this.OooO0O0;
        androidx.fragment.app.OooO00o oooO00o = this.OooO0oo;
        if (i == 2) {
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
            View findFocus = abstractComponentCallbacksC0593o0oOoOo0.OooOooo.findFocus();
            if (findFocus != null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooO0o().OooOO0O = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    findFocus.toString();
                    abstractComponentCallbacksC0593o0oOoOo0.toString();
                }
            }
            View Oooo00o = this.OooO0OO.Oooo00o();
            if (Oooo00o.getParent() == null) {
                oooO00o.OooO0O0();
                Oooo00o.setAlpha(0.0f);
            }
            if (Oooo00o.getAlpha() == 0.0f && Oooo00o.getVisibility() == 0) {
                Oooo00o.setVisibility(4);
            }
            C0586o0oOoO0 c0586o0oOoO0 = abstractComponentCallbacksC0593o0oOoOo0.Oooo00o;
            if (c0586o0oOoO0 == null) {
                f = 1.0f;
            } else {
                f = c0586o0oOoO0.OooOO0;
            }
            Oooo00o.setAlpha(f);
        } else if (i == 3) {
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo02 = oooO00o.OooO0OO;
            View Oooo00o2 = abstractComponentCallbacksC0593o0oOoOo02.Oooo00o();
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(Oooo00o2.findFocus());
                Oooo00o2.toString();
                abstractComponentCallbacksC0593o0oOoOo02.toString();
            }
            Oooo00o2.clearFocus();
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + AbstractC1230oOoOo0o.OooOo0o(this.OooO00o) + "} {mLifecycleImpact = " + AbstractC1230oOoOo0o.OooOo0O(this.OooO0O0) + "} {mFragment = " + this.OooO0OO + "}";
    }
}
