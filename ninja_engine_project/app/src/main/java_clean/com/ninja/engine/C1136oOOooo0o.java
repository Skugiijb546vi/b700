package com.ninja.engine;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
/* renamed from: com.ninja.engine.oOOooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136oOOooo0o {
    public final ColorStateList OooO00o;
    public final Configuration OooO0O0;
    public final int OooO0OO;

    public C1136oOOooo0o(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.OooO00o = colorStateList;
        this.OooO0O0 = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.OooO0OO = hashCode;
    }
}


