package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
/* renamed from: com.ninja.engine.o0O00o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291o0O00o0 {
    public C0075o0000oOo OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ View OooO0OO;

    public /* synthetic */ C0291o0O00o0(View view, int i) {
        this.OooO0O0 = i;
        this.OooO0OO = view;
    }

    public final void OooO00o(Drawable drawable) {
        switch (this.OooO0O0) {
            case 0:
                AbstractC0185o00OoooO abstractC0185o00OoooO = (AbstractC0185o00OoooO) this.OooO0OO;
                abstractC0185o00OoooO.setIndeterminate(false);
                abstractC0185o00OoooO.OooO00o(abstractC0185o00OoooO.OooO0O0, abstractC0185o00OoooO.OooO0OO);
                return;
            case 1:
                AbstractC0185o00OoooO abstractC0185o00OoooO2 = (AbstractC0185o00OoooO) this.OooO0OO;
                if (!abstractC0185o00OoooO2.OooO0oO) {
                    abstractC0185o00OoooO2.setVisibility(abstractC0185o00OoooO2.OooO0oo);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((C0865oO0oOo0) this.OooO0OO).OooOOOO;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    public void OooO0O0(Drawable drawable) {
        switch (this.OooO0O0) {
            case 2:
                C0865oO0oOo0 c0865oO0oOo0 = (C0865oO0oOo0) this.OooO0OO;
                ColorStateList colorStateList = c0865oO0oOo0.OooOOOO;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(c0865oO0oOo0.OooOOoo, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void OooO0OO(Drawable drawable) {
    }
}


