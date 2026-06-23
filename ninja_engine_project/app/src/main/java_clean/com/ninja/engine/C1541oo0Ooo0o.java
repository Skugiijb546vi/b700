package com.ninja.engine;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.app.framework.core.system.JarConfig;
/* renamed from: com.ninja.engine.oo0Ooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1541oo0Ooo0o extends AbstractC1137oOOoooO {
    public final WindowInsetsController OooO0O0;
    public final o00O OooO0OO;
    public Window OooO0Oo;

    public C1541oo0Ooo0o(WindowInsetsController windowInsetsController, o00O o00o) {
        this.OooO0O0 = windowInsetsController;
        this.OooO0OO = o00o;
    }
    public void OooOO0O(android.graphics.Typeface typeface) {}
    public void OooOO0(int i) {}

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOOO(boolean z) {
        Window window = this.OooO0Oo;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | JarConfig.DEFAULT_BUFFER_SIZE);
            }
            this.OooO0O0.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.OooO0O0.setSystemBarsAppearance(0, 8);
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOOO0(boolean z) {
        Window window = this.OooO0Oo;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.OooO0O0.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.OooO0O0.setSystemBarsAppearance(0, 16);
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOOOo() {
        ((C0331o0O0oo) this.OooO0OO.OooO0O0).OooOoo();
        this.OooO0O0.show(0);
    }
}


