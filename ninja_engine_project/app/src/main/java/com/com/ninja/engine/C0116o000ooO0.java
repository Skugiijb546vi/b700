package com.ninja.engine;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o000ooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116o000ooO0 {
    public final TextView OooO00o;
    public final C0331o0O0oo OooO0O0;

    public C0116o000ooO0(TextView textView) {
        this.OooO00o = textView;
        this.OooO0O0 = new C0331o0O0oo(textView);
    }

    public final void OooO00o(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.OooO00o.getContext().obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooO, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            OooO0OO(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO0O0(boolean z) {
        ((AbstractC0694o0ooooo0) this.OooO0O0.OooO0O0).Oooo0oo(z);
    }

    public final void OooO0OO(boolean z) {
        ((AbstractC0694o0ooooo0) this.OooO0O0.OooO0O0).Oooo(z);
    }
}
