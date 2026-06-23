package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0005OooO0Oo;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1091oOOoOOOO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0017OooOOo;
import com.ninja.engine.C0331o0O0oo;
import com.ninja.engine.C0854oO0oOO0O;
import com.ninja.engine.C0855oO0oOO0o;
import com.ninja.engine.C1198oOoOOO;
import com.ninja.engine.C1204oOoOOOO0;
import com.ninja.engine.R;
import com.ninja.engine.o0O000Oo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int OooOO0O = 0;
    public final int OooO;
    public final ArrayList OooO00o;
    public final C0331o0O0oo OooO0O0;
    public final LinkedHashSet OooO0OO;
    public final C0854oO0oOO0O OooO0Oo;
    public boolean OooO0o;
    public Integer[] OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public HashSet OooOO0;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952678), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.OooO00o = new ArrayList();
        this.OooO0O0 = new C0331o0O0oo(19, this);
        this.OooO0OO = new LinkedHashSet();
        this.OooO0Oo = new C0854oO0oOO0O(this);
        this.OooO0o = false;
        this.OooOO0 = new HashSet();
        TypedArray Oooo0OO = AbstractC0692o0ooooOo.Oooo0OO(getContext(), attributeSet, AbstractC1038oOOOoo0O.OooOOOO, R.attr.materialButtonToggleGroupStyle, 2131952678, new int[0]);
        setSingleSelection(Oooo0OO.getBoolean(3, false));
        this.OooO = Oooo0OO.getResourceId(1, -1);
        this.OooO0oo = Oooo0OO.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(Oooo0OO.getBoolean(0, true));
        Oooo0OO.recycle();
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (OooO0OO(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (OooO0OO(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && OooO0OO(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.OooO0O0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void OooO00o() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(-min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                layoutParams.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void OooO0O0(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.OooOO0);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.OooO0oO && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.OooO0oo || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        OooO0Oo(hashSet);
    }

    public final boolean OooO0OO(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void OooO0Oo(Set set) {
        HashSet hashSet = this.OooOO0;
        this.OooOO0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.OooO0o = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.OooO0o = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.OooO0OO.iterator();
                while (it.hasNext()) {
                    ((C0005OooO0Oo) it.next()).OooO00o();
                }
            }
        }
        invalidate();
    }

    public final void OooO0o0() {
        boolean z;
        C0855oO0oOO0o c0855oO0oOO0o;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C1198oOoOOO OooO0o0 = materialButton.getShapeAppearanceModel().OooO0o0();
                C0855oO0oOO0o c0855oO0oOO0o2 = (C0855oO0oOO0o) this.OooO00o.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C0017OooOOo c0017OooOOo = C0855oO0oOO0o.OooO0o0;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            if (AbstractC1091oOOoOOOO.OooOo0o(this)) {
                                c0855oO0oOO0o = new C0855oO0oOO0o(c0017OooOOo, c0017OooOOo, c0855oO0oOO0o2.OooO0O0, c0855oO0oOO0o2.OooO0OO);
                            } else {
                                c0855oO0oOO0o = new C0855oO0oOO0o(c0855oO0oOO0o2.OooO00o, c0855oO0oOO0o2.OooO0Oo, c0017OooOOo, c0017OooOOo);
                            }
                        } else {
                            c0855oO0oOO0o = new C0855oO0oOO0o(c0855oO0oOO0o2.OooO00o, c0017OooOOo, c0855oO0oOO0o2.OooO0O0, c0017OooOOo);
                        }
                    } else if (i == lastVisibleChildIndex) {
                        if (z) {
                            if (AbstractC1091oOOoOOOO.OooOo0o(this)) {
                                c0855oO0oOO0o = new C0855oO0oOO0o(c0855oO0oOO0o2.OooO00o, c0855oO0oOO0o2.OooO0Oo, c0017OooOOo, c0017OooOOo);
                            } else {
                                c0855oO0oOO0o = new C0855oO0oOO0o(c0017OooOOo, c0017OooOOo, c0855oO0oOO0o2.OooO0O0, c0855oO0oOO0o2.OooO0OO);
                            }
                        } else {
                            c0855oO0oOO0o = new C0855oO0oOO0o(c0017OooOOo, c0855oO0oOO0o2.OooO0Oo, c0017OooOOo, c0855oO0oOO0o2.OooO0OO);
                        }
                    } else {
                        c0855oO0oOO0o2 = null;
                    }
                    c0855oO0oOO0o2 = c0855oO0oOO0o;
                }
                if (c0855oO0oOO0o2 == null) {
                    OooO0o0.OooO0o0 = new C0017OooOOo(0.0f);
                    OooO0o0.OooO0o = new C0017OooOOo(0.0f);
                    OooO0o0.OooO0oO = new C0017OooOOo(0.0f);
                    OooO0o0.OooO0oo = new C0017OooOOo(0.0f);
                } else {
                    OooO0o0.OooO0o0 = c0855oO0oOO0o2.OooO00o;
                    OooO0o0.OooO0oo = c0855oO0oOO0o2.OooO0Oo;
                    OooO0o0.OooO0o = c0855oO0oOO0o2.OooO0O0;
                    OooO0o0.OooO0oO = c0855oO0oOO0o2.OooO0OO;
                }
                materialButton.setShapeAppearanceModel(OooO0o0.OooO00o());
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        OooO0O0(materialButton.getId(), materialButton.OooOOOO);
        C1204oOoOOOO0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.OooO00o.add(new C0855oO0oOO0o(shapeAppearanceModel.OooO0o0, shapeAppearanceModel.OooO0oo, shapeAppearanceModel.OooO0o, shapeAppearanceModel.OooO0oO));
        materialButton.setEnabled(isEnabled());
        AbstractC1460oo0O00oo.OooOOOo(materialButton, new o0O000Oo(1, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.OooO0Oo);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.OooO0o0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.OooO0oO || this.OooOO0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.OooOO0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.OooOO0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.OooO0o0;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.OooO;
        if (i != -1) {
            OooO0Oo(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.OooO0oO) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o0();
        OooO00o();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.OooO00o.remove(indexOfChild);
        }
        OooO0o0();
        OooO00o();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.OooO0oo = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.OooO0oO != z) {
            this.OooO0oO = z;
            OooO0Oo(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.OooO0oO ? RadioButton.class : ToggleButton.class).getName());
        }
    }
}
