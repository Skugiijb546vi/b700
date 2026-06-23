package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOo000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1051oOOo000o extends ConstraintLayout {
    public int OooOOo;
    public final RunnableC0061o00000oO OooOOo0;
    public final C0875oO0oOooo OooOOoo;

    public AbstractC1051oOOo000o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo();
        this.OooOOoo = c0875oO0oOooo;
        C1092oOOoOOOo c1092oOOoOOOo = new C1092oOOoOOOo(0.5f);
        C1198oOoOOO OooO0o0 = c0875oO0oOooo.OooO00o.OooO00o.OooO0o0();
        OooO0o0.OooO0o0 = c1092oOOoOOOo;
        OooO0o0.OooO0o = c1092oOOoOOOo;
        OooO0o0.OooO0oO = c1092oOOoOOOo;
        OooO0o0.OooO0oo = c1092oOOoOOOo;
        c0875oO0oOooo.setShapeAppearanceModel(OooO0o0.OooO00o());
        this.OooOOoo.OooOO0o(ColorStateList.valueOf(-1));
        C0875oO0oOooo c0875oO0oOooo2 = this.OooOOoo;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setBackground(c0875oO0oOooo2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooOoO, R.attr.materialClockStyle, 0);
        this.OooOOo = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.OooOOo0 = new RunnableC0061o00000oO(15, this);
        obtainStyledAttributes.recycle();
    }

    public abstract void OooOOO0();

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0061o00000oO runnableC0061o00000oO = this.OooOOo0;
            handler.removeCallbacks(runnableC0061o00000oO);
            handler.post(runnableC0061o00000oO);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        OooOOO0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC0061o00000oO runnableC0061o00000oO = this.OooOOo0;
            handler.removeCallbacks(runnableC0061o00000oO);
            handler.post(runnableC0061o00000oO);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.OooOOoo.OooOO0o(ColorStateList.valueOf(i));
    }
}


