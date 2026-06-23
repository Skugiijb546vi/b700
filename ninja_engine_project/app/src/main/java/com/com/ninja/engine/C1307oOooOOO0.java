package com.ninja.engine;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
/* renamed from: com.ninja.engine.oOooOOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307oOooOOO0 extends AbstractC1358oo0000o0 {
    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0o0(C1366oo000OO0 c1366oo000OO0) {
        View view = c1366oo000OO0.OooO0O0;
        if (view instanceof TextView) {
            c1366oo000OO0.OooO00o.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0oo(C1366oo000OO0 c1366oo000OO0) {
        View view = c1366oo000OO0.OooO0O0;
        if (view instanceof TextView) {
            c1366oo000OO0.OooO00o.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final Animator OooOO0o(ViewGroup viewGroup, C1366oo000OO0 c1366oo000OO0, C1366oo000OO0 c1366oo000OO02) {
        float f;
        if (c1366oo000OO0 == null || c1366oo000OO02 == null || !(c1366oo000OO0.OooO0O0 instanceof TextView)) {
            return null;
        }
        View view = c1366oo000OO02.OooO0O0;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = c1366oo000OO0.OooO00o;
        HashMap hashMap2 = c1366oo000OO02.OooO00o;
        float f2 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f2 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new C0251o00oo000(3, textView));
        return ofFloat;
    }
}
