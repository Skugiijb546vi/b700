package com.ninja.engine;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
/* renamed from: com.ninja.engine.oOoOo0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231oOoOo0o0 extends C0331o0O0oo {
    public View OooO0Oo;
    public WindowInsetsController OooO0o0;
    
    public C1231oOoOo0o0(android.content.Context context) {
        super(context);
    }

    public C1231oOoOo0o0(View view) {
        super(1);
        this.OooO0Oo = view;
    }

    @Override // com.ninja.engine.C0331o0O0oo
    public final void OooOoo() {
        int ime;
        View view = this.OooO0Oo;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.OooO0o0;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.OooOoo();
    }
}


