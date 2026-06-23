package com.ninja.engine;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o0OOOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367o0OOOo0o extends AbstractC1064oOOo0OOO {
    public static TimeInterpolator OooOOoo;
    public ArrayList OooO;
    public boolean OooO0oO;
    public ArrayList OooO0oo;
    public ArrayList OooOO0;
    public ArrayList OooOO0O;
    public ArrayList OooOO0o;
    public ArrayList OooOOO;
    public ArrayList OooOOO0;
    public ArrayList OooOOOO;
    public ArrayList OooOOOo;
    public ArrayList OooOOo;
    public ArrayList OooOOo0;

    public static void OooO0oo(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC1083oOOoO0o) arrayList.get(size)).OooO00o.animate().cancel();
        }
    }

    public final void OooO() {
        if (!OooO0o()) {
            ArrayList arrayList = this.OooO0O0;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                AbstractC1230oOoOo0o.OooOO0O(arrayList.get(0));
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, com.ninja.engine.o0OOOo0] */
    @Override // com.ninja.engine.AbstractC1064oOOo0OOO
    public final boolean OooO00o(AbstractC1083oOOoO0o abstractC1083oOOoO0o, AbstractC1083oOOoO0o abstractC1083oOOoO0o2, oOO0OOO ooo0ooo, oOO0OOO ooo0ooo2) {
        int i;
        int i2;
        int i3 = ooo0ooo.OooO00o;
        int i4 = ooo0ooo.OooO0O0;
        if (abstractC1083oOOoO0o2.OooOOo()) {
            int i5 = ooo0ooo.OooO00o;
            i2 = ooo0ooo.OooO0O0;
            i = i5;
        } else {
            i = ooo0ooo2.OooO00o;
            i2 = ooo0ooo2.OooO0O0;
        }
        if (abstractC1083oOOoO0o == abstractC1083oOOoO0o2) {
            return OooO0oO(abstractC1083oOOoO0o, i3, i4, i, i2);
        }
        View view = abstractC1083oOOoO0o.OooO00o;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        OooOO0o(abstractC1083oOOoO0o);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        OooOO0o(abstractC1083oOOoO0o2);
        View view2 = abstractC1083oOOoO0o2.OooO00o;
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.OooOO0O;
        C0364o0OOOo0 obj = new C0364o0OOOo0();
        obj.OooO00o = abstractC1083oOOoO0o;
        obj.OooO0O0 = abstractC1083oOOoO0o2;
        obj.OooO0OO = i3;
        obj.OooO0Oo = i4;
        obj.OooO0o0 = i;
        obj.OooO0o = i2;
        arrayList.add(obj);
        return true;
    }

    @Override // com.ninja.engine.AbstractC1064oOOo0OOO
    public final void OooO0Oo(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        View view = abstractC1083oOOoO0o.OooO00o;
        view.animate().cancel();
        ArrayList arrayList = this.OooOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0366o0OOOo0O) arrayList.get(size)).OooO00o == abstractC1083oOOoO0o) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                OooO0OO(abstractC1083oOOoO0o);
                arrayList.remove(size);
            }
        }
        OooOO0(this.OooOO0O, abstractC1083oOOoO0o);
        if (this.OooO0oo.remove(abstractC1083oOOoO0o)) {
            view.setAlpha(1.0f);
            OooO0OO(abstractC1083oOOoO0o);
        }
        if (this.OooO.remove(abstractC1083oOOoO0o)) {
            view.setAlpha(1.0f);
            OooO0OO(abstractC1083oOOoO0o);
        }
        ArrayList arrayList2 = this.OooOOO;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            OooOO0(arrayList3, abstractC1083oOOoO0o);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.OooOOO0;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0366o0OOOo0O) arrayList5.get(size4)).OooO00o == abstractC1083oOOoO0o) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    OooO0OO(abstractC1083oOOoO0o);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.OooOO0o;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC1083oOOoO0o)) {
                view.setAlpha(1.0f);
                OooO0OO(abstractC1083oOOoO0o);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.OooOOo0.remove(abstractC1083oOOoO0o);
        this.OooOOOO.remove(abstractC1083oOOoO0o);
        this.OooOOo.remove(abstractC1083oOOoO0o);
        this.OooOOOo.remove(abstractC1083oOOoO0o);
        OooO();
    }

    @Override // com.ninja.engine.AbstractC1064oOOo0OOO
    public final boolean OooO0o() {
        if (this.OooO.isEmpty() && this.OooOO0O.isEmpty() && this.OooOO0.isEmpty() && this.OooO0oo.isEmpty() && this.OooOOOo.isEmpty() && this.OooOOo0.isEmpty() && this.OooOOOO.isEmpty() && this.OooOOo.isEmpty() && this.OooOOO0.isEmpty() && this.OooOO0o.isEmpty() && this.OooOOO.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.AbstractC1064oOOo0OOO
    public final void OooO0o0() {
        ArrayList arrayList = this.OooOO0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0366o0OOOo0O c0366o0OOOo0O = (C0366o0OOOo0O) arrayList.get(size);
            View view = c0366o0OOOo0O.OooO00o.OooO00o;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            OooO0OO(c0366o0OOOo0O.OooO00o);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.OooO0oo;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            OooO0OO((AbstractC1083oOOoO0o) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.OooO;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = (AbstractC1083oOOoO0o) arrayList3.get(size3);
            abstractC1083oOOoO0o.OooO00o.setAlpha(1.0f);
            OooO0OO(abstractC1083oOOoO0o);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.OooOO0O;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0364o0OOOo0 c0364o0OOOo0 = (C0364o0OOOo0) arrayList4.get(size4);
            AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = c0364o0OOOo0.OooO00o;
            if (abstractC1083oOOoO0o2 != null) {
                OooOO0O(c0364o0OOOo0, abstractC1083oOOoO0o2);
            }
            AbstractC1083oOOoO0o abstractC1083oOOoO0o3 = c0364o0OOOo0.OooO0O0;
            if (abstractC1083oOOoO0o3 != null) {
                OooOO0O(c0364o0OOOo0, abstractC1083oOOoO0o3);
            }
        }
        arrayList4.clear();
        if (!OooO0o()) {
            return;
        }
        ArrayList arrayList5 = this.OooOOO0;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                C0366o0OOOo0O c0366o0OOOo0O2 = (C0366o0OOOo0O) arrayList6.get(size6);
                View view2 = c0366o0OOOo0O2.OooO00o.OooO00o;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                OooO0OO(c0366o0OOOo0O2.OooO00o);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.OooOO0o;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                AbstractC1083oOOoO0o abstractC1083oOOoO0o4 = (AbstractC1083oOOoO0o) arrayList8.get(size8);
                abstractC1083oOOoO0o4.OooO00o.setAlpha(1.0f);
                OooO0OO(abstractC1083oOOoO0o4);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.OooOOO;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C0364o0OOOo0 c0364o0OOOo02 = (C0364o0OOOo0) arrayList10.get(size10);
                AbstractC1083oOOoO0o abstractC1083oOOoO0o5 = c0364o0OOOo02.OooO00o;
                if (abstractC1083oOOoO0o5 != null) {
                    OooOO0O(c0364o0OOOo02, abstractC1083oOOoO0o5);
                }
                AbstractC1083oOOoO0o abstractC1083oOOoO0o6 = c0364o0OOOo02.OooO0O0;
                if (abstractC1083oOOoO0o6 != null) {
                    OooOO0O(c0364o0OOOo02, abstractC1083oOOoO0o6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        OooO0oo(this.OooOOo0);
        OooO0oo(this.OooOOOo);
        OooO0oo(this.OooOOOO);
        OooO0oo(this.OooOOo);
        ArrayList arrayList11 = this.OooO0O0;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            AbstractC1230oOoOo0o.OooOO0O(arrayList11.get(0));
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.ninja.engine.o0OOOo0O, java.lang.Object] */
    public final boolean OooO0oO(AbstractC1083oOOoO0o abstractC1083oOOoO0o, int i, int i2, int i3, int i4) {
        View view = abstractC1083oOOoO0o.OooO00o;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC1083oOOoO0o.OooO00o.getTranslationY());
        OooOO0o(abstractC1083oOOoO0o);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0OO(abstractC1083oOOoO0o);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.OooOO0;
        C0366o0OOOo0O obj = new C0366o0OOOo0O();
        obj.OooO00o = abstractC1083oOOoO0o;
        obj.OooO0O0 = translationX;
        obj.OooO0OO = translationY;
        obj.OooO0Oo = i3;
        obj.OooO0o0 = i4;
        arrayList.add(obj);
        return true;
    }

    public final void OooOO0(ArrayList arrayList, AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0364o0OOOo0 c0364o0OOOo0 = (C0364o0OOOo0) arrayList.get(size);
            if (OooOO0O(c0364o0OOOo0, abstractC1083oOOoO0o) && c0364o0OOOo0.OooO00o == null && c0364o0OOOo0.OooO0O0 == null) {
                arrayList.remove(c0364o0OOOo0);
            }
        }
    }

    public final boolean OooOO0O(C0364o0OOOo0 c0364o0OOOo0, AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        if (c0364o0OOOo0.OooO0O0 == abstractC1083oOOoO0o) {
            c0364o0OOOo0.OooO0O0 = null;
        } else if (c0364o0OOOo0.OooO00o == abstractC1083oOOoO0o) {
            c0364o0OOOo0.OooO00o = null;
        } else {
            return false;
        }
        abstractC1083oOOoO0o.OooO00o.setAlpha(1.0f);
        View view = abstractC1083oOOoO0o.OooO00o;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        OooO0OO(abstractC1083oOOoO0o);
        return true;
    }

    public final void OooOO0o(AbstractC1083oOOoO0o abstractC1083oOOoO0o) {
        if (OooOOoo == null) {
            OooOOoo = new ValueAnimator().getInterpolator();
        }
        abstractC1083oOOoO0o.OooO00o.animate().setInterpolator(OooOOoo);
        OooO0Oo(abstractC1083oOOoO0o);
    }
}



