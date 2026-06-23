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
import com.ninja.engine.AbstractC1083oOOoO0o;
import com.ninja.engine.AbstractC1137oOOoooO;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0671o0ooo0O;
import com.ninja.engine.C0766oO0O0ooO;
import com.ninja.engine.C0767oO0O0ooo;
import com.ninja.engine.C1067oOOo0Oo0;
import com.ninja.engine.C1068oOOo0OoO;
import com.ninja.engine.C1070oOOo0o;
import com.ninja.engine.C1080oOOoO0O;
import com.ninja.engine.C1126oOOooOO;
import com.ninja.engine.C1777ooOOO00O;
import com.ninja.engine.C1934ooo0o;
import com.ninja.engine.InterfaceC1078oOOo0oo0;
import com.ninja.engine.oO0OO00;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1066oOOo0Oo implements InterfaceC1078oOOo0oo0 {
    public int OooOOOo;
    public AbstractC0462o0OoOoo OooOOo;
    public C0767oO0O0ooo OooOOo0;
    public boolean OooOOoo;
    public int OooOo;
    public boolean OooOo0;
    public final boolean OooOo00;
    public boolean OooOo0O;
    public final boolean OooOo0o;
    public C1934ooo0o OooOoO;
    public int OooOoO0;
    public final C1777ooOOO00O OooOoOO;
    public final int OooOoo;
    public final C0766oO0O0ooO OooOoo0;
    public final int[] OooOooO;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ninja.engine.oO0O0ooO, java.lang.Object] */
    public LinearLayoutManager(int i) {
        this.OooOOOo = 1;
        this.OooOo00 = false;
        this.OooOo0 = false;
        this.OooOo0O = false;
        this.OooOo0o = true;
        this.OooOo = -1;
        this.OooOoO0 = Integer.MIN_VALUE;
        this.OooOoO = null;
        this.OooOoOO = new C1777ooOOO00O();
        this.OooOoo0 = new Object();
        this.OooOoo = 2;
        this.OooOooO = new int[2];
        o0000OOo(i);
        OooO0OO(null);
        if (this.OooOo00) {
            this.OooOo00 = false;
            o00O0O();
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooO(int i, C0671o0ooo0O c0671o0ooo0O) {
        boolean z;
        int i2;
        C1934ooo0o c1934ooo0o = this.OooOoO;
        int i3 = -1;
        if (c1934ooo0o != null && (i2 = c1934ooo0o.OooO00o) >= 0) {
            z = c1934ooo0o.OooO0OO;
        } else {
            o0000OO();
            z = this.OooOo0;
            i2 = this.OooOo;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.OooOoo && i2 >= 0 && i2 < i; i4++) {
            c0671o0ooo0O.OooO00o(i2, 0);
            i2 += i3;
        }
    }

    @Override // com.ninja.engine.InterfaceC1078oOOo0oo0
    public final PointF OooO00o(int i) {
        if (OooOo0O() == 0) {
            return null;
        }
        int i2 = (i < AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0))) != this.OooOo0 ? -1 : 1;
        return this.OooOOOo == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooO0OO(String str) {
        if (this.OooOoO == null) {
            super.OooO0OO(str);
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0Oo() {
        return this.OooOOOo == 0;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean OooO0o0() {
        return this.OooOOOo == 1;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooO0oo(int i, int i2, C1080oOOoO0O c1080oOOoO0O, C0671o0ooo0O c0671o0ooo0O) {
        int i3;
        if (this.OooOOOo != 0) {
            i = i2;
        }
        if (OooOo0O() != 0 && i != 0) {
            o00000O0();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            o0000Oo(i3, Math.abs(i), true, c1080oOOoO0O);
            o000OOo(c1080oOOoO0O, this.OooOOo0, c0671o0ooo0O);
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOO0(C1080oOOoO0O c1080oOOoO0O) {
        return o000000(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public int OooOO0O(C1080oOOoO0O c1080oOOoO0O) {
        return o000000O(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public int OooOO0o(C1080oOOoO0O c1080oOOoO0O) {
        return o000000o(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public int OooOOO(C1080oOOoO0O c1080oOOoO0O) {
        return o000000O(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final int OooOOO0(C1080oOOoO0O c1080oOOoO0O) {
        return o000000(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public int OooOOOO(C1080oOOoO0O c1080oOOoO0O) {
        return o000000o(c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public C1068oOOo0OoO OooOOo() {
        return new C1068oOOo0OoO(-2, -2);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final View OooOOo0(int i) {
        int OooOo0O = OooOo0O();
        if (OooOo0O == 0) {
            return null;
        }
        int Oooo00o = i - AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0));
        if (Oooo00o >= 0 && Oooo00o < OooOo0O) {
            View OooOo0 = OooOo0(Oooo00o);
            if (AbstractC1066oOOo0Oo.Oooo00o(OooOo0) == i) {
                return OooOo0;
            }
        }
        return super.OooOOo0(i);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean Oooo0o0() {
        return true;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO(AccessibilityEvent accessibilityEvent) {
        int Oooo00o;
        super.OoooO(accessibilityEvent);
        if (OooOo0O() > 0) {
            View o00000oO = o00000oO(0, OooOo0O(), false);
            if (o00000oO == null) {
                Oooo00o = -1;
            } else {
                Oooo00o = AbstractC1066oOOo0Oo.Oooo00o(o00000oO);
            }
            accessibilityEvent.setFromIndex(Oooo00o);
            accessibilityEvent.setToIndex(o00000o0());
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public View OoooO0O(View view, int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        int o00000;
        View o0000Ooo;
        View o0000oo;
        o0000OO();
        if (OooOo0O() == 0 || (o00000 = o00000(i)) == Integer.MIN_VALUE) {
            return null;
        }
        o00000O0();
        o0000Oo(o00000, (int) (this.OooOOo.OooOO0o() * 0.33333334f), false, c1080oOOoO0O);
        C0767oO0O0ooo c0767oO0O0ooo = this.OooOOo0;
        c0767oO0O0ooo.OooO0oO = Integer.MIN_VALUE;
        c0767oO0O0ooo.OooO00o = false;
        o00000O(c1070oOOo0o, c0767oO0O0ooo, c1080oOOoO0O, true);
        if (o00000 == -1) {
            if (this.OooOo0) {
                o0000Ooo = o0000Ooo(OooOo0O() - 1, -1);
            } else {
                o0000Ooo = o0000Ooo(0, OooOo0O());
            }
        } else if (this.OooOo0) {
            o0000Ooo = o0000Ooo(0, OooOo0O());
        } else {
            o0000Ooo = o0000Ooo(OooOo0O() - 1, -1);
        }
        if (o00000 == -1) {
            o0000oo = o0000oO();
        } else {
            o0000oo = o0000oo();
        }
        if (o0000oo.hasFocusable()) {
            if (o0000Ooo == null) {
                return null;
            }
            return o0000oo;
        }
        return o0000Ooo;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public void Ooooo00(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        View focusedChild;
        int i;
        View focusedChild2;
        View o00000oo;
        int OooOO0O;
        int i2;
        int OooOO0O2;
        int i3;
        int OooO0oO;
        int i4;
        boolean z;
        boolean z2;
        int OooO0o0;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        List list;
        boolean z4;
        int i9;
        int i10;
        int o0000;
        int i11;
        View OooOOo0;
        int OooO0o02;
        int i12;
        int i13;
        int i14 = -1;
        if ((this.OooOoO != null || this.OooOo != -1) && c1080oOOoO0O.OooO0O0() == 0) {
            Oooooo(c1070oOOo0o);
            return;
        }
        C1934ooo0o c1934ooo0o = this.OooOoO;
        if (c1934ooo0o != null && (i13 = c1934ooo0o.OooO00o) >= 0) {
            this.OooOo = i13;
        }
        o00000O0();
        this.OooOOo0.OooO00o = false;
        o0000OO();
        RecyclerView recyclerView = this.OooO0O0;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.OooO00o.Oooo00o(focusedChild)) {
            focusedChild = null;
        }
        C1777ooOOO00O c1777ooOOO00O = this.OooOoOO;
        if (c1777ooOOO00O.OooO0o0 && this.OooOo == -1 && this.OooOoO == null) {
            if (focusedChild != null && (this.OooOOo.OooO0o0(focusedChild) >= this.OooOOo.OooO0oO() || this.OooOOo.OooO0O0(focusedChild) <= this.OooOOo.OooOO0O())) {
                c1777ooOOO00O.OooO0OO(focusedChild, AbstractC1066oOOo0Oo.Oooo00o(focusedChild));
            }
        } else {
            c1777ooOOO00O.OooO0Oo();
            c1777ooOOO00O.OooO0Oo = this.OooOo0 ^ this.OooOo0O;
            if (!c1080oOOoO0O.OooO0oO && (i2 = this.OooOo) != -1) {
                if (i2 >= 0 && i2 < c1080oOOoO0O.OooO0O0()) {
                    int i15 = this.OooOo;
                    c1777ooOOO00O.OooO0O0 = i15;
                    C1934ooo0o c1934ooo0o2 = this.OooOoO;
                    if (c1934ooo0o2 != null && c1934ooo0o2.OooO00o >= 0) {
                        boolean z5 = c1934ooo0o2.OooO0OO;
                        c1777ooOOO00O.OooO0Oo = z5;
                        if (z5) {
                            OooO0oO = this.OooOOo.OooO0oO();
                            i4 = this.OooOoO.OooO0O0;
                            i5 = OooO0oO - i4;
                        } else {
                            OooOO0O2 = this.OooOOo.OooOO0O();
                            i3 = this.OooOoO.OooO0O0;
                            i5 = OooOO0O2 + i3;
                        }
                    } else if (this.OooOoO0 == Integer.MIN_VALUE) {
                        View OooOOo02 = OooOOo0(i15);
                        if (OooOOo02 != null) {
                            if (this.OooOOo.OooO0OO(OooOOo02) <= this.OooOOo.OooOO0o()) {
                                if (this.OooOOo.OooO0o0(OooOOo02) - this.OooOOo.OooOO0O() < 0) {
                                    c1777ooOOO00O.OooO0OO = this.OooOOo.OooOO0O();
                                    c1777ooOOO00O.OooO0Oo = false;
                                } else if (this.OooOOo.OooO0oO() - this.OooOOo.OooO0O0(OooOOo02) < 0) {
                                    c1777ooOOO00O.OooO0OO = this.OooOOo.OooO0oO();
                                    c1777ooOOO00O.OooO0Oo = true;
                                } else {
                                    if (c1777ooOOO00O.OooO0Oo) {
                                        OooO0o0 = this.OooOOo.OooOOO0() + this.OooOOo.OooO0O0(OooOOo02);
                                    } else {
                                        OooO0o0 = this.OooOOo.OooO0o0(OooOOo02);
                                    }
                                    c1777ooOOO00O.OooO0OO = OooO0o0;
                                }
                                c1777ooOOO00O.OooO0o0 = true;
                            }
                        } else if (OooOo0O() > 0) {
                            if (this.OooOo < AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.OooOo0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c1777ooOOO00O.OooO0Oo = z2;
                        }
                        c1777ooOOO00O.OooO00o();
                        c1777ooOOO00O.OooO0o0 = true;
                    } else {
                        boolean z6 = this.OooOo0;
                        c1777ooOOO00O.OooO0Oo = z6;
                        if (z6) {
                            OooO0oO = this.OooOOo.OooO0oO();
                            i4 = this.OooOoO0;
                            i5 = OooO0oO - i4;
                        } else {
                            OooOO0O2 = this.OooOOo.OooOO0O();
                            i3 = this.OooOoO0;
                            i5 = OooOO0O2 + i3;
                        }
                    }
                    c1777ooOOO00O.OooO0OO = i5;
                    c1777ooOOO00O.OooO0o0 = true;
                } else {
                    this.OooOo = -1;
                    this.OooOoO0 = Integer.MIN_VALUE;
                }
            }
            if (OooOo0O() != 0) {
                RecyclerView recyclerView2 = this.OooO0O0;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.OooO00o.Oooo00o(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) focusedChild2.getLayoutParams();
                    if (!c1068oOOo0OoO.OooO00o.OooOO0O() && c1068oOOo0OoO.OooO00o.OooO0Oo() >= 0 && c1068oOOo0OoO.OooO00o.OooO0Oo() < c1080oOOoO0O.OooO0O0()) {
                        c1777ooOOO00O.OooO0OO(focusedChild2, AbstractC1066oOOo0Oo.Oooo00o(focusedChild2));
                        c1777ooOOO00O.OooO0o0 = true;
                    }
                }
                if (this.OooOOoo == this.OooOo0O) {
                    if (c1777ooOOO00O.OooO0Oo) {
                        if (this.OooOo0) {
                            o00000oo = o00000oo(c1070oOOo0o, c1080oOOoO0O, 0, OooOo0O(), c1080oOOoO0O.OooO0O0());
                        } else {
                            o00000oo = o00000oo(c1070oOOo0o, c1080oOOoO0O, OooOo0O() - 1, -1, c1080oOOoO0O.OooO0O0());
                        }
                    } else if (this.OooOo0) {
                        o00000oo = o00000oo(c1070oOOo0o, c1080oOOoO0O, OooOo0O() - 1, -1, c1080oOOoO0O.OooO0O0());
                    } else {
                        o00000oo = o00000oo(c1070oOOo0o, c1080oOOoO0O, 0, OooOo0O(), c1080oOOoO0O.OooO0O0());
                    }
                    if (o00000oo != null) {
                        c1777ooOOO00O.OooO0O0(o00000oo, AbstractC1066oOOo0Oo.Oooo00o(o00000oo));
                        if (!c1080oOOoO0O.OooO0oO && oo0o0Oo() && (this.OooOOo.OooO0o0(o00000oo) >= this.OooOOo.OooO0oO() || this.OooOOo.OooO0O0(o00000oo) < this.OooOOo.OooOO0O())) {
                            if (c1777ooOOO00O.OooO0Oo) {
                                OooOO0O = this.OooOOo.OooO0oO();
                            } else {
                                OooOO0O = this.OooOOo.OooOO0O();
                            }
                            c1777ooOOO00O.OooO0OO = OooOO0O;
                        }
                        c1777ooOOO00O.OooO0o0 = true;
                    }
                }
            }
            c1777ooOOO00O.OooO00o();
            if (this.OooOo0O) {
                i = c1080oOOoO0O.OooO0O0() - 1;
            } else {
                i = 0;
            }
            c1777ooOOO00O.OooO0O0 = i;
            c1777ooOOO00O.OooO0o0 = true;
        }
        C0767oO0O0ooo c0767oO0O0ooo = this.OooOOo0;
        if (c0767oO0O0ooo.OooOO0 >= 0) {
            i6 = 1;
        } else {
            i6 = -1;
        }
        c0767oO0O0ooo.OooO0o = i6;
        int[] iArr = this.OooOooO;
        iArr[0] = 0;
        iArr[1] = 0;
        o0O0O00(c1080oOOoO0O, iArr);
        int OooOO0O3 = this.OooOOo.OooOO0O() + Math.max(0, iArr[0]);
        int OooO0oo = this.OooOOo.OooO0oo() + Math.max(0, iArr[1]);
        if (c1080oOOoO0O.OooO0oO && (i11 = this.OooOo) != -1 && this.OooOoO0 != Integer.MIN_VALUE && (OooOOo0 = OooOOo0(i11)) != null) {
            if (this.OooOo0) {
                i12 = this.OooOOo.OooO0oO() - this.OooOOo.OooO0O0(OooOOo0);
                OooO0o02 = this.OooOoO0;
            } else {
                OooO0o02 = this.OooOOo.OooO0o0(OooOOo0) - this.OooOOo.OooOO0O();
                i12 = this.OooOoO0;
            }
            int i16 = i12 - OooO0o02;
            if (i16 > 0) {
                OooOO0O3 += i16;
            } else {
                OooO0oo -= i16;
            }
        }
        if (!c1777ooOOO00O.OooO0Oo ? !this.OooOo0 : this.OooOo0) {
            i14 = 1;
        }
        o000OO(c1070oOOo0o, c1080oOOoO0O, c1777ooOOO00O, i14);
        OooOOOo(c1070oOOo0o);
        C0767oO0O0ooo c0767oO0O0ooo2 = this.OooOOo0;
        if (this.OooOOo.OooO() == 0 && this.OooOOo.OooO0o() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0767oO0O0ooo2.OooOO0o = z3;
        this.OooOOo0.getClass();
        this.OooOOo0.OooO = 0;
        if (c1777ooOOO00O.OooO0Oo) {
            o0000o0(c1777ooOOO00O.OooO0O0, c1777ooOOO00O.OooO0OO);
            C0767oO0O0ooo c0767oO0O0ooo3 = this.OooOOo0;
            c0767oO0O0ooo3.OooO0oo = OooOO0O3;
            o00000O(c1070oOOo0o, c0767oO0O0ooo3, c1080oOOoO0O, false);
            C0767oO0O0ooo c0767oO0O0ooo4 = this.OooOOo0;
            i8 = c0767oO0O0ooo4.OooO0O0;
            int i17 = c0767oO0O0ooo4.OooO0Oo;
            int i18 = c0767oO0O0ooo4.OooO0OO;
            if (i18 > 0) {
                OooO0oo += i18;
            }
            o0000OoO(c1777ooOOO00O.OooO0O0, c1777ooOOO00O.OooO0OO);
            C0767oO0O0ooo c0767oO0O0ooo5 = this.OooOOo0;
            c0767oO0O0ooo5.OooO0oo = OooO0oo;
            c0767oO0O0ooo5.OooO0Oo += c0767oO0O0ooo5.OooO0o0;
            o00000O(c1070oOOo0o, c0767oO0O0ooo5, c1080oOOoO0O, false);
            C0767oO0O0ooo c0767oO0O0ooo6 = this.OooOOo0;
            i7 = c0767oO0O0ooo6.OooO0O0;
            int i19 = c0767oO0O0ooo6.OooO0OO;
            if (i19 > 0) {
                o0000o0(i17, i8);
                C0767oO0O0ooo c0767oO0O0ooo7 = this.OooOOo0;
                c0767oO0O0ooo7.OooO0oo = i19;
                o00000O(c1070oOOo0o, c0767oO0O0ooo7, c1080oOOoO0O, false);
                i8 = this.OooOOo0.OooO0O0;
            }
        } else {
            o0000OoO(c1777ooOOO00O.OooO0O0, c1777ooOOO00O.OooO0OO);
            C0767oO0O0ooo c0767oO0O0ooo8 = this.OooOOo0;
            c0767oO0O0ooo8.OooO0oo = OooO0oo;
            o00000O(c1070oOOo0o, c0767oO0O0ooo8, c1080oOOoO0O, false);
            C0767oO0O0ooo c0767oO0O0ooo9 = this.OooOOo0;
            i7 = c0767oO0O0ooo9.OooO0O0;
            int i20 = c0767oO0O0ooo9.OooO0Oo;
            int i21 = c0767oO0O0ooo9.OooO0OO;
            if (i21 > 0) {
                OooOO0O3 += i21;
            }
            o0000o0(c1777ooOOO00O.OooO0O0, c1777ooOOO00O.OooO0OO);
            C0767oO0O0ooo c0767oO0O0ooo10 = this.OooOOo0;
            c0767oO0O0ooo10.OooO0oo = OooOO0O3;
            c0767oO0O0ooo10.OooO0Oo += c0767oO0O0ooo10.OooO0o0;
            o00000O(c1070oOOo0o, c0767oO0O0ooo10, c1080oOOoO0O, false);
            C0767oO0O0ooo c0767oO0O0ooo11 = this.OooOOo0;
            i8 = c0767oO0O0ooo11.OooO0O0;
            int i22 = c0767oO0O0ooo11.OooO0OO;
            if (i22 > 0) {
                o0000OoO(i20, i7);
                C0767oO0O0ooo c0767oO0O0ooo12 = this.OooOOo0;
                c0767oO0O0ooo12.OooO0oo = i22;
                o00000O(c1070oOOo0o, c0767oO0O0ooo12, c1080oOOoO0O, false);
                i7 = this.OooOOo0.OooO0O0;
            }
        }
        if (OooOo0O() > 0) {
            if (this.OooOo0 ^ this.OooOo0O) {
                int o00002 = o0000(i7, c1070oOOo0o, c1080oOOoO0O, true);
                i9 = i8 + o00002;
                i10 = i7 + o00002;
                o0000 = o0000O00(i9, c1070oOOo0o, c1080oOOoO0O, false);
            } else {
                int o0000O00 = o0000O00(i8, c1070oOOo0o, c1080oOOoO0O, true);
                i9 = i8 + o0000O00;
                i10 = i7 + o0000O00;
                o0000 = o0000(i10, c1070oOOo0o, c1080oOOoO0O, false);
            }
            i8 = i9 + o0000;
            i7 = i10 + o0000;
        }
        if (c1080oOOoO0O.OooOO0O && OooOo0O() != 0 && !c1080oOOoO0O.OooO0oO && oo0o0Oo()) {
            List list2 = c1070oOOo0o.OooO0Oo;
            int size = list2.size();
            int Oooo00o = AbstractC1066oOOo0Oo.Oooo00o(OooOo0(0));
            int i23 = 0;
            int i24 = 0;
            for (int i25 = 0; i25 < size; i25++) {
                AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) list2.get(i25);
                if (!abstractC1083oOOoO0o.OooOO0O()) {
                    if (abstractC1083oOOoO0o.OooO0Oo() < Oooo00o) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z7 = this.OooOo0;
                    View view = abstractC1083oOOoO0o.OooO00o;
                    if (z4 != z7) {
                        i23 += this.OooOOo.OooO0OO(view);
                    } else {
                        i24 += this.OooOOo.OooO0OO(view);
                    }
                }
            }
            this.OooOOo0.OooOO0O = list2;
            if (i23 > 0) {
                o0000o0(AbstractC1066oOOo0Oo.Oooo00o(o0000oO()), i8);
                C0767oO0O0ooo c0767oO0O0ooo13 = this.OooOOo0;
                c0767oO0O0ooo13.OooO0oo = i23;
                c0767oO0O0ooo13.OooO0OO = 0;
                c0767oO0O0ooo13.OooO00o(null);
                o00000O(c1070oOOo0o, this.OooOOo0, c1080oOOoO0O, false);
            }
            if (i24 > 0) {
                o0000OoO(AbstractC1066oOOo0Oo.Oooo00o(o0000oo()), i7);
                C0767oO0O0ooo c0767oO0O0ooo14 = this.OooOOo0;
                c0767oO0O0ooo14.OooO0oo = i24;
                c0767oO0O0ooo14.OooO0OO = 0;
                list = null;
                c0767oO0O0ooo14.OooO00o(null);
                o00000O(c1070oOOo0o, this.OooOOo0, c1080oOOoO0O, false);
            } else {
                list = null;
            }
            this.OooOOo0.OooOO0O = list;
        }
        if (!c1080oOOoO0O.OooO0oO) {
            AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
            abstractC0462o0OoOoo.OooO00o = abstractC0462o0OoOoo.OooOO0o();
        } else {
            c1777ooOOO00O.OooO0Oo();
        }
        this.OooOOoo = this.OooOo0O;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public void Ooooo0o(C1080oOOoO0O c1080oOOoO0O) {
        this.OooOoO = null;
        this.OooOo = -1;
        this.OooOoO0 = Integer.MIN_VALUE;
        this.OooOoOO.OooO0Oo();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OooooO0(Parcelable parcelable) {
        if (parcelable instanceof C1934ooo0o) {
            this.OooOoO = (C1934ooo0o) parcelable;
            o00O0O();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, com.ninja.engine.ooo0o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, com.ninja.engine.ooo0o, java.lang.Object] */
    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final Parcelable OooooOO() {
        C1934ooo0o c1934ooo0o = this.OooOoO;
        if (c1934ooo0o != null) {
            Object obj = new Object();
            obj.OooO00o = c1934ooo0o.OooO00o;
            obj.OooO0O0 = c1934ooo0o.OooO0O0;
            obj.OooO0OO = c1934ooo0o.OooO0OO;
            return obj;
        }
        Object obj2 = new Object();
        if (OooOo0O() > 0) {
            o00000O0();
            boolean z = this.OooOOoo ^ this.OooOo0;
            obj2.OooO0OO = z;
            if (z) {
                View o0000oo = o0000oo();
                obj2.OooO0O0 = this.OooOOo.OooO0oO() - this.OooOOo.OooO0O0(o0000oo);
                obj2.OooO00o = AbstractC1066oOOo0Oo.Oooo00o(o0000oo);
            } else {
                View o0000oO = o0000oO();
                obj2.OooO00o = AbstractC1066oOOo0Oo.Oooo00o(o0000oO);
                obj2.OooO0O0 = this.OooOOo.OooO0o0(o0000oO) - this.OooOOo.OooOO0O();
            }
        } else {
            obj2.OooO00o = -1;
        }
        return obj2;
    }

    public final int o0000(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, boolean z) {
        int OooO0oO;
        int OooO0oO2 = this.OooOOo.OooO0oO() - i;
        if (OooO0oO2 > 0) {
            int i2 = -o0000OOO(-OooO0oO2, c1070oOOo0o, c1080oOOoO0O);
            int i3 = i + i2;
            if (z && (OooO0oO = this.OooOOo.OooO0oO() - i3) > 0) {
                this.OooOOo.OooOOOo(OooO0oO);
                return OooO0oO + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int o00000(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.OooOOOo == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.OooOOOo == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.OooOOOo == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.OooOOOo == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.OooOOOo != 1 && o0000O0()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.OooOOOo == 1 || !o0000O0()) {
            return -1;
        } else {
            return 1;
        }
    }

    public final int o000000(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o00000O0();
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
        boolean z = !this.OooOo0o;
        return AbstractC1137oOOoooO.OooO0O0(c1080oOOoO0O, abstractC0462o0OoOoo, o00000Oo(z), o00000OO(z), this, this.OooOo0o);
    }

    public final int o000000O(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o00000O0();
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
        boolean z = !this.OooOo0o;
        return AbstractC1137oOOoooO.OooO0OO(c1080oOOoO0O, abstractC0462o0OoOoo, o00000Oo(z), o00000OO(z), this, this.OooOo0o, this.OooOo0);
    }

    public final int o000000o(C1080oOOoO0O c1080oOOoO0O) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o00000O0();
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = this.OooOOo;
        boolean z = !this.OooOo0o;
        return AbstractC1137oOOoooO.OooO0Oo(c1080oOOoO0O, abstractC0462o0OoOoo, o00000Oo(z), o00000OO(z), this, this.OooOo0o);
    }

    public final int o00000O(C1070oOOo0o c1070oOOo0o, C0767oO0O0ooo c0767oO0O0ooo, C1080oOOoO0O c1080oOOoO0O, boolean z) {
        int i;
        int i2 = c0767oO0O0ooo.OooO0OO;
        int i3 = c0767oO0O0ooo.OooO0oO;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0767oO0O0ooo.OooO0oO = i3 + i2;
            }
            o0000O(c1070oOOo0o, c0767oO0O0ooo);
        }
        int i4 = c0767oO0O0ooo.OooO0OO + c0767oO0O0ooo.OooO0oo;
        while (true) {
            if ((!c0767oO0O0ooo.OooOO0o && i4 <= 0) || (i = c0767oO0O0ooo.OooO0Oo) < 0 || i >= c1080oOOoO0O.OooO0O0()) {
                break;
            }
            C0766oO0O0ooO c0766oO0O0ooO = this.OooOoo0;
            c0766oO0O0ooO.OooO00o = 0;
            c0766oO0O0ooO.OooO0O0 = false;
            c0766oO0O0ooO.OooO0OO = false;
            c0766oO0O0ooO.OooO0Oo = false;
            o0000O0O(c1070oOOo0o, c1080oOOoO0O, c0767oO0O0ooo, c0766oO0O0ooO);
            if (!c0766oO0O0ooO.OooO0O0) {
                int i5 = c0767oO0O0ooo.OooO0O0;
                int i6 = c0766oO0O0ooO.OooO00o;
                c0767oO0O0ooo.OooO0O0 = (c0767oO0O0ooo.OooO0o * i6) + i5;
                if (!c0766oO0O0ooO.OooO0OO || c0767oO0O0ooo.OooOO0O != null || !c1080oOOoO0O.OooO0oO) {
                    c0767oO0O0ooo.OooO0OO -= i6;
                    i4 -= i6;
                }
                int i7 = c0767oO0O0ooo.OooO0oO;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0767oO0O0ooo.OooO0oO = i8;
                    int i9 = c0767oO0O0ooo.OooO0OO;
                    if (i9 < 0) {
                        c0767oO0O0ooo.OooO0oO = i8 + i9;
                    }
                    o0000O(c1070oOOo0o, c0767oO0O0ooo);
                }
                if (z && c0766oO0O0ooO.OooO0Oo) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0767oO0O0ooo.OooO0OO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.oO0O0ooo, java.lang.Object] */
    public final void o00000O0() {
        if (this.OooOOo0 == null) {
            Object obj = new Object();
            obj.OooO00o = true;
            obj.OooO0oo = 0;
            obj.OooO = 0;
            obj.OooOO0O = null;
            this.OooOOo0 = obj;
        }
    }

    public final View o00000OO(boolean z) {
        int OooOo0O;
        int i;
        if (this.OooOo0) {
            OooOo0O = 0;
            i = OooOo0O();
        } else {
            OooOo0O = OooOo0O() - 1;
            i = -1;
        }
        return o00000oO(OooOo0O, i, z);
    }

    public final View o00000Oo(boolean z) {
        int i;
        int OooOo0O;
        if (this.OooOo0) {
            i = OooOo0O() - 1;
            OooOo0O = -1;
        } else {
            i = 0;
            OooOo0O = OooOo0O();
        }
        return o00000oO(i, OooOo0O, z);
    }

    public final int o00000o0() {
        View o00000oO = o00000oO(OooOo0O() - 1, -1, false);
        if (o00000oO == null) {
            return -1;
        }
        return AbstractC1066oOOo0Oo.Oooo00o(o00000oO);
    }

    public final View o00000oO(int i, int i2, boolean z) {
        int i3;
        C1126oOOooOO c1126oOOooOO;
        o00000O0();
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (this.OooOOOo == 0) {
            c1126oOOooOO = this.OooO0OO;
        } else {
            c1126oOOooOO = this.OooO0Oo;
        }
        return c1126oOOooOO.OooO0oo(i, i2, i3, 320);
    }

    public View o00000oo(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, int i, int i2, int i3) {
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
            if (Oooo00o >= 0 && Oooo00o < i3) {
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

    public final void o0000O(C1070oOOo0o c1070oOOo0o, C0767oO0O0ooo c0767oO0O0ooo) {
        if (c0767oO0O0ooo.OooO00o && !c0767oO0O0ooo.OooOO0o) {
            int i = c0767oO0O0ooo.OooO0oO;
            int i2 = c0767oO0O0ooo.OooO;
            if (c0767oO0O0ooo.OooO0o == -1) {
                int OooOo0O = OooOo0O();
                if (i >= 0) {
                    int OooO0o = (this.OooOOo.OooO0o() - i) + i2;
                    if (this.OooOo0) {
                        for (int i3 = 0; i3 < OooOo0O; i3++) {
                            View OooOo0 = OooOo0(i3);
                            if (this.OooOOo.OooO0o0(OooOo0) < OooO0o || this.OooOOo.OooOOOO(OooOo0) < OooO0o) {
                                o0000OO0(c1070oOOo0o, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = OooOo0O - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View OooOo02 = OooOo0(i5);
                        if (this.OooOOo.OooO0o0(OooOo02) < OooO0o || this.OooOOo.OooOOOO(OooOo02) < OooO0o) {
                            o0000OO0(c1070oOOo0o, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int OooOo0O2 = OooOo0O();
                if (this.OooOo0) {
                    int i7 = OooOo0O2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View OooOo03 = OooOo0(i8);
                        if (this.OooOOo.OooO0O0(OooOo03) > i6 || this.OooOOo.OooOOO(OooOo03) > i6) {
                            o0000OO0(c1070oOOo0o, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < OooOo0O2; i9++) {
                    View OooOo04 = OooOo0(i9);
                    if (this.OooOOo.OooO0O0(OooOo04) > i6 || this.OooOOo.OooOOO(OooOo04) > i6) {
                        o0000OO0(c1070oOOo0o, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final boolean o0000O0() {
        return OooOoo() == 1;
    }

    public final int o0000O00(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, boolean z) {
        int OooOO0O;
        int OooOO0O2 = i - this.OooOOo.OooOO0O();
        if (OooOO0O2 > 0) {
            int i2 = -o0000OOO(OooOO0O2, c1070oOOo0o, c1080oOOoO0O);
            int i3 = i + i2;
            if (z && (OooOO0O = i3 - this.OooOOo.OooOO0O()) > 0) {
                this.OooOOo.OooOOOo(-OooOO0O);
                return i2 - OooOO0O;
            }
            return i2;
        }
        return 0;
    }

    public void o0000O0O(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, C0767oO0O0ooo c0767oO0O0ooo, C0766oO0O0ooO c0766oO0O0ooO) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        View OooO0O0 = c0767oO0O0ooo.OooO0O0(c1070oOOo0o);
        if (OooO0O0 == null) {
            c0766oO0O0ooO.OooO0O0 = true;
            return;
        }
        C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) OooO0O0.getLayoutParams();
        if (c0767oO0O0ooo.OooOO0O == null) {
            boolean z3 = this.OooOo0;
            if (c0767oO0O0ooo.OooO0o == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                OooO0O0(OooO0O0, -1, false);
            } else {
                OooO0O0(OooO0O0, 0, false);
            }
        } else {
            boolean z4 = this.OooOo0;
            if (c0767oO0O0ooo.OooO0o == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                OooO0O0(OooO0O0, -1, true);
            } else {
                OooO0O0(OooO0O0, 0, true);
            }
        }
        C1068oOOo0OoO c1068oOOo0OoO2 = (C1068oOOo0OoO) OooO0O0.getLayoutParams();
        Rect Oooo0O0 = this.OooO0O0.Oooo0O0(OooO0O0);
        int i5 = Oooo0O0.left + Oooo0O0.right;
        int i6 = Oooo0O0.top + Oooo0O0.bottom;
        int OooOo0o = AbstractC1066oOOo0Oo.OooOo0o(OooO0Oo(), this.OooOOO, this.OooOO0o, Oooo000() + OooOooo() + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).leftMargin + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).rightMargin + i5, ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).width);
        int OooOo0o2 = AbstractC1066oOOo0Oo.OooOo0o(OooO0o0(), this.OooOOOO, this.OooOOO0, OooOooO() + Oooo00O() + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).topMargin + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).height);
        if (o0ooOOo(OooO0O0, OooOo0o, OooOo0o2, c1068oOOo0OoO2)) {
            OooO0O0.measure(OooOo0o, OooOo0o2);
        }
        c0766oO0O0ooO.OooO00o = this.OooOOo.OooO0OO(OooO0O0);
        if (this.OooOOOo == 1) {
            if (o0000O0()) {
                i4 = this.OooOOO - Oooo000();
                i = i4 - this.OooOOo.OooO0Oo(OooO0O0);
            } else {
                i = OooOooo();
                i4 = this.OooOOo.OooO0Oo(OooO0O0) + i;
            }
            if (c0767oO0O0ooo.OooO0o == -1) {
                i2 = c0767oO0O0ooo.OooO0O0;
                i3 = i2 - c0766oO0O0ooO.OooO00o;
            } else {
                i3 = c0767oO0O0ooo.OooO0O0;
                i2 = c0766oO0O0ooO.OooO00o + i3;
            }
        } else {
            int Oooo00O = Oooo00O();
            int OooO0Oo = this.OooOOo.OooO0Oo(OooO0O0) + Oooo00O;
            int i7 = c0767oO0O0ooo.OooO0o;
            int i8 = c0767oO0O0ooo.OooO0O0;
            if (i7 == -1) {
                int i9 = i8 - c0766oO0O0ooO.OooO00o;
                i4 = i8;
                i2 = OooO0Oo;
                i = i9;
                i3 = Oooo00O;
            } else {
                int i10 = c0766oO0O0ooO.OooO00o + i8;
                i = i8;
                i2 = OooO0Oo;
                i3 = Oooo00O;
                i4 = i10;
            }
        }
        AbstractC1066oOOo0Oo.Oooo0oO(OooO0O0, i, i3, i4, i2);
        if (c1068oOOo0OoO.OooO00o.OooOO0O() || c1068oOOo0OoO.OooO00o.OooOOO()) {
            c0766oO0O0ooO.OooO0OO = true;
        }
        c0766oO0O0ooO.OooO0Oo = OooO0O0.hasFocusable();
    }

    public final void o0000OO() {
        this.OooOo0 = (this.OooOOOo == 1 || !o0000O0()) ? this.OooOo00 : !this.OooOo00;
    }

    public final void o0000OO0(C1070oOOo0o c1070oOOo0o, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                View OooOo0 = OooOo0(i3);
                o0OoOo0(i3);
                c1070oOOo0o.OooO0o(OooOo0);
            }
            return;
        }
        while (i > i2) {
            View OooOo02 = OooOo0(i);
            o0OoOo0(i);
            c1070oOOo0o.OooO0o(OooOo02);
            i--;
        }
    }

    public final int o0000OOO(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        int i2;
        if (OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o00000O0();
        this.OooOOo0.OooO00o = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        o0000Oo(i2, abs, true, c1080oOOoO0O);
        C0767oO0O0ooo c0767oO0O0ooo = this.OooOOo0;
        int o00000O = o00000O(c1070oOOo0o, c0767oO0O0ooo, c1080oOOoO0O, false) + c0767oO0O0ooo.OooO0oO;
        if (o00000O < 0) {
            return 0;
        }
        if (abs > o00000O) {
            i = i2 * o00000O;
        }
        this.OooOOo.OooOOOo(-i);
        this.OooOOo0.OooOO0 = i;
        return i;
    }

    public final void o0000OOo(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "invalid orientation:"));
        }
        OooO0OO(null);
        if (i != this.OooOOOo || this.OooOOo == null) {
            AbstractC0462o0OoOoo OooO00o = AbstractC0462o0OoOoo.OooO00o(this, i);
            this.OooOOo = OooO00o;
            this.OooOoOO.OooO00o = OooO00o;
            this.OooOOOo = i;
            o00O0O();
        }
    }

    public final void o0000Oo(int i, int i2, boolean z, C1080oOOoO0O c1080oOOoO0O) {
        boolean z2;
        int i3;
        int OooOO0O;
        C0767oO0O0ooo c0767oO0O0ooo = this.OooOOo0;
        boolean z3 = false;
        int i4 = 1;
        if (this.OooOOo.OooO() == 0 && this.OooOOo.OooO0o() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0767oO0O0ooo.OooOO0o = z2;
        this.OooOOo0.OooO0o = i;
        int[] iArr = this.OooOooO;
        iArr[0] = 0;
        iArr[1] = 0;
        o0O0O00(c1080oOOoO0O, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        C0767oO0O0ooo c0767oO0O0ooo2 = this.OooOOo0;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c0767oO0O0ooo2.OooO0oo = i3;
        if (!z3) {
            max = max2;
        }
        c0767oO0O0ooo2.OooO = max;
        if (z3) {
            c0767oO0O0ooo2.OooO0oo = this.OooOOo.OooO0oo() + i3;
            View o0000oo = o0000oo();
            C0767oO0O0ooo c0767oO0O0ooo3 = this.OooOOo0;
            if (this.OooOo0) {
                i4 = -1;
            }
            c0767oO0O0ooo3.OooO0o0 = i4;
            int Oooo00o = AbstractC1066oOOo0Oo.Oooo00o(o0000oo);
            C0767oO0O0ooo c0767oO0O0ooo4 = this.OooOOo0;
            c0767oO0O0ooo3.OooO0Oo = Oooo00o + c0767oO0O0ooo4.OooO0o0;
            c0767oO0O0ooo4.OooO0O0 = this.OooOOo.OooO0O0(o0000oo);
            OooOO0O = this.OooOOo.OooO0O0(o0000oo) - this.OooOOo.OooO0oO();
        } else {
            View o0000oO = o0000oO();
            C0767oO0O0ooo c0767oO0O0ooo5 = this.OooOOo0;
            c0767oO0O0ooo5.OooO0oo = this.OooOOo.OooOO0O() + c0767oO0O0ooo5.OooO0oo;
            C0767oO0O0ooo c0767oO0O0ooo6 = this.OooOOo0;
            if (!this.OooOo0) {
                i4 = -1;
            }
            c0767oO0O0ooo6.OooO0o0 = i4;
            int Oooo00o2 = AbstractC1066oOOo0Oo.Oooo00o(o0000oO);
            C0767oO0O0ooo c0767oO0O0ooo7 = this.OooOOo0;
            c0767oO0O0ooo6.OooO0Oo = Oooo00o2 + c0767oO0O0ooo7.OooO0o0;
            c0767oO0O0ooo7.OooO0O0 = this.OooOOo.OooO0o0(o0000oO);
            OooOO0O = (-this.OooOOo.OooO0o0(o0000oO)) + this.OooOOo.OooOO0O();
        }
        C0767oO0O0ooo c0767oO0O0ooo8 = this.OooOOo0;
        c0767oO0O0ooo8.OooO0OO = i2;
        if (z) {
            c0767oO0O0ooo8.OooO0OO = i2 - OooOO0O;
        }
        c0767oO0O0ooo8.OooO0oO = OooOO0O;
    }

    public void o0000Oo0(boolean z) {
        OooO0OO(null);
        if (this.OooOo0O == z) {
            return;
        }
        this.OooOo0O = z;
        o00O0O();
    }

    public final void o0000OoO(int i, int i2) {
        this.OooOOo0.OooO0OO = this.OooOOo.OooO0oO() - i2;
        C0767oO0O0ooo c0767oO0O0ooo = this.OooOOo0;
        c0767oO0O0ooo.OooO0o0 = this.OooOo0 ? -1 : 1;
        c0767oO0O0ooo.OooO0Oo = i;
        c0767oO0O0ooo.OooO0o = 1;
        c0767oO0O0ooo.OooO0O0 = i2;
        c0767oO0O0ooo.OooO0oO = Integer.MIN_VALUE;
    }

    public final View o0000Ooo(int i, int i2) {
        int i3;
        int i4;
        o00000O0();
        if (i2 <= i && i2 >= i) {
            return OooOo0(i);
        }
        if (this.OooOOo.OooO0o0(OooOo0(i)) < this.OooOOo.OooOO0O()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.OooOOOo == 0 ? this.OooO0OO : this.OooO0Oo).OooO0oo(i, i2, i3, i4);
    }

    public final void o0000o0(int i, int i2) {
        this.OooOOo0.OooO0OO = i2 - this.OooOOo.OooOO0O();
        C0767oO0O0ooo c0767oO0O0ooo = this.OooOOo0;
        c0767oO0O0ooo.OooO0Oo = i;
        c0767oO0O0ooo.OooO0o0 = this.OooOo0 ? 1 : -1;
        c0767oO0O0ooo.OooO0o = -1;
        c0767oO0O0ooo.OooO0O0 = i2;
        c0767oO0O0ooo.OooO0oO = Integer.MIN_VALUE;
    }

    public final View o0000oO() {
        int i;
        if (this.OooOo0) {
            i = OooOo0O() - 1;
        } else {
            i = 0;
        }
        return OooOo0(i);
    }

    public final View o0000oo() {
        int OooOo0O;
        if (this.OooOo0) {
            OooOo0O = 0;
        } else {
            OooOo0O = OooOo0O() - 1;
        }
        return OooOo0(OooOo0O);
    }

    public void o000OOo(C1080oOOoO0O c1080oOOoO0O, C0767oO0O0ooo c0767oO0O0ooo, C0671o0ooo0O c0671o0ooo0O) {
        int i = c0767oO0O0ooo.OooO0Oo;
        if (i >= 0 && i < c1080oOOoO0O.OooO0O0()) {
            c0671o0ooo0O.OooO00o(i, Math.max(0, c0767oO0O0ooo.OooO0oO));
        }
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public int o00Oo0(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (this.OooOOOo == 1) {
            return 0;
        }
        return o0000OOO(i, c1070oOOo0o, c1080oOOoO0O);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void o00Ooo(int i) {
        this.OooOo = i;
        this.OooOoO0 = Integer.MIN_VALUE;
        C1934ooo0o c1934ooo0o = this.OooOoO;
        if (c1934ooo0o != null) {
            c1934ooo0o.OooO00o = -1;
        }
        o00O0O();
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public int o00o0O(int i, C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O) {
        if (this.OooOOOo == 0) {
            return 0;
        }
        return o0000OOO(i, c1070oOOo0o, c1080oOOoO0O);
    }

    public void o0O0O00(C1080oOOoO0O c1080oOOoO0O, int[] iArr) {
        int i;
        int i2;
        if (c1080oOOoO0O.OooO00o != -1) {
            i = this.OooOOo.OooOO0o();
        } else {
            i = 0;
        }
        if (this.OooOOo0.OooO0o == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public void o0Oo0oo(RecyclerView recyclerView, int i) {
        oO0OO00 oo0oo00 = new oO0OO00(recyclerView.getContext());
        oo0oo00.OooO00o = i;
        o0OO00O(oo0oo00);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final boolean o0ooOoO() {
        if (this.OooOOO0 == 1073741824 || this.OooOO0o == 1073741824) {
            return false;
        }
        int OooOo0O = OooOo0O();
        for (int i = 0; i < OooOo0O; i++) {
            ViewGroup.LayoutParams layoutParams = OooOo0(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public boolean oo0o0Oo() {
        return this.OooOoO == null && this.OooOOoo == this.OooOo0O;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.oO0O0ooO, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.OooOOOo = 1;
        this.OooOo00 = false;
        this.OooOo0 = false;
        this.OooOo0O = false;
        this.OooOo0o = true;
        this.OooOo = -1;
        this.OooOoO0 = Integer.MIN_VALUE;
        this.OooOoO = null;
        this.OooOoOO = new C1777ooOOO00O();
        this.OooOoo0 = new Object();
        this.OooOoo = 2;
        this.OooOooO = new int[2];
        C1067oOOo0Oo0 Oooo0 = AbstractC1066oOOo0Oo.Oooo0(context, attributeSet, i, i2);
        o0000OOo(Oooo0.OooO00o);
        boolean z = Oooo0.OooO0OO;
        OooO0OO(null);
        if (z != this.OooOo00) {
            this.OooOo00 = z;
            o00O0O();
        }
        o0000Oo0(Oooo0.OooO0Oo);
    }

    @Override // com.ninja.engine.AbstractC1066oOOo0Oo
    public final void OoooO0(RecyclerView recyclerView) {
    }

    public void o000OO(C1070oOOo0o c1070oOOo0o, C1080oOOoO0O c1080oOOoO0O, C1777ooOOO00O c1777ooOOO00O, int i) {
    }
}


