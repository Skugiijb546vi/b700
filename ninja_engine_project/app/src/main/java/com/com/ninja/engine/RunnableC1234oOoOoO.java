package com.ninja.engine;

import android.widget.Toast;
/* renamed from: com.ninja.engine.oOoOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1234oOoOoO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C1241oOoOoOOo OooO0O0;

    public /* synthetic */ RunnableC1234oOoOoO(C1241oOoOoOOo c1241oOoOoOOo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c1241oOoOoOOo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                C1241oOoOoOOo c1241oOoOoOOo = this.OooO0O0;
                if (c1241oOoOoOOo.OooOOOo()) {
                    c1241oOoOoOOo.Oooo0o();
                    return;
                }
                return;
            default:
                C1241oOoOoOOo c1241oOoOoOOo2 = this.OooO0O0;
                if (c1241oOoOoOOo2.OooOOOo()) {
                    MainActivity.OooO00o.edit().remove("user-status").apply();
                    Toast.makeText(c1241oOoOoOOo2.Oooo000(), c1241oOoOoOOo2.OooOOO0(R.string.key_activation_country_restricted), 0).show();
                    c1241oOoOoOOo2.Oooo0o();
                    return;
                }
                return;
        }
    }
}
