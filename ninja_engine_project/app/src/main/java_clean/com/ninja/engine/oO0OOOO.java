package com.ninja.engine;
/* loaded from: classes.dex */
public final class oO0OOOO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0781oO0OOoO OooO0O0;

    public /* synthetic */ oO0OOOO(C0781oO0OOoO c0781oO0OOoO, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0781oO0OOoO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                C0432o0Oo0ooO c0432o0Oo0ooO = this.OooO0O0.OooO0OO;
                if (c0432o0Oo0ooO != null) {
                    c0432o0Oo0ooO.setListSelectionHidden(true);
                    c0432o0Oo0ooO.requestLayout();
                    return;
                }
                return;
            default:
                C0781oO0OOoO c0781oO0OOoO = this.OooO0O0;
                C0432o0Oo0ooO c0432o0Oo0ooO2 = c0781oO0OOoO.OooO0OO;
                if (c0432o0Oo0ooO2 != null && c0432o0Oo0ooO2.isAttachedToWindow() && c0781oO0OOoO.OooO0OO.getCount() > c0781oO0OOoO.OooO0OO.getChildCount() && c0781oO0OOoO.OooO0OO.getChildCount() <= c0781oO0OOoO.OooOOO0) {
                    c0781oO0OOoO.OooOoO.setInputMethodMode(2);
                    c0781oO0OOoO.OooO0Oo();
                    return;
                }
                return;
        }
    }
}


