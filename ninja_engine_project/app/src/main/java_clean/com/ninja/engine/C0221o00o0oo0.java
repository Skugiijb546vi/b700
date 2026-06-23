package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o00o0oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221o00o0oo0 extends AbstractC2087ooooOoOO {
    public final int Oooo0;
    public final int Oooo00o;
    public final int Oooo0O0;
    public final int Oooo0OO;
    public final ArrayList Oooo0o;
    public boolean Oooo0o0;

    public C0221o00o0oo0(Context context) {
        super(context);
        this.Oooo0o = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.Oooo00o = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.Oooo0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.Oooo0O0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.Oooo0OO = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                if (getLayoutDirection() == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        MenuC0887oO0oo0oo menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.OooOO0o().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.Oooo0o;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i6 = 1;
        if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) {
            z = true;
        } else {
            z = false;
        }
        int i7 = this.Oooo0O0;
        if (z && this.Oooo0o0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i8 = this.Oooo0OO;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), makeMeasureSpec);
                i8 = Math.max(i8, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i9 = size2 - i4;
            int min = Math.min(size - (this.Oooo0 * i9), Math.min(i8, i7));
            int i10 = size - min;
            if (i9 != 0) {
                i6 = i9;
            }
            int min2 = Math.min(i10 / i6, this.Oooo00o);
            int i11 = i10 - (i9 * min2);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (getChildAt(i12).getVisibility() != 8) {
                    if (i12 == getSelectedItemPosition()) {
                        i5 = min;
                    } else {
                        i5 = min2;
                    }
                    if (i11 > 0) {
                        i5++;
                        i11--;
                    }
                } else {
                    i5 = 0;
                }
                arrayList.add(Integer.valueOf(i5));
            }
        } else {
            if (size2 != 0) {
                i6 = size2;
            }
            int min3 = Math.min(size / i6, i7);
            int i13 = size - (size2 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    if (i13 > 0) {
                        i3 = min3 + 1;
                        i13--;
                    } else {
                        i3 = min3;
                    }
                } else {
                    i3 = 0;
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i16)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i15 = childAt2.getMeasuredWidth() + i15;
            }
        }
        setMeasuredDimension(i15, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.Oooo0o0 = z;
    }
}


