package com.ninja.engine;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* renamed from: com.ninja.engine.oOOoOOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090oOOoOOO0 extends InputConnectionWrapper {
    public final /* synthetic */ C0435o0OoO000 OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090oOOoOOO0(InputConnection inputConnection, C0435o0OoO000 c0435o0OoO000) {
        super(inputConnection, false);
        this.OooO00o = c0435o0OoO000;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0331o0O0oo c0331o0O0oo = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0331o0O0oo = new C0331o0O0oo(17, new C0859oO0oOOOo(inputContentInfo));
        }
        if (this.OooO00o.OooO00o(c0331o0O0oo, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
