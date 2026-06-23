package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
/* renamed from: com.ninja.engine.o00Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154o00Oo0 extends Drawable {
    public final ActionBarContainer OooO00o;

    public C0154o00Oo0(ActionBarContainer actionBarContainer) {
        this.OooO00o = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.OooO00o;
        if (actionBarContainer.OooO0oO) {
            Drawable drawable = actionBarContainer.OooO0o;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.OooO0Oo;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.OooO0o0;
        if (drawable3 != null && actionBarContainer.OooO0oo) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.OooO00o;
        if (actionBarContainer.OooO0oO) {
            if (actionBarContainer.OooO0o != null) {
                drawable = actionBarContainer.OooO0Oo;
            } else {
                return;
            }
        } else {
            drawable = actionBarContainer.OooO0Oo;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
