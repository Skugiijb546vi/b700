package com.ninja.engine;

import android.widget.EditText;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.o0Ooo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477o0Ooo0oo extends AbstractC0468o0Ooo000 {
    public final WeakReference OooO00o;

    public C0477o0Ooo0oo(EditText editText) {
        this.OooO00o = new WeakReference(editText);
    }

    @Override // com.ninja.engine.AbstractC0468o0Ooo000
    public final void OooO00o() {
        C0465o0Ooo.OooO00o((EditText) this.OooO00o.get(), 1);
    }
}
