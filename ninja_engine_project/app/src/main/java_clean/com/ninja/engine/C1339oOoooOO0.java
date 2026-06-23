package com.ninja.engine;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
/* renamed from: com.ninja.engine.oOoooOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339oOoooOO0 implements InterfaceC0357o0OOO0oO {
    public CharSequence OooO;
    public Toolbar OooO00o;
    public int OooO0O0;
    public View OooO0OO;
    public Drawable OooO0Oo;
    public Drawable OooO0o;
    public Drawable OooO0o0;
    public boolean OooO0oO;
    public CharSequence OooO0oo;
    public CharSequence OooOO0;
    public Window.Callback OooOO0O;
    public boolean OooOO0o;
    public int OooOOO;
    public o000000 OooOOO0;
    public Drawable OooOOOO;

    public final void OooO00o(int i) {
        View view;
        int i2 = this.OooO0O0 ^ i;
        this.OooO0O0 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    OooO0O0();
                }
                int i3 = this.OooO0O0 & 4;
                Toolbar toolbar = this.OooO00o;
                if (i3 != 0) {
                    Drawable drawable = this.OooO0o;
                    if (drawable == null) {
                        drawable = this.OooOOOO;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                OooO0OO();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.OooO00o;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.OooO0oo);
                    toolbar2.setSubtitle(this.OooO);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.OooO0OO) != null) {
                if ((i & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void OooO0O0() {
        if ((this.OooO0O0 & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.OooOO0);
            Toolbar toolbar = this.OooO00o;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.OooOOO);
            } else {
                toolbar.setNavigationContentDescription(this.OooOO0);
            }
        }
    }

    public final void OooO0OO() {
        Drawable drawable;
        int i = this.OooO0O0;
        if ((i & 2) != 0) {
            if ((i & 1) == 0 || (drawable = this.OooO0o0) == null) {
                drawable = this.OooO0Oo;
            }
        } else {
            drawable = null;
        }
        this.OooO00o.setLogo(drawable);
    }
}


