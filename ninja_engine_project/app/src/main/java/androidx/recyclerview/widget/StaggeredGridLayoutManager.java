package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.ninja.engine.AbstractC0462o0OoOoo;
import com.ninja.engine.AbstractC1066oOOo0Oo;
import com.ninja.engine.AbstractC1137oOOoooO;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.C0039OoooO;
import com.ninja.engine.C0042OoooO0O;
import com.ninja.engine.C0671o0ooo0O;
import com.ninja.engine.C0839oO0o0ooO;
import com.ninja.engine.C1067oOOo0Oo0;
import com.ninja.engine.C1068oOOo0OoO;
import com.ninja.engine.C1070oOOo0o;
import com.ninja.engine.C1080oOOoO0O;
import com.ninja.engine.C1126oOOooOO;
import com.ninja.engine.C1246oOoOoo0;
import com.ninja.engine.C1247oOoOoo00;
import com.ninja.engine.C1328oOooo0O0;
import com.ninja.engine.InterfaceC1078oOOo0oo0;
import com.ninja.engine.o00000OO;
import com.ninja.engine.oO0O000o;
import com.ninja.engine.oO0OO00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1066oOOo0Oo implements InterfaceC1078oOOo0oo0 {
    public final int OooOOOo;
    public final AbstractC0462o0OoOoo OooOOo;
    public final C0839oO0o0ooO[] OooOOo0;
    public final AbstractC0462o0OoOoo OooOOoo;
    public int OooOo0;
    public final int OooOo00;
    public final oO0O000o OooOo0O;
    public boolean OooOo0o;
    public final BitSet OooOoO0;
    public final int OooOoo;
    public final C1126oOOooOO OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;
    public final boolean Oooo0;
    public C1328oOooo0O0 Oooo000;
    public final Rect Oooo00O;
    public final C1247oOoOoo00 Oooo00o;
    public int[] Oooo0O0;
    public final o00000OO Oooo0OO;
    public boolean OooOo = false;
    public int OooOoO = -1;
    public int OooOoOO = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r7v3, types: [com.ninja.engine.oO0O000o, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.OooOOOo = -1;
        this.OooOo0o = false;
        C1126oOOooOO c1126oOOooOO = new C1126oOOooOO(3);
        this.OooOoo0 = c1126oOOooOO;
        this.OooOoo = 2;
        this.Oooo00O = new Rect();
        this.Oooo00o = new C1247oOoOoo00(this);
        this.Oooo0 = true;
        this.Oooo0OO = new o00000OO(14, this);
        C1067oOOo0Oo0 Oooo0 = AbstractC1066oOOo0Oo.Oooo0(context, attributeSet, i, i2);
        int i3 = Oooo0.OooO00o;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        OooO0OO(null);
        if (i3 != this.OooOo00) {
            this.OooOo00 = i3;
            AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
            this.OooOOo = this.OooOOoo;
            this.OooOOoo = abstractC0462o0OoOoo;
            o00O0O();
        }
        int i4 = Oooo0.OooO0O0;
        OooO0OO(null);
        if (i4 != this.OooOOOo) {
            int[] iArr = (int[]) c1126oOOooOO.OooO0O0;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1126oOOooOO.OooO0OO = null;
            o00O0O();
            this.OooOOOo = i4;
            this.OooOoO0 = new BitSet(this.OooOOOo);
            this.OooOOo0 = new C0839oO0o0ooO[this.OooOOOo];
            for (int i5 = 0; i5 < this.OooOOOo; i5++) {
                this.OooOOo0[i5] = new C0839oO0o0ooO(this, i5);
            }
            o00O0O();
        }
        boolean z = Oooo0.OooO0OO;
        OooO0OO(null);
        C1328oOooo0O0 c1328oOooo0O0 = this.Oooo000;
        if (c1328oOooo0O0 != null && c1328oOooo0O0.OooO0oo != z) {
            c1328oOooo0O0.OooO0oo = z;
        }
        this.OooOo0o = z;
        o00O0O();
        Object obj = new Object();
        obj.OooO00o = true;
        obj.OooO0o = 0;
        obj.OooO0oO = 0;
        this.OooOo0O = obj;
        this.OooOOo = AbstractC0462o0OoOoo.OooO00o(this, this.OooOo00);
        this.OooOOoo = AbstractC0462o0OoOoo.OooO00o(this, 1 - this.OooOo00);
    }

    public static int o0000o0(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    @Override // com.ninja.engine.InterfaceC1078oOOo0oo0
    public final PointF OooO00o(int i) {
        int o0O0O00 = o0O0O00(i);
        PointF pointF = new PointF();
        if (o0O0O00 == 0) {
            return null;
        }
        if (this.OooOo00 == 0) {
            pointF.x = o0O0O00;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = o0O0O00;
        }
        return pointF;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooO0OO(String str) {
        if (this.Oooo000 == null) {
            super.OooO0OO(str);
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0Oo() {
        return this.OooOo00 == 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0o(C1068oOOo0OoO c1068oOOo0OoO) {
        return c1068oOOo0OoO instanceof C1246oOoOoo0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0o0() {
        return this.OooOo00 == 1;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooO0oo(int i, int i2, C1080oOOoO0O c1080oOOoO0O, C0671o0ooo0O c0671o0ooo0O) {
        oO0O000o oo0o000o;
        int OooO0oO;
        int i3;
        if (this.OooOo00 != 0) {
            i = i2;
        }
        if (OooOo0O() != 0 && i != 0) {
            o000OO(i, c1080oOOoO0O);
            int[] iArr = this.Oooo0O0;
            if (iArr == null || iArr.length < this.OooOOOo) {
                this.Oooo0O0 = new int[this.OooOOOo];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = this.OooOOOo;
                oo0o000o = this.OooOo0O;
                if (i4 >= i6) {
                    break;
                }
                if (oo0o000o.OooO0Oo == -1) {
                    OooO0oO = oo0o000o.OooO0o;
                    i3 = this.OooOOo0[i4].OooO(OooO0oO);
                } else {
                    OooO0oO = this.OooOOo0[i4].OooO0oO(oo0o000o.OooO0oO);
                    i3 = oo0o000o.OooO0oO;
                }
                int i7 = OooO0oO - i3;
                if (i7 >= 0) {
                    this.Oooo0O0[i5] = i7;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.Oooo0O0, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = oo0o000o.OooO0OO;
                if (i9 >= 0 && i9 < c1080oOOoO0O.OooO0O0()) {
                    c0671o0ooo0O.OooO00o(oo0o000o.OooO0OO, this.Oooo0O0[i8]);
                    oo0o000o.OooO0OO += oo0o000o.OooO0Oo;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0(C1080oOOoO0O c1080oOOoO0O) {
        return o000000(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0O(C1080oOOoO0O c1080oOOoO0O) {
        return o000000O(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0o(C1080oOOoO0O c1080oOOoO0O) {
        return o000000o(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOO(C1080oOOoO0O c1080oOOoO0O) {
        return o000000O(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOO0(C1080oOOoO0O c1080oOOoO0O) {
        return o000000(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOOO(C1080oOOoO0O c1080oOOoO0O) {
        return o000000o(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOOo() {
        if (this.OooOo00 == 0) {
            return new C1068oOOo0OoO(-2, -1);
        }
        return new C1068oOOo0OoO(-1, -2);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOOoo(Context context, AttributeSet attributeSet) {
        return new C1068oOOo0OoO(context, attributeSet);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOo(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (this.OooOo00 == 1) {
            return this.OooOOOo;
        }
        return super.OooOo(c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final C1068oOOo0OoO OooOo00(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1068oOOo0OoO((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1068oOOo0OoO(layoutParams);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Oooo(int i) {
        super.Oooo(i);
        for (int i2 = 0; i2 < this.OooOOOo; i2++) {
            C0839oO0o0ooO c0839oO0o0ooO = this.OooOOo0[i2];
            int i3 = c0839oO0o0ooO.OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                c0839oO0o0ooO.OooO0O0 = i3 + i;
            }
            int i4 = c0839oO0o0ooO.OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                c0839oO0o0ooO.OooO0OO = i4 + i;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int Oooo0O0(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (this.OooOo00 == 0) {
            return this.OooOOOo;
        }
        return super.Oooo0O0(c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean Oooo0o0() {
        return this.OooOoo != 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Oooo0oo(int i) {
        super.Oooo0oo(i);
        for (int i2 = 0; i2 < this.OooOOOo; i2++) {
            C0839oO0o0ooO c0839oO0o0ooO = this.OooOOo0[i2];
            int i3 = c0839oO0o0ooO.OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                c0839oO0o0ooO.OooO0O0 = i3 + i;
            }
            int i4 = c0839oO0o0ooO.OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                c0839oO0o0ooO.OooO0OO = i4 + i;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO(AccessibilityEvent accessibilityEvent) {
        super.OoooO(accessibilityEvent);
        if (OooOo0O() > 0) {
            View o00000O = o00000O(false);
            View o00000O0 = o00000O0(false);
            if (o00000O == null || o00000O0 == null) {
                return;
            }
            int Oooo00o = AbstractC1066oOOo0Oo.Oooo00o(o00000O);
            int Oooo00o2 = AbstractC1066oOOo0Oo.Oooo00o(o00000O0);
            if (Oooo00o < Oooo00o2) {
                accessibilityEvent.setFromIndex(Oooo00o);
                accessibilityEvent.setToIndex(Oooo00o2);
                return;
            }
            accessibilityEvent.setFromIndex(Oooo00o2);
            accessibilityEvent.setToIndex(Oooo00o);
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO0(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.OooO0O0;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.Oooo0OO);
        }
        for (int i = 0; i < this.OooOOOo; i++) {
            this.OooOOo0[i].OooO0O0();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
        if (r8.OooOo00 == 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
        if (r8.OooOo00 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x005e, code lost:
        if (o0000oo() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006b, code lost:
        if (o0000oo() == false) goto L115;
     */
    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View OoooO0O(android.view.View r9, int r10, com.ninja.engine.C1070oOOo0o r11, com.ninja.engine.C1080oOOoO0O r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OoooO0O(android.view.View, int, com.ninja.engine.oOOo0o, com.ninja.engine.oOOoO0O):android.view.View");
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOOO(int i, int i2) {
        o0000(i, i2, 1);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOOo() {
        C1126oOOooOO c1126oOOooOO = this.OooOoo0;
        int[] iArr = (int[]) c1126oOOooOO.OooO0O0;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c1126oOOooOO.OooO0OO = null;
        o00O0O();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOo0(int i, int i2) {
        o0000(i, i2, 8);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOoO(int i, int i2) {
        o0000(i, i2, 2);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooOoo(int i, int i2) {
        o0000(i, i2, 4);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Ooooo00(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        o0000O0(c1070oOOo0o, c1080oOOoO0O, true);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void Ooooo0o(C1080oOOoO0O c1080oOOoO0O) {
        this.OooOoO = -1;
        this.OooOoOO = Integer.MIN_VALUE;
        this.Oooo000 = null;
        this.Oooo00o.OooO00o();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooooO0(Parcelable parcelable) {
        if (parcelable instanceof C1328oOooo0O0) {
            this.Oooo000 = (C1328oOooo0O0) parcelable;
            o00O0O();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.oOooo0O0, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.ninja.engine.oOooo0O0, android.os.Parcelable, java.lang.Object] */
    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final Parcelable OooooOO() {
        int o00000o0;
        View o00000O;
        int OooO;
        int OooOO0O;
        int[] iArr;
        C1328oOooo0O0 c1328oOooo0O0 = this.Oooo000;
        if (c1328oOooo0O0 != null) {
            Object obj = new Object();
            obj.OooO0OO = c1328oOooo0O0.OooO0OO;
            obj.OooO00o = c1328oOooo0O0.OooO00o;
            obj.OooO0O0 = c1328oOooo0O0.OooO0O0;
            obj.OooO0Oo = c1328oOooo0O0.OooO0Oo;
            obj.OooO0o0 = c1328oOooo0O0.OooO0o0;
            obj.OooO0o = c1328oOooo0O0.OooO0o;
            obj.OooO0oo = c1328oOooo0O0.OooO0oo;
            obj.OooO = c1328oOooo0O0.OooO;
            obj.OooOO0 = c1328oOooo0O0.OooOO0;
            obj.OooO0oO = c1328oOooo0O0.OooO0oO;
            return obj;
        }
        Object obj2 = new Object();
        obj2.OooO0oo = this.OooOo0o;
        obj2.OooO = this.OooOooO;
        obj2.OooOO0 = this.OooOooo;
        C1126oOOooOO c1126oOOooOO = this.OooOoo0;
        if (c1126oOOooOO != null && (iArr = (int[]) c1126oOOooOO.OooO0O0) != null) {
            obj2.OooO0o = iArr;
            obj2.OooO0o0 = iArr.length;
            obj2.OooO0oO = (List) c1126oOOooOO.OooO0OO;
        } else {
            obj2.OooO0o0 = 0;
        }
        int i = -1;
        if (OooOo0O() > 0) {
            if (this.OooOooO) {
                o00000o0 = o0000Ooo();
            } else {
                o00000o0 = o00000o0();
            }
            obj2.OooO00o = o00000o0;
            if (this.OooOo) {
                o00000O = o00000O0(true);
            } else {
                o00000O = o00000O(true);
            }
            if (o00000O != null) {
                i = AbstractC1066oOOo0Oo.Oooo00o(o00000O);
            }
            obj2.OooO0O0 = i;
            int i2 = this.OooOOOo;
            obj2.OooO0OO = i2;
            obj2.OooO0Oo = new int[i2];
            for (int i3 = 0; i3 < this.OooOOOo; i3++) {
                if (this.OooOooO) {
                    OooO = this.OooOOo0[i3].OooO0oO(Integer.MIN_VALUE);
                    if (OooO != Integer.MIN_VALUE) {
                        OooOO0O = this.OooOOo.OooO0oO();
                        OooO -= OooOO0O;
                        obj2.OooO0Oo[i3] = OooO;
                    } else {
                        obj2.OooO0Oo[i3] = OooO;
                    }
                } else {
                    OooO = this.OooOOo0[i3].OooO(Integer.MIN_VALUE);
                    if (OooO != Integer.MIN_VALUE) {
                        OooOO0O = this.OooOOo.OooOO0O();
                        OooO -= OooOO0O;
                        obj2.OooO0Oo[i3] = OooO;
                    } else {
                        obj2.OooO0Oo[i3] = OooO;
                    }
                }
            }
        } else {
            obj2.OooO00o = -1;
            obj2.OooO0O0 = -1;
            obj2.OooO0OO = 0;
        }
        return obj2;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooooOo(int i) {
        if (i == 0) {
            o000OOo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0000(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.OooOo
            if (r0 == 0) goto L9
            int r0 = r7.o0000Ooo()
            goto Ld
        L9:
            int r0 = r7.o00000o0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            com.ninja.engine.oOOooOO r4 = r7.OooOoo0
            r4.OooOOO0(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.OooOOOo(r8, r5)
            r4.OooOOOO(r9, r5)
            goto L3a
        L33:
            r4.OooOOOo(r8, r9)
            goto L3a
        L37:
            r4.OooOOOO(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.OooOo
            if (r8 == 0) goto L46
            int r8 = r7.o00000o0()
            goto L4a
        L46:
            int r8 = r7.o0000Ooo()
        L4a:
            if (r3 > r8) goto L4f
            r7.o00O0O()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000(int, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    public final int o00000(C1070oOOo0o c1070oOOo0o, oO0O000o oo0o000o, C1080oOOoO0O c1080oOOoO0O) {
        int i;
        int OooOO0O;
        boolean z;
        int o00000oO;
        int i2;
        C0839oO0o0ooO c0839oO0o0ooO;
        Object r6 = null;
        int i3;
        int OooO;
        int OooO0OO;
        int OooOO0O2;
        int OooO0OO2;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        this.OooOoO0.set(0, this.OooOOOo, true);
        oO0O000o oo0o000o2 = this.OooOo0O;
        if (oo0o000o2.OooO) {
            if (oo0o000o.OooO0o0 == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (oo0o000o.OooO0o0 == 1) {
            i = oo0o000o.OooO0oO + oo0o000o.OooO0O0;
        } else {
            i = oo0o000o.OooO0o - oo0o000o.OooO0O0;
        }
        int i8 = oo0o000o.OooO0o0;
        for (int i9 = 0; i9 < this.OooOOOo; i9++) {
            if (!((ArrayList) this.OooOOo0[i9].OooO0o).isEmpty()) {
                o0000OoO(this.OooOOo0[i9], i8, i);
            }
        }
        if (this.OooOo) {
            OooOO0O = this.OooOOo.OooO0oO();
        } else {
            OooOO0O = this.OooOOo.OooOO0O();
        }
        boolean z2 = false;
        while (true) {
            int i10 = oo0o000o.OooO0OO;
            if (i10 >= 0 && i10 < c1080oOOoO0O.OooO0O0()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!oo0o000o2.OooO && this.OooOoO0.isEmpty())) {
                break;
            }
            View view = c1070oOOo0o.OooO(oo0o000o.OooO0OO, Long.MAX_VALUE).OooO00o;
            oo0o000o.OooO0OO += oo0o000o.OooO0Oo;
            C1246oOoOoo0 c1246oOoOoo0 = (C1246oOoOoo0) view.getLayoutParams();
            int OooO0Oo = c1246oOoOoo0.OooO00o.OooO0Oo();
            C1126oOOooOO c1126oOOooOO = this.OooOoo0;
            int[] iArr = (int[]) c1126oOOooOO.OooO0O0;
            if (iArr != null && OooO0Oo < iArr.length) {
                i2 = iArr[OooO0Oo];
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                if (o0000O0O(oo0o000o.OooO0o0)) {
                    i5 = this.OooOOOo - i7;
                    i4 = -1;
                    i6 = -1;
                } else {
                    i4 = this.OooOOOo;
                    i5 = 0;
                    i6 = 1;
                }
                C0839oO0o0ooO c0839oO0o0ooO2 = null;
                if (oo0o000o.OooO0o0 == i7) {
                    int OooOO0O3 = this.OooOOo.OooOO0O();
                    int i11 = Integer.MAX_VALUE;
                    while (i5 != i4) {
                        C0839oO0o0ooO c0839oO0o0ooO3 = this.OooOOo0[i5];
                        int OooO0oO = c0839oO0o0ooO3.OooO0oO(OooOO0O3);
                        if (OooO0oO < i11) {
                            i11 = OooO0oO;
                            c0839oO0o0ooO2 = c0839oO0o0ooO3;
                        }
                        i5 += i6;
                    }
                } else {
                    int OooO0oO2 = this.OooOOo.OooO0oO();
                    int i12 = Integer.MIN_VALUE;
                    while (i5 != i4) {
                        C0839oO0o0ooO c0839oO0o0ooO4 = this.OooOOo0[i5];
                        int OooO2 = c0839oO0o0ooO4.OooO(OooO0oO2);
                        if (OooO2 > i12) {
                            c0839oO0o0ooO2 = c0839oO0o0ooO4;
                            i12 = OooO2;
                        }
                        i5 += i6;
                    }
                }
                c0839oO0o0ooO = c0839oO0o0ooO2;
                c1126oOOooOO.OooO0oO(OooO0Oo);
                ((int[]) c1126oOOooOO.OooO0O0)[OooO0Oo] = c0839oO0o0ooO.OooO0o0;
            } else {
                c0839oO0o0ooO = this.OooOOo0[i2];
            }
            c1246oOoOoo0.OooO0o0 = c0839oO0o0ooO;
            if (oo0o000o.OooO0o0 == 1) {
                r6 = 0;
                OooO0O0(view, -1, false);
            } else {
                r6 = 0;
                OooO0O0(view, 0, false);
            }
            if (this.OooOo00 == 1) {
                i3 = 1;
                o0000oO(view, AbstractC1066oOOo0Oo.OooOo0o(r6, this.OooOo0, this.OooOO0o, r6, ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).width), AbstractC1066oOOo0Oo.OooOo0o(true, this.OooOOOO, this.OooOOO0, OooOooO() + Oooo00O(), ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).height));
            } else {
                i3 = 1;
                o0000oO(view, AbstractC1066oOOo0Oo.OooOo0o(true, this.OooOOO, this.OooOO0o, Oooo000() + OooOooo(), ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).width), AbstractC1066oOOo0Oo.OooOo0o(false, this.OooOo0, this.OooOOO0, 0, ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).height));
            }
            if (oo0o000o.OooO0o0 == i3) {
                OooO0OO = c0839oO0o0ooO.OooO0oO(OooOO0O);
                OooO = this.OooOOo.OooO0OO(view) + OooO0OO;
            } else {
                OooO = c0839oO0o0ooO.OooO(OooOO0O);
                OooO0OO = OooO - this.OooOOo.OooO0OO(view);
            }
            if (oo0o000o.OooO0o0 == 1) {
                C0839oO0o0ooO c0839oO0o0ooO5 = c1246oOoOoo0.OooO0o0;
                c0839oO0o0ooO5.getClass();
                C1246oOoOoo0 c1246oOoOoo02 = (C1246oOoOoo0) view.getLayoutParams();
                c1246oOoOoo02.OooO0o0 = c0839oO0o0ooO5;
                ArrayList arrayList = (ArrayList) c0839oO0o0ooO5.OooO0o;
                arrayList.add(view);
                c0839oO0o0ooO5.OooO0OO = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0839oO0o0ooO5.OooO0O0 = Integer.MIN_VALUE;
                }
                if (c1246oOoOoo02.OooO00o.OooOO0O() || c1246oOoOoo02.OooO00o.OooOOO()) {
                    c0839oO0o0ooO5.OooO0Oo = ((StaggeredGridLayoutManager) c0839oO0o0ooO5.OooO0oO).OooOOo.OooO0OO(view) + c0839oO0o0ooO5.OooO0Oo;
                }
            } else {
                C0839oO0o0ooO c0839oO0o0ooO6 = c1246oOoOoo0.OooO0o0;
                c0839oO0o0ooO6.getClass();
                C1246oOoOoo0 c1246oOoOoo03 = (C1246oOoOoo0) view.getLayoutParams();
                c1246oOoOoo03.OooO0o0 = c0839oO0o0ooO6;
                ArrayList arrayList2 = (ArrayList) c0839oO0o0ooO6.OooO0o;
                arrayList2.add(0, view);
                c0839oO0o0ooO6.OooO0O0 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0839oO0o0ooO6.OooO0OO = Integer.MIN_VALUE;
                }
                if (c1246oOoOoo03.OooO00o.OooOO0O() || c1246oOoOoo03.OooO00o.OooOOO()) {
                    c0839oO0o0ooO6.OooO0Oo = ((StaggeredGridLayoutManager) c0839oO0o0ooO6.OooO0oO).OooOOo.OooO0OO(view) + c0839oO0o0ooO6.OooO0Oo;
                }
            }
            if (o0000oo() && this.OooOo00 == 1) {
                OooO0OO2 = this.OooOOoo.OooO0oO() - (((this.OooOOOo - 1) - c0839oO0o0ooO.OooO0o0) * this.OooOo0);
                OooOO0O2 = OooO0OO2 - this.OooOOoo.OooO0OO(view);
            } else {
                OooOO0O2 = this.OooOOoo.OooOO0O() + (c0839oO0o0ooO.OooO0o0 * this.OooOo0);
                OooO0OO2 = this.OooOOoo.OooO0OO(view) + OooOO0O2;
            }
            if (this.OooOo00 == 1) {
                AbstractC1066oOOo0Oo.Oooo0oO(view, OooOO0O2, OooO0OO, OooO0OO2, OooO);
            } else {
                AbstractC1066oOOo0Oo.Oooo0oO(view, OooO0OO, OooOO0O2, OooO, OooO0OO2);
            }
            o0000OoO(c0839oO0o0ooO, oo0o000o2.OooO0o0, i);
            o0000O(c1070oOOo0o, oo0o000o2);
            if (oo0o000o2.OooO0oo && view.hasFocusable()) {
                this.OooOoO0.set(c0839oO0o0ooO.OooO0o0, false);
            }
            i7 = 1;
            z2 = true;
        }
        if (!z2) {
            o0000O(c1070oOOo0o, oo0o000o2);
        }
        if (oo0o000o2.OooO0o0 == -1) {
            o00000oO = this.OooOOo.OooOO0O() - o00000oo(this.OooOOo.OooOO0O());
        } else {
            o00000oO = o00000oO(this.OooOOo.OooO0oO()) - this.OooOOo.OooO0oO();
        }
        if (o00000oO > 0) {
            return Math.min(oo0o000o.OooO0O0, o00000oO);
        }
        return 0;
    }

    public final int o000000(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0) {
            return 0;
        }
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
        boolean z = this.Oooo0;
        return AbstractC1137oOOoooO.OooO0O0(c1080oOOoO0O, abstractC0462o0OoOoo, o00000O(!z), o00000O0(!z), this, this.Oooo0);
    }

    public final int o000000O(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0) {
            return 0;
        }
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
        boolean z = this.Oooo0;
        return AbstractC1137oOOoooO.OooO0OO(c1080oOOoO0O, abstractC0462o0OoOoo, o00000O(!z), o00000O0(!z), this, this.Oooo0, this.OooOo);
    }

    public final int o000000o(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0) {
            return 0;
        }
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
        boolean z = this.Oooo0;
        return AbstractC1137oOOoooO.OooO0Oo(c1080oOOoO0O, abstractC0462o0OoOoo, o00000O(!z), o00000O0(!z), this, this.Oooo0);
    }

    public final View o00000O(boolean z) {
        int OooOO0O = this.OooOOo.OooOO0O();
        int OooO0oO = this.OooOOo.OooO0oO();
        int OooOo0O = OooOo0O();
        View view = null;
        for (int i = 0; i < OooOo0O; i++) {
            View OooOo0 = OooOo0(i);
            int OooO0o0 = this.OooOOo.OooO0o0(OooOo0);
            if (this.OooOOo.OooO0O0(OooOo0) > OooOO0O && OooO0o0 < OooO0oO) {
                if (OooO0o0 >= OooOO0O || !z) {
                    return OooOo0;
                }
                if (view == null) {
                    view = OooOo0;
                }
            }
        }
        return view;
    }

    public final View o00000O0(boolean z) {
        int OooOO0O = this.OooOOo.OooOO0O();
        int OooO0oO = this.OooOOo.OooO0oO();
        View view = null;
        for (int OooOo0O = OooOo0O() - 1; OooOo0O >= 0; OooOo0O--) {
            View OooOo0 = OooOo0(OooOo0O);
            int OooO0o0 = this.OooOOo.OooO0o0(OooOo0);
            int OooO0O0 = this.OooOOo.OooO0O0(OooOo0);
            if (OooO0O0 > OooOO0O && OooO0o0 < OooO0oO) {
                if (OooO0O0 <= OooO0oO || !z) {
                    return OooOo0;
                }
                if (view == null) {
                    view = OooOo0;
                }
            }
        }
        return view;
    }

    public final void o00000OO(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, boolean z) {
        int OooO0oO;
        int o00000oO = o00000oO(Integer.MIN_VALUE);
        if (o00000oO != Integer.MIN_VALUE && (OooO0oO = this.OooOOo.OooO0oO() - o00000oO) > 0) {
            int i = OooO0oO - (-o0000OOo(-OooO0oO, c1070oOOo0o, c1080oOOoO0O));
            if (z && i > 0) {
                this.OooOOo.OooOOOo(i);
            }
        }
    }

    public final void o00000Oo(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, boolean z) {
        int OooOO0O;
        int o00000oo = o00000oo(Integer.MAX_VALUE);
        if (o00000oo != Integer.MAX_VALUE && (OooOO0O = o00000oo - this.OooOOo.OooOO0O()) > 0) {
            int o0000OOo = OooOO0O - o0000OOo(OooOO0O, c1070oOOo0o, c1080oOOoO0O);
            if (z && o0000OOo > 0) {
                this.OooOOo.OooOOOo(-o0000OOo);
            }
        }
    }

    public final int o00000o0() {
        if (OooOo0O() == 0) {
            return 0;
        }
        return AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0));
    }

    public final int o00000oO(int i) {
        int OooO0oO = this.OooOOo0[0].OooO0oO(i);
        for (int i2 = 1; i2 < this.OooOOOo; i2++) {
            int OooO0oO2 = this.OooOOo0[i2].OooO0oO(i);
            if (OooO0oO2 > OooO0oO) {
                OooO0oO = OooO0oO2;
            }
        }
        return OooO0oO;
    }

    public final int o00000oo(int i) {
        int OooO = this.OooOOo0[0].OooO(i);
        for (int i2 = 1; i2 < this.OooOOOo; i2++) {
            int OooO2 = this.OooOOo0[i2].OooO(i);
            if (OooO2 < OooO) {
                OooO = OooO2;
            }
        }
        return OooO;
    }

    public final void o0000O(C1070oOOo0o c1070oOOo0o, oO0O000o oo0o000o) {
        int min;
        int min2;
        if (oo0o000o.OooO00o && !oo0o000o.OooO) {
            if (oo0o000o.OooO0O0 == 0) {
                if (oo0o000o.OooO0o0 == -1) {
                    o0000OO0(c1070oOOo0o, oo0o000o.OooO0oO);
                    return;
                } else {
                    o0000OO(c1070oOOo0o, oo0o000o.OooO0o);
                    return;
                }
            }
            int i = 1;
            if (oo0o000o.OooO0o0 == -1) {
                int i2 = oo0o000o.OooO0o;
                int OooO = this.OooOOo0[0].OooO(i2);
                while (i < this.OooOOOo) {
                    int OooO2 = this.OooOOo0[i].OooO(i2);
                    if (OooO2 > OooO) {
                        OooO = OooO2;
                    }
                    i++;
                }
                int i3 = i2 - OooO;
                if (i3 < 0) {
                    min2 = oo0o000o.OooO0oO;
                } else {
                    min2 = oo0o000o.OooO0oO - Math.min(i3, oo0o000o.OooO0O0);
                }
                o0000OO0(c1070oOOo0o, min2);
                return;
            }
            int i4 = oo0o000o.OooO0oO;
            int OooO0oO = this.OooOOo0[0].OooO0oO(i4);
            while (i < this.OooOOOo) {
                int OooO0oO2 = this.OooOOo0[i].OooO0oO(i4);
                if (OooO0oO2 < OooO0oO) {
                    OooO0oO = OooO0oO2;
                }
                i++;
            }
            int i5 = OooO0oO - oo0o000o.OooO0oO;
            if (i5 < 0) {
                min = oo0o000o.OooO0o;
            } else {
                min = Math.min(i5, oo0o000o.OooO0O0) + oo0o000o.OooO0o;
            }
            o0000OO(c1070oOOo0o, min);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x03f8, code lost:
        if (o000OOo() != false) goto L261;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0000O0(com.ninja.engine.C1070oOOo0o r17, com.ninja.engine.C1080oOOoO0O r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000O0(com.ninja.engine.oOOo0o, com.ninja.engine.oOOoO0O, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o0000O00() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000O00():android.view.View");
    }

    public final boolean o0000O0O(int i) {
        if (this.OooOo00 == 0) {
            return (i == -1) != this.OooOo;
        }
        return ((i == -1) == this.OooOo) == o0000oo();
    }

    public final void o0000OO(C1070oOOo0o c1070oOOo0o, int i) {
        while (OooOo0O() > 0) {
            View OooOo0 = OooOo0(0);
            if (this.OooOOo.OooO0O0(OooOo0) <= i && this.OooOOo.OooOOO(OooOo0) <= i) {
                C1246oOoOoo0 c1246oOoOoo0 = (C1246oOoOoo0) OooOo0.getLayoutParams();
                c1246oOoOoo0.getClass();
                if (((ArrayList) c1246oOoOoo0.OooO0o0.OooO0o).size() == 1) {
                    return;
                }
                C0839oO0o0ooO c0839oO0o0ooO = c1246oOoOoo0.OooO0o0;
                ArrayList arrayList = (ArrayList) c0839oO0o0ooO.OooO0o;
                View view = (View) arrayList.remove(0);
                C1246oOoOoo0 c1246oOoOoo02 = (C1246oOoOoo0) view.getLayoutParams();
                c1246oOoOoo02.OooO0o0 = null;
                if (arrayList.size() == 0) {
                    c0839oO0o0ooO.OooO0OO = Integer.MIN_VALUE;
                }
                if (c1246oOoOoo02.OooO00o.OooOO0O() || c1246oOoOoo02.OooO00o.OooOOO()) {
                    c0839oO0o0ooO.OooO0Oo -= ((StaggeredGridLayoutManager) c0839oO0o0ooO.OooO0oO).OooOOo.OooO0OO(view);
                }
                c0839oO0o0ooO.OooO0O0 = Integer.MIN_VALUE;
                Ooooooo(OooOo0, c1070oOOo0o);
            } else {
                return;
            }
        }
    }

    public final void o0000OO0(C1070oOOo0o c1070oOOo0o, int i) {
        for (int OooOo0O = OooOo0O() - 1; OooOo0O >= 0; OooOo0O--) {
            View OooOo0 = OooOo0(OooOo0O);
            if (this.OooOOo.OooO0o0(OooOo0) >= i && this.OooOOo.OooOOOO(OooOo0) >= i) {
                C1246oOoOoo0 c1246oOoOoo0 = (C1246oOoOoo0) OooOo0.getLayoutParams();
                c1246oOoOoo0.getClass();
                if (((ArrayList) c1246oOoOoo0.OooO0o0.OooO0o).size() == 1) {
                    return;
                }
                C0839oO0o0ooO c0839oO0o0ooO = c1246oOoOoo0.OooO0o0;
                ArrayList arrayList = (ArrayList) c0839oO0o0ooO.OooO0o;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                C1246oOoOoo0 c1246oOoOoo02 = (C1246oOoOoo0) view.getLayoutParams();
                c1246oOoOoo02.OooO0o0 = null;
                if (c1246oOoOoo02.OooO00o.OooOO0O() || c1246oOoOoo02.OooO00o.OooOOO()) {
                    c0839oO0o0ooO.OooO0Oo -= ((StaggeredGridLayoutManager) c0839oO0o0ooO.OooO0oO).OooOOo.OooO0OO(view);
                }
                if (size == 1) {
                    c0839oO0o0ooO.OooO0O0 = Integer.MIN_VALUE;
                }
                c0839oO0o0ooO.OooO0OO = Integer.MIN_VALUE;
                Ooooooo(OooOo0, c1070oOOo0o);
            } else {
                return;
            }
        }
    }

    public final void o0000OOO() {
        boolean z;
        if (this.OooOo00 != 1 && o0000oo()) {
            z = !this.OooOo0o;
        } else {
            z = this.OooOo0o;
        }
        this.OooOo = z;
    }

    public final int o0000OOo(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o000OO(i, c1080oOOoO0O);
        oO0O000o oo0o000o = this.OooOo0O;
        int o00000 = o00000(c1070oOOo0o, oo0o000o, c1080oOOoO0O);
        if (oo0o000o.OooO0O0 >= o00000) {
            if (i < 0) {
                i = -o00000;
            } else {
                i = o00000;
            }
        }
        this.OooOOo.OooOOOo(-i);
        this.OooOooO = this.OooOo;
        oo0o000o.OooO0O0 = 0;
        o0000O(c1070oOOo0o, oo0o000o);
        return i;
    }

    public final void o0000Oo(int i, C1080oOOoO0O c1080oOOoO0O) {
        boolean z;
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        boolean z2;
        oO0O000o oo0o000o = this.OooOo0O;
        boolean z3 = false;
        oo0o000o.OooO0O0 = 0;
        oo0o000o.OooO0OO = i;
        oO0OO00 oo0oo00 = this.OooO0o0;
        if (oo0oo00 != null && oo0oo00.OooO0o0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i4 = c1080oOOoO0O.OooO00o) != -1) {
            boolean z4 = this.OooOo;
            if (i4 < i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z4 == z2) {
                i2 = this.OooOOo.OooOO0o();
            } else {
                i3 = this.OooOOo.OooOO0o();
                i2 = 0;
                recyclerView = this.OooO0O0;
                if (recyclerView == null && recyclerView.OooO0oO) {
                    oo0o000o.OooO0o = this.OooOOo.OooOO0O() - i3;
                    oo0o000o.OooO0oO = this.OooOOo.OooO0oO() + i2;
                } else {
                    oo0o000o.OooO0oO = this.OooOOo.OooO0o() + i2;
                    oo0o000o.OooO0o = -i3;
                }
                oo0o000o.OooO0oo = false;
                oo0o000o.OooO00o = true;
                if (this.OooOOo.OooO() == 0 && this.OooOOo.OooO0o() == 0) {
                    z3 = true;
                }
                oo0o000o.OooO = z3;
            }
        } else {
            i2 = 0;
        }
        i3 = 0;
        recyclerView = this.OooO0O0;
        if (recyclerView == null) {
        }
        oo0o000o.OooO0oO = this.OooOOo.OooO0o() + i2;
        oo0o000o.OooO0o = -i3;
        oo0o000o.OooO0oo = false;
        oo0o000o.OooO00o = true;
        if (this.OooOOo.OooO() == 0) {
            z3 = true;
        }
        oo0o000o.OooO = z3;
    }

    public final void o0000Oo0(int i) {
        oO0O000o oo0o000o = this.OooOo0O;
        oo0o000o.OooO0o0 = i;
        oo0o000o.OooO0Oo = this.OooOo != (i == -1) ? -1 : 1;
    }

    public final void o0000OoO(C0839oO0o0ooO c0839oO0o0ooO, int i, int i2) {
        int i3 = c0839oO0o0ooO.OooO0Oo;
        int i4 = c0839oO0o0ooO.OooO0o0;
        if (i == -1) {
            int i5 = c0839oO0o0ooO.OooO0O0;
            if (i5 == Integer.MIN_VALUE) {
                View view = (View) ((ArrayList) c0839oO0o0ooO.OooO0o).get(0);
                c0839oO0o0ooO.OooO0O0 = ((StaggeredGridLayoutManager) c0839oO0o0ooO.OooO0oO).OooOOo.OooO0o0(view);
                ((C1246oOoOoo0) view.getLayoutParams()).getClass();
                i5 = c0839oO0o0ooO.OooO0O0;
            }
            if (i5 + i3 > i2) {
                return;
            }
        } else {
            int i6 = c0839oO0o0ooO.OooO0OO;
            if (i6 == Integer.MIN_VALUE) {
                c0839oO0o0ooO.OooO00o();
                i6 = c0839oO0o0ooO.OooO0OO;
            }
            if (i6 - i3 < i2) {
                return;
            }
        }
        this.OooOoO0.set(i4, false);
    }

    public final int o0000Ooo() {
        int OooOo0O = OooOo0O();
        if (OooOo0O == 0) {
            return 0;
        }
        return AbstractC1066oOOo0Oo.Oooo00o(OooOo0(OooOo0O - 1));
    }

    public final void o0000oO(View view, int i, int i2) {
        RecyclerView recyclerView = this.OooO0O0;
        Rect rect = this.Oooo00O;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.Oooo0O0(view));
        }
        C1246oOoOoo0 c1246oOoOoo0 = (C1246oOoOoo0) view.getLayoutParams();
        int o0000o0 = o0000o0(i, ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).rightMargin + rect.right);
        int o0000o02 = o0000o0(i2, ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1246oOoOoo0).bottomMargin + rect.bottom);
        if (o0ooOOo(view, o0000o0, o0000o02, c1246oOoOoo0)) {
            view.measure(o0000o0, o0000o02);
        }
    }

    public final boolean o0000oo() {
        return OooOoo() == 1;
    }

    public final void o000OO(int i, C1080oOOoO0O c1080oOOoO0O) {
        int o00000o0;
        int i2;
        if (i > 0) {
            o00000o0 = o0000Ooo();
            i2 = 1;
        } else {
            o00000o0 = o00000o0();
            i2 = -1;
        }
        oO0O000o oo0o000o = this.OooOo0O;
        oo0o000o.OooO00o = true;
        o0000Oo(o00000o0, c1080oOOoO0O);
        o0000Oo0(i2);
        oo0o000o.OooO0OO = o00000o0 + oo0o000o.OooO0Oo;
        oo0o000o.OooO0O0 = Math.abs(i);
    }

    public final boolean o000OOo() {
        int o00000o0;
        if (OooOo0O() != 0 && this.OooOoo != 0 && this.OooO0oO) {
            if (this.OooOo) {
                o00000o0 = o0000Ooo();
                o00000o0();
            } else {
                o00000o0 = o00000o0();
                o0000Ooo();
            }
            C1126oOOooOO c1126oOOooOO = this.OooOoo0;
            if (o00000o0 == 0 && o0000O00() != null) {
                int[] iArr = (int[]) c1126oOOooOO.OooO0O0;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c1126oOOooOO.OooO0OO = null;
                this.OooO0o = true;
                o00O0O();
                return true;
            }
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o000oOoO(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, View view, C0039OoooO c0039OoooO) {
        int i;
        C0042OoooO0O OooO00o;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1246oOoOoo0)) {
            OoooOO0(view, c0039OoooO);
            return;
        }
        C1246oOoOoo0 c1246oOoOoo0 = (C1246oOoOoo0) layoutParams;
        if (this.OooOo00 == 0) {
            C0839oO0o0ooO c0839oO0o0ooO = c1246oOoOoo0.OooO0o0;
            if (c0839oO0o0ooO == null) {
                i2 = -1;
            } else {
                i2 = c0839oO0o0ooO.OooO0o0;
            }
            OooO00o = C0042OoooO0O.OooO00o(false, i2, 1, -1, -1);
        } else {
            C0839oO0o0ooO c0839oO0o0ooO2 = c1246oOoOoo0.OooO0o0;
            if (c0839oO0o0ooO2 == null) {
                i = -1;
            } else {
                i = c0839oO0o0ooO2.OooO0o0;
            }
            OooO00o = C0042OoooO0O.OooO00o(false, -1, -1, i, 1);
        }
        c0039OoooO.OooO(OooO00o);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int o00Oo0(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        return o0000OOo(i, c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o00Ooo(int i) {
        C1328oOooo0O0 c1328oOooo0O0 = this.Oooo000;
        if (c1328oOooo0O0 != null && c1328oOooo0O0.OooO00o != i) {
            c1328oOooo0O0.OooO0Oo = null;
            c1328oOooo0O0.OooO0OO = 0;
            c1328oOooo0O0.OooO00o = -1;
            c1328oOooo0O0.OooO0O0 = -1;
        }
        this.OooOoO = i;
        this.OooOoOO = Integer.MIN_VALUE;
        o00O0O();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int o00o0O(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        return o0000OOo(i, c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o00oO0o(Rect rect, int i, int i2) {
        int OooO0oO;
        int OooO0oO2;
        int i3 = this.OooOOOo;
        int Oooo000 = Oooo000() + OooOooo();
        int OooOooO = OooOooO() + Oooo00O();
        if (this.OooOo00 == 1) {
            int height = rect.height() + OooOooO;
            RecyclerView recyclerView = this.OooO0O0;
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            OooO0oO2 = AbstractC1066oOOo0Oo.OooO0oO(i2, height, recyclerView.getMinimumHeight());
            OooO0oO = AbstractC1066oOOo0Oo.OooO0oO(i, (this.OooOo0 * i3) + Oooo000, this.OooO0O0.getMinimumWidth());
        } else {
            int width = rect.width() + Oooo000;
            RecyclerView recyclerView2 = this.OooO0O0;
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            OooO0oO = AbstractC1066oOOo0Oo.OooO0oO(i, width, recyclerView2.getMinimumWidth());
            OooO0oO2 = AbstractC1066oOOo0Oo.OooO0oO(i2, (this.OooOo0 * i3) + OooOooO, this.OooO0O0.getMinimumHeight());
        }
        this.OooO0O0.setMeasuredDimension(OooO0oO, OooO0oO2);
    }

    public final int o0O0O00(int i) {
        if (OooOo0O() == 0) {
            return this.OooOo ? 1 : -1;
        }
        return (i < o00000o0()) != this.OooOo ? -1 : 1;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o0Oo0oo(RecyclerView recyclerView, int i) {
        oO0OO00 oo0oo00 = new oO0OO00(recyclerView.getContext());
        oo0oo00.OooO00o = i;
        o0OO00O(oo0oo00);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean oo0o0Oo() {
        return this.Oooo000 == null;
    }
}
