package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC1449oo0O000;
import com.ninja.engine.AbstractC1452oo0O000o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractC1513oo0Oo;
import com.ninja.engine.C0097o000o000;
import com.ninja.engine.C0200o00o0O;
import com.ninja.engine.C0227o00oO0O;
import com.ninja.engine.C0229o00oO0o;
import com.ninja.engine.C0724oO00OooO;
import com.ninja.engine.C1332oOooo0o0;
import com.ninja.engine.C1339oOoooOO0;
import com.ninja.engine.C1471oo0O0Ooo;
import com.ninja.engine.C1511oo0OOoo0;
import com.ninja.engine.C1523oo0Oo0o0;
import com.ninja.engine.C1524oo0Oo0oO;
import com.ninja.engine.C1525oo0Oo0oo;
import com.ninja.engine.C1533oo0OoOOo;
import com.ninja.engine.C1536oo0OoOoO;
import com.ninja.engine.InterfaceC0356o0OOO0o0;
import com.ninja.engine.InterfaceC0357o0OOO0oO;
import com.ninja.engine.InterfaceC0928oOO0OO0o;
import com.ninja.engine.InterfaceC1372oo000o;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.R;
import com.ninja.engine.RunnableC0272o00ooo;
import com.ninja.engine.o000000;
import com.ninja.engine.oOO0OO;
import com.ninja.engine.oOO0OOO;
import java.util.WeakHashMap;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0356o0OOO0o0, InterfaceC0928oOO0OO0o, oOO0OO {
    public static final int[] OooOoo = {R.attr.actionBarSize, 16842841};
    public static final C1536oo0OoOoO OooOooO;
    public static final Rect OooOooo;
    public boolean OooO;
    public int OooO00o;
    public int OooO0O0;
    public ContentFrameLayout OooO0OO;
    public ActionBarContainer OooO0Oo;
    public Drawable OooO0o;
    public InterfaceC0357o0OOO0oO OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public boolean OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public final Rect OooOOO;
    public final Rect OooOOO0;
    public final Rect OooOOOO;
    public final Rect OooOOOo;
    public C1536oo0OoOoO OooOOo;
    public C1536oo0OoOoO OooOOo0;
    public C1536oo0OoOoO OooOOoo;
    public final C0200o00o0O OooOo;
    public InterfaceC1372oo000o OooOo0;
    public C1536oo0OoOoO OooOo00;
    public OverScroller OooOo0O;
    public ViewPropertyAnimator OooOo0o;
    public final RunnableC0272o00ooo OooOoO;
    public final RunnableC0272o00ooo OooOoO0;
    public final oOO0OOO OooOoOO;
    public final C0227o00oO0O OooOoo0;

    static {
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c1523oo0Oo0o0 = new C1525oo0Oo0oo();
        } else if (i >= 29) {
            c1523oo0Oo0o0 = new C1524oo0Oo0oO();
        } else {
            c1523oo0Oo0o0 = new C1523oo0Oo0o0();
        }
        c1523oo0Oo0o0.OooO0oO(C0724oO00OooO.OooO0O0(0, 1, 0, 1));
        OooOooO = c1523oo0Oo0o0.OooO0O0();
        OooOooo = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.view.View, com.ninja.engine.o00oO0O] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0O0 = 0;
        this.OooOOO0 = new Rect();
        this.OooOOO = new Rect();
        this.OooOOOO = new Rect();
        this.OooOOOo = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C1536oo0OoOoO c1536oo0OoOoO = C1536oo0OoOoO.OooO0O0;
        this.OooOOo0 = c1536oo0OoOoO;
        this.OooOOo = c1536oo0OoOoO;
        this.OooOOoo = c1536oo0OoOoO;
        this.OooOo00 = c1536oo0OoOoO;
        this.OooOo = new C0200o00o0O(0, this);
        this.OooOoO0 = new RunnableC0272o00ooo(this, 0);
        this.OooOoO = new RunnableC0272o00ooo(this, 1);
        OooO(context);
        this.OooOoOO = new Object();
        View view = new View(context);
        view.setWillNotDraw(true);
        this.OooOoo0 = view;
        addView(view);
    }

    public static boolean OooO0oO(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        C0229o00oO0o c0229o00oO0o = (C0229o00oO0o) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0229o00oO0o).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) c0229o00oO0o).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) c0229o00oO0o).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0229o00oO0o).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0229o00oO0o).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0229o00oO0o).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) c0229o00oO0o).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) c0229o00oO0o).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void OooO(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(OooOoo);
        this.OooO00o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.OooO0o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.OooOo0O = new OverScroller(context);
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO00o(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0O0(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0OO(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // com.ninja.engine.oOO0OO
    public final void OooO0Oo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooO0o0(view, i, i2, i3, i4, i5);
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final boolean OooO0o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0o0(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void OooO0oo() {
        removeCallbacks(this.OooOoO0);
        removeCallbacks(this.OooOoO);
        ViewPropertyAnimator viewPropertyAnimator = this.OooOo0o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void OooOO0(int i) {
        OooOO0O();
        if (i == 2 || i == 5) {
            this.OooO0o0.getClass();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    public final void OooOO0O() {
        InterfaceC0357o0OOO0oO wrapper;
        if (this.OooO0OO == null) {
            this.OooO0OO = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.OooO0Oo = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0357o0OOO0oO) {
                wrapper = (InterfaceC0357o0OOO0oO) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.OooO0o0 = wrapper;
        }
    }

    public final void OooOO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo, C0097o000o000 c0097o000o000) {
        OooOO0O();
        C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooO0o0;
        o000000 o000000Var = c1339oOoooOO0.OooOOO0;
        Toolbar toolbar = c1339oOoooOO0.OooO00o;
        if (o000000Var == null) {
            o000000 o000000Var2 = new o000000(toolbar.getContext());
            c1339oOoooOO0.OooOOO0 = o000000Var2;
            o000000Var2.OooO = R.id.action_menu_presenter;
        }
        o000000 o000000Var3 = c1339oOoooOO0.OooOOO0;
        o000000Var3.OooO0o0 = c0097o000o000;
        if (menuC0887oO0oo0oo != null || toolbar.OooO00o != null) {
            toolbar.OooO0o();
            MenuC0887oO0oo0oo menuC0887oO0oo0oo2 = toolbar.OooO00o.OooOOOo;
            if (menuC0887oO0oo0oo2 != menuC0887oO0oo0oo) {
                if (menuC0887oO0oo0oo2 != null) {
                    menuC0887oO0oo0oo2.OooOOo(toolbar.Oooo0OO);
                    menuC0887oO0oo0oo2.OooOOo(toolbar.Oooo0o0);
                }
                if (toolbar.Oooo0o0 == null) {
                    toolbar.Oooo0o0 = new C1332oOooo0o0(toolbar);
                }
                o000000Var3.OooOOo = true;
                if (menuC0887oO0oo0oo != null) {
                    menuC0887oO0oo0oo.OooO0O0(o000000Var3, toolbar.OooOO0);
                    menuC0887oO0oo0oo.OooO0O0(toolbar.Oooo0o0, toolbar.OooOO0);
                } else {
                    o000000Var3.OooO0o0(toolbar.OooOO0, null);
                    toolbar.Oooo0o0.OooO0o0(toolbar.OooOO0, null);
                    o000000Var3.OooO(true);
                    toolbar.Oooo0o0.OooO(true);
                }
                toolbar.OooO00o.setPopupTheme(toolbar.OooOO0O);
                toolbar.OooO00o.setPresenter(o000000Var3);
                toolbar.Oooo0OO = o000000Var3;
                toolbar.OooOo0();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0229o00oO0o;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.OooO0o != null) {
            if (this.OooO0Oo.getVisibility() == 0) {
                i = (int) (this.OooO0Oo.getTranslationY() + this.OooO0Oo.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.OooO0o.setBounds(0, i, getWidth(), this.OooO0o.getIntrinsicHeight() + i);
            this.OooO0o.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.OooO0Oo;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        oOO0OOO ooo0ooo = this.OooOoOO;
        return ooo0ooo.OooO0O0 | ooo0ooo.OooO00o;
    }

    public CharSequence getTitle() {
        OooOO0O();
        return ((C1339oOoooOO0) this.OooO0o0).OooO00o.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        OooOO0O();
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(this, windowInsets);
        boolean OooO0oO2 = OooO0oO(this.OooO0Oo, new Rect(OooO0oO.OooO0O0(), OooO0oO.OooO0Oo(), OooO0oO.OooO0OO(), OooO0oO.OooO00o()), false);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        Rect rect = this.OooOOO0;
        AbstractC1452oo0O000o.OooO0O0(this, OooO0oO, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        C1533oo0OoOOo c1533oo0OoOOo = OooO0oO.OooO00o;
        C1536oo0OoOoO OooOO0o = c1533oo0OoOOo.OooOO0o(i, i2, i3, i4);
        this.OooOOo0 = OooOO0o;
        boolean z = true;
        if (!this.OooOOo.equals(OooOO0o)) {
            this.OooOOo = this.OooOOo0;
            OooO0oO2 = true;
        }
        Rect rect2 = this.OooOOO;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = OooO0oO2;
        }
        if (z) {
            requestLayout();
        }
        return c1533oo0OoOOo.OooO00o().OooO00o.OooO0OO().OooO00o.OooO0O0().OooO0o();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooO(getContext());
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        AbstractC1449oo0O000.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0229o00oO0o c0229o00oO0o = (C0229o00oO0o) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0229o00oO0o).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0229o00oO0o).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (this.OooO && z) {
            this.OooOo0O.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.OooOo0O.getFinalY() > this.OooO0Oo.getHeight()) {
                OooO0oo();
                this.OooOoO.run();
            } else {
                OooO0oo();
                this.OooOoO0.run();
            }
            this.OooOO0 = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.OooOO0O + i2;
        this.OooOO0O = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C1511oo0OOoo0 c1511oo0OOoo0;
        C1471oo0O0Ooo c1471oo0O0Ooo;
        this.OooOoOO.OooO00o = i;
        this.OooOO0O = getActionBarHideOffset();
        OooO0oo();
        InterfaceC1372oo000o interfaceC1372oo000o = this.OooOo0;
        if (interfaceC1372oo000o != null && (c1471oo0O0Ooo = (c1511oo0OOoo0 = (C1511oo0OOoo0) interfaceC1372oo000o).Oooo0o0) != null) {
            c1471oo0O0Ooo.OooO00o();
            c1511oo0OOoo0.Oooo0o0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.OooO0Oo.getVisibility() != 0) {
            return false;
        }
        return this.OooO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.OooO && !this.OooOO0) {
            if (this.OooOO0O <= this.OooO0Oo.getHeight()) {
                OooO0oo();
                postDelayed(this.OooOoO0, 600L);
                return;
            }
            OooO0oo();
            postDelayed(this.OooOoO, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        OooOO0O();
        int i2 = this.OooOO0o ^ i;
        this.OooOO0o = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC1372oo000o interfaceC1372oo000o = this.OooOo0;
        if (interfaceC1372oo000o != null) {
            ((C1511oo0OOoo0) interfaceC1372oo000o).Oooo00o = !z2;
            if (!z && z2) {
                C1511oo0OOoo0 c1511oo0OOoo0 = (C1511oo0OOoo0) interfaceC1372oo000o;
                if (!c1511oo0OOoo0.Oooo0) {
                    c1511oo0OOoo0.Oooo0 = true;
                    c1511oo0OOoo0.OoooOoo(true);
                }
            } else {
                C1511oo0OOoo0 c1511oo0OOoo02 = (C1511oo0OOoo0) interfaceC1372oo000o;
                if (c1511oo0OOoo02.Oooo0) {
                    c1511oo0OOoo02.Oooo0 = false;
                    c1511oo0OOoo02.OoooOoo(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.OooOo0 != null) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            AbstractC1449oo0O000.OooO0OO(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.OooO0O0 = i;
        InterfaceC1372oo000o interfaceC1372oo000o = this.OooOo0;
        if (interfaceC1372oo000o != null) {
            ((C1511oo0OOoo0) interfaceC1372oo000o).Oooo00O = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        OooO0oo();
        this.OooO0Oo.setTranslationY(-Math.max(0, Math.min(i, this.OooO0Oo.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1372oo000o interfaceC1372oo000o) {
        this.OooOo0 = interfaceC1372oo000o;
        if (getWindowToken() != null) {
            ((C1511oo0OOoo0) this.OooOo0).Oooo00O = this.OooO0O0;
            int i = this.OooOO0o;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                AbstractC1449oo0O000.OooO0OO(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.OooO0oo = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.OooO) {
            this.OooO = z;
            if (z) {
                return;
            }
            OooO0oo();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        OooOO0O();
        C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooO0o0;
        c1339oOoooOO0.OooO0Oo = i != 0 ? AbstractC0692o0ooooOo.OooOo0(c1339oOoooOO0.OooO00o.getContext(), i) : null;
        c1339oOoooOO0.OooO0OO();
    }

    public void setLogo(int i) {
        Drawable drawable;
        OooOO0O();
        C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooO0o0;
        if (i != 0) {
            drawable = AbstractC0692o0ooooOo.OooOo0(c1339oOoooOO0.OooO00o.getContext(), i);
        } else {
            drawable = null;
        }
        c1339oOoooOO0.OooO0o0 = drawable;
        c1339oOoooOO0.OooO0OO();
    }

    public void setOverlayMode(boolean z) {
        this.OooO0oO = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // com.ninja.engine.InterfaceC0356o0OOO0o0
    public void setWindowCallback(Window.Callback callback) {
        OooOO0O();
        ((C1339oOoooOO0) this.OooO0o0).OooOO0O = callback;
    }

    @Override // com.ninja.engine.InterfaceC0356o0OOO0o0
    public void setWindowTitle(CharSequence charSequence) {
        OooOO0O();
        C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooO0o0;
        if (!c1339oOoooOO0.OooO0oO) {
            c1339oOoooOO0.OooO0oo = charSequence;
            if ((c1339oOoooOO0.OooO0O0 & 8) != 0) {
                Toolbar toolbar = c1339oOoooOO0.OooO00o;
                toolbar.setTitle(charSequence);
                if (c1339oOoooOO0.OooO0oO) {
                    AbstractC1460oo0O00oo.OooOOo0(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        OooOO0O();
        C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooO0o0;
        c1339oOoooOO0.OooO0Oo = drawable;
        c1339oOoooOO0.OooO0OO();
    }
}
