package com.ninja.engine;

import android.view.View;
/* renamed from: com.ninja.engine.o0oO0O00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560o0oO0O00 extends AbstractC0809oO0OooOO {
    public final /* synthetic */ int OooOo0;

    public /* synthetic */ C0560o0oO0O00(int i) {
        this.OooOo0 = i;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final float Oooo0OO(Object obj) {
        View view = (View) obj;
        switch (this.OooOo0) {
            case 0:
                return view.getAlpha();
            case 1:
                return view.getScaleX();
            case 2:
                return view.getScaleY();
            case 3:
                return view.getRotation();
            case 4:
                return view.getRotationX();
            default:
                return view.getRotationY();
        }
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void o00Oo0(Object obj, float f) {
        View view = (View) obj;
        switch (this.OooOo0) {
            case 0:
                view.setAlpha(f);
                return;
            case 1:
                view.setScaleX(f);
                return;
            case 2:
                view.setScaleY(f);
                return;
            case 3:
                view.setRotation(f);
                return;
            case 4:
                view.setRotationX(f);
                return;
            default:
                view.setRotationY(f);
                return;
        }
    }
}


