package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.app.framework.utils.FileUtils;
import com.ninja.engine.AbstractC0579o0oOo0O;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1094oOOoOOo0;
import com.ninja.engine.AbstractC1137oOOoooO;
import com.ninja.engine.AbstractC1139oOOoooOO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0765oO0O0oo0;
import com.ninja.engine.C0892oO0ooO0o;
import com.ninja.engine.InterfaceC0901oO0ooooo;
import com.ninja.engine.R;
import com.ninja.engine.o0O000Oo;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0579o0oOo0O implements InterfaceC0901oO0ooooo {
    public static final int[] Oooo00O = {16842912};
    public boolean OooOo;
    public int OooOo0O;
    public boolean OooOo0o;
    public final CheckedTextView OooOoO;
    public final boolean OooOoO0;
    public FrameLayout OooOoOO;
    public ColorStateList OooOoo;
    public C0892oO0ooO0o OooOoo0;
    public boolean OooOooO;
    public Drawable OooOooo;
    public final o0O000Oo Oooo000;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooOoO0 = true;
        o0O000Oo o0o000oo = new o0O000Oo(3, this);
        this.Oooo000 = o0o000oo;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.OooOoO = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC1460oo0O00oo.OooOOOo(checkedTextView, o0o000oo);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.OooOoOO == null) {
                this.OooOoOO = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.OooOoOO.removeAllViews();
            this.OooOoOO.addView(view);
        }
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public final void OooO0O0(C0892oO0ooO0o c0892oO0ooO0o) {
        int i;
        C0765oO0O0oo0 c0765oO0O0oo0;
        int i2;
        StateListDrawable stateListDrawable;
        this.OooOoo0 = c0892oO0ooO0o;
        int i3 = c0892oO0ooO0o.OooO00o;
        if (i3 > 0) {
            setId(i3);
        }
        if (c0892oO0ooO0o.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(Oooo00O, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            setBackground(stateListDrawable);
        }
        setCheckable(c0892oO0ooO0o.isCheckable());
        setChecked(c0892oO0ooO0o.isChecked());
        setEnabled(c0892oO0ooO0o.isEnabled());
        setTitle(c0892oO0ooO0o.OooO0o0);
        setIcon(c0892oO0ooO0o.getIcon());
        setActionView(c0892oO0ooO0o.getActionView());
        setContentDescription(c0892oO0ooO0o.OooOOo0);
        AbstractC1137oOOoooO.OooOOOO(this, c0892oO0ooO0o.OooOOo);
        C0892oO0ooO0o c0892oO0ooO0o2 = this.OooOoo0;
        CharSequence charSequence = c0892oO0ooO0o2.OooO0o0;
        CheckedTextView checkedTextView = this.OooOoO;
        if (charSequence == null && c0892oO0ooO0o2.getIcon() == null && this.OooOoo0.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.OooOoOO;
            if (frameLayout != null) {
                c0765oO0O0oo0 = (C0765oO0O0oo0) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            checkedTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.OooOoOO;
            if (frameLayout2 != null) {
                c0765oO0O0oo0 = (C0765oO0O0oo0) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) c0765oO0O0oo0).width = i2;
        this.OooOoOO.setLayoutParams(c0765oO0O0oo0);
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public C0892oO0ooO0o getItemData() {
        return this.OooOoo0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOoo0;
        if (c0892oO0ooO0o != null && c0892oO0ooO0o.isCheckable() && this.OooOoo0.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Oooo00O);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.OooOo != z) {
            this.OooOo = z;
            this.Oooo000.OooO0oo(this.OooOoO, FileUtils.FileMode.MODE_ISUID);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.OooOoO;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.OooOoO0) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.OooOooO) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
                drawable.setTintList(this.OooOoo);
            }
            int i = this.OooOo0O;
            drawable.setBounds(0, 0, i, i);
        } else if (this.OooOo0o) {
            if (this.OooOooo == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC1139oOOoooOO.OooO00o;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.OooOooo = drawable2;
                if (drawable2 != null) {
                    int i2 = this.OooOo0O;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.OooOooo;
        }
        this.OooOoO.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.OooOoO.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.OooOo0O = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.OooOoo = colorStateList;
        this.OooOooO = colorStateList != null;
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOoo0;
        if (c0892oO0ooO0o != null) {
            setIcon(c0892oO0ooO0o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.OooOoO.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.OooOo0o = z;
    }

    public void setTextAppearance(int i) {
        AbstractC1094oOOoOOo0.OooOo0o(this.OooOoO, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.OooOoO.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.OooOoO.setText(charSequence);
    }
}


