package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
/* renamed from: com.ninja.engine.o0O0Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0308o0O0Ooo0 extends View {
    public int[] OooO00o;
    public int OooO0O0;
    public Context OooO0OO;
    public AbstractC0705oO000o0o OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public HashMap OooO0oO;

    public final void OooO() {
        if (this.OooO0Oo == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C0309o0O0OooO) {
            ((C0309o0O0OooO) layoutParams).o00o0O = this.OooO0Oo;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L82
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto L82
        La:
            android.content.Context r0 = r5.OooO0OO
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L23
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L24
        L23:
            r1 = r2
        L24:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L4d
            if (r1 == 0) goto L4d
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L41
            java.util.HashMap r3 = r1.OooOOO0
            if (r3 == 0) goto L41
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L41
            java.util.HashMap r3 = r1.OooOOO0
            java.lang.Object r3 = r3.get(r6)
            goto L42
        L41:
            r3 = r2
        L42:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 != 0) goto L56
            if (r1 == 0) goto L56
            int r3 = r5.OooO0o(r1, r6)
        L56:
            if (r3 != 0) goto L64
            java.lang.Class<com.ninja.engine.oOOOoOO0> r1 = com.ninja.engine.AbstractC1029oOOOoOO0.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L63
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
        L64:
            if (r3 != 0) goto L74
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L74:
            if (r3 == 0) goto L82
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.OooO0oO
            r1.put(r0, r6)
            r5.OooO0O0(r3)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0308o0O0Ooo0.OooO00o(java.lang.String):void");
    }

    public final void OooO0O0(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.OooO0O0 + 1;
        int[] iArr = this.OooO00o;
        if (i2 > iArr.length) {
            this.OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.OooO00o;
        int i3 = this.OooO0O0;
        iArr2[i3] = i;
        this.OooO0O0 = i3 + 1;
    }

    public final void OooO0OO(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.OooO0OO == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C0309o0O0OooO) && trim.equals(((C0309o0O0OooO) layoutParams).OoooOo0) && childAt.getId() != -1) {
                OooO0O0(childAt.getId());
            }
        }
    }

    public final void OooO0Oo(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.OooO0O0; i++) {
            View view = (View) constraintLayout.OooO00o.get(this.OooO00o[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int OooO0o(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.OooO0OO.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void OooO0oO(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.OooO0o0 = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.OooO0o = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void OooO0oo(C0316o0O0o0o c0316o0O0o0o, boolean z);

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.OooO00o, this.OooO0O0);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.OooO0o0;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.OooO0o;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.OooO0o0 = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.OooO0O0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                OooO00o(str.substring(i));
                return;
            } else {
                OooO00o(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.OooO0o = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.OooO0O0 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                OooO0OO(str.substring(i));
                return;
            } else {
                OooO0OO(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.OooO0o0 = null;
        this.OooO0O0 = 0;
        for (int i : iArr) {
            OooO0O0(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.OooO0o0 == null) {
            OooO0O0(i);
        }
    }

    public void OooO0o0(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
