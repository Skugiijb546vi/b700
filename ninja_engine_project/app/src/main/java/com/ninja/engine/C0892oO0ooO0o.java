package com.ninja.engine;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oO0ooO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892oO0ooO0o implements InterfaceMenuItemC1272oOoo0OOo {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public CharSequence OooO0o;
    public CharSequence OooO0o0;
    public Intent OooO0oO;
    public char OooO0oo;
    public char OooOO0;
    public Drawable OooOO0o;
    public final MenuC0887oO0oo0oo OooOOO;
    public SubMenuC1265oOoo0O OooOOOO;
    public MenuItem.OnMenuItemClickListener OooOOOo;
    public CharSequence OooOOo;
    public CharSequence OooOOo0;
    public View OooOoO;
    public int OooOoO0;
    public ActionProvider$VisibilityListenerC0888oO0ooO OooOoOO;
    public MenuItem.OnActionExpandListener OooOoo0;
    public int OooO = 4096;
    public int OooOO0O = 4096;
    public int OooOOO0 = 0;
    public ColorStateList OooOOoo = null;
    public PorterDuff.Mode OooOo00 = null;
    public boolean OooOo0 = false;
    public boolean OooOo0O = false;
    public boolean OooOo0o = false;
    public int OooOo = 16;
    public boolean OooOoo = false;

    public C0892oO0ooO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.OooOOO = menuC0887oO0oo0oo;
        this.OooO00o = i2;
        this.OooO0O0 = i;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
        this.OooO0o0 = charSequence;
        this.OooOoO0 = i5;
    }

    public static void OooO0OO(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo
    public final ActionProvider$VisibilityListenerC0888oO0ooO OooO00o() {
        return this.OooOoOO;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo
    public final InterfaceMenuItemC1272oOoo0OOo OooO0O0(ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO) {
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO2 = this.OooOoOO;
        if (actionProvider$VisibilityListenerC0888oO0ooO2 != null) {
            actionProvider$VisibilityListenerC0888oO0ooO2.getClass();
        }
        this.OooOoO = null;
        this.OooOoOO = actionProvider$VisibilityListenerC0888oO0ooO;
        this.OooOOO.OooOOOo(true);
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO3 = this.OooOoOO;
        if (actionProvider$VisibilityListenerC0888oO0ooO3 != null) {
            actionProvider$VisibilityListenerC0888oO0ooO3.OooO00o = new o00O(17, this);
            actionProvider$VisibilityListenerC0888oO0ooO3.OooO0O0.setVisibilityListener(actionProvider$VisibilityListenerC0888oO0ooO3);
        }
        return this;
    }

    public final Drawable OooO0Oo(Drawable drawable) {
        if (drawable != null && this.OooOo0o && (this.OooOo0 || this.OooOo0O)) {
            drawable = AbstractC0809oO0OooOO.o0ooOoO(drawable).mutate();
            if (this.OooOo0) {
                drawable.setTintList(this.OooOOoo);
            }
            if (this.OooOo0O) {
                drawable.setTintMode(this.OooOo00);
            }
            this.OooOo0o = false;
        }
        return drawable;
    }

    public final boolean OooO0o() {
        if ((this.OooOo & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean OooO0o0() {
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO;
        if ((this.OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.OooOoO == null && (actionProvider$VisibilityListenerC0888oO0ooO = this.OooOoOO) != null) {
            this.OooOoO = actionProvider$VisibilityListenerC0888oO0ooO.OooO0O0.onCreateActionView(this);
        }
        if (this.OooOoO == null) {
            return false;
        }
        return true;
    }

    public final void OooO0oO(boolean z) {
        int i;
        int i2 = this.OooOo & (-5);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.OooOo = i | i2;
    }

    public final void OooO0oo(boolean z) {
        int i;
        if (z) {
            i = this.OooOo | 32;
        } else {
            i = this.OooOo & (-33);
        }
        this.OooOo = i;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.OooOoO0 & 8) == 0) {
            return false;
        }
        if (this.OooOoO == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.OooOoo0;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.OooOOO.OooO0Oo(this);
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!OooO0o0()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.OooOoo0;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.OooOOO.OooO0o(this);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.OooOoO;
        if (view != null) {
            return view;
        }
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO = this.OooOoOO;
        if (actionProvider$VisibilityListenerC0888oO0ooO != null) {
            View onCreateActionView = actionProvider$VisibilityListenerC0888oO0ooO.OooO0O0.onCreateActionView(this);
            this.OooOoO = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.OooOO0O;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.OooOO0;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.OooOOo0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.OooO0O0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.OooOO0o;
        if (drawable != null) {
            return OooO0Oo(drawable);
        }
        int i = this.OooOOO0;
        if (i != 0) {
            Drawable OooOo0 = AbstractC0692o0ooooOo.OooOo0(this.OooOOO.OooO00o, i);
            this.OooOOO0 = 0;
            this.OooOO0o = OooOo0;
            return OooO0Oo(OooOo0);
        }
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.OooOOoo;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooOo00;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.OooO0oO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.OooO00o;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.OooO;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.OooO0oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.OooO0OO;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.OooOOOO;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.OooO0o0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.OooO0o;
        if (charSequence == null) {
            return this.OooO0o0;
        }
        return charSequence;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.OooOOo;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.OooOOOO != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.OooOoo;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.OooOo & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.OooOo & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.OooOo & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO = this.OooOoOO;
        if (actionProvider$VisibilityListenerC0888oO0ooO != null && actionProvider$VisibilityListenerC0888oO0ooO.OooO0O0.overridesItemVisibility()) {
            if ((this.OooOo & 8) != 0 || !this.OooOoOO.OooO0O0.isVisible()) {
                return false;
            }
            return true;
        } else if ((this.OooOo & 8) != 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.OooOOO.OooO00o;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.OooOoO = inflate;
        this.OooOoOO = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.OooO00o) > 0) {
            inflate.setId(i2);
        }
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooOOO;
        menuC0887oO0oo0oo.OooOO0O = true;
        menuC0887oO0oo0oo.OooOOOo(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.OooOO0 == c) {
            return this;
        }
        this.OooOO0 = Character.toLowerCase(c);
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.OooOo;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.OooOo = i2;
        if (i != i2) {
            this.OooOOO.OooOOOo(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.OooOo;
        int i3 = 2;
        if ((i2 & 4) != 0) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooOOO;
            menuC0887oO0oo0oo.getClass();
            ArrayList arrayList = menuC0887oO0oo0oo.OooO0o;
            int size = arrayList.size();
            menuC0887oO0oo0oo.OooOo0o();
            for (int i4 = 0; i4 < size; i4++) {
                C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i4);
                if (c0892oO0ooO0o.OooO0O0 == this.OooO0O0 && (c0892oO0ooO0o.OooOo & 4) != 0 && c0892oO0ooO0o.isCheckable()) {
                    if (c0892oO0ooO0o == this) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i5 = c0892oO0ooO0o.OooOo;
                    int i6 = i5 & (-3);
                    if (z2) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i7 = i | i6;
                    c0892oO0ooO0o.OooOo = i7;
                    if (i5 != i7) {
                        c0892oO0ooO0o.OooOOO.OooOOOo(false);
                    }
                }
            }
            menuC0887oO0oo0oo.OooOo0O();
        } else {
            int i8 = i2 & (-3);
            if (!z) {
                i3 = 0;
            }
            int i9 = i8 | i3;
            this.OooOo = i9;
            if (i2 != i9) {
                this.OooOOO.OooOOOo(false);
            }
        }
        return this;
    }



    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i;
        if (z) {
            i = this.OooOo | 16;
        } else {
            i = this.OooOo & (-17);
        }
        this.OooOo = i;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.OooOO0o = null;
        this.OooOOO0 = i;
        this.OooOo0o = true;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.OooOOoo = colorStateList;
        this.OooOo0 = true;
        this.OooOo0o = true;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooOo00 = mode;
        this.OooOo0O = true;
        this.OooOo0o = true;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.OooO0oO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.OooO0oo == c) {
            return this;
        }
        this.OooO0oo = c;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.OooOoo0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.OooOOOo = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.OooO0oo = c;
        this.OooOO0 = Character.toLowerCase(c2);
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.OooOoO0 = i;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooOOO;
        menuC0887oO0oo0oo.OooOO0O = true;
        menuC0887oO0oo0oo.OooOOOo(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.OooOOO.OooO00o.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.OooO0o = charSequence;
        this.OooOOO.OooOOOo(false);
        return this;
    }



    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.OooOo;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.OooOo = i4;
        if (i2 != i4) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooOOO;
            menuC0887oO0oo0oo.OooO0oo = true;
            menuC0887oO0oo0oo.OooOOOo(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.OooO0o0;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.OooOO0 == c && this.OooOO0O == i) {
            return this;
        }
        this.OooOO0 = Character.toLowerCase(c);
        this.OooOO0O = KeyEvent.normalizeMetaState(i);
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final InterfaceMenuItemC1272oOoo0OOo setContentDescription(CharSequence charSequence) {
        this.OooOOo0 = charSequence;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.OooOOO0 = 0;
        this.OooOO0o = drawable;
        this.OooOo0o = true;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.OooO0oo == c && this.OooO == i) {
            return this;
        }
        this.OooO0oo = c;
        this.OooO = KeyEvent.normalizeMetaState(i);
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.OooO0oo = c;
        this.OooO = KeyEvent.normalizeMetaState(i);
        this.OooOO0 = Character.toLowerCase(c2);
        this.OooOO0O = KeyEvent.normalizeMetaState(i2);
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // com.ninja.engine.InterfaceMenuItemC1272oOoo0OOo, android.view.MenuItem
    public final InterfaceMenuItemC1272oOoo0OOo setTooltipText(CharSequence charSequence) {
        this.OooOOo = charSequence;
        this.OooOOO.OooOOOo(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.OooO0o0 = charSequence;
        this.OooOOO.OooOOOo(false);
        SubMenuC1265oOoo0O subMenuC1265oOoo0O = this.OooOOOO;
        if (subMenuC1265oOoo0O != null) {
            subMenuC1265oOoo0O.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.OooOoO = view;
        this.OooOoOO = null;
        if (view != null && view.getId() == -1 && (i = this.OooO00o) > 0) {
            view.setId(i);
        }
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooOOO;
        menuC0887oO0oo0oo.OooOO0O = true;
        menuC0887oO0oo0oo.OooOOOo(true);
        return this;
    }
}
