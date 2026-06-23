package com.ninja.engine;

import android.os.Parcelable;
import android.view.View;
/* renamed from: com.ninja.engine.oo00oo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1439oo00oo0o extends AbstractC0326o0O0oOOO {
    public int OooO00o;

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooOO0(View view) {
        return false;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooOO0O(int i) {
        if ((i > 0 && this.OooO00o < 0) || (i < 0 && this.OooO00o > 0)) {
            this.OooO00o = 0;
        }
        this.OooO00o += i;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final Parcelable OooOOo0(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final C1536oo0OoOoO OooO0OO(C1536oo0OoOoO c1536oo0OoOoO) {
        return c1536oo0OoOoO;
    }
}
