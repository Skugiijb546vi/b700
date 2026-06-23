package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o0000OO0 {
    public int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;
    public Object OooO0o;
    public Object OooO0o0;

    public o0000OO0(View view) {
        this.OooO00o = -1;
        this.OooO0O0 = view;
        this.OooO0OO = C0113o000oo0O.OooO00o();
    }

    public PorterDuff.Mode OooO() {
        C1324oOooo000 c1324oOooo000 = (C1324oOooo000) this.OooO0o0;
        if (c1324oOooo000 != null) {
            return c1324oOooo000.OooO0O0;
        }
        return null;
    }

    public void OooO00o() {
        View view = (View) this.OooO0O0;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : ((C1324oOooo000) this.OooO0Oo) != null) {
                if (((C1324oOooo000) this.OooO0o) == null) {
                    this.OooO0o = new Object();
                }
                C1324oOooo000 c1324oOooo000 = (C1324oOooo000) this.OooO0o;
                c1324oOooo000.OooO00o = null;
                c1324oOooo000.OooO0Oo = false;
                c1324oOooo000.OooO0O0 = null;
                c1324oOooo000.OooO0OO = false;
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                ColorStateList OooO0OO = AbstractC1452oo0O000o.OooO0OO(view);
                if (OooO0OO != null) {
                    c1324oOooo000.OooO0Oo = true;
                    c1324oOooo000.OooO00o = OooO0OO;
                }
                PorterDuff.Mode OooO0Oo = AbstractC1452oo0O000o.OooO0Oo(view);
                if (OooO0Oo != null) {
                    c1324oOooo000.OooO0OO = true;
                    c1324oOooo000.OooO0O0 = OooO0Oo;
                }
                if (c1324oOooo000.OooO0Oo || c1324oOooo000.OooO0OO) {
                    C0113o000oo0O.OooO0o0(background, c1324oOooo000, view.getDrawableState());
                    return;
                }
            }
            C1324oOooo000 c1324oOooo0002 = (C1324oOooo000) this.OooO0o0;
            if (c1324oOooo0002 != null) {
                C0113o000oo0O.OooO0o0(background, c1324oOooo0002, view.getDrawableState());
                return;
            }
            C1324oOooo000 c1324oOooo0003 = (C1324oOooo000) this.OooO0Oo;
            if (c1324oOooo0003 != null) {
                C0113o000oo0O.OooO0o0(background, c1324oOooo0003, view.getDrawableState());
            }
        }
    }

    public boolean OooO0O0(int i) {
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o0000O o0000o = (o0000O) arrayList.get(i2);
            int i3 = o0000o.OooO00o;
            if (i3 == 8) {
                if (OooO0oO(o0000o.OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = o0000o.OooO0O0;
                int i5 = o0000o.OooO0Oo + i4;
                while (i4 < i5) {
                    if (OooO0oO(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void OooO0OO() {
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((oOOo0O00) this.OooO0o0).OooO00o((o0000O) arrayList.get(i));
        }
        OooOOo(arrayList);
        this.OooO00o = 0;
    }

    public void OooO0Oo() {
        OooO0OO();
        ArrayList arrayList = (ArrayList) this.OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0000O o0000o = (o0000O) arrayList.get(i);
            int i2 = o0000o.OooO00o;
            oOOo0O00 oooo0o00 = (oOOo0O00) this.OooO0o0;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            oooo0o00.OooO00o(o0000o);
                            oooo0o00.OooO0o0(o0000o.OooO0O0, o0000o.OooO0Oo);
                        }
                    } else {
                        oooo0o00.OooO00o(o0000o);
                        oooo0o00.OooO0OO(o0000o.OooO0O0, o0000o.OooO0Oo, o0000o.OooO0OO);
                    }
                } else {
                    oooo0o00.OooO00o(o0000o);
                    int i3 = o0000o.OooO0O0;
                    int i4 = o0000o.OooO0Oo;
                    RecyclerView recyclerView = oooo0o00.OooO00o;
                    recyclerView.Oooo0oo(i3, i4, true);
                    recyclerView.OooooOO = true;
                    recyclerView.Ooooo00.OooO0OO += i4;
                }
            } else {
                oooo0o00.OooO00o(o0000o);
                oooo0o00.OooO0Oo(o0000o.OooO0O0, o0000o.OooO0Oo);
            }
        }
        OooOOo(arrayList);
        this.OooO00o = 0;
    }

    public void OooO0o(o0000O o0000o, int i) {
        oOOo0O00 oooo0o00 = (oOOo0O00) this.OooO0o0;
        oooo0o00.OooO00o(o0000o);
        int i2 = o0000o.OooO00o;
        if (i2 != 2) {
            if (i2 == 4) {
                oooo0o00.OooO0OO(i, o0000o.OooO0Oo, o0000o.OooO0OO);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = o0000o.OooO0Oo;
        RecyclerView recyclerView = oooo0o00.OooO00o;
        recyclerView.Oooo0oo(i, i3, true);
        recyclerView.OooooOO = true;
        recyclerView.Ooooo00.OooO0OO += i3;
    }

    public void OooO0o0(o0000O o0000o) {
        int i;
        int i2 = o0000o.OooO00o;
        if (i2 != 1 && i2 != 8) {
            int OooOo0O = OooOo0O(o0000o.OooO0O0, i2);
            int i3 = o0000o.OooO0O0;
            int i4 = o0000o.OooO00o;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + o0000o);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < o0000o.OooO0Oo; i6++) {
                int OooOo0O2 = OooOo0O((i * i6) + o0000o.OooO0O0, o0000o.OooO00o);
                int i7 = o0000o.OooO00o;
                if (i7 == 2 ? OooOo0O2 == OooOo0O : !(i7 != 4 || OooOo0O2 != OooOo0O + 1)) {
                    i5++;
                } else {
                    o0000O OooOO0o = OooOO0o(o0000o.OooO0OO, i7, OooOo0O, i5);
                    OooO0o(OooOO0o, i3);
                    OooOO0o.OooO0OO = null;
                    ((C0995oOOOO0O) this.OooO0O0).OooO0OO(OooOO0o);
                    if (o0000o.OooO00o == 4) {
                        i3 += i5;
                    }
                    OooOo0O = OooOo0O2;
                    i5 = 1;
                }
            }
            Object obj = o0000o.OooO0OO;
            o0000o.OooO0OO = null;
            ((C0995oOOOO0O) this.OooO0O0).OooO0OO(o0000o);
            if (i5 > 0) {
                o0000O OooOO0o2 = OooOO0o(obj, o0000o.OooO00o, OooOo0O, i5);
                OooO0o(OooOO0o2, i3);
                OooOO0o2.OooO0OO = null;
                ((C0995oOOOO0O) this.OooO0O0).OooO0OO(OooOO0o2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public int OooO0oO(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        int size = arrayList.size();
        while (i2 < size) {
            o0000O o0000o = (o0000O) arrayList.get(i2);
            int i3 = o0000o.OooO00o;
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
            } else {
                int i5 = o0000o.OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = o0000o.OooO0Oo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += o0000o.OooO0Oo;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList OooO0oo() {
        C1324oOooo000 c1324oOooo000 = (C1324oOooo000) this.OooO0o0;
        if (c1324oOooo000 != null) {
            return c1324oOooo000.OooO00o;
        }
        return null;
    }

    public boolean OooOO0() {
        if (((ArrayList) this.OooO0OO).size() > 0) {
            return true;
        }
        return false;
    }

    public void OooOO0O(AttributeSet attributeSet, int i) {
        ColorStateList OooO;
        View view = (View) this.OooO0O0;
        Context context = view.getContext();
        int[] iArr = AbstractC1039oOOOoo0o.OooOoO0;
        boolean z = false;
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
        View view2 = (View) this.OooO0O0;
        AbstractC1460oo0O00oo.OooOOOO(view2, view2.getContext(), iArr, attributeSet, (TypedArray) Oooo0O0.OooO0O0, i);
        try {
            if (typedArray.hasValue(0)) {
                this.OooO00o = typedArray.getResourceId(0, -1);
                C0113o000oo0O c0113o000oo0O = (C0113o000oo0O) this.OooO0OO;
                Context context2 = view.getContext();
                int i2 = this.OooO00o;
                synchronized (c0113o000oo0O) {
                    OooO = c0113o000oo0O.OooO00o.OooO(context2, i2);
                }
                if (OooO != null) {
                    OooOOoo(OooO);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1460oo0O00oo.OooOOo(view, Oooo0O0.OooOo0O(1));
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode OooO0O0 = AbstractC0420o0Oo0Oo.OooO0O0(typedArray.getInt(2, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                AbstractC1452oo0O000o.OooOO0O(view, OooO0O0);
                if (i3 == 21) {
                    Drawable background = view.getBackground();
                    z = (AbstractC1452oo0O000o.OooO0OO(view) == null && AbstractC1452oo0O000o.OooO0Oo(view) == null) ? true : true;
                    if (background != null && z) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            Oooo0O0.Oooo0o0();
        } catch (Throwable th) {
            Oooo0O0.Oooo0o0();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ninja.engine.o0000O] */
    public o0000O OooOO0o(Object obj, int i, int i2, int i3) {
        o0000O o0000o = (o0000O) ((C0995oOOOO0O) this.OooO0O0).OooO();
        if (o0000o == null) {
            ?? obj2 = new Object();
            obj2.OooO00o = i;
            obj2.OooO0O0 = i2;
            obj2.OooO0Oo = i3;
            obj2.OooO0OO = obj;
            return obj2;
        }
        o0000o.OooO00o = i;
        o0000o.OooO0O0 = i2;
        o0000o.OooO0Oo = i3;
        o0000o.OooO0OO = obj;
        return o0000o;
    }

    public void OooOOO(int i) {
        ColorStateList colorStateList;
        this.OooO00o = i;
        C0113o000oo0O c0113o000oo0O = (C0113o000oo0O) this.OooO0OO;
        if (c0113o000oo0O != null) {
            Context context = ((View) this.OooO0O0).getContext();
            synchronized (c0113o000oo0O) {
                colorStateList = c0113o000oo0O.OooO00o.OooO(context, i);
            }
        } else {
            colorStateList = null;
        }
        OooOOoo(colorStateList);
        OooO00o();
    }

    public void OooOOO0() {
        this.OooO00o = -1;
        OooOOoo(null);
        OooO00o();
    }

    public void OooOOOO(o0000O o0000o) {
        ((ArrayList) this.OooO0Oo).add(o0000o);
        int i = o0000o.OooO00o;
        oOOo0O00 oooo0o00 = (oOOo0O00) this.OooO0o0;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        oooo0o00.OooO0o0(o0000o.OooO0O0, o0000o.OooO0Oo);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + o0000o);
                }
                oooo0o00.OooO0OO(o0000o.OooO0O0, o0000o.OooO0Oo, o0000o.OooO0OO);
                return;
            }
            int i2 = o0000o.OooO0O0;
            int i3 = o0000o.OooO0Oo;
            RecyclerView recyclerView = oooo0o00.OooO00o;
            recyclerView.Oooo0oo(i2, i3, false);
            recyclerView.OooooOO = true;
            return;
        }
        oooo0o00.OooO0Oo(o0000o.OooO0O0, o0000o.OooO0Oo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018b, code lost:
        if (r5 >= r12.OooO0O0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0195, code lost:
        if (r11.OooO0O0 == r11.OooO0Oo) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0197, code lost:
        r1.set(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019b, code lost:
        r1.remove(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
        r1.add(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015c, code lost:
        if (r5 > r12.OooO0O0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015e, code lost:
        r11.OooO0Oo = r5 - r12.OooO0Oo;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooOOOo() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o0000OO0.OooOOOo():void");
    }

    public void OooOOo(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOOo0((o0000O) arrayList.get(i));
        }
        arrayList.clear();
    }

    public void OooOOo0(o0000O o0000o) {
        o0000o.OooO0OO = null;
        ((C0995oOOOO0O) this.OooO0O0).OooO0OO(o0000o);
    }

    public void OooOOoo(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C1324oOooo000) this.OooO0Oo) == null) {
                this.OooO0Oo = new Object();
            }
            C1324oOooo000 c1324oOooo000 = (C1324oOooo000) this.OooO0Oo;
            c1324oOooo000.OooO00o = colorStateList;
            c1324oOooo000.OooO0Oo = true;
        } else {
            this.OooO0Oo = null;
        }
        OooO00o();
    }

    public void OooOo0(PorterDuff.Mode mode) {
        if (((C1324oOooo000) this.OooO0o0) == null) {
            this.OooO0o0 = new Object();
        }
        C1324oOooo000 c1324oOooo000 = (C1324oOooo000) this.OooO0o0;
        c1324oOooo000.OooO0O0 = mode;
        c1324oOooo000.OooO0OO = true;
        OooO00o();
    }

    public void OooOo00(ColorStateList colorStateList) {
        if (((C1324oOooo000) this.OooO0o0) == null) {
            this.OooO0o0 = new Object();
        }
        C1324oOooo000 c1324oOooo000 = (C1324oOooo000) this.OooO0o0;
        c1324oOooo000.OooO00o = colorStateList;
        c1324oOooo000.OooO0Oo = true;
        OooO00o();
    }

    public int OooOo0O(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = (ArrayList) this.OooO0Oo;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o0000O o0000o = (o0000O) arrayList.get(size);
            int i9 = o0000o.OooO00o;
            if (i9 == 8) {
                int i10 = o0000o.OooO0O0;
                int i11 = o0000o.OooO0Oo;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i >= i5 && i <= i4) {
                    if (i5 == i10) {
                        if (i2 == 1) {
                            i8 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i8 = i11 - 1;
                            }
                            i++;
                        }
                        o0000o.OooO0Oo = i8;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i7 = i10 + 1;
                        } else {
                            if (i2 == 2) {
                                i7 = i10 - 1;
                            }
                            i--;
                        }
                        o0000o.OooO0O0 = i7;
                        i--;
                    }
                } else if (i < i10) {
                    if (i2 == 1) {
                        o0000o.OooO0O0 = i10 + 1;
                        i6 = i11 + 1;
                    } else if (i2 == 2) {
                        o0000o.OooO0O0 = i10 - 1;
                        i6 = i11 - 1;
                    }
                    o0000o.OooO0Oo = i6;
                }
            } else {
                int i12 = o0000o.OooO0O0;
                if (i12 <= i) {
                    if (i9 == 1) {
                        i -= o0000o.OooO0Oo;
                    } else if (i9 == 2) {
                        i += o0000o.OooO0Oo;
                    }
                } else {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    o0000o.OooO0O0 = i3;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            o0000O o0000o2 = (o0000O) arrayList.get(size2);
            if (o0000o2.OooO00o == 8) {
                int i13 = o0000o2.OooO0Oo;
                if (i13 != o0000o2.OooO0O0 && i13 >= 0) {
                }
                arrayList.remove(size2);
                OooOOo0(o0000o2);
            } else {
                if (o0000o2.OooO0Oo > 0) {
                }
                arrayList.remove(size2);
                OooOOo0(o0000o2);
            }
        }
        return i;
    }

    public o0000OO0(oOOo0O00 oooo0o00) {
        this.OooO0O0 = new C0995oOOOO0O(30);
        this.OooO0OO = new ArrayList();
        this.OooO0Oo = new ArrayList();
        this.OooO00o = 0;
        this.OooO0o0 = oooo0o00;
        this.OooO0o = new C0331o0O0oo(24, this);
    }
}
