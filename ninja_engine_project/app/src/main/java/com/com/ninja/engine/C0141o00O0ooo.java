package com.ninja.engine;

import android.content.Context;
import android.text.TextUtils;
/* renamed from: com.ninja.engine.o00O0ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141o00O0ooo extends AbstractC1823ooOOoOo0 implements InterfaceC0625o0oo0OOo {
    public final /* synthetic */ String OooO00o;
    public final /* synthetic */ Context OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0141o00O0ooo(Context context, String str) {
        super(0);
        this.OooO00o = str;
        this.OooO0O0 = context;
    }

    @Override // com.ninja.engine.InterfaceC0625o0oo0OOo
    public final Object OooO00o() {
        String str = this.OooO00o;
        if (TextUtils.isEmpty(str)) {
            str = o00O.class.getSimpleName();
        }
        return this.OooO0O0.getSharedPreferences(str, 0);
    }
}
