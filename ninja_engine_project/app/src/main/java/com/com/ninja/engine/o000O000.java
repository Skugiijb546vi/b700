package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
/* loaded from: classes.dex */
public final class o000O000 extends Drawable.ConstantState {
    public boolean OooO;
    public final AbstractC0418o0Oo0OOO OooO00o;
    public Resources OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public SparseArray OooO0o;
    public int OooO0o0;
    public Drawable[] OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public Rect OooOO0O;
    public boolean OooOO0o;
    public int OooOOO;
    public boolean OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public boolean OooOOo;
    public int OooOOo0;
    public int OooOOoo;
    public int OooOo;
    public boolean OooOo0;
    public boolean OooOo00;
    public boolean OooOo0O;
    public boolean OooOo0o;
    public int OooOoO;
    public int OooOoO0;
    public boolean OooOoOO;
    public boolean OooOoo;
    public ColorFilter OooOoo0;
    public ColorStateList OooOooO;
    public PorterDuff.Mode OooOooo;
    public C0832oO0o0o00 Oooo0;
    public boolean Oooo000;
    public boolean Oooo00O;
    public int[][] Oooo00o;
    public C1236oOoOoO00 Oooo0O0;

    public o000O000(o000O000 o000o000, C0092o000Ooo c0092o000Ooo, Resources resources) {
        Resources resources2;
        int i;
        C1236oOoOoO00 c1236oOoOoO00;
        SparseArray sparseArray;
        this.OooO = false;
        this.OooOO0o = false;
        this.OooOo0o = true;
        this.OooOoO0 = 0;
        this.OooOoO = 0;
        this.OooO00o = c0092o000Ooo;
        if (resources != null) {
            resources2 = resources;
        } else if (o000o000 != null) {
            resources2 = o000o000.OooO0O0;
        } else {
            resources2 = null;
        }
        this.OooO0O0 = resources2;
        if (o000o000 != null) {
            i = o000o000.OooO0OO;
        } else {
            i = 0;
        }
        int i2 = AbstractC0418o0Oo0OOO.OooOOO0;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.OooO0OO = i;
        if (o000o000 != null) {
            this.OooO0Oo = o000o000.OooO0Oo;
            this.OooO0o0 = o000o000.OooO0o0;
            this.OooOo0 = true;
            this.OooOo0O = true;
            this.OooO = o000o000.OooO;
            this.OooOO0o = o000o000.OooOO0o;
            this.OooOo0o = o000o000.OooOo0o;
            this.OooOo = o000o000.OooOo;
            this.OooOoO0 = o000o000.OooOoO0;
            this.OooOoO = o000o000.OooOoO;
            this.OooOoOO = o000o000.OooOoOO;
            this.OooOoo0 = o000o000.OooOoo0;
            this.OooOoo = o000o000.OooOoo;
            this.OooOooO = o000o000.OooOooO;
            this.OooOooo = o000o000.OooOooo;
            this.Oooo000 = o000o000.Oooo000;
            this.Oooo00O = o000o000.Oooo00O;
            if (o000o000.OooO0OO == i) {
                if (o000o000.OooOO0) {
                    this.OooOO0O = o000o000.OooOO0O != null ? new Rect(o000o000.OooOO0O) : null;
                    this.OooOO0 = true;
                }
                if (o000o000.OooOOO0) {
                    this.OooOOO = o000o000.OooOOO;
                    this.OooOOOO = o000o000.OooOOOO;
                    this.OooOOOo = o000o000.OooOOOo;
                    this.OooOOo0 = o000o000.OooOOo0;
                    this.OooOOO0 = true;
                }
            }
            if (o000o000.OooOOo) {
                this.OooOOoo = o000o000.OooOOoo;
                this.OooOOo = true;
            }
            if (o000o000.OooOo00) {
                this.OooOo00 = true;
            }
            Drawable[] drawableArr = o000o000.OooO0oO;
            this.OooO0oO = new Drawable[drawableArr.length];
            this.OooO0oo = o000o000.OooO0oo;
            SparseArray sparseArray2 = o000o000.OooO0o;
            if (sparseArray2 != null) {
                sparseArray = sparseArray2.clone();
            } else {
                sparseArray = new SparseArray(this.OooO0oo);
            }
            this.OooO0o = sparseArray;
            int i3 = this.OooO0oo;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.OooO0o.put(i4, constantState);
                    } else {
                        this.OooO0oO[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.OooO0oO = new Drawable[10];
            this.OooO0oo = 0;
        }
        if (o000o000 != null) {
            this.Oooo00o = o000o000.Oooo00o;
        } else {
            this.Oooo00o = new int[this.OooO0oO.length];
        }
        if (o000o000 != null) {
            this.Oooo0 = o000o000.Oooo0;
            c1236oOoOoO00 = o000o000.Oooo0O0;
        } else {
            this.Oooo0 = new C0832oO0o0o00();
            c1236oOoOoO00 = new C1236oOoOoO00();
        }
        this.Oooo0O0 = c1236oOoOoO00;
    }

    public final int OooO00o(Drawable drawable) {
        int i = this.OooO0oo;
        if (i >= this.OooO0oO.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.OooO0oO;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.OooO0oO = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(this.Oooo00o, 0, iArr, 0, i);
            this.Oooo00o = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.OooO00o);
        this.OooO0oO[i] = drawable;
        this.OooO0oo++;
        this.OooO0o0 = drawable.getChangingConfigurations() | this.OooO0o0;
        this.OooOOo = false;
        this.OooOo00 = false;
        this.OooOO0O = null;
        this.OooOO0 = false;
        this.OooOOO0 = false;
        this.OooOo0 = false;
        return i;
    }

    public final void OooO0O0() {
        this.OooOOO0 = true;
        OooO0OO();
        int i = this.OooO0oo;
        Drawable[] drawableArr = this.OooO0oO;
        this.OooOOOO = -1;
        this.OooOOO = -1;
        this.OooOOo0 = 0;
        this.OooOOOo = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.OooOOO) {
                this.OooOOO = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.OooOOOO) {
                this.OooOOOO = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.OooOOOo) {
                this.OooOOOo = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.OooOOo0) {
                this.OooOOo0 = minimumHeight;
            }
        }
    }

    public final void OooO0OO() {
        SparseArray sparseArray = this.OooO0o;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.OooO0o.keyAt(i);
                Drawable[] drawableArr = this.OooO0oO;
                Drawable newDrawable = ((Drawable.ConstantState) this.OooO0o.valueAt(i)).newDrawable(this.OooO0O0);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC0809oO0OooOO.OoooooO(newDrawable, this.OooOo);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.OooO00o);
                drawableArr[keyAt] = mutate;
            }
            this.OooO0o = null;
        }
    }

    public final Drawable OooO0Oo(int i) {
        int indexOfKey;
        Drawable drawable = this.OooO0oO[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.OooO0o;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.OooO0o.valueAt(indexOfKey)).newDrawable(this.OooO0O0);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0809oO0OooOO.OoooooO(newDrawable, this.OooOo);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.OooO00o);
        this.OooO0oO[i] = mutate;
        this.OooO0o.removeAt(indexOfKey);
        if (this.OooO0o.size() == 0) {
            this.OooO0o = null;
        }
        return mutate;
    }

    public final int OooO0o(int[] iArr) {
        int[][] iArr2 = this.Oooo00o;
        int i = this.OooO0oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public final int OooO0o0(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        C1236oOoOoO00 c1236oOoOoO00 = this.Oooo0O0;
        Integer num = 0;
        int OooO0Oo = AbstractC0694o0ooooo0.OooO0Oo(c1236oOoOoO00.OooO0OO, i, c1236oOoOoO00.OooO00o);
        if (OooO0Oo >= 0 && (obj = c1236oOoOoO00.OooO0O0[OooO0Oo]) != AbstractC0809oO0OooOO.OooOO0o) {
            num = obj;
        }
        return num.intValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.OooO0oo;
        Drawable[] drawableArr = this.OooO0oO;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.OooO0o.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.OooO0Oo | this.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0092o000Ooo(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0092o000Ooo(this, resources);
    }
}
