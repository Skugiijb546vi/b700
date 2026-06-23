package com.ninja.engine;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class o0O extends C0868oO0oOoO {
    public final RectF OooOo0O;

    public o0O(o0O o0o) {
        super(o0o);
        this.OooOo0O = o0o.OooOo0O;
    }

    @Override // com.ninja.engine.C0868oO0oOoO, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        o0OO000 o0oo000 = new o0OO000(this);
        o0oo000.invalidateSelf();
        return o0oo000;
    }

    public o0O(C1204oOoOOOO0 c1204oOoOOOO0, RectF rectF) {
        super(c1204oOoOOOO0);
        this.OooOo0O = rectF;
    }
}


