package com.ninja.engine;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class o000O00 extends Drawable.ConstantState {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public /* synthetic */ o000O00(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.OooO00o) {
            case 0:
                return ((Drawable.ConstantState) this.OooO0O0).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.OooO00o) {
            case 0:
                return ((Drawable.ConstantState) this.OooO0O0).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.OooO00o) {
            case 0:
                o000O00O o000o00o = new o000O00O(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.OooO0O0).newDrawable();
                o000o00o.OooO00o = newDrawable;
                newDrawable.setCallback(o000o00o.OooO0o);
                return o000o00o;
            default:
                return new C0680o0oooOO(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.OooO00o) {
            case 0:
                o000O00O o000o00o = new o000O00O(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.OooO0O0).newDrawable(resources);
                o000o00o.OooO00o = newDrawable;
                newDrawable.setCallback(o000o00o.OooO0o);
                return o000o00o;
            default:
                return new C0680o0oooOO(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.OooO00o) {
            case 0:
                o000O00O o000o00o = new o000O00O(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.OooO0O0).newDrawable(resources, theme);
                o000o00o.OooO00o = newDrawable;
                newDrawable.setCallback(o000o00o.OooO0o);
                return o000o00o;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}


