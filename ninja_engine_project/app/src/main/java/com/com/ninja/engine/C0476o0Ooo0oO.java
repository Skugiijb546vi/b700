package com.ninja.engine;

import android.text.InputFilter;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o0Ooo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0476o0Ooo0oO extends AbstractC0694o0ooooo0 {
    public final C0474o0Ooo0o OooOo00;

    public C0476o0Ooo0oO(TextView textView) {
        this.OooOo00 = new C0474o0Ooo0o(textView);
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final InputFilter[] OooOoO(InputFilter[] inputFilterArr) {
        boolean z;
        if (C0469o0Ooo00O.OooOO0O != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return inputFilterArr;
        }
        return this.OooOo00.OooOoO(inputFilterArr);
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void Oooo(boolean z) {
        boolean z2;
        if (C0469o0Ooo00O.OooOO0O != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = !z2;
        C0474o0Ooo0o c0474o0Ooo0o = this.OooOo00;
        if (z3) {
            c0474o0Ooo0o.OooOo0O = z;
        } else {
            c0474o0Ooo0o.Oooo(z);
        }
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void Oooo0oo(boolean z) {
        boolean z2;
        if (C0469o0Ooo00O.OooOO0O != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        this.OooOo00.Oooo0oo(z);
    }
}
