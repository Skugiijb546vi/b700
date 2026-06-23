package com.ninja.engine;

import android.text.Editable;
/* renamed from: com.ninja.engine.o0Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466o0Ooo0 extends Editable.Factory {
    public static final Object OooO00o = new Object();
    public static volatile C0466o0Ooo0 OooO0O0;
    public static Class OooO0OO;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = OooO0OO;
        if (cls != null) {
            return new C1803ooOOOooo(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
