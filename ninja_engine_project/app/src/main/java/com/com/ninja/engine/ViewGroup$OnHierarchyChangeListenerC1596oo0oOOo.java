package com.ninja.engine;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: com.ninja.engine.oo0oOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewGroup$OnHierarchyChangeListenerC1596oo0oOOo implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout OooO00o;

    public ViewGroup$OnHierarchyChangeListenerC1596oo0oOOo(CoordinatorLayout coordinatorLayout) {
        this.OooO00o = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.OooO00o.OooOOo0;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.OooO00o;
        coordinatorLayout.OooOOOO(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.OooOOo0;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
