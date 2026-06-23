package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ninja.engine.AbstractC0018OooOOo0;
import com.ninja.engine.AbstractC0326o0O0oOOO;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1033oOOOoOo0;
import com.ninja.engine.AbstractC1449oo0O000;
import com.ninja.engine.AbstractC1452oo0O000o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.AbstractC1464oo0O0O0o;
import com.ninja.engine.C0327o0O0oOo;
import com.ninja.engine.C0330o0O0oOoo;
import com.ninja.engine.C0332o0O0oo0;
import com.ninja.engine.C0996oOOOO0Oo;
import com.ninja.engine.C1218oOoOOoo;
import com.ninja.engine.C1536oo0OoOoO;
import com.ninja.engine.InterfaceC0328o0O0oOo0;
import com.ninja.engine.InterfaceC0928oOO0OO0o;
import com.ninja.engine.R;
import com.ninja.engine.ViewGroup$OnHierarchyChangeListenerC1596oo0oOOo;
import com.ninja.engine.ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO;
import com.ninja.engine.o00O;
import com.ninja.engine.oOO00OOO;
import com.ninja.engine.oOO0OO;
import com.ninja.engine.oOO0OOO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0928oOO0OO0o, oOO0OO {
    public static final C0996oOOOO0Oo OooOo;
    public static final Class[] OooOo0;
    public static final String OooOo00;
    public static final ThreadLocal OooOo0O;
    public static final C0332o0O0oo0 OooOo0o;
    public final int[] OooO;
    public final ArrayList OooO00o;
    public final oOO00OOO OooO0O0;
    public final ArrayList OooO0OO;
    public final ArrayList OooO0Oo;
    public final int[] OooO0o;
    public final int[] OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public View OooOO0;
    public View OooOO0O;
    public ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO OooOO0o;
    public C1536oo0OoOoO OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public Drawable OooOOOo;
    public o00O OooOOo;
    public ViewGroup.OnHierarchyChangeListener OooOOo0;
    public final oOO0OOO OooOOoo;

    static {
        String str;
        Package r1 = CoordinatorLayout.class.getPackage();
        if (r1 != null) {
            str = r1.getName();
        } else {
            str = null;
        }
        OooOo00 = str;
        OooOo0o = new C0332o0O0oo0(0);
        OooOo0 = new Class[]{Context.class, AttributeSet.class};
        OooOo0O = new ThreadLocal();
        OooOo = new C0996oOOOO0Oo(12);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.OooO00o = new ArrayList();
        this.OooO0O0 = new oOO00OOO(3);
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = new ArrayList();
        this.OooO0o0 = new int[2];
        this.OooO0o = new int[2];
        this.OooOOoo = new Object();
        int[] iArr = AbstractC1033oOOOoOo0.OooO00o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.OooO = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.OooO;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.OooOOOo = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        OooOo0O();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC1596oo0oOOo(this));
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect OooO0oO() {
        Rect rect = (Rect) OooOo.OooO();
        return rect == null ? new Rect() : rect;
    }

    public static void OooOO0o(int i, Rect rect, Rect rect2, C0327o0O0oOo c0327o0O0oOo, int i2, int i3) {
        int width;
        int height;
        int i4 = c0327o0O0oOo.OooO0OO;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0327o0O0oOo.OooO0Oo;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static C0327o0O0oOo OooOOO0(View view) {
        C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) view.getLayoutParams();
        if (!c0327o0O0oOo.OooO0O0) {
            InterfaceC0328o0O0oOo0 interfaceC0328o0O0oOo0 = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0328o0O0oOo0 = (InterfaceC0328o0O0oOo0) cls.getAnnotation(InterfaceC0328o0O0oOo0.class);
                if (interfaceC0328o0O0oOo0 != null) {
                    break;
                }
            }
            if (interfaceC0328o0O0oOo0 != null) {
                try {
                    AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = (AbstractC0326o0O0oOOO) interfaceC0328o0O0oOo0.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0326o0O0oOOO abstractC0326o0O0oOOO2 = c0327o0O0oOo.OooO00o;
                    if (abstractC0326o0O0oOOO2 != abstractC0326o0O0oOOO) {
                        if (abstractC0326o0O0oOOO2 != null) {
                            abstractC0326o0O0oOOO2.OooO0o();
                        }
                        c0327o0O0oOo.OooO00o = abstractC0326o0O0oOOO;
                        c0327o0O0oOo.OooO0O0 = true;
                        if (abstractC0326o0O0oOOO != null) {
                            abstractC0326o0O0oOOO.OooO0Oo(c0327o0O0oOo);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC0328o0O0oOo0.value().getClass();
                }
            }
            c0327o0O0oOo.OooO0O0 = true;
        }
        return c0327o0O0oOo;
    }

    public static void OooOo0(View view, int i) {
        C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) view.getLayoutParams();
        int i2 = c0327o0O0oOo.OooOO0;
        if (i2 != i) {
            AbstractC1460oo0O00oo.OooOO0O(view, i - i2);
            c0327o0O0oOo.OooOO0 = i;
        }
    }

    public static void OooOo00(View view, int i) {
        C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) view.getLayoutParams();
        int i2 = c0327o0O0oOo.OooO;
        if (i2 != i) {
            AbstractC1460oo0O00oo.OooOO0(view, i - i2);
            c0327o0O0oOo.OooO = i;
        }
    }

    public final void OooO(View view, Rect rect, boolean z) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                OooOO0O(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO00o(View view, View view2, int i, int i2) {
        oOO0OOO ooo0ooo = this.OooOOoo;
        if (i2 == 1) {
            ooo0ooo.OooO0O0 = i;
        } else {
            ooo0ooo.OooO00o = i;
        }
        this.OooOO0O = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0327o0O0oOo) getChildAt(i3).getLayoutParams()).OooO00o(i2);
        }
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0O0(View view, int i) {
        oOO0OOO ooo0ooo = this.OooOOoo;
        if (i == 1) {
            ooo0ooo.OooO0O0 = 0;
        } else {
            ooo0ooo.OooO00o = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) childAt.getLayoutParams();
            if (c0327o0O0oOo.OooO00o(i)) {
                AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o;
                if (abstractC0326o0O0oOOO != null) {
                    abstractC0326o0O0oOOO.OooOo00(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        c0327o0O0oOo.OooOOOO = false;
                    }
                } else {
                    c0327o0O0oOo.OooOOO = false;
                }
                c0327o0O0oOo.getClass();
            }
        }
        this.OooOO0O = null;
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0OO(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) childAt.getLayoutParams();
                if (c0327o0O0oOo.OooO00o(i3) && (abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o) != null) {
                    int[] iArr2 = this.OooO0o0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0326o0O0oOOO.OooOO0o(this, childAt, view, i, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, iArr2[0]);
                    } else {
                        min = Math.min(i4, iArr2[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr2[1]);
                    } else {
                        min2 = Math.min(i5, iArr2[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            OooOOOO(1);
        }
    }

    @Override // com.ninja.engine.oOO0OO
    public final void OooO0Oo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) childAt.getLayoutParams();
                if (c0327o0O0oOo.OooO00o(i5) && (abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o) != null) {
                    int[] iArr2 = this.OooO0o0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0326o0O0oOOO.OooOOO(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    if (i3 > 0) {
                        min = Math.max(i6, iArr2[0]);
                    } else {
                        min = Math.min(i6, iArr2[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr2[1]);
                    } else {
                        min2 = Math.min(i7, iArr2[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            OooOOOO(1);
        }
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final boolean OooO0o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) childAt.getLayoutParams();
                AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o;
                if (abstractC0326o0O0oOOO != null) {
                    boolean OooOOoo = abstractC0326o0O0oOOO.OooOOoo(this, childAt, view, view2, i, i2);
                    z |= OooOOoo;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c0327o0O0oOo.OooOOOO = OooOOoo;
                        }
                    } else {
                        c0327o0O0oOo.OooOOO = OooOOoo;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        c0327o0O0oOo.OooOOOO = false;
                    }
                } else {
                    c0327o0O0oOo.OooOOO = false;
                }
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC0928oOO0OO0o
    public final void OooO0o0(View view, int i, int i2, int i3, int i4, int i5) {
        OooO0Oo(view, i, i2, i3, i4, 0, this.OooO0o);
    }

    public final void OooO0oo(C0327o0O0oOo c0327o0O0oOo, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0327o0O0oOo).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0327o0O0oOo).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0327o0O0oOo).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0327o0O0oOo).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final ArrayList OooOO0(View view) {
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) this.OooO0O0.OooO0Oo;
        int i = c1218oOoOOoo.OooO0OO;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c1218oOoOOoo.OooOO0(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1218oOoOOoo.OooO0o(i2));
            }
        }
        ArrayList arrayList3 = this.OooO0Oo;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void OooOO0O(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC1464oo0O0O0o.OooO00o;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC1464oo0O0O0o.OooO00o;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC1464oo0O0O0o.OooO00o(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC1464oo0O0O0o.OooO0O0;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean OooOOO(View view, int i, int i2) {
        C0996oOOOO0Oo c0996oOOOO0Oo = OooOo;
        Rect OooO0oO = OooO0oO();
        OooOO0O(view, OooO0oO);
        try {
            return OooO0oO.contains(i, i2);
        } finally {
            OooO0oO.setEmpty();
            c0996oOOOO0Oo.OooO0OO(OooO0oO);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bf A[EDGE_INSN: B:136:0x02bf->B:117:0x02bf ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOOO(int r26) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOOOO(int):void");
    }

    public final void OooOOOo(View view, int i) {
        Rect OooO0oO;
        Rect OooO0oO2;
        int i2;
        C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) view.getLayoutParams();
        View view2 = c0327o0O0oOo.OooOO0O;
        if (view2 == null && c0327o0O0oOo.OooO0o != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        C0996oOOOO0Oo c0996oOOOO0Oo = OooOo;
        if (view2 != null) {
            OooO0oO = OooO0oO();
            OooO0oO2 = OooO0oO();
            try {
                OooOO0O(view2, OooO0oO);
                C0327o0O0oOo c0327o0O0oOo2 = (C0327o0O0oOo) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                OooOO0o(i, OooO0oO, OooO0oO2, c0327o0O0oOo2, measuredWidth, measuredHeight);
                OooO0oo(c0327o0O0oOo2, OooO0oO2, measuredWidth, measuredHeight);
                view.layout(OooO0oO2.left, OooO0oO2.top, OooO0oO2.right, OooO0oO2.bottom);
                return;
            } finally {
                OooO0oO.setEmpty();
                c0996oOOOO0Oo.OooO0OO(OooO0oO);
                OooO0oO2.setEmpty();
                c0996oOOOO0Oo.OooO0OO(OooO0oO2);
            }
        }
        int i3 = c0327o0O0oOo.OooO0o0;
        if (i3 >= 0) {
            C0327o0O0oOo c0327o0O0oOo3 = (C0327o0O0oOo) view.getLayoutParams();
            int i4 = c0327o0O0oOo3.OooO0OO;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int[] iArr = this.OooO;
            int i7 = 0;
            if (iArr == null || i3 < 0 || i3 >= iArr.length) {
                toString();
                i2 = 0;
            } else {
                i2 = iArr[i3];
            }
            int i8 = i2 - measuredWidth2;
            if (i5 != 1) {
                if (i5 == 5) {
                    i8 += measuredWidth2;
                }
            } else {
                i8 += measuredWidth2 / 2;
            }
            if (i6 != 16) {
                if (i6 == 80) {
                    i7 = measuredHeight2;
                }
            } else {
                i7 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0327o0O0oOo3).leftMargin, Math.min(i8, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0327o0O0oOo3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0327o0O0oOo3).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0327o0O0oOo3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C0327o0O0oOo c0327o0O0oOo4 = (C0327o0O0oOo) view.getLayoutParams();
        OooO0oO = OooO0oO();
        OooO0oO.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0327o0O0oOo4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0327o0O0oOo4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0327o0O0oOo4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0327o0O0oOo4).bottomMargin);
        if (this.OooOOO != null) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                OooO0oO.left = this.OooOOO.OooO0O0() + OooO0oO.left;
                OooO0oO.top = this.OooOOO.OooO0Oo() + OooO0oO.top;
                OooO0oO.right -= this.OooOOO.OooO0OO();
                OooO0oO.bottom -= this.OooOOO.OooO00o();
            }
        }
        OooO0oO2 = OooO0oO();
        int i9 = c0327o0O0oOo4.OooO0OO;
        if ((i9 & 7) == 0) {
            i9 |= 8388611;
        }
        if ((i9 & 112) == 0) {
            i9 |= 48;
        }
        Gravity.apply(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), OooO0oO, OooO0oO2, i);
        view.layout(OooO0oO2.left, OooO0oO2.top, OooO0oO2.right, OooO0oO2.bottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x013d, code lost:
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOo() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOOo():void");
    }

    public final boolean OooOOo0(MotionEvent motionEvent, int i) {
        boolean z;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.OooO0OO;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        C0332o0O0oo0 c0332o0O0oo0 = OooOo0o;
        if (c0332o0O0oo0 != null) {
            Collections.sort(arrayList, c0332o0O0oo0);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) view.getLayoutParams();
            AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o;
            if ((z2 || z3) && actionMasked != 0) {
                if (abstractC0326o0O0oOOO != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            abstractC0326o0O0oOOO.OooOo0(view, motionEvent2);
                        }
                    } else {
                        abstractC0326o0O0oOOO.OooO0oO(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z2 && abstractC0326o0O0oOOO != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z2 = abstractC0326o0O0oOOO.OooOo0(view, motionEvent);
                        }
                    } else {
                        z2 = abstractC0326o0O0oOOO.OooO0oO(this, view, motionEvent);
                    }
                    if (z2) {
                        this.OooOO0 = view;
                    }
                }
                if (c0327o0O0oOo.OooO00o == null) {
                    c0327o0O0oOo.OooOOO0 = false;
                }
                boolean z4 = c0327o0O0oOo.OooOOO0;
                if (z4) {
                    z = true;
                } else {
                    c0327o0O0oOo.OooOOO0 = z4;
                    z = z4;
                }
                if (z && !z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && !z3) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    public final void OooOOoo(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = ((C0327o0O0oOo) childAt.getLayoutParams()).OooO00o;
            if (abstractC0326o0O0oOOO != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0326o0O0oOOO.OooO0oO(this, childAt, obtain);
                } else {
                    abstractC0326o0O0oOOO.OooOo0(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0327o0O0oOo) getChildAt(i2).getLayoutParams()).OooOOO0 = false;
        }
        this.OooOO0 = null;
        this.OooO0oO = false;
    }

    public final void OooOo0O() {
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        if (getFitsSystemWindows()) {
            if (this.OooOOo == null) {
                this.OooOOo = new o00O(7, this);
            }
            AbstractC1452oo0O000o.OooOOO0(this, this.OooOOo);
            setSystemUiVisibility(1280);
            return;
        }
        AbstractC1452oo0O000o.OooOOO0(this, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0327o0O0oOo) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = ((C0327o0O0oOo) view.getLayoutParams()).OooO00o;
        if (abstractC0326o0O0oOOO != null) {
            abstractC0326o0O0oOOO.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.OooOOOo;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0327o0O0oOo();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0327o0O0oOo(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        OooOOo();
        return Collections.unmodifiableList(this.OooO00o);
    }

    public final C1536oo0OoOoO getLastWindowInsets() {
        return this.OooOOO;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        oOO0OOO ooo0ooo = this.OooOOoo;
        return ooo0ooo.OooO0O0 | ooo0ooo.OooO00o;
    }

    public Drawable getStatusBarBackground() {
        return this.OooOOOo;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOOoo(false);
        if (this.OooOOO0) {
            if (this.OooOO0o == null) {
                this.OooOO0o = new ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.OooOO0o);
        }
        if (this.OooOOO == null) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if (getFitsSystemWindows()) {
                AbstractC1449oo0O000.OooO0OO(this);
            }
        }
        this.OooO0oo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOOoo(false);
        if (this.OooOOO0 && this.OooOO0o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.OooOO0o);
        }
        View view = this.OooOO0O;
        if (view != null) {
            OooO0O0(view, 0);
        }
        this.OooO0oo = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.OooOOOO || this.OooOOOo == null) {
            return;
        }
        C1536oo0OoOoO c1536oo0OoOoO = this.OooOOO;
        int OooO0Oo = c1536oo0OoOoO != null ? c1536oo0OoOoO.OooO0Oo() : 0;
        if (OooO0Oo > 0) {
            this.OooOOOo.setBounds(0, 0, getWidth(), OooO0Oo);
            this.OooOOOo.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooOOoo(true);
        }
        boolean OooOOo0 = OooOOo0(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            OooOOoo(true);
        }
        return OooOOo0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0326o0O0oOOO = ((C0327o0O0oOo) view.getLayoutParams()).OooO00o) == null || !abstractC0326o0O0oOOO.OooO0oo(this, view, layoutDirection))) {
                OooOOOo(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0193, code lost:
        if (r0.OooO(r30, r20, r8, r21, r24) == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) childAt.getLayoutParams();
                if (c0327o0O0oOo.OooO00o(0)) {
                    AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0327o0O0oOo c0327o0O0oOo = (C0327o0O0oOo) childAt.getLayoutParams();
                if (c0327o0O0oOo.OooO00o(0) && (abstractC0326o0O0oOOO = c0327o0O0oOo.OooO00o) != null) {
                    z |= abstractC0326o0O0oOOO.OooOO0(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooO0OO(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooO0o0(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO00o(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0330o0O0oOoo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0330o0O0oOoo c0330o0O0oOoo = (C0330o0O0oOoo) parcelable;
        super.onRestoreInstanceState(c0330o0O0oOoo.OooO00o);
        SparseArray sparseArray = c0330o0O0oOoo.OooO0OO;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = OooOOO0(childAt).OooO00o;
            if (id != -1 && abstractC0326o0O0oOOO != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0326o0O0oOOO.OooOOOo(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0O0oOoo, android.os.Parcelable, com.ninja.engine.OooOOo0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable OooOOo0;
        AbstractC0018OooOOo0 abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = ((C0327o0O0oOo) childAt.getLayoutParams()).OooO00o;
            if (id != -1 && abstractC0326o0O0oOOO != null && (OooOOo0 = abstractC0326o0O0oOOO.OooOOo0(childAt)) != null) {
                sparseArray.append(id, OooOOo0);
            }
        }
        abstractC0018OooOOo0.OooO0OO = sparseArray;
        return abstractC0018OooOOo0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooO0o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooO0O0(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.OooOO0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.OooOOo0(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = 0
            goto L2a
        L17:
            r3 = 0
        L18:
            android.view.View r6 = r0.OooOO0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.ninja.engine.o0O0oOo r6 = (com.ninja.engine.C0327o0O0oOo) r6
            com.ninja.engine.o0O0oOOO r6 = r6.OooO00o
            if (r6 == 0) goto L15
            android.view.View r7 = r0.OooOO0
            boolean r6 = r6.OooOo0(r7, r1)
        L2a:
            android.view.View r7 = r0.OooOO0
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.OooOOoo(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO = ((C0327o0O0oOo) view.getLayoutParams()).OooO00o;
        if (abstractC0326o0O0oOOO != null) {
            abstractC0326o0O0oOOO.OooOOOO(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.OooO0oO) {
            return;
        }
        OooOOoo(false);
        this.OooO0oO = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        OooOo0O();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.OooOOo0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.OooOOOo;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.OooOOOo = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.OooOOOo.setState(getDrawableState());
                }
                Drawable drawable4 = this.OooOOOo;
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                AbstractC0809oO0OooOO.OoooooO(drawable4, getLayoutDirection());
                Drawable drawable5 = this.OooOOOo;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.OooOOOo.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.OooOOOo;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.OooOOOo.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.OooOOOo;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0327o0O0oOo ? new C0327o0O0oOo((C0327o0O0oOo) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0327o0O0oOo((ViewGroup.MarginLayoutParams) layoutParams) : new C0327o0O0oOo(layoutParams);
    }
}
