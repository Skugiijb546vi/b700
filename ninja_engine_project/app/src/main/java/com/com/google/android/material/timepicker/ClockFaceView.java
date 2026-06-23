package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1051oOOo000o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0312o0O0o00o;
import com.ninja.engine.C0317o0O0o0o0;
import com.ninja.engine.InterfaceC0290o0O00o;
import com.ninja.engine.R;
import com.ninja.engine.o0O0o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class ClockFaceView extends AbstractC1051oOOo000o implements InterfaceC0290o0O00o {
    public final SparseArray OooOo;
    public final Rect OooOo0;
    public final ClockHandView OooOo00;
    public final RectF OooOo0O;
    public final Rect OooOo0o;
    public final int[] OooOoO;
    public final OooO0OO OooOoO0;
    public final float[] OooOoOO;
    public final int OooOoo;
    public final int OooOoo0;
    public final int OooOooO;
    public final int OooOooo;
    public final String[] Oooo000;
    public float Oooo00O;
    public final ColorStateList Oooo00o;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooOo0 = new Rect();
        this.OooOo0O = new RectF();
        this.OooOo0o = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.OooOo = sparseArray;
        this.OooOoOO = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooO0oO, R.attr.materialClockStyle, 2131952738);
        Resources resources = getResources();
        ColorStateList OooOooO = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 1);
        this.Oooo00o = OooOooO;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.OooOo00 = clockHandView;
        this.OooOoo0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = OooOooO.getColorForState(new int[]{16842913}, OooOooO.getDefaultColor());
        this.OooOoO = new int[]{colorForState, colorForState, OooOooO.getDefaultColor()};
        clockHandView.OooO0OO.add(this);
        int defaultColor = AbstractC0809oO0OooOO.OooOoo(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList OooOooO2 = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 0);
        setBackgroundColor(OooOooO2 != null ? OooOooO2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new OooO0O0(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.OooOoO0 = new OooO0OO(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.Oooo000 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.Oooo000.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.Oooo000.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.Oooo000[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                AbstractC1460oo0O00oo.OooOOOo(textView, this.OooOoO0);
                textView.setTextColor(this.Oooo00o);
            }
        }
        ClockHandView clockHandView2 = this.OooOo00;
        if (clockHandView2.OooO0O0 && !z) {
            clockHandView2.OooOOO0 = 1;
        }
        clockHandView2.OooO0O0 = z;
        clockHandView2.invalidate();
        this.OooOoo = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.OooOooO = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.OooOooo = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void OooOOO() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.OooOo00.OooO0oO;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.OooOo;
            int size = sparseArray.size();
            rectF = this.OooOo0O;
            rect = this.OooOo0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.OooOo0o);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.OooOoO, this.OooOoOO, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1051oOOo000o
    public final void OooOOO0() {
        int i;
        C0317o0O0o0o0 c0317o0O0o0o0 = new C0317o0O0o0o0();
        c0317o0O0o0o0.OooO0O0(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(this.OooOOo * 0.66f);
            } else {
                i = this.OooOOo;
            }
            float f = 0.0f;
            for (View view : list) {
                int id = view.getId();
                HashMap hashMap2 = c0317o0O0o0o0.OooO0OO;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0312o0O0o00o());
                }
                o0O0o0 o0o0o0 = ((C0312o0O0o00o) hashMap2.get(Integer.valueOf(id))).OooO0Oo;
                o0o0o0.OooOoO = R.id.circle_center;
                o0o0o0.OooOoOO = i;
                o0o0o0.OooOoo0 = f;
                f += 360.0f / list.size();
            }
        }
        c0317o0O0o0o0.OooO00o(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.OooOo;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.Oooo000.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooOOO();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.OooOooo / Math.max(Math.max(this.OooOoo / displayMetrics.heightPixels, this.OooOooO / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
