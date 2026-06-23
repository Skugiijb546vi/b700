package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOooooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnLongClickListenerC1341oOooooO implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static View$OnLongClickListenerC1341oOooooO OooOO0O;
    public static View$OnLongClickListenerC1341oOooooO OooOO0o;
    public boolean OooO;
    public final View OooO00o;
    public final CharSequence OooO0O0;
    public final int OooO0OO;
    public int OooO0o;
    public int OooO0oO;
    public C1344oOooooOo OooO0oo;
    public boolean OooOO0;
    public final Runnable OooO0Oo = new Runnable() { // from class: com.ninja.engine.oOooooO0
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC1341oOooooO.this.OooO0OO(false);
        }
    };
    public final Runnable OooO0o0 = new Runnable() { // from class: com.ninja.engine.oOooooO0
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC1341oOooooO.this.OooO00o();
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOooooO0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.oOooooO0] */
    public View$OnLongClickListenerC1341oOooooO(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.OooO00o = view;
        this.OooO0O0 = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC1447oo0O0.OooO00o;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = AbstractC0408o0Oo00o.OooO0oO(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.OooO0OO = scaledTouchSlop;
        this.OooOO0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void OooO0O0(View$OnLongClickListenerC1341oOooooO view$OnLongClickListenerC1341oOooooO) {
        View$OnLongClickListenerC1341oOooooO view$OnLongClickListenerC1341oOooooO2 = OooOO0O;
        if (view$OnLongClickListenerC1341oOooooO2 != null) {
            view$OnLongClickListenerC1341oOooooO2.OooO00o.removeCallbacks(view$OnLongClickListenerC1341oOooooO2.OooO0Oo);
        }
        OooOO0O = view$OnLongClickListenerC1341oOooooO;
        if (view$OnLongClickListenerC1341oOooooO != null) {
            view$OnLongClickListenerC1341oOooooO.OooO00o.postDelayed(view$OnLongClickListenerC1341oOooooO.OooO0Oo, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void OooO00o() {
        View$OnLongClickListenerC1341oOooooO view$OnLongClickListenerC1341oOooooO = OooOO0o;
        View view = this.OooO00o;
        if (view$OnLongClickListenerC1341oOooooO == this) {
            OooOO0o = null;
            C1344oOooooOo c1344oOooooOo = this.OooO0oo;
            if (c1344oOooooOo != null) {
                View view2 = (View) c1344oOooooOo.OooO0O0;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1344oOooooOo.OooO00o).getSystemService("window")).removeView(view2);
                }
                this.OooO0oo = null;
                this.OooOO0 = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (OooOO0O == this) {
            OooO0O0(null);
        }
        view.removeCallbacks(this.OooO0o0);
    }

    public final void OooO0OO(boolean z) {
        int height;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.OooO00o;
        if (!view.isAttachedToWindow()) {
            return;
        }
        OooO0O0(null);
        View$OnLongClickListenerC1341oOooooO view$OnLongClickListenerC1341oOooooO = OooOO0o;
        if (view$OnLongClickListenerC1341oOooooO != null) {
            view$OnLongClickListenerC1341oOooooO.OooO00o();
        }
        OooOO0o = this;
        this.OooO = z;
        C1344oOooooOo c1344oOooooOo = new C1344oOooooOo(view.getContext());
        this.OooO0oo = c1344oOooooOo;
        int i5 = this.OooO0o;
        int i6 = this.OooO0oO;
        boolean z2 = this.OooO;
        View view2 = (View) c1344oOooooOo.OooO0O0;
        ViewParent parent = view2.getParent();
        Context context = (Context) c1344oOooooOo.OooO00o;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context.getSystemService("window")).removeView(view2);
        }
        ((TextView) c1344oOooooOo.OooO0OO).setText(this.OooO0O0);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) c1344oOooooOo.OooO0Oo;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i5 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i6 + dimensionPixelOffset2;
            i = i6 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z2) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            str2 = "window";
        } else {
            Rect rect = (Rect) c1344oOooooOo.OooO0o0;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i3 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i4 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i4 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i3 = 0;
                rect.set(0, i4, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = (int[]) c1344oOooooOo.OooO0oO;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) c1344oOooooOo.OooO0o;
            view.getLocationOnScreen(iArr2);
            int i7 = iArr2[i3] - iArr[i3];
            iArr2[i3] = i7;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i7 + i5) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i8 = iArr2[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (!z2 ? measuredHeight + i10 > rect.height() : i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.OooO) {
            j2 = 2500;
        } else {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        Runnable runnable = this.OooO0o0;
        view.removeCallbacks(runnable);
        view.postDelayed(runnable, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (java.lang.Math.abs(r5 - r3.OooO0oO) <= r2) goto L17;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            com.ninja.engine.oOooooOo r4 = r3.OooO0oo
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.OooO
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.OooO00o
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.OooOO0 = r4
            r3.OooO00o()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            com.ninja.engine.oOooooOo r4 = r3.OooO0oo
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.OooOO0
            if (r1 != 0) goto L66
            int r1 = r3.OooO0o
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.OooO0OO
            if (r1 > r2) goto L66
            int r1 = r3.OooO0oO
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.OooO0o = r4
            r3.OooO0oO = r5
            r3.OooOO0 = r0
            OooO0O0(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.View$OnLongClickListenerC1341oOooooO.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.OooO0o = view.getWidth() / 2;
        this.OooO0oO = view.getHeight() / 2;
        OooO0OO(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        OooO00o();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}


