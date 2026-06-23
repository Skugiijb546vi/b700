package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
/* renamed from: com.ninja.engine.oO0oOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873oO0oOoo0 extends C1589oo0oOO0 {
    public C0873oO0oOoo0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
    @Override // com.ninja.engine.C1589oo0oOO0, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC0692o0ooooOo.OoooOOo(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC1038oOOOoo0O.OooOo0);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i2 = -1;
            for (int i3 = 0; i3 < 2 && i2 < 0; i3++) {
                i2 = AbstractC0809oO0OooOO.Oooo000(context2, obtainStyledAttributes, iArr[i3], -1);
            }
            obtainStyledAttributes.recycle();
            if (i2 >= 0) {
                setLineHeight(i2);
            }
        }
    }
}


