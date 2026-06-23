package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1034oOOOoOoO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1449oo0O000;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0;
import com.ninja.engine.C0172o00OoOo;
import com.ninja.engine.C0589o0oOoOO0;
import com.ninja.engine.C0596o0oOoo;
import com.ninja.engine.C0606o0oOoooO;
import com.ninja.engine.C1536oo0OoOoO;
import com.ninja.engine.R;
import com.ninja.engine.o000OO00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList OooO00o;
    public final ArrayList OooO0O0;
    public View.OnApplyWindowInsetsListener OooO0OO;
    public boolean OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        this.OooO00o = new ArrayList();
        this.OooO0O0 = new ArrayList();
        this.OooO0Oo = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1034oOOOoOoO.OooO0O0, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void OooO00o(View view) {
        if (this.OooO0O0.contains(view)) {
            this.OooO00o.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0;
        AbstractC0809oO0OooOO.OooOOOo(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof AbstractComponentCallbacksC0593o0oOoOo0) {
            abstractComponentCallbacksC0593o0oOoOo0 = (AbstractComponentCallbacksC0593o0oOoOo0) tag;
        } else {
            abstractComponentCallbacksC0593o0oOoOo0 = null;
        }
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1536oo0OoOoO c1536oo0OoOoO;
        AbstractC0809oO0OooOO.OooOOOo(windowInsets, "insets");
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.OooO0OO;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC0809oO0OooOO.OooOOOO(onApplyWindowInsets, "onApplyWindowInsetsListeâ€¦lyWindowInsets(v, insets)");
            c1536oo0OoOoO = C1536oo0OoOoO.OooO0oO(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            WindowInsets OooO0o = OooO0oO.OooO0o();
            if (OooO0o != null) {
                WindowInsets OooO0O0 = AbstractC1449oo0O000.OooO0O0(this, OooO0o);
                if (!OooO0O0.equals(OooO0o)) {
                    OooO0oO = C1536oo0OoOoO.OooO0oO(this, OooO0O0);
                }
            }
            c1536oo0OoOoO = OooO0oO;
        }
        if (!c1536oo0OoOoO.OooO00o.OooOOO0()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
                WindowInsets OooO0o2 = c1536oo0OoOoO.OooO0o();
                if (OooO0o2 != null) {
                    WindowInsets OooO00o = AbstractC1449oo0O000.OooO00o(childAt, OooO0o2);
                    if (!OooO00o.equals(OooO0o2)) {
                        C1536oo0OoOoO.OooO0oO(childAt, OooO00o);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC0809oO0OooOO.OooOOOo(canvas, "canvas");
        if (this.OooO0Oo) {
            for (View view : this.OooO00o) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0809oO0OooOO.OooOOOo(canvas, "canvas");
        AbstractC0809oO0OooOO.OooOOOo(view, "child");
        if (this.OooO0Oo) {
            ArrayList arrayList = this.OooO00o;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        this.OooO0O0.remove(view);
        if (this.OooO00o.remove(view)) {
            this.OooO0Oo = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends AbstractComponentCallbacksC0593o0oOoOo0> F getFragment() {
        o000OO00 o000oo00;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0;
        C0606o0oOoooO OooOo00;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            o000oo00 = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof AbstractComponentCallbacksC0593o0oOoOo0) {
                    abstractComponentCallbacksC0593o0oOoOo0 = (AbstractComponentCallbacksC0593o0oOoOo0) tag;
                } else {
                    abstractComponentCallbacksC0593o0oOoOo0 = null;
                }
                if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                abstractComponentCallbacksC0593o0oOoOo0 = null;
                break;
            }
        }
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOOOo()) {
                OooOo00 = abstractComponentCallbacksC0593o0oOoOo0.OooO0oo();
            } else {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0593o0oOoOo0 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof o000OO00) {
                    o000oo00 = (o000OO00) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (o000oo00 != null) {
                OooOo00 = o000oo00.OooOo00();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) OooOo00.OooOoOO(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC0809oO0OooOO.OooOOOo(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            AbstractC0809oO0OooOO.OooOOOO(childAt, "view");
            OooO00o(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        OooO00o(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC0809oO0OooOO.OooOOOO(childAt, "view");
        OooO00o(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        OooO00o(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0809oO0OooOO.OooOOOO(childAt, "view");
            OooO00o(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            AbstractC0809oO0OooOO.OooOOOO(childAt, "view");
            OooO00o(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.OooO0Oo = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC0809oO0OooOO.OooOOOo(onApplyWindowInsetsListener, "listener");
        this.OooO0OO = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC0809oO0OooOO.OooOOOo(view, "view");
        if (view.getParent() == this) {
            this.OooO0O0.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C0606o0oOoooO c0606o0oOoooO) {
        super(context, attributeSet);
        View view;
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        AbstractC0809oO0OooOO.OooOOOo(attributeSet, "attrs");
        AbstractC0809oO0OooOO.OooOOOo(c0606o0oOoooO, "fm");
        this.OooO00o = new ArrayList();
        this.OooO0O0 = new ArrayList();
        this.OooO0Oo = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1034oOOOoOoO.OooO0O0, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0593o0oOoOo0 OooOoOO = c0606o0oOoooO.OooOoOO(id);
        if (classAttribute != null && OooOoOO == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC1230oOoOo0o.OooO0oo("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0596o0oOoo OooOoo = c0606o0oOoooO.OooOoo();
            context.getClassLoader();
            AbstractComponentCallbacksC0593o0oOoOo0 OooO00o = OooOoo.OooO00o(classAttribute);
            AbstractC0809oO0OooOO.OooOOOO(OooO00o, "fm.fragmentFactory.instaâ€¦ontext.classLoader, name)");
            OooO00o.OooOoo = true;
            C0589o0oOoOO0 c0589o0oOoOO0 = OooO00o.OooOOoo;
            if ((c0589o0oOoOO0 == null ? null : c0589o0oOoOO0.Oooo000) != null) {
                OooO00o.OooOoo = true;
            }
            C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(c0606o0oOoooO);
            c0172o00OoOo.OooOOOO = true;
            OooO00o.OooOooO = this;
            c0172o00OoOo.OooO0o0(getId(), OooO00o, string, 1);
            if (!c0172o00OoOo.OooO0oO) {
                c0172o00OoOo.OooOOOo.OooOoO0(c0172o00OoOo, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = c0606o0oOoooO.OooO0OO.OooOOo0().iterator();
        while (it.hasNext()) {
            OooO00o oooO00o = (OooO00o) it.next();
            AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = oooO00o.OooO0OO;
            if (abstractComponentCallbacksC0593o0oOoOo0.OooOo0o == getId() && (view = abstractComponentCallbacksC0593o0oOoOo0.OooOooo) != null && view.getParent() == null) {
                abstractComponentCallbacksC0593o0oOoOo0.OooOooO = this;
                oooO00o.OooO0O0();
            }
        }
    }
}


