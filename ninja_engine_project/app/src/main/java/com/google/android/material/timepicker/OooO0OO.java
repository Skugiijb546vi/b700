package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ninja.engine.C0028OooOooO;
import com.ninja.engine.C0038Oooo0oo;
import com.ninja.engine.C0039OoooO;
import com.ninja.engine.C0042OoooO0O;
import com.ninja.engine.R;
/* loaded from: classes.dex */
public final class OooO0OO extends C0028OooOooO {
    public final /* synthetic */ ClockFaceView OooO0Oo;

    public OooO0OO(ClockFaceView clockFaceView) {
        this.OooO0Oo = clockFaceView;
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final void OooO0Oo(View view, C0039OoooO c0039OoooO) {
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.OooO0Oo.OooOo.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        c0039OoooO.OooO(C0042OoooO0O.OooO00o(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        c0039OoooO.OooO0O0(C0038Oooo0oo.OooO0o0);
    }

    @Override // com.ninja.engine.C0028OooOooO
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.OooO0Oo;
            view.getHitRect(clockFaceView.OooOo0);
            float centerX = clockFaceView.OooOo0.centerX();
            float centerY = clockFaceView.OooOo0.centerY();
            clockFaceView.OooOo00.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.OooOo00.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.OooO0oO(view, i, bundle);
    }
}
