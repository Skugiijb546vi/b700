package com.ninja.engine;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.app.framework.core.system.JarConfig;
/* renamed from: com.ninja.engine.oOOoO0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085oOOoO0oo extends C0028OooOooO {
    public final RecyclerView OooO0Oo;
    public final C1084oOOoO0oO OooO0o0;

    public C1085oOOoO0oo(RecyclerView recyclerView) {
        this.OooO0Oo = recyclerView;
        C1084oOOoO0oO c1084oOOoO0oO = this.OooO0o0;
        this.OooO0o0 = c1084oOOoO0oO == null ? new C1084oOOoO0oO(this) : c1084oOOoO0oO;
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        super.OooO0OO(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.OooO0Oo.Oooo0OO()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().OoooO(accessibilityEvent);
            }
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.OooO0Oo;
        if (!recyclerView.Oooo0OO() && recyclerView.getLayoutManager() != null) {
            AbstractC1066oOOo0Oo layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.OooO0O0;
            C1070oOOo0o c1070oOOo0o = recyclerView2.OooO0O0;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.OooO0O0.canScrollHorizontally(-1)) {
                c0039OoooO.OooO00o(JarConfig.DEFAULT_BUFFER_SIZE);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.OooO0O0.canScrollVertically(1) || layoutManager.OooO0O0.canScrollHorizontally(1)) {
                c0039OoooO.OooO00o(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            C1080oOOoO0O c1080oOOoO0O = recyclerView2.Ooooo00;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.Oooo0O0(c1070oOOo0o, c1080oOOoO0O), layoutManager.OooOo(c1070oOOo0o, c1080oOOoO0O), false, 0));
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        int i2;
        int OooOooo;
        if (super.OooO0oO(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.OooO0Oo;
        if (recyclerView.Oooo0OO() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC1066oOOo0Oo layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.OooO0O0;
        C1070oOOo0o c1070oOOo0o = recyclerView2.OooO0O0;
        if (i != 4096) {
            if (i != 8192) {
                OooOooo = 0;
                i2 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    i2 = -((layoutManager.OooOOOO - layoutManager.Oooo00O()) - layoutManager.OooOooO());
                } else {
                    i2 = 0;
                }
                if (layoutManager.OooO0O0.canScrollHorizontally(-1)) {
                    OooOooo = -((layoutManager.OooOOO - layoutManager.OooOooo()) - layoutManager.Oooo000());
                }
                OooOooo = 0;
            }
        } else {
            if (recyclerView2.canScrollVertically(1)) {
                i2 = (layoutManager.OooOOOO - layoutManager.Oooo00O()) - layoutManager.OooOooO();
            } else {
                i2 = 0;
            }
            if (layoutManager.OooO0O0.canScrollHorizontally(1)) {
                OooOooo = (layoutManager.OooOOO - layoutManager.OooOooo()) - layoutManager.Oooo000();
            }
            OooOooo = 0;
        }
        if (i2 == 0 && OooOooo == 0) {
            return false;
        }
        layoutManager.OooO0O0.Ooooo00(OooOooo, i2, true);
        return true;
    }
}


