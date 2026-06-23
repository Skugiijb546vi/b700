package com.ninja.engine;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
/* renamed from: com.ninja.engine.o00Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0176o00Ooo implements View.OnClickListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ View$OnClickListenerC0176o00Ooo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0892oO0ooO0o c0892oO0ooO0o;
        switch (this.OooO00o) {
            case 0:
                ((o00000O) this.OooO0O0).OooO0O0();
                return;
            case 1:
                C0068o0000o c0068o0000o = (C0068o0000o) this.OooO0O0;
                Button button = c0068o0000o.OooO;
                c0068o0000o.OooOoO.obtainMessage(1, c0068o0000o.OooO0O0).sendToTarget();
                return;
            case 2:
                C0863oO0oOOoo c0863oO0oOOoo = (C0863oO0oOOoo) this.OooO0O0;
                int i = c0863oO0oOOoo.OoooOo0;
                if (i == 2) {
                    c0863oO0oOOoo.Oooo0oO(1);
                    return;
                } else if (i == 1) {
                    c0863oO0oOOoo.Oooo0oO(2);
                    return;
                } else {
                    return;
                }
            case 3:
                C0892oO0ooO0o itemData = ((AbstractC0921oOO00ooO) view).getItemData();
                AbstractC2087ooooOoOO abstractC2087ooooOoOO = (AbstractC2087ooooOoOO) this.OooO0O0;
                if (!abstractC2087ooooOoOO.OooOooo.OooOOo0(itemData, abstractC2087ooooOoOO.OooOooO, 0)) {
                    itemData.setChecked(true);
                    return;
                }
                return;
            default:
                C1332oOooo0o0 c1332oOooo0o0 = ((Toolbar) this.OooO0O0).Oooo0o0;
                if (c1332oOooo0o0 == null) {
                    c0892oO0ooO0o = null;
                } else {
                    c0892oO0ooO0o = c1332oOooo0o0.OooO0O0;
                }
                if (c0892oO0ooO0o != null) {
                    c0892oO0ooO0o.collapseActionView();
                    return;
                }
                return;
        }
    }
}


