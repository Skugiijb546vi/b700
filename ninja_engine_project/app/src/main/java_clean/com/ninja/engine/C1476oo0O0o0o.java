package com.ninja.engine;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oo0O0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1476oo0O0o0o {
    public static Integer OooO0Oo;
    public final View OooO00o;
    public final ArrayList OooO0O0 = new ArrayList();
    public ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO OooO0OO;

    public C1476oo0O0o0o(View view) {
        this.OooO00o = view;
    }

    public final int OooO00o(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.OooO00o;
        if (!view.isLayoutRequested() && i2 == -2) {
            Log.isLoggable("ViewTarget", 4);
            Context context = view.getContext();
            if (OooO0Oo == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                AbstractC0694o0ooooo0.OooOO0O(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                OooO0Oo = Integer.valueOf(Math.max(point.x, point.y));
            }
            return OooO0Oo.intValue();
        }
        return 0;
    }
}


