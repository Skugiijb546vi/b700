package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.InterfaceC0290o0O00o;
import com.ninja.engine.R;
import com.ninja.engine.o000OO0O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public float OooO;
    public final ValueAnimator OooO00o;
    public boolean OooO0O0;
    public final ArrayList OooO0OO;
    public final int OooO0Oo;
    public final Paint OooO0o;
    public final float OooO0o0;
    public final RectF OooO0oO;
    public final int OooO0oo;
    public boolean OooOO0;
    public double OooOO0O;
    public int OooOO0o;
    public int OooOOO0;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.OooO00o = new ValueAnimator();
        this.OooO0OO = new ArrayList();
        Paint paint = new Paint();
        this.OooO0o = paint;
        this.OooO0oO = new RectF();
        this.OooOOO0 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1038oOOOoo0O.OooO0oo, R.attr.materialClockStyle, 2131952738);
        AbstractC0809oO0OooOO.OooooOO(context, R.attr.motionDurationLong2, 200);
        AbstractC0809oO0OooOO.OooooOo(context, R.attr.motionEasingEmphasizedInterpolator, o000OO0O.OooO0O0);
        this.OooOO0o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.OooO0Oo = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.OooO0oo = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.OooO0o0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        OooO0O0(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final int OooO00o(int i) {
        return i == 2 ? Math.round(this.OooOO0o * 0.66f) : this.OooOO0o;
    }

    public final void OooO0O0(float f) {
        ValueAnimator valueAnimator = this.OooO00o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        OooO0OO(f);
    }

    public final void OooO0OO(float f) {
        float f2 = f % 360.0f;
        this.OooO = f2;
        this.OooOO0O = Math.toRadians(f2 - 90.0f);
        float OooO00o = OooO00o(this.OooOOO0);
        float cos = (((float) Math.cos(this.OooOO0O)) * OooO00o) + (getWidth() / 2);
        float sin = (OooO00o * ((float) Math.sin(this.OooOO0O))) + (getHeight() / 2);
        float f3 = this.OooO0Oo;
        this.OooO0oO.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.OooO0OO.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC0290o0O00o) it.next());
            if (Math.abs(clockFaceView.Oooo00O - f2) > 0.001f) {
                clockFaceView.Oooo00O = f2;
                clockFaceView.OooOOO();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int OooO00o;
        int i;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float OooO00o2 = OooO00o(this.OooOOO0);
        float f2 = height;
        Paint paint = this.OooO0o;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.OooOO0O)) * OooO00o2) + f, (OooO00o2 * ((float) Math.sin(this.OooOO0O))) + f2, this.OooO0Oo, paint);
        double sin = Math.sin(this.OooOO0O);
        paint.setStrokeWidth(this.OooO0oo);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.OooOO0O) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f, f2, this.OooO0o0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.OooO00o.isRunning()) {
            OooO0O0(this.OooO);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z = false;
            } else {
                z = this.OooOO0;
                if (this.OooO0O0) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= OooO00o(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.OooOOO0 = i;
                }
            }
            z2 = false;
        } else {
            this.OooOO0 = false;
            z = false;
            z2 = true;
        }
        boolean z5 = this.OooOO0;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i2 = degrees + 90;
        if (i2 < 0) {
            i2 = degrees + 450;
        }
        float f = i2;
        if (this.OooO != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || !z3) {
            if (z3 || z) {
                OooO0O0(f);
            }
            this.OooOO0 = z5 | z4;
            return true;
        }
        z4 = true;
        this.OooOO0 = z5 | z4;
        return true;
    }
}


