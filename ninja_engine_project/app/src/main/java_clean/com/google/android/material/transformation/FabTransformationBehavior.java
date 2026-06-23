package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ninja.engine.C0327o0O0oOo;
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0O0(View view, View view2) {
        if (view.getVisibility() != 8) {
            return;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final void OooO0Oo(C0327o0O0oOo c0327o0O0oOo) {
        if (c0327o0O0oOo.OooO0oo == 0) {
            c0327o0O0oOo.OooO0oo = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}


