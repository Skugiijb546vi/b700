package com.ninja.engine;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.ninja.engine.oo0Oo00O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517oo0Oo00O extends WindowInsetsAnimation.Callback {
    public final C0303o0O0Oo0o OooO00o;
    public List OooO0O0;
    public ArrayList OooO0OO;
    public final HashMap OooO0Oo;

    public C1517oo0Oo00O(C0303o0O0Oo0o c0303o0O0Oo0o) {
        super(0);
        this.OooO0Oo = new HashMap();
        this.OooO00o = c0303o0O0Oo0o;
    }

    public final C1520oo0Oo0OO OooO00o(WindowInsetsAnimation windowInsetsAnimation) {
        C1520oo0Oo0OO c1520oo0Oo0OO = (C1520oo0Oo0OO) this.OooO0Oo.get(windowInsetsAnimation);
        if (c1520oo0Oo0OO == null) {
            c1520oo0Oo0OO = new C1520oo0Oo0OO(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c1520oo0Oo0OO.OooO00o = new C1518oo0Oo00o(windowInsetsAnimation);
            }
            this.OooO0Oo.put(windowInsetsAnimation, c1520oo0Oo0OO);
        }
        return c1520oo0Oo0OO;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0303o0O0Oo0o c0303o0O0Oo0o = this.OooO00o;
        OooO00o(windowInsetsAnimation);
        ((View) c0303o0O0Oo0o.OooO0Oo).setTranslationY(0.0f);
        this.OooO0Oo.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0303o0O0Oo0o c0303o0O0Oo0o = this.OooO00o;
        OooO00o(windowInsetsAnimation);
        int[] iArr = (int[]) c0303o0O0Oo0o.OooO0o0;
        ((View) c0303o0O0Oo0o.OooO0Oo).getLocationOnScreen(iArr);
        c0303o0O0Oo0o.OooO00o = iArr[1];
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.OooO0OO;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.OooO0OO = arrayList2;
            this.OooO0O0 = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation OooOO0o = AbstractC0037Oooo0oO.OooOO0o(list.get(size));
            C1520oo0Oo0OO OooO00o = OooO00o(OooOO0o);
            fraction = OooOO0o.getFraction();
            OooO00o.OooO00o.OooO0Oo(fraction);
            this.OooO0OO.add(OooO00o);
        }
        C0303o0O0Oo0o c0303o0O0Oo0o = this.OooO00o;
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(null, windowInsets);
        c0303o0O0Oo0o.OooO0OO(OooO0oO, this.OooO0O0);
        return OooO0oO.OooO0o();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0303o0O0Oo0o c0303o0O0Oo0o = this.OooO00o;
        OooO00o(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C0724oO00OooO OooO0OO = C0724oO00OooO.OooO0OO(lowerBound);
        upperBound = bounds.getUpperBound();
        C0724oO00OooO OooO0OO2 = C0724oO00OooO.OooO0OO(upperBound);
        View view = (View) c0303o0O0Oo0o.OooO0Oo;
        int[] iArr = (int[]) c0303o0O0Oo0o.OooO0o0;
        view.getLocationOnScreen(iArr);
        int i = c0303o0O0Oo0o.OooO00o - iArr[1];
        c0303o0O0Oo0o.OooO0O0 = i;
        view.setTranslationY(i);
        AbstractC0037Oooo0oO.OooOOOO();
        return AbstractC0037Oooo0oO.OooOO0(OooO0OO.OooO0Oo(), OooO0OO2.OooO0Oo());
    }
}


