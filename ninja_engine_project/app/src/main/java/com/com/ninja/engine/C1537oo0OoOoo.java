package com.ninja.engine;

import android.view.View;
import android.view.Window;
/* renamed from: com.ninja.engine.oo0OoOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1537oo0OoOoo extends AbstractC1137oOOoooO {
    public final Window OooO0O0;
    public final o00O OooO0OO;

    public C1537oo0OoOoo(Window window, o00O o00o) {
        this.OooO0O0 = window;
        this.OooO0OO = o00o;
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOOOo() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((8 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((C0331o0O0oo) this.OooO0OO.OooO0O0).OooOoo();
                        }
                    } else {
                        OooOOo(2);
                    }
                } else {
                    OooOOo(4);
                    this.OooO0O0.clearFlags(1024);
                }
            }
        }
    }

    public final void OooOOo(int i) {
        View decorView = this.OooO0O0.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
