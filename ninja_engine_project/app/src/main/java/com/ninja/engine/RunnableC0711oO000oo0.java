package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oO000oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0711oO000oo0 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ boolean OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ RunnableC0711oO000oo0(EditText editText) {
        this.OooO00o = 1;
        this.OooO0OO = editText;
        this.OooO0O0 = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Object obj;
        C1543oo0OooOO c1543oo0OooOO;
        boolean z = this.OooO0O0;
        Object obj2 = this.OooO0OO;
        switch (this.OooO00o) {
            case 0:
                C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) obj2;
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    if (z) {
                        c0792oO0Oo0Oo.OoooOOo.setVisibility(0);
                        c0792oO0Oo0Oo.OoooOo0();
                        return;
                    }
                    c0792oO0Oo0Oo.OoooOO0.setText(R.string.no_network_connection);
                    return;
                }
                return;
            default:
                View view = (View) obj2;
                Object obj3 = null;
                if (z) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    if (Build.VERSION.SDK_INT >= 30) {
                        c1543oo0OooOO = AbstractC1458oo0O00o0.OooO0O0(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        c1543oo0OooOO = new C1543oo0OooOO(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                        }
                        c1543oo0OooOO = null;
                    }
                    if (c1543oo0OooOO != null) {
                        c1543oo0OooOO.OooO00o.OooOOOo();
                        return;
                    }
                }
                Context context2 = view.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    obj = AbstractC0121o000oooo.OooO0oo(context2);
                } else {
                    if (i >= 23) {
                        str = AbstractC0121o000oooo.OooO(context2);
                    } else {
                        str = (String) AbstractC0324o0O0oOO.OooO00o.get(InputMethodManager.class);
                    }
                    if (str != null) {
                        obj3 = context2.getSystemService(str);
                    }
                    obj = obj3;
                }
                ((InputMethodManager) obj).showSoftInput(view, 1);
                return;
        }
    }

    public /* synthetic */ RunnableC0711oO000oo0(C0792oO0Oo0Oo c0792oO0Oo0Oo, boolean z) {
        this.OooO00o = 0;
        this.OooO0OO = c0792oO0Oo0Oo;
        this.OooO0O0 = z;
    }
}
