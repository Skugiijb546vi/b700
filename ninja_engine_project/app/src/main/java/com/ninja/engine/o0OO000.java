package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* loaded from: classes.dex */
public final class o0OO000 extends C0875oO0oOooo {
    public static final /* synthetic */ int OooOoO0 = 0;
    public o0O OooOo;

    public o0OO000(o0O o0o) {
        super(o0o);
        this.OooOo = o0o;
    }

    @Override // com.ninja.engine.C0875oO0oOooo
    public final void OooO0oO(Canvas canvas) {
        if (this.OooOo.OooOo0O.isEmpty()) {
            super.OooO0oO(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.OooOo.OooOo0O);
        } else {
            canvas.clipRect(this.OooOo.OooOo0O, Region.Op.DIFFERENCE);
        }
        super.OooO0oO(canvas);
        canvas.restore();
    }

    public final void OooOOOo(float f, float f2, float f3, float f4) {
        RectF rectF = this.OooOo.OooOo0O;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // com.ninja.engine.C0875oO0oOooo, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.OooOo = new o0O(this.OooOo);
        return this;
    }
}
