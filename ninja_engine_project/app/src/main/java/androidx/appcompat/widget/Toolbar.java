package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ninja.engine.AbstractC0018OooOOo0;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC1039oOOOoo0o;
import com.ninja.engine.AbstractC1137oOOoooO;
import com.ninja.engine.AbstractC1329oOooo0OO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractC1479oo0O0oOo;
import com.ninja.engine.C0115o000ooO;
import com.ninja.engine.C0119o000ooo0;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0599o0oOoo0O;
import com.ninja.engine.C0892oO0ooO0o;
import com.ninja.engine.C1151oOo000o;
import com.ninja.engine.C1271oOoo0OOO;
import com.ninja.engine.C1275oOoo0OoO;
import com.ninja.engine.C1332oOooo0o0;
import com.ninja.engine.C1336oOoooO00;
import com.ninja.engine.C1337oOoooO0O;
import com.ninja.engine.C1339oOoooOO0;
import com.ninja.engine.C1589oo0oOO0;
import com.ninja.engine.InterfaceC0357o0OOO0oO;
import com.ninja.engine.InterfaceC0890oO0ooO00;
import com.ninja.engine.InterfaceC1335oOoooO0;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.R;
import com.ninja.engine.RunnableC1327oOooo0O;
import com.ninja.engine.View$OnClickListenerC0176o00Ooo;
import com.ninja.engine.View$OnClickListenerC0856oO0oOOO;
import com.ninja.engine.o000000;
import com.ninja.engine.o00000OO;
import com.ninja.engine.o00O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0890oO0ooO00 {
    public View OooO;
    public ActionMenuView OooO00o;
    public C1589oo0oOO0 OooO0O0;
    public C1589oo0oOO0 OooO0OO;
    public C0115o000ooO OooO0Oo;
    public final Drawable OooO0o;
    public C0119o000ooo0 OooO0o0;
    public final CharSequence OooO0oO;
    public C0115o000ooO OooO0oo;
    public Context OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public final int OooOOO;
    public int OooOOO0;
    public final int OooOOOO;
    public int OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public int OooOOoo;
    public CharSequence OooOo;
    public int OooOo0;
    public C1151oOo000o OooOo00;
    public int OooOo0O;
    public final int OooOo0o;
    public ColorStateList OooOoO;
    public CharSequence OooOoO0;
    public ColorStateList OooOoOO;
    public boolean OooOoo;
    public boolean OooOoo0;
    public final ArrayList OooOooO;
    public final ArrayList OooOooo;
    public boolean Oooo;
    public final o00O Oooo0;
    public final int[] Oooo000;
    public final C0131o00O0o Oooo00O;
    public ArrayList Oooo00o;
    public C1339oOoooOO0 Oooo0O0;
    public o000000 Oooo0OO;
    public boolean Oooo0o;
    public C1332oOooo0o0 Oooo0o0;
    public OnBackInvokedCallback Oooo0oO;
    public OnBackInvokedDispatcher Oooo0oo;
    public final o00000OO OoooO00;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static C1336oOoooO00 OooO(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof C1336oOoooO00;
        if (z) {
            C1336oOoooO00 c1336oOoooO00 = (C1336oOoooO00) layoutParams;
            C1336oOoooO00 c1336oOoooO002 = new C1336oOoooO00(c1336oOoooO00);
            c1336oOoooO002.OooO0O0 = 0;
            c1336oOoooO002.OooO0O0 = c1336oOoooO00.OooO0O0;
            return c1336oOoooO002;
        } else if (z) {
            C1336oOoooO00 c1336oOoooO003 = new C1336oOoooO00((C1336oOoooO00) layoutParams);
            c1336oOoooO003.OooO0O0 = 0;
            return c1336oOoooO003;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C1336oOoooO00 c1336oOoooO004 = new C1336oOoooO00(marginLayoutParams);
            c1336oOoooO004.OooO0O0 = 0;
            ((ViewGroup.MarginLayoutParams) c1336oOoooO004).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1336oOoooO004).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1336oOoooO004).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1336oOoooO004).bottomMargin = marginLayoutParams.bottomMargin;
            return c1336oOoooO004;
        } else {
            C1336oOoooO00 c1336oOoooO005 = new C1336oOoooO00(layoutParams);
            c1336oOoooO005.OooO0O0 = 0;
            return c1336oOoooO005;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, com.ninja.engine.oOoooO00] */
    public static C1336oOoooO00 OooO0oo() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.OooO0O0 = 0;
        marginLayoutParams.OooO00o = 8388627;
        return marginLayoutParams;
    }

    public static int OooOO0O(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int OooOO0o(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1271oOoo0OOO(getContext());
    }

    public final void OooO00o(ArrayList arrayList, int i) {
        boolean z;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C1336oOoooO00 c1336oOoooO00 = (C1336oOoooO00) childAt.getLayoutParams();
                if (c1336oOoooO00.OooO0O0 == 0 && OooOo00(childAt)) {
                    int i3 = c1336oOoooO00.OooO00o;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            C1336oOoooO00 c1336oOoooO002 = (C1336oOoooO00) childAt2.getLayoutParams();
            if (c1336oOoooO002.OooO0O0 == 0 && OooOo00(childAt2)) {
                int i5 = c1336oOoooO002.OooO00o;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void OooO0O0(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1336oOoooO00 OooO0oo = layoutParams == null ? OooO0oo() : !checkLayoutParams(layoutParams) ? OooO(layoutParams) : (C1336oOoooO00) layoutParams;
        OooO0oo.OooO0O0 = 1;
        if (!z || this.OooO == null) {
            addView(view, OooO0oo);
            return;
        }
        view.setLayoutParams(OooO0oo);
        this.OooOooo.add(view);
    }

    public final void OooO0OO() {
        if (this.OooO0oo == null) {
            C0115o000ooO c0115o000ooO = new C0115o000ooO(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.OooO0oo = c0115o000ooO;
            c0115o000ooO.setImageDrawable(this.OooO0o);
            this.OooO0oo.setContentDescription(this.OooO0oO);
            C1336oOoooO00 OooO0oo = OooO0oo();
            OooO0oo.OooO00o = (this.OooOOO & 112) | 8388611;
            OooO0oo.OooO0O0 = 2;
            this.OooO0oo.setLayoutParams(OooO0oo);
            this.OooO0oo.setOnClickListener(new View$OnClickListenerC0176o00Ooo(4, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ninja.engine.oOo000o] */
    public final void OooO0Oo() {
        if (this.OooOo00 == null) {
            Object obj = new Object();
            obj.OooO00o = 0;
            obj.OooO0O0 = 0;
            obj.OooO0OO = Integer.MIN_VALUE;
            obj.OooO0Oo = Integer.MIN_VALUE;
            obj.OooO0o0 = 0;
            obj.OooO0o = 0;
            obj.OooO0oO = false;
            obj.OooO0oo = false;
            this.OooOo00 = obj;
        }
    }

    public final void OooO0o() {
        if (this.OooO00o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.OooO00o = actionMenuView;
            actionMenuView.setPopupTheme(this.OooOO0O);
            this.OooO00o.setOnMenuItemClickListener(this.Oooo0);
            ActionMenuView actionMenuView2 = this.OooO00o;
            C1275oOoo0OoO c1275oOoo0OoO = new C1275oOoo0OoO(this);
            actionMenuView2.OooOo0 = null;
            actionMenuView2.OooOo0O = c1275oOoo0OoO;
            C1336oOoooO00 OooO0oo = OooO0oo();
            OooO0oo.OooO00o = (this.OooOOO & 112) | 8388613;
            this.OooO00o.setLayoutParams(OooO0oo);
            OooO0O0(this.OooO00o, false);
        }
    }

    public final void OooO0o0() {
        OooO0o();
        ActionMenuView actionMenuView = this.OooO00o;
        if (actionMenuView.OooOOOo == null) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = (MenuC0887oO0oo0oo) actionMenuView.getMenu();
            if (this.Oooo0o0 == null) {
                this.Oooo0o0 = new C1332oOooo0o0(this);
            }
            this.OooO00o.setExpandedActionViewsExclusive(true);
            menuC0887oO0oo0oo.OooO0O0(this.Oooo0o0, this.OooOO0);
            OooOo0();
        }
    }

    public final void OooO0oO() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new C0115o000ooO(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1336oOoooO00 OooO0oo = OooO0oo();
            OooO0oo.OooO00o = (this.OooOOO & 112) | 8388611;
            this.OooO0Oo.setLayoutParams(OooO0oo);
        }
    }

    public final int OooOO0(View view, int i) {
        int i2;
        C1336oOoooO00 c1336oOoooO00 = (C1336oOoooO00) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = c1336oOoooO00.OooO00o & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.OooOo0o & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) c1336oOoooO00).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) c1336oOoooO00).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1336oOoooO00).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public final void OooOOO() {
        Iterator it = this.Oooo00o.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.Oooo00O.OooO0Oo).iterator();
        while (it2.hasNext()) {
            ((C0599o0oOoo0O) it2.next()).OooO00o.OooOO0();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.Oooo00o = currentMenuItems2;
    }

    public void OooOOO0(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final boolean OooOOOO(View view) {
        return view.getParent() == this || this.OooOooo.contains(view);
    }

    public final int OooOOOo(View view, int i, int i2, int[] iArr) {
        C1336oOoooO00 c1336oOoooO00 = (C1336oOoooO00) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1336oOoooO00).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int OooOO0 = OooOO0(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, OooOO0, max + measuredWidth, view.getMeasuredHeight() + OooOO0);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1336oOoooO00).rightMargin + max;
    }

    public final int OooOOo(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int OooOOo0(View view, int i, int i2, int[] iArr) {
        C1336oOoooO00 c1336oOoooO00 = (C1336oOoooO00) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1336oOoooO00).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int OooOO0 = OooOO0(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, OooOO0, max, view.getMeasuredHeight() + OooOO0);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1336oOoooO00).leftMargin);
    }

    public final void OooOOoo(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void OooOo0() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher OooO00o = AbstractC1329oOooo0OO.OooO00o(this);
            C1332oOooo0o0 c1332oOooo0o0 = this.Oooo0o0;
            if (c1332oOooo0o0 != null && c1332oOooo0o0.OooO0O0 != null && OooO00o != null && isAttachedToWindow() && this.Oooo) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.Oooo0oo == null) {
                if (this.Oooo0oO == null) {
                    this.Oooo0oO = AbstractC1329oOooo0OO.OooO0O0(new RunnableC1327oOooo0O(this, 0));
                }
                AbstractC1329oOooo0OO.OooO0OO(OooO00o, this.Oooo0oO);
            } else if (!z && (onBackInvokedDispatcher = this.Oooo0oo) != null) {
                AbstractC1329oOooo0OO.OooO0Oo(onBackInvokedDispatcher, this.Oooo0oO);
                OooO00o = null;
            } else {
                return;
            }
            this.Oooo0oo = OooO00o;
        }
    }

    public final boolean OooOo00(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1336oOoooO00);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return OooO0oo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, com.ninja.engine.oOoooO00] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.OooO00o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooO0O0);
        marginLayoutParams.OooO00o = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.OooO0O0 = 0;
        return marginLayoutParams;
    }

    public CharSequence getCollapseContentDescription() {
        C0115o000ooO c0115o000ooO = this.OooO0oo;
        if (c0115o000ooO != null) {
            return c0115o000ooO.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0115o000ooO c0115o000ooO = this.OooO0oo;
        if (c0115o000ooO != null) {
            return c0115o000ooO.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1151oOo000o c1151oOo000o = this.OooOo00;
        if (c1151oOo000o != null) {
            if (c1151oOo000o.OooO0oO) {
                return c1151oOo000o.OooO00o;
            }
            return c1151oOo000o.OooO0O0;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.OooOo0O;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1151oOo000o c1151oOo000o = this.OooOo00;
        if (c1151oOo000o != null) {
            return c1151oOo000o.OooO00o;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1151oOo000o c1151oOo000o = this.OooOo00;
        if (c1151oOo000o != null) {
            return c1151oOo000o.OooO0O0;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1151oOo000o c1151oOo000o = this.OooOo00;
        if (c1151oOo000o != null) {
            if (c1151oOo000o.OooO0oO) {
                return c1151oOo000o.OooO0O0;
            }
            return c1151oOo000o.OooO00o;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.OooOo0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo;
        ActionMenuView actionMenuView = this.OooO00o;
        if (actionMenuView != null && (menuC0887oO0oo0oo = actionMenuView.OooOOOo) != null && menuC0887oO0oo0oo.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.OooOo0O, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.OooOo0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0119o000ooo0 c0119o000ooo0 = this.OooO0o0;
        if (c0119o000ooo0 != null) {
            return c0119o000ooo0.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0119o000ooo0 c0119o000ooo0 = this.OooO0o0;
        if (c0119o000ooo0 != null) {
            return c0119o000ooo0.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        OooO0o0();
        return this.OooO00o.getMenu();
    }

    public View getNavButtonView() {
        return this.OooO0Oo;
    }

    public CharSequence getNavigationContentDescription() {
        C0115o000ooO c0115o000ooO = this.OooO0Oo;
        if (c0115o000ooO != null) {
            return c0115o000ooO.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0115o000ooO c0115o000ooO = this.OooO0Oo;
        if (c0115o000ooO != null) {
            return c0115o000ooO.getDrawable();
        }
        return null;
    }

    public o000000 getOuterActionMenuPresenter() {
        return this.Oooo0OO;
    }

    public Drawable getOverflowIcon() {
        OooO0o0();
        return this.OooO00o.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.OooOO0;
    }

    public int getPopupTheme() {
        return this.OooOO0O;
    }

    public CharSequence getSubtitle() {
        return this.OooOoO0;
    }

    public final TextView getSubtitleTextView() {
        return this.OooO0OO;
    }

    public CharSequence getTitle() {
        return this.OooOo;
    }

    public int getTitleMarginBottom() {
        return this.OooOOoo;
    }

    public int getTitleMarginEnd() {
        return this.OooOOo0;
    }

    public int getTitleMarginStart() {
        return this.OooOOOo;
    }

    public int getTitleMarginTop() {
        return this.OooOOo;
    }

    public final TextView getTitleTextView() {
        return this.OooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ninja.engine.oOoooOO0] */
    public InterfaceC0357o0OOO0oO getWrapper() {
        boolean z;
        Drawable drawable;
        if (this.Oooo0O0 == null) {
            Object obj = new Object();
            obj.OooOOO = 0;
            obj.OooO00o = this;
            obj.OooO0oo = getTitle();
            obj.OooO = getSubtitle();
            if (obj.OooO0oo != null) {
                z = true;
            } else {
                z = false;
            }
            obj.OooO0oO = z;
            obj.OooO0o = getNavigationIcon();
            String str = null;
            C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(getContext(), null, AbstractC1039oOOOoo0o.OooO00o, R.attr.actionBarStyle, 0);
            obj.OooOOOO = Oooo0O0.OooOo0o(15);
            TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.OooO0oO = true;
                obj.OooO0oo = text;
                if ((obj.OooO0O0 & 8) != 0) {
                    Toolbar toolbar = obj.OooO00o;
                    toolbar.setTitle(text);
                    if (obj.OooO0oO) {
                        AbstractC1460oo0O00oo.OooOOo0(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.OooO = text2;
                if ((obj.OooO0O0 & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable OooOo0o = Oooo0O0.OooOo0o(20);
            if (OooOo0o != null) {
                obj.OooO0o0 = OooOo0o;
                obj.OooO0OO();
            }
            Drawable OooOo0o2 = Oooo0O0.OooOo0o(17);
            if (OooOo0o2 != null) {
                obj.OooO0Oo = OooOo0o2;
                obj.OooO0OO();
            }
            if (obj.OooO0o == null && (drawable = obj.OooOOOO) != null) {
                obj.OooO0o = drawable;
                int i = obj.OooO0O0 & 4;
                Toolbar toolbar2 = obj.OooO00o;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.OooO00o(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.OooO0OO;
                if (view != null && (obj.OooO0O0 & 16) != 0) {
                    removeView(view);
                }
                obj.OooO0OO = inflate;
                if (inflate != null && (obj.OooO0O0 & 16) != 0) {
                    addView(inflate);
                }
                obj.OooO00o(obj.OooO0O0 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                OooO0Oo();
                this.OooOo00.OooO00o(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.OooOO0o = resourceId2;
                C1589oo0oOO0 c1589oo0oOO0 = this.OooO0O0;
                if (c1589oo0oOO0 != null) {
                    c1589oo0oOO0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.OooOOO0 = resourceId3;
                C1589oo0oOO0 c1589oo0oOO02 = this.OooO0OO;
                if (c1589oo0oOO02 != null) {
                    c1589oo0oOO02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            Oooo0O0.Oooo0o0();
            if (R.string.abc_action_bar_up_description != obj.OooOOO) {
                obj.OooOOO = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i2 = obj.OooOOO;
                    if (i2 != 0) {
                        str = getContext().getString(i2);
                    }
                    obj.OooOO0 = str;
                    obj.OooO0O0();
                }
            }
            obj.OooOO0 = getNavigationContentDescription();
            setNavigationOnClickListener(new View$OnClickListenerC0856oO0oOOO(obj));
            this.Oooo0O0 = obj;
        }
        return this.Oooo0O0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOo0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.OoooO00);
        OooOo0();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.OooOoo = false;
        }
        if (!this.OooOoo) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.OooOoo = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.OooOoo = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x028e A[LOOP:0: B:110:0x028c->B:111:0x028e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ab A[LOOP:1: B:113:0x02a9->B:114:0x02ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c9 A[LOOP:2: B:116:0x02c7->B:117:0x02c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0317 A[LOOP:3: B:125:0x0315->B:126:0x0317, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0217  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = AbstractC1479oo0O0oOo.OooO00o;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (OooOo00(this.OooO0Oo)) {
            OooOOoo(this.OooO0Oo, i, 0, i2, this.OooOOOO);
            i3 = OooOO0O(this.OooO0Oo) + this.OooO0Oo.getMeasuredWidth();
            i4 = Math.max(0, OooOO0o(this.OooO0Oo) + this.OooO0Oo.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.OooO0Oo.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (OooOo00(this.OooO0oo)) {
            OooOOoo(this.OooO0oo, i, 0, i2, this.OooOOOO);
            i3 = OooOO0O(this.OooO0oo) + this.OooO0oo.getMeasuredWidth();
            i4 = Math.max(i4, OooOO0o(this.OooO0oo) + this.OooO0oo.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.OooO0oo.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        int[] iArr = this.Oooo000;
        iArr[c] = max2;
        if (OooOo00(this.OooO00o)) {
            OooOOoo(this.OooO00o, i, max, i2, this.OooOOOO);
            i6 = OooOO0O(this.OooO00o) + this.OooO00o.getMeasuredWidth();
            i4 = Math.max(i4, OooOO0o(this.OooO00o) + this.OooO00o.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.OooO00o.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (OooOo00(this.OooO)) {
            max3 += OooOOo(this.OooO, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, OooOO0o(this.OooO) + this.OooO.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.OooO.getMeasuredState());
        }
        if (OooOo00(this.OooO0o0)) {
            max3 += OooOOo(this.OooO0o0, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, OooOO0o(this.OooO0o0) + this.OooO0o0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.OooO0o0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C1336oOoooO00) childAt.getLayoutParams()).OooO0O0 == 0 && OooOo00(childAt)) {
                max3 += OooOOo(childAt, i, max3, i2, 0, iArr);
                i4 = Math.max(i4, OooOO0o(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.OooOOo + this.OooOOoo;
        int i13 = this.OooOOOo + this.OooOOo0;
        if (OooOo00(this.OooO0O0)) {
            OooOOo(this.OooO0O0, i, max3 + i13, i2, i12, iArr);
            int OooOO0O = OooOO0O(this.OooO0O0) + this.OooO0O0.getMeasuredWidth();
            i9 = OooOO0o(this.OooO0O0) + this.OooO0O0.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i5, this.OooO0O0.getMeasuredState());
            i8 = OooOO0O;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (OooOo00(this.OooO0OO)) {
            i8 = Math.max(i8, OooOOo(this.OooO0OO, i, max3 + i13, i2, i9 + i12, iArr));
            i9 = OooOO0o(this.OooO0OO) + this.OooO0OO.getMeasuredHeight() + i9;
            i7 = View.combineMeasuredStates(i7, this.OooO0OO.getMeasuredState());
        }
        int max4 = Math.max(i4, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i8, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (this.Oooo0o) {
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                View childAt2 = getChildAt(i14);
                if (!OooOo00(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo;
        MenuItem findItem;
        if (!(parcelable instanceof C1337oOoooO0O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1337oOoooO0O c1337oOoooO0O = (C1337oOoooO0O) parcelable;
        super.onRestoreInstanceState(c1337oOoooO0O.OooO00o);
        ActionMenuView actionMenuView = this.OooO00o;
        if (actionMenuView != null) {
            menuC0887oO0oo0oo = actionMenuView.OooOOOo;
        } else {
            menuC0887oO0oo0oo = null;
        }
        int i = c1337oOoooO0O.OooO0OO;
        if (i != 0 && this.Oooo0o0 != null && menuC0887oO0oo0oo != null && (findItem = menuC0887oO0oo0oo.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c1337oOoooO0O.OooO0Oo) {
            o00000OO o00000oo = this.OoooO00;
            removeCallbacks(o00000oo);
            post(o00000oo);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        r1 = r0.OooO0o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
        r0.OooO0O0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.OooO0Oo()
            com.ninja.engine.oOo000o r0 = r2.OooOo00
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.OooO0oO
            if (r1 != r3) goto L12
            goto L45
        L12:
            r0.OooO0oO = r1
            boolean r3 = r0.OooO0oo
            if (r3 == 0) goto L3d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2f
            int r1 = r0.OooO0Oo
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.OooO0o0
        L23:
            r0.OooO00o = r1
            int r1 = r0.OooO0OO
            if (r1 == r3) goto L2a
            goto L2c
        L2a:
            int r1 = r0.OooO0o
        L2c:
            r0.OooO0O0 = r1
            goto L45
        L2f:
            int r1 = r0.OooO0OO
            if (r1 == r3) goto L34
            goto L36
        L34:
            int r1 = r0.OooO0o0
        L36:
            r0.OooO00o = r1
            int r1 = r0.OooO0Oo
            if (r1 == r3) goto L2a
            goto L2c
        L3d:
            int r3 = r0.OooO0o0
            r0.OooO00o = r3
            int r3 = r0.OooO0o
            r0.OooO0O0 = r3
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, com.ninja.engine.oOoooO0O, com.ninja.engine.OooOOo0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        o000000 o000000Var;
        C0892oO0ooO0o c0892oO0ooO0o;
        AbstractC0018OooOOo0 abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        C1332oOooo0o0 c1332oOooo0o0 = this.Oooo0o0;
        if (c1332oOooo0o0 != null && (c0892oO0ooO0o = c1332oOooo0o0.OooO0O0) != null) {
            abstractC0018OooOOo0.OooO0OO = c0892oO0ooO0o.OooO00o;
        }
        ActionMenuView actionMenuView = this.OooO00o;
        if (actionMenuView != null && (o000000Var = actionMenuView.OooOo00) != null && o000000Var.OooO0oO()) {
            z = true;
        } else {
            z = false;
        }
        abstractC0018OooOOo0.OooO0Oo = z;
        return abstractC0018OooOOo0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.OooOoo0 = false;
        }
        if (!this.OooOoo0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.OooOoo0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.OooOoo0 = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.Oooo != z) {
            this.Oooo = z;
            OooOo0();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.Oooo0o = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.OooOo0O) {
            this.OooOo0O = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.OooOo0) {
            this.OooOo0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        OooO0oO();
        this.OooO0Oo.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        OooO0o0();
        this.OooO00o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.OooOO0O != i) {
            this.OooOO0O = i;
            if (i == 0) {
                this.OooOO0 = getContext();
            } else {
                this.OooOO0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.OooOOoo = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.OooOOo0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.OooOOOo = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.OooOOo = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.OooOo0o = 8388627;
        this.OooOooO = new ArrayList();
        this.OooOooo = new ArrayList();
        this.Oooo000 = new int[2];
        this.Oooo00O = new C0131o00O0o(new RunnableC1327oOooo0O(this, 1));
        this.Oooo00o = new ArrayList();
        this.Oooo0 = new o00O(24, this);
        this.OoooO00 = new o00000OO(16, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1039oOOOoo0o.OooOo0o;
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        AbstractC1460oo0O00oo.OooOOOO(this, context, iArr, attributeSet, (TypedArray) Oooo0O0.OooO0O0, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
        this.OooOO0o = typedArray.getResourceId(28, 0);
        this.OooOOO0 = typedArray.getResourceId(19, 0);
        this.OooOo0o = typedArray.getInteger(0, 8388627);
        this.OooOOO = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.OooOOoo = dimensionPixelOffset;
        this.OooOOo = dimensionPixelOffset;
        this.OooOOo0 = dimensionPixelOffset;
        this.OooOOOo = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.OooOOOo = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.OooOOo0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.OooOOo = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.OooOOoo = dimensionPixelOffset5;
        }
        this.OooOOOO = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        OooO0Oo();
        C1151oOo000o c1151oOo000o = this.OooOo00;
        c1151oOo000o.OooO0oo = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1151oOo000o.OooO0o0 = dimensionPixelSize;
            c1151oOo000o.OooO00o = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1151oOo000o.OooO0o = dimensionPixelSize2;
            c1151oOo000o.OooO0O0 = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1151oOo000o.OooO00o(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.OooOo0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.OooOo0O = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.OooO0o = Oooo0O0.OooOo0o(4);
        this.OooO0oO = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.OooOO0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable OooOo0o = Oooo0O0.OooOo0o(16);
        if (OooOo0o != null) {
            setNavigationIcon(OooOo0o);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable OooOo0o2 = Oooo0O0.OooOo0o(11);
        if (OooOo0o2 != null) {
            setLogo(OooOo0o2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(Oooo0O0.OooOo0O(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(Oooo0O0.OooOo0O(20));
        }
        if (typedArray.hasValue(14)) {
            OooOOO0(typedArray.getResourceId(14, 0));
        }
        Oooo0O0.Oooo0o0();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0OO();
        }
        C0115o000ooO c0115o000ooO = this.OooO0oo;
        if (c0115o000ooO != null) {
            c0115o000ooO.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            OooO0OO();
            this.OooO0oo.setImageDrawable(drawable);
            return;
        }
        C0115o000ooO c0115o000ooO = this.OooO0oo;
        if (c0115o000ooO != null) {
            c0115o000ooO.setImageDrawable(this.OooO0o);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new C0119o000ooo0(getContext(), null, 0);
            }
            if (!OooOOOO(this.OooO0o0)) {
                OooO0O0(this.OooO0o0, true);
            }
        } else {
            C0119o000ooo0 c0119o000ooo0 = this.OooO0o0;
            if (c0119o000ooo0 != null && OooOOOO(c0119o000ooo0)) {
                removeView(this.OooO0o0);
                this.OooOooo.remove(this.OooO0o0);
            }
        }
        C0119o000ooo0 c0119o000ooo02 = this.OooO0o0;
        if (c0119o000ooo02 != null) {
            c0119o000ooo02.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.OooO0o0 == null) {
            this.OooO0o0 = new C0119o000ooo0(getContext(), null, 0);
        }
        C0119o000ooo0 c0119o000ooo0 = this.OooO0o0;
        if (c0119o000ooo0 != null) {
            c0119o000ooo0.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0oO();
        }
        C0115o000ooO c0115o000ooO = this.OooO0Oo;
        if (c0115o000ooO != null) {
            c0115o000ooO.setContentDescription(charSequence);
            AbstractC1137oOOoooO.OooOOOO(this.OooO0Oo, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            OooO0oO();
            if (!OooOOOO(this.OooO0Oo)) {
                OooO0O0(this.OooO0Oo, true);
            }
        } else {
            C0115o000ooO c0115o000ooO = this.OooO0Oo;
            if (c0115o000ooO != null && OooOOOO(c0115o000ooO)) {
                removeView(this.OooO0Oo);
                this.OooOooo.remove(this.OooO0Oo);
            }
        }
        C0115o000ooO c0115o000ooO2 = this.OooO0Oo;
        if (c0115o000ooO2 != null) {
            c0115o000ooO2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1589oo0oOO0 c1589oo0oOO0 = this.OooO0OO;
            if (c1589oo0oOO0 != null && OooOOOO(c1589oo0oOO0)) {
                removeView(this.OooO0OO);
                this.OooOooo.remove(this.OooO0OO);
            }
        } else {
            if (this.OooO0OO == null) {
                Context context = getContext();
                C1589oo0oOO0 c1589oo0oOO02 = new C1589oo0oOO0(context, null);
                this.OooO0OO = c1589oo0oOO02;
                c1589oo0oOO02.setSingleLine();
                this.OooO0OO.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.OooOOO0;
                if (i != 0) {
                    this.OooO0OO.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.OooOoOO;
                if (colorStateList != null) {
                    this.OooO0OO.setTextColor(colorStateList);
                }
            }
            if (!OooOOOO(this.OooO0OO)) {
                OooO0O0(this.OooO0OO, true);
            }
        }
        C1589oo0oOO0 c1589oo0oOO03 = this.OooO0OO;
        if (c1589oo0oOO03 != null) {
            c1589oo0oOO03.setText(charSequence);
        }
        this.OooOoO0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.OooOoOO = colorStateList;
        C1589oo0oOO0 c1589oo0oOO0 = this.OooO0OO;
        if (c1589oo0oOO0 != null) {
            c1589oo0oOO0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1589oo0oOO0 c1589oo0oOO0 = this.OooO0O0;
            if (c1589oo0oOO0 != null && OooOOOO(c1589oo0oOO0)) {
                removeView(this.OooO0O0);
                this.OooOooo.remove(this.OooO0O0);
            }
        } else {
            if (this.OooO0O0 == null) {
                Context context = getContext();
                C1589oo0oOO0 c1589oo0oOO02 = new C1589oo0oOO0(context, null);
                this.OooO0O0 = c1589oo0oOO02;
                c1589oo0oOO02.setSingleLine();
                this.OooO0O0.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.OooOO0o;
                if (i != 0) {
                    this.OooO0O0.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.OooOoO;
                if (colorStateList != null) {
                    this.OooO0O0.setTextColor(colorStateList);
                }
            }
            if (!OooOOOO(this.OooO0O0)) {
                OooO0O0(this.OooO0O0, true);
            }
        }
        C1589oo0oOO0 c1589oo0oOO03 = this.OooO0O0;
        if (c1589oo0oOO03 != null) {
            c1589oo0oOO03.setText(charSequence);
        }
        this.OooOo = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.OooOoO = colorStateList;
        C1589oo0oOO0 c1589oo0oOO0 = this.OooO0O0;
        if (c1589oo0oOO0 != null) {
            c1589oo0oOO0.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO(layoutParams);
    }

    public void setOnMenuItemClickListener(InterfaceC1335oOoooO0 interfaceC1335oOoooO0) {
    }
}
