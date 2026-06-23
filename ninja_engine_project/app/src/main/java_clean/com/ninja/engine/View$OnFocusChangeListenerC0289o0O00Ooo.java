package com.ninja.engine;

import android.view.View;
/* renamed from: com.ninja.engine.o0O00Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnFocusChangeListenerC0289o0O00Ooo implements View.OnFocusChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ AbstractC0494o0o000O OooO0O0;

    public /* synthetic */ View$OnFocusChangeListenerC0289o0O00Ooo(AbstractC0494o0o000O abstractC0494o0o000O, int i) {
        this.OooO00o = i;
        this.OooO0O0 = abstractC0494o0o000O;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.OooO00o) {
            case 0:
                C0293o0O00o0o c0293o0O00o0o = (C0293o0O00o0o) this.OooO0O0;
                c0293o0O00o0o.OooOo00(c0293o0O00o0o.OooOo0());
                return;
            default:
                C0434o0OoO0 c0434o0OoO0 = (C0434o0OoO0) this.OooO0O0;
                c0434o0OoO0.OooOO0o = z;
                c0434o0OoO0.OooOOo0();
                if (!z) {
                    c0434o0OoO0.OooOo00(false);
                    c0434o0OoO0.OooOOO0 = false;
                    return;
                }
                return;
        }
    }
}


