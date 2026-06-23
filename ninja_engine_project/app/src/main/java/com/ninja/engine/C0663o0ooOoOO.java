package com.ninja.engine;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
/* renamed from: com.ninja.engine.o0ooOoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663o0ooOoOO extends AbstractC1091oOOoOOOO {
    public final /* synthetic */ int OooO0OO;
    public final /* synthetic */ Object OooO0Oo;

    public /* synthetic */ C0663o0ooOoOO(int i, Object obj) {
        this.OooO0OO = i;
        this.OooO0Oo = obj;
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void OooOoO(int i) {
        switch (this.OooO0OO) {
            case 0:
                return;
            default:
                C1303oOooOO00 c1303oOooOO00 = (C1303oOooOO00) this.OooO0Oo;
                c1303oOooOO00.OooO0o0 = true;
                InterfaceC1288oOooO interfaceC1288oOooO = (InterfaceC1288oOooO) c1303oOooOO00.OooO0o.get();
                if (interfaceC1288oOooO != null) {
                    interfaceC1288oOooO.OooO00o();
                    return;
                }
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC1091oOOoOOOO
    public final void OooOoOO(Typeface typeface, boolean z) {
        CharSequence text;
        switch (this.OooO0OO) {
            case 0:
                Chip chip = (Chip) this.OooO0Oo;
                C0436o0OoO00O c0436o0OoO00O = chip.OooO0o0;
                if (c0436o0OoO00O.o000000) {
                    text = c0436o0OoO00O.OooOooo;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    C1303oOooOO00 c1303oOooOO00 = (C1303oOooOO00) this.OooO0Oo;
                    c1303oOooOO00.OooO0o0 = true;
                    InterfaceC1288oOooO interfaceC1288oOooO = (InterfaceC1288oOooO) c1303oOooOO00.OooO0o.get();
                    if (interfaceC1288oOooO != null) {
                        interfaceC1288oOooO.OooO00o();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void Oooo00o(int i) {
    }
}
