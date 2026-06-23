package com.ninja.engine;

import android.os.SystemClock;
/* renamed from: com.ninja.engine.o00OooOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0184o00OooOo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ AbstractC0185o00OoooO OooO0O0;

    public /* synthetic */ RunnableC0184o00OooOo(AbstractC0185o00OoooO abstractC0185o00OoooO, int i) {
        this.OooO00o = i;
        this.OooO0O0 = abstractC0185o00OoooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                AbstractC0185o00OoooO abstractC0185o00OoooO = this.OooO0O0;
                if (abstractC0185o00OoooO.OooO0o0 > 0) {
                    SystemClock.uptimeMillis();
                }
                abstractC0185o00OoooO.setVisibility(0);
                return;
            default:
                AbstractC0185o00OoooO abstractC0185o00OoooO2 = this.OooO0O0;
                ((AbstractC0429o0Oo0oOo) abstractC0185o00OoooO2.getCurrentDrawable()).OooO0OO(false, false, true);
                if ((abstractC0185o00OoooO2.getProgressDrawable() == null || !abstractC0185o00OoooO2.getProgressDrawable().isVisible()) && (abstractC0185o00OoooO2.getIndeterminateDrawable() == null || !abstractC0185o00OoooO2.getIndeterminateDrawable().isVisible())) {
                    abstractC0185o00OoooO2.setVisibility(4);
                }
                abstractC0185o00OoooO2.getClass();
                return;
        }
    }
}
