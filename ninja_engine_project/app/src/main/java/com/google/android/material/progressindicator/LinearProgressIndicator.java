package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.ninja.engine.AbstractC0104o000o0o;
import com.ninja.engine.AbstractC0185o00OoooO;
import com.ninja.engine.AbstractC0429o0Oo0oOo;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0380o0OOo0OO;
import com.ninja.engine.C0763oO0O0oOO;
import com.ninja.engine.C1160oOo00OOo;
import com.ninja.engine.oO00Oo0;
import com.ninja.engine.oO0O;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class LinearProgressIndicator extends AbstractC0185o00OoooO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.ninja.engine.o0Oo0oOo, com.ninja.engine.oO00Oo0, java.lang.Object, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.ninja.engine.o0Oo0o00, com.ninja.engine.ooOOO0Oo, java.lang.Object] */
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0104o000o0o c1160oOo00OOo;
        Object obj = new Object();
        oO0O oo0o = this.OooO00o;
        obj.OooO00o = oo0o;
        obj.OooO0O0 = 300.0f;
        Context context2 = getContext();
        if (oo0o.OooO0oo == 0) {
            c1160oOo00OOo = new C0763oO0O0oOO(oo0o);
        } else {
            c1160oOo00OOo = new C1160oOo00OOo(context2, oo0o);
        }
        AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo = new AbstractC0429o0Oo0oOo(context2, oo0o);
        abstractC0429o0Oo0oOo.OooOO0o = obj;
        abstractC0429o0Oo0oOo.OooOOO0 = c1160oOo00OOo;
        c1160oOo00OOo.OooO00o = abstractC0429o0Oo0oOo;
        setIndeterminateDrawable(abstractC0429o0Oo0oOo);
        setProgressDrawable(new C0380o0OOo0OO(getContext(), oo0o, obj));
    }

    @Override // com.ninja.engine.AbstractC0185o00OoooO
    public final void OooO00o(int i, boolean z) {
        oO0O oo0o = this.OooO00o;
        if (oo0o != null && oo0o.OooO0oo == 0 && isIndeterminate()) {
            return;
        }
        super.OooO00o(i, z);
    }

    public int getIndeterminateAnimationType() {
        return this.OooO00o.OooO0oo;
    }

    public int getIndicatorDirection() {
        return this.OooO00o.OooO;
    }

    public int getTrackStopIndicatorSize() {
        return this.OooO00o.OooOO0O;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        oO0O oo0o = this.OooO00o;
        boolean z2 = true;
        if (oo0o.OooO != 1) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if ((getLayoutDirection() != 1 || oo0o.OooO != 2) && (getLayoutDirection() != 0 || oo0o.OooO != 3)) {
                z2 = false;
            }
        }
        oo0o.OooOO0 = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        oO00Oo0 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        C0380o0OOo0OO progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        oO00Oo0 indeterminateDrawable;
        AbstractC0104o000o0o c1160oOo00OOo;
        oO0O oo0o = this.OooO00o;
        if (oo0o.OooO0oo == i) {
            return;
        }
        if (OooO0O0() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        oo0o.OooO0oo = i;
        oo0o.OooO00o();
        if (i == 0) {
            indeterminateDrawable = getIndeterminateDrawable();
            c1160oOo00OOo = new C0763oO0O0oOO(oo0o);
        } else {
            indeterminateDrawable = getIndeterminateDrawable();
            c1160oOo00OOo = new C1160oOo00OOo(getContext(), oo0o);
        }
        indeterminateDrawable.OooOOO0 = c1160oOo00OOo;
        c1160oOo00OOo.OooO00o = indeterminateDrawable;
        invalidate();
    }

    @Override // com.ninja.engine.AbstractC0185o00OoooO
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.OooO00o.OooO00o();
    }

    public void setIndicatorDirection(int i) {
        oO0O oo0o = this.OooO00o;
        oo0o.OooO = i;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if ((getLayoutDirection() != 1 || oo0o.OooO != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        oo0o.OooOO0 = z;
        invalidate();
    }

    @Override // com.ninja.engine.AbstractC0185o00OoooO
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.OooO00o.OooO00o();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        oO0O oo0o = this.OooO00o;
        if (oo0o.OooOO0O != i) {
            oo0o.OooOO0O = Math.min(i, oo0o.OooO00o);
            oo0o.OooO00o();
            invalidate();
        }
    }
}
