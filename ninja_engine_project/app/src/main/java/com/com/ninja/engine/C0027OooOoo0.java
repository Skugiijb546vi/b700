package com.ninja.engine;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* renamed from: com.ninja.engine.OooOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027OooOoo0 extends ClickableSpan {
    public final int OooO00o;
    public final C0039OoooO OooO0O0;
    public final int OooO0OO;

    public C0027OooOoo0(int i, C0039OoooO c0039OoooO, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = c0039OoooO;
        this.OooO0OO = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.OooO00o);
        this.OooO0O0.OooO00o.performAction(this.OooO0OO, bundle);
    }
}
