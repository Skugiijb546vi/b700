package com.ninja.engine;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o00O00 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ o00O00(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.OooO00o) {
            case 0:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.OooO0O0;
                if (!appCompatSpinner.getInternalPopup().OooO00o()) {
                    appCompatSpinner.OooO0o.OooOO0O(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            case 1:
                C0123o00O00o c0123o00O00o = (C0123o00O00o) this.OooO0O0;
                AppCompatSpinner appCompatSpinner2 = c0123o00O00o.Oooo00o;
                c0123o00O00o.getClass();
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(c0123o00O00o.Oooo000)) {
                    c0123o00O00o.OooOOo0();
                    c0123o00O00o.OooO0Oo();
                    return;
                }
                c0123o00O00o.dismiss();
                return;
            case 2:
                View$OnKeyListenerC0276o00ooo0o view$OnKeyListenerC0276o00ooo0o = (View$OnKeyListenerC0276o00ooo0o) this.OooO0O0;
                if (view$OnKeyListenerC0276o00ooo0o.OooO00o()) {
                    ArrayList arrayList = view$OnKeyListenerC0276o00ooo0o.OooO;
                    if (arrayList.size() > 0 && !((C0275o00ooo0O) arrayList.get(0)).OooO00o.OooOoO0) {
                        View view = view$OnKeyListenerC0276o00ooo0o.OooOOOo;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0275o00ooo0O) it.next()).OooO00o.OooO0Oo();
                            }
                            return;
                        }
                        view$OnKeyListenerC0276o00ooo0o.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                View$OnKeyListenerC1346oOooooo0 view$OnKeyListenerC1346oOooooo0 = (View$OnKeyListenerC1346oOooooo0) this.OooO0O0;
                if (view$OnKeyListenerC1346oOooooo0.OooO00o() && !view$OnKeyListenerC1346oOooooo0.OooO.OooOoO0) {
                    View view2 = view$OnKeyListenerC1346oOooooo0.OooOOO;
                    if (view2 != null && view2.isShown()) {
                        view$OnKeyListenerC1346oOooooo0.OooO.OooO0Oo();
                        return;
                    } else {
                        view$OnKeyListenerC1346oOooooo0.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
