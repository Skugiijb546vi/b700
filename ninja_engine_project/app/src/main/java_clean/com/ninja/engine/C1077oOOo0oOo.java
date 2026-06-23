package com.ninja.engine;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: com.ninja.engine.oOOo0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077oOOo0oOo {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public boolean OooO0o;
    public Interpolator OooO0o0;

    public final void OooO00o(RecyclerView recyclerView) {
        int i = this.OooO0Oo;
        if (i >= 0) {
            this.OooO0Oo = -1;
            recyclerView.Oooo0o(i);
            this.OooO0o = false;
        } else if (this.OooO0o) {
            Interpolator interpolator = this.OooO0o0;
            if (interpolator != null && this.OooO0OO < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.OooO0OO;
            if (i2 >= 1) {
                recyclerView.OoooOo0.OooO0O0(this.OooO00o, this.OooO0O0, i2, interpolator);
                this.OooO0o = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }
}


