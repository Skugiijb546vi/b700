package com.ninja.engine;

import android.os.Build;
import android.view.View;
/* renamed from: com.ninja.engine.oo0OO00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1488oo0OO00o extends C1483oo0O0ooo {
    public C1488oo0OO00o(int i) {
        super(i);
    }
    public static boolean OooOO0O = true;

    @Override // com.ninja.engine.C0919oOO00oOo
    public void OooOOOO(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.OooOOOO(view, i);
        } else if (OooOO0O) {
            try {
                AbstractC1531oo0OoOO0.OooO00o(view, i);
            } catch (NoSuchMethodError unused) {
                OooOO0O = false;
            }
        }
    }
}


