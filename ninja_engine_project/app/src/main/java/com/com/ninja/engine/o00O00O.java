package com.ninja.engine;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class o00O00O {
    public static void OooO00o(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
