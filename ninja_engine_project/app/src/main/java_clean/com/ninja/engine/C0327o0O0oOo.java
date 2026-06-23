package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.ninja.engine.o0O0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327o0O0oOo extends ViewGroup.MarginLayoutParams {
    public int OooO;
    public AbstractC0326o0O0oOOO OooO00o;
    public boolean OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public View OooOO0O;
    public View OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public final Rect OooOOOo;

    public C0327o0O0oOo() {
        super(-2, -2);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }

    public final boolean OooO00o(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.OooOOOO;
        }
        return this.OooOOO;
    }

    public C0327o0O0oOo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO;
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1033oOOOoOo0.OooO0O0);
        this.OooO0OO = obtainStyledAttributes.getInteger(0, 0);
        this.OooO0o = obtainStyledAttributes.getResourceId(1, -1);
        this.OooO0Oo = obtainStyledAttributes.getInteger(2, 0);
        this.OooO0o0 = obtainStyledAttributes.getInteger(6, -1);
        this.OooO0oO = obtainStyledAttributes.getInt(5, 0);
        this.OooO0oo = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.OooO0O0 = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.OooOo00;
            if (TextUtils.isEmpty(string)) {
                abstractC0326o0O0oOOO = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.OooOo00;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.OooOo0O;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.OooOo0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC0326o0O0oOOO = (AbstractC0326o0O0oOOO) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(AbstractC1230oOoOo0o.OooOO0o("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.OooO00o = abstractC0326o0O0oOOO;
        }
        obtainStyledAttributes.recycle();
        AbstractC0326o0O0oOOO abstractC0326o0O0oOOO2 = this.OooO00o;
        if (abstractC0326o0O0oOOO2 != null) {
            abstractC0326o0O0oOOO2.OooO0Oo(this);
        }
    }

    public C0327o0O0oOo(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }

    public C0327o0O0oOo(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }

    public C0327o0O0oOo(C0327o0O0oOo c0327o0O0oOo) {
        super((ViewGroup.MarginLayoutParams) c0327o0O0oOo);
        this.OooO0O0 = false;
        this.OooO0OO = 0;
        this.OooO0Oo = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oO = 0;
        this.OooO0oo = 0;
        this.OooOOOo = new Rect();
    }
}


