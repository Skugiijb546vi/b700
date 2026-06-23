package com.ninja.engine;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes.dex */
public final class o00O0O0 implements Runnable {
    public final /* synthetic */ int OooO00o = 0;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ View OooO0OO;
    public final /* synthetic */ Object OooO0Oo;

    public o00O0O0(TextView textView, Typeface typeface, int i) {
        this.OooO0OO = textView;
        this.OooO0Oo = typeface;
        this.OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                int i = this.OooO0O0;
                ((TextView) this.OooO0OO).setTypeface((Typeface) this.OooO0Oo, i);
                return;
            default:
                ((BottomSheetBehavior) this.OooO0Oo).Oooo0(this.OooO0OO, this.OooO0O0, false);
                return;
        }
    }

    public o00O0O0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.OooO0Oo = bottomSheetBehavior;
        this.OooO0OO = view;
        this.OooO0O0 = i;
    }
}
