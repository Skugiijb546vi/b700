package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321oOooo extends ArrayAdapter {
    public ColorStateList OooO00o;
    public ColorStateList OooO0O0;
    public final /* synthetic */ C0841oO0oO OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321oOooo(C0841oO0oO c0841oO0oO, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.OooO0OO = c0841oO0oO;
        OooO00o();
    }

    public final void OooO00o() {
        boolean z;
        ColorStateList colorStateList;
        C0841oO0oO c0841oO0oO = this.OooO0OO;
        ColorStateList colorStateList2 = c0841oO0oO.OooOO0o;
        if (colorStateList2 != null) {
            z = true;
        } else {
            z = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.OooO0O0 = colorStateList;
        if (c0841oO0oO.OooOO0O != 0 && c0841oO0oO.OooOO0o != null) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{o0O0OO0.OooO0O0(c0841oO0oO.OooOO0o.getColorForState(iArr3, 0), c0841oO0oO.OooOO0O), o0O0OO0.OooO0O0(c0841oO0oO.OooOO0o.getColorForState(iArr2, 0), c0841oO0oO.OooOO0O), c0841oO0oO.OooOO0O});
        }
        this.OooO00o = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0841oO0oO c0841oO0oO = this.OooO0OO;
            android.graphics.drawable.Drawable rippleDrawable = null;
            if (c0841oO0oO.getText().toString().contentEquals(textView.getText()) && c0841oO0oO.OooOO0O != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0841oO0oO.OooOO0O);
                if (this.OooO0O0 != null) {
                    colorDrawable.setTintList(this.OooO00o);
                    rippleDrawable = new RippleDrawable(this.OooO0O0, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}


