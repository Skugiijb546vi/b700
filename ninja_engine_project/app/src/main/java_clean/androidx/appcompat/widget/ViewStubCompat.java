package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ninja.engine.AbstractC1039oOOOoo0o;
import com.ninja.engine.InterfaceC1475oo0O0o0O;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int OooO00o;
    public int OooO0O0;
    public WeakReference OooO0OO;
    public LayoutInflater OooO0Oo;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.OooO00o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooOoO, 0, 0);
        this.OooO0O0 = obtainStyledAttributes.getResourceId(2, -1);
        this.OooO00o = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View OooO00o() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.OooO00o != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.OooO0Oo;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.OooO00o, viewGroup, false);
                int i = this.OooO0O0;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.OooO0OO = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.OooO0O0;
    }

    public LayoutInflater getLayoutInflater() {
        return this.OooO0Oo;
    }

    public int getLayoutResource() {
        return this.OooO00o;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.OooO0O0 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.OooO0Oo = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.OooO00o = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.OooO0OO;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            OooO00o();
        }
    }

    public void setOnInflateListener(InterfaceC1475oo0O0o0O interfaceC1475oo0O0o0O) {
    }
}


