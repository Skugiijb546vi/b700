package com.ninja.engine;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* renamed from: com.ninja.engine.o0Oooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482o0Oooo0 implements TransformationMethod {
    public final TransformationMethod OooO00o;

    public C0482o0Oooo0(TransformationMethod transformationMethod) {
        this.OooO00o = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.OooO00o;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && C0469o0Ooo00O.OooO00o().OooO0O0() == 1) {
            C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
            OooO00o.getClass();
            return OooO00o.OooO0o(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.OooO00o;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}


