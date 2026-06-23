package com.ninja.engine;

import android.view.View;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0oo00oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0616o0oo00oO {
    static {
        try {
            AbstractC0621o0oo0O0o abstractC0621o0oo0O0o = (AbstractC0621o0oo0O0o) C0623o0oo0OO0.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
    }

    public static void OooO00o(ArrayList arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i);
        }
    }
}


