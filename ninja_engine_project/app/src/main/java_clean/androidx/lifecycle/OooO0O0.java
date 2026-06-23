package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.ninja.engine.AbstractC0791oO0Oo0O;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C1182oOoO;
import com.ninja.engine.C1183oOoO0oo;
import com.ninja.engine.C1184oOoO0ooO;
import com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.o00O;
import com.ninja.engine.o00OO000;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class OooO0O0 {
    public static final Object OooOO0 = new Object();
    public boolean OooO;
    public final Object OooO00o;
    public final C1182oOoO OooO0O0 = new C1182oOoO();
    public int OooO0OO = 0;
    public boolean OooO0Oo;
    public volatile Object OooO0o;
    public volatile Object OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;

    public OooO0O0() {
        Object obj = OooOO0;
        this.OooO0o = obj;
        this.OooO0o0 = obj;
        this.OooO0oO = -1;
    }

    public static void OooO00o(String str) {
        ((o00OO000) o00OO000.OooOOo().OooO0O0).getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException(AbstractC1230oOoOo0o.OooO0oo("Cannot invoke ", str, " on a background thread"));
    }

    public final void OooO0O0(AbstractC0791oO0Oo0O abstractC0791oO0Oo0O) {
        if (!abstractC0791oO0Oo0O.OooO0O0) {
            return;
        }
        if (!abstractC0791oO0Oo0O.OooO0o0()) {
            abstractC0791oO0Oo0O.OooO0OO(false);
            return;
        }
        int i = abstractC0791oO0Oo0O.OooO0OO;
        int i2 = this.OooO0oO;
        if (i >= i2) {
            return;
        }
        abstractC0791oO0Oo0O.OooO0OO = i2;
        o00O o00o = abstractC0791oO0Oo0O.OooO00o;
        Object obj = this.OooO0o0;
        o00o.getClass();
        if (((InterfaceC0760oO0O0o0O) obj) != null) {
            DialogInterface$OnCancelListenerC0390o0OOoO0o dialogInterface$OnCancelListenerC0390o0OOoO0o = (DialogInterface$OnCancelListenerC0390o0OOoO0o) o00o.OooO0O0;
            if (dialogInterface$OnCancelListenerC0390o0OOoO0o.Ooooo00) {
                View Oooo00o = dialogInterface$OnCancelListenerC0390o0OOoO0o.Oooo00o();
                if (Oooo00o.getParent() == null) {
                    if (dialogInterface$OnCancelListenerC0390o0OOoO0o.OooooOo != null) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(dialogInterface$OnCancelListenerC0390o0OOoO0o.OooooOo);
                        }
                        dialogInterface$OnCancelListenerC0390o0OOoO0o.OooooOo.setContentView(Oooo00o);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    public final void OooO0OO(AbstractC0791oO0Oo0O abstractC0791oO0Oo0O) {
        if (this.OooO0oo) {
            this.OooO = true;
            return;
        }
        this.OooO0oo = true;
        do {
            this.OooO = false;
            if (abstractC0791oO0Oo0O != null) {
                OooO0O0(abstractC0791oO0Oo0O);
                abstractC0791oO0Oo0O = null;
            } else {
                C1182oOoO c1182oOoO = this.OooO0O0;
                c1182oOoO.getClass();
                C1184oOoO0ooO c1184oOoO0ooO = new C1184oOoO0ooO(c1182oOoO);
                c1182oOoO.OooO0OO.put(c1184oOoO0ooO, Boolean.FALSE);
                while (c1184oOoO0ooO.hasNext()) {
                    OooO0O0((AbstractC0791oO0Oo0O) ((Map.Entry) c1184oOoO0ooO.next()).getValue());
                    if (this.OooO) {
                        break;
                    }
                }
            }
        } while (this.OooO);
        this.OooO0oo = false;
    }

    public final void OooO0Oo(o00O o00o) {
        Object obj;
        OooO00o("observeForever");
        AbstractC0791oO0Oo0O abstractC0791oO0Oo0O = new AbstractC0791oO0Oo0O(this, o00o) {};
        C1182oOoO c1182oOoO = this.OooO0O0;
        C1183oOoO0oo OooO00o = c1182oOoO.OooO00o(o00o);
        if (OooO00o != null) {
            obj = OooO00o.OooO0O0;
        } else {
            C1183oOoO0oo c1183oOoO0oo = new C1183oOoO0oo(o00o, abstractC0791oO0Oo0O);
            c1182oOoO.OooO0Oo++;
            C1183oOoO0oo c1183oOoO0oo2 = c1182oOoO.OooO0O0;
            if (c1183oOoO0oo2 == null) {
                c1182oOoO.OooO00o = c1183oOoO0oo;
            } else {
                c1183oOoO0oo2.OooO0OO = c1183oOoO0oo;
                c1183oOoO0oo.OooO0Oo = c1183oOoO0oo2;
            }
            c1182oOoO.OooO0O0 = c1183oOoO0oo;
            obj = null;
        }
        AbstractC0791oO0Oo0O abstractC0791oO0Oo0O2 = (AbstractC0791oO0Oo0O) obj;
        if (!(abstractC0791oO0Oo0O2 instanceof LiveData$LifecycleBoundObserver)) {
            if (abstractC0791oO0Oo0O2 != null) {
                return;
            }
            abstractC0791oO0Oo0O.OooO0OO(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
}


