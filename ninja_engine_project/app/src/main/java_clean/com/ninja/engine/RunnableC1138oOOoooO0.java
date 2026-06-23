package com.ninja.engine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* renamed from: com.ninja.engine.oOOoooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1138oOOoooO0 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ RunnableC1138oOOoooO0(int i, int i2, Object obj) {
        this.OooO00o = i2;
        this.OooO0OO = obj;
        this.OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                ((AbstractC1137oOOoooO) this.OooO0OO).OooOO0(this.OooO0O0);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.OooO0OO;
                View view = (View) sideSheetBehavior.OooOOOo.get();
                if (view != null) {
                    sideSheetBehavior.OooOo(view, this.OooO0O0, false);
                    return;
                }
                return;
            default:
                C1241oOoOoOOo c1241oOoOoOOo = (C1241oOoOoOOo) this.OooO0OO;
                if (c1241oOoOoOOo.OooOOOo()) {
                    int i = this.OooO0O0;
                    if (i != 0 && i != 2 && i != 3 && i != 4) {
                        long j = i;
                        Bundle bundle = new Bundle();
                        bundle.putString("username-activation", MainActivity.OooO00o.getString("username-activation", ""));
                        bundle.putString("password-activation", MainActivity.OooO00o.getString("password-activation", ""));
                        bundle.putLong("remaining-time", (Long.parseLong(String.valueOf(System.currentTimeMillis()).substring(0, String.valueOf(System.currentTimeMillis()).length() - 3)) + j) - 22);
                        bundle.putString("check-user", "success");
                        Intent intent = new Intent(c1241oOoOoOOo.Oooo000(), com.ninja.engine.view.main.MainActivity.class);
                        intent.putExtras(bundle);
                        c1241oOoOoOOo.Oooo0o0(intent);
                        c1241oOoOoOOo.Oooo000().finish();
                        return;
                    }
                    MainActivity.OooO00o.edit().remove("user-status").apply();
                    c1241oOoOoOOo.Oooo0o();
                    return;
                }
                return;
        }
    }
}


