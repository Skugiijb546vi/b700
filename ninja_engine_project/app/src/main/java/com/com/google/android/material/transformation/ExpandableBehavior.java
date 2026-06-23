package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import java.util.ArrayList;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0326o0O0oOOO {
    public ExpandableBehavior() {
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public abstract void OooO0O0(View view, View view2);

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0o0(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1230oOoOo0o.OooOO0O(view2);
        throw null;
    }

    @Override // com.ninja.engine.AbstractC0326o0O0oOOO
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (!view.isLaidOut()) {
            ArrayList OooOO0 = coordinatorLayout.OooOO0(view);
            int size = OooOO0.size();
            for (int i2 = 0; i2 < size; i2++) {
                OooO0O0(view, (View) OooOO0.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
