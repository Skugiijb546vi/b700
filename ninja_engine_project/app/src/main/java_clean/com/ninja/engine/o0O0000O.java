package com.ninja.engine;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o0O0000O extends Property {
    public final /* synthetic */ int OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0O0000O(Class cls, String str, int i) {
        super(cls, str);
        this.OooO00o = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.OooO00o) {
            case 0:
                o0O000O o0o000o = (o0O000O) obj;
                return null;
            case 1:
                o0O000O o0o000o2 = (o0O000O) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(((AbstractC0429o0Oo0oOo) obj).OooO0O0());
            case 6:
                return Float.valueOf(((C0763oO0O0oOO) obj).OooO0oo);
            case 7:
                return Float.valueOf(((C1160oOo00OOo) obj).OooO);
            case 8:
                return Float.valueOf(AbstractC1478oo0O0oOO.OooO00o.OooO0o0((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.OooO00o) {
            case 0:
                o0O000O o0o000o = (o0O000O) obj;
                PointF pointF = (PointF) obj2;
                o0o000o.getClass();
                o0o000o.OooO00o = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                o0o000o.OooO0O0 = round;
                int i = o0o000o.OooO0o + 1;
                o0o000o.OooO0o = i;
                if (i == o0o000o.OooO0oO) {
                    AbstractC1478oo0O0oOO.OooO00o(o0o000o.OooO0o0, o0o000o.OooO00o, round, o0o000o.OooO0OO, o0o000o.OooO0Oo);
                    o0o000o.OooO0o = 0;
                    o0o000o.OooO0oO = 0;
                    return;
                }
                return;
            case 1:
                o0O000O o0o000o2 = (o0O000O) obj;
                PointF pointF2 = (PointF) obj2;
                o0o000o2.getClass();
                o0o000o2.OooO0OO = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                o0o000o2.OooO0Oo = round2;
                int i2 = o0o000o2.OooO0oO + 1;
                o0o000o2.OooO0oO = i2;
                if (o0o000o2.OooO0o == i2) {
                    AbstractC1478oo0O0oOO.OooO00o(o0o000o2.OooO0o0, o0o000o2.OooO00o, o0o000o2.OooO0O0, o0o000o2.OooO0OO, round2);
                    o0o000o2.OooO0o = 0;
                    o0o000o2.OooO0oO = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC1478oo0O0oOO.OooO00o(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC1478oo0O0oOO.OooO00o(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC1478oo0O0oOO.OooO00o(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                AbstractC0429o0Oo0oOo abstractC0429o0Oo0oOo = (AbstractC0429o0Oo0oOo) obj;
                float floatValue = ((Float) obj2).floatValue();
                if (abstractC0429o0Oo0oOo.OooO0oo != floatValue) {
                    abstractC0429o0Oo0oOo.OooO0oo = floatValue;
                    abstractC0429o0Oo0oOo.invalidateSelf();
                    return;
                }
                return;
            case 6:
                C0763oO0O0oOO c0763oO0O0oOO = (C0763oO0O0oOO) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                c0763oO0O0oOO.OooO0oo = floatValue2;
                ArrayList arrayList = (ArrayList) c0763oO0O0oOO.OooO0O0;
                ((C0423o0Oo0Ooo) arrayList.get(0)).OooO00o = 0.0f;
                float f = ((int) (floatValue2 * 333.0f)) / 667;
                C0534o0o0O0o c0534o0o0O0o = c0763oO0O0oOO.OooO0Oo;
                float interpolation = c0534o0o0O0o.getInterpolation(f);
                ((C0423o0Oo0Ooo) arrayList.get(1)).OooO00o = interpolation;
                ((C0423o0Oo0Ooo) arrayList.get(0)).OooO0O0 = interpolation;
                float interpolation2 = c0534o0o0O0o.getInterpolation(f + 0.49925038f);
                ((C0423o0Oo0Ooo) arrayList.get(2)).OooO00o = interpolation2;
                ((C0423o0Oo0Ooo) arrayList.get(1)).OooO0O0 = interpolation2;
                ((C0423o0Oo0Ooo) arrayList.get(2)).OooO0O0 = 1.0f;
                if (c0763oO0O0oOO.OooO0oO && ((C0423o0Oo0Ooo) arrayList.get(1)).OooO0O0 < 1.0f) {
                    ((C0423o0Oo0Ooo) arrayList.get(2)).OooO0OO = ((C0423o0Oo0Ooo) arrayList.get(1)).OooO0OO;
                    ((C0423o0Oo0Ooo) arrayList.get(1)).OooO0OO = ((C0423o0Oo0Ooo) arrayList.get(0)).OooO0OO;
                    ((C0423o0Oo0Ooo) arrayList.get(0)).OooO0OO = c0763oO0O0oOO.OooO0o0.OooO0OO[c0763oO0O0oOO.OooO0o];
                    c0763oO0O0oOO.OooO0oO = false;
                }
                ((oO00Oo0) c0763oO0O0oOO.OooO00o).invalidateSelf();
                return;
            case 7:
                C1160oOo00OOo c1160oOo00OOo = (C1160oOo00OOo) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                c1160oOo00OOo.OooO = floatValue3;
                int i3 = (int) (floatValue3 * 1800.0f);
                int i4 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) c1160oOo00OOo.OooO0O0;
                    if (i4 < arrayList2.size()) {
                        C0423o0Oo0Ooo c0423o0Oo0Ooo = (C0423o0Oo0Ooo) arrayList2.get(i4);
                        int[] iArr = C1160oOo00OOo.OooOO0o;
                        int i5 = i4 * 2;
                        int i6 = iArr[i5];
                        int[] iArr2 = C1160oOo00OOo.OooOO0O;
                        float f2 = (i3 - i6) / iArr2[i5];
                        Interpolator[] interpolatorArr = c1160oOo00OOo.OooO0o0;
                        c0423o0Oo0Ooo.OooO00o = AbstractC0809oO0OooOO.OooOOoo(interpolatorArr[i5].getInterpolation(f2), 0.0f, 1.0f);
                        int i7 = i5 + 1;
                        int i8 = iArr[i7];
                        c0423o0Oo0Ooo.OooO0O0 = AbstractC0809oO0OooOO.OooOOoo(interpolatorArr[i7].getInterpolation((i3 - i8) / iArr2[i7]), 0.0f, 1.0f);
                        i4++;
                    } else {
                        if (c1160oOo00OOo.OooO0oo) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((C0423o0Oo0Ooo) it.next()).OooO0OO = c1160oOo00OOo.OooO0o.OooO0OO[c1160oOo00OOo.OooO0oO];
                            }
                            c1160oOo00OOo.OooO0oo = false;
                        }
                        ((oO00Oo0) c1160oOo00OOo.OooO00o).invalidateSelf();
                        return;
                    }
                }
            case 8:
                float floatValue4 = ((Float) obj2).floatValue();
                AbstractC1478oo0O0oOO.OooO00o.OooOOO0((View) obj, floatValue4);
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}


