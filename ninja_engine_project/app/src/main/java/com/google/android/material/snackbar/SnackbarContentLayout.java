package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.R;
import com.ninja.engine.o000OO0O;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView OooO00o;
    public Button OooO0O0;
    public int OooO0OO;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0809oO0OooOO.OooooOo(context, R.attr.motionEasingEmphasizedInterpolator, o000OO0O.OooO0O0);
    }

    public final boolean OooO00o(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.OooO00o.getPaddingTop() == i2 && this.OooO00o.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.OooO00o;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.OooO0O0;
    }

    public TextView getMessageView() {
        return this.OooO00o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.OooO00o = (TextView) findViewById(R.id.snackbar_text);
        this.OooO0O0 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.OooO00o.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.OooO0OO <= 0 || this.OooO0O0.getMeasuredWidth() <= this.OooO0OO) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!OooO00o(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!OooO00o(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.OooO0OO = i;
    }
}
