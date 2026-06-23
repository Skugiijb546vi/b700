package com.ninja.engine;

import android.view.View;
/* renamed from: com.ninja.engine.o0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574o0oOo extends AbstractC0692o0ooooOo {
    public final /* synthetic */ AbstractComponentCallbacksC0593o0oOoOo0 Oooo000;

    public C0574o0oOo() {
        this.Oooo000 = null;
    }

    public C0574o0oOo(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        this.Oooo000 = abstractComponentCallbacksC0593o0oOoOo0;
    }

    public void OooOOoo(C1214oOoOOo0o c1214oOoOOo0o, float f, float f2) {}
    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final View Oooo0o(int i) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = this.Oooo000;
        View view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " does not have a view");
    }

    @Override // com.ninja.engine.AbstractC0692o0ooooOo
    public final boolean Oooo0oO() {
        if (this.Oooo000.OooOooo != null) {
            return true;
        }
        return false;
    }
}


