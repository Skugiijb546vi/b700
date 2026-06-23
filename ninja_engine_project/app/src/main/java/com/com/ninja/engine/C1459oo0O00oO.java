package com.ninja.engine;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0O00oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459oo0O00oO {
    public static final ArrayList OooO0Oo = new ArrayList();
    public WeakHashMap OooO00o;
    public SparseArray OooO0O0;
    public WeakReference OooO0OO;

    public final View OooO00o(View view) {
        int size;
        WeakHashMap weakHashMap = this.OooO00o;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View OooO00o = OooO00o(viewGroup.getChildAt(childCount));
                    if (OooO00o != null) {
                        return OooO00o;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                AbstractC1230oOoOo0o.OooOO0O(arrayList.get(size));
                throw null;
            }
        }
        return null;
    }
}
