package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC0955oOO0oOoO;
import com.ninja.engine.C0142o00OO00o;
import com.ninja.engine.C0956oOO0oOoo;
import com.ninja.engine.C0958oOO0oo0;
import com.ninja.engine.C0959oOO0oo00;
import com.ninja.engine.C0961oOO0oo0o;
import com.ninja.engine.C0962oOO0ooO0;
import com.ninja.engine.EnumC0759oO0O0o;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class OooO0O0 {
    public final Runnable OooO00o;
    public final C0142o00OO00o OooO0O0 = new C0142o00OO00o();
    public AbstractC0955oOO0oOoO OooO0OO;
    public final OnBackInvokedCallback OooO0Oo;
    public boolean OooO0o;
    public OnBackInvokedDispatcher OooO0o0;
    public boolean OooO0oO;

    public OooO0O0(Runnable runnable) {
        OnBackInvokedCallback OooO00o;
        this.OooO00o = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                OooO00o = C0961oOO0oo0o.OooO00o.OooO00o(new C0956oOO0oOoo(this, 0), new C0956oOO0oOoo(this, 1), new C0959oOO0oo00(0, this), new C0959oOO0oo00(1, this));
            } else {
                OooO00o = C0958oOO0oo0.OooO00o.OooO00o(new C0959oOO0oo00(2, this));
            }
            this.OooO0Oo = OooO00o;
        }
    }

    public final void OooO00o(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, AbstractC0955oOO0oOoO abstractC0955oOO0oOoO) {
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0760oO0O0o0O, "owner");
        AbstractC0809oO0OooOO.OooOOOo(abstractC0955oOO0oOoO, "onBackPressedCallback");
        androidx.lifecycle.OooO00o OooO0o0 = interfaceC0760oO0O0o0O.OooO0o0();
        if (OooO0o0.OooO0OO == EnumC0759oO0O0o.OooO00o) {
            return;
        }
        abstractC0955oOO0oOoO.OooO0O0.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, OooO0o0, abstractC0955oOO0oOoO));
        OooO0Oo();
        abstractC0955oOO0oOoO.OooO0OO = new C0962oOO0ooO0(this, 0);
    }

    public final void OooO0O0() {
        Object obj;
        C0142o00OO00o c0142o00OO00o = this.OooO0O0;
        ListIterator<E> listIterator = c0142o00OO00o.listIterator(c0142o00OO00o.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((AbstractC0955oOO0oOoO) obj).OooO00o) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC0955oOO0oOoO abstractC0955oOO0oOoO = (AbstractC0955oOO0oOoO) obj;
        this.OooO0OO = null;
        if (abstractC0955oOO0oOoO != null) {
            abstractC0955oOO0oOoO.OooO00o();
            return;
        }
        Runnable runnable = this.OooO00o;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void OooO0OO(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.OooO0o0;
        OnBackInvokedCallback onBackInvokedCallback = this.OooO0Oo;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0958oOO0oo0 c0958oOO0oo0 = C0958oOO0oo0.OooO00o;
        if (z && !this.OooO0o) {
            c0958oOO0oo0.OooO0O0(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.OooO0o = true;
        } else if (z || !this.OooO0o) {
        } else {
            c0958oOO0oo0.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
            this.OooO0o = false;
        }
    }

    public final void OooO0Oo() {
        boolean z = this.OooO0oO;
        C0142o00OO00o c0142o00OO00o = this.OooO0O0;
        boolean z2 = false;
        if (!(c0142o00OO00o instanceof Collection) || !c0142o00OO00o.isEmpty()) {
            Iterator<E> it = c0142o00OO00o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC0955oOO0oOoO) it.next()).OooO00o) {
                    z2 = true;
                    break;
                }
            }
        }
        this.OooO0oO = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            OooO0OO(z2);
        }
    }
}
