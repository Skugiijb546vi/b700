package com.ninja.engine;

import android.graphics.drawable.Animatable;
/* loaded from: classes.dex */
public final class o000 extends AbstractC0694o0ooooo0 {
    public void Oooo0oo(boolean b) {}
    public void Oooo(boolean b) {}
    public android.text.InputFilter[] OooOoO(android.text.InputFilter[] filters) { return null; }
    public final Animatable OooOo0;
    public final /* synthetic */ int OooOo00;

    public /* synthetic */ o000(Animatable animatable, int i) {
        this.OooOo00 = i;
        this.OooOo0 = animatable;
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void OoooO0() {
        switch (this.OooOo00) {
            case 0:
                this.OooOo0.start();
                return;
            default:
                ((o000O00O) this.OooOo0).start();
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void OoooO0O() {
        switch (this.OooOo00) {
            case 0:
                this.OooOo0.stop();
                return;
            default:
                ((o000O00O) this.OooOo0).stop();
                return;
        }
    }
}


