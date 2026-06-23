package com.ninja.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
/* renamed from: com.ninja.engine.o00O0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0135o00O0o0o {
    public final Object[] OooO00o = new Object[2];
    public static final Class[] OooO0O0 = {Context.class, AttributeSet.class};
    public static final int[] OooO0OO = {16843375};
    public static final int[] OooO0Oo = {16844160};
    public static final int[] OooO0o0 = {16844156};
    public static final int[] OooO0o = {16844148};
    public static final String[] OooO0oO = {"android.widget.", "android.view.", "android.webkit."};
    public static final C1218oOoOOoo OooO0oo = new C1218oOoOOoo();

    public C0439o0OoO0o OooO00o(Context context, AttributeSet attributeSet) {
        return new C0439o0OoO0o(context, attributeSet);
    }

    public C0083o000OO0o OooO0O0(Context context, AttributeSet attributeSet) {
        return new C0083o000OO0o(context, attributeSet, R.attr.buttonStyle);
    }

    public o000OOo0 OooO0OO(Context context, AttributeSet attributeSet) {
        return new o000OOo0(context, attributeSet, R.attr.checkboxStyle);
    }

    public o00 OooO0Oo(Context context, AttributeSet attributeSet) {
        return new o00(context, attributeSet);
    }

    public final View OooO0o(Context context, String str, String str2) {
        String concat;
        C1218oOoOOoo c1218oOoOOoo = OooO0oo;
        Constructor constructor = (Constructor) c1218oOoOOoo.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(OooO0O0);
            c1218oOoOOoo.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.OooO00o);
    }

    public C1589oo0oOO0 OooO0o0(Context context, AttributeSet attributeSet) {
        return new C1589oo0oOO0(context, attributeSet);
    }
}
