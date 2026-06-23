package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.app.framework.core.system.JarConfig;
import com.app.framework.utils.FileUtils;
import com.ninja.engine.AbstractC0018OooOOo0;
import com.ninja.engine.AbstractC1061oOOo0O0O;
import com.ninja.engine.AbstractC1064oOOo0OOO;
import com.ninja.engine.AbstractC1065oOOo0OOo;
import com.ninja.engine.AbstractC1066oOOo0Oo;
import com.ninja.engine.AbstractC1069oOOo0Ooo;
import com.ninja.engine.AbstractC1071oOOo0o0;
import com.ninja.engine.AbstractC1081oOOoO0OO;
import com.ninja.engine.AbstractC1083oOOoO0o;
import com.ninja.engine.AbstractC1452oo0O000o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0671o0ooo0O;
import com.ninja.engine.C0832oO0o0o00;
import com.ninja.engine.C1060oOOo0O0;
import com.ninja.engine.C1062oOOo0OO;
import com.ninja.engine.C1068oOOo0OoO;
import com.ninja.engine.C1070oOOo0o;
import com.ninja.engine.C1072oOOo0o0O;
import com.ninja.engine.C1073oOOo0o0o;
import com.ninja.engine.C1074oOOo0oO;
import com.ninja.engine.C1076oOOo0oOO;
import com.ninja.engine.C1080oOOoO0O;
import com.ninja.engine.C1085oOOoO0oo;
import com.ninja.engine.C1126oOOooOO;
import com.ninja.engine.C1218oOoOOoo;
import com.ninja.engine.C1461oo0O0O;
import com.ninja.engine.InterfaceC1063oOOo0OO0;
import com.ninja.engine.InterfaceC1075oOOo0oO0;
import com.ninja.engine.R;
import com.ninja.engine.RunnableC0672o0ooo0o;
import com.ninja.engine.RunnableC1058oOOo00oo;
import com.ninja.engine.RunnableC1082oOOoO0Oo;
import com.ninja.engine.InterpolatorC1047oOOo0;
import com.ninja.engine.o0000O;
import com.ninja.engine.o0000OO0;
import com.ninja.engine.o0O000o0;
import com.ninja.engine.oO0OO;
import com.ninja.engine.oO0OO00;
import com.ninja.engine.oOO0OO0O;
import com.ninja.engine.oOO0OOO;
import com.ninja.engine.oOOo0O00;
import com.ninja.engine.oo000000;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final boolean o00oO0O;
    public static final boolean o00oO0o;
    public static final boolean o0ooOO0;
    public static final Class[] o0ooOOo;
    public static final InterpolatorC1047oOOo0 o0ooOoO;
    public static final int[] oo000o = {16843830};
    public final Rect OooO;
    public final C1074oOOo0oO OooO00o;
    public final C1070oOOo0o OooO0O0;
    public C1076oOOo0oOO OooO0OO;
    public final o0000OO0 OooO0Oo;
    public final C1126oOOooOO OooO0o;
    public final C0131o00O0o OooO0o0;
    public boolean OooO0oO;
    public final RunnableC1058oOOo00oo OooO0oo;
    public final Rect OooOO0;
    public final RectF OooOO0O;
    public AbstractC1061oOOo0O0O OooOO0o;
    public final ArrayList OooOOO;
    public AbstractC1066oOOo0Oo OooOOO0;
    public final ArrayList OooOOOO;
    public oO0OO OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public boolean OooOOoo;
    public int OooOo;
    public boolean OooOo0;
    public int OooOo00;
    public boolean OooOo0O;
    public boolean OooOo0o;
    public final AccessibilityManager OooOoO;
    public boolean OooOoO0;
    public boolean OooOoOO;
    public int OooOoo;
    public boolean OooOoo0;
    public int OooOooO;
    public C1062oOOo0OO OooOooo;
    public int Oooo;
    public EdgeEffect Oooo0;
    public EdgeEffect Oooo000;
    public EdgeEffect Oooo00O;
    public EdgeEffect Oooo00o;
    public AbstractC1064oOOo0OOO Oooo0O0;
    public int Oooo0OO;
    public VelocityTracker Oooo0o;
    public int Oooo0o0;
    public int Oooo0oO;
    public int Oooo0oo;
    public final int OoooO;
    public int OoooO0;
    public int OoooO00;
    public AbstractC1069oOOo0Ooo OoooO0O;
    public final int OoooOO0;
    public final float OoooOOO;
    public boolean OoooOOo;
    public final RunnableC1082oOOoO0Oo OoooOo0;
    public RunnableC0672o0ooo0o OoooOoO;
    public final C0671o0ooo0O OoooOoo;
    public final C1080oOOoO0O Ooooo00;
    public AbstractC1071oOOo0o0 Ooooo0o;
    public ArrayList OooooO0;
    public boolean OooooOO;
    public boolean OooooOo;
    public boolean Oooooo;
    public final C1060oOOo0O0 Oooooo0;
    public C1085oOOoO0oo OoooooO;
    public final int[] Ooooooo;
    public final float o000oOoO;
    public final int[] o00O0O;
    public final int[] o00Oo0;
    public final ArrayList o00Ooo;
    public final RunnableC1058oOOo00oo o00o0O;
    public final oOOo0O00 o00ooo;
    public oOO0OO0O o0OoOo0;
    public final int[] ooOO;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        o00oO0o = z;
        o00oO0O = true;
        o0ooOO0 = true;
        Class cls = Integer.TYPE;
        o0ooOOo = new Class[]{Context.class, AttributeSet.class, cls, cls};
        o0ooOoO = new InterpolatorC1047oOOo0(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static void OooOO0(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        WeakReference weakReference = abstractC1083oOOoO0o.OooO0O0;
        if (weakReference != null) {
            Object obj = (Object) weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == abstractC1083oOOoO0o.OooO00o) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                abstractC1083oOOoO0o.OooO0O0 = null;
                return;
            }
        }
    }

    public static RecyclerView OooOooO(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView OooOooO = OooOooO(viewGroup.getChildAt(i));
                if (OooOooO != null) {
                    return OooOooO;
                }
            }
            return null;
        }
        return null;
    }

    public static AbstractC1083oOOoO0o Oooo0(View view) {
        if (view == null) {
            return null;
        }
        return ((C1068oOOo0OoO) view.getLayoutParams()).OooO00o;
    }

    private oOO0OO0O getScrollingChildHelper() {
        if (this.o0OoOo0 == null) {
            this.o0OoOo0 = new oOO0OO0O(this);
        }
        return this.o0OoOo0;
    }

    public final void OooO(String str) {
        if (Oooo0o0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + OooOoO0());
        } else if (this.OooOooO > 0) {
            new IllegalStateException("" + OooOoO0());
        }
    }

    public final void OooO0o(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        boolean z;
        View view = abstractC1083oOOoO0o.OooO00o;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.OooO0O0.OooOO0(Oooo00o(view));
        if (abstractC1083oOOoO0o.OooOOO0()) {
            this.OooO0o0.OooOO0O(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.OooO0o0.OooOO0(view, -1, true);
        } else {
            C0131o00O0o c0131o00O0o = this.OooO0o0;
            int indexOfChild = ((C1060oOOo0O0) c0131o00O0o.OooO0O0).OooO00o.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((o0O000o0) c0131o00O0o.OooO0OO).OooO0oo(indexOfChild);
                c0131o00O0o.Oooo00O(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void OooO0oO(AbstractC1065oOOo0OOo abstractC1065oOOo0OOo) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            abstractC1066oOOo0Oo.OooO0OO("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.OooOOO;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1065oOOo0OOo);
        Oooo0oO();
        requestLayout();
    }

    public final void OooO0oo(AbstractC1071oOOo0o0 abstractC1071oOOo0o0) {
        if (this.OooooO0 == null) {
            this.OooooO0 = new ArrayList();
        }
        this.OooooO0.add(abstractC1071oOOo0o0);
    }

    public final void OooOO0O() {
        int OooOooo = this.OooO0o0.OooOooo();
        for (int i = 0; i < OooOooo; i++) {
            AbstractC1083oOOoO0o Oooo0 = Oooo0(this.OooO0o0.OooOooO(i));
            if (!Oooo0.OooOOo()) {
                Oooo0.OooO0Oo = -1;
                Oooo0.OooO0oO = -1;
            }
        }
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        ArrayList arrayList = c1070oOOo0o.OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(i2);
            abstractC1083oOOoO0o.OooO0Oo = -1;
            abstractC1083oOOoO0o.OooO0oO = -1;
        }
        ArrayList arrayList2 = c1070oOOo0o.OooO00o;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = (AbstractC1083oOOoO0o) arrayList2.get(i3);
            abstractC1083oOOoO0o2.OooO0Oo = -1;
            abstractC1083oOOoO0o2.OooO0oO = -1;
        }
        ArrayList arrayList3 = c1070oOOo0o.OooO0O0;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC1083oOOoO0o abstractC1083oOOoO0o3 = (AbstractC1083oOOoO0o) c1070oOOo0o.OooO0O0.get(i4);
                abstractC1083oOOoO0o3.OooO0Oo = -1;
                abstractC1083oOOoO0o3.OooO0oO = -1;
            }
        }
    }

    public final void OooOO0o(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.Oooo000;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.Oooo000.onRelease();
            z = this.Oooo000.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.Oooo00o;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.Oooo00o.onRelease();
            z |= this.Oooo00o.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Oooo00O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.Oooo00O.onRelease();
            z |= this.Oooo00O.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Oooo0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.Oooo0.onRelease();
            z |= this.Oooo0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            postInvalidateOnAnimation();
        }
    }

    public final void OooOOO(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        setMeasuredDimension(AbstractC1066oOOo0Oo.OooO0oO(i, paddingRight, getMinimumWidth()), AbstractC1066oOOo0Oo.OooO0oO(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void OooOOO0() {
        C0131o00O0o c0131o00O0o = this.OooO0o0;
        o0000OO0 o0000oo0 = this.OooO0Oo;
        if (this.OooOOoo && !this.OooOoOO) {
            if (!o0000oo0.OooOO0()) {
                return;
            }
            int i = o0000oo0.OooO00o;
            if ((i & 4) != 0 && (i & 11) == 0) {
                int i2 = oo000000.OooO00o;
                Trace.beginSection("RV PartialInvalidate");
                Ooooo0o();
                Oooo();
                o0000oo0.OooOOOo();
                if (!this.OooOo0) {
                    int OooOo0 = c0131o00O0o.OooOo0();
                    int i3 = 0;
                    while (true) {
                        if (i3 < OooOo0) {
                            AbstractC1083oOOoO0o Oooo0 = Oooo0(c0131o00O0o.OooOo00(i3));
                            if (Oooo0 != null && !Oooo0.OooOOo() && Oooo0.OooOOO()) {
                                OooOOOO();
                                break;
                            }
                            i3++;
                        } else {
                            o0000oo0.OooO0OO();
                            break;
                        }
                    }
                }
                OooooO0(true);
                OoooO00(true);
            } else if (o0000oo0.OooOO0()) {
                int i4 = oo000000.OooO00o;
                Trace.beginSection("RV FullInvalidate");
                OooOOOO();
            } else {
                return;
            }
            Trace.endSection();
            return;
        }
        int i5 = oo000000.OooO00o;
        Trace.beginSection("RV FullInvalidate");
        OooOOOO();
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ed, code lost:
        if (((java.util.ArrayList) r18.OooO0o0.OooO0Oo).contains(getFocusedChild()) == false) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0397  */
    /* JADX WARN: Type inference failed for: r12v12, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.ninja.engine.oOOooOO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOOO() {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOOOO():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.ninja.engine.oOO0OOO, java.lang.Object] */
    public final void OooOOOo() {
        View view;
        int OooO0OO;
        int id;
        boolean z;
        C1461oo0O0O c1461oo0O0O;
        View OooOoOO;
        C1080oOOoO0O c1080oOOoO0O = this.Ooooo00;
        c1080oOOoO0O.OooO00o(1);
        OooOoO(c1080oOOoO0O);
        c1080oOOoO0O.OooO = false;
        Ooooo0o();
        C1126oOOooOO c1126oOOooOO = this.OooO0o;
        ((C1218oOoOOoo) c1126oOOooOO.OooO0O0).clear();
        C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) c1126oOOooOO.OooO0OO;
        c0832oO0o0o00.OooO0O0();
        Oooo();
        OoooO();
        AbstractC1083oOOoO0o abstractC1083oOOoO0o = null;
        if (this.OoooOOo && hasFocus() && this.OooOO0o != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (OooOoOO = OooOoOO(view)) != null) {
            abstractC1083oOOoO0o = Oooo00o(OooOoOO);
        }
        long j = -1;
        if (abstractC1083oOOoO0o == null) {
            c1080oOOoO0O.OooOOO0 = -1L;
            c1080oOOoO0O.OooOO0o = -1;
            c1080oOOoO0O.OooOOO = -1;
        } else {
            if (this.OooOO0o.OooO0O0) {
                j = abstractC1083oOOoO0o.OooO0o0;
            }
            c1080oOOoO0O.OooOOO0 = j;
            if (this.OooOoOO) {
                OooO0OO = -1;
            } else if (abstractC1083oOOoO0o.OooOO0O()) {
                OooO0OO = abstractC1083oOOoO0o.OooO0Oo;
            } else {
                OooO0OO = abstractC1083oOOoO0o.OooO0OO();
            }
            c1080oOOoO0O.OooOO0o = OooO0OO;
            View view2 = abstractC1083oOOoO0o.OooO00o;
            loop3: while (true) {
                id = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            c1080oOOoO0O.OooOOO = id;
        }
        if (c1080oOOoO0O.OooOO0 && this.OooooOo) {
            z = true;
        } else {
            z = false;
        }
        c1080oOOoO0O.OooO0oo = z;
        this.OooooOo = false;
        this.OooooOO = false;
        c1080oOOoO0O.OooO0oO = c1080oOOoO0O.OooOO0O;
        c1080oOOoO0O.OooO0o0 = this.OooOO0o.OooO00o();
        OooOoo(this.Ooooooo);
        boolean z2 = c1080oOOoO0O.OooOO0;
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) c1126oOOooOO.OooO0O0;
        if (z2) {
            int OooOo0 = this.OooO0o0.OooOo0();
            for (int i = 0; i < OooOo0; i++) {
                AbstractC1083oOOoO0o Oooo0 = Oooo0(this.OooO0o0.OooOo00(i));
                if (!Oooo0.OooOOo() && (!Oooo0.OooO() || this.OooOO0o.OooO0O0)) {
                    AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = this.Oooo0O0;
                    AbstractC1064oOOo0OOO.OooO0O0(Oooo0);
                    Oooo0.OooO0o0();
                    abstractC1064oOOo0OOO.getClass();
                    Object obj = new Object();
                    obj.OooO00o(Oooo0);
                    C1461oo0O0O c1461oo0O0O2 = (C1461oo0O0O) c1218oOoOOoo.get(Oooo0);
                    if (c1461oo0O0O2 == null) {
                        c1461oo0O0O2 = C1461oo0O0O.OooO00o();
                        c1218oOoOOoo.put(Oooo0, c1461oo0O0O2);
                    }
                    c1461oo0O0O2.OooO0O0 = obj;
                    c1461oo0O0O2.OooO00o |= 4;
                    if (c1080oOOoO0O.OooO0oo && Oooo0.OooOOO() && !Oooo0.OooOO0O() && !Oooo0.OooOOo() && !Oooo0.OooO()) {
                        c0832oO0o0o00.OooO0oO(Oooo00O(Oooo0), Oooo0);
                    }
                }
            }
        }
        if (c1080oOOoO0O.OooOO0O) {
            int OooOooo = this.OooO0o0.OooOooo();
            for (int i2 = 0; i2 < OooOooo; i2++) {
                AbstractC1083oOOoO0o Oooo02 = Oooo0(this.OooO0o0.OooOooO(i2));
                if (!Oooo02.OooOOo() && Oooo02.OooO0Oo == -1) {
                    Oooo02.OooO0Oo = Oooo02.OooO0OO;
                }
            }
            boolean z3 = c1080oOOoO0O.OooO0o;
            c1080oOOoO0O.OooO0o = false;
            this.OooOOO0.Ooooo00(this.OooO0O0, c1080oOOoO0O);
            c1080oOOoO0O.OooO0o = z3;
            for (int i3 = 0; i3 < this.OooO0o0.OooOo0(); i3++) {
                AbstractC1083oOOoO0o Oooo03 = Oooo0(this.OooO0o0.OooOo00(i3));
                if (!Oooo03.OooOOo() && ((c1461oo0O0O = (C1461oo0O0O) c1218oOoOOoo.get(Oooo03)) == null || (c1461oo0O0O.OooO00o & 4) == 0)) {
                    AbstractC1064oOOo0OOO.OooO0O0(Oooo03);
                    boolean OooO0o = Oooo03.OooO0o(JarConfig.DEFAULT_BUFFER_SIZE);
                    AbstractC1064oOOo0OOO abstractC1064oOOo0OOO2 = this.Oooo0O0;
                    Oooo03.OooO0o0();
                    abstractC1064oOOo0OOO2.getClass();
                    Object obj2 = new Object();
                    obj2.OooO00o(Oooo03);
                    if (OooO0o) {
                        o000oOoO(Oooo03, obj2);
                    } else {
                        C1461oo0O0O c1461oo0O0O3 = (C1461oo0O0O) c1218oOoOOoo.get(Oooo03);
                        if (c1461oo0O0O3 == null) {
                            c1461oo0O0O3 = C1461oo0O0O.OooO00o();
                            c1218oOoOOoo.put(Oooo03, c1461oo0O0O3);
                        }
                        c1461oo0O0O3.OooO00o |= 2;
                        c1461oo0O0O3.OooO0O0 = obj2;
                    }
                }
            }
        }
        OooOO0O();
        OoooO00(true);
        OooooO0(false);
        c1080oOOoO0O.OooO0Oo = 2;
    }

    public final boolean OooOOo(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO0OO(i, i2, i3, iArr, iArr2);
    }

    public final void OooOOo0() {
        boolean z;
        Ooooo0o();
        Oooo();
        C1080oOOoO0O c1080oOOoO0O = this.Ooooo00;
        c1080oOOoO0O.OooO00o(6);
        this.OooO0Oo.OooO0Oo();
        c1080oOOoO0O.OooO0o0 = this.OooOO0o.OooO00o();
        c1080oOOoO0O.OooO0OO = 0;
        c1080oOOoO0O.OooO0oO = false;
        this.OooOOO0.Ooooo00(this.OooO0O0, c1080oOOoO0O);
        c1080oOOoO0O.OooO0o = false;
        this.OooO0OO = null;
        if (c1080oOOoO0O.OooOO0 && this.Oooo0O0 != null) {
            z = true;
        } else {
            z = false;
        }
        c1080oOOoO0O.OooOO0 = z;
        c1080oOOoO0O.OooO0Oo = 4;
        OoooO00(true);
        OooooO0(false);
    }

    public final void OooOOoo(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().OooO0o0(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void OooOo() {
        int measuredWidth;
        int measuredHeight;
        if (this.Oooo00O != null) {
            return;
        }
        this.OooOooo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo00O = edgeEffect;
        if (this.OooO0oO) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void OooOo0() {
        int measuredWidth;
        int measuredHeight;
        if (this.Oooo0 != null) {
            return;
        }
        this.OooOooo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo0 = edgeEffect;
        if (this.OooO0oO) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void OooOo00(int i, int i2) {
        this.OooOooO++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC1071oOOo0o0 abstractC1071oOOo0o0 = this.Ooooo0o;
        if (abstractC1071oOOo0o0 != null) {
            abstractC1071oOOo0o0.OooO0O0(this, i, i2);
        }
        ArrayList arrayList = this.OooooO0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1071oOOo0o0) this.OooooO0.get(size)).OooO0O0(this, i, i2);
            }
        }
        this.OooOooO--;
    }

    public final void OooOo0O() {
        int measuredHeight;
        int measuredWidth;
        if (this.Oooo000 != null) {
            return;
        }
        this.OooOooo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo000 = edgeEffect;
        if (this.OooO0oO) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void OooOo0o() {
        int measuredHeight;
        int measuredWidth;
        if (this.Oooo00o != null) {
            return;
        }
        this.OooOooo.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.Oooo00o = edgeEffect;
        if (this.OooO0oO) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void OooOoO(C1080oOOoO0O c1080oOOoO0O) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.OoooOo0.OooO0OO;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c1080oOOoO0O.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c1080oOOoO0O.getClass();
    }

    public final String OooOoO0() {
        return " " + super.toString() + ", adapter:" + this.OooOO0o + ", layout:" + this.OooOOO0 + ", context:" + getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View OooOoOO(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOoOO(android.view.View):android.view.View");
    }

    public final void OooOoo(int[] iArr) {
        int OooOo0 = this.OooO0o0.OooOo0();
        if (OooOo0 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < OooOo0; i3++) {
            AbstractC1083oOOoO0o Oooo0 = Oooo0(this.OooO0o0.OooOo00(i3));
            if (!Oooo0.OooOOo()) {
                int OooO0Oo = Oooo0.OooO0Oo();
                if (OooO0Oo < i) {
                    i = OooO0Oo;
                }
                if (OooO0Oo > i2) {
                    i2 = OooO0Oo;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r6 == 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOoo0(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.OooOOOO
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r2) goto L69
            java.lang.Object r5 = (Object) r1.get(r4)
            com.ninja.engine.oO0OO r5 = (com.ninja.engine.oO0OO) r5
            int r6 = r5.OooOo0O
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.OooO0Oo(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.OooO0OO(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L5d
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L5d
        L3c:
            if (r9 == 0) goto L49
            r5.OooOo0o = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.OooOOOo = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.OooOo0o = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.OooOOO0 = r6
        L55:
            r5.OooO0o(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L5d
        L5b:
            r6 = 1
            goto L5e
        L5d:
            r6 = 0
        L5e:
            if (r6 == 0) goto L66
            r6 = 3
            if (r0 == r6) goto L66
            r11.OooOOOo = r5
            return r7
        L66:
            int r4 = r4 + 1
            goto Lc
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OooOoo0(android.view.MotionEvent):boolean");
    }

    public final AbstractC1083oOOoO0o OooOooo(int i) {
        AbstractC1083oOOoO0o abstractC1083oOOoO0o = null;
        if (this.OooOoOO) {
            return null;
        }
        int OooOooo = this.OooO0o0.OooOooo();
        for (int i2 = 0; i2 < OooOooo; i2++) {
            AbstractC1083oOOoO0o Oooo0 = Oooo0(this.OooO0o0.OooOooO(i2));
            if (Oooo0 != null && !Oooo0.OooOO0O() && Oooo000(Oooo0) == i) {
                if (this.OooO0o0.Oooo00o(Oooo0.OooO00o)) {
                    abstractC1083oOOoO0o = Oooo0;
                } else {
                    return Oooo0;
                }
            }
        }
        return abstractC1083oOOoO0o;
    }

    public final void Oooo() {
        this.OooOoo++;
    }

    public final int Oooo000(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        if (abstractC1083oOOoO0o.OooO0o(524) || !abstractC1083oOOoO0o.OooO0oo()) {
            return -1;
        }
        o0000OO0 o0000oo0 = this.OooO0Oo;
        int i = abstractC1083oOOoO0o.OooO0OO;
        ArrayList arrayList = (ArrayList) o0000oo0.OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0000O o0000o = (o0000O) arrayList.get(i2);
            int i3 = o0000o.OooO00o;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = o0000o.OooO0O0;
                        if (i4 == i) {
                            i = o0000o.OooO0Oo;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (o0000o.OooO0Oo <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = o0000o.OooO0O0;
                    if (i5 <= i) {
                        int i6 = o0000o.OooO0Oo;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (o0000o.OooO0O0 <= i) {
                i += o0000o.OooO0Oo;
            }
        }
        return i;
    }

    public final long Oooo00O(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        if (this.OooOO0o.OooO0O0) {
            return abstractC1083oOOoO0o.OooO0o0;
        }
        return abstractC1083oOOoO0o.OooO0OO;
    }

    public final AbstractC1083oOOoO0o Oooo00o(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return Oooo0(view);
    }

    public final Rect Oooo0O0(View view) {
        C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
        boolean z = c1068oOOo0OoO.OooO0OO;
        Rect rect = c1068oOOo0OoO.OooO0O0;
        if (!z) {
            return rect;
        }
        if (this.Ooooo00.OooO0oO && (c1068oOOo0OoO.OooO00o.OooOOO() || c1068oOOo0OoO.OooO00o.OooO())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.OooOOO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.OooO;
            rect2.set(0, 0, 0, 0);
            ((AbstractC1065oOOo0OOo) arrayList.get(i)).getClass();
            ((C1068oOOo0OoO) view.getLayoutParams()).OooO00o.OooO0Oo();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c1068oOOo0OoO.OooO0OO = false;
        return rect;
    }

    public final boolean Oooo0OO() {
        return !this.OooOOoo || this.OooOoOO || this.OooO0Oo.OooOO0();
    }

    public final void Oooo0o(int i) {
        if (this.OooOOO0 == null) {
            return;
        }
        setScrollState(2);
        this.OooOOO0.o00Ooo(i);
        awakenScrollBars();
    }

    public final boolean Oooo0o0() {
        return this.OooOoo > 0;
    }

    public final void Oooo0oO() {
        int OooOooo = this.OooO0o0.OooOooo();
        for (int i = 0; i < OooOooo; i++) {
            ((C1068oOOo0OoO) this.OooO0o0.OooOooO(i).getLayoutParams()).OooO0OO = true;
        }
        ArrayList arrayList = this.OooO0O0.OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) ((AbstractC1083oOOoO0o) arrayList.get(i2)).OooO00o.getLayoutParams();
            if (c1068oOOo0OoO != null) {
                c1068oOOo0OoO.OooO0OO = true;
            }
        }
    }

    public final void Oooo0oo(int i, int i2, boolean z) {
        int i3 = i + i2;
        int OooOooo = this.OooO0o0.OooOooo();
        for (int i4 = 0; i4 < OooOooo; i4++) {
            AbstractC1083oOOoO0o Oooo0 = Oooo0(this.OooO0o0.OooOooO(i4));
            if (Oooo0 != null && !Oooo0.OooOOo()) {
                int i5 = Oooo0.OooO0OO;
                C1080oOOoO0O c1080oOOoO0O = this.Ooooo00;
                if (i5 >= i3) {
                    Oooo0.OooOOOO(-i2, z);
                    c1080oOOoO0O.OooO0o = true;
                } else if (i5 >= i) {
                    Oooo0.OooO0O0(8);
                    Oooo0.OooOOOO(-i2, z);
                    Oooo0.OooO0OO = i - 1;
                    c1080oOOoO0O.OooO0o = true;
                }
            }
        }
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        ArrayList arrayList = c1070oOOo0o.OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(size);
            if (abstractC1083oOOoO0o != null) {
                int i6 = abstractC1083oOOoO0o.OooO0OO;
                if (i6 >= i3) {
                    abstractC1083oOOoO0o.OooOOOO(-i2, z);
                } else if (i6 >= i) {
                    abstractC1083oOOoO0o.OooO0O0(8);
                    c1070oOOo0o.OooO0o0(size);
                }
            }
        }
        requestLayout();
    }

    public final void OoooO() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.OooOoOO) {
            o0000OO0 o0000oo0 = this.OooO0Oo;
            o0000oo0.OooOOo((ArrayList) o0000oo0.OooO0OO);
            o0000oo0.OooOOo((ArrayList) o0000oo0.OooO0Oo);
            o0000oo0.OooO00o = 0;
            if (this.OooOoo0) {
                this.OooOOO0.OoooOOo();
            }
        }
        if (this.Oooo0O0 != null && this.OooOOO0.oo0o0Oo()) {
            this.OooO0Oo.OooOOOo();
        } else {
            this.OooO0Oo.OooO0Oo();
        }
        if (!this.OooooOO && !this.OooooOo) {
            z = false;
        } else {
            z = true;
        }
        if (this.OooOOoo && this.Oooo0O0 != null && (((z3 = this.OooOoOO) || z || this.OooOOO0.OooO0o) && (!z3 || this.OooOO0o.OooO0O0))) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1080oOOoO0O c1080oOOoO0O = this.Ooooo00;
        c1080oOOoO0O.OooOO0 = z2;
        if (z2 && z && !this.OooOoOO && this.Oooo0O0 != null && this.OooOOO0.oo0o0Oo()) {
            z4 = true;
        }
        c1080oOOoO0O.OooOO0O = z4;
    }

    public final void OoooO0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.Oooo0o0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.Oooo0o0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.Oooo = x;
            this.Oooo0oO = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.OoooO00 = y;
            this.Oooo0oo = y;
        }
    }

    public final void OoooO00(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.OooOoo - 1;
        this.OooOoo = i2;
        if (i2 < 1) {
            this.OooOoo = 0;
            if (z) {
                int i3 = this.OooOo;
                this.OooOo = 0;
                if (i3 != 0 && (accessibilityManager = this.OooOoO) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(FileUtils.FileMode.MODE_ISUID);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.o00Ooo;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(size);
                    if (abstractC1083oOOoO0o.OooO00o.getParent() == this && !abstractC1083oOOoO0o.OooOOo() && (i = abstractC1083oOOoO0o.OooOOo0) != -1) {
                        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                        abstractC1083oOOoO0o.OooO00o.setImportantForAccessibility(i);
                        abstractC1083oOOoO0o.OooOOo0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void OoooO0O() {
        if (!this.Oooooo && this.OooOOo0) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            postOnAnimation(this.o00o0O);
            this.Oooooo = true;
        }
    }

    public final void OoooOO0(boolean z) {
        this.OooOoo0 = z | this.OooOoo0;
        this.OooOoOO = true;
        int OooOooo = this.OooO0o0.OooOooo();
        for (int i = 0; i < OooOooo; i++) {
            AbstractC1083oOOoO0o Oooo0 = Oooo0(this.OooO0o0.OooOooO(i));
            if (Oooo0 != null && !Oooo0.OooOOo()) {
                Oooo0.OooO0O0(6);
            }
        }
        Oooo0oO();
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        ArrayList arrayList = c1070oOOo0o.OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList.get(i2);
            if (abstractC1083oOOoO0o != null) {
                abstractC1083oOOoO0o.OooO0O0(6);
                abstractC1083oOOoO0o.OooO00o(null);
            }
        }
        AbstractC1061oOOo0O0O abstractC1061oOOo0O0O = c1070oOOo0o.OooO0oo.OooOO0o;
        if (abstractC1061oOOo0O0O == null || !abstractC1061oOOo0O0O.OooO0O0) {
            c1070oOOo0o.OooO0Oo();
        }
    }

    public final void OoooOOO(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.OooO;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1068oOOo0OoO) {
            C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) layoutParams;
            if (!c1068oOOo0OoO.OooO0OO) {
                int i = rect.left;
                Rect rect2 = c1068oOOo0OoO.OooO0O0;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.OooOOO0.ooOO(this, view, this.OooO, !this.OooOOoo, view2 == null);
    }

    public final void OoooOOo() {
        VelocityTracker velocityTracker = this.Oooo0o;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        OooooOO(0);
        EdgeEffect edgeEffect = this.Oooo000;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.Oooo000.isFinished();
        }
        EdgeEffect edgeEffect2 = this.Oooo00O;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.Oooo00O.isFinished();
        }
        EdgeEffect edgeEffect3 = this.Oooo00o;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.Oooo00o.isFinished();
        }
        EdgeEffect edgeEffect4 = this.Oooo0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.Oooo0.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OoooOo0(int r19, int r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.OoooOo0(int, int, android.view.MotionEvent):boolean");
    }

    public final void OoooOoO(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        AbstractC1083oOOoO0o abstractC1083oOOoO0o;
        C0131o00O0o c0131o00O0o = this.OooO0o0;
        Ooooo0o();
        Oooo();
        int i5 = oo000000.OooO00o;
        Trace.beginSection("RV Scroll");
        C1080oOOoO0O c1080oOOoO0O = this.Ooooo00;
        OooOoO(c1080oOOoO0O);
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        if (i != 0) {
            i3 = this.OooOOO0.o00Oo0(i, c1070oOOo0o, c1080oOOoO0O);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.OooOOO0.o00o0O(i2, c1070oOOo0o, c1080oOOoO0O);
        } else {
            i4 = 0;
        }
        Trace.endSection();
        int OooOo0 = c0131o00O0o.OooOo0();
        for (int i6 = 0; i6 < OooOo0; i6++) {
            View OooOo00 = c0131o00O0o.OooOo00(i6);
            AbstractC1083oOOoO0o Oooo00o = Oooo00o(OooOo00);
            if (Oooo00o != null && (abstractC1083oOOoO0o = Oooo00o.OooO) != null) {
                int left = OooOo00.getLeft();
                int top = OooOo00.getTop();
                View view = abstractC1083oOOoO0o.OooO00o;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        OoooO00(true);
        OooooO0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void OoooOoo(int i) {
        oO0OO00 oo0oo00;
        if (this.OooOo0O) {
            return;
        }
        setScrollState(0);
        RunnableC1082oOOoO0Oo runnableC1082oOOoO0Oo = this.OoooOo0;
        runnableC1082oOOoO0Oo.OooO0oO.removeCallbacks(runnableC1082oOOoO0Oo);
        runnableC1082oOOoO0Oo.OooO0OO.abortAnimation();
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && (oo0oo00 = abstractC1066oOOo0Oo.OooO0o0) != null) {
            oo0oo00.OooO();
        }
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo2 = this.OooOOO0;
        if (abstractC1066oOOo0Oo2 == null) {
            return;
        }
        abstractC1066oOOo0Oo2.o00Ooo(i);
        awakenScrollBars();
    }

    public final void Ooooo00(int i, int i2, boolean z) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo == null || this.OooOo0O) {
            return;
        }
        int i3 = 0;
        if (!abstractC1066oOOo0Oo.OooO0Oo()) {
            i = 0;
        }
        if (!this.OooOOO0.OooO0o0()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                getScrollingChildHelper().OooO0oo(i3, 1);
            }
            this.OoooOo0.OooO0O0(i, i2, Integer.MIN_VALUE, null);
        }
    }

    public final void Ooooo0o() {
        int i = this.OooOo00 + 1;
        this.OooOo00 = i;
        if (i != 1 || this.OooOo0O) {
            return;
        }
        this.OooOo0 = false;
    }

    public final void OooooO0(boolean z) {
        if (this.OooOo00 < 1) {
            this.OooOo00 = 1;
        }
        if (!z && !this.OooOo0O) {
            this.OooOo0 = false;
        }
        if (this.OooOo00 == 1) {
            if (z && this.OooOo0 && !this.OooOo0O && this.OooOOO0 != null && this.OooOO0o != null) {
                OooOOOO();
            }
            if (!this.OooOo0O) {
                this.OooOo0 = false;
            }
        }
        this.OooOo00--;
    }

    public final void OooooOO(int i) {
        getScrollingChildHelper().OooO(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            abstractC1066oOOo0Oo.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1068oOOo0OoO) && this.OooOOO0.OooO0o((C1068oOOo0OoO) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0Oo()) {
            return this.OooOOO0.OooOO0(this.Ooooo00);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0Oo()) {
            return this.OooOOO0.OooOO0O(this.Ooooo00);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0Oo()) {
            return this.OooOOO0.OooOO0o(this.Ooooo00);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0o0()) {
            return this.OooOOO0.OooOOO0(this.Ooooo00);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0o0()) {
            return this.OooOOO0.OooOOO(this.Ooooo00);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && abstractC1066oOOo0Oo.OooO0o0()) {
            return this.OooOOO0.OooOOOO(this.Ooooo00);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().OooO0OO(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().OooO0o0(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4 = true;
        super.draw(canvas);
        ArrayList arrayList = this.OooOOO;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1065oOOo0OOo) arrayList.get(i3)).OooO0O0(canvas, this);
        }
        EdgeEffect edgeEffect = this.Oooo000;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.OooO0oO) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.Oooo000;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.Oooo00O;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.OooO0oO) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.Oooo00O;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.Oooo00o;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.OooO0oO) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i, -width);
            EdgeEffect edgeEffect6 = this.Oooo00o;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.Oooo0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.OooO0oO) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.Oooo0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z |= z5;
            canvas.restoreToCount(save4);
        }
        if (z || this.Oooo0O0 == null || arrayList.size() <= 0 || !this.Oooo0O0.OooO0o()) {
            z4 = z;
        }
        if (z4) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x015f, code lost:
        if (r7 > 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x017d, code lost:
        if (r5 > 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0180, code lost:
        if (r7 < 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0183, code lost:
        if (r5 < 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x018c, code lost:
        if ((r5 * r6) < 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0195, code lost:
        if ((r5 * r6) > 0) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            return abstractC1066oOOo0Oo.OooOOo();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + OooOoO0());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            return abstractC1066oOOo0Oo.OooOOoo(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + OooOoO0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1061oOOo0O0O getAdapter() {
        return this.OooOO0o;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            abstractC1066oOOo0Oo.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.OooO0oO;
    }

    public C1085oOOoO0oo getCompatAccessibilityDelegate() {
        return this.OoooooO;
    }

    public C1062oOOo0OO getEdgeEffectFactory() {
        return this.OooOooo;
    }

    public AbstractC1064oOOo0OOO getItemAnimator() {
        return this.Oooo0O0;
    }

    public int getItemDecorationCount() {
        return this.OooOOO.size();
    }

    public AbstractC1066oOOo0Oo getLayoutManager() {
        return this.OooOOO0;
    }

    public int getMaxFlingVelocity() {
        return this.OoooOO0;
    }

    public int getMinFlingVelocity() {
        return this.OoooO;
    }

    public long getNanoTime() {
        if (o0ooOO0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1069oOOo0Ooo getOnFlingListener() {
        return this.OoooO0O;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.OoooOOo;
    }

    public C1073oOOo0o0o getRecycledViewPool() {
        return this.OooO0O0.OooO0OO();
    }

    public int getScrollState() {
        return this.Oooo0OO;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().OooO0oO(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.OooOOo0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.OooOo0O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().OooO0Oo;
    }

    public final void o000oOoO(AbstractC1083oOOoO0o abstractC1083oOOoO0o, oOO0OOO ooo0ooo) {
        abstractC1083oOOoO0o.OooOO0 &= -8193;
        boolean z = this.Ooooo00.OooO0oo;
        C1126oOOooOO c1126oOOooOO = this.OooO0o;
        if (z && abstractC1083oOOoO0o.OooOOO() && !abstractC1083oOOoO0o.OooOO0O() && !abstractC1083oOOoO0o.OooOOo()) {
            ((C0832oO0o0o00) c1126oOOooOO.OooO0OO).OooO0oO(Oooo00O(abstractC1083oOOoO0o), abstractC1083oOOoO0o);
        }
        C1218oOoOOoo c1218oOoOOoo = (C1218oOoOOoo) c1126oOOooOO.OooO0O0;
        C1461oo0O0O c1461oo0O0O = (C1461oo0O0O) c1218oOoOOoo.get(abstractC1083oOOoO0o);
        if (c1461oo0O0O == null) {
            c1461oo0O0O = C1461oo0O0O.OooO00o();
            c1218oOoOOoo.put(abstractC1083oOOoO0o, c1461oo0O0O);
        }
        c1461oo0O0O.OooO0O0 = ooo0ooo;
        c1461oo0O0O.OooO00o |= 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.ninja.engine.o0ooo0o, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.OooOoo = r0
            r1 = 1
            r5.OooOOo0 = r1
            boolean r2 = r5.OooOOoo
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5.OooOOoo = r2
            com.ninja.engine.oOOo0Oo r2 = r5.OooOOO0
            if (r2 == 0) goto L21
            r2.OooO0oO = r1
            r2.OoooO00(r5)
        L21:
            r5.Oooooo = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.o0ooOO0
            if (r0 == 0) goto L76
            java.lang.ThreadLocal r0 = com.ninja.engine.RunnableC0672o0ooo0o.OooO0o0
            java.lang.Object r1 = (Object) r0.get()
            com.ninja.engine.o0ooo0o r1 = (com.ninja.engine.RunnableC0672o0ooo0o) r1
            r5.OoooOoO = r1
            if (r1 != 0) goto L6f
            com.ninja.engine.o0ooo0o r1 = new com.ninja.engine.o0ooo0o
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.OooO00o = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.OooO0Oo = r2
            r5.OoooOoO = r1
            java.util.WeakHashMap r1 = com.ninja.engine.AbstractC1460oo0O00oo.OooO00o
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L61
            if (r1 == 0) goto L61
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L61
            goto L63
        L61:
            r1 = 1114636288(0x42700000, float:60.0)
        L63:
            com.ninja.engine.o0ooo0o r2 = r5.OoooOoO
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.OooO0OO = r3
            r0.set(r2)
        L6f:
            com.ninja.engine.o0ooo0o r0 = r5.OoooOoO
            java.util.ArrayList r0 = r0.OooO00o
            r0.add(r5)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0672o0ooo0o runnableC0672o0ooo0o;
        oO0OO00 oo0oo00;
        super.onDetachedFromWindow();
        AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = this.Oooo0O0;
        if (abstractC1064oOOo0OOO != null) {
            abstractC1064oOOo0OOO.OooO0o0();
        }
        setScrollState(0);
        RunnableC1082oOOoO0Oo runnableC1082oOOoO0Oo = this.OoooOo0;
        runnableC1082oOOoO0Oo.OooO0oO.removeCallbacks(runnableC1082oOOoO0Oo);
        runnableC1082oOOoO0Oo.OooO0OO.abortAnimation();
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && (oo0oo00 = abstractC1066oOOo0Oo.OooO0o0) != null) {
            oo0oo00.OooO();
        }
        this.OooOOo0 = false;
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo2 = this.OooOOO0;
        if (abstractC1066oOOo0Oo2 != null) {
            abstractC1066oOOo0Oo2.OooO0oO = false;
            abstractC1066oOOo0Oo2.OoooO0(this);
        }
        this.o00Ooo.clear();
        removeCallbacks(this.o00o0O);
        this.OooO0o.getClass();
        do {
        } while (C1461oo0O0O.OooO0Oo.OooO() != null);
        if (o0ooOO0 && (runnableC0672o0ooo0o = this.OoooOoO) != null) {
            runnableC0672o0ooo0o.OooO00o.remove(this);
            this.OoooOoO = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.OooOOO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1065oOOo0OOo) arrayList.get(i)).OooO00o(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.ninja.engine.oOOo0Oo r0 = r5.OooOOO0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.OooOo0O
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            com.ninja.engine.oOOo0Oo r0 = r5.OooOOO0
            boolean r0 = r0.OooO0o0()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            com.ninja.engine.oOOo0Oo r3 = r5.OooOOO0
            boolean r3 = r3.OooO0Oo()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            com.ninja.engine.oOOo0Oo r3 = r5.OooOOO0
            boolean r3 = r3.OooO0o0()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            com.ninja.engine.oOOo0Oo r3 = r5.OooOOO0
            boolean r3 = r3.OooO0Oo()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6c:
            float r2 = r5.o000oOoO
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.OoooOOO
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.OoooOo0(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.OooOo0O) {
            return false;
        }
        this.OooOOOo = null;
        if (OooOoo0(motionEvent)) {
            OoooOOo();
            setScrollState(0);
            return true;
        }
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo == null) {
            return false;
        }
        boolean OooO0Oo = abstractC1066oOOo0Oo.OooO0Oo();
        boolean OooO0o0 = this.OooOOO0.OooO0o0();
        if (this.Oooo0o == null) {
            this.Oooo0o = VelocityTracker.obtain();
        }
        this.Oooo0o.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                OoooO0(motionEvent);
                            }
                        } else {
                            this.Oooo0o0 = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.Oooo = x;
                            this.Oooo0oO = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.OoooO00 = y;
                            this.Oooo0oo = y;
                        }
                    } else {
                        OoooOOo();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.Oooo0o0);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.Oooo0OO != 1) {
                        int i = x2 - this.Oooo0oO;
                        int i2 = y2 - this.Oooo0oo;
                        if (OooO0Oo && Math.abs(i) > this.OoooO0) {
                            this.Oooo = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (OooO0o0 && Math.abs(i2) > this.OoooO0) {
                            this.OoooO00 = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.Oooo0o.clear();
                OooooOO(0);
            }
        } else {
            if (this.OooOo0o) {
                this.OooOo0o = false;
            }
            this.Oooo0o0 = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.Oooo = x3;
            this.Oooo0oO = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.OoooO00 = y3;
            this.Oooo0oo = y3;
            if (this.Oooo0OO == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                OooooOO(1);
            }
            int[] iArr = this.o00O0O;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = OooO0Oo;
            if (OooO0o0) {
                i3 = (OooO0Oo ? 1 : 0) | 2;
            }
            getScrollingChildHelper().OooO0oo(i3, 0);
        }
        if (this.Oooo0OO != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = oo000000.OooO00o;
        Trace.beginSection("RV OnLayout");
        OooOOOO();
        Trace.endSection();
        this.OooOOoo = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo == null) {
            OooOOO(i, i2);
            return;
        }
        boolean Oooo0o0 = abstractC1066oOOo0Oo.Oooo0o0();
        C1080oOOoO0O c1080oOOoO0O = this.Ooooo00;
        if (Oooo0o0) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.OooOOO0.OooO0O0.OooOOO(i, i2);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.OooOO0o == null) {
                return;
            }
            if (c1080oOOoO0O.OooO0Oo == 1) {
                OooOOOo();
            }
            this.OooOOO0.oo000o(i, i2);
            c1080oOOoO0O.OooO = true;
            OooOOo0();
            this.OooOOO0.o00oO0O(i, i2);
            if (this.OooOOO0.o0ooOoO()) {
                this.OooOOO0.oo000o(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c1080oOOoO0O.OooO = true;
                OooOOo0();
                this.OooOOO0.o00oO0O(i, i2);
            }
        } else if (this.OooOOo) {
            this.OooOOO0.OooO0O0.OooOOO(i, i2);
        } else {
            if (this.OooOoO0) {
                Ooooo0o();
                Oooo();
                OoooO();
                OoooO00(true);
                if (c1080oOOoO0O.OooOO0O) {
                    c1080oOOoO0O.OooO0oO = true;
                } else {
                    this.OooO0Oo.OooO0Oo();
                    c1080oOOoO0O.OooO0oO = false;
                }
                this.OooOoO0 = false;
                OooooO0(false);
            } else if (c1080oOOoO0O.OooOO0O) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1061oOOo0O0O abstractC1061oOOo0O0O = this.OooOO0o;
            if (abstractC1061oOOo0O0O != null) {
                c1080oOOoO0O.OooO0o0 = abstractC1061oOOo0O0O.OooO00o();
            } else {
                c1080oOOoO0O.OooO0o0 = 0;
            }
            Ooooo0o();
            this.OooOOO0.OooO0O0.OooOOO(i, i2);
            OooooO0(false);
            c1080oOOoO0O.OooO0oO = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Oooo0o0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C1076oOOo0oOO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1076oOOo0oOO c1076oOOo0oOO = (C1076oOOo0oOO) parcelable;
        this.OooO0OO = c1076oOOo0oOO;
        super.onRestoreInstanceState(c1076oOOo0oOO.OooO00o);
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null && (parcelable2 = this.OooO0OO.OooO0OO) != null) {
            abstractC1066oOOo0Oo.OooooO0(parcelable2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOOo0oOO, android.os.Parcelable, com.ninja.engine.OooOOo0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        AbstractC0018OooOOo0 abstractC0018OooOOo0 = new AbstractC0018OooOOo0(super.onSaveInstanceState());
        C1076oOOo0oOO c1076oOOo0oOO = this.OooO0OO;
        if (c1076oOOo0oOO != null) {
            abstractC0018OooOOo0.OooO0OO = c1076oOOo0oOO.OooO0OO;
        } else {
            AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
            if (abstractC1066oOOo0Oo != null) {
                parcelable = abstractC1066oOOo0Oo.OooooOO();
            } else {
                parcelable = null;
            }
            abstractC0018OooOOo0.OooO0OO = parcelable;
        }
        return abstractC0018OooOOo0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.Oooo0 = null;
            this.Oooo00O = null;
            this.Oooo00o = null;
            this.Oooo000 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e1  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC1083oOOoO0o Oooo0 = Oooo0(view);
        if (Oooo0 != null) {
            if (Oooo0.OooOOO0()) {
                Oooo0.OooOO0 &= -257;
            } else if (!Oooo0.OooOOo()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + Oooo0 + OooOoO0());
            }
        }
        view.clearAnimation();
        Oooo0(view);
        super.removeDetachedView(view, z);
    }

    public void publicAttachViewToParent(View child, int index, ViewGroup.LayoutParams params) {
        super.attachViewToParent(child, index, params);
    }

    public void publicDetachViewFromParent(int index) {
        super.detachViewFromParent(index);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        oO0OO00 oo0oo00 = this.OooOOO0.OooO0o0;
        if ((oo0oo00 == null || !oo0oo00.OooO0o0) && !Oooo0o0() && view2 != null) {
            OoooOOO(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.OooOOO0.ooOO(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.OooOOOO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((oO0OO) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.OooOo00 != 0 || this.OooOo0O) {
            this.OooOo0 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo == null || this.OooOo0O) {
            return;
        }
        boolean OooO0Oo = abstractC1066oOOo0Oo.OooO0Oo();
        boolean OooO0o0 = this.OooOOO0.OooO0o0();
        if (OooO0Oo || OooO0o0) {
            if (!OooO0Oo) {
                i = 0;
            }
            if (!OooO0o0) {
                i2 = 0;
            }
            OoooOo0(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        if (Oooo0o0()) {
            int i2 = 0;
            if (accessibilityEvent != null) {
                i = accessibilityEvent.getContentChangeTypes();
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.OooOo |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1085oOOoO0oo c1085oOOoO0oo) {
        this.OoooooO = c1085oOOoO0oo;
        AbstractC1460oo0O00oo.OooOOOo(this, c1085oOOoO0oo);
    }

    public void setAdapter(AbstractC1061oOOo0O0O abstractC1061oOOo0O0O) {
        setLayoutFrozen(false);
        AbstractC1061oOOo0O0O abstractC1061oOOo0O0O2 = this.OooOO0o;
        C1074oOOo0oO c1074oOOo0oO = this.OooO00o;
        if (abstractC1061oOOo0O0O2 != null) {
            abstractC1061oOOo0O0O2.OooO00o.unregisterObserver(c1074oOOo0oO);
            this.OooOO0o.getClass();
        }
        AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = this.Oooo0O0;
        if (abstractC1064oOOo0OOO != null) {
            abstractC1064oOOo0OOO.OooO0o0();
        }
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        if (abstractC1066oOOo0Oo != null) {
            abstractC1066oOOo0Oo.Oooooo(c1070oOOo0o);
            this.OooOOO0.OoooooO(c1070oOOo0o);
        }
        c1070oOOo0o.OooO00o.clear();
        c1070oOOo0o.OooO0Oo();
        o0000OO0 o0000oo0 = this.OooO0Oo;
        o0000oo0.OooOOo((ArrayList) o0000oo0.OooO0OO);
        o0000oo0.OooOOo((ArrayList) o0000oo0.OooO0Oo);
        o0000oo0.OooO00o = 0;
        AbstractC1061oOOo0O0O abstractC1061oOOo0O0O3 = this.OooOO0o;
        this.OooOO0o = abstractC1061oOOo0O0O;
        if (abstractC1061oOOo0O0O != null) {
            abstractC1061oOOo0O0O.OooO00o.registerObserver(c1074oOOo0oO);
        }
        AbstractC1061oOOo0O0O abstractC1061oOOo0O0O4 = this.OooOO0o;
        c1070oOOo0o.OooO00o.clear();
        c1070oOOo0o.OooO0Oo();
        C1073oOOo0o0o OooO0OO = c1070oOOo0o.OooO0OO();
        if (abstractC1061oOOo0O0O3 != null) {
            OooO0OO.OooO0O0--;
        }
        if (OooO0OO.OooO0O0 == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = OooO0OO.OooO00o;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C1072oOOo0o0O) sparseArray.valueAt(i)).OooO00o.clear();
                i++;
            }
        }
        if (abstractC1061oOOo0O0O4 != null) {
            OooO0OO.OooO0O0++;
        }
        this.Ooooo00.OooO0o = true;
        OoooOO0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1063oOOo0OO0 interfaceC1063oOOo0OO0) {
        if (interfaceC1063oOOo0OO0 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.OooO0oO) {
            this.Oooo0 = null;
            this.Oooo00O = null;
            this.Oooo00o = null;
            this.Oooo000 = null;
        }
        this.OooO0oO = z;
        super.setClipToPadding(z);
        if (this.OooOOoo) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1062oOOo0OO c1062oOOo0OO) {
        c1062oOOo0OO.getClass();
        this.OooOooo = c1062oOOo0OO;
        this.Oooo0 = null;
        this.Oooo00O = null;
        this.Oooo00o = null;
        this.Oooo000 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.OooOOo = z;
    }

    public void setItemAnimator(AbstractC1064oOOo0OOO abstractC1064oOOo0OOO) {
        AbstractC1064oOOo0OOO abstractC1064oOOo0OOO2 = this.Oooo0O0;
        if (abstractC1064oOOo0OOO2 != null) {
            abstractC1064oOOo0OOO2.OooO0o0();
            this.Oooo0O0.OooO00o = null;
        }
        this.Oooo0O0 = abstractC1064oOOo0OOO;
        if (abstractC1064oOOo0OOO != null) {
            abstractC1064oOOo0OOO.OooO00o = this.Oooooo0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        c1070oOOo0o.OooO0o0 = i;
        c1070oOOo0o.OooOO0O();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo) {
        C1060oOOo0O0 c1060oOOo0O0;
        oO0OO00 oo0oo00;
        if (abstractC1066oOOo0Oo == this.OooOOO0) {
            return;
        }
        setScrollState(0);
        RunnableC1082oOOoO0Oo runnableC1082oOOoO0Oo = this.OoooOo0;
        runnableC1082oOOoO0Oo.OooO0oO.removeCallbacks(runnableC1082oOOoO0Oo);
        runnableC1082oOOoO0Oo.OooO0OO.abortAnimation();
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo2 = this.OooOOO0;
        if (abstractC1066oOOo0Oo2 != null && (oo0oo00 = abstractC1066oOOo0Oo2.OooO0o0) != null) {
            oo0oo00.OooO();
        }
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo3 = this.OooOOO0;
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        if (abstractC1066oOOo0Oo3 != null) {
            AbstractC1064oOOo0OOO abstractC1064oOOo0OOO = this.Oooo0O0;
            if (abstractC1064oOOo0OOO != null) {
                abstractC1064oOOo0OOO.OooO0o0();
            }
            this.OooOOO0.Oooooo(c1070oOOo0o);
            this.OooOOO0.OoooooO(c1070oOOo0o);
            c1070oOOo0o.OooO00o.clear();
            c1070oOOo0o.OooO0Oo();
            if (this.OooOOo0) {
                AbstractC1066oOOo0Oo abstractC1066oOOo0Oo4 = this.OooOOO0;
                abstractC1066oOOo0Oo4.OooO0oO = false;
                abstractC1066oOOo0Oo4.OoooO0(this);
            }
            this.OooOOO0.o0ooOO0(null);
            this.OooOOO0 = null;
        } else {
            c1070oOOo0o.OooO00o.clear();
            c1070oOOo0o.OooO0Oo();
        }
        C0131o00O0o c0131o00O0o = this.OooO0o0;
        ((o0O000o0) c0131o00O0o.OooO0OO).OooO0oO();
        ArrayList arrayList = (ArrayList) c0131o00O0o.OooO0Oo;
        int size = arrayList.size() - 1;
        while (true) {
            c1060oOOo0O0 = (C1060oOOo0O0) c0131o00O0o.OooO0O0;
            if (size < 0) {
                break;
            }
            c1060oOOo0O0.getClass();
            AbstractC1083oOOoO0o Oooo0 = Oooo0((View) arrayList.get(size));
            if (Oooo0 != null) {
                int i = Oooo0.OooOOOo;
                RecyclerView recyclerView = c1060oOOo0O0.OooO00o;
                if (recyclerView.Oooo0o0()) {
                    Oooo0.OooOOo0 = i;
                    recyclerView.o00Ooo.add(Oooo0);
                } else {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    Oooo0.OooO00o.setImportantForAccessibility(i);
                }
                Oooo0.OooOOOo = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = c1060oOOo0O0.OooO00o;
        int childCount = recyclerView2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView2.getChildAt(i2);
            Oooo0(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.OooOOO0 = abstractC1066oOOo0Oo;
        if (abstractC1066oOOo0Oo != null) {
            if (abstractC1066oOOo0Oo.OooO0O0 == null) {
                abstractC1066oOOo0Oo.o0ooOO0(this);
                if (this.OooOOo0) {
                    AbstractC1066oOOo0Oo abstractC1066oOOo0Oo5 = this.OooOOO0;
                    abstractC1066oOOo0Oo5.OooO0oO = true;
                    abstractC1066oOOo0Oo5.OoooO00(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC1066oOOo0Oo + " is already attached to a RecyclerView:" + abstractC1066oOOo0Oo.OooO0O0.OooOoO0());
            }
        }
        c1070oOOo0o.OooOO0O();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        oOO0OO0O scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.OooO0Oo) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            AbstractC1452oo0O000o.OooOOOO(scrollingChildHelper.OooO0OO);
        }
        scrollingChildHelper.OooO0Oo = z;
    }

    public void setOnFlingListener(AbstractC1069oOOo0Ooo abstractC1069oOOo0Ooo) {
        this.OoooO0O = abstractC1069oOOo0Ooo;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1071oOOo0o0 abstractC1071oOOo0o0) {
        this.Ooooo0o = abstractC1071oOOo0o0;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.OoooOOo = z;
    }

    public void setRecycledViewPool(C1073oOOo0o0o c1073oOOo0o0o) {
        C1073oOOo0o0o c1073oOOo0o0o2;
        C1070oOOo0o c1070oOOo0o = this.OooO0O0;
        if (c1070oOOo0o.OooO0oO != null) {
            c1073oOOo0o0o2.OooO0O0--;
        }
        c1070oOOo0o.OooO0oO = c1073oOOo0o0o;
        if (c1073oOOo0o0o != null && c1070oOOo0o.OooO0oo.getAdapter() != null) {
            c1070oOOo0o.OooO0oO.OooO0O0++;
        }
    }

    public void setScrollState(int i) {
        oO0OO00 oo0oo00;
        if (i == this.Oooo0OO) {
            return;
        }
        this.Oooo0OO = i;
        if (i != 2) {
            RunnableC1082oOOoO0Oo runnableC1082oOOoO0Oo = this.OoooOo0;
            runnableC1082oOOoO0Oo.OooO0oO.removeCallbacks(runnableC1082oOOoO0Oo);
            runnableC1082oOOoO0Oo.OooO0OO.abortAnimation();
            AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
            if (abstractC1066oOOo0Oo != null && (oo0oo00 = abstractC1066oOOo0Oo.OooO0o0) != null) {
                oo0oo00.OooO();
            }
        }
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo2 = this.OooOOO0;
        if (abstractC1066oOOo0Oo2 != null) {
            abstractC1066oOOo0Oo2.OooooOo(i);
        }
        AbstractC1071oOOo0o0 abstractC1071oOOo0o0 = this.Ooooo0o;
        if (abstractC1071oOOo0o0 != null) {
            abstractC1071oOOo0o0.OooO00o(this, i);
        }
        ArrayList arrayList = this.OooooO0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC1071oOOo0o0) this.OooooO0.get(size)).OooO00o(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.OoooO0 = i != 1 ? viewConfiguration.getScaledTouchSlop() : viewConfiguration.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1081oOOoO0OO abstractC1081oOOoO0OO) {
        this.OooO0O0.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().OooO0oo(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().OooO(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        oO0OO00 oo0oo00;
        if (z != this.OooOo0O) {
            OooO("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.OooOo0O = false;
                if (this.OooOo0 && this.OooOOO0 != null && this.OooOO0o != null) {
                    requestLayout();
                }
                this.OooOo0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.OooOo0O = true;
            this.OooOo0o = true;
            setScrollState(0);
            RunnableC1082oOOoO0Oo runnableC1082oOOoO0Oo = this.OoooOo0;
            runnableC1082oOOoO0Oo.OooO0oO.removeCallbacks(runnableC1082oOOoO0Oo);
            runnableC1082oOOoO0Oo.OooO0OO.abortAnimation();
            AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
            if (abstractC1066oOOo0Oo != null && (oo0oo00 = abstractC1066oOOo0Oo.OooO0o0) != null) {
                oo0oo00.OooO();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:43)(11:87|(1:89)|45|46|47|(1:49)(1:66)|50|51|52|53|54)|46|47|(0)(0)|50|51|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0310, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0313, code lost:
        r0 = r3.getConstructor(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0317, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0327, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0328, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0349, code lost:
        throw new java.lang.IllegalStateException(r21.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ce A[Catch: ClassCastException -> 0x02d7, IllegalAccessException -> 0x02da, InstantiationException -> 0x02dd, InvocationTargetException -> 0x02e0, ClassNotFoundException -> 0x02e3, TryCatch #4 {ClassCastException -> 0x02d7, ClassNotFoundException -> 0x02e3, IllegalAccessException -> 0x02da, InstantiationException -> 0x02dd, InvocationTargetException -> 0x02e0, blocks: (B:60:0x02c8, B:62:0x02ce, B:74:0x02ea, B:75:0x02f4, B:81:0x0319, B:79:0x0313, B:83:0x0328, B:84:0x0349, B:73:0x02e6), top: B:104:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e6 A[Catch: ClassCastException -> 0x02d7, IllegalAccessException -> 0x02da, InstantiationException -> 0x02dd, InvocationTargetException -> 0x02e0, ClassNotFoundException -> 0x02e3, TryCatch #4 {ClassCastException -> 0x02d7, ClassNotFoundException -> 0x02e3, IllegalAccessException -> 0x02da, InstantiationException -> 0x02dd, InvocationTargetException -> 0x02e0, blocks: (B:60:0x02c8, B:62:0x02ce, B:74:0x02ea, B:75:0x02f4, B:81:0x0319, B:79:0x0313, B:83:0x0328, B:84:0x0349, B:73:0x02e6), top: B:104:0x02c8 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.ninja.engine.oOOo0OOO, com.ninja.engine.o0OOOo0o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.ninja.engine.oOOo0OO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [com.ninja.engine.oOOoO0O, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = this.OooOOO0;
        if (abstractC1066oOOo0Oo != null) {
            return abstractC1066oOOo0Oo.OooOo00(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + OooOoO0());
    }

    public void setRecyclerListener(InterfaceC1075oOOo0oO0 interfaceC1075oOOo0oO0) {
    }
}




