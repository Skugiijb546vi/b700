package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.C0083o000OO0o;
import com.ninja.engine.C0135o00O0o0o;
import com.ninja.engine.C0439o0OoO0o;
import com.ninja.engine.C0841oO0oO;
import com.ninja.engine.C0865oO0oOo0;
import com.ninja.engine.C1589oo0oOO0;
import com.ninja.engine.R;
import com.ninja.engine.o00;
import com.ninja.engine.o000OOo0;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0135o00O0o0o {
    @Override // com.ninja.engine.C0135o00O0o0o
    public final C0439o0OoO0o OooO00o(Context context, AttributeSet attributeSet) {
        return new C0841oO0oO(context, attributeSet);
    }

    @Override // com.ninja.engine.C0135o00O0o0o
    public final C0083o000OO0o OooO0O0(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.ninja.engine.C0135o00O0o0o
    public final o000OOo0 OooO0OO(Context context, AttributeSet attributeSet) {
        return new C0865oO0oOo0(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.CompoundButton, android.view.View, com.ninja.engine.o00, com.ninja.engine.oO0oOoO0] */
    @Override // com.ninja.engine.C0135o00O0o0o
    public final o00 OooO0Oo(Context context, AttributeSet attributeSet) {
        o00 o00Var = new o00(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.radioButtonStyle, 2131952671), attributeSet);
        Context context2 = o00Var.getContext();
        TypedArray Oooo0OO = AbstractC0692o0ooooOo.Oooo0OO(context2, attributeSet, AbstractC1038oOOOoo0O.OooOOoo, R.attr.radioButtonStyle, 2131952671, new int[0]);
        if (Oooo0OO.hasValue(0)) {
            o00Var.setButtonTintList(AbstractC0809oO0OooOO.OooOooO(context2, Oooo0OO, 0));
        }
        o00Var.OooO0o = Oooo0OO.getBoolean(1, false);
        Oooo0OO.recycle();
        return o00Var;
    }

    @Override // com.ninja.engine.C0135o00O0o0o
    public final C1589oo0oOO0 OooO0o0(Context context, AttributeSet attributeSet) {
        C1589oo0oOO0 c1589oo0oOO0 = new C1589oo0oOO0(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = c1589oo0oOO0.getContext();
        if (AbstractC0692o0ooooOo.OoooOOo(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1038oOOOoo0O.OooOo0O;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int[] iArr2 = {1, 2};
            int i = -1;
            for (int i2 = 0; i2 < 2 && i < 0; i2++) {
                i = AbstractC0809oO0OooOO.Oooo000(context2, obtainStyledAttributes, iArr2[i2], -1);
            }
            obtainStyledAttributes.recycle();
            if (i == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1038oOOOoo0O.OooOo0);
                    Context context3 = c1589oo0oOO0.getContext();
                    int[] iArr3 = {1, 2};
                    int i3 = -1;
                    for (int i4 = 0; i4 < 2 && i3 < 0; i4++) {
                        i3 = AbstractC0809oO0OooOO.Oooo000(context3, obtainStyledAttributes3, iArr3[i4], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i3 >= 0) {
                        c1589oo0oOO0.setLineHeight(i3);
                    }
                }
            }
        }
        return c1589oo0oOO0;
    }
}
