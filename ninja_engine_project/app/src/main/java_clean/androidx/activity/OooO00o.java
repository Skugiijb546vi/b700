package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.ninja.engine.AbstractActivityC0301o0O0Oo0;
import com.ninja.engine.AbstractC0298o0O0OOoO;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.AbstractC1094oOOoOOo0;
import com.ninja.engine.AbstractC1137oOOoooO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0086o000Oo00;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0297o0O0OOo;
import com.ninja.engine.C0299o0O0OOoo;
import com.ninja.engine.C0325o0O0oOO0;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C0592o0oOoOo;
import com.ninja.engine.C0599o0oOoo0O;
import com.ninja.engine.C0908oOO00OOo;
import com.ninja.engine.C0910oOO00Oo0;
import com.ninja.engine.C1037oOOOoo00;
import com.ninja.engine.C1228oOoOo0O0;
import com.ninja.engine.C1467oo0O0OOO;
import com.ninja.engine.ExecutorC0478o0OooO0;
import com.ninja.engine.FragmentC1096oOOoOOoo;
import com.ninja.engine.InterfaceC0319o0O0o0oo;
import com.ninja.engine.InterfaceC0625o0oo0OOo;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC0786oO0OOooO;
import com.ninja.engine.InterfaceC0890oO0ooO00;
import com.ninja.engine.InterfaceC0963oOO0ooOO;
import com.ninja.engine.InterfaceC0964oOO0ooOo;
import com.ninja.engine.InterfaceC0966oOO0ooo0;
import com.ninja.engine.InterfaceC0968oOO0oooo;
import com.ninja.engine.InterfaceC1024oOOOoO;
import com.ninja.engine.InterfaceC1192oOoOO0OO;
import com.ninja.engine.InterfaceC1468oo0O0OOo;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.R;
import com.ninja.engine.RunnableC0061o00000oO;
import com.ninja.engine.o00000OO;
import com.ninja.engine.o0000O0O;
import com.ninja.engine.o000OO00;
import com.ninja.engine.o0O0OOO;
import com.ninja.engine.o0O0OOOo;
import com.ninja.engine.oO0O0O0o;
import com.ninja.engine.oOO;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class OooO00o extends AbstractActivityC0301o0O0Oo0 implements InterfaceC1468oo0O0OOo, InterfaceC0786oO0OOooO, InterfaceC1192oOoOO0OO, InterfaceC0963oOO0ooOO, o0000O0O, InterfaceC0964oOO0ooOo, InterfaceC1024oOOOoO, InterfaceC0968oOO0oooo, oOO, InterfaceC0890oO0ooO00 {
    public final C1228oOoOo0O0 OooO;
    public final C0325o0O0oOO0 OooO0O0 = new C0325o0O0oOO0();
    public final C0131o00O0o OooO0OO;
    public final androidx.lifecycle.OooO00o OooO0Oo;
    public C1467oo0O0OOO OooO0o;
    public final C1228oOoOo0O0 OooO0o0;
    public OooO0O0 OooO0oO;
    public final ExecutorC0478o0OooO0 OooO0oo;
    public final C0297o0O0OOo OooOO0;
    public final CopyOnWriteArrayList OooOO0O;
    public final CopyOnWriteArrayList OooOO0o;
    public final CopyOnWriteArrayList OooOOO;
    public final CopyOnWriteArrayList OooOOO0;
    public final CopyOnWriteArrayList OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.activity.ImmLeaksCleaner, com.ninja.engine.oO0O0Oo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ninja.engine.o0O0OOO0] */
    public OooO00o() {
        final o000OO00 o000oo00 = (o000OO00) this;
        this.OooO0OO = new C0131o00O0o(new RunnableC0061o00000oO(6, o000oo00));
        androidx.lifecycle.OooO00o oooO00o = new androidx.lifecycle.OooO00o(this);
        this.OooO0Oo = oooO00o;
        C1228oOoOo0O0 c1228oOoOo0O0 = new C1228oOoOo0O0((InterfaceC1192oOoOO0OO) this);
        this.OooO0o0 = c1228oOoOo0O0;
        this.OooO0oO = null;
        ExecutorC0478o0OooO0 executorC0478o0OooO0 = new ExecutorC0478o0OooO0(o000oo00);
        this.OooO0oo = executorC0478o0OooO0;
        this.OooO = new C1228oOoOo0O0(executorC0478o0OooO0, new InterfaceC0625o0oo0OOo() { // from class: com.ninja.engine.o0O0OOO0
            @Override // com.ninja.engine.InterfaceC0625o0oo0OOo
            public final Object OooO00o() {
                o000oo00.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.OooOO0 = new C0297o0O0OOo();
        this.OooOO0O = new CopyOnWriteArrayList();
        this.OooOO0o = new CopyOnWriteArrayList();
        this.OooOOO0 = new CopyOnWriteArrayList();
        this.OooOOO = new CopyOnWriteArrayList();
        this.OooOOOO = new CopyOnWriteArrayList();
        this.OooOOOo = false;
        this.OooOOo0 = false;
        int i = Build.VERSION.SDK_INT;
        oooO00o.OooO00o(new InterfaceC1800ooOOOoOo() { // from class: androidx.activity.ComponentActivity$2
            @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
            public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
                View view;
                if (oo0o0o0o == oO0O0O0o.ON_STOP) {
                    Window window = o000oo00.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        oooO00o.OooO00o(new InterfaceC1800ooOOOoOo() { // from class: androidx.activity.ComponentActivity$3
            @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
            public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
                if (oo0o0o0o == oO0O0O0o.ON_DESTROY) {
                    o000oo00.OooO0O0.OooO0O0 = null;
                    if (!o000oo00.isChangingConfigurations()) {
                        o000oo00.OooO0Oo().OooO00o();
                    }
                    ExecutorC0478o0OooO0 executorC0478o0OooO02 = o000oo00.OooO0oo;
                    OooO00o oooO00o2 = executorC0478o0OooO02.OooO0Oo;
                    oooO00o2.getWindow().getDecorView().removeCallbacks(executorC0478o0OooO02);
                    oooO00o2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(executorC0478o0OooO02);
                }
            }
        });
        oooO00o.OooO00o(new InterfaceC1800ooOOOoOo() { // from class: androidx.activity.ComponentActivity$4
            @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
            public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
                OooO00o oooO00o2 = o000oo00;
                if (oooO00o2.OooO0o == null) {
                    C0299o0O0OOoo c0299o0O0OOoo = (C0299o0O0OOoo) oooO00o2.getLastNonConfigurationInstance();
                    if (c0299o0O0OOoo != null) {
                        oooO00o2.OooO0o = c0299o0O0OOoo.OooO00o;
                    }
                    if (oooO00o2.OooO0o == null) {
                        oooO00o2.OooO0o = new C1467oo0O0OOO();
                    }
                }
                oooO00o2.OooO0Oo.OooO0o(this);
            }
        });
        c1228oOoOo0O0.OooO0Oo();
        AbstractC0694o0ooooo0.OooOo00(this);
        if (i <= 23) {
            ImmLeaksCleaner obj = new ImmLeaksCleaner();
            obj.OooO00o = this;
            oooO00o.OooO00o(obj);
        }
        ((C0086o000Oo00) c1228oOoOo0O0.OooO0Oo).OooO0o0("android:support:activity-result", new o0O0OOO(0, o000oo00));
        OooO(new o0O0OOOo(o000oo00, 0));
    }

    public final void OooO(InterfaceC0966oOO0ooo0 interfaceC0966oOO0ooo0) {
        C0325o0O0oOO0 c0325o0O0oOO0 = this.OooO0O0;
        c0325o0O0oOO0.getClass();
        if (((Context) c0325o0O0oOO0.OooO0O0) != null) {
            interfaceC0966oOO0ooo0.OooO00o();
        }
        ((CopyOnWriteArraySet) c0325o0O0oOO0.OooO00o).add(interfaceC0966oOO0ooo0);
    }

    @Override // com.ninja.engine.InterfaceC1192oOoOO0OO
    public final C0086o000Oo00 OooO00o() {
        return (C0086o000Oo00) this.OooO0o0.OooO0Oo;
    }

    @Override // com.ninja.engine.InterfaceC0786oO0OOooO
    public final C0910oOO00Oo0 OooO0OO() {
        C0910oOO00Oo0 c0910oOO00Oo0 = new C0910oOO00Oo0();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0910oOO00Oo0.OooO00o;
        if (application != null) {
            linkedHashMap.put(C0455o0OoOo00.OooO0oo, getApplication());
        }
        linkedHashMap.put(AbstractC0694o0ooooo0.OooOOO, this);
        linkedHashMap.put(AbstractC0694o0ooooo0.OooOOOO, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC0694o0ooooo0.OooOOOo, getIntent().getExtras());
        }
        return c0910oOO00Oo0;
    }

    @Override // com.ninja.engine.InterfaceC1468oo0O0OOo
    public final C1467oo0O0OOO OooO0Oo() {
        if (getApplication() != null) {
            if (this.OooO0o == null) {
                C0299o0O0OOoo c0299o0O0OOoo = (C0299o0O0OOoo) getLastNonConfigurationInstance();
                if (c0299o0O0OOoo != null) {
                    this.OooO0o = c0299o0O0OOoo.OooO00o;
                }
                if (this.OooO0o == null) {
                    this.OooO0o = new C1467oo0O0OOO();
                }
            }
            return this.OooO0o;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // com.ninja.engine.InterfaceC0760oO0O0o0O
    public final androidx.lifecycle.OooO00o OooO0o0() {
        return this.OooO0Oo;
    }

    public final void OooO0oO(C0599o0oOoo0O c0599o0oOoo0O) {
        C0131o00O0o c0131o00O0o = this.OooO0OO;
        ((CopyOnWriteArrayList) c0131o00O0o.OooO0Oo).add(c0599o0oOoo0O);
        ((Runnable) c0131o00O0o.OooO0OO).run();
    }

    public final void OooO0oo(InterfaceC0319o0O0o0oo interfaceC0319o0O0o0oo) {
        this.OooOO0O.add(interfaceC0319o0O0o0oo);
    }

    public final void OooOO0(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOOO.add(c0592o0oOoOo);
    }

    public final void OooOO0O(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOOOO.add(c0592o0oOoOo);
    }

    public final void OooOO0o(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOO0o.add(c0592o0oOoOo);
    }

    public final void OooOOO(C0599o0oOoo0O c0599o0oOoo0O) {
        C0131o00O0o c0131o00O0o = this.OooO0OO;
        ((CopyOnWriteArrayList) c0131o00O0o.OooO0Oo).remove(c0599o0oOoo0O);
        AbstractC1230oOoOo0o.OooOO0O(((HashMap) c0131o00O0o.OooO0O0).remove(c0599o0oOoo0O));
        ((Runnable) c0131o00O0o.OooO0OO).run();
    }

    public final OooO0O0 OooOOO0() {
        if (this.OooO0oO == null) {
            this.OooO0oO = new OooO0O0(new o00000OO(4, this));
            this.OooO0Oo.OooO00o(new InterfaceC1800ooOOOoOo() { // from class: androidx.activity.ComponentActivity$6
                @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
                public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
                    if (oo0o0o0o == oO0O0O0o.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        OooO0O0 oooO0O0 = OooO00o.this.OooO0oO;
                        OnBackInvokedDispatcher OooO00o = AbstractC0298o0O0OOoO.OooO00o((OooO00o) interfaceC0760oO0O0o0O);
                        oooO0O0.getClass();
                        AbstractC0809oO0OooOO.OooOOOo(OooO00o, "invoker");
                        oooO0O0.OooO0o0 = OooO00o;
                        oooO0O0.OooO0OO(oooO0O0.OooO0oO);
                    }
                }
            });
        }
        return this.OooO0oO;
    }

    public final void OooOOOO(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOO0O.remove(c0592o0oOoOo);
    }

    public final void OooOOOo(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOOO.remove(c0592o0oOoOo);
    }

    public final void OooOOo(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOO0o.remove(c0592o0oOoOo);
    }

    public final void OooOOo0(C0592o0oOoOo c0592o0oOoOo) {
        this.OooOOOO.remove(c0592o0oOoOo);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.OooOO0.OooO00o(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        OooOOO0().OooO0O0();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.OooOO0O.iterator();
        while (it.hasNext()) {
            ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(configuration);
        }
    }

    @Override // com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.OooO0o0.OooO0o0(bundle);
        C0325o0O0oOO0 c0325o0O0oOO0 = this.OooO0O0;
        c0325o0O0oOO0.getClass();
        c0325o0O0oOO0.OooO0O0 = this;
        Iterator it = ((CopyOnWriteArraySet) c0325o0O0oOO0.OooO00o).iterator();
        while (it.hasNext()) {
            ((InterfaceC0966oOO0ooo0) it.next()).OooO00o();
        }
        super.onCreate(bundle);
        int i = FragmentC1096oOOoOOoo.OooO0O0;
        AbstractC1094oOOoOOo0.OooOOO0(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.OooO0OO.OooO0Oo).iterator();
            while (it.hasNext()) {
                ((C0599o0oOoo0O) it.next()).OooO00o.OooOO0();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0OO.OooO0Oo).iterator();
        while (it.hasNext()) {
            if (((C0599o0oOoo0O) it.next()).OooO00o.OooOOOO()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.OooOOOo) {
            return;
        }
        Iterator it = this.OooOOO.iterator();
        while (it.hasNext()) {
            ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(new C0908oOO00OOo(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.OooOOO0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.OooO0OO.OooO0Oo).iterator();
        while (it.hasNext()) {
            ((C0599o0oOoo0O) it.next()).OooO00o.OooOOOo();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.OooOOo0) {
            return;
        }
        Iterator it = this.OooOOOO.iterator();
        while (it.hasNext()) {
            ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(new C1037oOOOoo00(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.OooO0OO.OooO0Oo).iterator();
            while (it.hasNext()) {
                ((C0599o0oOoo0O) it.next()).OooO00o.OooOOoo();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.OooOO0.OooO00o(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.o0O0OOoo, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0299o0O0OOoo c0299o0O0OOoo;
        C1467oo0O0OOO c1467oo0O0OOO = this.OooO0o;
        if (c1467oo0O0OOO == null && (c0299o0O0OOoo = (C0299o0O0OOoo) getLastNonConfigurationInstance()) != null) {
            c1467oo0O0OOO = c0299o0O0OOoo.OooO00o;
        }
        if (c1467oo0O0OOO == null) {
            return null;
        }
        C0299o0O0OOoo obj = new C0299o0O0OOoo();
        obj.OooO00o = c1467oo0O0OOO;
        return obj;
    }

    @Override // com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.OooO00o oooO00o = this.OooO0Oo;
        if (oooO00o instanceof androidx.lifecycle.OooO00o) {
            oooO00o.OooO0oO();
        }
        super.onSaveInstanceState(bundle);
        this.OooO0o0.OooO0o(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.OooOO0o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1091oOOoOOOO.OooOo0()) {
                AbstractC1091oOOoOOOO.OooO00o("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.OooO.OooO0O0();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        AbstractC1091oOOoOOOO.OooOooo(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC0809oO0OooOO.OooOOOo(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        AbstractC1137oOOoooO.OooOO0o(getWindow().getDecorView(), this);
        AbstractC1094oOOoOOo0.OooOOoo(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        AbstractC0809oO0OooOO.OooOOOo(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
        View decorView3 = getWindow().getDecorView();
        ExecutorC0478o0OooO0 executorC0478o0OooO0 = this.OooO0oo;
        if (!executorC0478o0OooO0.OooO0OO) {
            executorC0478o0OooO0.OooO0OO = true;
            decorView3.getViewTreeObserver().addOnDrawListener(executorC0478o0OooO0);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.OooOOOo = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.OooOOOo = false;
            Iterator it = this.OooOOO.iterator();
            while (it.hasNext()) {
                AbstractC0809oO0OooOO.OooOOOo(configuration, "newConfig");
                ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(new C0908oOO00OOo(z));
            }
        } catch (Throwable th) {
            this.OooOOOo = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.OooOOo0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.OooOOo0 = false;
            Iterator it = this.OooOOOO.iterator();
            while (it.hasNext()) {
                AbstractC0809oO0OooOO.OooOOOo(configuration, "newConfig");
                ((InterfaceC0319o0O0o0oo) it.next()).OooO00o(new C1037oOOOoo00(z));
            }
        } catch (Throwable th) {
            this.OooOOo0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}


