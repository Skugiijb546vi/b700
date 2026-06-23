package com.ninja.engine;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
/* renamed from: com.ninja.engine.oO0oOOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858oO0oOOOO extends C0028OooOooO {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ C0858oO0oOOOO(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.ninja.engine.C0028OooOooO
    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        int i = this.OooO0Oo;
        super.OooO0OO(view, accessibilityEvent);
        switch (i) {
            case 3:
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                return;
        }
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        int scrollRange;
        switch (this.OooO0Oo) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
                AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.OooO00o;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0039OoooO.OooO00o;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                return;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.OooO00o;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0039OoooO.OooO00o;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.OooO00o;
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0039OoooO.OooO00o;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo4.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo4.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0039OoooO.OooO0O0(C0038Oooo0oo.OooO0oO);
                        c0039OoooO.OooO0O0(C0038Oooo0oo.OooOO0O);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0039OoooO.OooO0O0(C0038Oooo0oo.OooO0o);
                        c0039OoooO.OooO0O0(C0038Oooo0oo.OooOO0o);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r6 != 16908346) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r6 != r5.getScrollY()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
        r5.OooOo0(0 - r5.getScrollX(), r6 - r5.getScrollY(), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r6 != r5.getScrollY()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    @Override // com.ninja.engine.C0028OooOooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean OooO0oO(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.OooO0Oo
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.OooO0oO(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.OooO0oO(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto L94
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1f
        L1c:
            r0 = 0
            goto L94
        L1f:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3c
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3c
            int r7 = r2.height()
        L3c:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L76
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4f
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4f
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L76
            goto L1c
        L4f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
        L68:
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.OooOo0(r1, r6, r0)
            goto L94
        L76:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L1c
            goto L68
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0858oO0oOOOO.OooO0oO(android.view.View, int, android.os.Bundle):boolean");
    }
}
