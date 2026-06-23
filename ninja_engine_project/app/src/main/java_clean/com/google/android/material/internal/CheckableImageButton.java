package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.app.framework.utils.FileUtils;
import com.ninja.engine.AbstractC0018OooOOo0;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0115o000ooO;
import com.ninja.engine.C0460o0OoOoOO;
import com.ninja.engine.R;
import com.ninja.engine.o0O000Oo;
/* loaded from: classes.dex */
public class CheckableImageButton extends C0115o000ooO implements Checkable {
    public static final int[] OooO0oO = {16842912};
    public boolean OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        this.OooO0o0 = true;
        this.OooO0o = true;
        AbstractC1460oo0O00oo.OooOOOo(this, new o0O000Oo(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.OooO0Oo;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.OooO0Oo ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), OooO0oO) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0460o0OoOoOO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0460o0OoOoOO c0460o0OoOoOO = (C0460o0OoOoOO) parcelable;
        super.onRestoreInstanceState(c0460o0OoOoOO.OooO00o);
        setChecked(c0460o0OoOoOO.OooO0OO);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.ninja.engine.o0OoOoOO, com.ninja.engine.OooOOo0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        AbstractC0018OooOOo0 abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        abstractC0018OooOOo0.OooO0OO = this.OooO0Oo;
        return abstractC0018OooOOo0;
    }

    public void setCheckable(boolean z) {
        if (this.OooO0o0 != z) {
            this.OooO0o0 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.OooO0o0 || this.OooO0Oo == z) {
            return;
        }
        this.OooO0Oo = z;
        refreshDrawableState();
        sendAccessibilityEvent(FileUtils.FileMode.MODE_ISUID);
    }

    public void setPressable(boolean z) {
        this.OooO0o = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.OooO0o) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.OooO0Oo);
    }
}



