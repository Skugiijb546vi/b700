package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ninja.engine.AbstractC1039oOOOoo0o;
import com.ninja.engine.AbstractC1194oOoOO0o;
import com.ninja.engine.C0154o00Oo0;
import com.ninja.engine.R;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public final int OooO;
    public boolean OooO00o;
    public View OooO0O0;
    public View OooO0OO;
    public Drawable OooO0Oo;
    public Drawable OooO0o;
    public Drawable OooO0o0;
    public final boolean OooO0oO;
    public boolean OooO0oo;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0154o00Oo0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooO00o);
        boolean z = false;
        this.OooO0Oo = obtainStyledAttributes.getDrawable(0);
        this.OooO0o0 = obtainStyledAttributes.getDrawable(2);
        this.OooO = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.OooO0oO = true;
            this.OooO0o = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.OooO0oO ? !(this.OooO0Oo != null || this.OooO0o0 != null) : this.OooO0o == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.OooO0Oo;
        if (drawable != null && drawable.isStateful()) {
            this.OooO0Oo.setState(getDrawableState());
        }
        Drawable drawable2 = this.OooO0o0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.OooO0o0.setState(getDrawableState());
        }
        Drawable drawable3 = this.OooO0o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.OooO0o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.OooO0o0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.OooO0o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.OooO0O0 = findViewById(R.id.action_bar);
        this.OooO0OO = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.OooO00o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.OooO0oO) {
            Drawable drawable2 = this.OooO0o;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.OooO0Oo != null) {
                if (this.OooO0O0.getVisibility() == 0) {
                    drawable = this.OooO0Oo;
                    left = this.OooO0O0.getLeft();
                    top = this.OooO0O0.getTop();
                    right = this.OooO0O0.getRight();
                    view = this.OooO0O0;
                } else {
                    View view2 = this.OooO0OO;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.OooO0Oo.setBounds(0, 0, 0, 0);
                    } else {
                        drawable = this.OooO0Oo;
                        left = this.OooO0OO.getLeft();
                        top = this.OooO0OO.getTop();
                        right = this.OooO0OO.getRight();
                        view = this.OooO0OO;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
            } else {
                z2 = false;
            }
            this.OooO0oo = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.OooO0O0 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.OooO) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.OooO0O0 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.OooO0Oo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.OooO0Oo);
        }
        this.OooO0Oo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.OooO0O0;
            if (view != null) {
                this.OooO0Oo.setBounds(view.getLeft(), this.OooO0O0.getTop(), this.OooO0O0.getRight(), this.OooO0O0.getBottom());
            }
        }
        boolean z = false;
        if (!this.OooO0oO ? !(this.OooO0Oo != null || this.OooO0o0 != null) : this.OooO0o == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.OooO0o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.OooO0o);
        }
        this.OooO0o = drawable;
        boolean z = this.OooO0oO;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.OooO0o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.OooO0Oo != null || this.OooO0o0 != null) : this.OooO0o == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.OooO0o0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.OooO0o0);
        }
        this.OooO0o0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.OooO0oo && this.OooO0o0 != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.OooO0oO ? !(this.OooO0Oo != null || this.OooO0o0 != null) : this.OooO0o == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.OooO00o = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.OooO0Oo;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.OooO0o0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.OooO0o;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.OooO0Oo;
        boolean z = this.OooO0oO;
        return (drawable == drawable2 && !z) || (drawable == this.OooO0o0 && this.OooO0oo) || ((drawable == this.OooO0o && z) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC1194oOoOO0o abstractC1194oOoOO0o) {
    }
}


