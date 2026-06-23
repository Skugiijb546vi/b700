package com.ninja.engine;

import androidx.appcompat.widget.Toolbar;
/* renamed from: com.ninja.engine.oOooo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1327oOooo0O implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Toolbar OooO0O0;

    public /* synthetic */ RunnableC1327oOooo0O(Toolbar toolbar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0892oO0ooO0o c0892oO0ooO0o;
        switch (this.OooO00o) {
            case 0:
                C1332oOooo0o0 c1332oOooo0o0 = this.OooO0O0.Oooo0o0;
                if (c1332oOooo0o0 == null) {
                    c0892oO0ooO0o = null;
                } else {
                    c0892oO0ooO0o = c1332oOooo0o0.OooO0O0;
                }
                if (c0892oO0ooO0o != null) {
                    c0892oO0ooO0o.collapseActionView();
                    return;
                }
                return;
            default:
                this.OooO0O0.OooOOO();
                return;
        }
    }
}


