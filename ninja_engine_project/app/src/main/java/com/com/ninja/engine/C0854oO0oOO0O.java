package com.ninja.engine;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
/* renamed from: com.ninja.engine.oO0oOO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854oO0oOO0O implements Comparator {
    public final /* synthetic */ MaterialButtonToggleGroup OooO00o;

    public C0854oO0oOO0O(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.OooO00o = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.OooOOOO).compareTo(Boolean.valueOf(materialButton2.OooOOOO));
        if (compareTo == 0) {
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 == 0) {
                MaterialButtonToggleGroup materialButtonToggleGroup = this.OooO00o;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            }
            return compareTo2;
        }
        return compareTo;
    }
}
