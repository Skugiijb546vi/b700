package com.ninja.engine;

import android.view.View;
import android.view.Window;
/* renamed from: com.ninja.engine.oo0Ooo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540oo0Ooo0O extends C1539oo0Ooo00 {
    public C1540oo0Ooo0O(Window window, o00O o00o) {
        super(window, o00o);
    }
    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOOO0(boolean z) {
        if (z) {
            Window window = this.OooO0O0;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        OooOOo(16);
    }
}


