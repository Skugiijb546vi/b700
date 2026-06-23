package com.ninja.engine;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
/* renamed from: com.ninja.engine.o0O000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286o0O000oo extends ViewOutlineProvider {
    public final /* synthetic */ Chip OooO00o;

    public C0286o0O000oo(Chip chip) {
        this.OooO00o = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0436o0OoO00O c0436o0OoO00O = this.OooO00o.OooO0o0;
        if (c0436o0OoO00O != null) {
            c0436o0OoO00O.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
