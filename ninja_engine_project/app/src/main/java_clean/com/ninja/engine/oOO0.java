package com.ninja.engine;

import android.content.Context;
import android.view.SubMenu;
/* loaded from: classes.dex */
public final class oOO0 extends MenuC0887oO0oo0oo {
    public final Class OooOoO;
    public final int OooOoOO;

    public oOO0(Context context, Class cls, int i) {
        super(context);
        this.OooOoO = cls;
        this.OooOoOO = i;
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo
    public final C0892oO0ooO0o OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.OooO0o.size() + 1;
        int i4 = this.OooOoOO;
        if (size <= i4) {
            OooOo0o();
            C0892oO0ooO0o OooO00o = super.OooO00o(i, i2, i3, charSequence);
            OooO00o.OooO0oO(true);
            OooOo0O();
            return OooO00o;
        }
        String simpleName = this.OooOoO.getSimpleName();
        StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
        sb.append(simpleName);
        sb.append(" is ");
        sb.append(i4);
        sb.append(". Limit can be checked with ");
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO(sb, simpleName, "#getMaxItemCount()"));
    }

    @Override // com.ninja.engine.MenuC0887oO0oo0oo, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.OooOoO.getSimpleName().concat(" does not support submenus"));
    }
}


