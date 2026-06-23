package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.ninja.engine.AbstractC1066oOOo0Oo;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0039OoooO;
import com.ninja.engine.C0042OoooO0O;
import com.ninja.engine.C0415o0Oo0O0O;
import com.ninja.engine.C0671o0ooo0O;
import com.ninja.engine.C0767oO0O0ooo;
import com.ninja.engine.C1068oOOo0OoO;
import com.ninja.engine.C1070oOOo0o;
import com.ninja.engine.C1080oOOoO0O;
import com.ninja.engine.C1777ooOOO00O;
import com.ninja.engine.oO0000o0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean OooOooo;
    public final SparseIntArray Oooo0;
    public int Oooo000;
    public int[] Oooo00O;
    public View[] Oooo00o;
    public final SparseIntArray Oooo0O0;
    public final C0415o0Oo0O0O Oooo0OO;
    public final Rect Oooo0o0;

    public GridLayoutManager(int i) {
        super(1);
        this.OooOooo = false;
        this.Oooo000 = -1;
        this.Oooo0 = new SparseIntArray();
        this.Oooo0O0 = new SparseIntArray();
        this.Oooo0OO = new C0415o0Oo0O0O(20);
        this.Oooo0o0 = new Rect();
        o0000ooO(i);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0o(C1068oOOo0OoO c1068oOOo0OoO) {
        return c1068oOOo0OoO instanceof oO0000o0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0O(C1080oOOoO0O c1080oOOoO0O) {
        return o000000O(c1080oOOoO0O);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0o(C1080oOOoO0O c1080oOOoO0O) {
        return o000000o(c1080oOOoO0O);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOO(C1080oOOoO0O c1080oOOoO0O) {
        return o000000O(c1080oOOoO0O);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOOO(C1080oOOoO0O c1080oOOoO0O) {
        return o000000o(c1080oOOoO0O);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOOo() {
        if (this.OooOOOo == 0) {
            return new oO0000o0(-2, -1);
        }
        return new oO0000o0(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOOo0OoO, com.ninja.engine.oO0000o0] */
    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOOoo(Context context, AttributeSet attributeSet) {
        C1068oOOo0OoO c1068oOOo0OoO = new C1068oOOo0OoO(context, attributeSet);
        c1068oOOo0OoO.OooO0o0 = -1;
        c1068oOOo0OoO.OooO0o = 0;
        return c1068oOOo0OoO;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOo(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (this.OooOOOo == 1) {
            return this.Oooo000;
        }
        if (c1080oOOoO0O.OooO0O0() < 1) {
            return 0;
        }
        return o0000oO0(c1080oOOoO0O.OooO0O0() - 1, c1070oOOo0o, c1080oOOoO0O) + 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.oOOo0OoO, com.ninja.engine.oO0000o0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOOo0OoO, com.ninja.engine.oO0000o0] */
    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOo00(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1068oOOo0OoO c1068oOOo0OoO = new C1068oOOo0OoO((ViewGroup.MarginLayoutParams) layoutParams);
            c1068oOOo0OoO.OooO0o0 = -1;
            c1068oOOo0OoO.OooO0o = 0;
            return c1068oOOo0OoO;
        }
        C1068oOOo0OoO c1068oOOo0OoO2 = new C1068oOOo0OoO(layoutParams);
        c1068oOOo0OoO2.OooO0o0 = -1;
        c1068oOOo0OoO2.OooO0o = 0;
        return c1068oOOo0OoO2;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int Oooo0O0(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (this.OooOOOo == 0) {
            return this.Oooo000;
        }
        if (c1080oOOoO0O.OooO0O0() < 1) {
            return 0;
        }
        return o0000oO0(c1080oOOoO0O.OooO0O0() - 1, c1070oOOo0o, c1080oOOoO0O) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
        if (r13 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0109, code lost:
        if (r13 == r5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View OoooO0O(android.view.View r23, int r24, com.ninja.engine.C1070oOOo0o r25, com.ninja.engine.C1080oOOoO0O r26) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.OoooO0O(android.view.View, int, com.ninja.engine.oOOo0o, com.ninja.engine.oOOoO0O):android.view.View");
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOOO(int i, int i2) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        c0415o0Oo0O0O.Oooo000();
        ((SparseIntArray) c0415o0Oo0O0O.OooO0OO).clear();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOOo() {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        c0415o0Oo0O0O.Oooo000();
        ((SparseIntArray) c0415o0Oo0O0O.OooO0OO).clear();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOo0(int i, int i2) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        c0415o0Oo0O0O.Oooo000();
        ((SparseIntArray) c0415o0Oo0O0O.OooO0OO).clear();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOoO(int i, int i2) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        c0415o0Oo0O0O.Oooo000();
        ((SparseIntArray) c0415o0Oo0O0O.OooO0OO).clear();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOoo(int i, int i2) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        c0415o0Oo0O0O.Oooo000();
        ((SparseIntArray) c0415o0Oo0O0O.OooO0OO).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Ooooo00(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        boolean z = c1080oOOoO0O.OooO0oO;
        SparseIntArray sparseIntArray = this.Oooo0O0;
        SparseIntArray sparseIntArray2 = this.Oooo0;
        if (z) {
            int OooOo0O = OooOo0O();
            for (int i = 0; i < OooOo0O; i++) {
                oO0000o0 oo0000o0 = (oO0000o0) OooOo0(i).getLayoutParams();
                int OooO0Oo = oo0000o0.OooO00o.OooO0Oo();
                sparseIntArray2.put(OooO0Oo, oo0000o0.OooO0o);
                sparseIntArray.put(OooO0Oo, oo0000o0.OooO0o0);
            }
        }
        super.Ooooo00(c1070oOOo0o, c1080oOOoO0O);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Ooooo0o(C1080oOOoO0O c1080oOOoO0O) {
        super.Ooooo0o(c1080oOOoO0O);
        this.OooOooo = false;
    }

    public final void o000() {
        int OooOooO;
        int Oooo00O;
        if (this.OooOOOo == 1) {
            OooOooO = this.OooOOO - Oooo000();
            Oooo00O = OooOooo();
        } else {
            OooOooO = this.OooOOOO - OooOooO();
            Oooo00O = Oooo00O();
        }
        o0000o0O(OooOooO - Oooo00O);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View o00000oo(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, int i, int i2, int i3) {
        int i4;
        o00000O0();
        int OooOO0O = this.OooOOo.OooOO0O();
        int OooO0oO = this.OooOOo.OooO0oO();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View OooOo0 = OooOo0(i);
            int Oooo00o = AbstractC1066oOOo0Oo.Oooo00o(OooOo0);
            if (Oooo00o >= 0 && Oooo00o < i3 && o0000oOO(Oooo00o, c1070oOOo0o, c1080oOOoO0O) == 0) {
                if (((C1068oOOo0OoO) OooOo0.getLayoutParams()).OooO00o.OooOO0O()) {
                    if (view2 == null) {
                        view2 = OooOo0;
                    }
                } else if (this.OooOOo.OooO0o0(OooOo0) < OooO0oO && this.OooOOo.OooO0O0(OooOo0) >= OooOO0O) {
                    return OooOo0;
                } else {
                    if (view == null) {
                        view = OooOo0;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
        r22.OooO0O0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v36 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0000O0O(com.ninja.engine.C1070oOOo0o r19, com.ninja.engine.C1080oOOoO0O r20, com.ninja.engine.C0767oO0O0ooo r21, com.ninja.engine.C0766oO0O0ooO r22) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o0000O0O(com.ninja.engine.oOOo0o, com.ninja.engine.oOOoO0O, com.ninja.engine.oO0O0ooo, com.ninja.engine.oO0O0ooO):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000Oo0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.o0000Oo0(false);
    }

    public final int o0000o(int i, int i2) {
        if (this.OooOOOo != 1 || !o0000O0()) {
            int[] iArr = this.Oooo00O;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.Oooo00O;
        int i3 = this.Oooo000;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final void o0000o0O(int i) {
        int i2;
        int[] iArr = this.Oooo00O;
        int i3 = this.Oooo000;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.Oooo00O = iArr;
    }

    public final void o0000o0o() {
        View[] viewArr = this.Oooo00o;
        if (viewArr == null || viewArr.length != this.Oooo000) {
            this.Oooo00o = new View[this.Oooo000];
        }
    }

    public final int o0000oO0(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        boolean z = c1080oOOoO0O.OooO0oO;
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        if (!z) {
            int i2 = this.Oooo000;
            c0415o0Oo0O0O.getClass();
            return C0415o0Oo0O0O.OooOooo(i, i2);
        }
        int OooO0O0 = c1070oOOo0o.OooO0O0(i);
        if (OooO0O0 == -1) {
            return 0;
        }
        int i3 = this.Oooo000;
        c0415o0Oo0O0O.getClass();
        return C0415o0Oo0O0O.OooOooo(OooO0O0, i3);
    }

    public final int o0000oOO(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        boolean z = c1080oOOoO0O.OooO0oO;
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        if (!z) {
            int i2 = this.Oooo000;
            c0415o0Oo0O0O.getClass();
            return i % i2;
        }
        int i3 = this.Oooo0O0.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int OooO0O0 = c1070oOOo0o.OooO0O0(i);
        if (OooO0O0 == -1) {
            return 0;
        }
        int i4 = this.Oooo000;
        c0415o0Oo0O0O.getClass();
        return OooO0O0 % i4;
    }

    public final int o0000oOo(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        boolean z = c1080oOOoO0O.OooO0oO;
        C0415o0Oo0O0O c0415o0Oo0O0O = this.Oooo0OO;
        if (!z) {
            c0415o0Oo0O0O.getClass();
            return 1;
        }
        int i2 = this.Oooo0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c1070oOOo0o.OooO0O0(i) == -1) {
            return 1;
        }
        c0415o0Oo0O0O.getClass();
        return 1;
    }

    public final void o0000oo0(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean o0ooOOo;
        oO0000o0 oo0000o0 = (oO0000o0) view.getLayoutParams();
        Rect rect = oo0000o0.OooO0O0;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oo0000o0).topMargin + ((ViewGroup.MarginLayoutParams) oo0000o0).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oo0000o0).leftMargin + ((ViewGroup.MarginLayoutParams) oo0000o0).rightMargin;
        int o0000o = o0000o(oo0000o0.OooO0o0, oo0000o0.OooO0o);
        if (this.OooOOOo == 1) {
            i3 = AbstractC1066oOOo0Oo.OooOo0o(false, o0000o, i, i5, ((ViewGroup.MarginLayoutParams) oo0000o0).width);
            i2 = AbstractC1066oOOo0Oo.OooOo0o(true, this.OooOOo.OooOO0o(), this.OooOOO0, i4, ((ViewGroup.MarginLayoutParams) oo0000o0).height);
        } else {
            int OooOo0o = AbstractC1066oOOo0Oo.OooOo0o(false, o0000o, i, i4, ((ViewGroup.MarginLayoutParams) oo0000o0).height);
            int OooOo0o2 = AbstractC1066oOOo0Oo.OooOo0o(true, this.OooOOo.OooOO0o(), this.OooOO0o, i5, ((ViewGroup.MarginLayoutParams) oo0000o0).width);
            i2 = OooOo0o;
            i3 = OooOo0o2;
        }
        C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
        if (z) {
            o0ooOOo = o0OOO0o(view, i3, i2, c1068oOOo0OoO);
        } else {
            o0ooOOo = o0ooOOo(view, i3, i2, c1068oOOo0OoO);
        }
        if (o0ooOOo) {
            view.measure(i3, i2);
        }
    }

    public final void o0000ooO(int i) {
        if (i == this.Oooo000) {
            return;
        }
        this.OooOooo = true;
        if (i >= 1) {
            this.Oooo000 = i;
            this.Oooo0OO.Oooo000();
            o00O0O();
            return;
        }
        throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Span count should be at least 1. Provided "));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o000OO(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, C1777ooOOO00O c1777ooOOO00O, int i) {
        boolean z;
        o000();
        if (c1080oOOoO0O.OooO0O0() > 0 && !c1080oOOoO0O.OooO0oO) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int o0000oOO = o0000oOO(c1777ooOOO00O.OooO0O0, c1070oOOo0o, c1080oOOoO0O);
            if (z) {
                while (o0000oOO > 0) {
                    int i2 = c1777ooOOO00O.OooO0O0;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1777ooOOO00O.OooO0O0 = i3;
                    o0000oOO = o0000oOO(i3, c1070oOOo0o, c1080oOOoO0O);
                }
            } else {
                int OooO0O0 = c1080oOOoO0O.OooO0O0() - 1;
                int i4 = c1777ooOOO00O.OooO0O0;
                while (i4 < OooO0O0) {
                    int i5 = i4 + 1;
                    int o0000oOO2 = o0000oOO(i5, c1070oOOo0o, c1080oOOoO0O);
                    if (o0000oOO2 <= o0000oOO) {
                        break;
                    }
                    i4 = i5;
                    o0000oOO = o0000oOO2;
                }
                c1777ooOOO00O.OooO0O0 = i4;
            }
        }
        o0000o0o();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o000OOo(C1080oOOoO0O c1080oOOoO0O, C0767oO0O0ooo c0767oO0O0ooo, C0671o0ooo0O c0671o0ooo0O) {
        int i;
        int i2 = this.Oooo000;
        for (int i3 = 0; i3 < this.Oooo000 && (i = c0767oO0O0ooo.OooO0Oo) >= 0 && i < c1080oOOoO0O.OooO0O0() && i2 > 0; i3++) {
            c0671o0ooo0O.OooO00o(c0767oO0O0ooo.OooO0Oo, Math.max(0, c0767oO0O0ooo.OooO0oO));
            this.Oooo0OO.getClass();
            i2--;
            c0767oO0O0ooo.OooO0Oo += c0767oO0O0ooo.OooO0o0;
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o000oOoO(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, View view, C0039OoooO c0039OoooO) {
        C0042OoooO0O OooO00o;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof oO0000o0)) {
            OoooOO0(view, c0039OoooO);
            return;
        }
        oO0000o0 oo0000o0 = (oO0000o0) layoutParams;
        int o0000oO0 = o0000oO0(oo0000o0.OooO00o.OooO0Oo(), c1070oOOo0o, c1080oOOoO0O);
        if (this.OooOOOo == 0) {
            OooO00o = C0042OoooO0O.OooO00o(false, oo0000o0.OooO0o0, oo0000o0.OooO0o, o0000oO0, 1);
        } else {
            OooO00o = C0042OoooO0O.OooO00o(false, o0000oO0, 1, oo0000o0.OooO0o0, oo0000o0.OooO0o);
        }
        c0039OoooO.OooO(OooO00o);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final int o00Oo0(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        o000();
        o0000o0o();
        return super.o00Oo0(i, c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final int o00o0O(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        o000();
        o0000o0o();
        return super.o00o0O(i, c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o00oO0o(Rect rect, int i, int i2) {
        int OooO0oO;
        int OooO0oO2;
        if (this.Oooo00O == null) {
            super.o00oO0o(rect, i, i2);
        }
        int Oooo000 = Oooo000() + OooOooo();
        int OooOooO = OooOooO() + Oooo00O();
        if (this.OooOOOo == 1) {
            int height = rect.height() + OooOooO;
            RecyclerView recyclerView = this.OooO0O0;
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            OooO0oO2 = AbstractC1066oOOo0Oo.OooO0oO(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.Oooo00O;
            OooO0oO = AbstractC1066oOOo0Oo.OooO0oO(i, iArr[iArr.length - 1] + Oooo000, this.OooO0O0.getMinimumWidth());
        } else {
            int width = rect.width() + Oooo000;
            RecyclerView recyclerView2 = this.OooO0O0;
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            OooO0oO = AbstractC1066oOOo0Oo.OooO0oO(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.Oooo00O;
            OooO0oO2 = AbstractC1066oOOo0Oo.OooO0oO(i2, iArr2[iArr2.length - 1] + OooOooO, this.OooO0O0.getMinimumHeight());
        }
        this.OooO0O0.setMeasuredDimension(OooO0oO, OooO0oO2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean oo0o0Oo() {
        return this.OooOoO == null && !this.OooOooo;
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.OooOooo = false;
        this.Oooo000 = -1;
        this.Oooo0 = new SparseIntArray();
        this.Oooo0O0 = new SparseIntArray();
        this.Oooo0OO = new C0415o0Oo0O0O(20);
        this.Oooo0o0 = new Rect();
        o0000ooO(AbstractC1066oOOo0Oo.Oooo0(context, attributeSet, i, i2).OooO0O0);
    }
}


