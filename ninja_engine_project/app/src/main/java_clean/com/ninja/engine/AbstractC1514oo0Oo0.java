package com.ninja.engine;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: com.ninja.engine.oo0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1514oo0Oo0 extends AbstractC0308o0O0Ooo0 {
    public boolean OooO;
    public boolean OooO0oo;

    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0
    public final void OooO0o0(ConstraintLayout constraintLayout) {
        OooO0Oo(constraintLayout);
    }

    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0
    public void OooO0oO(AttributeSet attributeSet) {
        super.OooO0oO(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.OooO0oo = true;
                } else if (index == 22) {
                    this.OooO = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void OooOO0(C0550o0o0Oo0 c0550o0o0Oo0, int i, int i2);

    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.OooO0oo || this.OooO) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.OooO0O0; i++) {
                    View view = (View) constraintLayout.OooO00o.get(this.OooO00o[i]);
                    if (view != null) {
                        if (this.OooO0oo) {
                            view.setVisibility(visibility);
                        }
                        if (this.OooO && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            OooO0Oo((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            OooO0Oo((ConstraintLayout) parent);
        }
    }
}


